// Generated from C:/Users/ferch/Desktop/GITHUB/Practica-PL/transpiler.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class transpilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, BEGIN=2, END=3, PROCEDURE=4, VAR=5, PROGRAM=6, USES=7, CONST=8, 
		INT=9, FLOAT=10, CONSTINT=11, CONSTFLOAT=12, DOT=13, OPEN_PAREN=14, CLOSE_PAREN=15, 
		OPEN_BRACKET=16, CLOSE_BRACKET=17, SEMICOLON=18, COLON=19, COMMA=20, WALRUS=21, 
		PLUS=22, MINUS=23, TIMES=24, SLASH=25, AT=26, HASH=27, CARET=28, MOD=29, 
		DIV=30, EQUAL=31, NOT_EQUAL=32, LESS_THAN=33, GREATER_THAN=34, LESS_OR_EQUAL=35, 
		GREATER_OR_EQUAL=36, AND=37, OR=38, NOT=39, IN=40, WHITE_SPACE=41, ID=42, 
		INT_NUM=43, FLOAT_NUM=44, CONSTLIT=45, ONE_LINE_COMMENT=46, MULTILINE_COMMENT=47;
	public static final int
		RULE_prg = 0, RULE_libimport = 1, RULE_blq = 2, RULE_dcllist = 3, RULE_sentlist = 4, 
		RULE_dcl = 5, RULE_defcte = 6, RULE_ctelist = 7, RULE_simpvalue = 8, RULE_defvar = 9, 
		RULE_defvarlist = 10, RULE_varlist = 11, RULE_defproc = 12, RULE_deffun = 13, 
		RULE_formal_paramlist = 14, RULE_formal_param = 15, RULE_tbas = 16, RULE_sent = 17, 
		RULE_asig = 18, RULE_exp = 19, RULE_op = 20, RULE_oparit = 21, RULE_factor = 22, 
		RULE_subparamlist = 23, RULE_explist = 24, RULE_proc_call = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "libimport", "blq", "dcllist", "sentlist", "dcl", "defcte", "ctelist", 
			"simpvalue", "defvar", "defvarlist", "varlist", "defproc", "deffun", 
			"formal_paramlist", "formal_param", "tbas", "sent", "asig", "exp", "op", 
			"oparit", "factor", "subparamlist", "explist", "proc_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'.'", "'('", "')'", "'['", "']'", "';'", "':'", "','", "':='", 
			"'+'", "'-'", "'*'", "'/'", "'@'", "'#'", "'^'", "'mod'", "'div'", "'='", 
			"'<>'", "'<'", "'>'", "'<='", "'>='", "'and'", "'or'", "'not'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "BEGIN", "END", "PROCEDURE", "VAR", "PROGRAM", "USES", 
			"CONST", "INT", "FLOAT", "CONSTINT", "CONSTFLOAT", "DOT", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "SEMICOLON", "COLON", 
			"COMMA", "WALRUS", "PLUS", "MINUS", "TIMES", "SLASH", "AT", "HASH", "CARET", 
			"MOD", "DIV", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", "LESS_OR_EQUAL", 
			"GREATER_OR_EQUAL", "AND", "OR", "NOT", "IN", "WHITE_SPACE", "ID", "INT_NUM", 
			"FLOAT_NUM", "CONSTLIT", "ONE_LINE_COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "transpiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public transpilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(transpilerParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(transpilerParser.SEMICOLON, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public TerminalNode DOT() { return getToken(transpilerParser.DOT, 0); }
		public List<LibimportContext> libimport() {
			return getRuleContexts(LibimportContext.class);
		}
		public LibimportContext libimport(int i) {
			return getRuleContext(LibimportContext.class,i);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(PROGRAM);
			setState(53);
			match(ID);
			setState(54);
			match(SEMICOLON);
			setState(55);
			blq();
			setState(56);
			match(DOT);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USES) {
				{
				{
				setState(57);
				libimport();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class LibimportContext extends ParserRuleContext {
		public TerminalNode USES() { return getToken(transpilerParser.USES, 0); }
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(transpilerParser.SEMICOLON, 0); }
		public LibimportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libimport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterLibimport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitLibimport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitLibimport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibimportContext libimport() throws RecognitionException {
		LibimportContext _localctx = new LibimportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_libimport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(USES);
			setState(64);
			match(ID);
			setState(65);
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
	public static class BlqContext extends ParserRuleContext {
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(transpilerParser.BEGIN, 0); }
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode END() { return getToken(transpilerParser.END, 0); }
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			dcllist(0);
			setState(68);
			match(BEGIN);
			setState(69);
			sentlist(0);
			setState(70);
			match(END);
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
	public static class DcllistContext extends ParserRuleContext {
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		return dcllist(0);
	}

	private DcllistContext dcllist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DcllistContext _localctx = new DcllistContext(_ctx, _parentState);
		DcllistContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_dcllist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DcllistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dcllist);
					setState(73);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(74);
					dcl();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		return sentlist(0);
	}

	private SentlistContext sentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SentlistContext _localctx = new SentlistContext(_ctx, _parentState);
		SentlistContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_sentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(81);
			sent();
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sentlist);
					setState(83);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(84);
					sent();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class DclContext extends ParserRuleContext {
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefprocContext defproc() {
			return getRuleContext(DefprocContext.class,0);
		}
		public DeffunContext deffun() {
			return getRuleContext(DeffunContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dcl);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				defcte();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				defvar();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				defproc();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				deffun();
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
	public static class DefcteContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(transpilerParser.CONST, 0); }
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitDefcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(CONST);
			setState(97);
			ctelist(0);
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
	public static class CtelistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(transpilerParser.EQUAL, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(transpilerParser.SEMICOLON, 0); }
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		return ctelist(0);
	}

	private CtelistContext ctelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CtelistContext _localctx = new CtelistContext(_ctx, _parentState);
		CtelistContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_ctelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(100);
			match(ID);
			setState(101);
			match(EQUAL);
			setState(102);
			simpvalue();
			setState(103);
			match(SEMICOLON);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CtelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ctelist);
					setState(105);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(106);
					match(ID);
					setState(107);
					match(EQUAL);
					setState(108);
					simpvalue();
					setState(109);
					match(SEMICOLON);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class SimpvalueContext extends ParserRuleContext {
		public TerminalNode FLOAT_NUM() { return getToken(transpilerParser.FLOAT_NUM, 0); }
		public TerminalNode INT_NUM() { return getToken(transpilerParser.INT_NUM, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==INT_NUM || _la==FLOAT_NUM) ) {
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
	public static class DefvarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(transpilerParser.VAR, 0); }
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(transpilerParser.SEMICOLON, 0); }
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(VAR);
			setState(119);
			defvarlist(0);
			setState(120);
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
	public static class DefvarlistContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TerminalNode COLON() { return getToken(transpilerParser.COLON, 0); }
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(transpilerParser.SEMICOLON, 0); }
		public DefvarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterDefvarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitDefvarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitDefvarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistContext defvarlist() throws RecognitionException {
		return defvarlist(0);
	}

	private DefvarlistContext defvarlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, _parentState);
		DefvarlistContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_defvarlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			varlist();
			setState(124);
			match(COLON);
			setState(125);
			tbas();
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DefvarlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_defvarlist);
					setState(127);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(128);
					match(SEMICOLON);
					setState(129);
					varlist();
					setState(130);
					match(COLON);
					setState(131);
					tbas();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class VarlistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(transpilerParser.COMMA, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varlist);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(ID);
				setState(140);
				match(COMMA);
				setState(141);
				varlist();
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
	public static class DefprocContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(transpilerParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(transpilerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(transpilerParser.SEMICOLON, i);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DefprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterDefproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitDefproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitDefproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefprocContext defproc() throws RecognitionException {
		DefprocContext _localctx = new DefprocContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(PROCEDURE);
			setState(145);
			match(ID);
			setState(146);
			formal_paramlist();
			setState(147);
			match(SEMICOLON);
			setState(148);
			blq();
			setState(149);
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
	public static class DeffunContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(transpilerParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public TerminalNode COLON() { return getToken(transpilerParser.COLON, 0); }
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(transpilerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(transpilerParser.SEMICOLON, i);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DeffunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterDeffun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitDeffun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitDeffun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffunContext deffun() throws RecognitionException {
		DeffunContext _localctx = new DeffunContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_deffun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(FUNCTION);
			setState(152);
			match(ID);
			setState(153);
			formal_paramlist();
			setState(154);
			match(COLON);
			setState(155);
			tbas();
			setState(156);
			match(SEMICOLON);
			setState(157);
			blq();
			setState(158);
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
	public static class Formal_paramlistContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(transpilerParser.OPEN_PAREN, 0); }
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(transpilerParser.CLOSE_PAREN, 0); }
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_formal_paramlist);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(OPEN_PAREN);
				setState(162);
				formal_param();
				setState(163);
				match(CLOSE_PAREN);
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
	public static class Formal_paramContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TerminalNode COLON() { return getToken(transpilerParser.COLON, 0); }
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(transpilerParser.SEMICOLON, 0); }
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterFormal_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitFormal_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitFormal_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_formal_param);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				varlist();
				setState(168);
				match(COLON);
				setState(169);
				tbas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				varlist();
				setState(172);
				match(COLON);
				setState(173);
				tbas();
				setState(174);
				match(SEMICOLON);
				setState(175);
				formal_param();
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
	public static class TbasContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(transpilerParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(transpilerParser.FLOAT, 0); }
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tbas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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
	public static class SentContext extends ParserRuleContext {
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(transpilerParser.SEMICOLON, 0); }
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sent);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				asig();
				setState(182);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				proc_call();
				setState(185);
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
	public static class AsigContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public TerminalNode WALRUS() { return getToken(transpilerParser.WALRUS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			setState(190);
			match(WALRUS);
			setState(191);
			exp(0);
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
	public static class ExpContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(196);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(197);
					op();
					setState(198);
					exp(3);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class OpContext extends ParserRuleContext {
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			oparit();
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
	public static class OparitContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(transpilerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(transpilerParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(transpilerParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(transpilerParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(transpilerParser.MOD, 0); }
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitOparit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitOparit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1639972864L) != 0)) ) {
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
	public static class FactorContext extends ParserRuleContext {
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(transpilerParser.OPEN_PAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(transpilerParser.CLOSE_PAREN, 0); }
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUM:
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				simpvalue();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(OPEN_PAREN);
				setState(211);
				exp(0);
				setState(212);
				match(CLOSE_PAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(ID);
				setState(215);
				subparamlist();
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
	public static class SubparamlistContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(transpilerParser.OPEN_PAREN, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(transpilerParser.CLOSE_PAREN, 0); }
		public SubparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterSubparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitSubparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitSubparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubparamlistContext subparamlist() throws RecognitionException {
		SubparamlistContext _localctx = new SubparamlistContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subparamlist);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(OPEN_PAREN);
				setState(220);
				explist();
				setState(221);
				match(CLOSE_PAREN);
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
	public static class ExplistContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(transpilerParser.COMMA, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_explist);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				exp(0);
				setState(227);
				match(COMMA);
				setState(228);
				explist();
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
	public static class Proc_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ID);
			setState(233);
			subparamlist();
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
		case 3:
			return dcllist_sempred((DcllistContext)_localctx, predIndex);
		case 4:
			return sentlist_sempred((SentlistContext)_localctx, predIndex);
		case 7:
			return ctelist_sempred((CtelistContext)_localctx, predIndex);
		case 10:
			return defvarlist_sempred((DefvarlistContext)_localctx, predIndex);
		case 19:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dcllist_sempred(DcllistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sentlist_sempred(SentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ctelist_sempred(CtelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean defvarlist_sempred(DefvarlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004\f\u0004"+
		"Y\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"_\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007p\b\u0007"+
		"\n\u0007\f\u0007s\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0086\b\n\n\n\f\n\u0089\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008f\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a6\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b2\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00bc\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u00c9\b\u0013\n\u0013\f\u0013\u00cc\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u00d9\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u00e0\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u00e7\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0000\u0005\u0006\b\u000e\u0014&\u001a\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02\u0000\u0003\u0001\u0000+,\u0001\u0000\t\n\u0002\u0000\u0016\u0018"+
		"\u001d\u001e\u00e2\u00004\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000"+
		"\u0000\u0004C\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\b"+
		"P\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000"+
		"\u0000\u000ec\u0001\u0000\u0000\u0000\u0010t\u0001\u0000\u0000\u0000\u0012"+
		"v\u0001\u0000\u0000\u0000\u0014z\u0001\u0000\u0000\u0000\u0016\u008e\u0001"+
		"\u0000\u0000\u0000\u0018\u0090\u0001\u0000\u0000\u0000\u001a\u0097\u0001"+
		"\u0000\u0000\u0000\u001c\u00a5\u0001\u0000\u0000\u0000\u001e\u00b1\u0001"+
		"\u0000\u0000\u0000 \u00b3\u0001\u0000\u0000\u0000\"\u00bb\u0001\u0000"+
		"\u0000\u0000$\u00bd\u0001\u0000\u0000\u0000&\u00c1\u0001\u0000\u0000\u0000"+
		"(\u00cd\u0001\u0000\u0000\u0000*\u00cf\u0001\u0000\u0000\u0000,\u00d8"+
		"\u0001\u0000\u0000\u0000.\u00df\u0001\u0000\u0000\u00000\u00e6\u0001\u0000"+
		"\u0000\u00002\u00e8\u0001\u0000\u0000\u000045\u0005\u0006\u0000\u0000"+
		"56\u0005*\u0000\u000067\u0005\u0012\u0000\u000078\u0003\u0004\u0002\u0000"+
		"8<\u0005\r\u0000\u00009;\u0003\u0002\u0001\u0000:9\u0001\u0000\u0000\u0000"+
		";>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=\u0001\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0007\u0000\u0000@A\u0005*\u0000\u0000AB\u0005\u0012\u0000\u0000B\u0003"+
		"\u0001\u0000\u0000\u0000CD\u0003\u0006\u0003\u0000DE\u0005\u0002\u0000"+
		"\u0000EF\u0003\b\u0004\u0000FG\u0005\u0003\u0000\u0000G\u0005\u0001\u0000"+
		"\u0000\u0000HM\u0006\u0003\uffff\uffff\u0000IJ\n\u0001\u0000\u0000JL\u0003"+
		"\n\u0005\u0000KI\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0007\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PQ\u0006\u0004\uffff\uffff\u0000QR\u0003"+
		"\"\u0011\u0000RW\u0001\u0000\u0000\u0000ST\n\u0001\u0000\u0000TV\u0003"+
		"\"\u0011\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\t\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000Z_\u0003\f\u0006\u0000[_\u0003\u0012\t\u0000"+
		"\\_\u0003\u0018\f\u0000]_\u0003\u001a\r\u0000^Z\u0001\u0000\u0000\u0000"+
		"^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0005\b\u0000\u0000ab\u0003\u000e"+
		"\u0007\u0000b\r\u0001\u0000\u0000\u0000cd\u0006\u0007\uffff\uffff\u0000"+
		"de\u0005*\u0000\u0000ef\u0005\u001f\u0000\u0000fg\u0003\u0010\b\u0000"+
		"gh\u0005\u0012\u0000\u0000hq\u0001\u0000\u0000\u0000ij\n\u0001\u0000\u0000"+
		"jk\u0005*\u0000\u0000kl\u0005\u001f\u0000\u0000lm\u0003\u0010\b\u0000"+
		"mn\u0005\u0012\u0000\u0000np\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000r\u000f\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"tu\u0007\u0000\u0000\u0000u\u0011\u0001\u0000\u0000\u0000vw\u0005\u0005"+
		"\u0000\u0000wx\u0003\u0014\n\u0000xy\u0005\u0012\u0000\u0000y\u0013\u0001"+
		"\u0000\u0000\u0000z{\u0006\n\uffff\uffff\u0000{|\u0003\u0016\u000b\u0000"+
		"|}\u0005\u0013\u0000\u0000}~\u0003 \u0010\u0000~\u0087\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\n\u0001\u0000\u0000\u0080\u0081\u0005\u0012\u0000\u0000"+
		"\u0081\u0082\u0003\u0016\u000b\u0000\u0082\u0083\u0005\u0013\u0000\u0000"+
		"\u0083\u0084\u0003 \u0010\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085"+
		"\u007f\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0015\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u008f\u0005*\u0000\u0000\u008b\u008c\u0005*\u0000\u0000\u008c\u008d\u0005"+
		"\u0014\u0000\u0000\u008d\u008f\u0003\u0016\u000b\u0000\u008e\u008a\u0001"+
		"\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008f\u0017\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0092\u0005"+
		"*\u0000\u0000\u0092\u0093\u0003\u001c\u000e\u0000\u0093\u0094\u0005\u0012"+
		"\u0000\u0000\u0094\u0095\u0003\u0004\u0002\u0000\u0095\u0096\u0005\u0012"+
		"\u0000\u0000\u0096\u0019\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0001"+
		"\u0000\u0000\u0098\u0099\u0005*\u0000\u0000\u0099\u009a\u0003\u001c\u000e"+
		"\u0000\u009a\u009b\u0005\u0013\u0000\u0000\u009b\u009c\u0003 \u0010\u0000"+
		"\u009c\u009d\u0005\u0012\u0000\u0000\u009d\u009e\u0003\u0004\u0002\u0000"+
		"\u009e\u009f\u0005\u0012\u0000\u0000\u009f\u001b\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a6\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u000e\u0000\u0000"+
		"\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3\u00a4\u0005\u000f\u0000\u0000"+
		"\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a6\u001d\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0003\u0016\u000b\u0000\u00a8\u00a9\u0005\u0013\u0000\u0000"+
		"\u00a9\u00aa\u0003 \u0010\u0000\u00aa\u00b2\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0003\u0016\u000b\u0000\u00ac\u00ad\u0005\u0013\u0000\u0000\u00ad"+
		"\u00ae\u0003 \u0010\u0000\u00ae\u00af\u0005\u0012\u0000\u0000\u00af\u00b0"+
		"\u0003\u001e\u000f\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00a7"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b2\u001f"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0001\u0000\u0000\u00b4!\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0003$\u0012\u0000\u00b6\u00b7\u0005\u0012"+
		"\u0000\u0000\u00b7\u00bc\u0001\u0000\u0000\u0000\u00b8\u00b9\u00032\u0019"+
		"\u0000\u00b9\u00ba\u0005\u0012\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bc#\u0001\u0000\u0000\u0000\u00bd\u00be\u0005*\u0000\u0000\u00be"+
		"\u00bf\u0005\u0015\u0000\u0000\u00bf\u00c0\u0003&\u0013\u0000\u00c0%\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0006\u0013\uffff\uffff\u0000\u00c2\u00c3"+
		"\u0003,\u0016\u0000\u00c3\u00ca\u0001\u0000\u0000\u0000\u00c4\u00c5\n"+
		"\u0002\u0000\u0000\u00c5\u00c6\u0003(\u0014\u0000\u00c6\u00c7\u0003&\u0013"+
		"\u0003\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\'\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003*\u0015\u0000\u00ce"+
		")\u0001\u0000\u0000\u0000\u00cf\u00d0\u0007\u0002\u0000\u0000\u00d0+\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d9\u0003\u0010\b\u0000\u00d2\u00d3\u0005\u000e"+
		"\u0000\u0000\u00d3\u00d4\u0003&\u0013\u0000\u00d4\u00d5\u0005\u000f\u0000"+
		"\u0000\u00d5\u00d9\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005*\u0000\u0000"+
		"\u00d7\u00d9\u0003.\u0017\u0000\u00d8\u00d1\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9"+
		"-\u0001\u0000\u0000\u0000\u00da\u00e0\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005\u000e\u0000\u0000\u00dc\u00dd\u00030\u0018\u0000\u00dd\u00de\u0005"+
		"\u000f\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00da\u0001"+
		"\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00e0/\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e7\u0003&\u0013\u0000\u00e2\u00e3\u0003&\u0013\u0000"+
		"\u00e3\u00e4\u0005\u0014\u0000\u0000\u00e4\u00e5\u00030\u0018\u0000\u00e5"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e71\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005*\u0000\u0000\u00e9\u00ea\u0003.\u0017\u0000\u00ea3\u0001\u0000"+
		"\u0000\u0000\u000e<MW^q\u0087\u008e\u00a5\u00b1\u00bb\u00ca\u00d8\u00df"+
		"\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}