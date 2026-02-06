grammar TyC;
// TODO: Define grammar rules here

/*------------------------------------------------------------------------------------
Parser Rules*/

/*------------------------------------------------------------------------------------
Program Stat*/

program: prog_stat_list EOF;

prog_stat_list: prog_stat prog_stat_list | ;
prog_stat: func_decl | struct_decl;

/*------------------------------------------------------------------------------------
Function Declaration*/

func_decl: return_type ID '(' param_list ')' '{' stat_list '}' ;
param_list: param param_list | param | ;
param: param_type ID; 
param_type: var_type;
return_type: param_type | VOID_TYPE;

/*------------------------------------------------------------------------------------
Struct Declaration*/
struct_decl: STRUCT ID '{' var_decl_list '}' ';';

/*------------------------------------------------------------------------------------
Statement*/
stat_list: stat stat_list | ;
stat: var_decl_stat | block_stat | if_stat | while_stat | for_stat | switch_stat 
	| break_stat | continue_stat | return_stat | expr_stat;

var_decl_list: var_decl_stat var_decl_list | ;
var_decl_stat: var_decl_expr ';' ;
var_decl_expr: var_type ID 
	| var_type ID '=' (INT | FLOAT | string | BOOL)
	| var_type ID '=' expr;
var_type: INT_TYPE | STRING_TYPE | FLOAT_TYPE | AUTO;

block_stat: '{' stat_list '}' ;

if_stat: IF '(' expr ')' '{' stat_list '}'
	| IF '(' expr ')' stat
	| IF '(' expr ')' stat ELSE stat
	| IF '(' expr ')' '{' stat_list '}' ELSE '{' stat_list '}' ;

while_stat: WHILE '(' expr ')' '{' stat_list '}' 
	| WHILE '(' expr ')' stat;

for_stat: FOR '(' (var_decl_expr | assign_expr | ) ';' (expr | ) ';' (assign_expr | inc_expr | dec_expr) ')' '{' stat_list '}'
	| FOR '(' (var_decl_expr | assign_expr | ) ';' (expr | ) ';' (assign_expr | inc_expr | dec_expr) ')' stat
;

switch_stat: SWITCH '(' expr ')' '{' case_expr_list default_case_expr '}'
	| SWITCH '(' expr ')' '{' case_expr_list '}';

case_expr_list: case_expr case_expr_list | ;
case_expr: CASE '(' expr ')' ':' stat_list
	| CASE expr ':' stat_list

;

default_case_expr: DEFAULT ':' stat_list | ;

break_stat: BREAK ';' ;

continue_stat: CONTINUE ';' ;

return_stat: RETURN expr ';' 
	| RETURN ';' ;

expr_stat: expr ';';

/*------------------------------------------------------------------------------------
Expression*/

lvalue: ID | INT | FLOAT | string | BOOL;

expr: assign_expr
	| term ('+' | '-') term
	| un_op expr
	| pre_op expr
	| expr post_op
	| expr '.' ID
	| expr '(' arg_list ')'
	| lvalue
;

assign_expr: ID '=' expr ;

term: term ('*' | '/') term
	| un_op expr
	| pre_op expr
	| lvalue;

inc_expr: '++'ID | ID'++' ;
dec_expr: '--'ID | ID'--' ;

un_expr: un_op un_term ;
un_term: ;
pre_expr: pre_op pre_term ;
pre_term: ;
post_expr: post_term post_op ;
post_term: ;
func_expr: func_term '(' arg_list ')' ;
func_term: ;
mem_acc_expr: mem_acc_term '.' ID ;
mem_acc_term: ;

/*------------------------------------------------------------------------------------
Argument*/

arg_list: arg ',' args 
	| arg
	|
;

args: arg ',' args | arg;
arg: ID | INT | string | FLOAT;

/*------------------------------------------------------------------------------------
Operators*/

bin_op: ADD_OP | MIN_OP | EQ_OP | NEQ_OP | LESS_OP | GREAT_OP | LEQ_OP | GEQ_OP | OR_OP | AND_OP | MULT_OP | DIV_OP | MOD_OP ;

un_op: NOT_OP | MIN_OP | ADD_OP ;

pre_op: INC_OP | DEC_OP ;

post_op: INC_OP | DEC_OP ;

/*------------------------------------------------------------------------------------
Data Types*/

string: STRINGLIT | ILLEGAL_ESCAPE ;


/*------------------------------------------------------------------------------------
Lexer Rules*/

/*------------------------------------------------------------------------------------
Keywords*/

AUTO: 'auto';
BREAK: 'break';
CASE: 'case';
CONTINUE: 'continue';
DEFAULT: 'default';
ELSE: 'else';
FOR: 'for';
IF: 'if';
RETURN: 'return';
STRUCT: 'struct';
SWITCH: 'switch';
WHILE: 'while';

/*------------------------------------------------------------------------------------
TYPES*/

INT_TYPE: 'int' ;
FLOAT_TYPE: 'float' ;
STRING_TYPE: 'string' ;
VOID_TYPE: 'void' ;

/*------------------------------------------------------------------------------------
OPERATORS*/

ADD_OP: '+';
MIN_OP: '-';
MULT_OP: '*';
DIV_OP: '/';
MOD_OP: '%';
EQ_OP: '==';
NEQ_OP: '!=';
LESS_OP: '<';
GREAT_OP: '>';
LEQ_OP: '<=';
GEQ_OP: '>=';
OR_OP: '||';
AND_OP: '&&';
NOT_OP: '!';
INC_OP: '++';
DEC_OP: '--';
ASS_OP: '=';
MEMACC_OP: '.';

/*------------------------------------------------------------------------------------
Seperators*/
LROUND_BRACK: '(';
RROUND_BRACK: ')';
LSQUARE_BRACK: '[';
RSQUARE_BRACK: ']';
LCURLY_BRACK: '{';
RCURLY_BRACK: '}';

SEMICOLON: ';';
COMMA: ',';
COLON: ':';

/*------------------------------------------------------------------------------------
Common Lexer Rules*/
fragment
LETTER: [a-zA-Z];

fragment
DIGIT: [0-9];

fragment
UNDERSCORE: '_';

fragment
ESCAPE_CHAR: '\\' [0btnfr]
;


ID  :   (LETTER | UNDERSCORE) LETTER* DIGIT* UNDERSCORE* ;      // match identifiers
INT :   ('-')? DIGIT+ ;         // match integers
FLOAT:  ('-')? DIGIT
	(
		'.' DIGIT+
		| ('.' DIGIT+)? ('E' | 'e') ('-')? DIGIT+
	)
;
BOOL: 'true' | 'false' ;

//STRING: STRINGLIT | ILLEGAL_ESCAPE;

STRINGLIT: '"' .*? '"';

NEWLINE:'\r'? '\n' -> skip;     // return newlines to parser (end-statement signal)

WS: [ \t\r\n]+ -> skip;
COMMENT: '/''/' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/''*' .*? '*''/' -> skip;

/*-------------------------------------------------------------------------------------
Error Characters*/
ERROR_CHAR: .;
ILLEGAL_ESCAPE: '"' ('\\' | '\\' ~[0btnfr] )* '"';
UNCLOSE_STRING: .;
