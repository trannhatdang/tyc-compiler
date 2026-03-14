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

def test_exp_1():
    source = "void main() { a = b + c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), +, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_2():
    source = "void main() { a = b - c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), -, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_3():
    source = "void main() { b = a * c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(b = BinaryOp(Identifier(a), *, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_4():
    source = "void main() { a = b / c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), /, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_5():
    source = "void main() { a = b % c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), %, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_6():
    source = "void main() { a = b || c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), ||, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_7():
    source = "void main() { a = b && c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), &&, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_8():
    source = "void main() { a = b == c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), ==, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_9():
    source = "void main() { a = b != c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), !=, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_10():
    source = "void main() { a = b < c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), <, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_11():
    source = "void main() { a = b <= c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), <=, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_12():
    source = "void main() { a = b > c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), >, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_13():
    source = "void main() { a = b >= c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), >=, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_14():
    source = "void main() { a = !b; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = PrefixOp(!Identifier(b))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_15():
    source = "void main() { a = -b; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = PrefixOp(-Identifier(b))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_16():
    source = "void main() { a = +b; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = PrefixOp(+Identifier(b))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_17():
    source = "void main() { a = ++b; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = PrefixOp(++Identifier(b))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_18():
    source = "void main() { a = b++; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = PostfixOp(Identifier(b)++)))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_19():
    source = "void main() { a = --b; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = PrefixOp(--Identifier(b))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_20():
    source = "void main() { a = b--; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = PostfixOp(Identifier(b)--)))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_21():
    source = "void main() { a = b(); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = FuncCall(Identifier(b), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_22():
    source = "void main() { a = b.a; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = MemberAccess(Identifier(b).a)))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_23():
    source = "void main() { a = (a + b); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(a), +, Identifier(b))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_24():
    source = "void main() { a = (a + b) * c; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(BinaryOp(Identifier(a), +, Identifier(b)), *, Identifier(c))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_25():
    source = "void main() { a = (a + b) * c / 5; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(BinaryOp(Identifier(a), +, Identifier(b)), *, BinaryOp(Identifier(c), /, IntLiteral(5)))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_26():
    source = "void main() { a = (a + (b - 3) / 5 % 20 * 10) * (c / 5); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(BinaryOp(Identifier(a), +, BinaryOp(BinaryOp(Identifier(b), -, IntLiteral(3)), /, BinaryOp(IntLiteral(5), %, BinaryOp(IntLiteral(20), *, IntLiteral(10))))), *, BinaryOp(Identifier(c), /, IntLiteral(5)))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_27():
    source = "void main() { a = (a + (b - 3) / 5 % 20 * 10) * (c / 5) * -25 + b++ * 25; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(BinaryOp(Identifier(a), +, BinaryOp(BinaryOp(Identifier(b), -, IntLiteral(3)), /, BinaryOp(IntLiteral(5), %, BinaryOp(IntLiteral(20), *, IntLiteral(10))))), *, BinaryOp(BinaryOp(Identifier(c), /, IntLiteral(5)), *, BinaryOp(IntLiteral(-25), +, BinaryOp(PostfixOp(Identifier(b)++), *, IntLiteral(25)))))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_28():
    source = "void main() { a = (a.b + (!b - 3) / 5 || 20 == 10) * (c / 5) * -25 + b++ * 25; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(BinaryOp(MemberAccess(Identifier(a).b), +, BinaryOp(BinaryOp(PrefixOp(!Identifier(b)), -, IntLiteral(3)), /, BinaryOp(IntLiteral(5), ||, BinaryOp(IntLiteral(20), ==, IntLiteral(10))))), *, BinaryOp(BinaryOp(Identifier(c), /, IntLiteral(5)), *, BinaryOp(IntLiteral(-25), +, BinaryOp(PostfixOp(Identifier(b)++), *, IntLiteral(25)))))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_29():
    source = "void main() { a = a || b && c;}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(a), ||, BinaryOp(Identifier(b), &&, Identifier(c)))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_30():
    source = "void fun() {} void main() { a = f() * (3 * 3); }"
    expected = "Program([FuncDecl(VoidType(), fun, [], BlockStmt([])), FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(FuncCall(Identifier(f), []), *, BinaryOp(IntLiteral(3), *, IntLiteral(3)))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_31():
    source = "void fun() {} void main() { a = (f() + 3) * 3; }"
    expected = "Program([FuncDecl(VoidType(), fun, [], BlockStmt([])), FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(BinaryOp(FuncCall(Identifier(f), []), +, IntLiteral(3)), *, IntLiteral(3))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_32():
    source = "void fun() {} void main() { a = f() + 3 * 3; }"
    expected = "Program([FuncDecl(VoidType(), fun, [], BlockStmt([])), FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(FuncCall(Identifier(f), []), +, BinaryOp(IntLiteral(3), *, IntLiteral(3)))))]))])"
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

def test_func_7():
    source = "struct hammond {int a; float b; string c; }; int lmao() {} void fun() {} void main() { fun(); }"
    expected = "Program([StructDecl(hammond, [MemberDecl(IntType(), a), MemberDecl(FloatType(), b), MemberDecl(StringType(), c)]), FuncDecl(IntType(), lmao, [], BlockStmt([])), FuncDecl(VoidType(), fun, [], BlockStmt([])), FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(FuncCall(Identifier(fun), []))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_8():
    source = "struct hammond {int a; float b; string c; }; int lmao() {} void fun() {} void main() { fun(); }"
    expected = "Program([StructDecl(hammond, [MemberDecl(IntType(), a), MemberDecl(FloatType(), b), MemberDecl(StringType(), c)]), FuncDecl(IntType(), lmao, [], BlockStmt([])), FuncDecl(VoidType(), fun, [], BlockStmt([])), FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(FuncCall(Identifier(fun), []))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_func_9():
    source = "struct hammond {int a; float b; string c; }; int lmao() {} void fun() {} void main() { fun(); } float lmao2() {} string lmao3() {}"
    expected = "Program([StructDecl(hammond, [MemberDecl(IntType(), a), MemberDecl(FloatType(), b), MemberDecl(StringType(), c)]), FuncDecl(IntType(), lmao, [], BlockStmt([])), FuncDecl(VoidType(), fun, [], BlockStmt([])), FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(FuncCall(Identifier(fun), []))])), FuncDecl(FloatType(), lmao2, [], BlockStmt([])), FuncDecl(StringType(), lmao3, [], BlockStmt([]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_struct_1():
    source = "struct Drive; struct Tribe; struct New; struct World;"
    expected = "Program([StructDecl(Drive, []), StructDecl(Tribe, []), StructDecl(New, []), StructDecl(World, [])])"
    assert str(ASTGenerator(source).generate()) == expected

def test_struct_2():
    source = "void main() { lm = {_abc.ld, b+c(), {3, 5}}; bernie bern = {{{{3}}}}; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(lm = StructLiteral({MemberAccess(Identifier(_abc).ld), BinaryOp(Identifier(b), +, FuncCall(Identifier(c), [])), StructLiteral({IntLiteral(3), IntLiteral(5)})}))), VarDecl(StructType(bernie), bern = StructLiteral({StructLiteral({StructLiteral({StructLiteral({IntLiteral(3)})})})}))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_struct_3():
    source = "void main() { lm = {_abc.ld, b+c(), {3, 5}}; bernie bern = {{{{3}}}}; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(lm = StructLiteral({MemberAccess(Identifier(_abc).ld), BinaryOp(Identifier(b), +, FuncCall(Identifier(c), [])), StructLiteral({IntLiteral(3), IntLiteral(5)})}))), VarDecl(StructType(bernie), bern = StructLiteral({StructLiteral({StructLiteral({StructLiteral({IntLiteral(3)})})})}))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_struct_4():
    source = "void main() { int a = abc().d; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([VarDecl(IntType(), a = MemberAccess(FuncCall(Identifier(abc), []).d))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_if_1():
    source = "void main() {if(pong_tin) { lmao(); }}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([IfStmt(if Identifier(pong_tin) then BlockStmt([ExprStmt(FuncCall(Identifier(lmao), []))]))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_if_2():
    source = "void main() {if(pong_tin) lmao();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([IfStmt(if Identifier(pong_tin) then ExprStmt(FuncCall(Identifier(lmao), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_if_3():
    source = "void main() {if(pong_tin) { lmao(); } else { porsche(); } }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([IfStmt(if Identifier(pong_tin) then BlockStmt([ExprStmt(FuncCall(Identifier(lmao), []))]), else BlockStmt([ExprStmt(FuncCall(Identifier(porsche), []))]))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_if_4():
    source = "void main() {if(pong_tin) lmao(); else stone_henge();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([IfStmt(if Identifier(pong_tin) then ExprStmt(FuncCall(Identifier(lmao), [])), else ExprStmt(FuncCall(Identifier(stone_henge), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_if_5():
    source = "void main() {if(pong_tin) { lmao(); } else spot_of_lunch(); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([IfStmt(if Identifier(pong_tin) then BlockStmt([ExprStmt(FuncCall(Identifier(lmao), []))]), else ExprStmt(FuncCall(Identifier(spot_of_lunch), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_if_6():
    source = "void main() {if(pong_tin && on_paper ) { lmao(); } else spot_of_lunch(); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([IfStmt(if BinaryOp(Identifier(pong_tin), &&, Identifier(on_paper)) then BlockStmt([ExprStmt(FuncCall(Identifier(lmao), []))]), else ExprStmt(FuncCall(Identifier(spot_of_lunch), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_if_7():
    source = "void main() {if(pong_tin && on_paper || (pretending * wahoo)) { lmao(); } else spot_of_lunch(); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([IfStmt(if BinaryOp(Identifier(pong_tin), &&, BinaryOp(Identifier(on_paper), ||, BinaryOp(Identifier(pretending), *, Identifier(wahoo)))) then BlockStmt([ExprStmt(FuncCall(Identifier(lmao), []))]), else ExprStmt(FuncCall(Identifier(spot_of_lunch), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_if_8():
    source = "void main() {if(ahk || pong_tin && on_paper + 35 || (pretending * wahoo())) { lmao(); } else spot_of_lunch(); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([IfStmt(if BinaryOp(Identifier(ahk), ||, BinaryOp(Identifier(pong_tin), &&, BinaryOp(Identifier(on_paper), +, BinaryOp(IntLiteral(35), ||, BinaryOp(Identifier(pretending), *, FuncCall(Identifier(wahoo), [])))))) then BlockStmt([ExprStmt(FuncCall(Identifier(lmao), []))]), else ExprStmt(FuncCall(Identifier(spot_of_lunch), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_if_9():
    source = "void main() {if(pong_tin) { lmao(); a = 3 + 7; int s = 35;} else if(lmao) {lmao(); lmao();} else peaked();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([IfStmt(if Identifier(pong_tin) then BlockStmt([ExprStmt(FuncCall(Identifier(lmao), [])), ExprStmt(AssignExpr(a = BinaryOp(IntLiteral(3), +, IntLiteral(7)))), VarDecl(IntType(), s = IntLiteral(35))]), else IfStmt(if Identifier(lmao) then BlockStmt([ExprStmt(FuncCall(Identifier(lmao), [])), ExprStmt(FuncCall(Identifier(lmao), []))]), else ExprStmt(FuncCall(Identifier(peaked), []))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_block_statement_1():
    source = "void main() { {a = b + c;} }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), +, Identifier(c))))])]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_block_statement_2():
    source = "void main() { {int a; int b = fun(); int c = b * a + 3 - fun();} }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([BlockStmt([VarDecl(IntType(), a), VarDecl(IntType(), b = FuncCall(Identifier(fun), [])), VarDecl(IntType(), c = BinaryOp(Identifier(b), *, BinaryOp(Identifier(a), +, BinaryOp(IntLiteral(3), -, FuncCall(Identifier(fun), [])))))])]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_block_statement_3():
    source = "void main() { { { { a = b + c; } } } }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([BlockStmt([BlockStmt([BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), +, Identifier(c))))])])])]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_while_1():
    source = "void main() {while(hammond) {boat();}}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([WhileStmt(while Identifier(hammond) do BlockStmt([ExprStmt(FuncCall(Identifier(boat), []))]))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_while_2():
    source = "void main() {while(hammond) boat();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([WhileStmt(while Identifier(hammond) do ExprStmt(FuncCall(Identifier(boat), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_while_3():
    source = "void main() {while(hammond) { boat(); a = b + c; box(); }}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([WhileStmt(while Identifier(hammond) do BlockStmt([ExprStmt(FuncCall(Identifier(boat), [])), ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), +, Identifier(c)))), ExprStmt(FuncCall(Identifier(box), []))]))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_while_4():
    source = "void main() {while(hammond || propeller + c) { boat(); a = b + c; box(); }}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([WhileStmt(while BinaryOp(Identifier(hammond), ||, BinaryOp(Identifier(propeller), +, Identifier(c))) do BlockStmt([ExprStmt(FuncCall(Identifier(boat), [])), ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), +, Identifier(c)))), ExprStmt(FuncCall(Identifier(box), []))]))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_while_5():
    source = "void main() {while(8 * hammond || propeller + c) { boat(); a = b + c; box(); }}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([WhileStmt(while BinaryOp(IntLiteral(8), *, BinaryOp(Identifier(hammond), ||, BinaryOp(Identifier(propeller), +, Identifier(c)))) do BlockStmt([ExprStmt(FuncCall(Identifier(boat), [])), ExprStmt(AssignExpr(a = BinaryOp(Identifier(b), +, Identifier(c)))), ExprStmt(FuncCall(Identifier(box), []))]))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_1():
    source = "void main() {for(int i = 0; i < 10; ++i) {korean_crane_carrier();}}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); BinaryOp(Identifier(i), <, IntLiteral(10)); PrefixOp(++Identifier(i)) do BlockStmt([ExprStmt(FuncCall(Identifier(korean_crane_carrier), []))]))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_2():
    source = "void main() {for(int i = 0; i < 10; ++i) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); BinaryOp(Identifier(i), <, IntLiteral(10)); PrefixOp(++Identifier(i)) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_3():
    source = "void main() {for(int i = 0; i < 10; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); BinaryOp(Identifier(i), <, IntLiteral(10)); None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_4():
    source = "void main() {for(int i = 0; ; ++i) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); None; PrefixOp(++Identifier(i)) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_5():
    source = "void main() {for(int i = 0; ; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); None; None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_6():
    source = "void main() {for(; i < 10; ++i) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; BinaryOp(Identifier(i), <, IntLiteral(10)); PrefixOp(++Identifier(i)) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_7():
    source = "void main() {for(; i < 10; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; BinaryOp(Identifier(i), <, IntLiteral(10)); None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_8():
    source = "void main() {for(; ; ++i) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; None; PrefixOp(++Identifier(i)) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_9():
    source = "void main() {for(int i = 0; i < 10; i++) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); BinaryOp(Identifier(i), <, IntLiteral(10)); PostfixOp(Identifier(i)++) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_10():
    source = "void main() {for(int i = 0; i < 10; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); BinaryOp(Identifier(i), <, IntLiteral(10)); None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_11():
    source = "void main() {for(int i = 0; ; i++) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); None; PostfixOp(Identifier(i)++) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_12():
    source = "void main() {for(int i = 0; ; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); None; None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_13():
    source = "void main() {for(; i < 10; i++) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; BinaryOp(Identifier(i), <, IntLiteral(10)); PostfixOp(Identifier(i)++) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_14():
    source = "void main() {for(; i < 10; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; BinaryOp(Identifier(i), <, IntLiteral(10)); None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_15():
    source = "void main() {for(; ; i++) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; None; PostfixOp(Identifier(i)++) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_16():
    source = "void main() {for(; ; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; None; None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_17():
    source = "void main() {for(int i = 0; i < 10; --i) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); BinaryOp(Identifier(i), <, IntLiteral(10)); PrefixOp(--Identifier(i)) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_18():
    source = "void main() {for(int i = 0; i < 10; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); BinaryOp(Identifier(i), <, IntLiteral(10)); None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_19():
    source = "void main() {for(int i = 0; ; --i) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); None; PrefixOp(--Identifier(i)) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_20():
    source = "void main() {for(int i = 0; ; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); None; None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_21():
    source = "void main() {for(; i < 10; --i) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; BinaryOp(Identifier(i), <, IntLiteral(10)); PrefixOp(--Identifier(i)) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_22():
    source = "void main() {for(; i < 10; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; BinaryOp(Identifier(i), <, IntLiteral(10)); None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected
    
def test_for_23():
    source = "void main() {for(; ; --i) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; None; PrefixOp(--Identifier(i)) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_24():
    source = "void main() {for(; ; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; None; None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_25():
    source = "void main() {for(int i = 0; i < 10; i--) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); BinaryOp(Identifier(i), <, IntLiteral(10)); PostfixOp(Identifier(i)--) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_26():
    source = "void main() {for(int i = 0; i < 10; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); BinaryOp(Identifier(i), <, IntLiteral(10)); None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_27():
    source = "void main() {for(int i = 0; ; i--) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); None; PostfixOp(Identifier(i)--) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_28():
    source = "void main() {for(int i = 0; ; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); None; None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_29():
    source = "void main() {for(; i < 10; i--) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; BinaryOp(Identifier(i), <, IntLiteral(10)); PostfixOp(Identifier(i)--) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_30():
    source = "void main() {for(; i < 10; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; BinaryOp(Identifier(i), <, IntLiteral(10)); None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_31():
    source = "void main() {for(; ; i--) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; None; PostfixOp(Identifier(i)--) do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_32():
    source = "void main() {for(; ; ) korean_crane_carrier();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for None; None; None do ExprStmt(FuncCall(Identifier(korean_crane_carrier), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_for_33():
    source = "void main() {for(int i = 0; i < 10; ++i) pete();}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ForStmt(for VarDecl(IntType(), i = IntLiteral(0)); BinaryOp(Identifier(i), <, IntLiteral(10)); PrefixOp(++Identifier(i)) do ExprStmt(FuncCall(Identifier(pete), [])))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_34():
    source = "void main() { a = (a + b) * c / 5; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(BinaryOp(Identifier(a), +, Identifier(b)), *, BinaryOp(Identifier(c), /, IntLiteral(5)))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_35():
    source = "void main() { a = (a + (b - 3) / 5 % 20 * 10) * (c / 5); }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(BinaryOp(Identifier(a), +, BinaryOp(BinaryOp(Identifier(b), -, IntLiteral(3)), /, BinaryOp(IntLiteral(5), %, BinaryOp(IntLiteral(20), *, IntLiteral(10))))), *, BinaryOp(Identifier(c), /, IntLiteral(5)))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_36():
    source = "void main() { a = (a + (b - 3) / 5 % 20 * 10) * (c / 5) * -25 + b++ * 25; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(BinaryOp(Identifier(a), +, BinaryOp(BinaryOp(Identifier(b), -, IntLiteral(3)), /, BinaryOp(IntLiteral(5), %, BinaryOp(IntLiteral(20), *, IntLiteral(10))))), *, BinaryOp(BinaryOp(Identifier(c), /, IntLiteral(5)), *, BinaryOp(IntLiteral(-25), +, BinaryOp(PostfixOp(Identifier(b)++), *, IntLiteral(25)))))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_exp_37():
    source = "void main() { a = (a.b + (!b - 3) / 5 || 20 == 10) * (c / 5) * -25 + b++ * 25; }"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([ExprStmt(AssignExpr(a = BinaryOp(BinaryOp(MemberAccess(Identifier(a).b), +, BinaryOp(BinaryOp(PrefixOp(!Identifier(b)), -, IntLiteral(3)), /, BinaryOp(IntLiteral(5), ||, BinaryOp(IntLiteral(20), ==, IntLiteral(10))))), *, BinaryOp(BinaryOp(Identifier(c), /, IntLiteral(5)), *, BinaryOp(IntLiteral(-25), +, BinaryOp(PostfixOp(Identifier(b)++), *, IntLiteral(25)))))))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_switch_stat_1():
    source = "void main() {switch (day) { case 1: printInt(1); break; case 2: case 3: printInt(3); break; default: printInt(0);}}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([SwitchStmt(switch Identifier(day) cases [CaseStmt(case IntLiteral(1): [ExprStmt(FuncCall(Identifier(printInt), [IntLiteral(1)])), BreakStmt()]), CaseStmt(case IntLiteral(2): []), CaseStmt(case IntLiteral(3): [ExprStmt(FuncCall(Identifier(printInt), [IntLiteral(3)])), BreakStmt()])], default DefaultStmt(default: [ExprStmt(FuncCall(Identifier(printInt), [IntLiteral(0)]))]))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_switch_stat_2():
    source = "void main() {switch (day) { }}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([SwitchStmt(switch Identifier(day) cases [], default DefaultStmt(default: []))]))])"
    assert str(ASTGenerator(source).generate()) == expected

def test_switch_stat_3():
    source = "void main() {switch (day) { case 1 + 2: printInt(3); break; case (4): printInt(4); break; case +5: printInt(5); break; case -6: printInt(6); break; }}"
    expected = "Program([FuncDecl(VoidType(), main, [], BlockStmt([SwitchStmt(switch Identifier(day) cases [CaseStmt(case BinaryOp(IntLiteral(1), +, IntLiteral(2)): [ExprStmt(FuncCall(Identifier(printInt), [IntLiteral(3)])), BreakStmt()]), CaseStmt(case IntLiteral(4): [ExprStmt(FuncCall(Identifier(printInt), [IntLiteral(4)])), BreakStmt()]), CaseStmt(case PrefixOp(+IntLiteral(5)): [ExprStmt(FuncCall(Identifier(printInt), [IntLiteral(5)])), BreakStmt()]), CaseStmt(case IntLiteral(-6): [ExprStmt(FuncCall(Identifier(printInt), [IntLiteral(6)])), BreakStmt()])], default DefaultStmt(default: []))]))])"
    assert str(ASTGenerator(source).generate()) == expected
