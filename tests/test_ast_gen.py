"""
AST Generation test cases for TyC compiler.
TODO: Implement 100 test cases for AST generation
"""

import pytest
from tests.utils import ASTGenerator


def test_ast_gen_placeholder():
    """Placeholder test - replace with actual test cases"""
    source = """void main() {
}"""
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_ast_gen_placeholder_1():
    source = """
        struct Point {
            int x;
            int y;
        };
    """
    expected = "Program([StructDecl(Point, [MemberDecl(IntType(), x), MemberDecl(IntType(), y)])])"
    assert str(ASTGenerator(source).generate()) == expected

def test_ast_gen_placeholder_2():
    source = """
        int add(int x, int y) {
            return x + y;
        }
    """
    expected = "Program([FuncDecl(IntType(), add, [Param(IntType(), x), Param(IntType(), y)], BlockStmt([ReturnStmt(return BinaryOp(Identifier(x), +, Identifier(y)))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_ast_gen_placeholder_3():
    source = """
        add(int x, int y) {
            return x + y;
        }
    """
    expected = "Program([FuncDecl(auto, add, [Param(IntType(), x), Param(IntType(), y)], BlockStmt([ReturnStmt(return BinaryOp(Identifier(x), +, Identifier(y)))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_ast_gen_placeholder_4():
    source = """
        void main() {
            auto x = 10;
        }
    """
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([VarDecl(auto, x = IntLiteral(10))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_1():
    source = "void fun() {} void main() { fun(); }"
    expected = "Program([FuncDecl(VoidType(), fun, [], BlockStmt([])), FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(FuncCall(Identifier(fun), []))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_2():
    source = "void _fun() {} void main() { _fun(); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([VarDecl(auto, x = IntLiteral(10))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_3():
    source = "void _fun() { int c = 5; int b = 3; int a = b + c; int e = 3 * 5; return a;} void main() { int d = 3 *_fun(); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([VarDecl(auto, x = IntLiteral(10))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_4():
    source = "void fn() { int c = 5; int b = 3; int a = b + c; int e = 3 * 5; return a;} void main() { int d = 3 *_fun(); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([VarDecl(auto, x = IntLiteral(10))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_5():
    source = "void main() { fun(2, 5, fun(), 3 + 5, fun.mandy, fun.mandy + 4 * 21); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([VarDecl(auto, x = IntLiteral(10))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_6():
    source = "void main() { fun(clock, ++3, 3++, f++, --g, g--, smearing_bunny); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(FuncCall(Identifier(fun), [[[...], [...]], [[...], [...]]]))]))])"
    assert str(ASTGenerator(source).generate()) == expected
