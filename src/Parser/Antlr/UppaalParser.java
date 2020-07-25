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
		LOCATION=24, ID=25, TRANSITION=26, INIT=27, REF=28, OPEN_SLASH=29, CLOSE=30, 
		SLASH_CLOSE=31, IDENTIFIER=32, WS_TEMPLATE=33;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_nta = 2, RULE_declaration = 3, 
		RULE_decl_content = 4, RULE_template = 5, RULE_templ_content = 6, RULE_name = 7, 
		RULE_locations = 8, RULE_init_loc = 9, RULE_transitions = 10, RULE_attribute = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "prolog", "nta", "declaration", "decl_content", "template", 
			"templ_content", "name", "locations", "init_loc", "transitions", "attribute"
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROLOG_OPEN) {
				{
				setState(24);
				prolog();
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(27);
				match(DTD);
				}
			}

			setState(30);
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
			setState(32);
			match(PROLOG_OPEN);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME_ATTRIBUTE) {
				{
				{
				setState(33);
				attribute();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
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
			setState(41);
			match(NTA_OPEN);
			setState(42);
			declaration();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE_OPEN) {
				{
				{
				setState(43);
				template();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
		public Decl_contentContext decl_content() {
			return getRuleContext(Decl_contentContext.class,0);
		}
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
			setState(51);
			match(DECLARATION_OPEN);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARATION_TEXT) {
				{
				setState(52);
				decl_content();
				}
			}

			setState(55);
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

	public static class Decl_contentContext extends ParserRuleContext {
		public TerminalNode DECLARATION_TEXT() { return getToken(UppaalParser.DECLARATION_TEXT, 0); }
		public Decl_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDecl_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDecl_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDecl_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_contentContext decl_content() throws RecognitionException {
		Decl_contentContext _localctx = new Decl_contentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(DECLARATION_TEXT);
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
		enterRule(_localctx, 10, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(TEMPLATE_OPEN);
			setState(60);
			templ_content();
			setState(61);
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
		enterRule(_localctx, 12, RULE_templ_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			name();
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					locations();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(70);
			init_loc();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(71);
				transitions();
				}
				}
				setState(76);
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
		enterRule(_localctx, 14, RULE_name);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(OPEN);
				setState(78);
				match(NAME);
				setState(79);
				match(CLOSE);
				setState(80);
				match(IDENTIFIER);
				setState(81);
				match(OPEN_SLASH);
				setState(82);
				match(NAME);
				setState(83);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(OPEN);
				setState(85);
				match(NAME);
				setState(86);
				match(X);
				setState(87);
				match(EQUALS_TEMPLATE);
				setState(88);
				match(QUOTES);
				setState(89);
				match(NUMBER);
				setState(90);
				match(QUOTES);
				setState(91);
				match(Y);
				setState(92);
				match(EQUALS_TEMPLATE);
				setState(93);
				match(QUOTES);
				setState(94);
				match(NUMBER);
				setState(95);
				match(QUOTES);
				setState(96);
				match(CLOSE);
				setState(97);
				match(IDENTIFIER);
				setState(98);
				match(OPEN_SLASH);
				setState(99);
				match(NAME);
				setState(100);
				match(CLOSE);
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

	public static class LocationsContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> LOCATION() { return getTokens(UppaalParser.LOCATION); }
		public TerminalNode LOCATION(int i) {
			return getToken(UppaalParser.LOCATION, i);
		}
		public TerminalNode ID() { return getToken(UppaalParser.ID, 0); }
		public List<TerminalNode> EQUALS_TEMPLATE() { return getTokens(UppaalParser.EQUALS_TEMPLATE); }
		public TerminalNode EQUALS_TEMPLATE(int i) {
			return getToken(UppaalParser.EQUALS_TEMPLATE, i);
		}
		public List<TerminalNode> QUOTES() { return getTokens(UppaalParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(UppaalParser.QUOTES, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode X() { return getToken(UppaalParser.X, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(UppaalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(UppaalParser.NUMBER, i);
		}
		public TerminalNode Y() { return getToken(UppaalParser.Y, 0); }
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
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
		enterRule(_localctx, 16, RULE_locations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(OPEN);
			setState(104);
			match(LOCATION);
			setState(105);
			match(ID);
			setState(106);
			match(EQUALS_TEMPLATE);
			setState(107);
			match(QUOTES);
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(QUOTES);
			setState(110);
			match(X);
			setState(111);
			match(EQUALS_TEMPLATE);
			setState(112);
			match(QUOTES);
			setState(113);
			match(NUMBER);
			setState(114);
			match(QUOTES);
			setState(115);
			match(Y);
			setState(116);
			match(EQUALS_TEMPLATE);
			setState(117);
			match(QUOTES);
			setState(118);
			match(NUMBER);
			setState(119);
			match(QUOTES);
			setState(120);
			match(CLOSE);
			setState(121);
			name();
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
			setState(126);
			match(OPEN);
			setState(127);
			match(INIT);
			setState(128);
			match(REF);
			setState(129);
			match(EQUALS_TEMPLATE);
			setState(130);
			match(QUOTES);
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(QUOTES);
			setState(133);
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
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
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
		enterRule(_localctx, 20, RULE_transitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(OPEN);
			setState(136);
			match(TRANSITION);
			setState(137);
			match(CLOSE);
			setState(138);
			match(OPEN_SLASH);
			setState(139);
			match(TRANSITION);
			setState(140);
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
		enterRule(_localctx, 22, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(NAME_ATTRIBUTE);
			setState(143);
			match(EQUALS);
			setState(144);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0095\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\5\2\37\n\2\3\2\3\2\3\3\3\3\7\3"+
		"%\n\3\f\3\16\3(\13\3\3\3\3\3\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4"+
		"\3\4\3\5\3\5\5\58\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\7\bD\n\b"+
		"\f\b\16\bG\13\b\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\th\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\2\2\16\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\2\2\2\u0090\2\33\3\2\2\2\4\"\3\2\2\2\6+\3\2"+
		"\2\2\b\65\3\2\2\2\n;\3\2\2\2\f=\3\2\2\2\16A\3\2\2\2\20g\3\2\2\2\22i\3"+
		"\2\2\2\24\u0080\3\2\2\2\26\u0089\3\2\2\2\30\u0090\3\2\2\2\32\34\5\4\3"+
		"\2\33\32\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\37\7\3\2\2\36\35\3\2\2"+
		"\2\36\37\3\2\2\2\37 \3\2\2\2 !\5\6\4\2!\3\3\2\2\2\"&\7\5\2\2#%\5\30\r"+
		"\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\7"+
		"\2\2*\5\3\2\2\2+,\7\6\2\2,\60\5\b\5\2-/\5\f\7\2.-\3\2\2\2/\62\3\2\2\2"+
		"\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\f\2\2\64"+
		"\7\3\2\2\2\65\67\7\r\2\2\668\5\n\6\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2"+
		"\29:\7\20\2\2:\t\3\2\2\2;<\7\21\2\2<\13\3\2\2\2=>\7\16\2\2>?\5\16\b\2"+
		"?@\7\22\2\2@\r\3\2\2\2AE\5\20\t\2BD\5\22\n\2CB\3\2\2\2DG\3\2\2\2EC\3\2"+
		"\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HL\5\24\13\2IK\5\26\f\2JI\3\2\2\2KN"+
		"\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\17\3\2\2\2NL\3\2\2\2OP\7\30\2\2PQ\7\31\2"+
		"\2QR\7 \2\2RS\7\"\2\2ST\7\37\2\2TU\7\31\2\2Uh\7 \2\2VW\7\30\2\2WX\7\31"+
		"\2\2XY\7\23\2\2YZ\7\25\2\2Z[\7\27\2\2[\\\7\26\2\2\\]\7\27\2\2]^\7\24\2"+
		"\2^_\7\25\2\2_`\7\27\2\2`a\7\26\2\2ab\7\27\2\2bc\7 \2\2cd\7\"\2\2de\7"+
		"\37\2\2ef\7\31\2\2fh\7 \2\2gO\3\2\2\2gV\3\2\2\2h\21\3\2\2\2ij\7\30\2\2"+
		"jk\7\32\2\2kl\7\33\2\2lm\7\25\2\2mn\7\27\2\2no\7\"\2\2op\7\27\2\2pq\7"+
		"\23\2\2qr\7\25\2\2rs\7\27\2\2st\7\26\2\2tu\7\27\2\2uv\7\24\2\2vw\7\25"+
		"\2\2wx\7\27\2\2xy\7\26\2\2yz\7\27\2\2z{\7 \2\2{|\5\20\t\2|}\7\37\2\2}"+
		"~\7\32\2\2~\177\7 \2\2\177\23\3\2\2\2\u0080\u0081\7\30\2\2\u0081\u0082"+
		"\7\35\2\2\u0082\u0083\7\36\2\2\u0083\u0084\7\25\2\2\u0084\u0085\7\27\2"+
		"\2\u0085\u0086\7\"\2\2\u0086\u0087\7\27\2\2\u0087\u0088\7!\2\2\u0088\25"+
		"\3\2\2\2\u0089\u008a\7\30\2\2\u008a\u008b\7\34\2\2\u008b\u008c\7 \2\2"+
		"\u008c\u008d\7\37\2\2\u008d\u008e\7\34\2\2\u008e\u008f\7 \2\2\u008f\27"+
		"\3\2\2\2\u0090\u0091\7\b\2\2\u0091\u0092\7\t\2\2\u0092\u0093\7\n\2\2\u0093"+
		"\31\3\2\2\2\n\33\36&\60\67ELg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}