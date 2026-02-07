grammar TyC;

@lexer::header {
from lexererr import *
}

@lexer::members {
def emit(self):
	tk = self.type
	if tk == self.UNCLOSE_STRING:       
		result = super().emit();
		raise UncloseString(result.text);
	elif tk == self.ILLEGAL_ESCAPE:
		result = super().emit();
		raise IllegalEscape(result.text);
	elif tk == self.ERROR_CHAR:
		result = super().emit();
		raise ErrorToken(result.text); 
	elif tk == self.STRING:
		result = super().emit();
		result.text = result.text.replace('\"', '');
		return result;
	else:
		return super().emit();
}

options{
	language=Python3;
}

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

func_decl: return_type ID '(' param_list ')' '{' stat_list '}' 
	| ID '(' param_list ')' '{' stat_list '}';
param_list: param param_list | param | ;
param: param_type ID;
param_type: var_type;
return_type: param_type | VOID_TYPE;

/*------------------------------------------------------------------------------------
Struct Declaration*/
struct_decl: STRUCT ID
	| STRUCT ID '{' var_decl_list '}' ';'
;

/*------------------------------------------------------------------------------------
Statement*/
stat_list: stat stat_list | ;
stat: var_decl_stat | block_stat | if_stat | while_stat | for_stat | switch_stat 
	| break_stat | continue_stat | return_stat | expr_stat;

var_decl_list: var_decl_stat var_decl_list | ;
var_decl_stat: var_decl_expr ';' ;
var_decl_expr: var_type ID
	| var_type ID '=' (INT | FLOAT | STRING | BOOL)
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

expr_stat: (expr | assign_expr) ';';

/*------------------------------------------------------------------------------------
Expression*/

lvalue: ID | INT | FLOAT | STRING | BOOL;

expr: '(' expr ')'
	| lvalue
	| expr '.' ID
	| expr post_op
	| expr '(' arg_list ')'
	| pre_op expr
	| un_op expr
	| expr (MULT_OP | DIV_OP | MOD_OP) expr
	| expr (ADD_OP | MIN_OP) expr
	| expr (LESS_OP | LEQ_OP | GREAT_OP | GEQ_OP) expr
	| expr (EQ_OP | NEQ_OP) expr
	| expr AND_OP expr
	| expr OR_OP expr
;

assign_expr: (ID | expr '.' ID) '=' expr ;

inc_expr: '++'ID | ID'++' ;
dec_expr: '--'ID | ID'--' ;

/*------------------------------------------------------------------------------------
Argument*/

arg_list: arg ',' args 
	| arg
	|
;

args: arg ',' args | arg;
arg: ID | INT | STRING | FLOAT | expr '.' ID;

/*------------------------------------------------------------------------------------
Operators*/

bin_op: ADD_OP | MIN_OP | EQ_OP | NEQ_OP | LESS_OP | GREAT_OP | LEQ_OP | GEQ_OP | OR_OP | AND_OP | MULT_OP | DIV_OP | MOD_OP ;

un_op: NOT_OP | MIN_OP | ADD_OP ;

pre_op: INC_OP | DEC_OP ;

post_op: INC_OP | DEC_OP ;

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
ESCAPE_CHAR: '\\' [0btnfr];

fragment
CHAR: ESCAPE_CHAR | .;

ID  :   (LETTER | UNDERSCORE) (LETTER | DIGIT | UNDERSCORE)* ;      // match identifiers
INT :   ('-')? DIGIT+ ;         // match integers
FLOAT:  ('-')? DIGIT+
	(
		'.' DIGIT*
		| ('.' DIGIT*)? ('E' | 'e') ('-' | '+')? DIGIT+
	)
	| ('-')? '.' DIGIT+ (('E' | 'e') ('-' | '+') DIGIT+)?
;
BOOL: 'true' | 'false' ;

STRING: STRINGLIT;

STRINGLIT: '"' ( '\\' [0btnfr"'\\] | ~[\b\t\f\r\n\\"] )* '"';


NEWLINE:'\r'? '\n' -> skip;     // return newlines to parser (end-statement signal)

WS: [ \t\r\n]+ -> skip;
COMMENT: '/''/' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/''*' .*? '*''/' -> skip;

/*-------------------------------------------------------------------------------------
Error Characters*/

ILLEGAL_ESCAPE: '"' ('\\' ~[btnfr"\\] | ~[\\"])* '"';
UNCLOSE_STRING: '"' ( '\\' [btnfr"'\\] | ~[\b\t\f\r\n\\"] )*;
ERROR_CHAR: .;
