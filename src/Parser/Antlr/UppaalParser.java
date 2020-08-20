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
		SOURCE=31, TARGET=32, NAIL=33, OPEN_SLASH=34, CLOSE=35, SLASH_CLOSE=36, 
		IDENTIFIER=37, PARAMETER_OPEN=38, LABEL_OPEN=39, LABEL_T_OPEN=40, LABEL_COMMENTS_OPEN=41, 
		LABEL_G_OPEN=42, WS_TEMPLATE=43, LABEL_CLOSE=44, LABEL_TEXT=45, PARAMETER_CLOSE=46, 
		PARAMETER_TEXT=47, GUARD_CLOSE=48, NAT_GUARD=49, LEFT_PARENTHESIS=50, 
		RIGHT_PARENTHESIS=51, LEFT_BRACKET=52, RIGHT_BRACKET=53, COMMA=54, INCREMENT=55, 
		DECREMENT=56, ASSIGN=57, ASSIGN_COLON=58, ASSIGN_ADD=59, ASSIGN_SUB=60, 
		ASSIGN_MUL=61, ASSIGN_DIV=62, ASSIGN_PERCENT=63, ASSIGN_OR=64, ASSIGN_AND=65, 
		ASSIGN_XOR=66, ASSIGN_LSHIFT=67, ASSIGN_RSHIFT=68, ADD=69, SUB=70, EXCLAMATION=71, 
		NOT=72, LESS=73, LESSEQ=74, COMPARE=75, DIFFERENT=76, GREATEREQ=77, GREATER=78, 
		MUL=79, DIV=80, PERCENT=81, BITAND=82, BITOR=83, BITXOR=84, LSHIFT=85, 
		RSHIFT=86, AND_SYMBOL=87, OR_SYMBOL=88, MINIMUM=89, MAXIMUM=90, OR=91, 
		AND=92, IMPLY=93, IF=94, ELSE=95, LOOKUP_OP=96, FORALL=97, EXISTS=98, 
		SUM=99, META=100, CONST=101, INT=102, SCALAR=103, TRUE=104, FALSE=105, 
		ID_GUARD=106, WS_GUARD=107, SYSTEM_CLOSE=108, SYSTEM_TEXT=109, QUERIES_CLOSE=110, 
		QUERIES_TEXT=111;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_nta = 2, RULE_declaration = 3, 
		RULE_template = 4, RULE_templ_content = 5, RULE_name = 6, RULE_parameter = 7, 
		RULE_locations = 8, RULE_coordinate = 9, RULE_init_loc = 10, RULE_labels = 11, 
		RULE_transitions = 12, RULE_labels_t = 13, RULE_label_guard = 14, RULE_guard_expr = 15, 
		RULE_arguments = 16, RULE_type = 17, RULE_typeId = 18, RULE_source = 19, 
		RULE_target = 20, RULE_nails = 21, RULE_attribute = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "prolog", "nta", "declaration", "template", "templ_content", 
			"name", "parameter", "locations", "coordinate", "init_loc", "labels", 
			"transitions", "labels_t", "label_guard", "guard_expr", "arguments", 
			"type", "typeId", "source", "target", "nails", "attribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'?>'", null, null, null, null, null, null, 
			null, null, null, null, null, "'x'", "'y'", null, null, "'\"'", "'<'", 
			"'name'", "'location'", "'id'", "'transition'", "'urgent'", "'committed'", 
			"'init'", "'ref'", "'source'", "'target'", "'nail'", "'</'", "'>'", "'/>'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'('", "')'", "'['", "']'", "','", "'++'", "'--'", null, "':='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'|='", "'&amp;='", "'^='", "'&lt;&lt;='", 
			"'&gt;&gt;='", "'+'", "'-'", "'!'", "'not'", "'&lt;'", "'&lt;='", "'=='", 
			"'!='", "'&gt;='", "'&gt;'", "'*'", "'/'", "'%'", "'&amp;'", "'|'", "'^'", 
			"'&lt;&lt;'", "'&gt;&gt;'", "'&amp;&amp;'", "'||'", "'&lt;?'", "'&gt;?'", 
			"'or'", "'and'", "'imply'", "'?'", "':'", "'.'", "'forall'", "'exists'", 
			"'sum'", "'meta'", "'const'", "'int'", "'scalar'", "'true'", "'false'"
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
			"NAIL", "OPEN_SLASH", "CLOSE", "SLASH_CLOSE", "IDENTIFIER", "PARAMETER_OPEN", 
			"LABEL_OPEN", "LABEL_T_OPEN", "LABEL_COMMENTS_OPEN", "LABEL_G_OPEN", 
			"WS_TEMPLATE", "LABEL_CLOSE", "LABEL_TEXT", "PARAMETER_CLOSE", "PARAMETER_TEXT", 
			"GUARD_CLOSE", "NAT_GUARD", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "COMMA", "INCREMENT", "DECREMENT", "ASSIGN", 
			"ASSIGN_COLON", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", "ASSIGN_DIV", 
			"ASSIGN_PERCENT", "ASSIGN_OR", "ASSIGN_AND", "ASSIGN_XOR", "ASSIGN_LSHIFT", 
			"ASSIGN_RSHIFT", "ADD", "SUB", "EXCLAMATION", "NOT", "LESS", "LESSEQ", 
			"COMPARE", "DIFFERENT", "GREATEREQ", "GREATER", "MUL", "DIV", "PERCENT", 
			"BITAND", "BITOR", "BITXOR", "LSHIFT", "RSHIFT", "AND_SYMBOL", "OR_SYMBOL", 
			"MINIMUM", "MAXIMUM", "OR", "AND", "IMPLY", "IF", "ELSE", "LOOKUP_OP", 
			"FORALL", "EXISTS", "SUM", "META", "CONST", "INT", "SCALAR", "TRUE", 
			"FALSE", "ID_GUARD", "WS_GUARD", "SYSTEM_CLOSE", "SYSTEM_TEXT", "QUERIES_CLOSE", 
			"QUERIES_TEXT"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROLOG_OPEN) {
				{
				setState(46);
				prolog();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(49);
				match(DTD);
				}
			}

			setState(52);
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
			setState(54);
			match(PROLOG_OPEN);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME_ATTRIBUTE) {
				{
				{
				setState(55);
				attribute();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
			setState(63);
			match(NTA_OPEN);
			setState(64);
			declaration();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE_OPEN) {
				{
				{
				setState(65);
				template();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
			setState(73);
			match(DECLARATION_OPEN);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARATION_TEXT) {
				{
				setState(74);
				match(DECLARATION_TEXT);
				}
			}

			setState(77);
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
			setState(79);
			match(TEMPLATE_OPEN);
			setState(80);
			templ_content();
			setState(81);
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
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
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
			setState(83);
			name();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAMETER_OPEN) {
				{
				setState(84);
				parameter();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARATION_OPEN) {
				{
				setState(87);
				declaration();
				}
			}

			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(90);
					locations();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(95);
			init_loc();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(96);
				transitions();
				}
				}
				setState(101);
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
			setState(102);
			match(OPEN);
			setState(103);
			match(NAME);
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
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(OPEN_SLASH);
			setState(110);
			match(NAME);
			setState(111);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode PARAMETER_OPEN() { return getToken(UppaalParser.PARAMETER_OPEN, 0); }
		public TerminalNode PARAMETER_TEXT() { return getToken(UppaalParser.PARAMETER_TEXT, 0); }
		public TerminalNode PARAMETER_CLOSE() { return getToken(UppaalParser.PARAMETER_CLOSE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(PARAMETER_OPEN);
			setState(114);
			match(PARAMETER_TEXT);
			setState(115);
			match(PARAMETER_CLOSE);
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
		enterRule(_localctx, 16, RULE_locations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(OPEN);
			setState(118);
			match(LOCATION);
			setState(119);
			match(ID);
			setState(120);
			match(EQUALS_TEMPLATE);
			setState(121);
			match(QUOTES);
			setState(122);
			match(IDENTIFIER);
			setState(123);
			match(QUOTES);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(124);
				coordinate();
				}
			}

			setState(127);
			match(CLOSE);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(128);
				name();
				}
				break;
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LABEL_OPEN || _la==LABEL_COMMENTS_OPEN) {
				{
				{
				setState(131);
				labels();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(137);
				match(OPEN);
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==URGENT || _la==COMMITTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				match(SLASH_CLOSE);
				}
			}

			setState(142);
			match(OPEN_SLASH);
			setState(143);
			match(LOCATION);
			setState(144);
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
		enterRule(_localctx, 18, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(X);
			setState(147);
			match(EQUALS_TEMPLATE);
			setState(148);
			match(QUOTES);
			setState(149);
			match(NUMBER);
			setState(150);
			match(QUOTES);
			setState(151);
			match(Y);
			setState(152);
			match(EQUALS_TEMPLATE);
			setState(153);
			match(QUOTES);
			setState(154);
			match(NUMBER);
			setState(155);
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
		enterRule(_localctx, 20, RULE_init_loc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(OPEN);
			setState(158);
			match(INIT);
			setState(159);
			match(REF);
			setState(160);
			match(EQUALS_TEMPLATE);
			setState(161);
			match(QUOTES);
			setState(162);
			match(IDENTIFIER);
			setState(163);
			match(QUOTES);
			setState(164);
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
		enterRule(_localctx, 22, RULE_labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==LABEL_OPEN || _la==LABEL_COMMENTS_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_TEXT) {
				{
				setState(167);
				match(LABEL_TEXT);
				}
			}

			setState(170);
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
		public List<NailsContext> nails() {
			return getRuleContexts(NailsContext.class);
		}
		public NailsContext nails(int i) {
			return getRuleContext(NailsContext.class,i);
		}
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
		enterRule(_localctx, 24, RULE_transitions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(OPEN);
			setState(173);
			match(TRANSITION);
			setState(174);
			match(CLOSE);
			setState(175);
			source();
			setState(176);
			target();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(177);
				nails();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					labels_t();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_G_OPEN) {
				{
				setState(189);
				label_guard();
				}
			}

			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LABEL_T_OPEN || _la==LABEL_COMMENTS_OPEN) {
				{
				{
				setState(192);
				labels_t();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(OPEN_SLASH);
			setState(199);
			match(TRANSITION);
			setState(200);
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
		enterRule(_localctx, 26, RULE_labels_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(_la==LABEL_T_OPEN || _la==LABEL_COMMENTS_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_TEXT) {
				{
				setState(203);
				match(LABEL_TEXT);
				}
			}

			setState(206);
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
		enterRule(_localctx, 28, RULE_label_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LABEL_G_OPEN);
			setState(209);
			guard_expr(0);
			setState(210);
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
		public TerminalNode SUM() { return getToken(UppaalParser.SUM, 0); }
		public TerminalNode TRUE() { return getToken(UppaalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(UppaalParser.FALSE, 0); }
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_guard_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_GUARD:
				{
				setState(213);
				match(ID_GUARD);
				}
				break;
			case NAT_GUARD:
				{
				setState(214);
				match(NAT_GUARD);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(215);
				match(LEFT_PARENTHESIS);
				setState(216);
				guard_expr(0);
				setState(217);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case INCREMENT:
				{
				setState(219);
				match(INCREMENT);
				setState(220);
				guard_expr(15);
				}
				break;
			case DECREMENT:
				{
				setState(221);
				match(DECREMENT);
				setState(222);
				guard_expr(13);
				}
				break;
			case ADD:
			case SUB:
			case EXCLAMATION:
			case NOT:
				{
				setState(223);
				((Guard_exprContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (EXCLAMATION - 69)) | (1L << (NOT - 69)))) != 0)) ) {
					((Guard_exprContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(224);
				guard_expr(11);
				}
				break;
			case FORALL:
				{
				setState(225);
				match(FORALL);
				setState(226);
				match(LEFT_PARENTHESIS);
				setState(227);
				match(ID_GUARD);
				setState(228);
				match(ELSE);
				setState(229);
				type();
				setState(230);
				match(RIGHT_PARENTHESIS);
				setState(231);
				guard_expr(5);
				}
				break;
			case EXISTS:
				{
				setState(233);
				match(EXISTS);
				setState(234);
				match(LEFT_PARENTHESIS);
				setState(235);
				match(ID_GUARD);
				setState(236);
				match(ELSE);
				setState(237);
				type();
				setState(238);
				match(RIGHT_PARENTHESIS);
				setState(239);
				guard_expr(4);
				}
				break;
			case SUM:
				{
				setState(241);
				match(SUM);
				setState(242);
				match(LEFT_PARENTHESIS);
				setState(243);
				match(ID_GUARD);
				setState(244);
				match(ELSE);
				setState(245);
				type();
				setState(246);
				match(RIGHT_PARENTHESIS);
				setState(247);
				guard_expr(3);
				}
				break;
			case TRUE:
				{
				setState(249);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(250);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(253);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(254);
						((Guard_exprContext)_localctx).assign = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (ASSIGN - 57)) | (1L << (ASSIGN_COLON - 57)) | (1L << (ASSIGN_ADD - 57)) | (1L << (ASSIGN_SUB - 57)) | (1L << (ASSIGN_MUL - 57)) | (1L << (ASSIGN_DIV - 57)) | (1L << (ASSIGN_PERCENT - 57)) | (1L << (ASSIGN_OR - 57)) | (1L << (ASSIGN_AND - 57)) | (1L << (ASSIGN_XOR - 57)) | (1L << (ASSIGN_LSHIFT - 57)) | (1L << (ASSIGN_RSHIFT - 57)))) != 0)) ) {
							((Guard_exprContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(255);
						guard_expr(13);
						}
						break;
					case 2:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(256);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(257);
						((Guard_exprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LESS - 73)) | (1L << (LESSEQ - 73)) | (1L << (COMPARE - 73)) | (1L << (DIFFERENT - 73)) | (1L << (GREATEREQ - 73)) | (1L << (GREATER - 73)))) != 0)) ) {
							((Guard_exprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(258);
						guard_expr(11);
						}
						break;
					case 3:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(259);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(260);
						((Guard_exprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (DIV - 69)) | (1L << (PERCENT - 69)) | (1L << (BITAND - 69)) | (1L << (BITOR - 69)) | (1L << (BITXOR - 69)) | (1L << (LSHIFT - 69)) | (1L << (RSHIFT - 69)) | (1L << (AND_SYMBOL - 69)) | (1L << (OR_SYMBOL - 69)) | (1L << (MINIMUM - 69)) | (1L << (MAXIMUM - 69)) | (1L << (OR - 69)) | (1L << (AND - 69)) | (1L << (IMPLY - 69)))) != 0)) ) {
							((Guard_exprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(261);
						guard_expr(10);
						}
						break;
					case 4:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(262);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(263);
						match(IF);
						setState(264);
						guard_expr(0);
						setState(265);
						match(ELSE);
						setState(266);
						guard_expr(9);
						}
						break;
					case 5:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(268);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(269);
						match(INCREMENT);
						}
						break;
					case 6:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(270);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(271);
						match(DECREMENT);
						}
						break;
					case 7:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(272);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(273);
						match(LOOKUP_OP);
						setState(274);
						match(ID_GUARD);
						}
						break;
					case 8:
						{
						_localctx = new Guard_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(275);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(276);
						match(LEFT_PARENTHESIS);
						setState(277);
						arguments();
						setState(278);
						match(RIGHT_PARENTHESIS);
						}
						break;
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 32, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (NAT_GUARD - 49)) | (1L << (LEFT_PARENTHESIS - 49)) | (1L << (INCREMENT - 49)) | (1L << (DECREMENT - 49)) | (1L << (ADD - 49)) | (1L << (SUB - 49)) | (1L << (EXCLAMATION - 49)) | (1L << (NOT - 49)) | (1L << (FORALL - 49)) | (1L << (EXISTS - 49)) | (1L << (SUM - 49)) | (1L << (TRUE - 49)) | (1L << (FALSE - 49)) | (1L << (ID_GUARD - 49)))) != 0)) {
				{
				setState(285);
				guard_expr(0);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(286);
					match(COMMA);
					setState(287);
					guard_expr(0);
					}
					}
					setState(292);
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
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==META || _la==CONST) {
				{
				setState(295);
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

			setState(298);
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
		enterRule(_localctx, 36, RULE_typeId);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(INT);
				setState(302);
				match(LEFT_BRACKET);
				setState(303);
				guard_expr(0);
				setState(304);
				match(COMMA);
				setState(305);
				guard_expr(0);
				setState(306);
				match(RIGHT_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(SCALAR);
				setState(309);
				match(LEFT_BRACKET);
				setState(310);
				guard_expr(0);
				setState(311);
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
		enterRule(_localctx, 38, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(OPEN);
			setState(316);
			match(SOURCE);
			setState(317);
			match(REF);
			setState(318);
			match(EQUALS_TEMPLATE);
			setState(319);
			match(QUOTES);
			setState(320);
			match(IDENTIFIER);
			setState(321);
			match(QUOTES);
			setState(322);
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
		enterRule(_localctx, 40, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(OPEN);
			setState(325);
			match(TARGET);
			setState(326);
			match(REF);
			setState(327);
			match(EQUALS_TEMPLATE);
			setState(328);
			match(QUOTES);
			setState(329);
			match(IDENTIFIER);
			setState(330);
			match(QUOTES);
			setState(331);
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

	public static class NailsContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public TerminalNode NAIL() { return getToken(UppaalParser.NAIL, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public NailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nails; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterNails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitNails(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitNails(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NailsContext nails() throws RecognitionException {
		NailsContext _localctx = new NailsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nails);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(OPEN);
			setState(334);
			match(NAIL);
			setState(335);
			coordinate();
			setState(336);
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
		enterRule(_localctx, 44, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(NAME_ATTRIBUTE);
			setState(339);
			match(EQUALS);
			setState(340);
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
		case 15:
			return guard_expr_sempred((Guard_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean guard_expr_sempred(Guard_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3q\u0159\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\5\2\65\n\2\3\2\3\2\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\3\5\5\5N\n\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\5\7X\n\7\3\7\5\7[\n\7\3\7\6\7^\n\7\r\7\16\7_\3"+
		"\7\3\7\7\7d\n\7\f\7\16\7g\13\7\3\b\3\b\3\b\5\bl\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3"+
		"\n\3\n\5\n\u0084\n\n\3\n\7\n\u0087\n\n\f\n\16\n\u008a\13\n\3\n\3\n\3\n"+
		"\5\n\u008f\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00ab"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b5\n\16\f\16\16\16"+
		"\u00b8\13\16\3\16\7\16\u00bb\n\16\f\16\16\16\u00be\13\16\3\16\5\16\u00c1"+
		"\n\16\3\16\7\16\u00c4\n\16\f\16\16\16\u00c7\13\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\5\17\u00cf\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00fe\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u011b\n\21\f\21"+
		"\16\21\u011e\13\21\3\22\3\22\3\22\7\22\u0123\n\22\f\22\16\22\u0126\13"+
		"\22\5\22\u0128\n\22\3\23\5\23\u012b\n\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u013c\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\2\3 \31\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\n\3\2\35\36\4\2))++\3"+
		"\2*+\3\2GJ\3\2;F\3\2KP\4\2GHQ_\3\2fg\2\u016c\2\61\3\2\2\2\48\3\2\2\2\6"+
		"A\3\2\2\2\bK\3\2\2\2\nQ\3\2\2\2\fU\3\2\2\2\16h\3\2\2\2\20s\3\2\2\2\22"+
		"w\3\2\2\2\24\u0094\3\2\2\2\26\u009f\3\2\2\2\30\u00a8\3\2\2\2\32\u00ae"+
		"\3\2\2\2\34\u00cc\3\2\2\2\36\u00d2\3\2\2\2 \u00fd\3\2\2\2\"\u0127\3\2"+
		"\2\2$\u012a\3\2\2\2&\u013b\3\2\2\2(\u013d\3\2\2\2*\u0146\3\2\2\2,\u014f"+
		"\3\2\2\2.\u0154\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64"+
		"\3\2\2\2\63\65\7\3\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\5\6\4\2\67\3\3\2\2\28<\7\5\2\29;\5.\30\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\7\2\2@\5\3\2\2\2AB\7\6\2\2BF\5\b"+
		"\5\2CE\5\n\6\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2"+
		"\2\2IJ\7\f\2\2J\7\3\2\2\2KM\7\r\2\2LN\7\21\2\2ML\3\2\2\2MN\3\2\2\2NO\3"+
		"\2\2\2OP\7\20\2\2P\t\3\2\2\2QR\7\16\2\2RS\5\f\7\2ST\7\22\2\2T\13\3\2\2"+
		"\2UW\5\16\b\2VX\5\20\t\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\5\b\5\2ZY\3\2"+
		"\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\22\n\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`"+
		"\3\2\2\2`a\3\2\2\2ae\5\26\f\2bd\5\32\16\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2f\r\3\2\2\2ge\3\2\2\2hi\7\30\2\2ik\7\31\2\2jl\5\24\13\2kj"+
		"\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7%\2\2no\7\'\2\2op\7$\2\2pq\7\31\2\2qr"+
		"\7%\2\2r\17\3\2\2\2st\7(\2\2tu\7\61\2\2uv\7\60\2\2v\21\3\2\2\2wx\7\30"+
		"\2\2xy\7\32\2\2yz\7\33\2\2z{\7\25\2\2{|\7\27\2\2|}\7\'\2\2}\177\7\27\2"+
		"\2~\u0080\5\24\13\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u0083\7%\2\2\u0082\u0084\5\16\b\2\u0083\u0082\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0088\3\2\2\2\u0085\u0087\5\30\r\2\u0086\u0085\3\2\2\2"+
		"\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008e"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\30\2\2\u008c\u008d\t\2\2\2"+
		"\u008d\u008f\7&\2\2\u008e\u008b\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\7$\2\2\u0091\u0092\7\32\2\2\u0092\u0093\7%\2\2\u0093"+
		"\23\3\2\2\2\u0094\u0095\7\23\2\2\u0095\u0096\7\25\2\2\u0096\u0097\7\27"+
		"\2\2\u0097\u0098\7\26\2\2\u0098\u0099\7\27\2\2\u0099\u009a\7\24\2\2\u009a"+
		"\u009b\7\25\2\2\u009b\u009c\7\27\2\2\u009c\u009d\7\26\2\2\u009d\u009e"+
		"\7\27\2\2\u009e\25\3\2\2\2\u009f\u00a0\7\30\2\2\u00a0\u00a1\7\37\2\2\u00a1"+
		"\u00a2\7 \2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5\7"+
		"\'\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7&\2\2\u00a7\27\3\2\2\2\u00a8"+
		"\u00aa\t\3\2\2\u00a9\u00ab\7/\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7.\2\2\u00ad\31\3\2\2\2\u00ae\u00af"+
		"\7\30\2\2\u00af\u00b0\7\34\2\2\u00b0\u00b1\7%\2\2\u00b1\u00b2\5(\25\2"+
		"\u00b2\u00b6\5*\26\2\u00b3\u00b5\5,\27\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bc\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00bb\5\34\17\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c1\5\36\20\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\5\34\17\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7$\2\2\u00c9\u00ca\7\34\2\2\u00ca"+
		"\u00cb\7%\2\2\u00cb\33\3\2\2\2\u00cc\u00ce\t\4\2\2\u00cd\u00cf\7/\2\2"+
		"\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\7.\2\2\u00d1\35\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3\u00d4\5 \21\2\u00d4"+
		"\u00d5\7\62\2\2\u00d5\37\3\2\2\2\u00d6\u00d7\b\21\1\2\u00d7\u00fe\7l\2"+
		"\2\u00d8\u00fe\7\63\2\2\u00d9\u00da\7\64\2\2\u00da\u00db\5 \21\2\u00db"+
		"\u00dc\7\65\2\2\u00dc\u00fe\3\2\2\2\u00dd\u00de\79\2\2\u00de\u00fe\5 "+
		"\21\21\u00df\u00e0\7:\2\2\u00e0\u00fe\5 \21\17\u00e1\u00e2\t\5\2\2\u00e2"+
		"\u00fe\5 \21\r\u00e3\u00e4\7c\2\2\u00e4\u00e5\7\64\2\2\u00e5\u00e6\7l"+
		"\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8\5$\23\2\u00e8\u00e9\7\65\2\2\u00e9"+
		"\u00ea\5 \21\7\u00ea\u00fe\3\2\2\2\u00eb\u00ec\7d\2\2\u00ec\u00ed\7\64"+
		"\2\2\u00ed\u00ee\7l\2\2\u00ee\u00ef\7a\2\2\u00ef\u00f0\5$\23\2\u00f0\u00f1"+
		"\7\65\2\2\u00f1\u00f2\5 \21\6\u00f2\u00fe\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4"+
		"\u00f5\7\64\2\2\u00f5\u00f6\7l\2\2\u00f6\u00f7\7a\2\2\u00f7\u00f8\5$\23"+
		"\2\u00f8\u00f9\7\65\2\2\u00f9\u00fa\5 \21\5\u00fa\u00fe\3\2\2\2\u00fb"+
		"\u00fe\7j\2\2\u00fc\u00fe\7k\2\2\u00fd\u00d6\3\2\2\2\u00fd\u00d8\3\2\2"+
		"\2\u00fd\u00d9\3\2\2\2\u00fd\u00dd\3\2\2\2\u00fd\u00df\3\2\2\2\u00fd\u00e1"+
		"\3\2\2\2\u00fd\u00e3\3\2\2\2\u00fd\u00eb\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u011c\3\2\2\2\u00ff\u0100\f\16"+
		"\2\2\u0100\u0101\t\6\2\2\u0101\u011b\5 \21\17\u0102\u0103\f\f\2\2\u0103"+
		"\u0104\t\7\2\2\u0104\u011b\5 \21\r\u0105\u0106\f\13\2\2\u0106\u0107\t"+
		"\b\2\2\u0107\u011b\5 \21\f\u0108\u0109\f\n\2\2\u0109\u010a\7`\2\2\u010a"+
		"\u010b\5 \21\2\u010b\u010c\7a\2\2\u010c\u010d\5 \21\13\u010d\u011b\3\2"+
		"\2\2\u010e\u010f\f\22\2\2\u010f\u011b\79\2\2\u0110\u0111\f\20\2\2\u0111"+
		"\u011b\7:\2\2\u0112\u0113\f\t\2\2\u0113\u0114\7b\2\2\u0114\u011b\7l\2"+
		"\2\u0115\u0116\f\b\2\2\u0116\u0117\7\64\2\2\u0117\u0118\5\"\22\2\u0118"+
		"\u0119\7\65\2\2\u0119\u011b\3\2\2\2\u011a\u00ff\3\2\2\2\u011a\u0102\3"+
		"\2\2\2\u011a\u0105\3\2\2\2\u011a\u0108\3\2\2\2\u011a\u010e\3\2\2\2\u011a"+
		"\u0110\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u0115\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d!\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0124\5 \21\2\u0120\u0121\78\2\2\u0121\u0123\5 \21\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u011f\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128#\3\2\2\2\u0129\u012b\t\t\2\2\u012a\u0129\3\2\2\2"+
		"\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5&\24\2\u012d%\3"+
		"\2\2\2\u012e\u013c\7h\2\2\u012f\u0130\7h\2\2\u0130\u0131\7\66\2\2\u0131"+
		"\u0132\5 \21\2\u0132\u0133\78\2\2\u0133\u0134\5 \21\2\u0134\u0135\7\67"+
		"\2\2\u0135\u013c\3\2\2\2\u0136\u0137\7i\2\2\u0137\u0138\7\66\2\2\u0138"+
		"\u0139\5 \21\2\u0139\u013a\7\67\2\2\u013a\u013c\3\2\2\2\u013b\u012e\3"+
		"\2\2\2\u013b\u012f\3\2\2\2\u013b\u0136\3\2\2\2\u013c\'\3\2\2\2\u013d\u013e"+
		"\7\30\2\2\u013e\u013f\7!\2\2\u013f\u0140\7 \2\2\u0140\u0141\7\25\2\2\u0141"+
		"\u0142\7\27\2\2\u0142\u0143\7\'\2\2\u0143\u0144\7\27\2\2\u0144\u0145\7"+
		"&\2\2\u0145)\3\2\2\2\u0146\u0147\7\30\2\2\u0147\u0148\7\"\2\2\u0148\u0149"+
		"\7 \2\2\u0149\u014a\7\25\2\2\u014a\u014b\7\27\2\2\u014b\u014c\7\'\2\2"+
		"\u014c\u014d\7\27\2\2\u014d\u014e\7&\2\2\u014e+\3\2\2\2\u014f\u0150\7"+
		"\30\2\2\u0150\u0151\7#\2\2\u0151\u0152\5\24\13\2\u0152\u0153\7&\2\2\u0153"+
		"-\3\2\2\2\u0154\u0155\7\b\2\2\u0155\u0156\7\t\2\2\u0156\u0157\7\n\2\2"+
		"\u0157/\3\2\2\2\35\61\64<FMWZ_ek\177\u0083\u0088\u008e\u00aa\u00b6\u00bc"+
		"\u00c0\u00c5\u00ce\u00fd\u011a\u011c\u0124\u0127\u012a\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}