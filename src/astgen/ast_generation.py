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
        prog_stat_list_ctx = ctx.prog_stat_list()

        decls = self.visit(prog_stat_list_ctx)
        prog = Program(decls)

        return prog

    # Visit a parse tree produced by TyCParser#prog_stat_list.
    def visitProg_stat_list(self, ctx:TyCParser.Prog_stat_listContext):
        prog_stat_list_ctx = ctx.prog_stat_list()
        prog_stat_ctx = ctx.prog_stat()

        next_prog_stat_list = self.visit(prog_stat_list_ctx) if prog_stat_list_ctx is not None else None
        prog_stat = self.visit(prog_stat_ctx) if prog_stat_ctx is not None else None

        decls = []

        if prog_stat is not None:
            decls.append(prog_stat)


        if next_prog_stat_list is not None:
            decls.extend(next_prog_stat_list)

        return decls

    # Visit a parse tree produced by TyCParser#prog_stat.
    def visitProg_stat(self, ctx:TyCParser.Prog_statContext):
        func_decl_ctx = ctx.func_decl()
        struct_decl_ctx = ctx.struct_decl()

        func_decl = self.visit(func_decl_ctx) if func_decl_ctx is not None else None
        struct_decl = self.visit(struct_decl_ctx) if struct_decl_ctx is not None else None

        stat = func_decl if func_decl is not None else struct_decl
        return stat

    # Visit a parse tree produced by TyCParser#func_decl.
    def visitFunc_decl(self, ctx:TyCParser.Func_declContext):
        return_type_ctx = ctx.return_type()
        ID_ctx = ctx.ID()
        param_list_ctx = ctx.param_list()
        stat_list_ctx = ctx.stat_list()

        return_type = self.visit(return_type_ctx) if return_type_ctx is not None else None
        ID = ID_ctx
        param_list = self.visit(param_list_ctx)
        stat_list = BlockStmt(self.visit(stat_list_ctx))

        func_decl = FuncDecl(return_type, ID, param_list, stat_list)
        return func_decl

    # Visit a parse tree produced by TyCParser#param_list.
    def visitParam_list(self, ctx:TyCParser.Param_listContext):
        param_list_ctx = ctx.param_list()
        param_ctx = ctx.param()

        param_list = self.visit(param_list_ctx) if param_list_ctx is not None else None
        param = self.visit(param_ctx) if param_ctx is not None else None

        ret = []

        if param is not None:
            ret.append(param)

        if param_list is not None:
            ret.extend(param_list)

        return ret

    # Visit a parse tree produced by TyCParser#param.
    def visitParam(self, ctx:TyCParser.ParamContext):
        param_type_ctx = ctx.param_type()
        ID_ctx = ctx.ID()

        param_type = self.visit(param_type_ctx)
        ID = ID_ctx

        ret = Param(param_type, ID)

        return ret

    # Visit a parse tree produced by TyCParser#param_type.
    def visitParam_type(self, ctx:TyCParser.Param_typeContext):
        int_type_ctx = ctx.INT_TYPE()
        float_type_ctx = ctx.FLOAT_TYPE()
        string_type_ctx = ctx.STRING_TYPE()
        ID_type_ctx = ctx.ID()

        if int_type_ctx is not None:
            return IntType()
        elif float_type_ctx is not None:
            return FloatType()
        elif string_type_ctx is not None:
            return StringType()
        elif ID_type_ctx is not None:
            return StructType(ID_type_ctx)
        
        return None

    # Visit a parse tree produced by TyCParser#return_type.
    def visitReturn_type(self, ctx:TyCParser.Return_typeContext):
        param_type_ctx = ctx.param_type()
        void_type_ctx = ctx.VOID_TYPE()

        if void_type_ctx is not None:
            return VoidType()
        elif param_type_ctx is not None:
            return self.visit(param_type_ctx)

        return None

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
        stat_ctx = ctx.stat()
        stat_list_ctx = ctx.stat_list()

        stat = self.visit(stat_ctx) if stat_ctx is not None else None
        stat_list = self.visit(stat_list_ctx) if stat_list_ctx is not None else None

        ret = []

        if stat is not None:
            ret.append(stat)

        if stat_list is not None:
            ret.extend(stat_list)

        return ret

    # Visit a parse tree produced by TyCParser#stat.
    def visitStat(self, ctx:TyCParser.StatContext):
        var_decl_stat_ctx = ctx.var_decl_stat()
        block_stat_ctx = ctx.block_stat()
        if_stat_ctx = ctx.if_stat()
        while_stat_ctx = ctx.while_stat()
        for_stat_ctx = ctx.for_stat()
        switch_stat_ctx = ctx.switch_stat()
        break_stat_ctx = ctx.break_stat()
        continue_ctx = ctx.continue_stat()
        return_ctx = ctx.return_stat()
        expr_ctx = ctx.expr_stat()

        if var_decl_stat_ctx is not None:
            return VarDecl(self.visit(var_decl_stat_ctx))
        elif block_stat_ctx is not None:
            return Bl


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
