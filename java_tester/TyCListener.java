// Generated from java_tester/TyC.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TyCParser}.
 */
public interface TyCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TyCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TyCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TyCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#prog_stat_list}.
	 * @param ctx the parse tree
	 */
	void enterProg_stat_list(TyCParser.Prog_stat_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#prog_stat_list}.
	 * @param ctx the parse tree
	 */
	void exitProg_stat_list(TyCParser.Prog_stat_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#prog_stat}.
	 * @param ctx the parse tree
	 */
	void enterProg_stat(TyCParser.Prog_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#prog_stat}.
	 * @param ctx the parse tree
	 */
	void exitProg_stat(TyCParser.Prog_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(TyCParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(TyCParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(TyCParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(TyCParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(TyCParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(TyCParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#param_type}.
	 * @param ctx the parse tree
	 */
	void enterParam_type(TyCParser.Param_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#param_type}.
	 * @param ctx the parse tree
	 */
	void exitParam_type(TyCParser.Param_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(TyCParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(TyCParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#struct_decl}.
	 * @param ctx the parse tree
	 */
	void enterStruct_decl(TyCParser.Struct_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#struct_decl}.
	 * @param ctx the parse tree
	 */
	void exitStruct_decl(TyCParser.Struct_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#stat_list}.
	 * @param ctx the parse tree
	 */
	void enterStat_list(TyCParser.Stat_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#stat_list}.
	 * @param ctx the parse tree
	 */
	void exitStat_list(TyCParser.Stat_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TyCParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TyCParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#var_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_list(TyCParser.Var_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#var_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_list(TyCParser.Var_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#var_decl_stat}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_stat(TyCParser.Var_decl_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#var_decl_stat}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_stat(TyCParser.Var_decl_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#var_decl_expr}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_expr(TyCParser.Var_decl_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#var_decl_expr}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_expr(TyCParser.Var_decl_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(TyCParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(TyCParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#block_stat}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stat(TyCParser.Block_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#block_stat}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stat(TyCParser.Block_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(TyCParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(TyCParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(TyCParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(TyCParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(TyCParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(TyCParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stat(TyCParser.Switch_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stat(TyCParser.Switch_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#break_stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stat(TyCParser.Break_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#break_stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stat(TyCParser.Break_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#continue_stat}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stat(TyCParser.Continue_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#continue_stat}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stat(TyCParser.Continue_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stat(TyCParser.Return_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stat(TyCParser.Return_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#expr_stat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stat(TyCParser.Expr_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#expr_stat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stat(TyCParser.Expr_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TyCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TyCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(TyCParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(TyCParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#bin_expr}.
	 * @param ctx the parse tree
	 */
	void enterBin_expr(TyCParser.Bin_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#bin_expr}.
	 * @param ctx the parse tree
	 */
	void exitBin_expr(TyCParser.Bin_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#bin_term}.
	 * @param ctx the parse tree
	 */
	void enterBin_term(TyCParser.Bin_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#bin_term}.
	 * @param ctx the parse tree
	 */
	void exitBin_term(TyCParser.Bin_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#un_expr}.
	 * @param ctx the parse tree
	 */
	void enterUn_expr(TyCParser.Un_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#un_expr}.
	 * @param ctx the parse tree
	 */
	void exitUn_expr(TyCParser.Un_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#un_term}.
	 * @param ctx the parse tree
	 */
	void enterUn_term(TyCParser.Un_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#un_term}.
	 * @param ctx the parse tree
	 */
	void exitUn_term(TyCParser.Un_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#pre_expr}.
	 * @param ctx the parse tree
	 */
	void enterPre_expr(TyCParser.Pre_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#pre_expr}.
	 * @param ctx the parse tree
	 */
	void exitPre_expr(TyCParser.Pre_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#pre_term}.
	 * @param ctx the parse tree
	 */
	void enterPre_term(TyCParser.Pre_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#pre_term}.
	 * @param ctx the parse tree
	 */
	void exitPre_term(TyCParser.Pre_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#post_expr}.
	 * @param ctx the parse tree
	 */
	void enterPost_expr(TyCParser.Post_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#post_expr}.
	 * @param ctx the parse tree
	 */
	void exitPost_expr(TyCParser.Post_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#post_term}.
	 * @param ctx the parse tree
	 */
	void enterPost_term(TyCParser.Post_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#post_term}.
	 * @param ctx the parse tree
	 */
	void exitPost_term(TyCParser.Post_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr(TyCParser.Func_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr(TyCParser.Func_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#func_term}.
	 * @param ctx the parse tree
	 */
	void enterFunc_term(TyCParser.Func_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#func_term}.
	 * @param ctx the parse tree
	 */
	void exitFunc_term(TyCParser.Func_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#mem_acc_expr}.
	 * @param ctx the parse tree
	 */
	void enterMem_acc_expr(TyCParser.Mem_acc_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#mem_acc_expr}.
	 * @param ctx the parse tree
	 */
	void exitMem_acc_expr(TyCParser.Mem_acc_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#mem_acc_term}.
	 * @param ctx the parse tree
	 */
	void enterMem_acc_term(TyCParser.Mem_acc_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#mem_acc_term}.
	 * @param ctx the parse tree
	 */
	void exitMem_acc_term(TyCParser.Mem_acc_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#inc_expr}.
	 * @param ctx the parse tree
	 */
	void enterInc_expr(TyCParser.Inc_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#inc_expr}.
	 * @param ctx the parse tree
	 */
	void exitInc_expr(TyCParser.Inc_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#dec_expr}.
	 * @param ctx the parse tree
	 */
	void enterDec_expr(TyCParser.Dec_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#dec_expr}.
	 * @param ctx the parse tree
	 */
	void exitDec_expr(TyCParser.Dec_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#case_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr_list(TyCParser.Case_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#case_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr_list(TyCParser.Case_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(TyCParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(TyCParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#default_case_expr}.
	 * @param ctx the parse tree
	 */
	void enterDefault_case_expr(TyCParser.Default_case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#default_case_expr}.
	 * @param ctx the parse tree
	 */
	void exitDefault_case_expr(TyCParser.Default_case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(TyCParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(TyCParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(TyCParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(TyCParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(TyCParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(TyCParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(TyCParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(TyCParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#un_op}.
	 * @param ctx the parse tree
	 */
	void enterUn_op(TyCParser.Un_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#un_op}.
	 * @param ctx the parse tree
	 */
	void exitUn_op(TyCParser.Un_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#pre_op}.
	 * @param ctx the parse tree
	 */
	void enterPre_op(TyCParser.Pre_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#pre_op}.
	 * @param ctx the parse tree
	 */
	void exitPre_op(TyCParser.Pre_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link TyCParser#post_op}.
	 * @param ctx the parse tree
	 */
	void enterPost_op(TyCParser.Post_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TyCParser#post_op}.
	 * @param ctx the parse tree
	 */
	void exitPost_op(TyCParser.Post_opContext ctx);
}