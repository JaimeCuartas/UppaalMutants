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
		IDENTIFIER=9, TEXT=10, NTA=11, DECLARATION=12, TEMPLATE=13, LOCATION=14, 
		NAME=15, PARAMETER=16, ID=17, X=18, Y=19, CLOSE=20, SPECIAL_CLOSE=21, 
		SLASH_CLOSE=22, SLASH=23, EQUALS=24, STRING=25, Name=26, S=27, PI=28;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_content = 2, RULE_element = 3, 
		RULE_reference = 4, RULE_attribute = 5, RULE_chardata = 6, RULE_misc = 7, 
		RULE_model = 8, RULE_nta = 9, RULE_declaration = 10, RULE_anything = 11, 
		RULE_template = 12, RULE_name = 13, RULE_parameter = 14, RULE_coordinate = 15, 
		RULE_temp_content = 16, RULE_locations = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "prolog", "content", "element", "reference", "attribute", 
			"chardata", "misc", "model", "nta", "declaration", "anything", "template", 
			"name", "parameter", "coordinate", "temp_content", "locations"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'<'", null, null, null, "'nta'", 
			"'declaration'", "'template'", "'location'", "'name'", "'parameter'", 
			"'id'", "'x'", "'y'", "'>'", null, "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "IDENTIFIER", "TEXT", "NTA", "DECLARATION", "TEMPLATE", 
			"LOCATION", "NAME", "PARAMETER", "ID", "X", "Y", "CLOSE", "SPECIAL_CLOSE", 
			"SLASH_CLOSE", "SLASH", "EQUALS", "STRING", "Name", "S", "PI"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(36);
				prolog();
				}
			}

			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(39);
				misc();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			element();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(46);
				misc();
				}
				}
				setState(51);
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
			setState(52);
			match(XMLDeclOpen);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(53);
				attribute();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(61);
				chardata();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN:
						{
						setState(64);
						element();
						}
						break;
					case EntityRef:
					case CharRef:
						{
						setState(65);
						reference();
						}
						break;
					case CDATA:
						{
						setState(66);
						match(CDATA);
						}
						break;
					case PI:
						{
						setState(67);
						match(PI);
						}
						break;
					case COMMENT:
						{
						setState(68);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(71);
						chardata();
						}
					}

					}
					} 
				}
				setState(78);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(OPEN);
				setState(80);
				match(Name);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(81);
					attribute();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
				match(CLOSE);
				setState(88);
				content();
				setState(89);
				match(OPEN);
				setState(90);
				match(SLASH);
				setState(91);
				match(Name);
				setState(92);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(OPEN);
				setState(95);
				match(Name);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(96);
					attribute();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
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
			setState(105);
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
			setState(107);
			match(Name);
			setState(108);
			match(EQUALS);
			setState(109);
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
			setState(111);
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
			setState(113);
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
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(115);
				prolog();
				}
			}

			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(118);
				misc();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			nta();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(125);
				misc();
				}
				}
				setState(130);
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
			setState(131);
			match(OPEN);
			setState(132);
			match(NTA);
			setState(133);
			match(CLOSE);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(134);
				misc();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			declaration();
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					misc();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					template();
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(153);
				misc();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(OPEN);
			setState(160);
			match(SLASH);
			setState(161);
			match(NTA);
			setState(162);
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
			setState(164);
			match(OPEN);
			setState(165);
			match(DECLARATION);
			setState(166);
			match(CLOSE);
			setState(167);
			anything();
			setState(168);
			match(OPEN);
			setState(169);
			match(SLASH);
			setState(170);
			match(DECLARATION);
			setState(171);
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
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(173);
				chardata();
				}
			}

			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << PI))) != 0)) {
				{
				{
				setState(180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EntityRef:
				case CharRef:
					{
					setState(176);
					reference();
					}
					break;
				case CDATA:
					{
					setState(177);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(178);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(179);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(182);
					chardata();
					}
				}

				}
				}
				setState(189);
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
			setState(190);
			match(OPEN);
			setState(191);
			match(TEMPLATE);
			setState(192);
			match(CLOSE);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(193);
				misc();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			temp_content();
			setState(200);
			match(OPEN);
			setState(201);
			match(SLASH);
			setState(202);
			match(TEMPLATE);
			setState(203);
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
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 26, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(OPEN);
			setState(206);
			match(NAME);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(207);
				coordinate();
				}
			}

			setState(210);
			match(CLOSE);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(211);
				misc();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(IDENTIFIER);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(218);
				misc();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(OPEN);
			setState(225);
			match(SLASH);
			setState(226);
			match(NAME);
			setState(227);
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
			setState(229);
			match(OPEN);
			setState(230);
			match(PARAMETER);
			setState(231);
			match(CLOSE);
			setState(232);
			anything();
			setState(233);
			match(OPEN);
			setState(234);
			match(SLASH);
			setState(235);
			match(PARAMETER);
			setState(236);
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
			setState(238);
			match(X);
			setState(239);
			match(EQUALS);
			setState(240);
			match(STRING);
			setState(241);
			match(Y);
			setState(242);
			match(EQUALS);
			setState(243);
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

	public static class Temp_contentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
		enterRule(_localctx, 32, RULE_temp_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(245);
				name();
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
				break;
			}
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(254);
				parameter();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(255);
					misc();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(270); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(263);
					locations();
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(264);
						misc();
						}
						}
						setState(269);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(272); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(274);
			match(OPEN);
			setState(275);
			match(LOCATION);
			setState(276);
			match(ID);
			setState(277);
			match(EQUALS);
			setState(278);
			match(STRING);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(279);
				coordinate();
				}
			}

			setState(282);
			match(CLOSE);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(283);
				misc();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(289);
				name();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(290);
					misc();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(298);
			match(OPEN);
			setState(299);
			match(SLASH);
			setState(300);
			match(LOCATION);
			setState(301);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0132\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\5\2(\n\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\7\2\62\n\2"+
		"\f\2\16\2\65\13\2\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\5\4A\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\4\5\4K\n\4\7\4M\n\4\f\4\16\4P\13\4\3\5"+
		"\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5d\n\5\f\5\16\5g\13\5\3\5\5\5j\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\5\nw\n\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\3\n\7\n\u0081"+
		"\n\n\f\n\16\n\u0084\13\n\3\13\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13"+
		"\u008d\13\13\3\13\3\13\7\13\u0091\n\13\f\13\16\13\u0094\13\13\3\13\7\13"+
		"\u0097\n\13\f\13\16\13\u009a\13\13\3\13\7\13\u009d\n\13\f\13\16\13\u00a0"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\5\r\u00b1\n\r\3\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\r\5\r\u00ba\n\r\7\r\u00bc"+
		"\n\r\f\r\16\r\u00bf\13\r\3\16\3\16\3\16\3\16\7\16\u00c5\n\16\f\16\16\16"+
		"\u00c8\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00d3\n"+
		"\17\3\17\3\17\7\17\u00d7\n\17\f\17\16\17\u00da\13\17\3\17\3\17\7\17\u00de"+
		"\n\17\f\17\16\17\u00e1\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\7\22\u00fa\n\22\f\22\16\22\u00fd\13\22\5\22\u00ff\n\22\3\22\3\22\7"+
		"\22\u0103\n\22\f\22\16\22\u0106\13\22\5\22\u0108\n\22\3\22\3\22\7\22\u010c"+
		"\n\22\f\22\16\22\u010f\13\22\6\22\u0111\n\22\r\22\16\22\u0112\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u011b\n\23\3\23\3\23\7\23\u011f\n\23\f\23\16"+
		"\23\u0122\13\23\3\23\3\23\7\23\u0126\n\23\f\23\16\23\u0129\13\23\5\23"+
		"\u012b\n\23\3\23\3\23\3\23\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$\2\5\3\2\6\7\4\2\b\b\f\f\5\2\3\3\b\b\36\36\2\u0148"+
		"\2\'\3\2\2\2\4\66\3\2\2\2\6@\3\2\2\2\bi\3\2\2\2\nk\3\2\2\2\fm\3\2\2\2"+
		"\16q\3\2\2\2\20s\3\2\2\2\22v\3\2\2\2\24\u0085\3\2\2\2\26\u00a6\3\2\2\2"+
		"\30\u00b0\3\2\2\2\32\u00c0\3\2\2\2\34\u00cf\3\2\2\2\36\u00e7\3\2\2\2 "+
		"\u00f0\3\2\2\2\"\u00fe\3\2\2\2$\u0114\3\2\2\2&(\5\4\3\2\'&\3\2\2\2\'("+
		"\3\2\2\2(,\3\2\2\2)+\5\20\t\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2"+
		"-/\3\2\2\2.,\3\2\2\2/\63\5\b\5\2\60\62\5\20\t\2\61\60\3\2\2\2\62\65\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66:\7\n"+
		"\2\2\679\5\f\7\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<"+
		":\3\2\2\2=>\7\27\2\2>\5\3\2\2\2?A\5\16\b\2@?\3\2\2\2@A\3\2\2\2AN\3\2\2"+
		"\2BH\5\b\5\2CH\5\n\6\2DH\7\4\2\2EH\7\36\2\2FH\7\3\2\2GB\3\2\2\2GC\3\2"+
		"\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2HJ\3\2\2\2IK\5\16\b\2JI\3\2\2\2JK\3"+
		"\2\2\2KM\3\2\2\2LG\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PN"+
		"\3\2\2\2QR\7\t\2\2RV\7\34\2\2SU\5\f\7\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\26\2\2Z[\5\6\4\2[\\\7\t\2\2\\]\7\31"+
		"\2\2]^\7\34\2\2^_\7\26\2\2_j\3\2\2\2`a\7\t\2\2ae\7\34\2\2bd\5\f\7\2cb"+
		"\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hj\7\30\2\2"+
		"iQ\3\2\2\2i`\3\2\2\2j\t\3\2\2\2kl\t\2\2\2l\13\3\2\2\2mn\7\34\2\2no\7\32"+
		"\2\2op\7\33\2\2p\r\3\2\2\2qr\t\3\2\2r\17\3\2\2\2st\t\4\2\2t\21\3\2\2\2"+
		"uw\5\4\3\2vu\3\2\2\2vw\3\2\2\2w{\3\2\2\2xz\5\20\t\2yx\3\2\2\2z}\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0082\5\24\13\2\177\u0081"+
		"\5\20\t\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\23\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\t\2"+
		"\2\u0086\u0087\7\r\2\2\u0087\u008b\7\26\2\2\u0088\u008a\5\20\t\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0092\5\26\f\2\u008f"+
		"\u0091\5\20\t\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0098\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0097\5\32\16\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009e\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009d\5\20\t\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\t\2\2\u00a2\u00a3\7\31\2\2\u00a3\u00a4\7\r\2\2\u00a4\u00a5\7"+
		"\26\2\2\u00a5\25\3\2\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\7\16\2\2\u00a8"+
		"\u00a9\7\26\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ab\7\t\2\2\u00ab\u00ac\7"+
		"\31\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae\7\26\2\2\u00ae\27\3\2\2\2\u00af"+
		"\u00b1\5\16\b\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00bd\3"+
		"\2\2\2\u00b2\u00b7\5\n\6\2\u00b3\u00b7\7\4\2\2\u00b4\u00b7\7\36\2\2\u00b5"+
		"\u00b7\7\3\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\5\16\b\2\u00b9"+
		"\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b6\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\31\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\7\17\2"+
		"\2\u00c2\u00c6\7\26\2\2\u00c3\u00c5\5\20\t\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\5\"\22\2\u00ca\u00cb\7\t\2\2\u00cb"+
		"\u00cc\7\31\2\2\u00cc\u00cd\7\17\2\2\u00cd\u00ce\7\26\2\2\u00ce\33\3\2"+
		"\2\2\u00cf\u00d0\7\t\2\2\u00d0\u00d2\7\21\2\2\u00d1\u00d3\5 \21\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d8\7\26"+
		"\2\2\u00d5\u00d7\5\20\t\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00df\7\13\2\2\u00dc\u00de\5\20\t\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\t\2\2\u00e3\u00e4\7\31\2\2\u00e4"+
		"\u00e5\7\21\2\2\u00e5\u00e6\7\26\2\2\u00e6\35\3\2\2\2\u00e7\u00e8\7\t"+
		"\2\2\u00e8\u00e9\7\22\2\2\u00e9\u00ea\7\26\2\2\u00ea\u00eb\5\30\r\2\u00eb"+
		"\u00ec\7\t\2\2\u00ec\u00ed\7\31\2\2\u00ed\u00ee\7\22\2\2\u00ee\u00ef\7"+
		"\26\2\2\u00ef\37\3\2\2\2\u00f0\u00f1\7\24\2\2\u00f1\u00f2\7\32\2\2\u00f2"+
		"\u00f3\7\33\2\2\u00f3\u00f4\7\25\2\2\u00f4\u00f5\7\32\2\2\u00f5\u00f6"+
		"\7\33\2\2\u00f6!\3\2\2\2\u00f7\u00fb\5\34\17\2\u00f8\u00fa\5\20\t\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0107\3\2\2\2\u0100\u0104\5\36\20\2\u0101\u0103\5"+
		"\20\t\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0100\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0110\3\2\2\2\u0109\u010d\5$\23\2\u010a"+
		"\u010c\5\20\t\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0109\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113#\3\2\2\2\u0114\u0115\7\t\2\2\u0115\u0116\7\20\2\2\u0116\u0117"+
		"\7\23\2\2\u0117\u0118\7\32\2\2\u0118\u011a\7\33\2\2\u0119\u011b\5 \21"+
		"\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0120"+
		"\7\26\2\2\u011d\u011f\5\20\t\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u012a\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0127\5\34\17\2\u0124\u0126\5\20\t\2\u0125\u0124\3\2\2"+
		"\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\7\t\2\2\u012d\u012e\7\31\2\2\u012e\u012f\7"+
		"\20\2\2\u012f\u0130\7\26\2\2\u0130%\3\2\2\2&\',\63:@GJNVeiv{\u0082\u008b"+
		"\u0092\u0098\u009e\u00b0\u00b6\u00b9\u00bd\u00c6\u00d2\u00d8\u00df\u00fb"+
		"\u00fe\u0104\u0107\u010d\u0112\u011a\u0120\u0127\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}