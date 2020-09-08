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
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN=7, XMLDeclOpen=8, 
		TEXT=9, NTA=10, DECLARATION=11, TEMPLATE=12, LOCATION=13, NAME=14, PARAMETER=15, 
		INIT=16, REF=17, ID=18, X=19, Y=20, URGENT=21, COMMITED=22, CLOSE=23, 
		SPECIAL_CLOSE=24, SLASH_CLOSE=25, SLASH=26, EQUALS=27, STRING=28, Name=29, 
		S=30, PI=31;
	public static final int
		INSIDE=1, PROC_INSTR=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE", "PROC_INSTR"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "SPECIAL_OPEN", "TEXT", "NTA", "DECLARATION", "TEMPLATE", 
			"LOCATION", "NAME", "PARAMETER", "INIT", "REF", "ID", "X", "Y", "URGENT", 
			"COMMITED", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", "EQUALS", 
			"STRING", "Name", "S", "HEXDIGIT", "DIGIT", "NameChar", "NameStartChar", 
			"PI", "IGNORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'<'", null, null, "'nta'", 
			"'declaration'", "'template'", "'location'", "'name'", "'parameter'", 
			"'init'", "'ref'", "'id'", "'x'", "'y'", "'urgent'", "'commited'", "'>'", 
			null, "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "TEXT", "NTA", "DECLARATION", "TEMPLATE", "LOCATION", 
			"NAME", "PARAMETER", "INIT", "REF", "ID", "X", "Y", "URGENT", "COMMITED", 
			"CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", "EQUALS", "STRING", 
			"Name", "S", "PI"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0154\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3j\n\3\f\3\16\3m\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7"+
		"\4w\n\4\f\4\16\4z\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\6\6\u0088\n\6\r\6\16\6\u0089\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0093\n"+
		"\6\r\6\16\6\u0094\3\6\3\6\5\6\u0099\n\6\3\7\3\7\5\7\u009d\n\7\3\7\6\7"+
		"\u00a0\n\7\r\7\16\7\u00a1\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u00bb\n\13\r\13"+
		"\16\13\u00bc\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\7\36\u0124\n\36\f\36\16\36\u0127\13\36\3\36\3\36\3\36\7\36"+
		"\u012c\n\36\f\36\16\36\u012f\13\36\3\36\5\36\u0132\n\36\3\37\3\37\7\37"+
		"\u0136\n\37\f\37\16\37\u0139\13\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#"+
		"\3#\5#\u0147\n#\3$\5$\u014a\n$\3%\3%\3%\3%\3%\3&\3&\3&\3&\5Wkx\2\'\5\3"+
		"\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\2\27\13\31\f\33\r\35\16\37\17!\20"+
		"#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37"+
		"A C\2E\2G\2I\2K!M\2\5\2\3\4\f\4\2\13\13\"\"\4\2((>>\4\2$$>>\4\2))>>\5"+
		"\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302"+
		"\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902"+
		"\ufdd1\ufdf2\uffff\2\u015e\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\3\31\3\2\2\2\3\33\3\2\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3"+
		"\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2"+
		"\2\2\3/\3\2\2\2\3\61\3\2\2\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\3"+
		"9\3\2\2\2\3;\3\2\2\2\3=\3\2\2\2\3?\3\2\2\2\3A\3\2\2\2\4K\3\2\2\2\4M\3"+
		"\2\2\2\5O\3\2\2\2\7^\3\2\2\2\tr\3\2\2\2\13\177\3\2\2\2\r\u0098\3\2\2\2"+
		"\17\u009f\3\2\2\2\21\u00a3\3\2\2\2\23\u00a7\3\2\2\2\25\u00b1\3\2\2\2\27"+
		"\u00ba\3\2\2\2\31\u00be\3\2\2\2\33\u00c2\3\2\2\2\35\u00ce\3\2\2\2\37\u00d7"+
		"\3\2\2\2!\u00e0\3\2\2\2#\u00e5\3\2\2\2%\u00ef\3\2\2\2\'\u00f4\3\2\2\2"+
		")\u00f8\3\2\2\2+\u00fb\3\2\2\2-\u00fd\3\2\2\2/\u00ff\3\2\2\2\61\u0106"+
		"\3\2\2\2\63\u010f\3\2\2\2\65\u0113\3\2\2\2\67\u0118\3\2\2\29\u011d\3\2"+
		"\2\2;\u011f\3\2\2\2=\u0131\3\2\2\2?\u0133\3\2\2\2A\u013a\3\2\2\2C\u013e"+
		"\3\2\2\2E\u0140\3\2\2\2G\u0146\3\2\2\2I\u0149\3\2\2\2K\u014b\3\2\2\2M"+
		"\u0150\3\2\2\2OP\7>\2\2PQ\7#\2\2QR\7/\2\2RS\7/\2\2SW\3\2\2\2TV\13\2\2"+
		"\2UT\3\2\2\2VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7/\2"+
		"\2[\\\7/\2\2\\]\7@\2\2]\6\3\2\2\2^_\7>\2\2_`\7#\2\2`a\7]\2\2ab\7E\2\2"+
		"bc\7F\2\2cd\7C\2\2de\7V\2\2ef\7C\2\2fg\7]\2\2gk\3\2\2\2hj\13\2\2\2ih\3"+
		"\2\2\2jm\3\2\2\2kl\3\2\2\2ki\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7_\2\2op\7"+
		"_\2\2pq\7@\2\2q\b\3\2\2\2rs\7>\2\2st\7#\2\2tx\3\2\2\2uw\13\2\2\2vu\3\2"+
		"\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7@\2\2|}\3\2"+
		"\2\2}~\b\4\2\2~\n\3\2\2\2\177\u0080\7(\2\2\u0080\u0081\5?\37\2\u0081\u0082"+
		"\7=\2\2\u0082\f\3\2\2\2\u0083\u0084\7(\2\2\u0084\u0085\7%\2\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0088\5E\"\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7="+
		"\2\2\u008c\u0099\3\2\2\2\u008d\u008e\7(\2\2\u008e\u008f\7%\2\2\u008f\u0090"+
		"\7z\2\2\u0090\u0092\3\2\2\2\u0091\u0093\5C!\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7=\2\2\u0097\u0099\3\2\2\2\u0098\u0083\3\2\2\2\u0098"+
		"\u008d\3\2\2\2\u0099\16\3\2\2\2\u009a\u00a0\t\2\2\2\u009b\u009d\7\17\2"+
		"\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0"+
		"\7\f\2\2\u009f\u009a\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7>\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\b\3\2\u00a6\22\3\2\2\2\u00a7\u00a8"+
		"\7>\2\2\u00a8\u00a9\7A\2\2\u00a9\u00aa\7z\2\2\u00aa\u00ab\7o\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5A \2\u00ae\u00af\3\2\2"+
		"\2\u00af\u00b0\b\t\3\2\u00b0\24\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3"+
		"\7A\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5?\37\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\b\n\4\2\u00b7\u00b8\b\n\5\2\u00b8\26\3\2\2\2\u00b9\u00bb\n\3\2"+
		"\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\30\3\2\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\32\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7e\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7t\2\2"+
		"\u00c8\u00c9\7c\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc"+
		"\7q\2\2\u00cc\u00cd\7p\2\2\u00cd\34\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\7o\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7n\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2\u00d6\36\3\2\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7c\2\2"+
		"\u00db\u00dc\7v\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7q\2\2\u00de\u00df"+
		"\7p\2\2\u00df \3\2\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3"+
		"\7o\2\2\u00e3\u00e4\7g\2\2\u00e4\"\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7"+
		"\7c\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7o\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7t\2\2"+
		"\u00ee$\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7k\2"+
		"\2\u00f2\u00f3\7v\2\2\u00f3&\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7"+
		"g\2\2\u00f6\u00f7\7h\2\2\u00f7(\3\2\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7f\2\2\u00fa*\3\2\2\2\u00fb\u00fc\7z\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7"+
		"{\2\2\u00fe.\3\2\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7t\2\2\u0101\u0102"+
		"\7i\2\2\u0102\u0103\7g\2\2\u0103\u0104\7p\2\2\u0104\u0105\7v\2\2\u0105"+
		"\60\3\2\2\2\u0106\u0107\7e\2\2\u0107\u0108\7q\2\2\u0108\u0109\7o\2\2\u0109"+
		"\u010a\7o\2\2\u010a\u010b\7k\2\2\u010b\u010c\7v\2\2\u010c\u010d\7g\2\2"+
		"\u010d\u010e\7f\2\2\u010e\62\3\2\2\2\u010f\u0110\7@\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u0112\b\31\6\2\u0112\64\3\2\2\2\u0113\u0114\7A\2\2\u0114"+
		"\u0115\7@\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b\32\6\2\u0117\66\3\2\2"+
		"\2\u0118\u0119\7\61\2\2\u0119\u011a\7@\2\2\u011a\u011b\3\2\2\2\u011b\u011c"+
		"\b\33\6\2\u011c8\3\2\2\2\u011d\u011e\7\61\2\2\u011e:\3\2\2\2\u011f\u0120"+
		"\7?\2\2\u0120<\3\2\2\2\u0121\u0125\7$\2\2\u0122\u0124\n\4\2\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0132\7$\2\2\u0129\u012d\7)\2"+
		"\2\u012a\u012c\n\5\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0132\7)\2\2\u0131\u0121\3\2\2\2\u0131\u0129\3\2\2\2\u0132>\3\2\2\2\u0133"+
		"\u0137\5I$\2\u0134\u0136\5G#\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2"+
		"\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138@\3\2\2\2\u0139\u0137\3"+
		"\2\2\2\u013a\u013b\t\6\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b \2\2\u013d"+
		"B\3\2\2\2\u013e\u013f\t\7\2\2\u013fD\3\2\2\2\u0140\u0141\t\b\2\2\u0141"+
		"F\3\2\2\2\u0142\u0147\5I$\2\u0143\u0147\t\t\2\2\u0144\u0147\5E\"\2\u0145"+
		"\u0147\t\n\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0145\3\2\2\2\u0147H\3\2\2\2\u0148\u014a\t\13\2\2\u0149\u0148"+
		"\3\2\2\2\u014aJ\3\2\2\2\u014b\u014c\7A\2\2\u014c\u014d\7@\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014f\b%\6\2\u014fL\3\2\2\2\u0150\u0151\13\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\b&\4\2\u0153N\3\2\2\2\25\2\3\4Wkx\u0089\u0094"+
		"\u0098\u009c\u009f\u00a1\u00bc\u0125\u012d\u0131\u0137\u0146\u0149\7\b"+
		"\2\2\7\3\2\5\2\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}