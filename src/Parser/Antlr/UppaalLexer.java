// Generated from C:/Users/57310/Documents/Github/XMLGrammar/src/Parser/Antlr\UppaalLexer.g4 by ANTLR 4.8
package Parser.Antlr;
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
		LOCATION=24, ID=25, TRANSITION=26, INIT=27, REF=28, OPEN_SLASH=29, CLOSE=30, 
		SLASH_CLOSE=31, IDENTIFIER=32, WS_TEMPLATE=33;
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
			"QUOTES", "OPEN", "NAME", "LOCATION", "ID", "TRANSITION", "INIT", "REF", 
			"OPEN_SLASH", "CLOSE", "SLASH_CLOSE", "IDENTIFIER", "WS_TEMPLATE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'?>'", null, null, null, null, null, null, 
			null, null, null, null, null, "'x'", "'y'", null, null, "'\"'", "'<'", 
			"'name'", "'location'", "'id'", "'transition'", "'init'", "'ref'", "'</'", 
			"'>'", "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DTD", "SEA_WS", "PROLOG_OPEN", "NTA_OPEN", "PROLOG_CLOSE", "NAME_ATTRIBUTE", 
			"EQUALS", "STRING", "PROLOG_WS", "NTA_CLOSE", "DECLARATION_OPEN", "TEMPLATE_OPEN", 
			"WS_NTA", "DECLARATION_CLOSE", "DECLARATION_TEXT", "TEMPLATE_CLOSE", 
			"X", "Y", "EQUALS_TEMPLATE", "NUMBER", "QUOTES", "OPEN", "NAME", "LOCATION", 
			"ID", "TRANSITION", "INIT", "REF", "OPEN_SLASH", "CLOSE", "SLASH_CLOSE", 
			"IDENTIFIER", "WS_TEMPLATE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0191\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\7\2T\n"+
		"\2\f\2\16\2W\13\2\3\2\3\2\3\3\6\3\\\n\3\r\3\16\3]\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5n\n\5\f\5\16\5q\13\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\7\7\u0088\n\7\f\7\16\7\u008b\13\7\3\b\3\b\3\t\3\t\7\t\u0091\n"+
		"\t\f\t\16\t\u0094\13\t\3\t\3\t\3\t\7\t\u0099\n\t\f\t\16\t\u009c\13\t\3"+
		"\t\5\t\u009f\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00ab\n"+
		"\f\3\r\5\r\u00ae\n\r\3\16\3\16\3\16\3\16\7\16\u00b4\n\16\f\16\16\16\u00b7"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\7\16\u00be\n\16\f\16\16\16\u00c1\13\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u00c9\n\17\f\17\16\17\u00cc\13\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00db\n\17\f\17\16\17\u00de\13\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20"+
		"\u00e6\n\20\f\20\16\20\u00e9\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00f5\n\20\f\20\16\20\u00f8\13\20\3\20\3\20\3\20"+
		"\3\20\3\21\6\21\u00ff\n\21\r\21\16\21\u0100\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\7\22\u0109\n\22\f\22\16\22\u010c\13\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u011b\n\22\f\22\16\22\u011e"+
		"\13\22\3\22\3\22\3\22\3\22\3\23\6\23\u0125\n\23\r\23\16\23\u0126\3\24"+
		"\3\24\3\24\3\24\7\24\u012d\n\24\f\24\16\24\u0130\13\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u013c\n\24\f\24\16\24\u013f\13"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\5\30\u014c"+
		"\n\30\3\30\6\30\u014f\n\30\r\30\16\30\u0150\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\7$\u0186"+
		"\n$\f$\16$\u0189\13$\3%\6%\u018c\n%\r%\16%\u018d\3%\3%\3U\2&\7\3\t\4\13"+
		"\5\r\6\17\7\21\b\23\t\25\n\27\13\31\2\33\2\35\2\37\f!\r#\16%\17\'\20)"+
		"\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G "+
		"I!K\"M#\7\2\3\4\5\6\f\5\2\13\f\17\17\"\"\4\2$$>>\4\2))>>\3\2\62;\5\2\u00b9"+
		"\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003"+
		"\ud801\uf902\ufdd1\ufdf2\uffff\3\2>>\3\2//\5\2C\\aac|\6\2\62;C\\aac|\2"+
		"\u01a4\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\3"+
		"\21\3\2\2\2\3\23\3\2\2\2\3\25\3\2\2\2\3\27\3\2\2\2\4\37\3\2\2\2\4!\3\2"+
		"\2\2\4#\3\2\2\2\4%\3\2\2\2\5\'\3\2\2\2\5)\3\2\2\2\6+\3\2\2\2\6-\3\2\2"+
		"\2\6/\3\2\2\2\6\61\3\2\2\2\6\63\3\2\2\2\6\65\3\2\2\2\6\67\3\2\2\2\69\3"+
		"\2\2\2\6;\3\2\2\2\6=\3\2\2\2\6?\3\2\2\2\6A\3\2\2\2\6C\3\2\2\2\6E\3\2\2"+
		"\2\6G\3\2\2\2\6I\3\2\2\2\6K\3\2\2\2\6M\3\2\2\2\7O\3\2\2\2\t[\3\2\2\2\13"+
		"a\3\2\2\2\rk\3\2\2\2\17\u0080\3\2\2\2\21\u0085\3\2\2\2\23\u008c\3\2\2"+
		"\2\25\u009e\3\2\2\2\27\u00a0\3\2\2\2\31\u00a4\3\2\2\2\33\u00aa\3\2\2\2"+
		"\35\u00ad\3\2\2\2\37\u00af\3\2\2\2!\u00c6\3\2\2\2#\u00e3\3\2\2\2%\u00fe"+
		"\3\2\2\2\'\u0104\3\2\2\2)\u0124\3\2\2\2+\u0128\3\2\2\2-\u0144\3\2\2\2"+
		"/\u0146\3\2\2\2\61\u0148\3\2\2\2\63\u014b\3\2\2\2\65\u0152\3\2\2\2\67"+
		"\u0154\3\2\2\29\u0156\3\2\2\2;\u015b\3\2\2\2=\u0164\3\2\2\2?\u0167\3\2"+
		"\2\2A\u0172\3\2\2\2C\u0177\3\2\2\2E\u017b\3\2\2\2G\u017e\3\2\2\2I\u0180"+
		"\3\2\2\2K\u0183\3\2\2\2M\u018b\3\2\2\2OP\7>\2\2PQ\7#\2\2QU\3\2\2\2RT\13"+
		"\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7"+
		"@\2\2Y\b\3\2\2\2Z\\\t\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^"+
		"_\3\2\2\2_`\b\3\2\2`\n\3\2\2\2ab\7>\2\2bc\7A\2\2cd\7z\2\2de\7o\2\2ef\7"+
		"n\2\2fg\3\2\2\2gh\5\27\n\2hi\3\2\2\2ij\b\4\3\2j\f\3\2\2\2ko\7>\2\2ln\t"+
		"\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7"+
		"p\2\2st\7v\2\2tu\7c\2\2uy\3\2\2\2vx\t\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7@\2\2}~\3\2\2\2~\177\b\5\4\2\177"+
		"\16\3\2\2\2\u0080\u0081\7A\2\2\u0081\u0082\7@\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0084\b\6\5\2\u0084\20\3\2\2\2\u0085\u0089\5\35\r\2\u0086\u0088"+
		"\5\33\f\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\22\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d"+
		"\7?\2\2\u008d\24\3\2\2\2\u008e\u0092\7$\2\2\u008f\u0091\n\3\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u009f\7$\2\2\u0096"+
		"\u009a\7)\2\2\u0097\u0099\n\4\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009f\7)\2\2\u009e\u008e\3\2\2\2\u009e\u0096\3\2"+
		"\2\2\u009f\26\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\b\n\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\t\5\2\2\u00a5\32\3\2\2\2\u00a6\u00ab"+
		"\5\35\r\2\u00a7\u00ab\4/\60\2\u00a8\u00ab\5\31\13\2\u00a9\u00ab\t\6\2"+
		"\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\34\3\2\2\2\u00ac\u00ae\t\7\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\36\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b5\3\2\2"+
		"\2\u00b2\u00b4\t\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bf\3\2\2"+
		"\2\u00bc\u00be\t\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\7@\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\16\5\2\u00c5 \3\2\2\2"+
		"\u00c6\u00ca\7>\2\2\u00c7\u00c9\t\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7e\2"+
		"\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4"+
		"\7c\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00d8\7p\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00db\t\2\2\2\u00da\u00d9\3\2"+
		"\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7@\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\b\17\6\2\u00e2\"\3\2\2\2\u00e3\u00e7\7>\2\2\u00e4\u00e6"+
		"\t\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7v"+
		"\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef"+
		"\7n\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f6\3\2\2\2\u00f3\u00f5\t\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b\20"+
		"\7\2\u00fc$\3\2\2\2\u00fd\u00ff\t\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\b\21\2\2\u0103&\3\2\2\2\u0104\u0105\7>\2\2\u0105\u0106\7\61\2\2"+
		"\u0106\u010a\3\2\2\2\u0107\u0109\t\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010e\7f\2\2\u010e\u010f\7g\2\2\u010f\u0110\7e\2"+
		"\2\u0110\u0111\7n\2\2\u0111\u0112\7c\2\2\u0112\u0113\7t\2\2\u0113\u0114"+
		"\7c\2\2\u0114\u0115\7v\2\2\u0115\u0116\7k\2\2\u0116\u0117\7q\2\2\u0117"+
		"\u0118\7p\2\2\u0118\u011c\3\2\2\2\u0119\u011b\t\2\2\2\u011a\u0119\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7@\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\b\22\5\2\u0122(\3\2\2\2\u0123\u0125\n\b\2\2\u0124\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"*\3\2\2\2\u0128\u0129\7>\2\2\u0129\u012a\7\61\2\2\u012a\u012e\3\2\2\2"+
		"\u012b\u012d\t\2\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0132\7v\2\2\u0132\u0133\7g\2\2\u0133\u0134\7o\2\2\u0134\u0135\7r\2\2"+
		"\u0135\u0136\7n\2\2\u0136\u0137\7c\2\2\u0137\u0138\7v\2\2\u0138\u0139"+
		"\7g\2\2\u0139\u013d\3\2\2\2\u013a\u013c\t\2\2\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7@\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\b\24\5\2\u0143,\3\2\2\2\u0144\u0145\7z\2\2\u0145.\3\2\2\2\u0146"+
		"\u0147\7{\2\2\u0147\60\3\2\2\2\u0148\u0149\7?\2\2\u0149\62\3\2\2\2\u014a"+
		"\u014c\t\t\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u014f\t\5\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\64\3\2\2\2\u0152\u0153\7$\2\2"+
		"\u0153\66\3\2\2\2\u0154\u0155\7>\2\2\u01558\3\2\2\2\u0156\u0157\7p\2\2"+
		"\u0157\u0158\7c\2\2\u0158\u0159\7o\2\2\u0159\u015a\7g\2\2\u015a:\3\2\2"+
		"\2\u015b\u015c\7n\2\2\u015c\u015d\7q\2\2\u015d\u015e\7e\2\2\u015e\u015f"+
		"\7c\2\2\u015f\u0160\7v\2\2\u0160\u0161\7k\2\2\u0161\u0162\7q\2\2\u0162"+
		"\u0163\7p\2\2\u0163<\3\2\2\2\u0164\u0165\7k\2\2\u0165\u0166\7f\2\2\u0166"+
		">\3\2\2\2\u0167\u0168\7v\2\2\u0168\u0169\7t\2\2\u0169\u016a\7c\2\2\u016a"+
		"\u016b\7p\2\2\u016b\u016c\7u\2\2\u016c\u016d\7k\2\2\u016d\u016e\7v\2\2"+
		"\u016e\u016f\7k\2\2\u016f\u0170\7q\2\2\u0170\u0171\7p\2\2\u0171@\3\2\2"+
		"\2\u0172\u0173\7k\2\2\u0173\u0174\7p\2\2\u0174\u0175\7k\2\2\u0175\u0176"+
		"\7v\2\2\u0176B\3\2\2\2\u0177\u0178\7t\2\2\u0178\u0179\7g\2\2\u0179\u017a"+
		"\7h\2\2\u017aD\3\2\2\2\u017b\u017c\7>\2\2\u017c\u017d\7\61\2\2\u017dF"+
		"\3\2\2\2\u017e\u017f\7@\2\2\u017fH\3\2\2\2\u0180\u0181\7\61\2\2\u0181"+
		"\u0182\7@\2\2\u0182J\3\2\2\2\u0183\u0187\t\n\2\2\u0184\u0186\t\13\2\2"+
		"\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188L\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018c\t\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u0190\b%\2\2\u0190N\3\2\2\2!\2\3\4\5\6"+
		"U]oy\u0089\u0092\u009a\u009e\u00aa\u00ad\u00b5\u00bf\u00ca\u00dc\u00e7"+
		"\u00f6\u0100\u010a\u011c\u0126\u012e\u013d\u014b\u0150\u0187\u018d\b\b"+
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