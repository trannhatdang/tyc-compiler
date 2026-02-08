"""
Parser test cases for TyC compiler
TODO: Implement 100 test cases for parser
"""

import pytest
from tests.utils import Parser

def test_normal_fun():
    assert Parser
    ("int fun() {int a;int c;int b;a = b * c - c;}") == "success"

# ========== Simple Test Cases (10 types) ==========
def test_empty_program():
    """1. Empty program"""
    assert Parser("").parse() == "success"


def test_program_with_only_main():
    """2. Program with only main function"""
    assert Parser("void main() {}").parse() == "success"


def test_struct_simple():
    """3. Struct declaration"""
    source = "struct Point { int x; int y; };"
    assert Parser(source).parse() == "success"


def test_function_no_params():
    """4. Function with no parameters"""
    source = "void greet() { printString(\"Hello\"); }"
    assert Parser(source).parse() == "success"


def test_var_decl_auto_with_init():
    """5. Variable declaration"""
    source = "void main() { auto x = 5; }"
    assert Parser(source).parse() == "success"


def test_if_simple():
    """6. If statement"""
    source = "void main() { if (1) printInt(1); }"
    assert Parser(source).parse() == "success"


def test_while_simple():
    """7. While statement"""
    source = "void main() { while (1) printInt(1); }"
    assert Parser(source).parse() == "success"


def test_for_simple():
    """8. For statement"""
    source = "void main() { for (auto i = 0; i < 10; ++i) printInt(i); }"
    assert Parser(source).parse() == "success"


def test_switch_simple():
    """9. Switch statement"""
    source = "void main() { switch (1) { case 1: printInt(1); break; } }"
    assert Parser(source).parse() == "success"


def test_assignment_simple():
    """10. Assignment statement"""
    source = "void main() { int x; x = 5; }"
    assert Parser(source).parse() == "success"

###############Functions#################

def test_func_1():
    source = "void fun() {} void main() { }"
    assert Parser(source).parse() == "success"

def test_func_2():
    source = "void fun() {} void main() { fun(); }"
    assert Parser(source).parse() == "success"

def test_func_3():
    source = "void _fun() {} void main() { _fun(); }"
    assert Parser(source).parse() == "success"

def test_func_4():
    source = "void _fun() { int c = 5; int b = 3; int a = b + c; int e = 3 * 5; return a;} void main() { int d = 3 *_fun(); }"
    assert Parser(source).parse() == "success"

def test_func_5():
    source = "void fn() { int c = 5; int b = 3; int a = b + c; int e = 3 * 5; return a;} void main() { int d = 3 *_fun(); printInt(fn()); }"
    assert Parser(source).parse() == "success"

###############Structs#################

def test_struct_1():
    source = "struct Drive; struct Tribe; struct New; struct World"
    assert Parser(source).parse() == "success"

def test_struct_2():
    source = "struct Drive; void main() { Drive drive; }"
    assert Parser(source).parse() == "success"

def test_struct_3():
    source = "struct Drive {int c; int b; };"
    assert Parser(source).parse() == "success"

def test_struct_4():
    source = "struct Drive {Drive b; string bugatti; }"
    assert Parser(source).parse() == "success"

def test_struct_5():
    source = "struct Drive {Drive b; string gatti; } void main() { Drive drive = {{}, \"veyron\"};}"
    assert Parser(source).parse() == "success"

def test_struct_6():
    source = "struct Drive"
    assert Parser(source).parse() == "success"

def test_struct_7():
    source = "struct Drive { int b; }"
    assert Parser(source).parse() == "success"

def test_struct_8():
    source = "struct Drive {Drive b; string gatti; } void main() { Drive specials }"
    assert Parser(source).parse() == "success"

def test_struct_9():
    source = "struct Drive {Drive b; string gatti; } void main() { Drive oh_cock; }"
    assert Parser(source).parse() == "success"

def test_struct_10():
    source = "struct lmao {int a;int b;}"
    assert Parser(source).parse() == "Error on line 1 col 26: <EOF>"

def test_struct_11():
    source = "struct lmao = {int a;int b;};"
    assert Parser(source).parse() == "Error on line 1 col 12: ="

def test_struct_12():
    source = "struct lmao {int a;int b;};"
    assert Parser(source).parse() == "success"

def test_struct_13():
    source = "void main() { lmao lm = {a, b}; }"
    assert Parser(source).parse() == "success"

def test_struct_14():
    source = "void main() { lm = {a, b}; }"
    assert Parser(source).parse() == "success"

def test_struct_15():
    source = "void main() { lm = {a(), b+c}; }"
    assert Parser(source).parse() == "success"

def test_struct_16():
    source = "void main() { lm = {_abc.ld, b+c()}; }"
    assert Parser(source).parse() == "success"

def test_struct_17():
    source = "void main() { lm = {_abc.ld, b+c(), {3, 5}}; }"
    assert Parser(source).parse() == "success"

def test_struct_18():
    source = "void main() { lm = {_abc.ld, b+c(), {3, 5}}; bernie bern = {{{{3}}}}; }"
    assert Parser(source).parse() == "success"

def test_struct_19():
    source = "void main() { lm = {_abc.ld, b+c(), {3, 5}}; bernie bern = {{{{3}}}; }"
    assert Parser(source).parse() == "Error on line 1 col 67: ;"

###############If Else#################
def test_if_1():
    source = "void main() {if(pong_tin) { lmao(); }}"
    assert Parser(source).parse() == "success"

def test_if_2():
    source = "void main() {if(pong_tin) lmao();}"
    assert Parser(source).parse() == "success"

def test_if_3():
    source = "void main() {if(pong_tin) { lmao(); } else { porsche(); } }"
    assert Parser(source).parse() == "success"

def test_if_4():
    source = "void main() {if(pong_tin) lmao(); else stone_henge();}"
    assert Parser(source).parse() == "success"

def test_if_5():
    source = "void main() {if(pong_tin) { lmao(); } else spot_of_lunch(); }"
    assert Parser(source).parse() == "success"

def test_if_6():
    source = "void main() {if(pong_tin && on_paper ) { lmao(); } else spot_of_lunch(); }"
    assert Parser(source).parse() == "success"

def test_if_7():
    source = "void main() {if(pong_tin && on_paper || (pretending * wahoo)) { lmao(); } else spot_of_lunch(); }"
    assert Parser(source).parse() == "success"

def test_if_8():
    source = "void main() {if(ahk || pong_tin && on_paper || (pretending * wahoo)) { lmao(); } else spot_of_lunch(); }"
    assert Parser(source).parse() == "success"

def test_if_err_1():
    source = "void main() {if(pong_tin) { lmao(); }; else spot_of_lunch(); }"
    assert Parser(source).parse() == "success"

def test_if_err_2():
    source = "void main() {if(pong_tin) { lmao(); } else chips }"
    assert Parser(source).parse() == "success"
###############Expressions#################

def test_exp_1():
    source = "void main() { a = b + c; }"
    assert Parser(source).parse() == "success"

def test_exp_2():
    source = "void main() { a + b = c }"
    assert Parser(source).parse() == "Error on line 1 col 20: ="

def test_exp_3():
    source = "void main() { a = b - c; }"
    assert Parser(source).parse() == "success"
