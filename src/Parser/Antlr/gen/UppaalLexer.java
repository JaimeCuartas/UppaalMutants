// Generated from C:/Users/57310/Documents/Github/XMLGrammar/src/Parser/Antlr\UppaalLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UppaalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DTD=1, SEA_WS=2, PROLOG_OPEN=3, NTA_OPEN=4, PROLOG_CLOSE=5, NAME_ATTRIBUTE=6, 
		EQUALS=7, STRING=8, PROLOG_WS=9, NTA_CLOSE=10, DECLARATION_OPEN=11, TEMPLATE_OPEN=12, 
		WS_NTA=13, DECLARATION_CLOSE=14, DECLARATION_TEXT=15, TEMPLATE_CLOSE=16, 
		X=17, Y=18, EQUALS_TEMPLATE=19, NUMBER=20, QUOTES=21, OPEN=22, NAME=23, 
		OPEN_SLASH=24, CLOSE=25, IDENTIFIER=26, LOCATION_OPEN=27, LOCATION_CLOSE=28, 
		TRANSITION_OPEN=29, TRANSITION_CLOSE=30, WS_TEMPLATE=31;
	public static final int
		PROLOG=1, NTA=2, DECLARATION=3, TEMPLATE=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PROLOG", "NTA", "DECLARATION", "TEMPLATE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DTD", "SEA_WS", "PROLOG_OPEN", "NTA_OPEN", "PROLOG_CLOSE", "NAME_ATTRIBUTE", 
			"EQUALS", "STRING", "PROLOG_WS", "DIGIT", "NameChar", "NameStartChar", 
			"NTA_CLOSE", "DECLARATION_OPEN", "TEMPLATE_OPEN", "WS_NTA", "DECLARATION_CLOSE", 
			"DECLARATION_TEXT", "TEMPLATE_CLOSE", "X", "Y", "EQUALS_TEMPLATE", "NUMBER", 
			"QUOTES", "OPEN", "NAME", "OPEN_SLASH", "CLOSE", "IDENTIFIER", "LOCATION_OPEN", 
			"LOCATION_CLOSE", "TRANSITION_OPEN", "TRANSITION_CLOSE", "WS_TEMPLATE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'?>'", null, null, null, null, null, null, 
			null, null, null, null, null, "'x'", "'y'", null, null, "'\"'", "'<'", 
			"'name'", "'</'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DTD", "SEA_WS", "PROLOG_OPEN", "NTA_OPEN", "PROLOG_CLOSE", "NAME_ATTRIBUTE", 
			"EQUALS", "STRING", "PROLOG_WS", "NTA_CLOSE", "DECLARATION_OPEN", "TEMPLATE_OPEN", 
			"WS_NTA", "DECLARATION_CLOSE", "DECLARATION_TEXT", "TEMPLATE_CLOSE", 
			"X", "Y", "EQUALS_TEMPLATE", "NUMBER", "QUOTES", "OPEN", "NAME", "OPEN_SLASH", 
			"CLOSE", "IDENTIFIER", "LOCATION_OPEN", "LOCATION_CLOSE", "TRANSITION_OPEN", 
			"TRANSITION_CLOSE", "WS_TEMPLATE"
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


	public UppaalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UppaalLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u01a2\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\7\2P\n\2\f\2\16\2S"+
		"\13\2\3\2\3\2\3\3\6\3X\n\3\r\3\16\3Y\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"t\n\5\f\5\16\5w\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\7\7\u0084"+
		"\n\7\f\7\16\7\u0087\13\7\3\b\3\b\3\t\3\t\7\t\u008d\n\t\f\t\16\t\u0090"+
		"\13\t\3\t\3\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t\3\t\5\t\u009b\n\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\r\5\r\u00aa"+
		"\n\r\3\16\3\16\3\16\3\16\7\16\u00b0\n\16\f\16\16\16\u00b3\13\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00ba\n\16\f\16\16\16\u00bd\13\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\7\17\u00c5\n\17\f\17\16\17\u00c8\13\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d7\n\17"+
		"\f\17\16\17\u00da\13\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u00e2\n\20"+
		"\f\20\16\20\u00e5\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00f1\n\20\f\20\16\20\u00f4\13\20\3\20\3\20\3\20\3\20\3\21\6"+
		"\21\u00fb\n\21\r\21\16\21\u00fc\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0105"+
		"\n\22\f\22\16\22\u0108\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u0117\n\22\f\22\16\22\u011a\13\22\3\22\3"+
		"\22\3\22\3\22\3\23\6\23\u0121\n\23\r\23\16\23\u0122\3\24\3\24\3\24\3\24"+
		"\7\24\u0129\n\24\f\24\16\24\u012c\13\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0138\n\24\f\24\16\24\u013b\13\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\5\30\u0148\n\30\3\30\6\30"+
		"\u014b\n\30\r\30\16\30\u014c\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\7\36\u015f\n\36\f\36\16\36\u0162"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\6#\u019d\n#\r#\16#\u019e\3#\3#\3Q\2$\7\3\t\4\13\5\r\6\17\7\21"+
		"\b\23\t\25\n\27\13\31\2\33\2\35\2\37\f!\r#\16%\17\'\20)\21+\22-\23/\24"+
		"\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!\7\2\3\4\5\6\f"+
		"\5\2\13\f\17\17\"\"\4\2$$>>\4\2))>>\3\2\62;\5\2\u00b9\u00b9\u0302\u0371"+
		"\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1"+
		"\ufdf2\uffff\3\2>>\3\2//\5\2C\\aac|\6\2\62;C\\aac|\2\u01b5\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\3\21\3\2\2\2\3\23\3"+
		"\2\2\2\3\25\3\2\2\2\3\27\3\2\2\2\4\37\3\2\2\2\4!\3\2\2\2\4#\3\2\2\2\4"+
		"%\3\2\2\2\5\'\3\2\2\2\5)\3\2\2\2\6+\3\2\2\2\6-\3\2\2\2\6/\3\2\2\2\6\61"+
		"\3\2\2\2\6\63\3\2\2\2\6\65\3\2\2\2\6\67\3\2\2\2\69\3\2\2\2\6;\3\2\2\2"+
		"\6=\3\2\2\2\6?\3\2\2\2\6A\3\2\2\2\6C\3\2\2\2\6E\3\2\2\2\6G\3\2\2\2\6I"+
		"\3\2\2\2\7K\3\2\2\2\tW\3\2\2\2\13]\3\2\2\2\rg\3\2\2\2\17|\3\2\2\2\21\u0081"+
		"\3\2\2\2\23\u0088\3\2\2\2\25\u009a\3\2\2\2\27\u009c\3\2\2\2\31\u00a0\3"+
		"\2\2\2\33\u00a6\3\2\2\2\35\u00a9\3\2\2\2\37\u00ab\3\2\2\2!\u00c2\3\2\2"+
		"\2#\u00df\3\2\2\2%\u00fa\3\2\2\2\'\u0100\3\2\2\2)\u0120\3\2\2\2+\u0124"+
		"\3\2\2\2-\u0140\3\2\2\2/\u0142\3\2\2\2\61\u0144\3\2\2\2\63\u0147\3\2\2"+
		"\2\65\u014e\3\2\2\2\67\u0150\3\2\2\29\u0152\3\2\2\2;\u0157\3\2\2\2=\u015a"+
		"\3\2\2\2?\u015c\3\2\2\2A\u0163\3\2\2\2C\u016f\3\2\2\2E\u017d\3\2\2\2G"+
		"\u018b\3\2\2\2I\u019c\3\2\2\2KL\7>\2\2LM\7#\2\2MQ\3\2\2\2NP\13\2\2\2O"+
		"N\3\2\2\2PS\3\2\2\2QR\3\2\2\2QO\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7@\2\2U"+
		"\b\3\2\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2"+
		"[\\\b\3\2\2\\\n\3\2\2\2]^\7>\2\2^_\7A\2\2_`\7z\2\2`a\7o\2\2ab\7n\2\2b"+
		"c\3\2\2\2cd\5\27\n\2de\3\2\2\2ef\b\4\3\2f\f\3\2\2\2gk\7>\2\2hj\t\2\2\2"+
		"ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7p\2\2"+
		"op\7v\2\2pq\7c\2\2qu\3\2\2\2rt\t\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2u"+
		"v\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7@\2\2yz\3\2\2\2z{\b\5\4\2{\16\3\2\2\2"+
		"|}\7A\2\2}~\7@\2\2~\177\3\2\2\2\177\u0080\b\6\5\2\u0080\20\3\2\2\2\u0081"+
		"\u0085\5\35\r\2\u0082\u0084\5\33\f\2\u0083\u0082\3\2\2\2\u0084\u0087\3"+
		"\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\22\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\7?\2\2\u0089\24\3\2\2\2\u008a\u008e\7$\2\2"+
		"\u008b\u008d\n\3\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u009b\7$\2\2\u0092\u0096\7)\2\2\u0093\u0095\n\4\2\2\u0094\u0093\3\2\2"+
		"\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7)\2\2\u009a\u008a\3\2\2\2\u009a"+
		"\u0092\3\2\2\2\u009b\26\3\2\2\2\u009c\u009d\t\2\2\2\u009d\u009e\3\2\2"+
		"\2\u009e\u009f\b\n\2\2\u009f\30\3\2\2\2\u00a0\u00a1\t\5\2\2\u00a1\32\3"+
		"\2\2\2\u00a2\u00a7\5\35\r\2\u00a3\u00a7\4/\60\2\u00a4\u00a7\5\31\13\2"+
		"\u00a5\u00a7\t\6\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\34\3\2\2\2\u00a8\u00aa\t\7\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7\61\2"+
		"\2\u00ad\u00b1\3\2\2\2\u00ae\u00b0\t\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7c\2"+
		"\2\u00b7\u00bb\3\2\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\16"+
		"\5\2\u00c1 \3\2\2\2\u00c2\u00c6\7>\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7g\2"+
		"\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf"+
		"\7t\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2"+
		"\u00d3\7q\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d8\3\2\2\2\u00d5\u00d7\t\2\2"+
		"\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7@\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\b\17\6\2\u00de\"\3\2\2\2\u00df\u00e3\7>\2\2"+
		"\u00e0\u00e2\t\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7v\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7r\2\2"+
		"\u00ea\u00eb\7n\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7g\2\2\u00ee\u00f2\3\2\2\2\u00ef\u00f1\t\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\b\20\7\2\u00f8$\3\2\2\2\u00f9\u00fb\t\2\2\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\b\21\2\2\u00ff&\3\2\2\2\u0100\u0101\7>\2\2\u0101"+
		"\u0102\7\61\2\2\u0102\u0106\3\2\2\2\u0103\u0105\t\2\2\2\u0104\u0103\3"+
		"\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7f\2\2\u010a\u010b\7g\2"+
		"\2\u010b\u010c\7e\2\2\u010c\u010d\7n\2\2\u010d\u010e\7c\2\2\u010e\u010f"+
		"\7t\2\2\u010f\u0110\7c\2\2\u0110\u0111\7v\2\2\u0111\u0112\7k\2\2\u0112"+
		"\u0113\7q\2\2\u0113\u0114\7p\2\2\u0114\u0118\3\2\2\2\u0115\u0117\t\2\2"+
		"\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7@\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\b\22\5\2\u011e(\3\2\2\2\u011f\u0121\n\b\2\2"+
		"\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123*\3\2\2\2\u0124\u0125\7>\2\2\u0125\u0126\7\61\2\2\u0126"+
		"\u012a\3\2\2\2\u0127\u0129\t\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u012e\7v\2\2\u012e\u012f\7g\2\2\u012f\u0130\7o\2"+
		"\2\u0130\u0131\7r\2\2\u0131\u0132\7n\2\2\u0132\u0133\7c\2\2\u0133\u0134"+
		"\7v\2\2\u0134\u0135\7g\2\2\u0135\u0139\3\2\2\2\u0136\u0138\t\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7@\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\b\24\5\2\u013f,\3\2\2\2\u0140\u0141\7z\2\2"+
		"\u0141.\3\2\2\2\u0142\u0143\7{\2\2\u0143\60\3\2\2\2\u0144\u0145\7?\2\2"+
		"\u0145\62\3\2\2\2\u0146\u0148\t\t\2\2\u0147\u0146\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\t\5\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\64\3\2\2"+
		"\2\u014e\u014f\7$\2\2\u014f\66\3\2\2\2\u0150\u0151\7>\2\2\u01518\3\2\2"+
		"\2\u0152\u0153\7p\2\2\u0153\u0154\7c\2\2\u0154\u0155\7o\2\2\u0155\u0156"+
		"\7g\2\2\u0156:\3\2\2\2\u0157\u0158\7>\2\2\u0158\u0159\7\61\2\2\u0159<"+
		"\3\2\2\2\u015a\u015b\7@\2\2\u015b>\3\2\2\2\u015c\u0160\t\n\2\2\u015d\u015f"+
		"\t\13\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2"+
		"\u0160\u0161\3\2\2\2\u0161@\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7"+
		">\2\2\u0164\u0165\7n\2\2\u0165\u0166\7q\2\2\u0166\u0167\7e\2\2\u0167\u0168"+
		"\7c\2\2\u0168\u0169\7v\2\2\u0169\u016a\7k\2\2\u016a\u016b\7q\2\2\u016b"+
		"\u016c\7p\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7@\2\2\u016eB\3\2\2\2\u016f"+
		"\u0170\7>\2\2\u0170\u0171\7\61\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7n"+
		"\2\2\u0173\u0174\7q\2\2\u0174\u0175\7e\2\2\u0175\u0176\7c\2\2\u0176\u0177"+
		"\7v\2\2\u0177\u0178\7k\2\2\u0178\u0179\7q\2\2\u0179\u017a\7p\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\7@\2\2\u017cD\3\2\2\2\u017d\u017e\7>\2\2\u017e"+
		"\u017f\7v\2\2\u017f\u0180\7t\2\2\u0180\u0181\7c\2\2\u0181\u0182\7p\2\2"+
		"\u0182\u0183\7u\2\2\u0183\u0184\7k\2\2\u0184\u0185\7v\2\2\u0185\u0186"+
		"\7k\2\2\u0186\u0187\7q\2\2\u0187\u0188\7p\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\7@\2\2\u018aF\3\2\2\2\u018b\u018c\7>\2\2\u018c\u018d\7\61\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\7v\2\2\u018f\u0190\7t\2\2\u0190\u0191\7c\2"+
		"\2\u0191\u0192\7p\2\2\u0192\u0193\7u\2\2\u0193\u0194\7k\2\2\u0194\u0195"+
		"\7v\2\2\u0195\u0196\7k\2\2\u0196\u0197\7q\2\2\u0197\u0198\7p\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\7@\2\2\u019aH\3\2\2\2\u019b\u019d\t\2\2\2\u019c"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\b#\2\2\u01a1J\3\2\2\2!\2\3\4\5\6"+
		"QYku\u0085\u008e\u0096\u009a\u00a6\u00a9\u00b1\u00bb\u00c6\u00d8\u00e3"+
		"\u00f2\u00fc\u0106\u0118\u0122\u012a\u0139\u0147\u014c\u0160\u019e\b\b"+
		"\2\2\7\3\2\7\4\2\6\2\2\7\5\2\7\6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}