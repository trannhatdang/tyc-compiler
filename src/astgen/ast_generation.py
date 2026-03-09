"""
AST Generation module for TyC programming language.
This module contains the ASTGeneration class that converts parse trees
into Abstract Syntax Trees using the visitor pattern.
"""

from functools import reduce
from build.TyCVisitor import TyCVisitor
from build.TyCParser import TyCParser
from src.utils.nodes import *

class ASTGeneration(TyCVisitor):
    """AST Generation visitor for TyC language."""
    # Visit a parse tree produced by TyCParser#program.

    def visitProgram(self, ctx:TyCParser.ProgramContext):
        prog_stat_list_context = ctx.prog_stat_list()

        decls = self.visit(prog_stat_list_context)
        prog = Program(decls)

        return prog

    # Visit a parse tree produced by TyCParser#prog_stat_list.
    def visitProg_stat_list(self, ctx:TyCParser.Prog_stat_listContext):
        prog_stat_list_context = ctx.prog_stat_list()
        prog_stat_context = ctx.prog_stat()

        if prog_stat_list_context is None:
            return None

        next_prog_stat_list = self.visit(prog_stat_list_context)
        prog_stat = self.visit(prog_stat_context)

        decls = [].extend(next_prog_stat_list).extend(prog_stat)

        return decls

    # Visit a parse tree produced by TyCParser#prog_stat.
    def visitProg_stat(self, ctx:TyCParser.Prog_statContext):
        func_decl_context = ctx.func_decl()
        struct_decl_context = ctx.struct_decl()

        func_decl = self.visit(func_decl_context) if func_decl_context is not None else None
        struct_decl = self.visit(struct_decl_context) if struct_decl_context is not None else None

        stat = func_decl if func_decl is not None else struct_decl

        return stat

    # Visit a parse tree produced by TyCParser#func_decl.
    def visitFunc_decl(self, ctx:TyCParser.Func_declContext):
        return_type_context = ctx.return_type()
        ID_context = ctx.ID()
        param_list_context = ctx.param_list()
        stat_list_context = ctx.stat_list()

        return_type = self.visit(return_type_context) if return_type_context is not None else None
        ID = self.visit(ID_context)
        param_list = self.visit(param_list_context)
        stat_list = self.visit(stat_list_context)

        func_decl = FuncDecl(return_type, ID, params, stat_list)
        return func_decl

    # Visit a parse tree produced by TyCParser#param_list.
    def visitParam_list(self, ctx:TyCParser.Param_listContext):
        param_list_context = ctx.param_list()
        param = ctx.param()



        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#param.
    def visitParam(self, ctx:TyCParser.ParamContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#param_type.
    def visitParam_type(self, ctx:TyCParser.Param_typeContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#return_type.
    def visitReturn_type(self, ctx:TyCParser.Return_typeContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#struct_decl.
    def visitStruct_decl(self, ctx:TyCParser.Struct_declContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#struct_var_decl_list.
    def visitStruct_var_decl_list(self, ctx:TyCParser.Struct_var_decl_listContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#struct_var_decl_stat.
    def visitStruct_var_decl_stat(self, ctx:TyCParser.Struct_var_decl_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#struct_var_type.
    def visitStruct_var_type(self, ctx:TyCParser.Struct_var_typeContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#stat_list.
    def visitStat_list(self, ctx:TyCParser.Stat_listContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#stat.
    def visitStat(self, ctx:TyCParser.StatContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#var_decl_list.
    def visitVar_decl_list(self, ctx:TyCParser.Var_decl_listContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#var_decl_stat.
    def visitVar_decl_stat(self, ctx:TyCParser.Var_decl_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#var_decl_expr.
    def visitVar_decl_expr(self, ctx:TyCParser.Var_decl_exprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#var_type.
    def visitVar_type(self, ctx:TyCParser.Var_typeContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#block_stat.
    def visitBlock_stat(self, ctx:TyCParser.Block_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#if_stat.
    def visitIf_stat(self, ctx:TyCParser.If_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#while_stat.
    def visitWhile_stat(self, ctx:TyCParser.While_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#for_stat.
    def visitFor_stat(self, ctx:TyCParser.For_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#switch_stat.
    def visitSwitch_stat(self, ctx:TyCParser.Switch_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#case_expr_list.
    def visitCase_expr_list(self, ctx:TyCParser.Case_expr_listContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#case_expr.
    def visitCase_expr(self, ctx:TyCParser.Case_exprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#default_case_expr.
    def visitDefault_case_expr(self, ctx:TyCParser.Default_case_exprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#break_stat.
    def visitBreak_stat(self, ctx:TyCParser.Break_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#continue_stat.
    def visitContinue_stat(self, ctx:TyCParser.Continue_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#return_stat.
    def visitReturn_stat(self, ctx:TyCParser.Return_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#expr_stat.
    def visitExpr_stat(self, ctx:TyCParser.Expr_statContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#lvalue.
    def visitLvalue(self, ctx:TyCParser.LvalueContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#expr_list.
    def visitExpr_list(self, ctx:TyCParser.Expr_listContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#expr.
    def visitExpr(self, ctx:TyCParser.ExprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#assign_expr.
    def visitAssign_expr(self, ctx:TyCParser.Assign_exprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#inc_expr.
    def visitInc_expr(self, ctx:TyCParser.Inc_exprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#dec_expr.
    def visitDec_expr(self, ctx:TyCParser.Dec_exprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#arg_list.
    def visitArg_list(self, ctx:TyCParser.Arg_listContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#arg.
    def visitArg(self, ctx:TyCParser.ArgContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#bin_op.
    def visitBin_op(self, ctx:TyCParser.Bin_opContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#un_op.
    def visitUn_op(self, ctx:TyCParser.Un_opContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#pre_op.
    def visitPre_op(self, ctx:TyCParser.Pre_opContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by TyCParser#post_op.
    def visitPost_op(self, ctx:TyCParser.Post_opContext):
        return self.visitChildren(ctx)
    pass
