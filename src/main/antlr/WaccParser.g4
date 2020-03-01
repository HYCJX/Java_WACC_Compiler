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
stat: statSkip
    | statInitVar
    | statAssignVar
    | statRead
    | statFree
    | statReturn
    | statExit
    | statPrint
    | statPrintln
    | statCond
    | statLoop
    | statBegin
    | stat SEMICOLON stat
    ;

//Statement Helpers:
statSkip: SKIPS ;
statInitVar: type ident ASSIGN assignRhs ;
statAssignVar: assignLhs ASSIGN assignRhs ;
statRead: READ assignLhs ;
statFree: FREE expr ;
statReturn: RETURN expr ;
statExit: EXIT expr ;
statPrint: PRINT expr ;
statPrintln: PRINTLN expr ;
statCond: IF expr THEN stat ELSE stat FI ;
statLoop: WHILE expr DO stat DONE ;
statBegin: BEGIN stat END ;

//Assign LHS:
assignLhs: ident
         | arrayElem
         | pairElem
         ;

//Assign RHS:
assignRhs: arrayLiter
         | pairElem
         | call
         | expr
         | newpair
         ;

//AssignRhs Helpers:
call: CALL ident OPEN_PARENTHESES (expr (COMMA expr)*)? CLOSE_PARENTHESES ;
newpair: NEWPAIR OPEN_PARENTHESES expr COMMA expr CLOSE_PARENTHESES ;

//Pair elements:
pairElem: pairElemFst
        | pairElemSnd
        ;
pairElemFst: FST expr ;
pairElemSnd: SND expr ;


//Expressions:
expr: exprIntLit
    | exprBoolLit
    | exprCharLit
    | exprStrLit
    | exprPairLit
    | ident
    | arrayElem
    | exprParen
    | exprUnop
    | expr MULDIVMOD expr
    | expr (ADD|NEG) expr
    | expr CMP expr
    | expr EQ expr
    | expr ANDOR expr
    ;

//Expression Helpers:
exprIntLit: intLiter ;
exprBoolLit: BOOL_LITER ;
exprCharLit: CHAR_LITER ;
exprStrLit: STR_LITER ;
exprPairLit: PAIR_LITER ;
exprParen: OPEN_PARENTHESES expr CLOSE_PARENTHESES ;
exprUnop: (NOT|NEG|LENGTH|ORD|CHR) expr ;

//Type:
type: baseType
    | arrayType
    | pairType
    ;

//Base Type:
baseType: BASE_TYPE ;

//Pair type:
pairType: PAIR OPEN_PARENTHESES pairElemType COMMA pairElemType CLOSE_PARENTHESES ;
pairElemType: PAIR|baseType|arrayType ;

//Array type:
arrayType: baseType OPEN_BRACKET CLOSE_BRACKET
         | arrayType  OPEN_BRACKET CLOSE_BRACKET
         | pairType OPEN_BRACKET CLOSE_BRACKET
         ;

//Array element:
arrayElem: ident (OPEN_BRACKET expr CLOSE_BRACKET)+ ;

//Int literal:
intLiter: (ADD|NEG)? INT_LITER ;

//Array literal:
arrayLiter: OPEN_BRACKET (expr (COMMA expr)*)? CLOSE_BRACKET ;

ident: IDENT ;

// EOF indicates that the program must consume to the end of the input.
