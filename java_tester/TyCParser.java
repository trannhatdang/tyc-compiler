// Generated from java_tester/TyC.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TyCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTO=1, BREAK=2, CASE=3, CONTINUE=4, DEFAULT=5, ELSE=6, FOR=7, IF=8, RETURN=9, 
		STRUCT=10, SWITCH=11, WHILE=12, INT_TYPE=13, FLOAT_TYPE=14, STRING_TYPE=15, 
		VOID_TYPE=16, ADD_OP=17, MIN_OP=18, MULT_OP=19, DIV_OP=20, MOD_OP=21, 
		EQ_OP=22, NEQ_OP=23, LESS_OP=24, GREAT_OP=25, LEQ_OP=26, GEQ_OP=27, OR_OP=28, 
		AND_OP=29, NOT_OP=30, INC_OP=31, DEC_OP=32, ASS_OP=33, MEMACC_OP=34, LROUND_BRACK=35, 
		RROUND_BRACK=36, LSQUARE_BRACK=37, RSQUARE_BRACK=38, LCURLY_BRACK=39, 
		RCURLY_BRACK=40, SEMICOLON=41, COMMA=42, COLON=43, ID=44, INT=45, FLOAT=46, 
		BOOL=47, STRINGLIT=48, NEWLINE=49, WS=50, COMMENT=51, MULTILINE_COMMENT=52, 
		ERROR_CHAR=53, ILLEGAL_ESCAPE=54, UNCLOSE_STRING=55;
	public static final int
		RULE_program = 0, RULE_prog_stat_list = 1, RULE_prog_stat = 2, RULE_func_decl = 3, 
		RULE_param_list = 4, RULE_param = 5, RULE_param_type = 6, RULE_return_type = 7, 
		RULE_struct_decl = 8, RULE_stat_list = 9, RULE_stat = 10, RULE_var_decl_list = 11, 
		RULE_var_decl_stat = 12, RULE_var_decl_expr = 13, RULE_var_type = 14, 
		RULE_block_stat = 15, RULE_if_stat = 16, RULE_while_stat = 17, RULE_for_stat = 18, 
		RULE_switch_stat = 19, RULE_case_expr_list = 20, RULE_case_expr = 21, 
		RULE_default_case_expr = 22, RULE_break_stat = 23, RULE_continue_stat = 24, 
		RULE_return_stat = 25, RULE_expr_stat = 26, RULE_lvalue = 27, RULE_expr = 28, 
		RULE_assign_expr = 29, RULE_term = 30, RULE_inc_expr = 31, RULE_dec_expr = 32, 
		RULE_un_expr = 33, RULE_un_term = 34, RULE_pre_expr = 35, RULE_pre_term = 36, 
		RULE_post_expr = 37, RULE_post_term = 38, RULE_func_expr = 39, RULE_func_term = 40, 
		RULE_mem_acc_expr = 41, RULE_mem_acc_term = 42, RULE_arg_list = 43, RULE_args = 44, 
		RULE_arg = 45, RULE_bin_op = 46, RULE_un_op = 47, RULE_pre_op = 48, RULE_post_op = 49, 
		RULE_string = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "prog_stat_list", "prog_stat", "func_decl", "param_list", 
			"param", "param_type", "return_type", "struct_decl", "stat_list", "stat", 
			"var_decl_list", "var_decl_stat", "var_decl_expr", "var_type", "block_stat", 
			"if_stat", "while_stat", "for_stat", "switch_stat", "case_expr_list", 
			"case_expr", "default_case_expr", "break_stat", "continue_stat", "return_stat", 
			"expr_stat", "lvalue", "expr", "assign_expr", "term", "inc_expr", "dec_expr", 
			"un_expr", "un_term", "pre_expr", "pre_term", "post_expr", "post_term", 
			"func_expr", "func_term", "mem_acc_expr", "mem_acc_term", "arg_list", 
			"args", "arg", "bin_op", "un_op", "pre_op", "post_op", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto'", "'break'", "'case'", "'continue'", "'default'", "'else'", 
			"'for'", "'if'", "'return'", "'struct'", "'switch'", "'while'", "'int'", 
			"'float'", "'string'", "'void'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'||'", "'&&'", "'!'", "'++'", 
			"'--'", "'='", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", 
			"','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AUTO", "BREAK", "CASE", "CONTINUE", "DEFAULT", "ELSE", "FOR", 
			"IF", "RETURN", "STRUCT", "SWITCH", "WHILE", "INT_TYPE", "FLOAT_TYPE", 
			"STRING_TYPE", "VOID_TYPE", "ADD_OP", "MIN_OP", "MULT_OP", "DIV_OP", 
			"MOD_OP", "EQ_OP", "NEQ_OP", "LESS_OP", "GREAT_OP", "LEQ_OP", "GEQ_OP", 
			"OR_OP", "AND_OP", "NOT_OP", "INC_OP", "DEC_OP", "ASS_OP", "MEMACC_OP", 
			"LROUND_BRACK", "RROUND_BRACK", "LSQUARE_BRACK", "RSQUARE_BRACK", "LCURLY_BRACK", 
			"RCURLY_BRACK", "SEMICOLON", "COMMA", "COLON", "ID", "INT", "FLOAT", 
			"BOOL", "STRINGLIT", "NEWLINE", "WS", "COMMENT", "MULTILINE_COMMENT", 
			"ERROR_CHAR", "ILLEGAL_ESCAPE", "UNCLOSE_STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TyC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TyCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Prog_stat_listContext prog_stat_list() {
			return getRuleContext(Prog_stat_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TyCParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			prog_stat_list();
			setState(103);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prog_stat_listContext extends ParserRuleContext {
		public Prog_statContext prog_stat() {
			return getRuleContext(Prog_statContext.class,0);
		}
		public Prog_stat_listContext prog_stat_list() {
			return getRuleContext(Prog_stat_listContext.class,0);
		}
		public Prog_stat_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_stat_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterProg_stat_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitProg_stat_list(this);
		}
	}

	public final Prog_stat_listContext prog_stat_list() throws RecognitionException {
		Prog_stat_listContext _localctx = new Prog_stat_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog_stat_list);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case STRUCT:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				prog_stat();
				setState(106);
				prog_stat_list();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prog_statContext extends ParserRuleContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Struct_declContext struct_decl() {
			return getRuleContext(Struct_declContext.class,0);
		}
		public Prog_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterProg_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitProg_stat(this);
		}
	}

	public final Prog_statContext prog_stat() throws RecognitionException {
		Prog_statContext _localctx = new Prog_statContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog_stat);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				func_decl();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				struct_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_declContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public TerminalNode LROUND_BRACK() { return getToken(TyCParser.LROUND_BRACK, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode RROUND_BRACK() { return getToken(TyCParser.RROUND_BRACK, 0); }
		public TerminalNode LCURLY_BRACK() { return getToken(TyCParser.LCURLY_BRACK, 0); }
		public Stat_listContext stat_list() {
			return getRuleContext(Stat_listContext.class,0);
		}
		public TerminalNode RCURLY_BRACK() { return getToken(TyCParser.RCURLY_BRACK, 0); }
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			return_type();
			setState(116);
			match(ID);
			setState(117);
			match(LROUND_BRACK);
			setState(118);
			param_list();
			setState(119);
			match(RROUND_BRACK);
			setState(120);
			match(LCURLY_BRACK);
			setState(121);
			stat_list();
			setState(122);
			match(RCURLY_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_listContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitParam_list(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param_list);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				param();
				setState(125);
				param_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				param();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public Param_typeContext param_type() {
			return getRuleContext(Param_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			param_type();
			setState(132);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_typeContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitParam_type(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			var_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_typeContext extends ParserRuleContext {
		public Param_typeContext param_type() {
			return getRuleContext(Param_typeContext.class,0);
		}
		public TerminalNode VOID_TYPE() { return getToken(TyCParser.VOID_TYPE, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return_type);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				param_type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(VOID_TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_declContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(TyCParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public TerminalNode LCURLY_BRACK() { return getToken(TyCParser.LCURLY_BRACK, 0); }
		public Var_decl_listContext var_decl_list() {
			return getRuleContext(Var_decl_listContext.class,0);
		}
		public TerminalNode RCURLY_BRACK() { return getToken(TyCParser.RCURLY_BRACK, 0); }
		public TerminalNode SEMICOLON() { return getToken(TyCParser.SEMICOLON, 0); }
		public Struct_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterStruct_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitStruct_decl(this);
		}
	}

	public final Struct_declContext struct_decl() throws RecognitionException {
		Struct_declContext _localctx = new Struct_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_struct_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(STRUCT);
			setState(141);
			match(ID);
			setState(142);
			match(LCURLY_BRACK);
			setState(143);
			var_decl_list();
			setState(144);
			match(RCURLY_BRACK);
			setState(145);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stat_listContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_listContext stat_list() {
			return getRuleContext(Stat_listContext.class,0);
		}
		public Stat_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterStat_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitStat_list(this);
		}
	}

	public final Stat_listContext stat_list() throws RecognitionException {
		Stat_listContext _localctx = new Stat_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat_list);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case BREAK:
			case CONTINUE:
			case FOR:
			case IF:
			case RETURN:
			case SWITCH:
			case WHILE:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case ADD_OP:
			case MIN_OP:
			case NOT_OP:
			case INC_OP:
			case DEC_OP:
			case LCURLY_BRACK:
			case ID:
			case INT:
			case FLOAT:
			case BOOL:
			case STRINGLIT:
			case ILLEGAL_ESCAPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				stat();
				setState(148);
				stat_list();
				}
				break;
			case CASE:
			case DEFAULT:
			case RCURLY_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public Var_decl_statContext var_decl_stat() {
			return getRuleContext(Var_decl_statContext.class,0);
		}
		public Block_statContext block_stat() {
			return getRuleContext(Block_statContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Switch_statContext switch_stat() {
			return getRuleContext(Switch_statContext.class,0);
		}
		public Break_statContext break_stat() {
			return getRuleContext(Break_statContext.class,0);
		}
		public Continue_statContext continue_stat() {
			return getRuleContext(Continue_statContext.class,0);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public Expr_statContext expr_stat() {
			return getRuleContext(Expr_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stat);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				var_decl_stat();
				}
				break;
			case LCURLY_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				block_stat();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				if_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				while_stat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				for_stat();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				switch_stat();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				break_stat();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				continue_stat();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				return_stat();
				}
				break;
			case ADD_OP:
			case MIN_OP:
			case NOT_OP:
			case INC_OP:
			case DEC_OP:
			case ID:
			case INT:
			case FLOAT:
			case BOOL:
			case STRINGLIT:
			case ILLEGAL_ESCAPE:
				enterOuterAlt(_localctx, 10);
				{
				setState(162);
				expr_stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_decl_listContext extends ParserRuleContext {
		public Var_decl_statContext var_decl_stat() {
			return getRuleContext(Var_decl_statContext.class,0);
		}
		public Var_decl_listContext var_decl_list() {
			return getRuleContext(Var_decl_listContext.class,0);
		}
		public Var_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterVar_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitVar_decl_list(this);
		}
	}

	public final Var_decl_listContext var_decl_list() throws RecognitionException {
		Var_decl_listContext _localctx = new Var_decl_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_decl_list);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				var_decl_stat();
				setState(166);
				var_decl_list();
				}
				break;
			case RCURLY_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_decl_statContext extends ParserRuleContext {
		public Var_decl_exprContext var_decl_expr() {
			return getRuleContext(Var_decl_exprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TyCParser.SEMICOLON, 0); }
		public Var_decl_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterVar_decl_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitVar_decl_stat(this);
		}
	}

	public final Var_decl_statContext var_decl_stat() throws RecognitionException {
		Var_decl_statContext _localctx = new Var_decl_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_decl_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			var_decl_expr();
			setState(172);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_decl_exprContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public TerminalNode ASS_OP() { return getToken(TyCParser.ASS_OP, 0); }
		public TerminalNode INT() { return getToken(TyCParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TyCParser.FLOAT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(TyCParser.BOOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_decl_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterVar_decl_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitVar_decl_expr(this);
		}
	}

	public final Var_decl_exprContext var_decl_expr() throws RecognitionException {
		Var_decl_exprContext _localctx = new Var_decl_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_decl_expr);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				var_type();
				setState(175);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				var_type();
				setState(178);
				match(ID);
				setState(179);
				match(ASS_OP);
				setState(184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(180);
					match(INT);
					}
					break;
				case FLOAT:
					{
					setState(181);
					match(FLOAT);
					}
					break;
				case STRINGLIT:
				case ILLEGAL_ESCAPE:
					{
					setState(182);
					string();
					}
					break;
				case BOOL:
					{
					setState(183);
					match(BOOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				var_type();
				setState(187);
				match(ID);
				setState(188);
				match(ASS_OP);
				setState(189);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(TyCParser.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(TyCParser.STRING_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(TyCParser.FLOAT_TYPE, 0); }
		public TerminalNode AUTO() { return getToken(TyCParser.AUTO, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57346L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_statContext extends ParserRuleContext {
		public TerminalNode LCURLY_BRACK() { return getToken(TyCParser.LCURLY_BRACK, 0); }
		public Stat_listContext stat_list() {
			return getRuleContext(Stat_listContext.class,0);
		}
		public TerminalNode RCURLY_BRACK() { return getToken(TyCParser.RCURLY_BRACK, 0); }
		public Block_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterBlock_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitBlock_stat(this);
		}
	}

	public final Block_statContext block_stat() throws RecognitionException {
		Block_statContext _localctx = new Block_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(LCURLY_BRACK);
			setState(196);
			stat_list();
			setState(197);
			match(RCURLY_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TyCParser.IF, 0); }
		public TerminalNode LROUND_BRACK() { return getToken(TyCParser.LROUND_BRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RROUND_BRACK() { return getToken(TyCParser.RROUND_BRACK, 0); }
		public List<TerminalNode> LCURLY_BRACK() { return getTokens(TyCParser.LCURLY_BRACK); }
		public TerminalNode LCURLY_BRACK(int i) {
			return getToken(TyCParser.LCURLY_BRACK, i);
		}
		public List<Stat_listContext> stat_list() {
			return getRuleContexts(Stat_listContext.class);
		}
		public Stat_listContext stat_list(int i) {
			return getRuleContext(Stat_listContext.class,i);
		}
		public List<TerminalNode> RCURLY_BRACK() { return getTokens(TyCParser.RCURLY_BRACK); }
		public TerminalNode RCURLY_BRACK(int i) {
			return getToken(TyCParser.RCURLY_BRACK, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TyCParser.ELSE, 0); }
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitIf_stat(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_stat);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(IF);
				setState(200);
				match(LROUND_BRACK);
				setState(201);
				expr(0);
				setState(202);
				match(RROUND_BRACK);
				setState(203);
				match(LCURLY_BRACK);
				setState(204);
				stat_list();
				setState(205);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(IF);
				setState(208);
				match(LROUND_BRACK);
				setState(209);
				expr(0);
				setState(210);
				match(RROUND_BRACK);
				setState(211);
				stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(IF);
				setState(214);
				match(LROUND_BRACK);
				setState(215);
				expr(0);
				setState(216);
				match(RROUND_BRACK);
				setState(217);
				stat();
				setState(218);
				match(ELSE);
				setState(219);
				stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(IF);
				setState(222);
				match(LROUND_BRACK);
				setState(223);
				expr(0);
				setState(224);
				match(RROUND_BRACK);
				setState(225);
				match(LCURLY_BRACK);
				setState(226);
				stat_list();
				setState(227);
				match(RCURLY_BRACK);
				setState(228);
				match(ELSE);
				setState(229);
				match(LCURLY_BRACK);
				setState(230);
				stat_list();
				setState(231);
				match(RCURLY_BRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TyCParser.WHILE, 0); }
		public TerminalNode LROUND_BRACK() { return getToken(TyCParser.LROUND_BRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RROUND_BRACK() { return getToken(TyCParser.RROUND_BRACK, 0); }
		public TerminalNode LCURLY_BRACK() { return getToken(TyCParser.LCURLY_BRACK, 0); }
		public Stat_listContext stat_list() {
			return getRuleContext(Stat_listContext.class,0);
		}
		public TerminalNode RCURLY_BRACK() { return getToken(TyCParser.RCURLY_BRACK, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitWhile_stat(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_stat);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(WHILE);
				setState(236);
				match(LROUND_BRACK);
				setState(237);
				expr(0);
				setState(238);
				match(RROUND_BRACK);
				setState(239);
				match(LCURLY_BRACK);
				setState(240);
				stat_list();
				setState(241);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(WHILE);
				setState(244);
				match(LROUND_BRACK);
				setState(245);
				expr(0);
				setState(246);
				match(RROUND_BRACK);
				setState(247);
				stat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TyCParser.FOR, 0); }
		public TerminalNode LROUND_BRACK() { return getToken(TyCParser.LROUND_BRACK, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(TyCParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TyCParser.SEMICOLON, i);
		}
		public TerminalNode RROUND_BRACK() { return getToken(TyCParser.RROUND_BRACK, 0); }
		public TerminalNode LCURLY_BRACK() { return getToken(TyCParser.LCURLY_BRACK, 0); }
		public Stat_listContext stat_list() {
			return getRuleContext(Stat_listContext.class,0);
		}
		public TerminalNode RCURLY_BRACK() { return getToken(TyCParser.RCURLY_BRACK, 0); }
		public Var_decl_exprContext var_decl_expr() {
			return getRuleContext(Var_decl_exprContext.class,0);
		}
		public List<Assign_exprContext> assign_expr() {
			return getRuleContexts(Assign_exprContext.class);
		}
		public Assign_exprContext assign_expr(int i) {
			return getRuleContext(Assign_exprContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Inc_exprContext inc_expr() {
			return getRuleContext(Inc_exprContext.class,0);
		}
		public Dec_exprContext dec_expr() {
			return getRuleContext(Dec_exprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitFor_stat(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for_stat);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(FOR);
				setState(252);
				match(LROUND_BRACK);
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AUTO:
				case INT_TYPE:
				case FLOAT_TYPE:
				case STRING_TYPE:
					{
					setState(253);
					var_decl_expr();
					}
					break;
				case ID:
					{
					setState(254);
					assign_expr();
					}
					break;
				case SEMICOLON:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(258);
				match(SEMICOLON);
				setState(261);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD_OP:
				case MIN_OP:
				case NOT_OP:
				case INC_OP:
				case DEC_OP:
				case ID:
				case INT:
				case FLOAT:
				case BOOL:
				case STRINGLIT:
				case ILLEGAL_ESCAPE:
					{
					setState(259);
					expr(0);
					}
					break;
				case SEMICOLON:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(263);
				match(SEMICOLON);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(264);
					assign_expr();
					}
					break;
				case 2:
					{
					setState(265);
					inc_expr();
					}
					break;
				case 3:
					{
					setState(266);
					dec_expr();
					}
					break;
				}
				setState(269);
				match(RROUND_BRACK);
				setState(270);
				match(LCURLY_BRACK);
				setState(271);
				stat_list();
				setState(272);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(FOR);
				setState(275);
				match(LROUND_BRACK);
				setState(279);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AUTO:
				case INT_TYPE:
				case FLOAT_TYPE:
				case STRING_TYPE:
					{
					setState(276);
					var_decl_expr();
					}
					break;
				case ID:
					{
					setState(277);
					assign_expr();
					}
					break;
				case SEMICOLON:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(281);
				match(SEMICOLON);
				setState(284);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD_OP:
				case MIN_OP:
				case NOT_OP:
				case INC_OP:
				case DEC_OP:
				case ID:
				case INT:
				case FLOAT:
				case BOOL:
				case STRINGLIT:
				case ILLEGAL_ESCAPE:
					{
					setState(282);
					expr(0);
					}
					break;
				case SEMICOLON:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(286);
				match(SEMICOLON);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(287);
					assign_expr();
					}
					break;
				case 2:
					{
					setState(288);
					inc_expr();
					}
					break;
				case 3:
					{
					setState(289);
					dec_expr();
					}
					break;
				}
				setState(292);
				match(RROUND_BRACK);
				setState(293);
				stat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_statContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(TyCParser.SWITCH, 0); }
		public TerminalNode LROUND_BRACK() { return getToken(TyCParser.LROUND_BRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RROUND_BRACK() { return getToken(TyCParser.RROUND_BRACK, 0); }
		public TerminalNode LCURLY_BRACK() { return getToken(TyCParser.LCURLY_BRACK, 0); }
		public Case_expr_listContext case_expr_list() {
			return getRuleContext(Case_expr_listContext.class,0);
		}
		public Default_case_exprContext default_case_expr() {
			return getRuleContext(Default_case_exprContext.class,0);
		}
		public TerminalNode RCURLY_BRACK() { return getToken(TyCParser.RCURLY_BRACK, 0); }
		public Switch_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterSwitch_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitSwitch_stat(this);
		}
	}

	public final Switch_statContext switch_stat() throws RecognitionException {
		Switch_statContext _localctx = new Switch_statContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switch_stat);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(SWITCH);
				setState(298);
				match(LROUND_BRACK);
				setState(299);
				expr(0);
				setState(300);
				match(RROUND_BRACK);
				setState(301);
				match(LCURLY_BRACK);
				setState(302);
				case_expr_list();
				setState(303);
				default_case_expr();
				setState(304);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(SWITCH);
				setState(307);
				match(LROUND_BRACK);
				setState(308);
				expr(0);
				setState(309);
				match(RROUND_BRACK);
				setState(310);
				match(LCURLY_BRACK);
				setState(311);
				case_expr_list();
				setState(312);
				match(RCURLY_BRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_expr_listContext extends ParserRuleContext {
		public Case_exprContext case_expr() {
			return getRuleContext(Case_exprContext.class,0);
		}
		public Case_expr_listContext case_expr_list() {
			return getRuleContext(Case_expr_listContext.class,0);
		}
		public Case_expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterCase_expr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitCase_expr_list(this);
		}
	}

	public final Case_expr_listContext case_expr_list() throws RecognitionException {
		Case_expr_listContext _localctx = new Case_expr_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_case_expr_list);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				case_expr();
				setState(317);
				case_expr_list();
				}
				break;
			case DEFAULT:
			case RCURLY_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_exprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(TyCParser.CASE, 0); }
		public TerminalNode LROUND_BRACK() { return getToken(TyCParser.LROUND_BRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RROUND_BRACK() { return getToken(TyCParser.RROUND_BRACK, 0); }
		public TerminalNode COLON() { return getToken(TyCParser.COLON, 0); }
		public Stat_listContext stat_list() {
			return getRuleContext(Stat_listContext.class,0);
		}
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterCase_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitCase_expr(this);
		}
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_case_expr);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(CASE);
				setState(323);
				match(LROUND_BRACK);
				setState(324);
				expr(0);
				setState(325);
				match(RROUND_BRACK);
				setState(326);
				match(COLON);
				setState(327);
				stat_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(CASE);
				setState(330);
				expr(0);
				setState(331);
				match(COLON);
				setState(332);
				stat_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_case_exprContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(TyCParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(TyCParser.COLON, 0); }
		public Stat_listContext stat_list() {
			return getRuleContext(Stat_listContext.class,0);
		}
		public Default_case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_case_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterDefault_case_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitDefault_case_expr(this);
		}
	}

	public final Default_case_exprContext default_case_expr() throws RecognitionException {
		Default_case_exprContext _localctx = new Default_case_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_default_case_expr);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(DEFAULT);
				setState(337);
				match(COLON);
				setState(338);
				stat_list();
				}
				break;
			case RCURLY_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_statContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(TyCParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(TyCParser.SEMICOLON, 0); }
		public Break_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterBreak_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitBreak_stat(this);
		}
	}

	public final Break_statContext break_stat() throws RecognitionException {
		Break_statContext _localctx = new Break_statContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_break_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(BREAK);
			setState(343);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(TyCParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(TyCParser.SEMICOLON, 0); }
		public Continue_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterContinue_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitContinue_stat(this);
		}
	}

	public final Continue_statContext continue_stat() throws RecognitionException {
		Continue_statContext _localctx = new Continue_statContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_continue_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(CONTINUE);
			setState(346);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TyCParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TyCParser.SEMICOLON, 0); }
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterReturn_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitReturn_stat(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return_stat);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(RETURN);
				setState(349);
				expr(0);
				setState(350);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(RETURN);
				setState(353);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_statContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TyCParser.SEMICOLON, 0); }
		public Expr_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterExpr_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitExpr_stat(this);
		}
	}

	public final Expr_statContext expr_stat() throws RecognitionException {
		Expr_statContext _localctx = new Expr_statContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			expr(0);
			setState(357);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public TerminalNode INT() { return getToken(TyCParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TyCParser.FLOAT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(TyCParser.BOOL, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lvalue);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(FLOAT);
				}
				break;
			case STRINGLIT:
			case ILLEGAL_ESCAPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				string();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ADD_OP() { return getToken(TyCParser.ADD_OP, 0); }
		public TerminalNode MIN_OP() { return getToken(TyCParser.MIN_OP, 0); }
		public Un_opContext un_op() {
			return getRuleContext(Un_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Pre_opContext pre_op() {
			return getRuleContext(Pre_opContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Post_opContext post_op() {
			return getRuleContext(Post_opContext.class,0);
		}
		public TerminalNode MEMACC_OP() { return getToken(TyCParser.MEMACC_OP, 0); }
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public TerminalNode LROUND_BRACK() { return getToken(TyCParser.LROUND_BRACK, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RROUND_BRACK() { return getToken(TyCParser.RROUND_BRACK, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(367);
				assign_expr();
				}
				break;
			case 2:
				{
				setState(368);
				term(0);
				setState(369);
				_la = _input.LA(1);
				if ( !(_la==ADD_OP || _la==MIN_OP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(370);
				term(0);
				}
				break;
			case 3:
				{
				setState(372);
				un_op();
				setState(373);
				expr(6);
				}
				break;
			case 4:
				{
				setState(375);
				pre_op();
				setState(376);
				expr(5);
				}
				break;
			case 5:
				{
				setState(378);
				lvalue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(381);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(382);
						post_op();
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(383);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(384);
						match(MEMACC_OP);
						setState(385);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(386);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(387);
						match(LROUND_BRACK);
						setState(388);
						arg_list();
						setState(389);
						match(RROUND_BRACK);
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public TerminalNode ASS_OP() { return getToken(TyCParser.ASS_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(ID);
			setState(397);
			match(ASS_OP);
			setState(398);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public Un_opContext un_op() {
			return getRuleContext(Un_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Pre_opContext pre_op() {
			return getRuleContext(Pre_opContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MULT_OP() { return getToken(TyCParser.MULT_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(TyCParser.DIV_OP, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_OP:
			case MIN_OP:
			case NOT_OP:
				{
				setState(401);
				un_op();
				setState(402);
				expr(0);
				}
				break;
			case INC_OP:
			case DEC_OP:
				{
				setState(404);
				pre_op();
				setState(405);
				expr(0);
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case BOOL:
			case STRINGLIT:
			case ILLEGAL_ESCAPE:
				{
				setState(407);
				lvalue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(410);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(411);
					_la = _input.LA(1);
					if ( !(_la==MULT_OP || _la==DIV_OP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(412);
					term(5);
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inc_exprContext extends ParserRuleContext {
		public TerminalNode INC_OP() { return getToken(TyCParser.INC_OP, 0); }
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public Inc_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterInc_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitInc_expr(this);
		}
	}

	public final Inc_exprContext inc_expr() throws RecognitionException {
		Inc_exprContext _localctx = new Inc_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inc_expr);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(INC_OP);
				setState(419);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(ID);
				setState(421);
				match(INC_OP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_exprContext extends ParserRuleContext {
		public TerminalNode DEC_OP() { return getToken(TyCParser.DEC_OP, 0); }
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public Dec_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterDec_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitDec_expr(this);
		}
	}

	public final Dec_exprContext dec_expr() throws RecognitionException {
		Dec_exprContext _localctx = new Dec_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dec_expr);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(DEC_OP);
				setState(425);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(ID);
				setState(427);
				match(DEC_OP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Un_exprContext extends ParserRuleContext {
		public Un_opContext un_op() {
			return getRuleContext(Un_opContext.class,0);
		}
		public Un_termContext un_term() {
			return getRuleContext(Un_termContext.class,0);
		}
		public Un_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_un_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterUn_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitUn_expr(this);
		}
	}

	public final Un_exprContext un_expr() throws RecognitionException {
		Un_exprContext _localctx = new Un_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_un_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			un_op();
			setState(431);
			un_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Un_termContext extends ParserRuleContext {
		public Un_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_un_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterUn_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitUn_term(this);
		}
	}

	public final Un_termContext un_term() throws RecognitionException {
		Un_termContext _localctx = new Un_termContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_un_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pre_exprContext extends ParserRuleContext {
		public Pre_opContext pre_op() {
			return getRuleContext(Pre_opContext.class,0);
		}
		public Pre_termContext pre_term() {
			return getRuleContext(Pre_termContext.class,0);
		}
		public Pre_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterPre_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitPre_expr(this);
		}
	}

	public final Pre_exprContext pre_expr() throws RecognitionException {
		Pre_exprContext _localctx = new Pre_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pre_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			pre_op();
			setState(436);
			pre_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pre_termContext extends ParserRuleContext {
		public Pre_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterPre_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitPre_term(this);
		}
	}

	public final Pre_termContext pre_term() throws RecognitionException {
		Pre_termContext _localctx = new Pre_termContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pre_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Post_exprContext extends ParserRuleContext {
		public Post_termContext post_term() {
			return getRuleContext(Post_termContext.class,0);
		}
		public Post_opContext post_op() {
			return getRuleContext(Post_opContext.class,0);
		}
		public Post_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterPost_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitPost_expr(this);
		}
	}

	public final Post_exprContext post_expr() throws RecognitionException {
		Post_exprContext _localctx = new Post_exprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_post_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			post_term();
			setState(441);
			post_op();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Post_termContext extends ParserRuleContext {
		public Post_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterPost_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitPost_term(this);
		}
	}

	public final Post_termContext post_term() throws RecognitionException {
		Post_termContext _localctx = new Post_termContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_post_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_exprContext extends ParserRuleContext {
		public Func_termContext func_term() {
			return getRuleContext(Func_termContext.class,0);
		}
		public TerminalNode LROUND_BRACK() { return getToken(TyCParser.LROUND_BRACK, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RROUND_BRACK() { return getToken(TyCParser.RROUND_BRACK, 0); }
		public Func_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterFunc_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitFunc_expr(this);
		}
	}

	public final Func_exprContext func_expr() throws RecognitionException {
		Func_exprContext _localctx = new Func_exprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_func_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			func_term();
			setState(446);
			match(LROUND_BRACK);
			setState(447);
			arg_list();
			setState(448);
			match(RROUND_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_termContext extends ParserRuleContext {
		public Func_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterFunc_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitFunc_term(this);
		}
	}

	public final Func_termContext func_term() throws RecognitionException {
		Func_termContext _localctx = new Func_termContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_func_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mem_acc_exprContext extends ParserRuleContext {
		public Mem_acc_termContext mem_acc_term() {
			return getRuleContext(Mem_acc_termContext.class,0);
		}
		public TerminalNode MEMACC_OP() { return getToken(TyCParser.MEMACC_OP, 0); }
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public Mem_acc_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mem_acc_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterMem_acc_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitMem_acc_expr(this);
		}
	}

	public final Mem_acc_exprContext mem_acc_expr() throws RecognitionException {
		Mem_acc_exprContext _localctx = new Mem_acc_exprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mem_acc_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			mem_acc_term();
			setState(453);
			match(MEMACC_OP);
			setState(454);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mem_acc_termContext extends ParserRuleContext {
		public Mem_acc_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mem_acc_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterMem_acc_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitMem_acc_term(this);
		}
	}

	public final Mem_acc_termContext mem_acc_term() throws RecognitionException {
		Mem_acc_termContext _localctx = new Mem_acc_termContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mem_acc_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_listContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TyCParser.COMMA, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arg_list);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				arg();
				setState(459);
				match(COMMA);
				setState(460);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				arg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TyCParser.COMMA, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_args);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				arg();
				setState(467);
				match(COMMA);
				setState(468);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				arg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public TerminalNode INT() { return getToken(TyCParser.INT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(TyCParser.FLOAT, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arg);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(INT);
				}
				break;
			case STRINGLIT:
			case ILLEGAL_ESCAPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				string();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(TyCParser.ADD_OP, 0); }
		public TerminalNode MIN_OP() { return getToken(TyCParser.MIN_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(TyCParser.EQ_OP, 0); }
		public TerminalNode NEQ_OP() { return getToken(TyCParser.NEQ_OP, 0); }
		public TerminalNode LESS_OP() { return getToken(TyCParser.LESS_OP, 0); }
		public TerminalNode GREAT_OP() { return getToken(TyCParser.GREAT_OP, 0); }
		public TerminalNode LEQ_OP() { return getToken(TyCParser.LEQ_OP, 0); }
		public TerminalNode GEQ_OP() { return getToken(TyCParser.GEQ_OP, 0); }
		public TerminalNode OR_OP() { return getToken(TyCParser.OR_OP, 0); }
		public TerminalNode AND_OP() { return getToken(TyCParser.AND_OP, 0); }
		public TerminalNode MULT_OP() { return getToken(TyCParser.MULT_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(TyCParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(TyCParser.MOD_OP, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073610752L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Un_opContext extends ParserRuleContext {
		public TerminalNode NOT_OP() { return getToken(TyCParser.NOT_OP, 0); }
		public TerminalNode MIN_OP() { return getToken(TyCParser.MIN_OP, 0); }
		public TerminalNode ADD_OP() { return getToken(TyCParser.ADD_OP, 0); }
		public Un_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_un_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterUn_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitUn_op(this);
		}
	}

	public final Un_opContext un_op() throws RecognitionException {
		Un_opContext _localctx = new Un_opContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_un_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1074135040L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pre_opContext extends ParserRuleContext {
		public TerminalNode INC_OP() { return getToken(TyCParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(TyCParser.DEC_OP, 0); }
		public Pre_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterPre_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitPre_op(this);
		}
	}

	public final Pre_opContext pre_op() throws RecognitionException {
		Pre_opContext _localctx = new Pre_opContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pre_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_la = _input.LA(1);
			if ( !(_la==INC_OP || _la==DEC_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Post_opContext extends ParserRuleContext {
		public TerminalNode INC_OP() { return getToken(TyCParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(TyCParser.DEC_OP, 0); }
		public Post_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterPost_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitPost_op(this);
		}
	}

	public final Post_opContext post_op() throws RecognitionException {
		Post_opContext _localctx = new Post_opContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_post_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !(_la==INC_OP || _la==DEC_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRINGLIT() { return getToken(TyCParser.STRINGLIT, 0); }
		public TerminalNode ILLEGAL_ESCAPE() { return getToken(TyCParser.ILLEGAL_ESCAPE, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TyCListener ) ((TyCListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if ( !(_la==STRINGLIT || _la==ILLEGAL_ESCAPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 30:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u01ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001n\b\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002r\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0082\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u008b\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0098\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00a4\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00aa\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b9\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c0\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ea\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00fa\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0101\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0106\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u010c\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0118\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u011d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0123\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0128"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u013b\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0141\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u014f\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0155\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0163\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u016d\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u017c"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0188"+
		"\b\u001c\n\u001c\f\u001c\u018b\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0199\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u019e\b\u001e\n\u001e\f\u001e\u01a1"+
		"\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01a7"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01ad\b \u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001("+
		"\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0003+\u01d1\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u01d8\b,\u0001-\u0001-\u0001-\u0001-\u0003-\u01de\b-\u0001.\u0001.\u0001"+
		"/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u00012\u0000\u0002"+
		"8<3\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0007\u0002"+
		"\u0000\u0001\u0001\r\u000f\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0014"+
		"\u0001\u0000\u0011\u001d\u0002\u0000\u0011\u0012\u001e\u001e\u0001\u0000"+
		"\u001f \u0002\u00000066\u01f5\u0000f\u0001\u0000\u0000\u0000\u0002m\u0001"+
		"\u0000\u0000\u0000\u0004q\u0001\u0000\u0000\u0000\u0006s\u0001\u0000\u0000"+
		"\u0000\b\u0081\u0001\u0000\u0000\u0000\n\u0083\u0001\u0000\u0000\u0000"+
		"\f\u0086\u0001\u0000\u0000\u0000\u000e\u008a\u0001\u0000\u0000\u0000\u0010"+
		"\u008c\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000\u0014"+
		"\u00a3\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000\u0000\u0018"+
		"\u00ab\u0001\u0000\u0000\u0000\u001a\u00bf\u0001\u0000\u0000\u0000\u001c"+
		"\u00c1\u0001\u0000\u0000\u0000\u001e\u00c3\u0001\u0000\u0000\u0000 \u00e9"+
		"\u0001\u0000\u0000\u0000\"\u00f9\u0001\u0000\u0000\u0000$\u0127\u0001"+
		"\u0000\u0000\u0000&\u013a\u0001\u0000\u0000\u0000(\u0140\u0001\u0000\u0000"+
		"\u0000*\u014e\u0001\u0000\u0000\u0000,\u0154\u0001\u0000\u0000\u0000."+
		"\u0156\u0001\u0000\u0000\u00000\u0159\u0001\u0000\u0000\u00002\u0162\u0001"+
		"\u0000\u0000\u00004\u0164\u0001\u0000\u0000\u00006\u016c\u0001\u0000\u0000"+
		"\u00008\u017b\u0001\u0000\u0000\u0000:\u018c\u0001\u0000\u0000\u0000<"+
		"\u0198\u0001\u0000\u0000\u0000>\u01a6\u0001\u0000\u0000\u0000@\u01ac\u0001"+
		"\u0000\u0000\u0000B\u01ae\u0001\u0000\u0000\u0000D\u01b1\u0001\u0000\u0000"+
		"\u0000F\u01b3\u0001\u0000\u0000\u0000H\u01b6\u0001\u0000\u0000\u0000J"+
		"\u01b8\u0001\u0000\u0000\u0000L\u01bb\u0001\u0000\u0000\u0000N\u01bd\u0001"+
		"\u0000\u0000\u0000P\u01c2\u0001\u0000\u0000\u0000R\u01c4\u0001\u0000\u0000"+
		"\u0000T\u01c8\u0001\u0000\u0000\u0000V\u01d0\u0001\u0000\u0000\u0000X"+
		"\u01d7\u0001\u0000\u0000\u0000Z\u01dd\u0001\u0000\u0000\u0000\\\u01df"+
		"\u0001\u0000\u0000\u0000^\u01e1\u0001\u0000\u0000\u0000`\u01e3\u0001\u0000"+
		"\u0000\u0000b\u01e5\u0001\u0000\u0000\u0000d\u01e7\u0001\u0000\u0000\u0000"+
		"fg\u0003\u0002\u0001\u0000gh\u0005\u0000\u0000\u0001h\u0001\u0001\u0000"+
		"\u0000\u0000ij\u0003\u0004\u0002\u0000jk\u0003\u0002\u0001\u0000kn\u0001"+
		"\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000n\u0003\u0001\u0000\u0000\u0000or\u0003\u0006"+
		"\u0003\u0000pr\u0003\u0010\b\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000"+
		"\u0000\u0000r\u0005\u0001\u0000\u0000\u0000st\u0003\u000e\u0007\u0000"+
		"tu\u0005,\u0000\u0000uv\u0005#\u0000\u0000vw\u0003\b\u0004\u0000wx\u0005"+
		"$\u0000\u0000xy\u0005\'\u0000\u0000yz\u0003\u0012\t\u0000z{\u0005(\u0000"+
		"\u0000{\u0007\u0001\u0000\u0000\u0000|}\u0003\n\u0005\u0000}~\u0003\b"+
		"\u0004\u0000~\u0082\u0001\u0000\u0000\u0000\u007f\u0082\u0003\n\u0005"+
		"\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\t\u0001\u0000\u0000\u0000\u0083\u0084\u0003\f\u0006\u0000\u0084"+
		"\u0085\u0005,\u0000\u0000\u0085\u000b\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0003\u001c\u000e\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088\u008b\u0003"+
		"\f\u0006\u0000\u0089\u008b\u0005\u0010\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u000f\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\n\u0000\u0000\u008d\u008e\u0005,\u0000"+
		"\u0000\u008e\u008f\u0005\'\u0000\u0000\u008f\u0090\u0003\u0016\u000b\u0000"+
		"\u0090\u0091\u0005(\u0000\u0000\u0091\u0092\u0005)\u0000\u0000\u0092\u0011"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0003\u0014\n\u0000\u0094\u0095\u0003"+
		"\u0012\t\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000"+
		"\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0013\u0001\u0000\u0000\u0000\u0099\u00a4\u0003\u0018"+
		"\f\u0000\u009a\u00a4\u0003\u001e\u000f\u0000\u009b\u00a4\u0003 \u0010"+
		"\u0000\u009c\u00a4\u0003\"\u0011\u0000\u009d\u00a4\u0003$\u0012\u0000"+
		"\u009e\u00a4\u0003&\u0013\u0000\u009f\u00a4\u0003.\u0017\u0000\u00a0\u00a4"+
		"\u00030\u0018\u0000\u00a1\u00a4\u00032\u0019\u0000\u00a2\u00a4\u00034"+
		"\u001a\u0000\u00a3\u0099\u0001\u0000\u0000\u0000\u00a3\u009a\u0001\u0000"+
		"\u0000\u0000\u00a3\u009b\u0001\u0000\u0000\u0000\u00a3\u009c\u0001\u0000"+
		"\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000\u00a3\u009e\u0001\u0000"+
		"\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\u0018"+
		"\f\u0000\u00a6\u00a7\u0003\u0016\u000b\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u0017\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0003\u001a\r\u0000\u00ac\u00ad\u0005)\u0000\u0000"+
		"\u00ad\u0019\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u001c\u000e\u0000"+
		"\u00af\u00b0\u0005,\u0000\u0000\u00b0\u00c0\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0003\u001c\u000e\u0000\u00b2\u00b3\u0005,\u0000\u0000\u00b3\u00b8"+
		"\u0005!\u0000\u0000\u00b4\u00b9\u0005-\u0000\u0000\u00b5\u00b9\u0005."+
		"\u0000\u0000\u00b6\u00b9\u0003d2\u0000\u00b7\u00b9\u0005/\u0000\u0000"+
		"\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00c0\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\u001c\u000e\u0000"+
		"\u00bb\u00bc\u0005,\u0000\u0000\u00bc\u00bd\u0005!\u0000\u0000\u00bd\u00be"+
		"\u00038\u001c\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00ae\u0001"+
		"\u0000\u0000\u0000\u00bf\u00b1\u0001\u0000\u0000\u0000\u00bf\u00ba\u0001"+
		"\u0000\u0000\u0000\u00c0\u001b\u0001\u0000\u0000\u0000\u00c1\u00c2\u0007"+
		"\u0000\u0000\u0000\u00c2\u001d\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"\'\u0000\u0000\u00c4\u00c5\u0003\u0012\t\u0000\u00c5\u00c6\u0005(\u0000"+
		"\u0000\u00c6\u001f\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\b\u0000\u0000"+
		"\u00c8\u00c9\u0005#\u0000\u0000\u00c9\u00ca\u00038\u001c\u0000\u00ca\u00cb"+
		"\u0005$\u0000\u0000\u00cb\u00cc\u0005\'\u0000\u0000\u00cc\u00cd\u0003"+
		"\u0012\t\u0000\u00cd\u00ce\u0005(\u0000\u0000\u00ce\u00ea\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005\b\u0000\u0000\u00d0\u00d1\u0005#\u0000"+
		"\u0000\u00d1\u00d2\u00038\u001c\u0000\u00d2\u00d3\u0005$\u0000\u0000\u00d3"+
		"\u00d4\u0003\u0014\n\u0000\u00d4\u00ea\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\b\u0000\u0000\u00d6\u00d7\u0005#\u0000\u0000\u00d7\u00d8\u0003"+
		"8\u001c\u0000\u00d8\u00d9\u0005$\u0000\u0000\u00d9\u00da\u0003\u0014\n"+
		"\u0000\u00da\u00db\u0005\u0006\u0000\u0000\u00db\u00dc\u0003\u0014\n\u0000"+
		"\u00dc\u00ea\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\b\u0000\u0000\u00de"+
		"\u00df\u0005#\u0000\u0000\u00df\u00e0\u00038\u001c\u0000\u00e0\u00e1\u0005"+
		"$\u0000\u0000\u00e1\u00e2\u0005\'\u0000\u0000\u00e2\u00e3\u0003\u0012"+
		"\t\u0000\u00e3\u00e4\u0005(\u0000\u0000\u00e4\u00e5\u0005\u0006\u0000"+
		"\u0000\u00e5\u00e6\u0005\'\u0000\u0000\u00e6\u00e7\u0003\u0012\t\u0000"+
		"\u00e7\u00e8\u0005(\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00e9\u00cf\u0001\u0000\u0000\u0000\u00e9"+
		"\u00d5\u0001\u0000\u0000\u0000\u00e9\u00dd\u0001\u0000\u0000\u0000\u00ea"+
		"!\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\f\u0000\u0000\u00ec\u00ed"+
		"\u0005#\u0000\u0000\u00ed\u00ee\u00038\u001c\u0000\u00ee\u00ef\u0005$"+
		"\u0000\u0000\u00ef\u00f0\u0005\'\u0000\u0000\u00f0\u00f1\u0003\u0012\t"+
		"\u0000\u00f1\u00f2\u0005(\u0000\u0000\u00f2\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005\f\u0000\u0000\u00f4\u00f5\u0005#\u0000\u0000\u00f5"+
		"\u00f6\u00038\u001c\u0000\u00f6\u00f7\u0005$\u0000\u0000\u00f7\u00f8\u0003"+
		"\u0014\n\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f3\u0001\u0000\u0000\u0000\u00fa#\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005\u0007\u0000\u0000\u00fc\u0100\u0005#\u0000\u0000"+
		"\u00fd\u0101\u0003\u001a\r\u0000\u00fe\u0101\u0003:\u001d\u0000\u00ff"+
		"\u0101\u0001\u0000\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0105\u0005)\u0000\u0000\u0103\u0106"+
		"\u00038\u001c\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001"+
		"\u0000\u0000\u0000\u0107\u010b\u0005)\u0000\u0000\u0108\u010c\u0003:\u001d"+
		"\u0000\u0109\u010c\u0003>\u001f\u0000\u010a\u010c\u0003@ \u0000\u010b"+
		"\u0108\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0005$\u0000\u0000\u010e\u010f\u0005\'\u0000\u0000\u010f\u0110"+
		"\u0003\u0012\t\u0000\u0110\u0111\u0005(\u0000\u0000\u0111\u0128\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005\u0007\u0000\u0000\u0113\u0117\u0005"+
		"#\u0000\u0000\u0114\u0118\u0003\u001a\r\u0000\u0115\u0118\u0003:\u001d"+
		"\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0114\u0001\u0000\u0000"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011c\u0005)\u0000\u0000"+
		"\u011a\u011d\u00038\u001c\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u0122\u0005)\u0000\u0000\u011f\u0123"+
		"\u0003:\u001d\u0000\u0120\u0123\u0003>\u001f\u0000\u0121\u0123\u0003@"+
		" \u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005$\u0000\u0000\u0125\u0126\u0003\u0014\n\u0000"+
		"\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u00fb\u0001\u0000\u0000\u0000"+
		"\u0127\u0112\u0001\u0000\u0000\u0000\u0128%\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005\u000b\u0000\u0000\u012a\u012b\u0005#\u0000\u0000\u012b\u012c"+
		"\u00038\u001c\u0000\u012c\u012d\u0005$\u0000\u0000\u012d\u012e\u0005\'"+
		"\u0000\u0000\u012e\u012f\u0003(\u0014\u0000\u012f\u0130\u0003,\u0016\u0000"+
		"\u0130\u0131\u0005(\u0000\u0000\u0131\u013b\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0005\u000b\u0000\u0000\u0133\u0134\u0005#\u0000\u0000\u0134\u0135"+
		"\u00038\u001c\u0000\u0135\u0136\u0005$\u0000\u0000\u0136\u0137\u0005\'"+
		"\u0000\u0000\u0137\u0138\u0003(\u0014\u0000\u0138\u0139\u0005(\u0000\u0000"+
		"\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0129\u0001\u0000\u0000\u0000"+
		"\u013a\u0132\u0001\u0000\u0000\u0000\u013b\'\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0003*\u0015\u0000\u013d\u013e\u0003(\u0014\u0000\u013e\u0141\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u013c\u0001"+
		"\u0000\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141)\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0005\u0003\u0000\u0000\u0143\u0144\u0005#\u0000"+
		"\u0000\u0144\u0145\u00038\u001c\u0000\u0145\u0146\u0005$\u0000\u0000\u0146"+
		"\u0147\u0005+\u0000\u0000\u0147\u0148\u0003\u0012\t\u0000\u0148\u014f"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0003\u0000\u0000\u014a\u014b"+
		"\u00038\u001c\u0000\u014b\u014c\u0005+\u0000\u0000\u014c\u014d\u0003\u0012"+
		"\t\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0142\u0001\u0000\u0000"+
		"\u0000\u014e\u0149\u0001\u0000\u0000\u0000\u014f+\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0005\u0005\u0000\u0000\u0151\u0152\u0005+\u0000\u0000\u0152"+
		"\u0155\u0003\u0012\t\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0150"+
		"\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155-\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0005\u0002\u0000\u0000\u0157\u0158\u0005"+
		")\u0000\u0000\u0158/\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0004\u0000"+
		"\u0000\u015a\u015b\u0005)\u0000\u0000\u015b1\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0005\t\u0000\u0000\u015d\u015e\u00038\u001c\u0000\u015e\u015f"+
		"\u0005)\u0000\u0000\u015f\u0163\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		"\t\u0000\u0000\u0161\u0163\u0005)\u0000\u0000\u0162\u015c\u0001\u0000"+
		"\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u01633\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u00038\u001c\u0000\u0165\u0166\u0005)\u0000\u0000\u0166"+
		"5\u0001\u0000\u0000\u0000\u0167\u016d\u0005,\u0000\u0000\u0168\u016d\u0005"+
		"-\u0000\u0000\u0169\u016d\u0005.\u0000\u0000\u016a\u016d\u0003d2\u0000"+
		"\u016b\u016d\u0005/\u0000\u0000\u016c\u0167\u0001\u0000\u0000\u0000\u016c"+
		"\u0168\u0001\u0000\u0000\u0000\u016c\u0169\u0001\u0000\u0000\u0000\u016c"+
		"\u016a\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d"+
		"7\u0001\u0000\u0000\u0000\u016e\u016f\u0006\u001c\uffff\uffff\u0000\u016f"+
		"\u017c\u0003:\u001d\u0000\u0170\u0171\u0003<\u001e\u0000\u0171\u0172\u0007"+
		"\u0001\u0000\u0000\u0172\u0173\u0003<\u001e\u0000\u0173\u017c\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0003^/\u0000\u0175\u0176\u00038\u001c\u0006"+
		"\u0176\u017c\u0001\u0000\u0000\u0000\u0177\u0178\u0003`0\u0000\u0178\u0179"+
		"\u00038\u001c\u0005\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u017c\u0003"+
		"6\u001b\u0000\u017b\u016e\u0001\u0000\u0000\u0000\u017b\u0170\u0001\u0000"+
		"\u0000\u0000\u017b\u0174\u0001\u0000\u0000\u0000\u017b\u0177\u0001\u0000"+
		"\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c\u0189\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\n\u0004\u0000\u0000\u017e\u0188\u0003b1\u0000"+
		"\u017f\u0180\n\u0003\u0000\u0000\u0180\u0181\u0005\"\u0000\u0000\u0181"+
		"\u0188\u0005,\u0000\u0000\u0182\u0183\n\u0002\u0000\u0000\u0183\u0184"+
		"\u0005#\u0000\u0000\u0184\u0185\u0003V+\u0000\u0185\u0186\u0005$\u0000"+
		"\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u017d\u0001\u0000\u0000"+
		"\u0000\u0187\u017f\u0001\u0000\u0000\u0000\u0187\u0182\u0001\u0000\u0000"+
		"\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a9\u0001\u0000\u0000\u0000"+
		"\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018d\u0005,\u0000\u0000\u018d"+
		"\u018e\u0005!\u0000\u0000\u018e\u018f\u00038\u001c\u0000\u018f;\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0006\u001e\uffff\uffff\u0000\u0191\u0192"+
		"\u0003^/\u0000\u0192\u0193\u00038\u001c\u0000\u0193\u0199\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0003`0\u0000\u0195\u0196\u00038\u001c\u0000"+
		"\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0199\u00036\u001b\u0000\u0198"+
		"\u0190\u0001\u0000\u0000\u0000\u0198\u0194\u0001\u0000\u0000\u0000\u0198"+
		"\u0197\u0001\u0000\u0000\u0000\u0199\u019f\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\n\u0004\u0000\u0000\u019b\u019c\u0007\u0002\u0000\u0000\u019c\u019e"+
		"\u0003<\u001e\u0005\u019d\u019a\u0001\u0000\u0000\u0000\u019e\u01a1\u0001"+
		"\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0=\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0005\u001f\u0000\u0000\u01a3\u01a7\u0005,\u0000"+
		"\u0000\u01a4\u01a5\u0005,\u0000\u0000\u01a5\u01a7\u0005\u001f\u0000\u0000"+
		"\u01a6\u01a2\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a7?\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005 \u0000\u0000\u01a9\u01ad"+
		"\u0005,\u0000\u0000\u01aa\u01ab\u0005,\u0000\u0000\u01ab\u01ad\u0005 "+
		"\u0000\u0000\u01ac\u01a8\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000"+
		"\u0000\u0000\u01adA\u0001\u0000\u0000\u0000\u01ae\u01af\u0003^/\u0000"+
		"\u01af\u01b0\u0003D\"\u0000\u01b0C\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2E\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003"+
		"`0\u0000\u01b4\u01b5\u0003H$\u0000\u01b5G\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7I\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0003L&\u0000\u01b9\u01ba\u0003b1\u0000\u01baK\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bcM\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0003P(\u0000\u01be\u01bf\u0005#\u0000\u0000\u01bf\u01c0\u0003"+
		"V+\u0000\u01c0\u01c1\u0005$\u0000\u0000\u01c1O\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3Q\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0003T*\u0000\u01c5\u01c6\u0005\"\u0000\u0000\u01c6\u01c7\u0005"+
		",\u0000\u0000\u01c7S\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9U\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003Z-\u0000\u01cb"+
		"\u01cc\u0005*\u0000\u0000\u01cc\u01cd\u0003X,\u0000\u01cd\u01d1\u0001"+
		"\u0000\u0000\u0000\u01ce\u01d1\u0003Z-\u0000\u01cf\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d0\u01ca\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1W\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0003Z-\u0000\u01d3\u01d4\u0005*\u0000\u0000\u01d4\u01d5"+
		"\u0003X,\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d8\u0003Z"+
		"-\u0000\u01d7\u01d2\u0001\u0000\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d8Y\u0001\u0000\u0000\u0000\u01d9\u01de\u0005,\u0000\u0000\u01da"+
		"\u01de\u0005-\u0000\u0000\u01db\u01de\u0003d2\u0000\u01dc\u01de\u0005"+
		".\u0000\u0000\u01dd\u01d9\u0001\u0000\u0000\u0000\u01dd\u01da\u0001\u0000"+
		"\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01dc\u0001\u0000"+
		"\u0000\u0000\u01de[\u0001\u0000\u0000\u0000\u01df\u01e0\u0007\u0003\u0000"+
		"\u0000\u01e0]\u0001\u0000\u0000\u0000\u01e1\u01e2\u0007\u0004\u0000\u0000"+
		"\u01e2_\u0001\u0000\u0000\u0000\u01e3\u01e4\u0007\u0005\u0000\u0000\u01e4"+
		"a\u0001\u0000\u0000\u0000\u01e5\u01e6\u0007\u0005\u0000\u0000\u01e6c\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0007\u0006\u0000\u0000\u01e8e\u0001\u0000"+
		"\u0000\u0000\"mq\u0081\u008a\u0097\u00a3\u00a9\u00b8\u00bf\u00e9\u00f9"+
		"\u0100\u0105\u010b\u0117\u011c\u0122\u0127\u013a\u0140\u014e\u0154\u0162"+
		"\u016c\u017b\u0187\u0189\u0198\u019f\u01a6\u01ac\u01d0\u01d7\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}