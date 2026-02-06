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
		BOOL=47, STRING=48, STRINGLIT=49, NEWLINE=50, WS=51, COMMENT=52, MULTILINE_COMMENT=53, 
		ILLEGAL_ESCAPE=54, UNCLOSE_STRING=55, ERROR_CHAR=56;
	public static final int
		RULE_program = 0, RULE_prog_stat_list = 1, RULE_prog_stat = 2, RULE_func_decl = 3, 
		RULE_param_list = 4, RULE_param = 5, RULE_param_type = 6, RULE_return_type = 7, 
		RULE_struct_decl = 8, RULE_stat_list = 9, RULE_stat = 10, RULE_var_decl_list = 11, 
		RULE_var_decl_stat = 12, RULE_var_decl_expr = 13, RULE_var_type = 14, 
		RULE_block_stat = 15, RULE_if_stat = 16, RULE_while_stat = 17, RULE_for_stat = 18, 
		RULE_switch_stat = 19, RULE_case_expr_list = 20, RULE_case_expr = 21, 
		RULE_default_case_expr = 22, RULE_break_stat = 23, RULE_continue_stat = 24, 
		RULE_return_stat = 25, RULE_expr_stat = 26, RULE_lvalue = 27, RULE_expr = 28, 
		RULE_assign_expr = 29, RULE_inc_expr = 30, RULE_dec_expr = 31, RULE_arg_list = 32, 
		RULE_args = 33, RULE_arg = 34, RULE_bin_op = 35, RULE_un_op = 36, RULE_pre_op = 37, 
		RULE_post_op = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "prog_stat_list", "prog_stat", "func_decl", "param_list", 
			"param", "param_type", "return_type", "struct_decl", "stat_list", "stat", 
			"var_decl_list", "var_decl_stat", "var_decl_expr", "var_type", "block_stat", 
			"if_stat", "while_stat", "for_stat", "switch_stat", "case_expr_list", 
			"case_expr", "default_case_expr", "break_stat", "continue_stat", "return_stat", 
			"expr_stat", "lvalue", "expr", "assign_expr", "inc_expr", "dec_expr", 
			"arg_list", "args", "arg", "bin_op", "un_op", "pre_op", "post_op"
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
			"BOOL", "STRING", "STRINGLIT", "NEWLINE", "WS", "COMMENT", "MULTILINE_COMMENT", 
			"ILLEGAL_ESCAPE", "UNCLOSE_STRING", "ERROR_CHAR"
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
			setState(78);
			prog_stat_list();
			setState(79);
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
			setState(85);
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
				setState(81);
				prog_stat();
				setState(82);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				func_decl();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
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
			setState(91);
			return_type();
			setState(92);
			match(ID);
			setState(93);
			match(LROUND_BRACK);
			setState(94);
			param_list();
			setState(95);
			match(RROUND_BRACK);
			setState(96);
			match(LCURLY_BRACK);
			setState(97);
			stat_list();
			setState(98);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				param();
				setState(101);
				param_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
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
			setState(107);
			param_type();
			setState(108);
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
			setState(110);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				param_type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
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
			setState(116);
			match(STRUCT);
			setState(117);
			match(ID);
			setState(118);
			match(LCURLY_BRACK);
			setState(119);
			var_decl_list();
			setState(120);
			match(RCURLY_BRACK);
			setState(121);
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
			setState(127);
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
			case LROUND_BRACK:
			case LCURLY_BRACK:
			case ID:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				stat();
				setState(124);
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
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				var_decl_stat();
				}
				break;
			case LCURLY_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				block_stat();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				if_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				while_stat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				for_stat();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				switch_stat();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				break_stat();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				continue_stat();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(137);
				return_stat();
				}
				break;
			case ADD_OP:
			case MIN_OP:
			case NOT_OP:
			case INC_OP:
			case DEC_OP:
			case LROUND_BRACK:
			case ID:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
				enterOuterAlt(_localctx, 10);
				{
				setState(138);
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
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				var_decl_stat();
				setState(142);
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
			setState(147);
			var_decl_expr();
			setState(148);
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
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				var_type();
				setState(151);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				var_type();
				setState(154);
				match(ID);
				setState(155);
				match(ASS_OP);
				setState(156);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				var_type();
				setState(159);
				match(ID);
				setState(160);
				match(ASS_OP);
				setState(161);
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
			setState(165);
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
			setState(167);
			match(LCURLY_BRACK);
			setState(168);
			stat_list();
			setState(169);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(IF);
				setState(172);
				match(LROUND_BRACK);
				setState(173);
				expr(0);
				setState(174);
				match(RROUND_BRACK);
				setState(175);
				match(LCURLY_BRACK);
				setState(176);
				stat_list();
				setState(177);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(IF);
				setState(180);
				match(LROUND_BRACK);
				setState(181);
				expr(0);
				setState(182);
				match(RROUND_BRACK);
				setState(183);
				stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(IF);
				setState(186);
				match(LROUND_BRACK);
				setState(187);
				expr(0);
				setState(188);
				match(RROUND_BRACK);
				setState(189);
				stat();
				setState(190);
				match(ELSE);
				setState(191);
				stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(IF);
				setState(194);
				match(LROUND_BRACK);
				setState(195);
				expr(0);
				setState(196);
				match(RROUND_BRACK);
				setState(197);
				match(LCURLY_BRACK);
				setState(198);
				stat_list();
				setState(199);
				match(RCURLY_BRACK);
				setState(200);
				match(ELSE);
				setState(201);
				match(LCURLY_BRACK);
				setState(202);
				stat_list();
				setState(203);
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(WHILE);
				setState(208);
				match(LROUND_BRACK);
				setState(209);
				expr(0);
				setState(210);
				match(RROUND_BRACK);
				setState(211);
				match(LCURLY_BRACK);
				setState(212);
				stat_list();
				setState(213);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(WHILE);
				setState(216);
				match(LROUND_BRACK);
				setState(217);
				expr(0);
				setState(218);
				match(RROUND_BRACK);
				setState(219);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(FOR);
				setState(224);
				match(LROUND_BRACK);
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AUTO:
				case INT_TYPE:
				case FLOAT_TYPE:
				case STRING_TYPE:
					{
					setState(225);
					var_decl_expr();
					}
					break;
				case ADD_OP:
				case MIN_OP:
				case NOT_OP:
				case INC_OP:
				case DEC_OP:
				case LROUND_BRACK:
				case ID:
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
					{
					setState(226);
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
				setState(230);
				match(SEMICOLON);
				setState(233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD_OP:
				case MIN_OP:
				case NOT_OP:
				case INC_OP:
				case DEC_OP:
				case LROUND_BRACK:
				case ID:
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
					{
					setState(231);
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
				setState(235);
				match(SEMICOLON);
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(236);
					assign_expr();
					}
					break;
				case 2:
					{
					setState(237);
					inc_expr();
					}
					break;
				case 3:
					{
					setState(238);
					dec_expr();
					}
					break;
				}
				setState(241);
				match(RROUND_BRACK);
				setState(242);
				match(LCURLY_BRACK);
				setState(243);
				stat_list();
				setState(244);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(FOR);
				setState(247);
				match(LROUND_BRACK);
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AUTO:
				case INT_TYPE:
				case FLOAT_TYPE:
				case STRING_TYPE:
					{
					setState(248);
					var_decl_expr();
					}
					break;
				case ADD_OP:
				case MIN_OP:
				case NOT_OP:
				case INC_OP:
				case DEC_OP:
				case LROUND_BRACK:
				case ID:
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
					{
					setState(249);
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
				setState(253);
				match(SEMICOLON);
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD_OP:
				case MIN_OP:
				case NOT_OP:
				case INC_OP:
				case DEC_OP:
				case LROUND_BRACK:
				case ID:
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
					{
					setState(254);
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
				setState(258);
				match(SEMICOLON);
				setState(262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(259);
					assign_expr();
					}
					break;
				case 2:
					{
					setState(260);
					inc_expr();
					}
					break;
				case 3:
					{
					setState(261);
					dec_expr();
					}
					break;
				}
				setState(264);
				match(RROUND_BRACK);
				setState(265);
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(SWITCH);
				setState(270);
				match(LROUND_BRACK);
				setState(271);
				expr(0);
				setState(272);
				match(RROUND_BRACK);
				setState(273);
				match(LCURLY_BRACK);
				setState(274);
				case_expr_list();
				setState(275);
				default_case_expr();
				setState(276);
				match(RCURLY_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(SWITCH);
				setState(279);
				match(LROUND_BRACK);
				setState(280);
				expr(0);
				setState(281);
				match(RROUND_BRACK);
				setState(282);
				match(LCURLY_BRACK);
				setState(283);
				case_expr_list();
				setState(284);
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
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				case_expr();
				setState(289);
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
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(CASE);
				setState(295);
				match(LROUND_BRACK);
				setState(296);
				expr(0);
				setState(297);
				match(RROUND_BRACK);
				setState(298);
				match(COLON);
				setState(299);
				stat_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(CASE);
				setState(302);
				expr(0);
				setState(303);
				match(COLON);
				setState(304);
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
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(DEFAULT);
				setState(309);
				match(COLON);
				setState(310);
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
			setState(314);
			match(BREAK);
			setState(315);
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
			setState(317);
			match(CONTINUE);
			setState(318);
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(RETURN);
				setState(321);
				expr(0);
				setState(322);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(RETURN);
				setState(325);
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
		public TerminalNode SEMICOLON() { return getToken(TyCParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(328);
				expr(0);
				}
				break;
			case 2:
				{
				setState(329);
				assign_expr();
				}
				break;
			}
			setState(332);
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
			setState(334);
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
		public TerminalNode LROUND_BRACK() { return getToken(TyCParser.LROUND_BRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RROUND_BRACK() { return getToken(TyCParser.RROUND_BRACK, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Pre_opContext pre_op() {
			return getRuleContext(Pre_opContext.class,0);
		}
		public Un_opContext un_op() {
			return getRuleContext(Un_opContext.class,0);
		}
		public TerminalNode MULT_OP() { return getToken(TyCParser.MULT_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(TyCParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(TyCParser.MOD_OP, 0); }
		public TerminalNode ADD_OP() { return getToken(TyCParser.ADD_OP, 0); }
		public TerminalNode MIN_OP() { return getToken(TyCParser.MIN_OP, 0); }
		public TerminalNode LESS_OP() { return getToken(TyCParser.LESS_OP, 0); }
		public TerminalNode LEQ_OP() { return getToken(TyCParser.LEQ_OP, 0); }
		public TerminalNode GREAT_OP() { return getToken(TyCParser.GREAT_OP, 0); }
		public TerminalNode GEQ_OP() { return getToken(TyCParser.GEQ_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(TyCParser.EQ_OP, 0); }
		public TerminalNode NEQ_OP() { return getToken(TyCParser.NEQ_OP, 0); }
		public TerminalNode AND_OP() { return getToken(TyCParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(TyCParser.OR_OP, 0); }
		public TerminalNode MEMACC_OP() { return getToken(TyCParser.MEMACC_OP, 0); }
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public Post_opContext post_op() {
			return getRuleContext(Post_opContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
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
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LROUND_BRACK:
				{
				setState(337);
				match(LROUND_BRACK);
				setState(338);
				expr(0);
				setState(339);
				match(RROUND_BRACK);
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
				{
				setState(341);
				lvalue();
				}
				break;
			case INC_OP:
			case DEC_OP:
				{
				setState(342);
				pre_op();
				setState(343);
				expr(8);
				}
				break;
			case ADD_OP:
			case MIN_OP:
			case NOT_OP:
				{
				setState(345);
				un_op();
				setState(346);
				expr(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(351);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(352);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(353);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(354);
						_la = _input.LA(1);
						if ( !(_la==ADD_OP || _la==MIN_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(355);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(356);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(357);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(358);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(359);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(360);
						_la = _input.LA(1);
						if ( !(_la==EQ_OP || _la==NEQ_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(361);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(362);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(363);
						match(AND_OP);
						setState(364);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(366);
						match(OR_OP);
						setState(367);
						expr(2);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(368);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(369);
						match(MEMACC_OP);
						setState(370);
						match(ID);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(371);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(372);
						post_op();
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(373);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(374);
						match(LROUND_BRACK);
						setState(375);
						arg_list();
						setState(376);
						match(RROUND_BRACK);
						}
						break;
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public TerminalNode ASS_OP() { return getToken(TyCParser.ASS_OP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(TyCParser.ID, 0); }
		public TerminalNode MEMACC_OP() { return getToken(TyCParser.MEMACC_OP, 0); }
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
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(383);
				match(ID);
				}
				break;
			case 2:
				{
				setState(384);
				expr(0);
				setState(385);
				match(MEMACC_OP);
				setState(386);
				match(ID);
				}
				break;
			}
			setState(390);
			match(ASS_OP);
			setState(391);
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
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(INC_OP);
				setState(394);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(ID);
				setState(396);
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
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(DEC_OP);
				setState(400);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(ID);
				setState(402);
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
		enterRule(_localctx, 64, RULE_arg_list);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				arg();
				setState(406);
				match(COMMA);
				setState(407);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
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
		enterRule(_localctx, 66, RULE_args);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				arg();
				setState(414);
				match(COMMA);
				setState(415);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MEMACC_OP() { return getToken(TyCParser.MEMACC_OP, 0); }
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
		enterRule(_localctx, 68, RULE_arg);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				expr(0);
				setState(425);
				match(MEMACC_OP);
				setState(426);
				match(ID);
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
		enterRule(_localctx, 70, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
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
		enterRule(_localctx, 72, RULE_un_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		enterRule(_localctx, 74, RULE_pre_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		enterRule(_localctx, 76, RULE_post_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u01b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"V\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002Z\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004j\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007s\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0080\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008c\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0092\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a4\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ce\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00de\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00e5\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00ea\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00f0\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00fc\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0101\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0107\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u010c\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u011f\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0125\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0133\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0139\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0147\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u014b\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u015d\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u017b\b\u001c\n\u001c\f\u001c\u017e"+
		"\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0185\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u018e\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0194\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u019c\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u01a3\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01ad\b\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0000\u00018\'\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJL\u0000\n\u0001\u0000-0\u0002\u0000\u0001\u0001\r\u000f\u0001"+
		"\u0000,0\u0001\u0000\u0013\u0015\u0001\u0000\u0011\u0012\u0001\u0000\u0018"+
		"\u001b\u0001\u0000\u0016\u0017\u0001\u0000\u0011\u001d\u0002\u0000\u0011"+
		"\u0012\u001e\u001e\u0001\u0000\u001f \u01cc\u0000N\u0001\u0000\u0000\u0000"+
		"\u0002U\u0001\u0000\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006["+
		"\u0001\u0000\u0000\u0000\bi\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000"+
		"\u0000\fn\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010"+
		"t\u0001\u0000\u0000\u0000\u0012\u007f\u0001\u0000\u0000\u0000\u0014\u008b"+
		"\u0001\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u0093"+
		"\u0001\u0000\u0000\u0000\u001a\u00a3\u0001\u0000\u0000\u0000\u001c\u00a5"+
		"\u0001\u0000\u0000\u0000\u001e\u00a7\u0001\u0000\u0000\u0000 \u00cd\u0001"+
		"\u0000\u0000\u0000\"\u00dd\u0001\u0000\u0000\u0000$\u010b\u0001\u0000"+
		"\u0000\u0000&\u011e\u0001\u0000\u0000\u0000(\u0124\u0001\u0000\u0000\u0000"+
		"*\u0132\u0001\u0000\u0000\u0000,\u0138\u0001\u0000\u0000\u0000.\u013a"+
		"\u0001\u0000\u0000\u00000\u013d\u0001\u0000\u0000\u00002\u0146\u0001\u0000"+
		"\u0000\u00004\u014a\u0001\u0000\u0000\u00006\u014e\u0001\u0000\u0000\u0000"+
		"8\u015c\u0001\u0000\u0000\u0000:\u0184\u0001\u0000\u0000\u0000<\u018d"+
		"\u0001\u0000\u0000\u0000>\u0193\u0001\u0000\u0000\u0000@\u019b\u0001\u0000"+
		"\u0000\u0000B\u01a2\u0001\u0000\u0000\u0000D\u01ac\u0001\u0000\u0000\u0000"+
		"F\u01ae\u0001\u0000\u0000\u0000H\u01b0\u0001\u0000\u0000\u0000J\u01b2"+
		"\u0001\u0000\u0000\u0000L\u01b4\u0001\u0000\u0000\u0000NO\u0003\u0002"+
		"\u0001\u0000OP\u0005\u0000\u0000\u0001P\u0001\u0001\u0000\u0000\u0000"+
		"QR\u0003\u0004\u0002\u0000RS\u0003\u0002\u0001\u0000SV\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000UT\u0001\u0000"+
		"\u0000\u0000V\u0003\u0001\u0000\u0000\u0000WZ\u0003\u0006\u0003\u0000"+
		"XZ\u0003\u0010\b\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"Z\u0005\u0001\u0000\u0000\u0000[\\\u0003\u000e\u0007\u0000\\]\u0005,\u0000"+
		"\u0000]^\u0005#\u0000\u0000^_\u0003\b\u0004\u0000_`\u0005$\u0000\u0000"+
		"`a\u0005\'\u0000\u0000ab\u0003\u0012\t\u0000bc\u0005(\u0000\u0000c\u0007"+
		"\u0001\u0000\u0000\u0000de\u0003\n\u0005\u0000ef\u0003\b\u0004\u0000f"+
		"j\u0001\u0000\u0000\u0000gj\u0003\n\u0005\u0000hj\u0001\u0000\u0000\u0000"+
		"id\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000"+
		"\u0000j\t\u0001\u0000\u0000\u0000kl\u0003\f\u0006\u0000lm\u0005,\u0000"+
		"\u0000m\u000b\u0001\u0000\u0000\u0000no\u0003\u001c\u000e\u0000o\r\u0001"+
		"\u0000\u0000\u0000ps\u0003\f\u0006\u0000qs\u0005\u0010\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u000f\u0001\u0000\u0000"+
		"\u0000tu\u0005\n\u0000\u0000uv\u0005,\u0000\u0000vw\u0005\'\u0000\u0000"+
		"wx\u0003\u0016\u000b\u0000xy\u0005(\u0000\u0000yz\u0005)\u0000\u0000z"+
		"\u0011\u0001\u0000\u0000\u0000{|\u0003\u0014\n\u0000|}\u0003\u0012\t\u0000"+
		"}\u0080\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f{"+
		"\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0013\u0001"+
		"\u0000\u0000\u0000\u0081\u008c\u0003\u0018\f\u0000\u0082\u008c\u0003\u001e"+
		"\u000f\u0000\u0083\u008c\u0003 \u0010\u0000\u0084\u008c\u0003\"\u0011"+
		"\u0000\u0085\u008c\u0003$\u0012\u0000\u0086\u008c\u0003&\u0013\u0000\u0087"+
		"\u008c\u0003.\u0017\u0000\u0088\u008c\u00030\u0018\u0000\u0089\u008c\u0003"+
		"2\u0019\u0000\u008a\u008c\u00034\u001a\u0000\u008b\u0081\u0001\u0000\u0000"+
		"\u0000\u008b\u0082\u0001\u0000\u0000\u0000\u008b\u0083\u0001\u0000\u0000"+
		"\u0000\u008b\u0084\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000\u0000"+
		"\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u0087\u0001\u0000\u0000"+
		"\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0015\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0003\u0018\f\u0000\u008e\u008f\u0003\u0016\u000b\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000"+
		"\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0017\u0001\u0000\u0000\u0000\u0093\u0094\u0003\u001a\r\u0000\u0094"+
		"\u0095\u0005)\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0003\u001c\u000e\u0000\u0097\u0098\u0005,\u0000\u0000\u0098\u00a4\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0003\u001c\u000e\u0000\u009a\u009b\u0005"+
		",\u0000\u0000\u009b\u009c\u0005!\u0000\u0000\u009c\u009d\u0007\u0000\u0000"+
		"\u0000\u009d\u00a4\u0001\u0000\u0000\u0000\u009e\u009f\u0003\u001c\u000e"+
		"\u0000\u009f\u00a0\u0005,\u0000\u0000\u00a0\u00a1\u0005!\u0000\u0000\u00a1"+
		"\u00a2\u00038\u001c\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u0096"+
		"\u0001\u0000\u0000\u0000\u00a3\u0099\u0001\u0000\u0000\u0000\u00a3\u009e"+
		"\u0001\u0000\u0000\u0000\u00a4\u001b\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0007\u0001\u0000\u0000\u00a6\u001d\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\'\u0000\u0000\u00a8\u00a9\u0003\u0012\t\u0000\u00a9\u00aa\u0005"+
		"(\u0000\u0000\u00aa\u001f\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\b"+
		"\u0000\u0000\u00ac\u00ad\u0005#\u0000\u0000\u00ad\u00ae\u00038\u001c\u0000"+
		"\u00ae\u00af\u0005$\u0000\u0000\u00af\u00b0\u0005\'\u0000\u0000\u00b0"+
		"\u00b1\u0003\u0012\t\u0000\u00b1\u00b2\u0005(\u0000\u0000\u00b2\u00ce"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\b\u0000\u0000\u00b4\u00b5\u0005"+
		"#\u0000\u0000\u00b5\u00b6\u00038\u001c\u0000\u00b6\u00b7\u0005$\u0000"+
		"\u0000\u00b7\u00b8\u0003\u0014\n\u0000\u00b8\u00ce\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005\b\u0000\u0000\u00ba\u00bb\u0005#\u0000\u0000\u00bb"+
		"\u00bc\u00038\u001c\u0000\u00bc\u00bd\u0005$\u0000\u0000\u00bd\u00be\u0003"+
		"\u0014\n\u0000\u00be\u00bf\u0005\u0006\u0000\u0000\u00bf\u00c0\u0003\u0014"+
		"\n\u0000\u00c0\u00ce\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\b\u0000"+
		"\u0000\u00c2\u00c3\u0005#\u0000\u0000\u00c3\u00c4\u00038\u001c\u0000\u00c4"+
		"\u00c5\u0005$\u0000\u0000\u00c5\u00c6\u0005\'\u0000\u0000\u00c6\u00c7"+
		"\u0003\u0012\t\u0000\u00c7\u00c8\u0005(\u0000\u0000\u00c8\u00c9\u0005"+
		"\u0006\u0000\u0000\u00c9\u00ca\u0005\'\u0000\u0000\u00ca\u00cb\u0003\u0012"+
		"\t\u0000\u00cb\u00cc\u0005(\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ab\u0001\u0000\u0000\u0000\u00cd\u00b3\u0001\u0000\u0000"+
		"\u0000\u00cd\u00b9\u0001\u0000\u0000\u0000\u00cd\u00c1\u0001\u0000\u0000"+
		"\u0000\u00ce!\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\f\u0000\u0000"+
		"\u00d0\u00d1\u0005#\u0000\u0000\u00d1\u00d2\u00038\u001c\u0000\u00d2\u00d3"+
		"\u0005$\u0000\u0000\u00d3\u00d4\u0005\'\u0000\u0000\u00d4\u00d5\u0003"+
		"\u0012\t\u0000\u00d5\u00d6\u0005(\u0000\u0000\u00d6\u00de\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0005\f\u0000\u0000\u00d8\u00d9\u0005#\u0000"+
		"\u0000\u00d9\u00da\u00038\u001c\u0000\u00da\u00db\u0005$\u0000\u0000\u00db"+
		"\u00dc\u0003\u0014\n\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00cf"+
		"\u0001\u0000\u0000\u0000\u00dd\u00d7\u0001\u0000\u0000\u0000\u00de#\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0005\u0007\u0000\u0000\u00e0\u00e4\u0005"+
		"#\u0000\u0000\u00e1\u00e5\u0003\u001a\r\u0000\u00e2\u00e5\u0003:\u001d"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0005)\u0000\u0000"+
		"\u00e7\u00ea\u00038\u001c\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ef\u0005)\u0000\u0000\u00ec\u00f0"+
		"\u0003:\u001d\u0000\u00ed\u00f0\u0003<\u001e\u0000\u00ee\u00f0\u0003>"+
		"\u001f\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0005$\u0000\u0000\u00f2\u00f3\u0005\'\u0000"+
		"\u0000\u00f3\u00f4\u0003\u0012\t\u0000\u00f4\u00f5\u0005(\u0000\u0000"+
		"\u00f5\u010c\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0007\u0000\u0000"+
		"\u00f7\u00fb\u0005#\u0000\u0000\u00f8\u00fc\u0003\u001a\r\u0000\u00f9"+
		"\u00fc\u0003:\u001d\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0100"+
		"\u0005)\u0000\u0000\u00fe\u0101\u00038\u001c\u0000\u00ff\u0101\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0106\u0005)\u0000"+
		"\u0000\u0103\u0107\u0003:\u001d\u0000\u0104\u0107\u0003<\u001e\u0000\u0105"+
		"\u0107\u0003>\u001f\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0106\u0104"+
		"\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0005$\u0000\u0000\u0109\u010a\u0003"+
		"\u0014\n\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u00df\u0001\u0000"+
		"\u0000\u0000\u010b\u00f6\u0001\u0000\u0000\u0000\u010c%\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0005\u000b\u0000\u0000\u010e\u010f\u0005#\u0000\u0000"+
		"\u010f\u0110\u00038\u001c\u0000\u0110\u0111\u0005$\u0000\u0000\u0111\u0112"+
		"\u0005\'\u0000\u0000\u0112\u0113\u0003(\u0014\u0000\u0113\u0114\u0003"+
		",\u0016\u0000\u0114\u0115\u0005(\u0000\u0000\u0115\u011f\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005\u000b\u0000\u0000\u0117\u0118\u0005#\u0000\u0000"+
		"\u0118\u0119\u00038\u001c\u0000\u0119\u011a\u0005$\u0000\u0000\u011a\u011b"+
		"\u0005\'\u0000\u0000\u011b\u011c\u0003(\u0014\u0000\u011c\u011d\u0005"+
		"(\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u010d\u0001\u0000"+
		"\u0000\u0000\u011e\u0116\u0001\u0000\u0000\u0000\u011f\'\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0003*\u0015\u0000\u0121\u0122\u0003(\u0014\u0000\u0122"+
		"\u0125\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124"+
		"\u0120\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125"+
		")\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0003\u0000\u0000\u0127\u0128"+
		"\u0005#\u0000\u0000\u0128\u0129\u00038\u001c\u0000\u0129\u012a\u0005$"+
		"\u0000\u0000\u012a\u012b\u0005+\u0000\u0000\u012b\u012c\u0003\u0012\t"+
		"\u0000\u012c\u0133\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0003\u0000"+
		"\u0000\u012e\u012f\u00038\u001c\u0000\u012f\u0130\u0005+\u0000\u0000\u0130"+
		"\u0131\u0003\u0012\t\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0126"+
		"\u0001\u0000\u0000\u0000\u0132\u012d\u0001\u0000\u0000\u0000\u0133+\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005\u0005\u0000\u0000\u0135\u0136\u0005"+
		"+\u0000\u0000\u0136\u0139\u0003\u0012\t\u0000\u0137\u0139\u0001\u0000"+
		"\u0000\u0000\u0138\u0134\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000"+
		"\u0000\u0000\u0139-\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0002\u0000"+
		"\u0000\u013b\u013c\u0005)\u0000\u0000\u013c/\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0005\u0004\u0000\u0000\u013e\u013f\u0005)\u0000\u0000\u013f1\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0005\t\u0000\u0000\u0141\u0142\u00038"+
		"\u001c\u0000\u0142\u0143\u0005)\u0000\u0000\u0143\u0147\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005\t\u0000\u0000\u0145\u0147\u0005)\u0000\u0000"+
		"\u0146\u0140\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000"+
		"\u01473\u0001\u0000\u0000\u0000\u0148\u014b\u00038\u001c\u0000\u0149\u014b"+
		"\u0003:\u001d\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u0149\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0005"+
		")\u0000\u0000\u014d5\u0001\u0000\u0000\u0000\u014e\u014f\u0007\u0002\u0000"+
		"\u0000\u014f7\u0001\u0000\u0000\u0000\u0150\u0151\u0006\u001c\uffff\uffff"+
		"\u0000\u0151\u0152\u0005#\u0000\u0000\u0152\u0153\u00038\u001c\u0000\u0153"+
		"\u0154\u0005$\u0000\u0000\u0154\u015d\u0001\u0000\u0000\u0000\u0155\u015d"+
		"\u00036\u001b\u0000\u0156\u0157\u0003J%\u0000\u0157\u0158\u00038\u001c"+
		"\b\u0158\u015d\u0001\u0000\u0000\u0000\u0159\u015a\u0003H$\u0000\u015a"+
		"\u015b\u00038\u001c\u0007\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u0150"+
		"\u0001\u0000\u0000\u0000\u015c\u0155\u0001\u0000\u0000\u0000\u015c\u0156"+
		"\u0001\u0000\u0000\u0000\u015c\u0159\u0001\u0000\u0000\u0000\u015d\u017c"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\n\u0006\u0000\u0000\u015f\u0160\u0007"+
		"\u0003\u0000\u0000\u0160\u017b\u00038\u001c\u0007\u0161\u0162\n\u0005"+
		"\u0000\u0000\u0162\u0163\u0007\u0004\u0000\u0000\u0163\u017b\u00038\u001c"+
		"\u0006\u0164\u0165\n\u0004\u0000\u0000\u0165\u0166\u0007\u0005\u0000\u0000"+
		"\u0166\u017b\u00038\u001c\u0005\u0167\u0168\n\u0003\u0000\u0000\u0168"+
		"\u0169\u0007\u0006\u0000\u0000\u0169\u017b\u00038\u001c\u0004\u016a\u016b"+
		"\n\u0002\u0000\u0000\u016b\u016c\u0005\u001d\u0000\u0000\u016c\u017b\u0003"+
		"8\u001c\u0003\u016d\u016e\n\u0001\u0000\u0000\u016e\u016f\u0005\u001c"+
		"\u0000\u0000\u016f\u017b\u00038\u001c\u0002\u0170\u0171\n\u000b\u0000"+
		"\u0000\u0171\u0172\u0005\"\u0000\u0000\u0172\u017b\u0005,\u0000\u0000"+
		"\u0173\u0174\n\n\u0000\u0000\u0174\u017b\u0003L&\u0000\u0175\u0176\n\t"+
		"\u0000\u0000\u0176\u0177\u0005#\u0000\u0000\u0177\u0178\u0003@ \u0000"+
		"\u0178\u0179\u0005$\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a"+
		"\u015e\u0001\u0000\u0000\u0000\u017a\u0161\u0001\u0000\u0000\u0000\u017a"+
		"\u0164\u0001\u0000\u0000\u0000\u017a\u0167\u0001\u0000\u0000\u0000\u017a"+
		"\u016a\u0001\u0000\u0000\u0000\u017a\u016d\u0001\u0000\u0000\u0000\u017a"+
		"\u0170\u0001\u0000\u0000\u0000\u017a\u0173\u0001\u0000\u0000\u0000\u017a"+
		"\u0175\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c"+
		"\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d"+
		"9\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0185"+
		"\u0005,\u0000\u0000\u0180\u0181\u00038\u001c\u0000\u0181\u0182\u0005\""+
		"\u0000\u0000\u0182\u0183\u0005,\u0000\u0000\u0183\u0185\u0001\u0000\u0000"+
		"\u0000\u0184\u017f\u0001\u0000\u0000\u0000\u0184\u0180\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0005!\u0000\u0000"+
		"\u0187\u0188\u00038\u001c\u0000\u0188;\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0005\u001f\u0000\u0000\u018a\u018e\u0005,\u0000\u0000\u018b\u018c\u0005"+
		",\u0000\u0000\u018c\u018e\u0005\u001f\u0000\u0000\u018d\u0189\u0001\u0000"+
		"\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e=\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0005 \u0000\u0000\u0190\u0194\u0005,\u0000\u0000\u0191"+
		"\u0192\u0005,\u0000\u0000\u0192\u0194\u0005 \u0000\u0000\u0193\u018f\u0001"+
		"\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194?\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0003D\"\u0000\u0196\u0197\u0005*\u0000\u0000"+
		"\u0197\u0198\u0003B!\u0000\u0198\u019c\u0001\u0000\u0000\u0000\u0199\u019c"+
		"\u0003D\"\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0195\u0001"+
		"\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019a\u0001"+
		"\u0000\u0000\u0000\u019cA\u0001\u0000\u0000\u0000\u019d\u019e\u0003D\""+
		"\u0000\u019e\u019f\u0005*\u0000\u0000\u019f\u01a0\u0003B!\u0000\u01a0"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a1\u01a3\u0003D\"\u0000\u01a2\u019d"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3C\u0001"+
		"\u0000\u0000\u0000\u01a4\u01ad\u0005,\u0000\u0000\u01a5\u01ad\u0005-\u0000"+
		"\u0000\u01a6\u01ad\u00050\u0000\u0000\u01a7\u01ad\u0005.\u0000\u0000\u01a8"+
		"\u01a9\u00038\u001c\u0000\u01a9\u01aa\u0005\"\u0000\u0000\u01aa\u01ab"+
		"\u0005,\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01a4\u0001"+
		"\u0000\u0000\u0000\u01ac\u01a5\u0001\u0000\u0000\u0000\u01ac\u01a6\u0001"+
		"\u0000\u0000\u0000\u01ac\u01a7\u0001\u0000\u0000\u0000\u01ac\u01a8\u0001"+
		"\u0000\u0000\u0000\u01adE\u0001\u0000\u0000\u0000\u01ae\u01af\u0007\u0007"+
		"\u0000\u0000\u01afG\u0001\u0000\u0000\u0000\u01b0\u01b1\u0007\b\u0000"+
		"\u0000\u01b1I\u0001\u0000\u0000\u0000\u01b2\u01b3\u0007\t\u0000\u0000"+
		"\u01b3K\u0001\u0000\u0000\u0000\u01b4\u01b5\u0007\t\u0000\u0000\u01b5"+
		"M\u0001\u0000\u0000\u0000 UYir\u007f\u008b\u0091\u00a3\u00cd\u00dd\u00e4"+
		"\u00e9\u00ef\u00fb\u0100\u0106\u010b\u011e\u0124\u0132\u0138\u0146\u014a"+
		"\u015c\u017a\u017c\u0184\u018d\u0193\u019b\u01a2\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}