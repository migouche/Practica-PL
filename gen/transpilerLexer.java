// Generated from C:/Users/migou/codes/URJC/PL/Practica-PL/transpiler.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class transpilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, BEGIN=2, END=3, INT=4, FLOAT=5, CONSTINT=6, CONSTFLOAT=7, 
		WHITE_SPACE=8, INT_NUM=9, FLOAT_NUM=10, WORD=11, CONSLIT=12, ONE_LINE_COMMENT=13, 
		MULTILINE_COMMENT=14, ID=15, T=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER_START", "IDENTIFIER_PART", "FUNCTION", "BEGIN", "END", "INT", 
			"FLOAT", "CONSTINT", "CONSTFLOAT", "WHITE_SPACE", "NUM", "INT_NUM", "FLOAT_NUM", 
			"WORD", "CONSLIT", "ONE_LINE_COMMENT", "MULTILINE_COMMENT", "ID", "T"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'FUNCTION'", "'BEGIN'", "'END'", "'INTEGER'", "'REAL'", "'CONSTINT'", 
			"'CONSTREAL'", null, null, null, null, null, null, null, null, "'f'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "BEGIN", "END", "INT", "FLOAT", "CONSTINT", "CONSTFLOAT", 
			"WHITE_SPACE", "INT_NUM", "FLOAT_NUM", "WORD", "CONSLIT", "ONE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "ID", "T"
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


	public transpilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "transpiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0004\t`\b\t\u000b\t\f\ta\u0001\t\u0001\t\u0001\n\u0004\ng\b\n\u000b"+
		"\n\f\nh\u0001\u000b\u0003\u000bl\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0003\fq\b\f\u0001\f\u0001\f\u0001\f\u0003\fv\b\f\u0001\f\u0001\f\u0003"+
		"\fz\b\f\u0001\f\u0003\f}\b\f\u0001\r\u0004\r\u0080\b\r\u000b\r\f\r\u0081"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u0089\b\u000e\u000b\u000e\f\u000e\u008a\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0091\b\u000f\n\u000f\f\u000f\u0094\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u009c\b\u0010\n\u0010\f\u0010\u009f\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00a6\b\u0011\n"+
		"\u0011\f\u0011\u00a9\t\u0011\u0001\u0012\u0001\u0012\u0001\u009d\u0000"+
		"\u0013\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004"+
		"\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\u0000\u0017\t\u0019\n\u001b"+
		"\u000b\u001d\f\u001f\r!\u000e#\u000f%\u0010\u0001\u0000\t\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0002\u0000\t\n\r\r\u0001\u000009\u0002\u0000"+
		"++--\u0002\u0000EEee\u0002\u0000AZaz\u0001\u0000\'\'\u0002\u0000\n\n{"+
		"{\u00b6\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000"+
		"\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000"+
		"\u00074\u0001\u0000\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000b>\u0001"+
		"\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fK\u0001\u0000\u0000"+
		"\u0000\u0011T\u0001\u0000\u0000\u0000\u0013_\u0001\u0000\u0000\u0000\u0015"+
		"f\u0001\u0000\u0000\u0000\u0017k\u0001\u0000\u0000\u0000\u0019p\u0001"+
		"\u0000\u0000\u0000\u001b\u007f\u0001\u0000\u0000\u0000\u001d\u0083\u0001"+
		"\u0000\u0000\u0000\u001f\u008e\u0001\u0000\u0000\u0000!\u0097\u0001\u0000"+
		"\u0000\u0000#\u00a3\u0001\u0000\u0000\u0000%\u00aa\u0001\u0000\u0000\u0000"+
		"\'(\u0007\u0000\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0007\u0001"+
		"\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005F\u0000\u0000,-\u0005"+
		"U\u0000\u0000-.\u0005N\u0000\u0000./\u0005C\u0000\u0000/0\u0005T\u0000"+
		"\u000001\u0005I\u0000\u000012\u0005O\u0000\u000023\u0005N\u0000\u0000"+
		"3\u0006\u0001\u0000\u0000\u000045\u0005B\u0000\u000056\u0005E\u0000\u0000"+
		"67\u0005G\u0000\u000078\u0005I\u0000\u000089\u0005N\u0000\u00009\b\u0001"+
		"\u0000\u0000\u0000:;\u0005E\u0000\u0000;<\u0005N\u0000\u0000<=\u0005D"+
		"\u0000\u0000=\n\u0001\u0000\u0000\u0000>?\u0005I\u0000\u0000?@\u0005N"+
		"\u0000\u0000@A\u0005T\u0000\u0000AB\u0005E\u0000\u0000BC\u0005G\u0000"+
		"\u0000CD\u0005E\u0000\u0000DE\u0005R\u0000\u0000E\f\u0001\u0000\u0000"+
		"\u0000FG\u0005R\u0000\u0000GH\u0005E\u0000\u0000HI\u0005A\u0000\u0000"+
		"IJ\u0005L\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KL\u0005C\u0000\u0000"+
		"LM\u0005O\u0000\u0000MN\u0005N\u0000\u0000NO\u0005S\u0000\u0000OP\u0005"+
		"T\u0000\u0000PQ\u0005I\u0000\u0000QR\u0005N\u0000\u0000RS\u0005T\u0000"+
		"\u0000S\u0010\u0001\u0000\u0000\u0000TU\u0005C\u0000\u0000UV\u0005O\u0000"+
		"\u0000VW\u0005N\u0000\u0000WX\u0005S\u0000\u0000XY\u0005T\u0000\u0000"+
		"YZ\u0005R\u0000\u0000Z[\u0005E\u0000\u0000[\\\u0005A\u0000\u0000\\]\u0005"+
		"L\u0000\u0000]\u0012\u0001\u0000\u0000\u0000^`\u0007\u0002\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0006\t\u0000"+
		"\u0000d\u0014\u0001\u0000\u0000\u0000eg\u0007\u0003\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000i\u0016\u0001\u0000\u0000\u0000jl\u0007\u0004"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0003\u0015\n\u0000n\u0018\u0001\u0000\u0000\u0000"+
		"oq\u0007\u0004\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000ru\u0003\u0015\n\u0000st\u0005.\u0000"+
		"\u0000tv\u0003\u0015\n\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v|\u0001\u0000\u0000\u0000wy\u0007\u0005\u0000\u0000xz\u0007\u0004"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{}\u0003\u0015\n\u0000|w\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u001a\u0001\u0000\u0000\u0000~\u0080\u0007\u0006\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u001c\u0001\u0000\u0000\u0000\u0083\u0088\u0005\'\u0000\u0000\u0084"+
		"\u0089\u0003\u001b\r\u0000\u0085\u0086\u0005\\\u0000\u0000\u0086\u0089"+
		"\u0005\'\u0000\u0000\u0087\u0089\b\u0007\u0000\u0000\u0088\u0084\u0001"+
		"\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005\'\u0000\u0000\u008d\u001e\u0001\u0000"+
		"\u0000\u0000\u008e\u0092\u0005{\u0000\u0000\u008f\u0091\b\b\u0000\u0000"+
		"\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005}\u0000\u0000\u0096 \u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005(\u0000\u0000\u0098\u0099\u0005*\u0000\u0000\u0099\u009d\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\t\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005*\u0000\u0000"+
		"\u00a1\u00a2\u0005)\u0000\u0000\u00a2\"\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a7\u0003\u0001\u0000\u0000\u00a4\u00a6\u0003\u0003\u0001\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"$\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005f\u0000\u0000\u00ab&\u0001\u0000\u0000\u0000\u000e\u0000ahkpuy|"+
		"\u0081\u0088\u008a\u0092\u009d\u00a7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}