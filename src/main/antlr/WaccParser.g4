parser grammar WaccParser;

@header {
    package parser;
}

options {
  tokenVocab=WaccLexer;
}

//Program:
prog: BEGIN (func)* stat END EOF ;

//Function:
func: type ident OPEN_PARENTHESES (param (COMMA param)*)? CLOSE_PARENTHESES IS stat END ;

//Parameter:
param: type ident ;

//Statements:
stat: SKIPS                          #StatSkip
    | type ident ASSIGN assignRhs    #StatInitVar
    | assignLhs ASSIGN assignRhs     #StatAssignVar
    | EXIT expr                      #StatExit
    | FREE expr                      #StatFree
    | PRINT expr                     #StatPrint
    | PRINTLN expr                   #StatPrintln
    | RETURN expr                    #StatReturn
    | READ assignLhs                 #StatRead
    | BEGIN stat END                 #StatBegin
    | IF expr THEN stat ELSE stat FI #StatCond
    | WHILE expr DO stat DONE        #StatLoop
    | stat SEMICOLON stat            #StatCompose
    ;

//Assign LHS:
assignLhs: ident
         | arrayElem
         | pairFst
         | pairSnd
         ;

//Assign RHS:
assignRhs: arrayLiter
         | call
         | expr
         | newpair
         | pairFst
         | pairSnd
         ;
arrayLiter: OPEN_BRACKET (expr (COMMA expr)*)? CLOSE_BRACKET ;
call: CALL ident OPEN_PARENTHESES (expr (COMMA expr)*)? CLOSE_PARENTHESES ;
newpair: NEWPAIR OPEN_PARENTHESES expr COMMA expr CLOSE_PARENTHESES ;


//Expressions:
expr: BOOL_LITER                              #ExprBoolLit
    | CHAR_LITER                              #ExprCharLit
    | (ADD|NEG)? INT_LITER                    #ExprIntLit
    | STR_LITER                               #ExprStrLit
    | PAIR_LITER                              #ExprPairLit
    | arrayElem                               #ExprArrElem
    | ident                                   #ExprIdent
    | OPEN_PARENTHESES expr CLOSE_PARENTHESES #ExprParen
    | (NOT|NEG|LENGTH|ORD|CHR) expr           #ExprUnaryOp
    | expr MULDIVMOD expr                     #ExprMulDivMod
    | expr (ADD|NEG) expr                     #ExprAddSub
    | expr CMP expr                           #ExprCmp
    | expr EQ expr                            #ExprEq
    | expr ANDOR expr                         #ExprAndOr
    ;

//Type:
type: baseType
    | arrayType
    | pairType
    ;

//Base Type:
baseType: BASE_TYPE ;

//Array type:
arrayType: baseType OPEN_BRACKET CLOSE_BRACKET
         | arrayType  OPEN_BRACKET CLOSE_BRACKET
         | pairType OPEN_BRACKET CLOSE_BRACKET
         ;

//Pair type:
pairType: PAIR OPEN_PARENTHESES pairElemType COMMA pairElemType CLOSE_PARENTHESES ;
pairElemType: PAIR|baseType|arrayType ;

//Array element:
arrayElem: ident (OPEN_BRACKET expr CLOSE_BRACKET)+ ;

//Identifier:
ident: IDENT ;

//Pair element:
pairFst: FST expr;
pairSnd: SND expr;

// EOF indicates that the program must consume to the end of the input.
