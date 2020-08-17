// Generated from C:/Users/57310/Documents/Github/XMLGrammar/src/Parser/Antlr\UppaalParser.g4 by ANTLR 4.8
package Parser.Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UppaalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DTD=1, SEA_WS=2, PROLOG_OPEN=3, NTA_OPEN=4, PROLOG_CLOSE=5, NAME_ATTRIBUTE=6, 
		EQUALS=7, STRING=8, PROLOG_WS=9, NTA_CLOSE=10, DECLARATION_OPEN=11, TEMPLATE_OPEN=12, 
		WS_NTA=13, DECLARATION_CLOSE=14, DECLARATION_TEXT=15, TEMPLATE_CLOSE=16, 
		X=17, Y=18, EQUALS_TEMPLATE=19, NUMBER=20, QUOTES=21, OPEN=22, NAME=23, 
		LOCATION=24, ID=25, TRANSITION=26, URGENT=27, COMMITTED=28, INIT=29, REF=30, 
		SOURCE=31, TARGET=32, OPEN_SLASH=33, CLOSE=34, SLASH_CLOSE=35, IDENTIFIER=36, 
		LABEL_OPEN=37, LABEL_T_OPEN=38, LABEL_COMMENTS_OPEN=39, LABEL_G_OPEN=40, 
		WS_TEMPLATE=41, LABEL_CLOSE=42, LABEL_TEXT=43, GUARD_CLOSE=44, ID_GUARD=45, 
		NAT_GUARD=46, LEFT_PARENTHESIS=47, RIGHT_PARENTHESIS=48, INCREMENT=49, 
		DECREMENT=50, ASSIGN=51, ASSIGN_COLON=52, ASSIGN_ADD=53, ASSIGN_SUB=54, 
		ASSIGN_MUL=55, ASSIGN_DIV=56, ASSIGN_PERCENT=57, ASSIGN_OR=58, ASSIGN_AND=59, 
		ASSIGN_XOR=60, ASSIGN_LSHIFT=61, ASSIGN_RSHIFT=62, ADD=63, SUB=64, EXCLAMATION=65, 
		NOT=66, LESS=67, LESSEQ=68, COMPARE=69, DIFFERENT=70, GREATEREQ=71, GREATER=72, 
		MUL=73, DIV=74, PERCENT=75, BITAND=76, BITOR=77, BITXOR=78, LSHIFT=79, 
		RSHIFT=80, AND_SYMBOL=81, OR_SYMBOL=82, MINIMUM=83, MAXIMUM=84, OR=85, 
		AND=86, IMPLY=87, WS_GUARD=88;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_nta = 2, RULE_declaration = 3, 
		RULE_template = 4, RULE_templ_content = 5, RULE_name = 6, RULE_locations = 7, 
		RULE_coordinate = 8, RULE_init_loc = 9, RULE_labels = 10, RULE_transitions = 11, 
		RULE_labels_t = 12, RULE_label_guard = 13, RULE_guard_expr = 14, RULE_source = 15, 
		RULE_target = 16, RULE_attribute = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "prolog", "nta", "declaration", "template", "templ_content", 
			"name", "locations", "coordinate", "init_loc", "labels", "transitions", 
			"labels_t", "label_guard", "guard_expr", "source", "target", "attribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'?>'", null, null, null, null, null, null, 
			null, null, null, null, null, "'x'", "'y'", null, null, "'\"'", null, 
			"'name'", "'location'", "'id'", "'transition'", "'urgent'", "'committed'", 
			"'init'", "'ref'", "'source'", "'target'", "'</'", null, "'/>'", null, 
			null, null, null, null, null, null, null, null, null, null, "'('", "')'", 
			"'++'", "'--'", null, "':='", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'|='", "'&='", "'^='", "'<<='", "'>>='", "'+'", "'-'", "'!'", "'not'", 
			null, "'<='", "'=='", "'!='", "'>='", null, "'*'", "'/'", "'%'", "'&'", 
			"'|'", "'^'", "'<<'", "'>>'", "'&&'", "'||'", "'<?'", "'>?'", "'or'", 
			"'and'", "'imply'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DTD", "SEA_WS", "PROLOG_OPEN", "NTA_OPEN", "PROLOG_CLOSE", "NAME_ATTRIBUTE", 
			"EQUALS", "STRING", "PROLOG_WS", "NTA_CLOSE", "DECLARATION_OPEN", "TEMPLATE_OPEN", 
			"WS_NTA", "DECLARATION_CLOSE", "DECLARATION_TEXT", "TEMPLATE_CLOSE", 
			"X", "Y", "EQUALS_TEMPLATE", "NUMBER", "QUOTES", "OPEN", "NAME", "LOCATION", 
			"ID", "TRANSITION", "URGENT", "COMMITTED", "INIT", "REF", "SOURCE", "TARGET", 
			"OPEN_SLASH", "CLOSE", "SLASH_CLOSE", "IDENTIFIER", "LABEL_OPEN", "LABEL_T_OPEN", 
			"LABEL_COMMENTS_OPEN", "LABEL_G_OPEN", "WS_TEMPLATE", "LABEL_CLOSE", 
			"LABEL_TEXT", "GUARD_CLOSE", "ID_GUARD", "NAT_GUARD", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "INCREMENT", "DECREMENT", "ASSIGN", "ASSIGN_COLON", 
			"ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", "ASSIGN_DIV", "ASSIGN_PERCENT", 
			"ASSIGN_OR", "ASSIGN_AND", "ASSIGN_XOR", "ASSIGN_LSHIFT", "ASSIGN_RSHIFT", 
			"ADD", "SUB", "EXCLAMATION", "NOT", "LESS", "LESSEQ", "COMPARE", "DIFFERENT", 
			"GREATEREQ", "GREATER", "MUL", "DIV", "PERCENT", "BITAND", "BITOR", "BITXOR", 
			"LSHIFT", "RSHIFT", "AND_SYMBOL", "OR_SYMBOL", "MINIMUM", "MAXIMUM", 
			"OR", "AND", "IMPLY", "WS_GUARD"
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
	public String getGrammarFileName() { return "UppaalParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UppaalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public NtaContext nta() {
			return getRuleContext(NtaContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public TerminalNode DTD() { return getToken(UppaalParser.DTD, 0); }
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROLOG_OPEN) {
				{
				setState(36);
				prolog();
				}
			}

			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(39);
				match(DTD);
				}
			}

			setState(42);
			nta();
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

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode PROLOG_OPEN() { return getToken(UppaalParser.PROLOG_OPEN, 0); }
		public TerminalNode PROLOG_CLOSE() { return getToken(UppaalParser.PROLOG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitProlog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitProlog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(PROLOG_OPEN);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME_ATTRIBUTE) {
				{
				{
				setState(45);
				attribute();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(PROLOG_CLOSE);
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

	public static class NtaContext extends ParserRuleContext {
		public TerminalNode NTA_OPEN() { return getToken(UppaalParser.NTA_OPEN, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode NTA_CLOSE() { return getToken(UppaalParser.NTA_CLOSE, 0); }
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public NtaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterNta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitNta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitNta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NtaContext nta() throws RecognitionException {
		NtaContext _localctx = new NtaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(NTA_OPEN);
			setState(54);
			declaration();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE_OPEN) {
				{
				{
				setState(55);
				template();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(NTA_CLOSE);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DECLARATION_OPEN() { return getToken(UppaalParser.DECLARATION_OPEN, 0); }
		public TerminalNode DECLARATION_CLOSE() { return getToken(UppaalParser.DECLARATION_CLOSE, 0); }
		public TerminalNode DECLARATION_TEXT() { return getToken(UppaalParser.DECLARATION_TEXT, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(DECLARATION_OPEN);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARATION_TEXT) {
				{
				setState(64);
				match(DECLARATION_TEXT);
				}
			}

			setState(67);
			match(DECLARATION_CLOSE);
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

	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_OPEN() { return getToken(UppaalParser.TEMPLATE_OPEN, 0); }
		public Templ_contentContext templ_content() {
			return getRuleContext(Templ_contentContext.class,0);
		}
		public TerminalNode TEMPLATE_CLOSE() { return getToken(UppaalParser.TEMPLATE_CLOSE, 0); }
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(TEMPLATE_OPEN);
			setState(70);
			templ_content();
			setState(71);
			match(TEMPLATE_CLOSE);
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

	public static class Templ_contentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Init_locContext init_loc() {
			return getRuleContext(Init_locContext.class,0);
		}
		public List<LocationsContext> locations() {
			return getRuleContexts(LocationsContext.class);
		}
		public LocationsContext locations(int i) {
			return getRuleContext(LocationsContext.class,i);
		}
		public List<TransitionsContext> transitions() {
			return getRuleContexts(TransitionsContext.class);
		}
		public TransitionsContext transitions(int i) {
			return getRuleContext(TransitionsContext.class,i);
		}
		public Templ_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templ_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTempl_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTempl_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTempl_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Templ_contentContext templ_content() throws RecognitionException {
		Templ_contentContext _localctx = new Templ_contentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_templ_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			name();
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74);
					locations();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(79);
			init_loc();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(80);
				transitions();
				}
				}
				setState(85);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> NAME() { return getTokens(UppaalParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(UppaalParser.NAME, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(OPEN);
			setState(87);
			match(NAME);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(88);
				coordinate();
				}
			}

			setState(91);
			match(CLOSE);
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(OPEN_SLASH);
			setState(94);
			match(NAME);
			setState(95);
			match(CLOSE);
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

	public static class LocationsContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(UppaalParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(UppaalParser.OPEN, i);
		}
		public List<TerminalNode> LOCATION() { return getTokens(UppaalParser.LOCATION); }
		public TerminalNode LOCATION(int i) {
			return getToken(UppaalParser.LOCATION, i);
		}
		public TerminalNode ID() { return getToken(UppaalParser.ID, 0); }
		public TerminalNode EQUALS_TEMPLATE() { return getToken(UppaalParser.EQUALS_TEMPLATE, 0); }
		public List<TerminalNode> QUOTES() { return getTokens(UppaalParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(UppaalParser.QUOTES, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<LabelsContext> labels() {
			return getRuleContexts(LabelsContext.class);
		}
		public LabelsContext labels(int i) {
			return getRuleContext(LabelsContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public TerminalNode URGENT() { return getToken(UppaalParser.URGENT, 0); }
		public TerminalNode COMMITTED() { return getToken(UppaalParser.COMMITTED, 0); }
		public LocationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLocations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLocations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLocations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationsContext locations() throws RecognitionException {
		LocationsContext _localctx = new LocationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_locations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(OPEN);
			setState(98);
			match(LOCATION);
			setState(99);
			match(ID);
			setState(100);
			match(EQUALS_TEMPLATE);
			setState(101);
			match(QUOTES);
			setState(102);
			match(IDENTIFIER);
			setState(103);
			match(QUOTES);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(104);
				coordinate();
				}
			}

			setState(107);
			match(CLOSE);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(108);
				name();
				}
				break;
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LABEL_OPEN || _la==LABEL_COMMENTS_OPEN) {
				{
				{
				setState(111);
				labels();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(117);
				match(OPEN);
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==URGENT || _la==COMMITTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				match(SLASH_CLOSE);
				}
			}

			setState(122);
			match(OPEN_SLASH);
			setState(123);
			match(LOCATION);
			setState(124);
			match(CLOSE);
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

	public static class CoordinateContext extends ParserRuleContext {
		public TerminalNode X() { return getToken(UppaalParser.X, 0); }
		public List<TerminalNode> EQUALS_TEMPLATE() { return getTokens(UppaalParser.EQUALS_TEMPLATE); }
		public TerminalNode EQUALS_TEMPLATE(int i) {
			return getToken(UppaalParser.EQUALS_TEMPLATE, i);
		}
		public List<TerminalNode> QUOTES() { return getTokens(UppaalParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(UppaalParser.QUOTES, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(UppaalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(UppaalParser.NUMBER, i);
		}
		public TerminalNode Y() { return getToken(UppaalParser.Y, 0); }
		public CoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterCoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitCoordinate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinateContext coordinate() throws RecognitionException {
		CoordinateContext _localctx = new CoordinateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(X);
			setState(127);
			match(EQUALS_TEMPLATE);
			setState(128);
			match(QUOTES);
			setState(129);
			match(NUMBER);
			setState(130);
			match(QUOTES);
			setState(131);
			match(Y);
			setState(132);
			match(EQUALS_TEMPLATE);
			setState(133);
			match(QUOTES);
			setState(134);
			match(NUMBER);
			setState(135);
			match(QUOTES);
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

	public static class Init_locContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public TerminalNode INIT() { return getToken(UppaalParser.INIT, 0); }
		public TerminalNode REF() { return getToken(UppaalParser.REF, 0); }
		public TerminalNode EQUALS_TEMPLATE() { return getToken(UppaalParser.EQUALS_TEMPLATE, 0); }
		public List<TerminalNode> QUOTES() { return getTokens(UppaalParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(UppaalParser.QUOTES, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public Init_locContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterInit_loc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitInit_loc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitInit_loc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_locContext init_loc() throws RecognitionException {
		Init_locContext _localctx = new Init_locContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_init_loc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(OPEN);
			setState(138);
			match(INIT);
			setState(139);
			match(REF);
			setState(140);
			match(EQUALS_TEMPLATE);
			setState(141);
			match(QUOTES);
			setState(142);
			match(IDENTIFIER);
			setState(143);
			match(QUOTES);
			setState(144);
			match(SLASH_CLOSE);
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

	public static class LabelsContext extends ParserRuleContext {
		public TerminalNode LABEL_CLOSE() { return getToken(UppaalParser.LABEL_CLOSE, 0); }
		public TerminalNode LABEL_OPEN() { return getToken(UppaalParser.LABEL_OPEN, 0); }
		public TerminalNode LABEL_COMMENTS_OPEN() { return getToken(UppaalParser.LABEL_COMMENTS_OPEN, 0); }
		public TerminalNode LABEL_TEXT() { return getToken(UppaalParser.LABEL_TEXT, 0); }
		public LabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelsContext labels() throws RecognitionException {
		LabelsContext _localctx = new LabelsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==LABEL_OPEN || _la==LABEL_COMMENTS_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_TEXT) {
				{
				setState(147);
				match(LABEL_TEXT);
				}
			}

			setState(150);
			match(LABEL_CLOSE);
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

	public static class TransitionsContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> TRANSITION() { return getTokens(UppaalParser.TRANSITION); }
		public TerminalNode TRANSITION(int i) {
			return getToken(UppaalParser.TRANSITION, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public List<Labels_tContext> labels_t() {
			return getRuleContexts(Labels_tContext.class);
		}
		public Labels_tContext labels_t(int i) {
			return getRuleContext(Labels_tContext.class,i);
		}
		public Label_guardContext label_guard() {
			return getRuleContext(Label_guardContext.class,0);
		}
		public TransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTransitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTransitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTransitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionsContext transitions() throws RecognitionException {
		TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_transitions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(OPEN);
			setState(153);
			match(TRANSITION);
			setState(154);
			match(CLOSE);
			setState(155);
			source();
			setState(156);
			target();
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					labels_t();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_G_OPEN) {
				{
				setState(163);
				label_guard();
				}
			}

			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LABEL_T_OPEN || _la==LABEL_COMMENTS_OPEN) {
				{
				{
				setState(166);
				labels_t();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(OPEN_SLASH);
			setState(173);
			match(TRANSITION);
			setState(174);
			match(CLOSE);
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

	public static class Labels_tContext extends ParserRuleContext {
		public TerminalNode LABEL_CLOSE() { return getToken(UppaalParser.LABEL_CLOSE, 0); }
		public TerminalNode LABEL_T_OPEN() { return getToken(UppaalParser.LABEL_T_OPEN, 0); }
		public TerminalNode LABEL_COMMENTS_OPEN() { return getToken(UppaalParser.LABEL_COMMENTS_OPEN, 0); }
		public TerminalNode LABEL_TEXT() { return getToken(UppaalParser.LABEL_TEXT, 0); }
		public Labels_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labels_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabels_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabels_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabels_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labels_tContext labels_t() throws RecognitionException {
		Labels_tContext _localctx = new Labels_tContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_labels_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==LABEL_T_OPEN || _la==LABEL_COMMENTS_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_TEXT) {
				{
				setState(177);
				match(LABEL_TEXT);
				}
			}

			setState(180);
			match(LABEL_CLOSE);
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

	public static class Label_guardContext extends ParserRuleContext {
		public TerminalNode LABEL_G_OPEN() { return getToken(UppaalParser.LABEL_G_OPEN, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode GUARD_CLOSE() { return getToken(UppaalParser.GUARD_CLOSE, 0); }
		public Label_guardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabel_guard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabel_guard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabel_guard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_guardContext label_guard() throws RecognitionException {
		Label_guardContext _localctx = new Label_guardContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_label_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(LABEL_G_OPEN);
			setState(183);
			guard_expr(0);
			setState(184);
			match(GUARD_CLOSE);
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

	public static class Guard_exprContext extends ParserRuleContext {
		public Token unary;
		public Token assign;
		public Token binary;
		public TerminalNode ID_GUARD() { return getToken(UppaalParser.ID_GUARD, 0); }
		public TerminalNode NAT_GUARD() { return getToken(UppaalParser.NAT_GUARD, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode INCREMENT() { return getToken(UppaalParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(UppaalParser.DECREMENT, 0); }
		public TerminalNode SUB() { return getToken(UppaalParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(UppaalParser.ADD, 0); }
		public TerminalNode EXCLAMATION() { return getToken(UppaalParser.EXCLAMATION, 0); }
		public TerminalNode NOT() { return getToken(UppaalParser.NOT, 0); }
		public TerminalNode ASSIGN() { return getToken(UppaalParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_COLON() { return getToken(UppaalParser.ASSIGN_COLON, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(UppaalParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(UppaalParser.ASSIGN_SUB, 0); }
		public TerminalNode ASSIGN_MUL() { return getToken(UppaalParser.ASSIGN_MUL, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(UppaalParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_PERCENT() { return getToken(UppaalParser.ASSIGN_PERCENT, 0); }
		public TerminalNode ASSIGN_OR() { return getToken(UppaalParser.ASSIGN_OR, 0); }
		public TerminalNode ASSIGN_AND() { return getToken(UppaalParser.ASSIGN_AND, 0); }
		public TerminalNode ASSIGN_XOR() { return getToken(UppaalParser.ASSIGN_XOR, 0); }
		public TerminalNode ASSIGN_LSHIFT() { return getToken(UppaalParser.ASSIGN_LSHIFT, 0); }
		public TerminalNode ASSIGN_RSHIFT() { return getToken(UppaalParser.ASSIGN_RSHIFT, 0); }
		public TerminalNode LESS() { return getToken(UppaalParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(UppaalParser.LESSEQ, 0); }
		public TerminalNode COMPARE() { return getToken(UppaalParser.COMPARE, 0); }
		public TerminalNode DIFFERENT() { return getToken(UppaalParser.DIFFERENT, 0); }
		public TerminalNode GREATEREQ() { return getToken(UppaalParser.GREATEREQ, 0); }
		public TerminalNode GREATER() { return getToken(UppaalParser.GREATER, 0); }
		public TerminalNode MUL() { return getToken(UppaalParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(UppaalParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(UppaalParser.PERCENT, 0); }
		public TerminalNode BITAND() { return getToken(UppaalParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(UppaalParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(UppaalParser.BITXOR, 0); }
		public TerminalNode LSHIFT() { return getToken(UppaalParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(UppaalParser.RSHIFT, 0); }
		public TerminalNode AND_SYMBOL() { return getToken(UppaalParser.AND_SYMBOL, 0); }
		public TerminalNode OR_SYMBOL() { return getToken(UppaalParser.OR_SYMBOL, 0); }
		public TerminalNode MINIMUM() { return getToken(UppaalParser.MINIMUM, 0); }
		public TerminalNode MAXIMUM() { return getToken(UppaalParser.MAXIMUM, 0); }
		public TerminalNode OR() { return getToken(UppaalParser.OR, 0); }
		public TerminalNode AND() { return getToken(UppaalParser.AND, 0); }
		public TerminalNode IMPLY() { return getToken(UppaalParser.IMPLY, 0); }
		public Guard_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuard_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuard_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuard_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_exprContext guard_expr() throws RecognitionException {
		return guard_expr(0);
	}

	private Guard_exprContext guard_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Guard_exprContext _localctx = new Guard_exprContext(_ctx, _parentState);
		Guard_exprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_guard_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_GUARD:
				{
				setState(187);
				match(ID_GUARD);
				}
				break;
			case NAT_GUARD:
				{
				setState(188);
				match(NAT_GUARD);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(189);
				match(LEFT_PARENTHESIS);
				setState(190);
				guard_expr(0);
				setState(191);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case INCREMENT:
				{
				setState(193);
				match(INCREMENT);
				setState(194);
				guard_expr(6);
				}
				break;
			case DECREMENT:
				{
				setState(195);
				match(DECREMENT);
				setState(196);
				guard_expr(4);
				}
				break;
			case ADD:
			case SUB:
			case EXCLAMATION:
			case NOT:
				{
				setState(197);
				((Guard_exprContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (ADD - 63)) | (1L << (SUB - 63)) | (1L << (EXCLAMATION - 63)) | (1L << (NOT - 63)))) != 0)) ) {
					((Guard_exprContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				guard_expr(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(202);
						((Guard_exprContext)_localctx).assign = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_COLON) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MUL) | (1L << ASSIGN_DIV) | (1L << ASSIGN_PERCENT) | (1L << ASSIGN_OR) | (1L << ASSIGN_AND) | (1L << ASSIGN_XOR) | (1L << ASSIGN_LSHIFT) | (1L << ASSIGN_RSHIFT))) != 0)) ) {
							((Guard_exprContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						guard_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(204);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(205);
						((Guard_exprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (ADD - 63)) | (1L << (SUB - 63)) | (1L << (LESS - 63)) | (1L << (LESSEQ - 63)) | (1L << (COMPARE - 63)) | (1L << (DIFFERENT - 63)) | (1L << (GREATEREQ - 63)) | (1L << (GREATER - 63)) | (1L << (MUL - 63)) | (1L << (DIV - 63)) | (1L << (PERCENT - 63)) | (1L << (BITAND - 63)) | (1L << (BITOR - 63)) | (1L << (BITXOR - 63)) | (1L << (LSHIFT - 63)) | (1L << (RSHIFT - 63)) | (1L << (AND_SYMBOL - 63)) | (1L << (OR_SYMBOL - 63)) | (1L << (MINIMUM - 63)) | (1L << (MAXIMUM - 63)) | (1L << (OR - 63)) | (1L << (AND - 63)) | (1L << (IMPLY - 63)))) != 0)) ) {
							((Guard_exprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						guard_expr(2);
						}
						break;
					case 3:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(207);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(208);
						match(INCREMENT);
						}
						break;
					case 4:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(209);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(210);
						match(DECREMENT);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public TerminalNode SOURCE() { return getToken(UppaalParser.SOURCE, 0); }
		public TerminalNode REF() { return getToken(UppaalParser.REF, 0); }
		public TerminalNode EQUALS_TEMPLATE() { return getToken(UppaalParser.EQUALS_TEMPLATE, 0); }
		public List<TerminalNode> QUOTES() { return getTokens(UppaalParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(UppaalParser.QUOTES, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(OPEN);
			setState(217);
			match(SOURCE);
			setState(218);
			match(REF);
			setState(219);
			match(EQUALS_TEMPLATE);
			setState(220);
			match(QUOTES);
			setState(221);
			match(IDENTIFIER);
			setState(222);
			match(QUOTES);
			setState(223);
			match(SLASH_CLOSE);
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

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public TerminalNode TARGET() { return getToken(UppaalParser.TARGET, 0); }
		public TerminalNode REF() { return getToken(UppaalParser.REF, 0); }
		public TerminalNode EQUALS_TEMPLATE() { return getToken(UppaalParser.EQUALS_TEMPLATE, 0); }
		public List<TerminalNode> QUOTES() { return getTokens(UppaalParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(UppaalParser.QUOTES, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(OPEN);
			setState(226);
			match(TARGET);
			setState(227);
			match(REF);
			setState(228);
			match(EQUALS_TEMPLATE);
			setState(229);
			match(QUOTES);
			setState(230);
			match(IDENTIFIER);
			setState(231);
			match(QUOTES);
			setState(232);
			match(SLASH_CLOSE);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode NAME_ATTRIBUTE() { return getToken(UppaalParser.NAME_ATTRIBUTE, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(NAME_ATTRIBUTE);
			setState(235);
			match(EQUALS);
			setState(236);
			match(STRING);
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
		case 14:
			return guard_expr_sempred((Guard_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean guard_expr_sempred(Guard_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Z\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\5\2(\n\2\3\2\5\2+\n\2\3\2\3\2\3\3\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\3\3\3\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\5\3\5"+
		"\5\5D\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\6\7N\n\7\r\7\16\7O\3\7\3\7\7"+
		"\7T\n\7\f\7\16\7W\13\7\3\b\3\b\3\b\5\b\\\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\t\3\t\5\tp\n\t\3\t\7\ts\n\t"+
		"\f\t\16\tv\13\t\3\t\3\t\3\t\5\t{\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\5\f\u0097\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a1\n\r\f"+
		"\r\16\r\u00a4\13\r\3\r\5\r\u00a7\n\r\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad"+
		"\13\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00b5\n\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00ca\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00d6\n\20\f\20\16\20\u00d9\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\2\3\36\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2"+
		"\b\3\2\35\36\4\2\'\'))\3\2()\3\2AD\3\2\65@\4\2ABEY\2\u00f8\2\'\3\2\2\2"+
		"\4.\3\2\2\2\6\67\3\2\2\2\bA\3\2\2\2\nG\3\2\2\2\fK\3\2\2\2\16X\3\2\2\2"+
		"\20c\3\2\2\2\22\u0080\3\2\2\2\24\u008b\3\2\2\2\26\u0094\3\2\2\2\30\u009a"+
		"\3\2\2\2\32\u00b2\3\2\2\2\34\u00b8\3\2\2\2\36\u00c9\3\2\2\2 \u00da\3\2"+
		"\2\2\"\u00e3\3\2\2\2$\u00ec\3\2\2\2&(\5\4\3\2\'&\3\2\2\2\'(\3\2\2\2(*"+
		"\3\2\2\2)+\7\3\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\5\6\4\2-\3\3\2\2\2"+
		".\62\7\5\2\2/\61\5$\23\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\7\2\2\66\5\3\2\2\2\678\7"+
		"\6\2\28<\5\b\5\29;\5\n\6\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3"+
		"\2\2\2><\3\2\2\2?@\7\f\2\2@\7\3\2\2\2AC\7\r\2\2BD\7\21\2\2CB\3\2\2\2C"+
		"D\3\2\2\2DE\3\2\2\2EF\7\20\2\2F\t\3\2\2\2GH\7\16\2\2HI\5\f\7\2IJ\7\22"+
		"\2\2J\13\3\2\2\2KM\5\16\b\2LN\5\20\t\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2O"+
		"P\3\2\2\2PQ\3\2\2\2QU\5\24\13\2RT\5\30\r\2SR\3\2\2\2TW\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2V\r\3\2\2\2WU\3\2\2\2XY\7\30\2\2Y[\7\31\2\2Z\\\5\22\n\2[Z"+
		"\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7$\2\2^_\7&\2\2_`\7#\2\2`a\7\31\2\2a"+
		"b\7$\2\2b\17\3\2\2\2cd\7\30\2\2de\7\32\2\2ef\7\33\2\2fg\7\25\2\2gh\7\27"+
		"\2\2hi\7&\2\2ik\7\27\2\2jl\5\22\n\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\7"+
		"$\2\2np\5\16\b\2on\3\2\2\2op\3\2\2\2pt\3\2\2\2qs\5\26\f\2rq\3\2\2\2sv"+
		"\3\2\2\2tr\3\2\2\2tu\3\2\2\2uz\3\2\2\2vt\3\2\2\2wx\7\30\2\2xy\t\2\2\2"+
		"y{\7%\2\2zw\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7#\2\2}~\7\32\2\2~\177\7$\2"+
		"\2\177\21\3\2\2\2\u0080\u0081\7\23\2\2\u0081\u0082\7\25\2\2\u0082\u0083"+
		"\7\27\2\2\u0083\u0084\7\26\2\2\u0084\u0085\7\27\2\2\u0085\u0086\7\24\2"+
		"\2\u0086\u0087\7\25\2\2\u0087\u0088\7\27\2\2\u0088\u0089\7\26\2\2\u0089"+
		"\u008a\7\27\2\2\u008a\23\3\2\2\2\u008b\u008c\7\30\2\2\u008c\u008d\7\37"+
		"\2\2\u008d\u008e\7 \2\2\u008e\u008f\7\25\2\2\u008f\u0090\7\27\2\2\u0090"+
		"\u0091\7&\2\2\u0091\u0092\7\27\2\2\u0092\u0093\7%\2\2\u0093\25\3\2\2\2"+
		"\u0094\u0096\t\3\2\2\u0095\u0097\7-\2\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7,\2\2\u0099\27\3\2\2\2\u009a"+
		"\u009b\7\30\2\2\u009b\u009c\7\34\2\2\u009c\u009d\7$\2\2\u009d\u009e\5"+
		" \21\2\u009e\u00a2\5\"\22\2\u009f\u00a1\5\32\16\2\u00a0\u009f\3\2\2\2"+
		"\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5\34\17\2\u00a6\u00a5\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\5\32\16\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7#\2\2\u00af\u00b0\7\34"+
		"\2\2\u00b0\u00b1\7$\2\2\u00b1\31\3\2\2\2\u00b2\u00b4\t\4\2\2\u00b3\u00b5"+
		"\7-\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\7,\2\2\u00b7\33\3\2\2\2\u00b8\u00b9\7*\2\2\u00b9\u00ba\5\36\20"+
		"\2\u00ba\u00bb\7.\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\b\20\1\2\u00bd\u00ca"+
		"\7/\2\2\u00be\u00ca\7\60\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\5\36\20"+
		"\2\u00c1\u00c2\7\62\2\2\u00c2\u00ca\3\2\2\2\u00c3\u00c4\7\63\2\2\u00c4"+
		"\u00ca\5\36\20\b\u00c5\u00c6\7\64\2\2\u00c6\u00ca\5\36\20\6\u00c7\u00c8"+
		"\t\5\2\2\u00c8\u00ca\5\36\20\4\u00c9\u00bc\3\2\2\2\u00c9\u00be\3\2\2\2"+
		"\u00c9\u00bf\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00d7\3\2\2\2\u00cb\u00cc\f\5\2\2\u00cc\u00cd\t\6\2\2\u00cd"+
		"\u00d6\5\36\20\6\u00ce\u00cf\f\3\2\2\u00cf\u00d0\t\7\2\2\u00d0\u00d6\5"+
		"\36\20\4\u00d1\u00d2\f\t\2\2\u00d2\u00d6\7\63\2\2\u00d3\u00d4\f\7\2\2"+
		"\u00d4\u00d6\7\64\2\2\u00d5\u00cb\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d5\u00d1"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\37\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\30\2"+
		"\2\u00db\u00dc\7!\2\2\u00dc\u00dd\7 \2\2\u00dd\u00de\7\25\2\2\u00de\u00df"+
		"\7\27\2\2\u00df\u00e0\7&\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00e2\7%\2\2\u00e2"+
		"!\3\2\2\2\u00e3\u00e4\7\30\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\7 \2\2"+
		"\u00e6\u00e7\7\25\2\2\u00e7\u00e8\7\27\2\2\u00e8\u00e9\7&\2\2\u00e9\u00ea"+
		"\7\27\2\2\u00ea\u00eb\7%\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7\b\2\2\u00ed"+
		"\u00ee\7\t\2\2\u00ee\u00ef\7\n\2\2\u00ef%\3\2\2\2\26\'*\62<COU[kotz\u0096"+
		"\u00a2\u00a6\u00ab\u00b4\u00c9\u00d5\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}