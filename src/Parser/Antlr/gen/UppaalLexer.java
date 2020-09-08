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
		ID=16, X=17, Y=18, CLOSE=19, SPECIAL_CLOSE=20, SLASH_CLOSE=21, SLASH=22, 
		EQUALS=23, STRING=24, Name=25, S=26, PI=27;
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
			"LOCATION", "NAME", "PARAMETER", "ID", "X", "Y", "CLOSE", "SPECIAL_CLOSE", 
			"SLASH_CLOSE", "SLASH", "EQUALS", "STRING", "Name", "S", "HEXDIGIT", 
			"DIGIT", "NameChar", "NameStartChar", "PI", "IGNORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'<'", null, null, "'nta'", 
			"'declaration'", "'template'", "'location'", "'name'", "'parameter'", 
			"'id'", "'x'", "'y'", "'>'", null, "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "TEXT", "NTA", "DECLARATION", "TEMPLATE", "LOCATION", 
			"NAME", "PARAMETER", "ID", "X", "Y", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", 
			"SLASH", "EQUALS", "STRING", "Name", "S", "PI"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0133\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\7\2N\n\2\f\2\16\2Q\13"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3b\n"+
		"\3\f\3\16\3e\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\6\6\u0080\n\6\r\6\16"+
		"\6\u0081\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u008b\n\6\r\6\16\6\u008c\3\6"+
		"\3\6\5\6\u0091\n\6\3\7\3\7\5\7\u0095\n\7\3\7\6\7\u0098\n\7\r\7\16\7\u0099"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\6\13\u00b3\n\13\r\13\16\13\u00b4\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\7\32\u0103\n\32\f\32\16\32\u0106\13\32\3\32\3\32\3\32\7\32\u010b\n\32"+
		"\f\32\16\32\u010e\13\32\3\32\5\32\u0111\n\32\3\33\3\33\7\33\u0115\n\33"+
		"\f\33\16\33\u0118\13\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\5\37\u0126\n\37\3 \5 \u0129\n \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\5Ocp\2#\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\2\27\13\31\f\33"+
		"\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\2=\2?\2A\2C\35E\2\5\2\3\4\f\4\2\13\13\"\"\4\2((>>\4\2$$>>\4\2))"+
		">>\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302"+
		"\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902"+
		"\ufdd1\ufdf2\uffff\2\u013d\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\3\31\3\2\2\2\3\33\3\2\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3"+
		"\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2"+
		"\2\2\3/\3\2\2\2\3\61\3\2\2\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\3"+
		"9\3\2\2\2\4C\3\2\2\2\4E\3\2\2\2\5G\3\2\2\2\7V\3\2\2\2\tj\3\2\2\2\13w\3"+
		"\2\2\2\r\u0090\3\2\2\2\17\u0097\3\2\2\2\21\u009b\3\2\2\2\23\u009f\3\2"+
		"\2\2\25\u00a9\3\2\2\2\27\u00b2\3\2\2\2\31\u00b6\3\2\2\2\33\u00ba\3\2\2"+
		"\2\35\u00c6\3\2\2\2\37\u00cf\3\2\2\2!\u00d8\3\2\2\2#\u00dd\3\2\2\2%\u00e7"+
		"\3\2\2\2\'\u00ea\3\2\2\2)\u00ec\3\2\2\2+\u00ee\3\2\2\2-\u00f2\3\2\2\2"+
		"/\u00f7\3\2\2\2\61\u00fc\3\2\2\2\63\u00fe\3\2\2\2\65\u0110\3\2\2\2\67"+
		"\u0112\3\2\2\29\u0119\3\2\2\2;\u011d\3\2\2\2=\u011f\3\2\2\2?\u0125\3\2"+
		"\2\2A\u0128\3\2\2\2C\u012a\3\2\2\2E\u012f\3\2\2\2GH\7>\2\2HI\7#\2\2IJ"+
		"\7/\2\2JK\7/\2\2KO\3\2\2\2LN\13\2\2\2ML\3\2\2\2NQ\3\2\2\2OP\3\2\2\2OM"+
		"\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7/\2\2ST\7/\2\2TU\7@\2\2U\6\3\2\2\2VW\7"+
		">\2\2WX\7#\2\2XY\7]\2\2YZ\7E\2\2Z[\7F\2\2[\\\7C\2\2\\]\7V\2\2]^\7C\2\2"+
		"^_\7]\2\2_c\3\2\2\2`b\13\2\2\2a`\3\2\2\2be\3\2\2\2cd\3\2\2\2ca\3\2\2\2"+
		"df\3\2\2\2ec\3\2\2\2fg\7_\2\2gh\7_\2\2hi\7@\2\2i\b\3\2\2\2jk\7>\2\2kl"+
		"\7#\2\2lp\3\2\2\2mo\13\2\2\2nm\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2q"+
		"s\3\2\2\2rp\3\2\2\2st\7@\2\2tu\3\2\2\2uv\b\4\2\2v\n\3\2\2\2wx\7(\2\2x"+
		"y\5\67\33\2yz\7=\2\2z\f\3\2\2\2{|\7(\2\2|}\7%\2\2}\177\3\2\2\2~\u0080"+
		"\5=\36\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7=\2\2\u0084\u0091\3\2\2\2\u0085"+
		"\u0086\7(\2\2\u0086\u0087\7%\2\2\u0087\u0088\7z\2\2\u0088\u008a\3\2\2"+
		"\2\u0089\u008b\5;\35\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7=\2\2\u008f"+
		"\u0091\3\2\2\2\u0090{\3\2\2\2\u0090\u0085\3\2\2\2\u0091\16\3\2\2\2\u0092"+
		"\u0098\t\2\2\2\u0093\u0095\7\17\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\7\f\2\2\u0097\u0092\3\2\2\2\u0097"+
		"\u0094\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\20\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\b\b\3\2\u009e\22\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\7A\2\2\u00a1"+
		"\u00a2\7z\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\3\2\2"+
		"\2\u00a5\u00a6\59\34\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\t\3\2\u00a8\24"+
		"\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ab\7A\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\5\67\33\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\n\4\2\u00af\u00b0\b"+
		"\n\5\2\u00b0\26\3\2\2\2\u00b1\u00b3\n\3\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\30\3\2\2"+
		"\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7c\2\2\u00b9\32\3"+
		"\2\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7e\2\2\u00bd"+
		"\u00be\7n\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7c\2\2"+
		"\u00c1\u00c2\7v\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5"+
		"\7p\2\2\u00c5\34\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9"+
		"\7o\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7c\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\u00ce\7g\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7n\2\2\u00d0"+
		"\u00d1\7q\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7v\2\2"+
		"\u00d4\u00d5\7k\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7p\2\2\u00d7 \3\2\2"+
		"\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7o\2\2\u00db\u00dc"+
		"\7g\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7c\2\2\u00df\u00e0"+
		"\7t\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6$\3\2\2\2\u00e7"+
		"\u00e8\7k\2\2\u00e8\u00e9\7f\2\2\u00e9&\3\2\2\2\u00ea\u00eb\7z\2\2\u00eb"+
		"(\3\2\2\2\u00ec\u00ed\7{\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f1\b\25\6\2\u00f1,\3\2\2\2\u00f2\u00f3\7A\2\2\u00f3"+
		"\u00f4\7@\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\26\6\2\u00f6.\3\2\2\2"+
		"\u00f7\u00f8\7\61\2\2\u00f8\u00f9\7@\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\b\27\6\2\u00fb\60\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fd\62\3\2\2\2\u00fe"+
		"\u00ff\7?\2\2\u00ff\64\3\2\2\2\u0100\u0104\7$\2\2\u0101\u0103\n\4\2\2"+
		"\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0111\7$\2\2\u0108"+
		"\u010c\7)\2\2\u0109\u010b\n\5\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0111\7)\2\2\u0110\u0100\3\2\2\2\u0110\u0108\3\2"+
		"\2\2\u0111\66\3\2\2\2\u0112\u0116\5A \2\u0113\u0115\5?\37\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"8\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\t\6\2\2\u011a\u011b\3\2\2\2"+
		"\u011b\u011c\b\34\2\2\u011c:\3\2\2\2\u011d\u011e\t\7\2\2\u011e<\3\2\2"+
		"\2\u011f\u0120\t\b\2\2\u0120>\3\2\2\2\u0121\u0126\5A \2\u0122\u0126\t"+
		"\t\2\2\u0123\u0126\5=\36\2\u0124\u0126\t\n\2\2\u0125\u0121\3\2\2\2\u0125"+
		"\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126@\3\2\2\2"+
		"\u0127\u0129\t\13\2\2\u0128\u0127\3\2\2\2\u0129B\3\2\2\2\u012a\u012b\7"+
		"A\2\2\u012b\u012c\7@\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b!\6\2\u012e"+
		"D\3\2\2\2\u012f\u0130\13\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\b\"\4\2"+
		"\u0132F\3\2\2\2\25\2\3\4Ocp\u0081\u008c\u0090\u0094\u0097\u0099\u00b4"+
		"\u0104\u010c\u0110\u0116\u0125\u0128\7\b\2\2\7\3\2\5\2\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}