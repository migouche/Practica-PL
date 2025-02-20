// Generated from C:/Users/migou/codes/URJC/PL/Practica-PL/transpiler.g4 by ANTLR 4.13.2
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
		FUNCTION=1, BEGIN=2, END=3, PROCEDURE=4, INT=5, FLOAT=6, CONSTINT=7, CONSTFLOAT=8, 
		OPEN_PAREN=9, CLOSE_PAREN=10, OPEN_BRACKET=11, CLOSE_BRACKET=12, SEMICOLON=13, 
		COLON=14, COMMA=15, WALRUS=16, PLUS=17, MINUS=18, TIMES=19, SLASH=20, 
		AT=21, HASH=22, CARET=23, MOD=24, DIV=25, EQUAL=26, NOT_EQUAL=27, LESS_THAN=28, 
		GREATER_THAN=29, LESS_OR_EQUAL=30, GREATER_OR_EQUAL=31, AND=32, OR=33, 
		NOT=34, IN=35, WHITE_SPACE=36, ID=37, INT_NUM=38, FLOAT_NUM=39, CONSLIT=40, 
		ONE_LINE_COMMENT=41, MULTILINE_COMMENT=42;
	public static final int
		RULE_g = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"g"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'('", "')'", "'['", 
			"']'", "';'", "':'", "','", "':='", "'+'", "'-'", "'*'", "'/'", "'@'", 
			"'#'", "'^'", "'mod'", "'div'", "'='", "'<>'", "'<'", "'>'", "'<='", 
			"'>='", "'and'", "'or'", "'not'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "BEGIN", "END", "PROCEDURE", "INT", "FLOAT", "CONSTINT", 
			"CONSTFLOAT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"SEMICOLON", "COLON", "COMMA", "WALRUS", "PLUS", "MINUS", "TIMES", "SLASH", 
			"AT", "HASH", "CARET", "MOD", "DIV", "EQUAL", "NOT_EQUAL", "LESS_THAN", 
			"GREATER_THAN", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "AND", "OR", "NOT", 
			"IN", "WHITE_SPACE", "ID", "INT_NUM", "FLOAT_NUM", "CONSLIT", "ONE_LINE_COMMENT", 
			"MULTILINE_COMMENT"
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
	public static class GContext extends ParserRuleContext {
		public List<TerminalNode> INT_NUM() { return getTokens(transpilerParser.INT_NUM); }
		public TerminalNode INT_NUM(int i) {
			return getToken(transpilerParser.INT_NUM, i);
		}
		public List<TerminalNode> FLOAT_NUM() { return getTokens(transpilerParser.FLOAT_NUM); }
		public TerminalNode FLOAT_NUM(int i) {
			return getToken(transpilerParser.FLOAT_NUM, i);
		}
		public List<TerminalNode> CONSLIT() { return getTokens(transpilerParser.CONSLIT); }
		public TerminalNode CONSLIT(int i) {
			return getToken(transpilerParser.CONSLIT, i);
		}
		public List<TerminalNode> ID() { return getTokens(transpilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(transpilerParser.ID, i);
		}
		public List<TerminalNode> ONE_LINE_COMMENT() { return getTokens(transpilerParser.ONE_LINE_COMMENT); }
		public TerminalNode ONE_LINE_COMMENT(int i) {
			return getToken(transpilerParser.ONE_LINE_COMMENT, i);
		}
		public List<TerminalNode> MULTILINE_COMMENT() { return getTokens(transpilerParser.MULTILINE_COMMENT); }
		public TerminalNode MULTILINE_COMMENT(int i) {
			return getToken(transpilerParser.MULTILINE_COMMENT, i);
		}
		public List<TerminalNode> FUNCTION() { return getTokens(transpilerParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(transpilerParser.FUNCTION, i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(transpilerParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(transpilerParser.BEGIN, i);
		}
		public List<TerminalNode> END() { return getTokens(transpilerParser.END); }
		public TerminalNode END(int i) {
			return getToken(transpilerParser.END, i);
		}
		public List<TerminalNode> INT() { return getTokens(transpilerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(transpilerParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(transpilerParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(transpilerParser.FLOAT, i);
		}
		public List<TerminalNode> CONSTINT() { return getTokens(transpilerParser.CONSTINT); }
		public TerminalNode CONSTINT(int i) {
			return getToken(transpilerParser.CONSTINT, i);
		}
		public List<TerminalNode> CONSTFLOAT() { return getTokens(transpilerParser.CONSTFLOAT); }
		public TerminalNode CONSTFLOAT(int i) {
			return getToken(transpilerParser.CONSTFLOAT, i);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(transpilerParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(transpilerParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(transpilerParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(transpilerParser.CLOSE_BRACKET, i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(transpilerParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(transpilerParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(transpilerParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(transpilerParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(transpilerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(transpilerParser.SEMICOLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(transpilerParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(transpilerParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(transpilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(transpilerParser.COMMA, i);
		}
		public List<TerminalNode> WALRUS() { return getTokens(transpilerParser.WALRUS); }
		public TerminalNode WALRUS(int i) {
			return getToken(transpilerParser.WALRUS, i);
		}
		public List<TerminalNode> PROCEDURE() { return getTokens(transpilerParser.PROCEDURE); }
		public TerminalNode PROCEDURE(int i) {
			return getToken(transpilerParser.PROCEDURE, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(transpilerParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(transpilerParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(transpilerParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(transpilerParser.MINUS, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(transpilerParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(transpilerParser.TIMES, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(transpilerParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(transpilerParser.SLASH, i);
		}
		public List<TerminalNode> AT() { return getTokens(transpilerParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(transpilerParser.AT, i);
		}
		public List<TerminalNode> HASH() { return getTokens(transpilerParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(transpilerParser.HASH, i);
		}
		public List<TerminalNode> CARET() { return getTokens(transpilerParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(transpilerParser.CARET, i);
		}
		public List<TerminalNode> MOD() { return getTokens(transpilerParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(transpilerParser.MOD, i);
		}
		public List<TerminalNode> DIV() { return getTokens(transpilerParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(transpilerParser.DIV, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(transpilerParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(transpilerParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(transpilerParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(transpilerParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(transpilerParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(transpilerParser.LESS_THAN, i);
		}
		public List<TerminalNode> LESS_OR_EQUAL() { return getTokens(transpilerParser.LESS_OR_EQUAL); }
		public TerminalNode LESS_OR_EQUAL(int i) {
			return getToken(transpilerParser.LESS_OR_EQUAL, i);
		}
		public List<TerminalNode> GREATER_OR_EQUAL() { return getTokens(transpilerParser.GREATER_OR_EQUAL); }
		public TerminalNode GREATER_OR_EQUAL(int i) {
			return getToken(transpilerParser.GREATER_OR_EQUAL, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(transpilerParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(transpilerParser.GREATER_THAN, i);
		}
		public List<TerminalNode> AND() { return getTokens(transpilerParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(transpilerParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(transpilerParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(transpilerParser.OR, i);
		}
		public List<TerminalNode> IN() { return getTokens(transpilerParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(transpilerParser.IN, i);
		}
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof transpilerListener ) ((transpilerListener)listener).exitG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof transpilerVisitor ) return ((transpilerVisitor<? extends T>)visitor).visitG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_g);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8710193676286L) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8710193676286L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(7);
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

	public static final String _serializedATN =
		"\u0004\u0001*\t\u0002\u0000\u0007\u0000\u0001\u0000\u0005\u0000\u0004"+
		"\b\u0000\n\u0000\f\u0000\u0007\t\u0000\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0003\u0000\u0001!##%*\b\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0002\u0004\u0007\u0000\u0000\u0000\u0003\u0002\u0001\u0000\u0000\u0000"+
		"\u0004\u0007\u0001\u0000\u0000\u0000\u0005\u0003\u0001\u0000\u0000\u0000"+
		"\u0005\u0006\u0001\u0000\u0000\u0000\u0006\u0001\u0001\u0000\u0000\u0000"+
		"\u0007\u0005\u0001\u0000\u0000\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}