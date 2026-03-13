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
    expected = "Program([FuncDecl(VoidType(), _fun, [], BlockStmt([])), FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(FuncCall(Identifier(_fun), []))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_3():
    source = "void _fun() { int c = 5; int b = 3; int a = b + c; int e = 3 * 5; return a;} void main() { int d = 3 *_fun(); }"
    expected = "Program([FuncDecl(VoidType(), _fun, [], BlockStmt([VarDecl(IntType(), c = IntLiteral(5)), VarDecl(IntType(), b = IntLiteral(3)), VarDecl(IntType(), a = BinaryOp(Identifier(b), +, Identifier(c))), VarDecl(IntType(), e = BinaryOp(IntLiteral(3), *, IntLiteral(5))), ReturnStmt(return Identifier(a))])), FuncDecl(VoidType(), main, [], BlockStmt([VarDecl(IntType(), d = BinaryOp(IntLiteral(3), *, FuncCall(Identifier(_fun), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_4():
    source = "void fn() { int c = 5; int b = 3; int a = b + c; int e = 3 * 5; return a;} void main() { int d = 3 *_fun(); }"
    expected = "Program([FuncDecl(VoidType(), fn, [], BlockStmt([VarDecl(IntType(), c = IntLiteral(5)), VarDecl(IntType(), b = IntLiteral(3)), VarDecl(IntType(), a = BinaryOp(Identifier(b), +, Identifier(c))), VarDecl(IntType(), e = BinaryOp(IntLiteral(3), *, IntLiteral(5))), ReturnStmt(return Identifier(a))])), FuncDecl(VoidType(), main, [], BlockStmt([VarDecl(IntType(), d = BinaryOp(IntLiteral(3), *, FuncCall(Identifier(_fun), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_5():
    source = "void main() { fun(2, 5, fun(), 3 + 5, fun.mandy, fun.mandy + 4 * 21); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(FuncCall(Identifier(fun), [IntLiteral(2), IntLiteral(5), FuncCall(Identifier(fun), []), BinaryOp(IntLiteral(3), +, IntLiteral(5)), MemberAccess(Identifier(fun).mandy), BinaryOp(MemberAccess(Identifier(fun).mandy), +, BinaryOp(IntLiteral(4), *, IntLiteral(21)))]))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_6():
    source = "void main() { fun(clock, ++3, 3++, f++, --g, g--, smearing_bunny); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(FuncCall(Identifier(fun), [Identifier(clock), PrefixOp(++IntLiteral(3)), PostfixOp(IntLiteral(3)++), PostfixOp(Identifier(f)++), PrefixOp(--Identifier(g)), PostfixOp(Identifier(g)--), Identifier(smearing_bunny)]))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_struct_1():
    source = "struct Drive; struct Tribe; struct New; struct World;"
    expected = "Program([StructDecl(Drive, []), StructDecl(Tribe, []), StructDecl(New, []), StructDecl(World, [])])"
    assert str(ASTGenerator(source).generate()) == expected

def test_struct_2():
    source = "void main() { lm = {_abc.ld, b+c(), {3, 5}}; bernie bern = {{{{3}}}}; }"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_struct_3():
    source = "void main() { lm = {_abc.ld, b+c(), {3, 5}}; bernie bern = {{{{3}}}}; }"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_struct_4():
    source = "void main() { int a = abc().d; }"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_if_1():
    source = "void main() {if(pong_tin) { lmao(); }}"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_if_2():
    source = "void main() {if(pong_tin) lmao();}"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_if_3():
    source = "void main() {if(pong_tin) { lmao(); } else { porsche(); } }"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_if_4():
    source = "void main() {if(pong_tin) lmao(); else stone_henge();}"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_if_5():
    source = "void main() {if(pong_tin) { lmao(); } else spot_of_lunch(); }"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_if_6():
    source = "void main() {if(pong_tin && on_paper ) { lmao(); } else spot_of_lunch(); }"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_if_7():
    source = "void main() {if(pong_tin && on_paper || (pretending * wahoo)) { lmao(); } else spot_of_lunch(); }"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_if_8():
    source = "void main() {if(ahk || pong_tin && on_paper + 35 || (pretending * wahoo())) { lmao(); } else spot_of_lunch(); }"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected

def test_if_9():
    source = "void main() {if(pong_tin) { lmao(); a = 3 + 7; int s = 35;} else if(lmao) {lmao(); lmao();} else peaked();}"
    expected = ""
    assert str(ASTGenerator(source).generate()) == expected
