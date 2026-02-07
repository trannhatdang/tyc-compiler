"""
Lexer test cases for TyC compiler
TODO: Implement 100 test cases for lexer
"""

import pytest
from tests.utils import Tokenizer


'''
def test_lexer_placeholder():
    """Placeholder test - replace with actual test cases"""
    source = "// This is a placeholder test"
    tokenizer = Tokenizer(source)
    # TODO: Add actual test assertions
    assert tokenizer.get_tokens_as_string() == 'EOF'
'''

def test_ID():
    tokenizer = Tokenizer("a")
    assert tokenizer.get_tokens_as_string() == "a,<EOF>"

def test_keyword_auto():
    """1. Keyword"""
    tokenizer = Tokenizer("auto")
    assert tokenizer.get_tokens_as_string() == "auto,<EOF>"

def test_operator_assign():
    """2. Operator"""
    tokenizer = Tokenizer("=")
    assert tokenizer.get_tokens_as_string() == "=,<EOF>"


def test_separator_semi():
    """3. Separator"""
    tokenizer = Tokenizer(";")
    assert tokenizer.get_tokens_as_string() == ";,<EOF>"


def test_integer_single_digit():
    """4. Integer literal"""
    tokenizer = Tokenizer("5")
    assert tokenizer.get_tokens_as_string() == "5,<EOF>"


def test_float_decimal():
    """5. Float literal"""
    tokenizer = Tokenizer("3.14")
    assert tokenizer.get_tokens_as_string() == "3.14,<EOF>"


def test_string_simple():
    """6. String literal"""
    tokenizer = Tokenizer('"hello"')
    assert tokenizer.get_tokens_as_string() == "hello,<EOF>"


def test_identifier_simple():
    """7. Identifier"""
    tokenizer = Tokenizer("x")
    assert tokenizer.get_tokens_as_string() == "x,<EOF>"


def test_line_comment():
    """8. Line comment"""
    tokenizer = Tokenizer("// This is a comment")
    assert tokenizer.get_tokens_as_string() == "<EOF>"


def test_integer_in_expression():
    """9. Mixed: integers and operator"""
    tokenizer = Tokenizer("5+10")
    assert tokenizer.get_tokens_as_string() == "5,+,10,<EOF>"


def test_complex_expression():
    """10. Complex: variable declaration"""
    tokenizer = Tokenizer("auto x = 5 + 3 * 2;")
    assert tokenizer.get_tokens_as_string() == "auto,x,=,5,+,3,*,2,;,<EOF>"

###############Characters#################

def test_outside_extended_ascii():
    tokenizer = Tokenizer("迷")
    assert tokenizer.get_tokens_as_string() == "Error Token 迷"

###############Literals#################

def test_floating_point():
    tokenizer = Tokenizer("1.0e-35")
    assert tokenizer.get_tokens_as_string() == "1.0e-35,<EOF>"

def test_floating_point_2():
    tokenizer = Tokenizer("1.035")
    assert tokenizer.get_tokens_as_string() == "1.035,<EOF>"

def test_floating_point_3():
    tokenizer = Tokenizer(".035")
    assert tokenizer.get_tokens_as_string() == ".,035,<EOF>"

def test_floating_point_4():
    tokenizer = Tokenizer("1.")
    assert tokenizer.get_tokens_as_string() == "1.,<EOF>"

def test_floating_point_5():
    tokenizer = Tokenizer("1.e-35")
    assert tokenizer.get_tokens_as_string() == "1.e-35,<EOF>"

def test_floating_point_6():
    tokenizer = Tokenizer("1e53")
    assert tokenizer.get_tokens_as_string() == "1e53,<EOF>"

def test_floating_point_7():
    tokenizer = Tokenizer("1E-53")
    assert tokenizer.get_tokens_as_string() == "1E-53,<EOF>"

def test_floating_point_8():
    tokenizer = Tokenizer("E-53")
    assert tokenizer.get_tokens_as_string() == "E,-53,<EOF>"

def test_floating_point_9():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_integer_1():
    tokenizer = Tokenizer("1.E-53")
    assert tokenizer.get_tokens_as_string() == "1.E-53,<EOF>"

def test_string_1():
    tokenizer = Tokenizer("\" \\0\\b\\t\\n\\f\\r \"")
    assert tokenizer.get_tokens_as_string() == " \\0\\b\\t\\n\\f\\r ,<EOF>"

def test_string_illegal_escape_1():
    tokenizer = Tokenizer("\" \\   \"")
    assert tokenizer.get_tokens_as_string() == "Illegal Escape In String: \" \\   \""

def test_string_illegal_escape_2():
    tokenizer = Tokenizer("\" \\g lmao \"")
    assert tokenizer.get_tokens_as_string() == "Illegal Escape In String: \" \\g lmao \""

def test_string_4():
    tokenizer = Tokenizer("\"")
    assert tokenizer.get_tokens_as_string() == "Unclosed String: \""

def test_string_5():
    tokenizer = Tokenizer("\"\"\"")
    assert tokenizer.get_tokens_as_string() == ",Unclosed String: \""

###############Expressions#################

def test_func_1():
    tokenizer = Tokenizer("a+3();")
    assert tokenizer.get_tokens_as_string() == "a,+,3,(,),;,<EOF>"

def test_func_2():
    tokenizer = Tokenizer("(a+lmao)();")
    assert tokenizer.get_tokens_as_string() == "(,a,+,lmao,),(,),;,<EOF>"

def test_ass_1():
    tokenizer = Tokenizer("a=b=c;")
    assert tokenizer.get_tokens_as_string() == "a,=,b,=,c,;,<EOF>"

def test_ass_2():
    tokenizer = Tokenizer("a+b=c;")
    assert tokenizer.get_tokens_as_string() == "a,+,b,=,c,;,<EOF>"
