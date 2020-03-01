lexer grammar WaccLexer;

@header {
    package parser;
}

//Brackets:
OPEN_PARENTHESES: '(' ;
CLOSE_PARENTHESES: ')' ;

//Tokens:
COMMA: ',' ;
SEMICOLON: ';' ;

//Program:
BEGIN:'begin' ;
END: 'end' ;

//Functions:
IS:'is' ;

//Statement:
SKIPS: 'skip' ;
ASSIGN: '=' ;
READ: 'read' ;
FREE: 'free' ;
RETURN: 'return' ;
EXIT: 'exit' ;
PRINT: 'print' ;
PRINTLN:'println' ;
IF: 'if' ;
THEN:'then' ;
ELSE:'else' ;
FI:'fi' ;
WHILE:'while' ;
DO:'do' ;
DONE:'done' ;

//Assign-rhs:
NEWPAIR:'newpair' ;
CALL :'call' ;

//Pair element:
FST:'fst' ;
SND:'snd' ;

//Array Type:
OPEN_BRACKET: '[' ;
CLOSE_BRACKET: ']' ;

//Unary operators:
NOT: '!' ;
NEG: '-' ;
LENGTH: 'len' ;
ORD: 'ord' ;
CHR: 'chr' ;

//Binary operators:
MULDIVMOD: '*'|'/'|'%' ;
ADD: '+' ;
CMP: '>'|'<'|'>='|'<=' ;
EQ: '=='|'!=' ;
ANDOR: '&&'|'||' ;

//Base type:
BASE_TYPE: 'int'|'bool'|'char'|'string' ;

//Pair type:
PAIR: 'pair' ;

//Integer literals:
INT_LITER: DIGIT+ ;
fragment
DIGIT: '0'..'9' ;

//Boolean literals:
BOOL_LITER: 'true'|'false' ;

//Pair literals:
PAIR_LITER: 'null' ;

//Character literals:
CHAR_LITER: '\'' CHARACTER '\'' ;
fragment
CHARACTER: NORMAL_CHAR|ESCAPED_CHAR ;
fragment
NORMAL_CHAR: ~('\\' | '\'' | '"' ) ;
fragment
ESCAPED_CHAR: '\\' ('0' | 'b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\') ;

//String literals:
STR_LITER: '"' CHARACTER* '"' ;

//Identity:
IDENT: (UNDER_SCORE | LOWER_CASE | UPPER_CASE) (UNDER_SCORE | LOWER_CASE | UPPER_CASE | DIGIT)* ;
fragment
LOWER_CASE: 'a'..'z' ;
fragment
UPPER_CASE: 'A'..'Z' ;
fragment
UNDER_SCORE: '_' ;

//Comment
COMMENT: '#' .*? '\r'? '\n' -> skip ;

//Spaces:
WS: [ \t\r\n] -> skip ;