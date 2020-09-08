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
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN=7, XMLDeclOpen=8, 
		TEXT=9, NTA=10, DECLARATION=11, TEMPLATE=12, LOCATION=13, NAME=14, PARAMETER=15, 
		INIT=16, REF=17, ID=18, X=19, Y=20, URGENT=21, COMMITED=22, CLOSE=23, 
		SPECIAL_CLOSE=24, SLASH_CLOSE=25, SLASH=26, EQUALS=27, STRING=28, Name=29, 
		S=30, PI=31;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_content = 2, RULE_element = 3, 
		RULE_reference = 4, RULE_attribute = 5, RULE_chardata = 6, RULE_misc = 7, 
		RULE_model = 8, RULE_nta = 9, RULE_declaration = 10, RULE_anything = 11, 
		RULE_template = 12, RULE_temp_content = 13, RULE_parameter = 14, RULE_coordinate = 15, 
		RULE_init_loc = 16, RULE_locations = 17, RULE_name = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "prolog", "content", "element", "reference", "attribute", 
			"chardata", "misc", "model", "nta", "declaration", "anything", "template", 
			"temp_content", "parameter", "coordinate", "init_loc", "locations", "name"
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(38);
				prolog();
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(41);
				misc();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			element();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(48);
				misc();
				}
				}
				setState(53);
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

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode XMLDeclOpen() { return getToken(UppaalParser.XMLDeclOpen, 0); }
		public TerminalNode SPECIAL_CLOSE() { return getToken(UppaalParser.SPECIAL_CLOSE, 0); }
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
			match(XMLDeclOpen);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
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
			match(SPECIAL_CLOSE);
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

	public static class ContentContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(UppaalParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(UppaalParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(UppaalParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(UppaalParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(UppaalParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(UppaalParser.COMMENT, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(63);
				chardata();
				}
			}

			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN:
						{
						setState(66);
						element();
						}
						break;
					case EntityRef:
					case CharRef:
						{
						setState(67);
						reference();
						}
						break;
					case CDATA:
						{
						setState(68);
						match(CDATA);
						}
						break;
					case PI:
						{
						setState(69);
						match(PI);
						}
						break;
					case COMMENT:
						{
						setState(70);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(73);
						chardata();
						}
					}

					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(UppaalParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(UppaalParser.OPEN, i);
		}
		public List<TerminalNode> Name() { return getTokens(UppaalParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(UppaalParser.Name, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(UppaalParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(OPEN);
				setState(82);
				match(Name);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(83);
					attribute();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(CLOSE);
				setState(90);
				content();
				setState(91);
				match(OPEN);
				setState(92);
				match(SLASH);
				setState(93);
				match(Name);
				setState(94);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(OPEN);
				setState(97);
				match(Name);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(98);
					attribute();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(SLASH_CLOSE);
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode EntityRef() { return getToken(UppaalParser.EntityRef, 0); }
		public TerminalNode CharRef() { return getToken(UppaalParser.CharRef, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==EntityRef || _la==CharRef) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(UppaalParser.Name, 0); }
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
		enterRule(_localctx, 10, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Name);
			setState(110);
			match(EQUALS);
			setState(111);
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

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(UppaalParser.TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(UppaalParser.SEA_WS, 0); }
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MiscContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(UppaalParser.COMMENT, 0); }
		public TerminalNode PI() { return getToken(UppaalParser.PI, 0); }
		public TerminalNode SEA_WS() { return getToken(UppaalParser.SEA_WS, 0); }
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ModelContext extends ParserRuleContext {
		public NtaContext nta() {
			return getRuleContext(NtaContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(117);
				prolog();
				}
			}

			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(120);
				misc();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			nta();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(127);
				misc();
				}
				}
				setState(132);
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

	public static class NtaContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(UppaalParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(UppaalParser.OPEN, i);
		}
		public List<TerminalNode> NTA() { return getTokens(UppaalParser.NTA); }
		public TerminalNode NTA(int i) {
			return getToken(UppaalParser.NTA, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(UppaalParser.SLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
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
		enterRule(_localctx, 18, RULE_nta);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(OPEN);
			setState(134);
			match(NTA);
			setState(135);
			match(CLOSE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(136);
				misc();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			declaration();
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					misc();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					template();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(155);
				misc();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(OPEN);
			setState(162);
			match(SLASH);
			setState(163);
			match(NTA);
			setState(164);
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(UppaalParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(UppaalParser.OPEN, i);
		}
		public List<TerminalNode> DECLARATION() { return getTokens(UppaalParser.DECLARATION); }
		public TerminalNode DECLARATION(int i) {
			return getToken(UppaalParser.DECLARATION, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(UppaalParser.SLASH, 0); }
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
		enterRule(_localctx, 20, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(OPEN);
			setState(167);
			match(DECLARATION);
			setState(168);
			match(CLOSE);
			setState(169);
			anything();
			setState(170);
			match(OPEN);
			setState(171);
			match(SLASH);
			setState(172);
			match(DECLARATION);
			setState(173);
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

	public static class AnythingContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(UppaalParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(UppaalParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(UppaalParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(UppaalParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(UppaalParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(UppaalParser.COMMENT, i);
		}
		public AnythingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anything; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterAnything(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitAnything(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitAnything(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnythingContext anything() throws RecognitionException {
		AnythingContext _localctx = new AnythingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_anything);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(175);
				chardata();
				}
			}

			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << PI))) != 0)) {
				{
				{
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EntityRef:
				case CharRef:
					{
					setState(178);
					reference();
					}
					break;
				case CDATA:
					{
					setState(179);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(180);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(181);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(184);
					chardata();
					}
				}

				}
				}
				setState(191);
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

	public static class TemplateContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(UppaalParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(UppaalParser.OPEN, i);
		}
		public List<TerminalNode> TEMPLATE() { return getTokens(UppaalParser.TEMPLATE); }
		public TerminalNode TEMPLATE(int i) {
			return getToken(UppaalParser.TEMPLATE, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public Temp_contentContext temp_content() {
			return getRuleContext(Temp_contentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(UppaalParser.SLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
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
		enterRule(_localctx, 24, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(OPEN);
			setState(193);
			match(TEMPLATE);
			setState(194);
			match(CLOSE);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(195);
				misc();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			temp_content();
			setState(202);
			match(OPEN);
			setState(203);
			match(SLASH);
			setState(204);
			match(TEMPLATE);
			setState(205);
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

	public static class Temp_contentContext extends ParserRuleContext {
		public Init_locContext init_loc() {
			return getRuleContext(Init_locContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
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
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public Temp_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTemp_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTemp_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTemp_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temp_contentContext temp_content() throws RecognitionException {
		Temp_contentContext _localctx = new Temp_contentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_temp_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(207);
				name();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(208);
					misc();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(216);
				parameter();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(217);
					misc();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(225);
				declaration();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(226);
					misc();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(241); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(234);
					locations();
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(235);
						misc();
						}
						}
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(243); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(245);
			init_loc();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(246);
				misc();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(UppaalParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(UppaalParser.OPEN, i);
		}
		public List<TerminalNode> PARAMETER() { return getTokens(UppaalParser.PARAMETER); }
		public TerminalNode PARAMETER(int i) {
			return getToken(UppaalParser.PARAMETER, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(UppaalParser.SLASH, 0); }
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
		enterRule(_localctx, 28, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(OPEN);
			setState(253);
			match(PARAMETER);
			setState(254);
			match(CLOSE);
			setState(255);
			anything();
			setState(256);
			match(OPEN);
			setState(257);
			match(SLASH);
			setState(258);
			match(PARAMETER);
			setState(259);
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
		public List<TerminalNode> EQUALS() { return getTokens(UppaalParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(UppaalParser.EQUALS, i);
		}
		public List<TerminalNode> STRING() { return getTokens(UppaalParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(UppaalParser.STRING, i);
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
		enterRule(_localctx, 30, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(X);
			setState(262);
			match(EQUALS);
			setState(263);
			match(STRING);
			setState(264);
			match(Y);
			setState(265);
			match(EQUALS);
			setState(266);
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

	public static class Init_locContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public TerminalNode INIT() { return getToken(UppaalParser.INIT, 0); }
		public TerminalNode REF() { return getToken(UppaalParser.REF, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
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
		enterRule(_localctx, 32, RULE_init_loc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(OPEN);
			setState(269);
			match(INIT);
			setState(270);
			match(REF);
			setState(271);
			match(EQUALS);
			setState(272);
			match(STRING);
			setState(273);
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
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode SLASH() { return getToken(UppaalParser.SLASH, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode URGENT() { return getToken(UppaalParser.URGENT, 0); }
		public TerminalNode COMMITED() { return getToken(UppaalParser.COMMITED, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
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
		enterRule(_localctx, 34, RULE_locations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(OPEN);
			setState(276);
			match(LOCATION);
			setState(277);
			match(ID);
			setState(278);
			match(EQUALS);
			setState(279);
			match(STRING);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(280);
				coordinate();
				}
			}

			setState(283);
			match(CLOSE);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(284);
				misc();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(290);
				name();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(291);
					misc();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(299);
				match(OPEN);
				setState(300);
				match(URGENT);
				setState(301);
				match(COMMITED);
				setState(302);
				match(SLASH_CLOSE);
				}
				break;
			}
			setState(305);
			match(OPEN);
			setState(306);
			match(SLASH);
			setState(307);
			match(LOCATION);
			setState(308);
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(UppaalParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(UppaalParser.OPEN, i);
		}
		public List<TerminalNode> NAME() { return getTokens(UppaalParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(UppaalParser.NAME, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(UppaalParser.SLASH, 0); }
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
		enterRule(_localctx, 36, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(OPEN);
			setState(311);
			match(NAME);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(312);
				coordinate();
				}
			}

			setState(315);
			match(CLOSE);
			setState(316);
			anything();
			setState(317);
			match(OPEN);
			setState(318);
			match(SLASH);
			setState(319);
			match(NAME);
			setState(320);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0145\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\5\2*\n\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3"+
		"\3\4\5\4C\n\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\5\4M\n\4\7\4O\n\4\f\4\16"+
		"\4R\13\4\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5f\n\5\f\5\16\5i\13\5\3\5\5\5l\n\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\5\ny\n\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\n"+
		"\3\n\7\n\u0083\n\n\f\n\16\n\u0086\13\n\3\13\3\13\3\13\3\13\7\13\u008c"+
		"\n\13\f\13\16\13\u008f\13\13\3\13\3\13\7\13\u0093\n\13\f\13\16\13\u0096"+
		"\13\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\13\7\13\u009f\n\13"+
		"\f\13\16\13\u00a2\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\5\r\u00b3\n\r\3\r\3\r\3\r\3\r\5\r\u00b9\n\r\3\r\5\r"+
		"\u00bc\n\r\7\r\u00be\n\r\f\r\16\r\u00c1\13\r\3\16\3\16\3\16\3\16\7\16"+
		"\u00c7\n\16\f\16\16\16\u00ca\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\7\17\u00d4\n\17\f\17\16\17\u00d7\13\17\5\17\u00d9\n\17\3\17\3\17"+
		"\7\17\u00dd\n\17\f\17\16\17\u00e0\13\17\5\17\u00e2\n\17\3\17\3\17\7\17"+
		"\u00e6\n\17\f\17\16\17\u00e9\13\17\5\17\u00eb\n\17\3\17\3\17\7\17\u00ef"+
		"\n\17\f\17\16\17\u00f2\13\17\6\17\u00f4\n\17\r\17\16\17\u00f5\3\17\3\17"+
		"\7\17\u00fa\n\17\f\17\16\17\u00fd\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011c\n\23\3\23\3\23"+
		"\7\23\u0120\n\23\f\23\16\23\u0123\13\23\3\23\3\23\7\23\u0127\n\23\f\23"+
		"\16\23\u012a\13\23\5\23\u012c\n\23\3\23\3\23\3\23\3\23\5\23\u0132\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u013c\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&\2\5\3\2\6\7\4\2\b\b\13\13\5\2\3\3\b\b!!\2\u015c\2)\3\2\2\2\48\3"+
		"\2\2\2\6B\3\2\2\2\bk\3\2\2\2\nm\3\2\2\2\fo\3\2\2\2\16s\3\2\2\2\20u\3\2"+
		"\2\2\22x\3\2\2\2\24\u0087\3\2\2\2\26\u00a8\3\2\2\2\30\u00b2\3\2\2\2\32"+
		"\u00c2\3\2\2\2\34\u00d8\3\2\2\2\36\u00fe\3\2\2\2 \u0107\3\2\2\2\"\u010e"+
		"\3\2\2\2$\u0115\3\2\2\2&\u0138\3\2\2\2(*\5\4\3\2)(\3\2\2\2)*\3\2\2\2*"+
		".\3\2\2\2+-\5\20\t\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2"+
		"\2\2\60.\3\2\2\2\61\65\5\b\5\2\62\64\5\20\t\2\63\62\3\2\2\2\64\67\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\67\65\3\2\2\28<\7\n\2\2"+
		"9;\5\f\7\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2"+
		"?@\7\32\2\2@\5\3\2\2\2AC\5\16\b\2BA\3\2\2\2BC\3\2\2\2CP\3\2\2\2DJ\5\b"+
		"\5\2EJ\5\n\6\2FJ\7\4\2\2GJ\7!\2\2HJ\7\3\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2"+
		"\2\2IG\3\2\2\2IH\3\2\2\2JL\3\2\2\2KM\5\16\b\2LK\3\2\2\2LM\3\2\2\2MO\3"+
		"\2\2\2NI\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\7\3\2\2\2RP\3\2\2\2ST"+
		"\7\t\2\2TX\7\37\2\2UW\5\f\7\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y[\3\2\2\2ZX\3\2\2\2[\\\7\31\2\2\\]\5\6\4\2]^\7\t\2\2^_\7\34\2\2_`\7\37"+
		"\2\2`a\7\31\2\2al\3\2\2\2bc\7\t\2\2cg\7\37\2\2df\5\f\7\2ed\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jl\7\33\2\2kS\3\2\2\2kb"+
		"\3\2\2\2l\t\3\2\2\2mn\t\2\2\2n\13\3\2\2\2op\7\37\2\2pq\7\35\2\2qr\7\36"+
		"\2\2r\r\3\2\2\2st\t\3\2\2t\17\3\2\2\2uv\t\4\2\2v\21\3\2\2\2wy\5\4\3\2"+
		"xw\3\2\2\2xy\3\2\2\2y}\3\2\2\2z|\5\20\t\2{z\3\2\2\2|\177\3\2\2\2}{\3\2"+
		"\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0084\5\24\13\2\u0081"+
		"\u0083\5\20\t\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\23\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0088\7\t\2\2\u0088\u0089\7\f\2\2\u0089\u008d\7\31\2\2\u008a\u008c\5"+
		"\20\t\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094\5\26"+
		"\f\2\u0091\u0093\5\20\t\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0099\5\32\16\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a0\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009f\5\20\t\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\7\34\2\2\u00a5\u00a6\7\f\2\2\u00a6"+
		"\u00a7\7\31\2\2\u00a7\25\3\2\2\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa\7\r\2"+
		"\2\u00aa\u00ab\7\31\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\7\t\2\2\u00ad"+
		"\u00ae\7\34\2\2\u00ae\u00af\7\r\2\2\u00af\u00b0\7\31\2\2\u00b0\27\3\2"+
		"\2\2\u00b1\u00b3\5\16\b\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00bf\3\2\2\2\u00b4\u00b9\5\n\6\2\u00b5\u00b9\7\4\2\2\u00b6\u00b9\7!"+
		"\2\2\u00b7\u00b9\7\3\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\5\16"+
		"\b\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b8\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\31\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4"+
		"\7\16\2\2\u00c4\u00c8\7\31\2\2\u00c5\u00c7\5\20\t\2\u00c6\u00c5\3\2\2"+
		"\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\34\17\2\u00cc\u00cd\7\t\2\2"+
		"\u00cd\u00ce\7\34\2\2\u00ce\u00cf\7\16\2\2\u00cf\u00d0\7\31\2\2\u00d0"+
		"\33\3\2\2\2\u00d1\u00d5\5&\24\2\u00d2\u00d4\5\20\t\2\u00d3\u00d2\3\2\2"+
		"\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00e1\3\2\2\2\u00da\u00de\5\36\20\2\u00db\u00dd\5\20\t\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00ea\3\2\2\2\u00e3\u00e7\5\26\f\2\u00e4\u00e6\5\20\t\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00f3\3\2\2\2\u00ec\u00f0\5$\23\2\u00ed\u00ef\5\20"+
		"\t\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00ec\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00fb\5\"\22\2\u00f8\u00fa\5\20\t\2\u00f9\u00f8\3"+
		"\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\35\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\t\2\2\u00ff\u0100\7\21\2"+
		"\2\u0100\u0101\7\31\2\2\u0101\u0102\5\30\r\2\u0102\u0103\7\t\2\2\u0103"+
		"\u0104\7\34\2\2\u0104\u0105\7\21\2\2\u0105\u0106\7\31\2\2\u0106\37\3\2"+
		"\2\2\u0107\u0108\7\25\2\2\u0108\u0109\7\35\2\2\u0109\u010a\7\36\2\2\u010a"+
		"\u010b\7\26\2\2\u010b\u010c\7\35\2\2\u010c\u010d\7\36\2\2\u010d!\3\2\2"+
		"\2\u010e\u010f\7\t\2\2\u010f\u0110\7\22\2\2\u0110\u0111\7\23\2\2\u0111"+
		"\u0112\7\35\2\2\u0112\u0113\7\36\2\2\u0113\u0114\7\33\2\2\u0114#\3\2\2"+
		"\2\u0115\u0116\7\t\2\2\u0116\u0117\7\17\2\2\u0117\u0118\7\24\2\2\u0118"+
		"\u0119\7\35\2\2\u0119\u011b\7\36\2\2\u011a\u011c\5 \21\2\u011b\u011a\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0121\7\31\2\2\u011e"+
		"\u0120\5\20\t\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\u012b\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0128\5&\24\2\u0125\u0127\5\20\t\2\u0126\u0125\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u0124\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0131\3\2"+
		"\2\2\u012d\u012e\7\t\2\2\u012e\u012f\7\27\2\2\u012f\u0130\7\30\2\2\u0130"+
		"\u0132\7\33\2\2\u0131\u012d\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3"+
		"\2\2\2\u0133\u0134\7\t\2\2\u0134\u0135\7\34\2\2\u0135\u0136\7\17\2\2\u0136"+
		"\u0137\7\31\2\2\u0137%\3\2\2\2\u0138\u0139\7\t\2\2\u0139\u013b\7\20\2"+
		"\2\u013a\u013c\5 \21\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\7\31\2\2\u013e\u013f\5\30\r\2\u013f\u0140\7\t\2\2"+
		"\u0140\u0141\7\34\2\2\u0141\u0142\7\20\2\2\u0142\u0143\7\31\2\2\u0143"+
		"\'\3\2\2\2().\65<BILPXgkx}\u0084\u008d\u0094\u009a\u00a0\u00b2\u00b8\u00bb"+
		"\u00bf\u00c8\u00d5\u00d8\u00de\u00e1\u00e7\u00ea\u00f0\u00f5\u00fb\u011b"+
		"\u0121\u0128\u012b\u0131\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}