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
		WS_TEMPLATE=41, LABEL_CLOSE=42, LABEL_TEXT=43, GUARD_CLOSE=44, NAT_GUARD=45, 
		LEFT_PARENTHESIS=46, RIGHT_PARENTHESIS=47, LEFT_BRACKET=48, RIGHT_BRACKET=49, 
		COMMA=50, INCREMENT=51, DECREMENT=52, ASSIGN=53, ASSIGN_COLON=54, ASSIGN_ADD=55, 
		ASSIGN_SUB=56, ASSIGN_MUL=57, ASSIGN_DIV=58, ASSIGN_PERCENT=59, ASSIGN_OR=60, 
		ASSIGN_AND=61, ASSIGN_XOR=62, ASSIGN_LSHIFT=63, ASSIGN_RSHIFT=64, ADD=65, 
		SUB=66, EXCLAMATION=67, NOT=68, LESS=69, LESSEQ=70, COMPARE=71, DIFFERENT=72, 
		GREATEREQ=73, GREATER=74, MUL=75, DIV=76, PERCENT=77, BITAND=78, BITOR=79, 
		BITXOR=80, LSHIFT=81, RSHIFT=82, AND_SYMBOL=83, OR_SYMBOL=84, MINIMUM=85, 
		MAXIMUM=86, OR=87, AND=88, IMPLY=89, IF=90, ELSE=91, LOOKUP_OP=92, FORALL=93, 
		EXISTS=94, META=95, CONST=96, INT=97, SCALAR=98, ID_GUARD=99, WS_GUARD=100;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_nta = 2, RULE_declaration = 3, 
		RULE_template = 4, RULE_templ_content = 5, RULE_name = 6, RULE_locations = 7, 
		RULE_coordinate = 8, RULE_init_loc = 9, RULE_labels = 10, RULE_transitions = 11, 
		RULE_labels_t = 12, RULE_label_guard = 13, RULE_guard_expr = 14, RULE_arguments = 15, 
		RULE_type = 16, RULE_typeId = 17, RULE_source = 18, RULE_target = 19, 
		RULE_attribute = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "prolog", "nta", "declaration", "template", "templ_content", 
			"name", "locations", "coordinate", "init_loc", "labels", "transitions", 
			"labels_t", "label_guard", "guard_expr", "arguments", "type", "typeId", 
			"source", "target", "attribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'?>'", null, null, null, null, null, null, 
			null, null, null, null, null, "'x'", "'y'", null, null, "'\"'", null, 
			"'name'", "'location'", "'id'", "'transition'", "'urgent'", "'committed'", 
			"'init'", "'ref'", "'source'", "'target'", "'</'", null, "'/>'", null, 
			null, null, null, null, null, null, null, null, null, "'('", "')'", "'['", 
			"']'", "','", "'++'", "'--'", null, "':='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'|='", "'&='", "'^='", "'<<='", "'>>='", "'+'", "'-'", "'!'", 
			"'not'", null, "'<='", "'=='", "'!='", "'>='", null, "'*'", "'/'", "'%'", 
			"'&'", "'|'", "'^'", "'<<'", "'>>'", "'&&'", "'||'", "'<?'", "'>?'", 
			"'or'", "'and'", "'imply'", "'?'", "':'", "'.'", "'forall'", "'exists'", 
			"'meta'", "'const'", "'int'", "'scalar'"
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
			"LABEL_TEXT", "GUARD_CLOSE", "NAT_GUARD", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "COMMA", "INCREMENT", "DECREMENT", "ASSIGN", 
			"ASSIGN_COLON", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", "ASSIGN_DIV", 
			"ASSIGN_PERCENT", "ASSIGN_OR", "ASSIGN_AND", "ASSIGN_XOR", "ASSIGN_LSHIFT", 
			"ASSIGN_RSHIFT", "ADD", "SUB", "EXCLAMATION", "NOT", "LESS", "LESSEQ", 
			"COMPARE", "DIFFERENT", "GREATEREQ", "GREATER", "MUL", "DIV", "PERCENT", 
			"BITAND", "BITOR", "BITXOR", "LSHIFT", "RSHIFT", "AND_SYMBOL", "OR_SYMBOL", 
			"MINIMUM", "MAXIMUM", "OR", "AND", "IMPLY", "IF", "ELSE", "LOOKUP_OP", 
			"FORALL", "EXISTS", "META", "CONST", "INT", "SCALAR", "ID_GUARD", "WS_GUARD"
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROLOG_OPEN) {
				{
				setState(42);
				prolog();
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(45);
				match(DTD);
				}
			}

			setState(48);
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
			setState(50);
			match(PROLOG_OPEN);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME_ATTRIBUTE) {
				{
				{
				setState(51);
				attribute();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
			setState(59);
			match(NTA_OPEN);
			setState(60);
			declaration();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE_OPEN) {
				{
				{
				setState(61);
				template();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(69);
			match(DECLARATION_OPEN);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARATION_TEXT) {
				{
				setState(70);
				match(DECLARATION_TEXT);
				}
			}

			setState(73);
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
			setState(75);
			match(TEMPLATE_OPEN);
			setState(76);
			templ_content();
			setState(77);
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
			setState(79);
			name();
			setState(81); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					locations();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(85);
			init_loc();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(86);
				transitions();
				}
				}
				setState(91);
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
			setState(92);
			match(OPEN);
			setState(93);
			match(NAME);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(94);
				coordinate();
				}
			}

			setState(97);
			match(CLOSE);
			setState(98);
			match(IDENTIFIER);
			setState(99);
			match(OPEN_SLASH);
			setState(100);
			match(NAME);
			setState(101);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(110);
				coordinate();
				}
			}

			setState(113);
			match(CLOSE);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(114);
				name();
				}
				break;
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LABEL_OPEN || _la==LABEL_COMMENTS_OPEN) {
				{
				{
				setState(117);
				labels();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(123);
				match(OPEN);
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==URGENT || _la==COMMITTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				match(SLASH_CLOSE);
				}
			}

			setState(128);
			match(OPEN_SLASH);
			setState(129);
			match(LOCATION);
			setState(130);
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
			setState(132);
			match(X);
			setState(133);
			match(EQUALS_TEMPLATE);
			setState(134);
			match(QUOTES);
			setState(135);
			match(NUMBER);
			setState(136);
			match(QUOTES);
			setState(137);
			match(Y);
			setState(138);
			match(EQUALS_TEMPLATE);
			setState(139);
			match(QUOTES);
			setState(140);
			match(NUMBER);
			setState(141);
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
			setState(143);
			match(OPEN);
			setState(144);
			match(INIT);
			setState(145);
			match(REF);
			setState(146);
			match(EQUALS_TEMPLATE);
			setState(147);
			match(QUOTES);
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(QUOTES);
			setState(150);
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
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==LABEL_OPEN || _la==LABEL_COMMENTS_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_TEXT) {
				{
				setState(153);
				match(LABEL_TEXT);
				}
			}

			setState(156);
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
			setState(158);
			match(OPEN);
			setState(159);
			match(TRANSITION);
			setState(160);
			match(CLOSE);
			setState(161);
			source();
			setState(162);
			target();
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163);
					labels_t();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_G_OPEN) {
				{
				setState(169);
				label_guard();
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LABEL_T_OPEN || _la==LABEL_COMMENTS_OPEN) {
				{
				{
				setState(172);
				labels_t();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(OPEN_SLASH);
			setState(179);
			match(TRANSITION);
			setState(180);
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
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==LABEL_T_OPEN || _la==LABEL_COMMENTS_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_TEXT) {
				{
				setState(183);
				match(LABEL_TEXT);
				}
			}

			setState(186);
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
			setState(188);
			match(LABEL_G_OPEN);
			setState(189);
			guard_expr(0);
			setState(190);
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
		public TerminalNode FORALL() { return getToken(UppaalParser.FORALL, 0); }
		public TerminalNode ELSE() { return getToken(UppaalParser.ELSE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(UppaalParser.EXISTS, 0); }
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
		public TerminalNode IF() { return getToken(UppaalParser.IF, 0); }
		public TerminalNode LOOKUP_OP() { return getToken(UppaalParser.LOOKUP_OP, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_GUARD:
				{
				setState(193);
				match(ID_GUARD);
				}
				break;
			case NAT_GUARD:
				{
				setState(194);
				match(NAT_GUARD);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(195);
				match(LEFT_PARENTHESIS);
				setState(196);
				guard_expr(0);
				setState(197);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case INCREMENT:
				{
				setState(199);
				match(INCREMENT);
				setState(200);
				guard_expr(12);
				}
				break;
			case DECREMENT:
				{
				setState(201);
				match(DECREMENT);
				setState(202);
				guard_expr(10);
				}
				break;
			case ADD:
			case SUB:
			case EXCLAMATION:
			case NOT:
				{
				setState(203);
				((Guard_exprContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (EXCLAMATION - 65)) | (1L << (NOT - 65)))) != 0)) ) {
					((Guard_exprContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				guard_expr(8);
				}
				break;
			case FORALL:
				{
				setState(205);
				match(FORALL);
				setState(206);
				match(LEFT_PARENTHESIS);
				setState(207);
				match(ID_GUARD);
				setState(208);
				match(ELSE);
				setState(209);
				type();
				setState(210);
				match(RIGHT_PARENTHESIS);
				setState(211);
				guard_expr(2);
				}
				break;
			case EXISTS:
				{
				setState(213);
				match(EXISTS);
				setState(214);
				match(LEFT_PARENTHESIS);
				setState(215);
				match(ID_GUARD);
				setState(216);
				match(ELSE);
				setState(217);
				type();
				setState(218);
				match(RIGHT_PARENTHESIS);
				setState(219);
				guard_expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(223);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(224);
						((Guard_exprContext)_localctx).assign = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (ASSIGN - 53)) | (1L << (ASSIGN_COLON - 53)) | (1L << (ASSIGN_ADD - 53)) | (1L << (ASSIGN_SUB - 53)) | (1L << (ASSIGN_MUL - 53)) | (1L << (ASSIGN_DIV - 53)) | (1L << (ASSIGN_PERCENT - 53)) | (1L << (ASSIGN_OR - 53)) | (1L << (ASSIGN_AND - 53)) | (1L << (ASSIGN_XOR - 53)) | (1L << (ASSIGN_LSHIFT - 53)) | (1L << (ASSIGN_RSHIFT - 53)))) != 0)) ) {
							((Guard_exprContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						guard_expr(10);
						}
						break;
					case 2:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(226);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(227);
						((Guard_exprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LESS - 69)) | (1L << (LESSEQ - 69)) | (1L << (COMPARE - 69)) | (1L << (DIFFERENT - 69)) | (1L << (GREATEREQ - 69)) | (1L << (GREATER - 69)))) != 0)) ) {
							((Guard_exprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(228);
						guard_expr(8);
						}
						break;
					case 3:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(229);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(230);
						((Guard_exprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (DIV - 65)) | (1L << (PERCENT - 65)) | (1L << (BITAND - 65)) | (1L << (BITOR - 65)) | (1L << (BITXOR - 65)) | (1L << (LSHIFT - 65)) | (1L << (RSHIFT - 65)) | (1L << (AND_SYMBOL - 65)) | (1L << (OR_SYMBOL - 65)) | (1L << (MINIMUM - 65)) | (1L << (MAXIMUM - 65)) | (1L << (OR - 65)) | (1L << (AND - 65)) | (1L << (IMPLY - 65)))) != 0)) ) {
							((Guard_exprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						guard_expr(7);
						}
						break;
					case 4:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(232);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(233);
						match(IF);
						setState(234);
						guard_expr(0);
						setState(235);
						match(ELSE);
						setState(236);
						guard_expr(6);
						}
						break;
					case 5:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(238);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(239);
						match(INCREMENT);
						}
						break;
					case 6:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(240);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(241);
						match(DECREMENT);
						}
						break;
					case 7:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(242);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(243);
						match(LOOKUP_OP);
						setState(244);
						match(ID_GUARD);
						}
						break;
					case 8:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(245);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(246);
						match(LEFT_PARENTHESIS);
						setState(247);
						arguments();
						setState(248);
						match(RIGHT_PARENTHESIS);
						}
						break;
					}
					} 
				}
				setState(254);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (NAT_GUARD - 45)) | (1L << (LEFT_PARENTHESIS - 45)) | (1L << (INCREMENT - 45)) | (1L << (DECREMENT - 45)) | (1L << (ADD - 45)) | (1L << (SUB - 45)) | (1L << (EXCLAMATION - 45)) | (1L << (NOT - 45)) | (1L << (FORALL - 45)) | (1L << (EXISTS - 45)) | (1L << (ID_GUARD - 45)))) != 0)) {
				{
				setState(255);
				guard_expr(0);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(256);
					match(COMMA);
					setState(257);
					guard_expr(0);
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public TerminalNode META() { return getToken(UppaalParser.META, 0); }
		public TerminalNode CONST() { return getToken(UppaalParser.CONST, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==META || _la==CONST) {
				{
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==META || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(268);
			typeId();
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

	public static class TypeIdContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(UppaalParser.INT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(UppaalParser.COMMA, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public TerminalNode SCALAR() { return getToken(UppaalParser.SCALAR, 0); }
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeId);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(INT);
				setState(272);
				match(LEFT_BRACKET);
				setState(273);
				guard_expr(0);
				setState(274);
				match(COMMA);
				setState(275);
				guard_expr(0);
				setState(276);
				match(RIGHT_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(SCALAR);
				setState(279);
				match(LEFT_BRACKET);
				setState(280);
				guard_expr(0);
				setState(281);
				match(RIGHT_BRACKET);
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
		enterRule(_localctx, 36, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(OPEN);
			setState(286);
			match(SOURCE);
			setState(287);
			match(REF);
			setState(288);
			match(EQUALS_TEMPLATE);
			setState(289);
			match(QUOTES);
			setState(290);
			match(IDENTIFIER);
			setState(291);
			match(QUOTES);
			setState(292);
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
		enterRule(_localctx, 38, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(OPEN);
			setState(295);
			match(TARGET);
			setState(296);
			match(REF);
			setState(297);
			match(EQUALS_TEMPLATE);
			setState(298);
			match(QUOTES);
			setState(299);
			match(IDENTIFIER);
			setState(300);
			match(QUOTES);
			setState(301);
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
		enterRule(_localctx, 40, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(NAME_ATTRIBUTE);
			setState(304);
			match(EQUALS);
			setState(305);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3f\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\5\2.\n\2\3\2\5\2\61\n\2\3"+
		"\2\3\2\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\4\3\4\3\4\7\4A\n\4"+
		"\f\4\16\4D\13\4\3\4\3\4\3\5\3\5\5\5J\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\6\7T\n\7\r\7\16\7U\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\3\b\5\b"+
		"b\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t"+
		"\3\t\3\t\5\tv\n\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\t\3\t\3\t\5\t\u0081\n"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u009d\n\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a7\n\r\f\r\16\r\u00aa\13\r\3\r\5\r\u00ad"+
		"\n\r\3\r\7\r\u00b0\n\r\f\r\16\r\u00b3\13\r\3\r\3\r\3\r\3\r\3\16\3\16\5"+
		"\16\u00bb\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e0\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00fd"+
		"\n\20\f\20\16\20\u0100\13\20\3\21\3\21\3\21\7\21\u0105\n\21\f\21\16\21"+
		"\u0108\13\21\5\21\u010a\n\21\3\22\5\22\u010d\n\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011e\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\2\3\36\27\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*\2\n\3\2\35\36\4\2\'\'))\3\2()\3\2CF\3"+
		"\2\67B\3\2GL\4\2CDM[\3\2ab\2\u0145\2-\3\2\2\2\4\64\3\2\2\2\6=\3\2\2\2"+
		"\bG\3\2\2\2\nM\3\2\2\2\fQ\3\2\2\2\16^\3\2\2\2\20i\3\2\2\2\22\u0086\3\2"+
		"\2\2\24\u0091\3\2\2\2\26\u009a\3\2\2\2\30\u00a0\3\2\2\2\32\u00b8\3\2\2"+
		"\2\34\u00be\3\2\2\2\36\u00df\3\2\2\2 \u0109\3\2\2\2\"\u010c\3\2\2\2$\u011d"+
		"\3\2\2\2&\u011f\3\2\2\2(\u0128\3\2\2\2*\u0131\3\2\2\2,.\5\4\3\2-,\3\2"+
		"\2\2-.\3\2\2\2.\60\3\2\2\2/\61\7\3\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62"+
		"\3\2\2\2\62\63\5\6\4\2\63\3\3\2\2\2\648\7\5\2\2\65\67\5*\26\2\66\65\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\7\2\2"+
		"<\5\3\2\2\2=>\7\6\2\2>B\5\b\5\2?A\5\n\6\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2"+
		"\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\f\2\2F\7\3\2\2\2GI\7\r\2\2HJ\7\21"+
		"\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\20\2\2L\t\3\2\2\2MN\7\16\2\2NO"+
		"\5\f\7\2OP\7\22\2\2P\13\3\2\2\2QS\5\16\b\2RT\5\20\t\2SR\3\2\2\2TU\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2W[\5\24\13\2XZ\5\30\r\2YX\3\2\2\2Z]"+
		"\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2][\3\2\2\2^_\7\30\2\2_a\7\31"+
		"\2\2`b\5\22\n\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7$\2\2de\7&\2\2ef\7#\2"+
		"\2fg\7\31\2\2gh\7$\2\2h\17\3\2\2\2ij\7\30\2\2jk\7\32\2\2kl\7\33\2\2lm"+
		"\7\25\2\2mn\7\27\2\2no\7&\2\2oq\7\27\2\2pr\5\22\n\2qp\3\2\2\2qr\3\2\2"+
		"\2rs\3\2\2\2su\7$\2\2tv\5\16\b\2ut\3\2\2\2uv\3\2\2\2vz\3\2\2\2wy\5\26"+
		"\f\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0080\3\2\2\2|z\3\2\2\2"+
		"}~\7\30\2\2~\177\t\2\2\2\177\u0081\7%\2\2\u0080}\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7#\2\2\u0083\u0084\7\32\2\2\u0084"+
		"\u0085\7$\2\2\u0085\21\3\2\2\2\u0086\u0087\7\23\2\2\u0087\u0088\7\25\2"+
		"\2\u0088\u0089\7\27\2\2\u0089\u008a\7\26\2\2\u008a\u008b\7\27\2\2\u008b"+
		"\u008c\7\24\2\2\u008c\u008d\7\25\2\2\u008d\u008e\7\27\2\2\u008e\u008f"+
		"\7\26\2\2\u008f\u0090\7\27\2\2\u0090\23\3\2\2\2\u0091\u0092\7\30\2\2\u0092"+
		"\u0093\7\37\2\2\u0093\u0094\7 \2\2\u0094\u0095\7\25\2\2\u0095\u0096\7"+
		"\27\2\2\u0096\u0097\7&\2\2\u0097\u0098\7\27\2\2\u0098\u0099\7%\2\2\u0099"+
		"\25\3\2\2\2\u009a\u009c\t\3\2\2\u009b\u009d\7-\2\2\u009c\u009b\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7,\2\2\u009f\27\3"+
		"\2\2\2\u00a0\u00a1\7\30\2\2\u00a1\u00a2\7\34\2\2\u00a2\u00a3\7$\2\2\u00a3"+
		"\u00a4\5&\24\2\u00a4\u00a8\5(\25\2\u00a5\u00a7\5\32\16\2\u00a6\u00a5\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\5\34\17\2\u00ac\u00ab\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00b0\5\32\16\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7#\2\2\u00b5"+
		"\u00b6\7\34\2\2\u00b6\u00b7\7$\2\2\u00b7\31\3\2\2\2\u00b8\u00ba\t\4\2"+
		"\2\u00b9\u00bb\7-\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\7,\2\2\u00bd\33\3\2\2\2\u00be\u00bf\7*\2\2\u00bf"+
		"\u00c0\5\36\20\2\u00c0\u00c1\7.\2\2\u00c1\35\3\2\2\2\u00c2\u00c3\b\20"+
		"\1\2\u00c3\u00e0\7e\2\2\u00c4\u00e0\7/\2\2\u00c5\u00c6\7\60\2\2\u00c6"+
		"\u00c7\5\36\20\2\u00c7\u00c8\7\61\2\2\u00c8\u00e0\3\2\2\2\u00c9\u00ca"+
		"\7\65\2\2\u00ca\u00e0\5\36\20\16\u00cb\u00cc\7\66\2\2\u00cc\u00e0\5\36"+
		"\20\f\u00cd\u00ce\t\5\2\2\u00ce\u00e0\5\36\20\n\u00cf\u00d0\7_\2\2\u00d0"+
		"\u00d1\7\60\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7]\2\2\u00d3\u00d4\5\""+
		"\22\2\u00d4\u00d5\7\61\2\2\u00d5\u00d6\5\36\20\4\u00d6\u00e0\3\2\2\2\u00d7"+
		"\u00d8\7`\2\2\u00d8\u00d9\7\60\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7]\2"+
		"\2\u00db\u00dc\5\"\22\2\u00dc\u00dd\7\61\2\2\u00dd\u00de\5\36\20\3\u00de"+
		"\u00e0\3\2\2\2\u00df\u00c2\3\2\2\2\u00df\u00c4\3\2\2\2\u00df\u00c5\3\2"+
		"\2\2\u00df\u00c9\3\2\2\2\u00df\u00cb\3\2\2\2\u00df\u00cd\3\2\2\2\u00df"+
		"\u00cf\3\2\2\2\u00df\u00d7\3\2\2\2\u00e0\u00fe\3\2\2\2\u00e1\u00e2\f\13"+
		"\2\2\u00e2\u00e3\t\6\2\2\u00e3\u00fd\5\36\20\f\u00e4\u00e5\f\t\2\2\u00e5"+
		"\u00e6\t\7\2\2\u00e6\u00fd\5\36\20\n\u00e7\u00e8\f\b\2\2\u00e8\u00e9\t"+
		"\b\2\2\u00e9\u00fd\5\36\20\t\u00ea\u00eb\f\7\2\2\u00eb\u00ec\7\\\2\2\u00ec"+
		"\u00ed\5\36\20\2\u00ed\u00ee\7]\2\2\u00ee\u00ef\5\36\20\b\u00ef\u00fd"+
		"\3\2\2\2\u00f0\u00f1\f\17\2\2\u00f1\u00fd\7\65\2\2\u00f2\u00f3\f\r\2\2"+
		"\u00f3\u00fd\7\66\2\2\u00f4\u00f5\f\6\2\2\u00f5\u00f6\7^\2\2\u00f6\u00fd"+
		"\7e\2\2\u00f7\u00f8\f\5\2\2\u00f8\u00f9\7\60\2\2\u00f9\u00fa\5 \21\2\u00fa"+
		"\u00fb\7\61\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00e1\3\2\2\2\u00fc\u00e4\3"+
		"\2\2\2\u00fc\u00e7\3\2\2\2\u00fc\u00ea\3\2\2\2\u00fc\u00f0\3\2\2\2\u00fc"+
		"\u00f2\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\37\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0101\u0106\5\36\20\2\u0102\u0103\7\64\2\2\u0103\u0105\5\36\20"+
		"\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0101\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a!\3\2\2\2\u010b\u010d\t\t\2\2\u010c\u010b\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\5$\23\2\u010f#\3"+
		"\2\2\2\u0110\u011e\7c\2\2\u0111\u0112\7c\2\2\u0112\u0113\7\62\2\2\u0113"+
		"\u0114\5\36\20\2\u0114\u0115\7\64\2\2\u0115\u0116\5\36\20\2\u0116\u0117"+
		"\7\63\2\2\u0117\u011e\3\2\2\2\u0118\u0119\7d\2\2\u0119\u011a\7\62\2\2"+
		"\u011a\u011b\5\36\20\2\u011b\u011c\7\63\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u0110\3\2\2\2\u011d\u0111\3\2\2\2\u011d\u0118\3\2\2\2\u011e%\3\2\2\2"+
		"\u011f\u0120\7\30\2\2\u0120\u0121\7!\2\2\u0121\u0122\7 \2\2\u0122\u0123"+
		"\7\25\2\2\u0123\u0124\7\27\2\2\u0124\u0125\7&\2\2\u0125\u0126\7\27\2\2"+
		"\u0126\u0127\7%\2\2\u0127\'\3\2\2\2\u0128\u0129\7\30\2\2\u0129\u012a\7"+
		"\"\2\2\u012a\u012b\7 \2\2\u012b\u012c\7\25\2\2\u012c\u012d\7\27\2\2\u012d"+
		"\u012e\7&\2\2\u012e\u012f\7\27\2\2\u012f\u0130\7%\2\2\u0130)\3\2\2\2\u0131"+
		"\u0132\7\b\2\2\u0132\u0133\7\t\2\2\u0133\u0134\7\n\2\2\u0134+\3\2\2\2"+
		"\32-\608BIU[aquz\u0080\u009c\u00a8\u00ac\u00b1\u00ba\u00df\u00fc\u00fe"+
		"\u0106\u0109\u010c\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}