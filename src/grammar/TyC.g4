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
    else:
        return super().emit();
}

options{
	language=Python3;
}

// TODO: Define grammar rules here

/*------------------------------------------------------------------------------------
Parser Rules*/

program: prog_stat_list EOF;

prog_stat_list: prog_stat prog_stat_list | ;
prog_stat: func_decl | struct_decl;

func_decl: return_type ID '(' param_list ')' '{' stat_list '}' ';';
param_list: param_type ID;
param_type: var_type;
return_type: param_type | VOID_TYPE;

struct_decl: STRUCT ID '{' var_decl_list '}' ';';

stat_list: stat stat_list | stat;
stat: var_decl | block_stat | if_stat | while_stat | for_stat | switch_stat 
	break_stat | continue_stat | return_stat | expr_stat;

var_decl_list: var_decl var_decl_list | ;
var_decl: 'int' ID ';' ;

var_type: INT_TYPE | STRING_TYPE | FLOAT_TYPE | DOUBLE_TYPE;

expr_stat: assign_expr | bin_expr | un_expr | pre_expr | post_expr | func_expr ';' ;

expr: assign_expr | bin_expr | un_expr | pre_expr | post_expr | func_expr | mem_acc_expr ';' ;

assign_expr: ID '=' expr;
bin_expr: expr bin_op expr;
un_expr: un_op expr;
pre_expr: pre_op expr;
post_expr: expr post_op;
func_expr: expr '(' arg_list ')' ;
mem_acc_expr: expr '.' ID ;

arg_list: arg ',' args 
	| arg
	|
;

args: arg ',' args | arg
arg: ID;

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
NOTE_OP: '!=';
LESS_OP: '<';
GREAT_OP: '>';
LESSEQ_OP: '<=';
GREATEQ_OP: '>=';
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

ID  :   (LETTER | UNDERSCORE) LETTER* DIGIT* UNDERSCORE* ;      // match identifiers
INT :   ('-')? DIGIT+ ;         // match integers
FLOAT:  ('-')? DIGIT+
	(
	'.' DIGIT+
	| ('.' DIGIT+)? ('E' | 'e') ('-')? DIGIT+
	)
;

STRING: '"' .*? '"';

NEWLINE:'\r'? '\n' ;     // return newlines to parser (end-statement signal)

WS: [ \t\r\n]+ -> skip;
COMMENT: '/''/' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/''*' .*? '*''/' -> skip;

/*-------------------------------------------------------------------------------------
Error Characters*/
ERROR_CHAR: .;
ILLEGAL_ESCAPE:.;
UNCLOSE_STRING:.;
