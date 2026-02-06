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
		BOOL=47, STRING=48, NEWLINE=49, WS=50, COMMENT=51, MULTILINE_COMMENT=52, 
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
		RULE_assign_expr = 29, RULE_inc_expr = 30, RULE_dec_expr = 31, RULE_un_expr = 32, 
		RULE_un_term = 33, RULE_pre_expr = 34, RULE_pre_term = 35, RULE_post_expr = 36, 
		RULE_post_term = 37, RULE_func_expr = 38, RULE_func_term = 39, RULE_mem_acc_expr = 40, 
		RULE_mem_acc_term = 41, RULE_arg_list = 42, RULE_args = 43, RULE_arg = 44, 
		RULE_bin_op = 45, RULE_un_op = 46, RULE_pre_op = 47, RULE_post_op = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "prog_stat_list", "prog_stat", "func_decl", "param_list", 
			"param", "param_type", "return_type", "struct_decl", "stat_list", "stat", 
			"var_decl_list", "var_decl_stat", "var_decl_expr", "var_type", "block_stat", 
			"if_stat", "while_stat", "for_stat", "switch_stat", "case_expr_list", 
			"case_expr", "default_case_expr", "break_stat", "continue_stat", "return_stat", 
			"expr_stat", "lvalue", "expr", "assign_expr", "inc_expr", "dec_expr", 
			"un_expr", "un_term", "pre_expr", "pre_term", "post_expr", "post_term", 
			"func_expr", "func_term", "mem_acc_expr", "mem_acc_term", "arg_list", 
			"args", "arg", "bin_op", "un_op", "pre_op", "post_op"
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
			"BOOL", "STRING", "NEWLINE", "WS", "COMMENT", "MULTILINE_COMMENT", "ERROR_CHAR", 
			"ILLEGAL_ESCAPE", "UNCLOSE_STRING"
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
			setState(98);
			prog_stat_list();
			setState(99);
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
			setState(105);
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
				setState(101);
				prog_stat();
				setState(102);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				func_decl();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
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
			setState(111);
			return_type();
			setState(112);
			match(ID);
			setState(113);
			match(LROUND_BRACK);
			setState(114);
			param_list();
			setState(115);
			match(RROUND_BRACK);
			setState(116);
			match(LCURLY_BRACK);
			setState(117);
			stat_list();
			setState(118);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				param();
				setState(121);
				param_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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
			setState(127);
			param_type();
			setState(128);
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
			setState(130);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				param_type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
			setState(136);
			match(STRUCT);
			setState(137);
			match(ID);
			setState(138);
			match(LCURLY_BRACK);
			setState(139);
			var_decl_list();
			setState(140);
			match(RCURLY_BRACK);
			setState(141);
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
			setState(147);
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
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				stat();
				setState(144);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				var_decl_stat();
				}
				break;
			case LCURLY_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				block_stat();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				if_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				while_stat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				for_stat();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				switch_stat();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				break_stat();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				continue_stat();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(157);
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
			case STRING:
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				var_decl_stat();
				setState(162);
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
			setState(167);
			var_decl_expr();
			setState(168);
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
		public TerminalNode STRING() { return getToken(TyCParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(TyCParser.BOOL, 0); }
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
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				var_type();
				setState(171);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				var_type();
				setState(174);
				match(ID);
				setState(175);
				match(ASS_OP);
				setState(176);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 527765581332480L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
			setState(180);
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
			setState(182);
			match(LCURLY_BRACK);
			setState(183);
			stat_list();
			setState(184);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(IF);
				setState(187);
				match(LROUND_BRACK);
				setState(188);
				expr(0);
				setState(189);
				match(RROUND_BRACK);
				setState(190);
				match(LCURLY_BRACK);
				setState(191);
				stat_list();
				setState(192);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(IF);
				setState(195);
				match(LROUND_BRACK);
				setState(196);
				expr(0);
				setState(197);
				match(RROUND_BRACK);
				setState(198);
				stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(IF);
				setState(201);
				match(LROUND_BRACK);
				setState(202);
				expr(0);
				setState(203);
				match(RROUND_BRACK);
				setState(204);
				stat();
				setState(205);
				match(ELSE);
				setState(206);
				stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(IF);
				setState(209);
				match(LROUND_BRACK);
				setState(210);
				expr(0);
				setState(211);
				match(RROUND_BRACK);
				setState(212);
				match(LCURLY_BRACK);
				setState(213);
				stat_list();
				setState(214);
				match(RCURLY_BRACK);
				setState(215);
				match(ELSE);
				setState(216);
				match(LCURLY_BRACK);
				setState(217);
				stat_list();
				setState(218);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(WHILE);
				setState(223);
				match(LROUND_BRACK);
				setState(224);
				expr(0);
				setState(225);
				match(RROUND_BRACK);
				setState(226);
				match(LCURLY_BRACK);
				setState(227);
				stat_list();
				setState(228);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(WHILE);
				setState(231);
				match(LROUND_BRACK);
				setState(232);
				expr(0);
				setState(233);
				match(RROUND_BRACK);
				setState(234);
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
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(FOR);
				setState(239);
				match(LROUND_BRACK);
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AUTO:
				case INT_TYPE:
				case FLOAT_TYPE:
				case STRING_TYPE:
					{
					setState(240);
					var_decl_expr();
					}
					break;
				case ID:
					{
					setState(241);
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
				setState(245);
				match(SEMICOLON);
				setState(248);
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
				case STRING:
					{
					setState(246);
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
				setState(250);
				match(SEMICOLON);
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(251);
					assign_expr();
					}
					break;
				case 2:
					{
					setState(252);
					inc_expr();
					}
					break;
				case 3:
					{
					setState(253);
					dec_expr();
					}
					break;
				}
				setState(256);
				match(RROUND_BRACK);
				setState(257);
				match(LCURLY_BRACK);
				setState(258);
				stat_list();
				setState(259);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(FOR);
				setState(262);
				match(LROUND_BRACK);
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AUTO:
				case INT_TYPE:
				case FLOAT_TYPE:
				case STRING_TYPE:
					{
					setState(263);
					var_decl_expr();
					}
					break;
				case ID:
					{
					setState(264);
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
				setState(268);
				match(SEMICOLON);
				setState(271);
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
				case STRING:
					{
					setState(269);
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
				setState(273);
				match(SEMICOLON);
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(274);
					assign_expr();
					}
					break;
				case 2:
					{
					setState(275);
					inc_expr();
					}
					break;
				case 3:
					{
					setState(276);
					dec_expr();
					}
					break;
				}
				setState(279);
				match(RROUND_BRACK);
				setState(280);
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(SWITCH);
				setState(285);
				match(LROUND_BRACK);
				setState(286);
				expr(0);
				setState(287);
				match(RROUND_BRACK);
				setState(288);
				match(LCURLY_BRACK);
				setState(289);
				case_expr_list();
				setState(290);
				default_case_expr();
				setState(291);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(SWITCH);
				setState(294);
				match(LROUND_BRACK);
				setState(295);
				expr(0);
				setState(296);
				match(RROUND_BRACK);
				setState(297);
				match(LCURLY_BRACK);
				setState(298);
				case_expr_list();
				setState(299);
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
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				case_expr();
				setState(304);
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
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(CASE);
				setState(310);
				match(LROUND_BRACK);
				setState(311);
				expr(0);
				setState(312);
				match(RROUND_BRACK);
				setState(313);
				match(COLON);
				setState(314);
				stat_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(CASE);
				setState(317);
				expr(0);
				setState(318);
				match(COLON);
				setState(319);
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
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(DEFAULT);
				setState(324);
				match(COLON);
				setState(325);
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
			setState(329);
			match(BREAK);
			setState(330);
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
			setState(332);
			match(CONTINUE);
			setState(333);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(RETURN);
			setState(336);
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
			setState(338);
			expr(0);
			setState(339);
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
		public TerminalNode STRING() { return getToken(TyCParser.STRING, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 545357767376896L) != 0)) ) {
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
	public static class ExprContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Un_opContext un_op() {
			return getRuleContext(Un_opContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Pre_opContext pre_op() {
			return getRuleContext(Pre_opContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(344);
				assign_expr();
				}
				break;
			case 2:
				{
				setState(345);
				un_op();
				setState(346);
				expr(6);
				}
				break;
			case 3:
				{
				setState(348);
				pre_op();
				setState(349);
				expr(5);
				}
				break;
			case 4:
				{
				setState(351);
				lvalue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(354);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(355);
						bin_op();
						setState(356);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(358);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(359);
						post_op();
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(361);
						match(MEMACC_OP);
						setState(362);
						match(ID);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(363);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(364);
						match(LROUND_BRACK);
						setState(365);
						arg_list();
						setState(366);
						match(RROUND_BRACK);
						}
						break;
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(373);
			match(ID);
			setState(374);
			match(ASS_OP);
			setState(375);
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
		enterRule(_localctx, 60, RULE_inc_expr);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(INC_OP);
				setState(378);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(ID);
				setState(380);
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
		enterRule(_localctx, 62, RULE_dec_expr);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(DEC_OP);
				setState(384);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(ID);
				setState(386);
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
		enterRule(_localctx, 64, RULE_un_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			un_op();
			setState(390);
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
		enterRule(_localctx, 66, RULE_un_term);
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
		enterRule(_localctx, 68, RULE_pre_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			pre_op();
			setState(395);
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
		enterRule(_localctx, 70, RULE_pre_term);
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
		enterRule(_localctx, 72, RULE_post_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			post_term();
			setState(400);
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
		enterRule(_localctx, 74, RULE_post_term);
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
		enterRule(_localctx, 76, RULE_func_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			func_term();
			setState(405);
			match(LROUND_BRACK);
			setState(406);
			arg_list();
			setState(407);
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
		enterRule(_localctx, 78, RULE_func_term);
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
		enterRule(_localctx, 80, RULE_mem_acc_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			mem_acc_term();
			setState(412);
			match(MEMACC_OP);
			setState(413);
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
		enterRule(_localctx, 82, RULE_mem_acc_term);
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
		enterRule(_localctx, 84, RULE_arg_list);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				arg();
				setState(418);
				match(COMMA);
				setState(419);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
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
		enterRule(_localctx, 86, RULE_args);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				arg();
				setState(426);
				match(COMMA);
				setState(427);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
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
		public TerminalNode STRING() { return getToken(TyCParser.STRING, 0); }
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
		enterRule(_localctx, 88, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 404620279021568L) != 0)) ) {
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
	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode MULT_OP() { return getToken(TyCParser.MULT_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(TyCParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(TyCParser.MOD_OP, 0); }
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
		enterRule(_localctx, 90, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		enterRule(_localctx, 92, RULE_un_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
		enterRule(_localctx, 94, RULE_pre_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
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
		enterRule(_localctx, 96, RULE_post_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u01bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"j\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002n\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004~\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0087\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0094\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a0\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a6\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00b3\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00dd\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ed\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f4"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f9\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ff\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u010b\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0110\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0116\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u011b\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u012e\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0134\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0142\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0148\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0161\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0171\b\u001c"+
		"\n\u001c\f\u001c\u0174\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u017e"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0184"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01a8\b*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0003+\u01af\b+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001"+
		".\u0001/\u0001/\u00010\u00010\u00010\u0000\u000181\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`\u0000\u0007\u0001\u0000-0\u0002\u0000\u0001"+
		"\u0001\r\u000f\u0001\u0000,0\u0002\u0000,.00\u0001\u0000\u0011\u001d\u0002"+
		"\u0000\u0011\u0012\u001e\u001e\u0001\u0000\u001f \u01b9\u0000b\u0001\u0000"+
		"\u0000\u0000\u0002i\u0001\u0000\u0000\u0000\u0004m\u0001\u0000\u0000\u0000"+
		"\u0006o\u0001\u0000\u0000\u0000\b}\u0001\u0000\u0000\u0000\n\u007f\u0001"+
		"\u0000\u0000\u0000\f\u0082\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000"+
		"\u0000\u0000\u0010\u0088\u0001\u0000\u0000\u0000\u0012\u0093\u0001\u0000"+
		"\u0000\u0000\u0014\u009f\u0001\u0000\u0000\u0000\u0016\u00a5\u0001\u0000"+
		"\u0000\u0000\u0018\u00a7\u0001\u0000\u0000\u0000\u001a\u00b2\u0001\u0000"+
		"\u0000\u0000\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00b6\u0001\u0000"+
		"\u0000\u0000 \u00dc\u0001\u0000\u0000\u0000\"\u00ec\u0001\u0000\u0000"+
		"\u0000$\u011a\u0001\u0000\u0000\u0000&\u012d\u0001\u0000\u0000\u0000("+
		"\u0133\u0001\u0000\u0000\u0000*\u0141\u0001\u0000\u0000\u0000,\u0147\u0001"+
		"\u0000\u0000\u0000.\u0149\u0001\u0000\u0000\u00000\u014c\u0001\u0000\u0000"+
		"\u00002\u014f\u0001\u0000\u0000\u00004\u0152\u0001\u0000\u0000\u00006"+
		"\u0155\u0001\u0000\u0000\u00008\u0160\u0001\u0000\u0000\u0000:\u0175\u0001"+
		"\u0000\u0000\u0000<\u017d\u0001\u0000\u0000\u0000>\u0183\u0001\u0000\u0000"+
		"\u0000@\u0185\u0001\u0000\u0000\u0000B\u0188\u0001\u0000\u0000\u0000D"+
		"\u018a\u0001\u0000\u0000\u0000F\u018d\u0001\u0000\u0000\u0000H\u018f\u0001"+
		"\u0000\u0000\u0000J\u0192\u0001\u0000\u0000\u0000L\u0194\u0001\u0000\u0000"+
		"\u0000N\u0199\u0001\u0000\u0000\u0000P\u019b\u0001\u0000\u0000\u0000R"+
		"\u019f\u0001\u0000\u0000\u0000T\u01a7\u0001\u0000\u0000\u0000V\u01ae\u0001"+
		"\u0000\u0000\u0000X\u01b0\u0001\u0000\u0000\u0000Z\u01b2\u0001\u0000\u0000"+
		"\u0000\\\u01b4\u0001\u0000\u0000\u0000^\u01b6\u0001\u0000\u0000\u0000"+
		"`\u01b8\u0001\u0000\u0000\u0000bc\u0003\u0002\u0001\u0000cd\u0005\u0000"+
		"\u0000\u0001d\u0001\u0001\u0000\u0000\u0000ef\u0003\u0004\u0002\u0000"+
		"fg\u0003\u0002\u0001\u0000gj\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000"+
		"\u0000ie\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\u0003\u0001"+
		"\u0000\u0000\u0000kn\u0003\u0006\u0003\u0000ln\u0003\u0010\b\u0000mk\u0001"+
		"\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u0005\u0001\u0000\u0000"+
		"\u0000op\u0003\u000e\u0007\u0000pq\u0005,\u0000\u0000qr\u0005#\u0000\u0000"+
		"rs\u0003\b\u0004\u0000st\u0005$\u0000\u0000tu\u0005\'\u0000\u0000uv\u0003"+
		"\u0012\t\u0000vw\u0005(\u0000\u0000w\u0007\u0001\u0000\u0000\u0000xy\u0003"+
		"\n\u0005\u0000yz\u0003\b\u0004\u0000z~\u0001\u0000\u0000\u0000{~\u0003"+
		"\n\u0005\u0000|~\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\t\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0003\f\u0006\u0000\u0080\u0081\u0005,\u0000\u0000\u0081"+
		"\u000b\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u001c\u000e\u0000\u0083"+
		"\r\u0001\u0000\u0000\u0000\u0084\u0087\u0003\f\u0006\u0000\u0085\u0087"+
		"\u0005\u0010\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u000f\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005\n\u0000\u0000\u0089\u008a\u0005,\u0000\u0000\u008a\u008b\u0005"+
		"\'\u0000\u0000\u008b\u008c\u0003\u0016\u000b\u0000\u008c\u008d\u0005("+
		"\u0000\u0000\u008d\u008e\u0005)\u0000\u0000\u008e\u0011\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0003\u0014\n\u0000\u0090\u0091\u0003\u0012\t\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000"+
		"\u0093\u008f\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0013\u0001\u0000\u0000\u0000\u0095\u00a0\u0003\u0018\f\u0000\u0096"+
		"\u00a0\u0003\u001e\u000f\u0000\u0097\u00a0\u0003 \u0010\u0000\u0098\u00a0"+
		"\u0003\"\u0011\u0000\u0099\u00a0\u0003$\u0012\u0000\u009a\u00a0\u0003"+
		"&\u0013\u0000\u009b\u00a0\u0003.\u0017\u0000\u009c\u00a0\u00030\u0018"+
		"\u0000\u009d\u00a0\u00032\u0019\u0000\u009e\u00a0\u00034\u001a\u0000\u009f"+
		"\u0095\u0001\u0000\u0000\u0000\u009f\u0096\u0001\u0000\u0000\u0000\u009f"+
		"\u0097\u0001\u0000\u0000\u0000\u009f\u0098\u0001\u0000\u0000\u0000\u009f"+
		"\u0099\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u009f"+
		"\u009b\u0001\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u0015\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\u0018\f\u0000\u00a2\u00a3"+
		"\u0003\u0016\u000b\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u0017\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0003\u001a\r\u0000\u00a8\u00a9\u0005)\u0000\u0000\u00a9\u0019\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0003\u001c\u000e\u0000\u00ab\u00ac\u0005"+
		",\u0000\u0000\u00ac\u00b3\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003\u001c"+
		"\u000e\u0000\u00ae\u00af\u0005,\u0000\u0000\u00af\u00b0\u0005!\u0000\u0000"+
		"\u00b0\u00b1\u0007\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4\u00b5\u0007\u0001\u0000\u0000"+
		"\u00b5\u001d\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\'\u0000\u0000\u00b7"+
		"\u00b8\u0003\u0012\t\u0000\u00b8\u00b9\u0005(\u0000\u0000\u00b9\u001f"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\b\u0000\u0000\u00bb\u00bc\u0005"+
		"#\u0000\u0000\u00bc\u00bd\u00038\u001c\u0000\u00bd\u00be\u0005$\u0000"+
		"\u0000\u00be\u00bf\u0005\'\u0000\u0000\u00bf\u00c0\u0003\u0012\t\u0000"+
		"\u00c0\u00c1\u0005(\u0000\u0000\u00c1\u00dd\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005\b\u0000\u0000\u00c3\u00c4\u0005#\u0000\u0000\u00c4\u00c5"+
		"\u00038\u001c\u0000\u00c5\u00c6\u0005$\u0000\u0000\u00c6\u00c7\u0003\u0014"+
		"\n\u0000\u00c7\u00dd\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\b\u0000"+
		"\u0000\u00c9\u00ca\u0005#\u0000\u0000\u00ca\u00cb\u00038\u001c\u0000\u00cb"+
		"\u00cc\u0005$\u0000\u0000\u00cc\u00cd\u0003\u0014\n\u0000\u00cd\u00ce"+
		"\u0005\u0006\u0000\u0000\u00ce\u00cf\u0003\u0014\n\u0000\u00cf\u00dd\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005\b\u0000\u0000\u00d1\u00d2\u0005#"+
		"\u0000\u0000\u00d2\u00d3\u00038\u001c\u0000\u00d3\u00d4\u0005$\u0000\u0000"+
		"\u00d4\u00d5\u0005\'\u0000\u0000\u00d5\u00d6\u0003\u0012\t\u0000\u00d6"+
		"\u00d7\u0005(\u0000\u0000\u00d7\u00d8\u0005\u0006\u0000\u0000\u00d8\u00d9"+
		"\u0005\'\u0000\u0000\u00d9\u00da\u0003\u0012\t\u0000\u00da\u00db\u0005"+
		"(\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00dc\u00c2\u0001\u0000\u0000\u0000\u00dc\u00c8\u0001\u0000"+
		"\u0000\u0000\u00dc\u00d0\u0001\u0000\u0000\u0000\u00dd!\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\f\u0000\u0000\u00df\u00e0\u0005#\u0000\u0000"+
		"\u00e0\u00e1\u00038\u001c\u0000\u00e1\u00e2\u0005$\u0000\u0000\u00e2\u00e3"+
		"\u0005\'\u0000\u0000\u00e3\u00e4\u0003\u0012\t\u0000\u00e4\u00e5\u0005"+
		"(\u0000\u0000\u00e5\u00ed\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\f"+
		"\u0000\u0000\u00e7\u00e8\u0005#\u0000\u0000\u00e8\u00e9\u00038\u001c\u0000"+
		"\u00e9\u00ea\u0005$\u0000\u0000\u00ea\u00eb\u0003\u0014\n\u0000\u00eb"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ec\u00de\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e6\u0001\u0000\u0000\u0000\u00ed#\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005\u0007\u0000\u0000\u00ef\u00f3\u0005#\u0000\u0000\u00f0\u00f4\u0003"+
		"\u001a\r\u0000\u00f1\u00f4\u0003:\u001d\u0000\u00f2\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f8\u0005)\u0000\u0000\u00f6\u00f9\u00038\u001c\u0000"+
		"\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fe\u0005)\u0000\u0000\u00fb\u00ff\u0003:\u001d\u0000\u00fc\u00ff"+
		"\u0003<\u001e\u0000\u00fd\u00ff\u0003>\u001f\u0000\u00fe\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005$\u0000"+
		"\u0000\u0101\u0102\u0005\'\u0000\u0000\u0102\u0103\u0003\u0012\t\u0000"+
		"\u0103\u0104\u0005(\u0000\u0000\u0104\u011b\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0005\u0007\u0000\u0000\u0106\u010a\u0005#\u0000\u0000\u0107\u010b"+
		"\u0003\u001a\r\u0000\u0108\u010b\u0003:\u001d\u0000\u0109\u010b\u0001"+
		"\u0000\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010f\u0005)\u0000\u0000\u010d\u0110\u00038\u001c"+
		"\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111\u0115\u0005)\u0000\u0000\u0112\u0116\u0003:\u001d\u0000\u0113"+
		"\u0116\u0003<\u001e\u0000\u0114\u0116\u0003>\u001f\u0000\u0115\u0112\u0001"+
		"\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0005"+
		"$\u0000\u0000\u0118\u0119\u0003\u0014\n\u0000\u0119\u011b\u0001\u0000"+
		"\u0000\u0000\u011a\u00ee\u0001\u0000\u0000\u0000\u011a\u0105\u0001\u0000"+
		"\u0000\u0000\u011b%\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u000b\u0000"+
		"\u0000\u011d\u011e\u0005#\u0000\u0000\u011e\u011f\u00038\u001c\u0000\u011f"+
		"\u0120\u0005$\u0000\u0000\u0120\u0121\u0005\'\u0000\u0000\u0121\u0122"+
		"\u0003(\u0014\u0000\u0122\u0123\u0003,\u0016\u0000\u0123\u0124\u0005("+
		"\u0000\u0000\u0124\u012e\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u000b"+
		"\u0000\u0000\u0126\u0127\u0005#\u0000\u0000\u0127\u0128\u00038\u001c\u0000"+
		"\u0128\u0129\u0005$\u0000\u0000\u0129\u012a\u0005\'\u0000\u0000\u012a"+
		"\u012b\u0003(\u0014\u0000\u012b\u012c\u0005(\u0000\u0000\u012c\u012e\u0001"+
		"\u0000\u0000\u0000\u012d\u011c\u0001\u0000\u0000\u0000\u012d\u0125\u0001"+
		"\u0000\u0000\u0000\u012e\'\u0001\u0000\u0000\u0000\u012f\u0130\u0003*"+
		"\u0015\u0000\u0130\u0131\u0003(\u0014\u0000\u0131\u0134\u0001\u0000\u0000"+
		"\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000\u0000"+
		"\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134)\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0005\u0003\u0000\u0000\u0136\u0137\u0005#\u0000\u0000\u0137"+
		"\u0138\u00038\u001c\u0000\u0138\u0139\u0005$\u0000\u0000\u0139\u013a\u0005"+
		"+\u0000\u0000\u013a\u013b\u0003\u0012\t\u0000\u013b\u0142\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0005\u0003\u0000\u0000\u013d\u013e\u00038\u001c"+
		"\u0000\u013e\u013f\u0005+\u0000\u0000\u013f\u0140\u0003\u0012\t\u0000"+
		"\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0135\u0001\u0000\u0000\u0000"+
		"\u0141\u013c\u0001\u0000\u0000\u0000\u0142+\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0005\u0005\u0000\u0000\u0144\u0145\u0005+\u0000\u0000\u0145\u0148"+
		"\u0003\u0012\t\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0143\u0001"+
		"\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148-\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0005\u0002\u0000\u0000\u014a\u014b\u0005)\u0000"+
		"\u0000\u014b/\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u0004\u0000\u0000"+
		"\u014d\u014e\u0005)\u0000\u0000\u014e1\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0005\t\u0000\u0000\u0150\u0151\u0005)\u0000\u0000\u01513\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u00038\u001c\u0000\u0153\u0154\u0005)\u0000\u0000"+
		"\u01545\u0001\u0000\u0000\u0000\u0155\u0156\u0007\u0002\u0000\u0000\u0156"+
		"7\u0001\u0000\u0000\u0000\u0157\u0158\u0006\u001c\uffff\uffff\u0000\u0158"+
		"\u0161\u0003:\u001d\u0000\u0159\u015a\u0003\\.\u0000\u015a\u015b\u0003"+
		"8\u001c\u0006\u015b\u0161\u0001\u0000\u0000\u0000\u015c\u015d\u0003^/"+
		"\u0000\u015d\u015e\u00038\u001c\u0005\u015e\u0161\u0001\u0000\u0000\u0000"+
		"\u015f\u0161\u00036\u001b\u0000\u0160\u0157\u0001\u0000\u0000\u0000\u0160"+
		"\u0159\u0001\u0000\u0000\u0000\u0160\u015c\u0001\u0000\u0000\u0000\u0160"+
		"\u015f\u0001\u0000\u0000\u0000\u0161\u0172\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\n\u0007\u0000\u0000\u0163\u0164\u0003Z-\u0000\u0164\u0165\u0003"+
		"8\u001c\b\u0165\u0171\u0001\u0000\u0000\u0000\u0166\u0167\n\u0004\u0000"+
		"\u0000\u0167\u0171\u0003`0\u0000\u0168\u0169\n\u0003\u0000\u0000\u0169"+
		"\u016a\u0005\"\u0000\u0000\u016a\u0171\u0005,\u0000\u0000\u016b\u016c"+
		"\n\u0002\u0000\u0000\u016c\u016d\u0005#\u0000\u0000\u016d\u016e\u0003"+
		"T*\u0000\u016e\u016f\u0005$\u0000\u0000\u016f\u0171\u0001\u0000\u0000"+
		"\u0000\u0170\u0162\u0001\u0000\u0000\u0000\u0170\u0166\u0001\u0000\u0000"+
		"\u0000\u0170\u0168\u0001\u0000\u0000\u0000\u0170\u016b\u0001\u0000\u0000"+
		"\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u01739\u0001\u0000\u0000\u0000"+
		"\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0176\u0005,\u0000\u0000\u0176"+
		"\u0177\u0005!\u0000\u0000\u0177\u0178\u00038\u001c\u0000\u0178;\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005\u001f\u0000\u0000\u017a\u017e\u0005"+
		",\u0000\u0000\u017b\u017c\u0005,\u0000\u0000\u017c\u017e\u0005\u001f\u0000"+
		"\u0000\u017d\u0179\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017e=\u0001\u0000\u0000\u0000\u017f\u0180\u0005 \u0000\u0000\u0180"+
		"\u0184\u0005,\u0000\u0000\u0181\u0182\u0005,\u0000\u0000\u0182\u0184\u0005"+
		" \u0000\u0000\u0183\u017f\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000"+
		"\u0000\u0000\u0184?\u0001\u0000\u0000\u0000\u0185\u0186\u0003\\.\u0000"+
		"\u0186\u0187\u0003B!\u0000\u0187A\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0001\u0000\u0000\u0000\u0189C\u0001\u0000\u0000\u0000\u018a\u018b\u0003"+
		"^/\u0000\u018b\u018c\u0003F#\u0000\u018cE\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0001\u0000\u0000\u0000\u018eG\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0003J%\u0000\u0190\u0191\u0003`0\u0000\u0191I\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u0001\u0000\u0000\u0000\u0193K\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0003N\'\u0000\u0195\u0196\u0005#\u0000\u0000\u0196\u0197\u0003"+
		"T*\u0000\u0197\u0198\u0005$\u0000\u0000\u0198M\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019aO\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0003R)\u0000\u019c\u019d\u0005\"\u0000\u0000\u019d\u019e\u0005"+
		",\u0000\u0000\u019eQ\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0S\u0001\u0000\u0000\u0000\u01a1\u01a2\u0003X,\u0000\u01a2"+
		"\u01a3\u0005*\u0000\u0000\u01a3\u01a4\u0003V+\u0000\u01a4\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a8\u0003X,\u0000\u01a6\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a1\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8U\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0003X,\u0000\u01aa\u01ab\u0005*\u0000\u0000\u01ab\u01ac"+
		"\u0003V+\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01af\u0003X"+
		",\u0000\u01ae\u01a9\u0001\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000"+
		"\u0000\u01afW\u0001\u0000\u0000\u0000\u01b0\u01b1\u0007\u0003\u0000\u0000"+
		"\u01b1Y\u0001\u0000\u0000\u0000\u01b2\u01b3\u0007\u0004\u0000\u0000\u01b3"+
		"[\u0001\u0000\u0000\u0000\u01b4\u01b5\u0007\u0005\u0000\u0000\u01b5]\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0007\u0006\u0000\u0000\u01b7_\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0007\u0006\u0000\u0000\u01b9a\u0001\u0000\u0000"+
		"\u0000\u001cim}\u0086\u0093\u009f\u00a5\u00b2\u00dc\u00ec\u00f3\u00f8"+
		"\u00fe\u010a\u010f\u0115\u011a\u012d\u0133\u0141\u0147\u0160\u0170\u0172"+
		"\u017d\u0183\u01a7\u01ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}