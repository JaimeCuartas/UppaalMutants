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
		DTD=1, SEA_WS=2, OPEN=3, SLASH=4, NTA=5, NTA_CLOSE=6, DECLARATION=7, TEMPLATE=8, 
		CLOSE=9, XMLDeclOpen=10, PROLOG_CLOSE=11, NAME=12, EQUALS=13, STRING=14, 
		PROLOG_WS=15;
	public static final int
		PROLOG=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PROLOG"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DTD", "SEA_WS", "OPEN", "SLASH", "NTA", "NTA_CLOSE", "DECLARATION", 
			"TEMPLATE", "CLOSE", "XMLDeclOpen", "PROLOG_CLOSE", "NAME", "EQUALS", 
			"STRING", "PROLOG_WS", "DIGIT", "NameChar", "NameStartChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<'", "'/'", null, null, null, "'template'", "'>'", 
			null, "'?>'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DTD", "SEA_WS", "OPEN", "SLASH", "NTA", "NTA_CLOSE", "DECLARATION", 
			"TEMPLATE", "CLOSE", "XMLDeclOpen", "PROLOG_CLOSE", "NAME", "EQUALS", 
			"STRING", "PROLOG_WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00c5\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3\2\3"+
		"\3\6\3\65\n\3\r\3\16\3\66\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6A\n\6\f\6"+
		"\16\6D\13\6\3\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\3\7\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16"+
		"\7c\13\7\3\7\3\7\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u009e\n\r\f\r\16\r\u00a1"+
		"\13\r\3\16\3\16\3\17\3\17\7\17\u00a7\n\17\f\17\16\17\u00aa\13\17\3\17"+
		"\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2\13\17\3\17\5\17\u00b5\n\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00c1\n\22\3\23"+
		"\5\23\u00c4\n\23\3.\2\24\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f"+
		"\30\r\32\16\34\17\36\20 \21\"\2$\2&\2\4\2\3\b\5\2\13\f\17\17\"\"\4\2$"+
		"$>>\4\2))>>\3\2\62;\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c"+
		"|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\2\u00cf"+
		"\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2"+
		"\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\3\30\3\2\2\2"+
		"\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\4(\3\2\2\2\6\64\3\2"+
		"\2\2\b:\3\2\2\2\n<\3\2\2\2\f>\3\2\2\2\16Q\3\2\2\2\20f\3\2\2\2\22\u0081"+
		"\3\2\2\2\24\u008a\3\2\2\2\26\u008c\3\2\2\2\30\u0096\3\2\2\2\32\u009b\3"+
		"\2\2\2\34\u00a2\3\2\2\2\36\u00b4\3\2\2\2 \u00b6\3\2\2\2\"\u00ba\3\2\2"+
		"\2$\u00c0\3\2\2\2&\u00c3\3\2\2\2()\7>\2\2)*\7#\2\2*.\3\2\2\2+-\13\2\2"+
		"\2,+\3\2\2\2-\60\3\2\2\2./\3\2\2\2.,\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61"+
		"\62\7@\2\2\62\5\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\b\3\2\29\7\3\2\2\2:;\7>\2\2;\t\3"+
		"\2\2\2<=\7\61\2\2=\13\3\2\2\2>B\7>\2\2?A\t\2\2\2@?\3\2\2\2AD\3\2\2\2B"+
		"@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7p\2\2FG\7v\2\2GH\7c\2\2HL\3"+
		"\2\2\2IK\t\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3"+
		"\2\2\2OP\7@\2\2P\r\3\2\2\2QR\7>\2\2RS\7\61\2\2SW\3\2\2\2TV\t\2\2\2UT\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7p\2\2[\\\7"+
		"v\2\2\\]\7c\2\2]a\3\2\2\2^`\t\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2bd\3\2\2\2ca\3\2\2\2de\7@\2\2e\17\3\2\2\2fj\7>\2\2gi\t\2\2\2hg\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7f\2\2no\7"+
		"g\2\2op\7e\2\2pq\7n\2\2qr\7c\2\2rs\7t\2\2st\7c\2\2tu\7v\2\2uv\7k\2\2v"+
		"w\7q\2\2wx\7p\2\2x|\3\2\2\2y{\t\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}"+
		"\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7@\2\2\u0080\21\3\2\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\u0084\7o\2\2\u0084\u0085\7r\2\2"+
		"\u0085\u0086\7n\2\2\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088\u0089"+
		"\7g\2\2\u0089\23\3\2\2\2\u008a\u008b\7@\2\2\u008b\25\3\2\2\2\u008c\u008d"+
		"\7>\2\2\u008d\u008e\7A\2\2\u008e\u008f\7z\2\2\u008f\u0090\7o\2\2\u0090"+
		"\u0091\7n\2\2\u0091\u0092\3\2\2\2\u0092\u0093\5 \20\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\b\13\3\2\u0095\27\3\2\2\2\u0096\u0097\7A\2\2\u0097\u0098"+
		"\7@\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\f\4\2\u009a\31\3\2\2\2\u009b"+
		"\u009f\5&\23\2\u009c\u009e\5$\22\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\33\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3\35\3\2\2\2\u00a4\u00a8\7$\2\2\u00a5"+
		"\u00a7\n\3\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00b5\7$\2\2\u00ac\u00b0\7)\2\2\u00ad\u00af\n\4\2\2\u00ae\u00ad\3\2\2"+
		"\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\7)\2\2\u00b4\u00a4\3\2\2\2\u00b4"+
		"\u00ac\3\2\2\2\u00b5\37\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7\u00b8\3\2\2"+
		"\2\u00b8\u00b9\b\20\2\2\u00b9!\3\2\2\2\u00ba\u00bb\t\5\2\2\u00bb#\3\2"+
		"\2\2\u00bc\u00c1\5&\23\2\u00bd\u00c1\4/\60\2\u00be\u00c1\5\"\21\2\u00bf"+
		"\u00c1\t\6\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c1%\3\2\2\2\u00c2\u00c4\t\7\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\'\3\2\2\2\22\2\3.\66BLWaj|\u009f\u00a8\u00b0\u00b4\u00c0"+
		"\u00c3\5\b\2\2\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}