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

