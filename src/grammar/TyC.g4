grammar TyC;


// TODO: Define grammar rules here

/*------------------------------------------------------------------------------------
Parser Rules*/

program: func_decl_list EOF;

stat_list: stat+;
stat: var_decl | assign | func ';';

assign: ID '=' exp;
exp: exp term | term;
term: term factor | factor;
factor: '(' exp ')' | ID | num_lit;
num_lit: INT | FLOAT;

func_decl_list: func_decl+
func_decl: return_type ID '(' ')';
param_list: param_type ID;
param_type: var_type;
return_type: param_type | VOID_TYPE;

func: ID '(' arg_list ')';
arg_list: ID*;
var_decl: 'int' ID;
var_type: INT_TYPE | STRING_TYPE | FLOAT_TYPE | DOUBLE_TYPE;

/*------------------------------------------------------------------------------------
Lexer Rules*/


/*------------------------------------------------------------------------------------
TYPES*/

INT_TYPE: 'int' ;
FLOAT_TYPE: 'float' ;
STRING_TYPE: 'string' ;
VOID_TYPE: 'void' ;


/*------------------------------------------------------------------------------------
OPERATORS*/

ASSOP: '=';
ADDOP: '+';
MINOP: '-';
MULTOP: '*';
DIVOP: '/';

/*------------------------------------------------------------------------------------
Seperators*/
LROUND_BRACKET: '(';
RROUND_BRACKET: ')';
LSQUARE_BRACKET: '[';
RSQUARE_BRACKET: ']';
LCURLY_BRACKET: '{';
RCURLY_BRACKET: '}';

SEMICOLON: ';';

/*------------------------------------------------------------------------------------
Common Lexer Rules*/
fragment
LETTER: [a-zA-Z];

fragment
DIGIT: [0-9];

fragment
UNDERSCORE: '_';

ID  :   (LETTER | UNDERSCORE)LETTER*DIGIT*UNDERSCORE* ;      // match identifiers
INT :   DIGIT+ ;         // match integers
FLOAT:  DIGIT+'.'DIGIT+();

NEWLINE:'\r'? '\n' ;     // return newlines to parser (end-statement signal)

WS: [ \t\r\n]+ -> skip;
COMMENT: '/''/' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/''*' .*? '*''/' -> skip;

/*-------------------------------------------------------------------------------------
Error Characters*/
ERROR_CHAR: .;
ILLEGAL_ESCAPE:.;
UNCLOSE_STRING:.;
