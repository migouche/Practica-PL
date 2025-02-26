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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, WHITE_SPACE=41, ID=42, INT_NUM=43, FLOAT_NUM=44, CONSTLIT=45, 
		ONE_LINE_COMMENT=46, MULTILINE_COMMENT=47;
	public static final int
		RULE_prg = 0, RULE_libimport = 1, RULE_blq = 2, RULE_dcllist = 3, RULE_sentlist = 4, 
		RULE_sentlist_p = 5, RULE_dcl = 6, RULE_defcte = 7, RULE_ctelist = 8, 
		RULE_ctelist_p = 9, RULE_simpvalue = 10, RULE_defvar = 11, RULE_defvarlist = 12, 
		RULE_defvarlist_p = 13, RULE_varlist = 14, RULE_defproc = 15, RULE_deffun = 16, 
		RULE_formal_paramlist = 17, RULE_formal_param = 18, RULE_tbas = 19, RULE_sent = 20, 
		RULE_asig = 21, RULE_exp = 22, RULE_exp_p = 23, RULE_op = 24, RULE_oparit = 25, 
		RULE_factor = 26, RULE_subparamlist = 27, RULE_explist = 28, RULE_proc_call = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "libimport", "blq", "dcllist", "sentlist", "sentlist_p", "dcl", 
			"defcte", "ctelist", "ctelist_p", "simpvalue", "defvar", "defvarlist", 
			"defvarlist_p", "varlist", "defproc", "deffun", "formal_paramlist", "formal_param", 
			"tbas", "sent", "asig", "exp", "exp_p", "op", "oparit", "factor", "subparamlist", 
			"explist", "proc_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'program'", "';'", "'.'", "'USES'", "'BEGIN'", "'begin'", 
			"'END'", "'end'", "'CONST'", "'const'", "'='", "'VAR'", "','", "'PROCEDURE'", 
			"'procedure'", "'FUNCTION'", "'function'", "':'", "'('", "')'", "'INTEGER'", 
			"'REAL'", "'BOOLEAN'", "'CHAR'", "'STRING'", "'integer'", "'real'", "'boolean'", 
			"'char'", "'string'", "':='", "'+'", "'-'", "'*'", "'/'", "'mod'", "'div'", 
			"'MOD'", "'DIV'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WHITE_SPACE", "ID", "INT_NUM", "FLOAT_NUM", 
			"CONSTLIT", "ONE_LINE_COMMENT", "MULTILINE_COMMENT"
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
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
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
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(T__1);
				setState(62);
				match(ID);
				setState(63);
				match(T__2);
				setState(64);
				blq();
				setState(65);
				match(T__3);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4 || _la==ID) {
					{
					{
					setState(66);
					libimport();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class LibimportContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__4);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(ID);
				setState(76);
				match(T__2);
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
	public static class BlqContext extends ParserRuleContext {
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			dcllist(0);
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			sentlist();
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DcllistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dcllist);
					setState(85);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(86);
					dcl();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public Sentlist_pContext sentlist_p() {
			return getRuleContext(Sentlist_pContext.class,0);
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
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			sent();
			setState(93);
			sentlist_p();
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
	public static class Sentlist_pContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist_pContext sentlist_p() {
			return getRuleContext(Sentlist_pContext.class,0);
		}
		public Sentlist_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterSentlist_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitSentlist_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitSentlist_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentlist_pContext sentlist_p() throws RecognitionException {
		Sentlist_pContext _localctx = new Sentlist_pContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentlist_p);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				sent();
				setState(97);
				sentlist_p();
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
		enterRule(_localctx, 12, RULE_dcl);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				defcte();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				defvar();
				}
				break;
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				defproc();
				}
				break;
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
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
		enterRule(_localctx, 14, RULE_defcte);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__10);
				setState(109);
				ctelist();
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
	public static class CtelistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist_pContext ctelist_p() {
			return getRuleContext(Ctelist_pContext.class,0);
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
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ctelist);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(ID);
				setState(113);
				match(T__11);
				setState(114);
				simpvalue();
				setState(115);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(ID);
				setState(118);
				match(T__11);
				setState(119);
				simpvalue();
				setState(120);
				match(T__2);
				setState(121);
				ctelist_p();
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
	public static class Ctelist_pContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist_pContext ctelist_p() {
			return getRuleContext(Ctelist_pContext.class,0);
		}
		public Ctelist_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterCtelist_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitCtelist_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitCtelist_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctelist_pContext ctelist_p() throws RecognitionException {
		Ctelist_pContext _localctx = new Ctelist_pContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ctelist_p);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(ID);
				setState(127);
				match(T__11);
				setState(128);
				simpvalue();
				setState(129);
				match(T__2);
				setState(130);
				ctelist_p();
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
	public static class SimpvalueContext extends ParserRuleContext {
		public TerminalNode FLOAT_NUM() { return getToken(transpilerParser.FLOAT_NUM, 0); }
		public TerminalNode INT_NUM() { return getToken(transpilerParser.INT_NUM, 0); }
		public TerminalNode CONSTLIT() { return getToken(transpilerParser.CONSTLIT, 0); }
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
		enterRule(_localctx, 20, RULE_simpvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) ) {
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
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_defvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			defvarlist();
			setState(138);
			match(T__2);
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
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Defvarlist_pContext defvarlist_p() {
			return getRuleContext(Defvarlist_pContext.class,0);
		}
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
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defvarlist);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				varlist();
				setState(141);
				match(T__3);
				setState(142);
				tbas();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__2);
				setState(145);
				varlist();
				setState(146);
				match(T__3);
				setState(147);
				tbas();
				setState(148);
				defvarlist_p();
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
	public static class Defvarlist_pContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Defvarlist_pContext defvarlist_p() {
			return getRuleContext(Defvarlist_pContext.class,0);
		}
		public Defvarlist_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterDefvarlist_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitDefvarlist_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitDefvarlist_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defvarlist_pContext defvarlist_p() throws RecognitionException {
		Defvarlist_pContext _localctx = new Defvarlist_pContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defvarlist_p);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__2);
				setState(154);
				varlist();
				setState(155);
				match(T__3);
				setState(156);
				tbas();
				setState(157);
				defvarlist_p();
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
	public static class VarlistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
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
		enterRule(_localctx, 28, RULE_varlist);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(ID);
				setState(163);
				match(T__13);
				setState(164);
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
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
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
		enterRule(_localctx, 30, RULE_defproc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			match(ID);
			setState(169);
			formal_paramlist();
			setState(170);
			match(T__2);
			setState(171);
			blq();
			setState(172);
			match(T__2);
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
		public TerminalNode ID() { return getToken(transpilerParser.ID, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
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
		enterRule(_localctx, 32, RULE_deffun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(175);
			match(ID);
			setState(176);
			formal_paramlist();
			setState(177);
			match(T__18);
			setState(178);
			tbas();
			setState(179);
			match(T__2);
			setState(180);
			blq();
			setState(181);
			match(T__2);
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
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_formal_paramlist);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__19);
				setState(185);
				formal_param();
				setState(186);
				match(T__20);
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
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_formal_param);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				varlist();
				setState(191);
				match(T__18);
				setState(192);
				tbas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				varlist();
				setState(195);
				match(T__18);
				setState(196);
				tbas();
				setState(197);
				match(T__2);
				setState(198);
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
		enterRule(_localctx, 38, RULE_tbas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4290772992L) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_sent);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				asig();
				setState(205);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				proc_call();
				setState(208);
				match(T__2);
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
		enterRule(_localctx, 42, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(213);
			match(T__31);
			setState(214);
			exp();
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
		public Exp_pContext exp_p() {
			return getRuleContext(Exp_pContext.class,0);
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
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			factor();
			setState(217);
			exp_p();
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
	public static class Exp_pContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_pContext exp_p() {
			return getRuleContext(Exp_pContext.class,0);
		}
		public Exp_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterExp_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitExp_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitExp_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_pContext exp_p() throws RecognitionException {
		Exp_pContext _localctx = new Exp_pContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp_p);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				op();
				setState(220);
				exp();
				setState(221);
				exp_p();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
		enterRule(_localctx, 48, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 50, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2190433320960L) != 0)) ) {
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_factor);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUM:
			case FLOAT_NUM:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				simpvalue();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(T__19);
				setState(232);
				exp();
				setState(233);
				match(T__20);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(ID);
				setState(236);
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
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_subparamlist);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__13:
			case T__20:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__19);
				setState(241);
				explist();
				setState(242);
				match(T__20);
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
	public static class ExplistContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_explist);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				exp();
				setState(248);
				match(T__13);
				setState(249);
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
		enterRule(_localctx, 58, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ID);
			setState(254);
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

	public static final String _serializedATN =
		"\u0004\u0001/\u0101\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"D\b\u0000\n\u0000\f\u0000G\t\u0000\u0003\u0000I\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003X\b\u0003\n\u0003\f\u0003[\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005d\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006j\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007o\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b|\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0085\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0097\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a0\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00a6\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00bd\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00c9\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d3"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u00e1\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u00ee\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00f5\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00fc\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0001\u0006\u001e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:\u0000\b\u0001\u0000\u0006\u0007\u0001\u0000\b\t"+
		"\u0001\u0000+-\u0001\u0000\r\r\u0001\u0000\u000f\u0010\u0001\u0000\u0011"+
		"\u0012\u0001\u0000\u0016\u001f\u0001\u0000!(\u00f8\u0000H\u0001\u0000"+
		"\u0000\u0000\u0002M\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000"+
		"\u0006T\u0001\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000\nc\u0001\u0000"+
		"\u0000\u0000\fi\u0001\u0000\u0000\u0000\u000en\u0001\u0000\u0000\u0000"+
		"\u0010{\u0001\u0000\u0000\u0000\u0012\u0084\u0001\u0000\u0000\u0000\u0014"+
		"\u0086\u0001\u0000\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000\u0018"+
		"\u0096\u0001\u0000\u0000\u0000\u001a\u009f\u0001\u0000\u0000\u0000\u001c"+
		"\u00a5\u0001\u0000\u0000\u0000\u001e\u00a7\u0001\u0000\u0000\u0000 \u00ae"+
		"\u0001\u0000\u0000\u0000\"\u00bc\u0001\u0000\u0000\u0000$\u00c8\u0001"+
		"\u0000\u0000\u0000&\u00ca\u0001\u0000\u0000\u0000(\u00d2\u0001\u0000\u0000"+
		"\u0000*\u00d4\u0001\u0000\u0000\u0000,\u00d8\u0001\u0000\u0000\u0000."+
		"\u00e0\u0001\u0000\u0000\u00000\u00e2\u0001\u0000\u0000\u00002\u00e4\u0001"+
		"\u0000\u0000\u00004\u00ed\u0001\u0000\u0000\u00006\u00f4\u0001\u0000\u0000"+
		"\u00008\u00fb\u0001\u0000\u0000\u0000:\u00fd\u0001\u0000\u0000\u0000<"+
		"I\u0005\u0001\u0000\u0000=>\u0005\u0002\u0000\u0000>?\u0005*\u0000\u0000"+
		"?@\u0005\u0003\u0000\u0000@A\u0003\u0004\u0002\u0000AE\u0005\u0004\u0000"+
		"\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000H<\u0001\u0000\u0000\u0000"+
		"H=\u0001\u0000\u0000\u0000I\u0001\u0001\u0000\u0000\u0000JN\u0005\u0005"+
		"\u0000\u0000KL\u0005*\u0000\u0000LN\u0005\u0003\u0000\u0000MJ\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000N\u0003\u0001\u0000\u0000\u0000"+
		"OP\u0003\u0006\u0003\u0000PQ\u0007\u0000\u0000\u0000QR\u0003\b\u0004\u0000"+
		"RS\u0007\u0001\u0000\u0000S\u0005\u0001\u0000\u0000\u0000TY\u0006\u0003"+
		"\uffff\uffff\u0000UV\n\u0001\u0000\u0000VX\u0003\f\u0006\u0000WU\u0001"+
		"\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\u0007\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\]\u0003(\u0014\u0000]^\u0003\n\u0005\u0000^\t\u0001\u0000"+
		"\u0000\u0000_d\u0001\u0000\u0000\u0000`a\u0003(\u0014\u0000ab\u0003\n"+
		"\u0005\u0000bd\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000c`\u0001"+
		"\u0000\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ej\u0003\u000e\u0007"+
		"\u0000fj\u0003\u0016\u000b\u0000gj\u0003\u001e\u000f\u0000hj\u0003 \u0010"+
		"\u0000ie\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000ko\u0005"+
		"\n\u0000\u0000lm\u0005\u000b\u0000\u0000mo\u0003\u0010\b\u0000nk\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000o\u000f\u0001\u0000\u0000"+
		"\u0000pq\u0005*\u0000\u0000qr\u0005\f\u0000\u0000rs\u0003\u0014\n\u0000"+
		"st\u0005\u0003\u0000\u0000t|\u0001\u0000\u0000\u0000uv\u0005*\u0000\u0000"+
		"vw\u0005\f\u0000\u0000wx\u0003\u0014\n\u0000xy\u0005\u0003\u0000\u0000"+
		"yz\u0003\u0012\t\u0000z|\u0001\u0000\u0000\u0000{p\u0001\u0000\u0000\u0000"+
		"{u\u0001\u0000\u0000\u0000|\u0011\u0001\u0000\u0000\u0000}\u0085\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005*\u0000\u0000\u007f\u0080\u0005\f\u0000"+
		"\u0000\u0080\u0081\u0003\u0014\n\u0000\u0081\u0082\u0005\u0003\u0000\u0000"+
		"\u0082\u0083\u0003\u0012\t\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084"+
		"}\u0001\u0000\u0000\u0000\u0084~\u0001\u0000\u0000\u0000\u0085\u0013\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0007\u0002\u0000\u0000\u0087\u0015\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0007\u0003\u0000\u0000\u0089\u008a\u0003"+
		"\u0018\f\u0000\u008a\u008b\u0005\u0003\u0000\u0000\u008b\u0017\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0003\u001c\u000e\u0000\u008d\u008e\u0005\u0004"+
		"\u0000\u0000\u008e\u008f\u0003&\u0013\u0000\u008f\u0097\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0092\u0003\u001c\u000e"+
		"\u0000\u0092\u0093\u0005\u0004\u0000\u0000\u0093\u0094\u0003&\u0013\u0000"+
		"\u0094\u0095\u0003\u001a\r\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096"+
		"\u008c\u0001\u0000\u0000\u0000\u0096\u0090\u0001\u0000\u0000\u0000\u0097"+
		"\u0019\u0001\u0000\u0000\u0000\u0098\u00a0\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\u0003\u0000\u0000\u009a\u009b\u0003\u001c\u000e\u0000\u009b"+
		"\u009c\u0005\u0004\u0000\u0000\u009c\u009d\u0003&\u0013\u0000\u009d\u009e"+
		"\u0003\u001a\r\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u0098\u0001"+
		"\u0000\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u00a0\u001b\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a6\u0005*\u0000\u0000\u00a2\u00a3\u0005*\u0000"+
		"\u0000\u00a3\u00a4\u0005\u000e\u0000\u0000\u00a4\u00a6\u0003\u001c\u000e"+
		"\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a6\u001d\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007\u0004\u0000"+
		"\u0000\u00a8\u00a9\u0005*\u0000\u0000\u00a9\u00aa\u0003\"\u0011\u0000"+
		"\u00aa\u00ab\u0005\u0003\u0000\u0000\u00ab\u00ac\u0003\u0004\u0002\u0000"+
		"\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u001f\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0007\u0005\u0000\u0000\u00af\u00b0\u0005*\u0000\u0000\u00b0"+
		"\u00b1\u0003\"\u0011\u0000\u00b1\u00b2\u0005\u0013\u0000\u0000\u00b2\u00b3"+
		"\u0003&\u0013\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4\u00b5\u0003"+
		"\u0004\u0002\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000\u00b6!\u0001\u0000"+
		"\u0000\u0000\u00b7\u00bd\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0014"+
		"\u0000\u0000\u00b9\u00ba\u0003$\u0012\u0000\u00ba\u00bb\u0005\u0015\u0000"+
		"\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bd#\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0003\u001c\u000e\u0000\u00bf\u00c0\u0005\u0013\u0000\u0000"+
		"\u00c0\u00c1\u0003&\u0013\u0000\u00c1\u00c9\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0003\u001c\u000e\u0000\u00c3\u00c4\u0005\u0013\u0000\u0000\u00c4"+
		"\u00c5\u0003&\u0013\u0000\u00c5\u00c6\u0005\u0003\u0000\u0000\u00c6\u00c7"+
		"\u0003$\u0012\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00be\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c9%\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0007\u0006\u0000\u0000\u00cb\'\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0003*\u0015\u0000\u00cd\u00ce\u0005\u0003\u0000\u0000"+
		"\u00ce\u00d3\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003:\u001d\u0000\u00d0"+
		"\u00d1\u0005\u0003\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cc\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d3"+
		")\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005*\u0000\u0000\u00d5\u00d6\u0005"+
		" \u0000\u0000\u00d6\u00d7\u0003,\u0016\u0000\u00d7+\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u00034\u001a\u0000\u00d9\u00da\u0003.\u0017\u0000\u00da"+
		"-\u0001\u0000\u0000\u0000\u00db\u00dc\u00030\u0018\u0000\u00dc\u00dd\u0003"+
		",\u0016\u0000\u00dd\u00de\u0003.\u0017\u0000\u00de\u00e1\u0001\u0000\u0000"+
		"\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00db\u0001\u0000\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1/\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u00032\u0019\u0000\u00e31\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0007\u0007\u0000\u0000\u00e53\u0001\u0000\u0000\u0000\u00e6\u00ee\u0003"+
		"\u0014\n\u0000\u00e7\u00e8\u0005\u0014\u0000\u0000\u00e8\u00e9\u0003,"+
		"\u0016\u0000\u00e9\u00ea\u0005\u0015\u0000\u0000\u00ea\u00ee\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0005*\u0000\u0000\u00ec\u00ee\u00036\u001b\u0000"+
		"\u00ed\u00e6\u0001\u0000\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee5\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0014\u0000\u0000\u00f1"+
		"\u00f2\u00038\u001c\u0000\u00f2\u00f3\u0005\u0015\u0000\u0000\u00f3\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f4\u00ef\u0001\u0000\u0000\u0000\u00f4\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f57\u0001\u0000\u0000\u0000\u00f6\u00fc\u0003"+
		",\u0016\u0000\u00f7\u00f8\u0003,\u0016\u0000\u00f8\u00f9\u0005\u000e\u0000"+
		"\u0000\u00f9\u00fa\u00038\u001c\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fc9\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005*\u0000\u0000\u00fe\u00ff"+
		"\u00036\u001b\u0000\u00ff;\u0001\u0000\u0000\u0000\u0013EHMYcin{\u0084"+
		"\u0096\u009f\u00a5\u00bc\u00c8\u00d2\u00e0\u00ed\u00f4\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}