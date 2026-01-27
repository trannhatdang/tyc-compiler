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

def nottest(obj):
    obj.__test__ = False
    return obj

@nottest
def test_lexer(source):
    tokenizer = Tokenizer(source)
    return tokenizer.get_tokens_as_string()

def test_ID():
    assert test_lexer('a') == 'ID,a,EOF'

def test_INT():
    assert test_lexer('50') == 'INT,50,EOF'

def test_vardecl():
    assert test_lexer('int a;') == 'INT_TYPE,int,ID,a,SEMICOLON,;,EOF'

def test_funcdecl():
    assert test_lexer('int fun()') == 'INT_TYPE,int,ID,fun,LROUND_BRACKET,(,RROUND_BRACKET,),EOF'
