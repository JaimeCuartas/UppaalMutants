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
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN_GUARD=7, 
		OPEN_DECLARATION=8, OPEN_PARAMETER=9, OPEN=10, OPEN_SLASH=11, XMLDeclOpen=12, 
		TEXT=13, NTA=14, DECLARATION=15, TEMPLATE=16, BRANCHPOINT=17, LOCATION=18, 
		NAME=19, PARAMETER=20, INIT=21, REF=22, ID=23, X=24, Y=25, URGENT_LOC=26, 
		COMMITTED=27, LABEL=28, KIND=29, TRANSITION=30, SOURCE=31, TARGET=32, 
		NAIL=33, SYSTEM=34, QUERIES=35, QUERY=36, FORMULA=37, QUERY_COMMENT=38, 
		CLOSE=39, SPECIAL_CLOSE=40, SLASH_CLOSE=41, EQUALS=42, STRING=43, Name=44, 
		S=45, PI=46, SLASH_COMMENT=47, LINE_COMMENT=48, CLOSE_GUARD=49, CLOSE_DECLARATION=50, 
		CLOSE_PARAMETER=51, GUARD_S=52, NAT=53, POINT=54, FOR=55, WHILE=56, DO=57, 
		IF=58, ELSE=59, RETURN=60, APOSTROPHE=61, LEFT_PARENTHESIS=62, RIGHT_PARENTHESIS=63, 
		LEFT_BRACKET=64, RIGHT_BRACKET=65, LEFT_BRACE=66, RIGHT_BRACE=67, COMMA=68, 
		SEMICOLON=69, INCREMENT=70, DECREMENT=71, ASSIGN=72, ASSIGN_COLON=73, 
		ASSIGN_ADD=74, ASSIGN_SUB=75, ASSIGN_MUL=76, ASSIGN_DIV=77, ASSIGN_PERCENT=78, 
		ASSIGN_OR=79, ASSIGN_AND=80, ASSIGN_XOR=81, ASSIGN_LSHIFT=82, ASSIGN_RSHIFT=83, 
		ADD=84, SUB=85, EXCLAMATION=86, NOT=87, LESS=88, LESSEQ=89, COMPARE=90, 
		DIFFERENT=91, GREATEREQ=92, GREATER=93, MUL=94, DIV=95, PERCENT=96, BITAND=97, 
		BITOR=98, BITXOR=99, LSHIFT=100, RSHIFT=101, AND_SYMBOL=102, OR_SYMBOL=103, 
		MINIMUM=104, MAXIMUM=105, OR=106, AND=107, IMPLY=108, QUESTION=109, COLON=110, 
		LOOKUP_OP=111, FORALL=112, EXISTS=113, SUM=114, URGENT=115, BROADCAST=116, 
		META=117, CONST=118, TYPEDEF=119, INT=120, DOUBLE=121, CLOCK=122, CHAN=123, 
		BOOL=124, SCALAR=125, STRUCT=126, TRUE=127, FALSE=128, IDENTIFIER=129;
	public static final int
		RULE_model = 0, RULE_prolog = 1, RULE_content = 2, RULE_element = 3, RULE_reference = 4, 
		RULE_attribute = 5, RULE_chardata = 6, RULE_misc = 7, RULE_nta = 8, RULE_declaration = 9, 
		RULE_decl_content = 10, RULE_expr = 11, RULE_variableDecl = 12, RULE_type = 13, 
		RULE_prefix = 14, RULE_typeId = 15, RULE_fieldDecl = 16, RULE_arrayDecl = 17, 
		RULE_variableID = 18, RULE_initialiser = 19, RULE_typeDecl = 20, RULE_function = 21, 
		RULE_funcParameters = 22, RULE_funcParameter = 23, RULE_block = 24, RULE_statement = 25, 
		RULE_for_loop = 26, RULE_iteration = 27, RULE_while_loop = 28, RULE_do_while = 29, 
		RULE_if_statement = 30, RULE_return_statement = 31, RULE_anything = 32, 
		RULE_template = 33, RULE_temp_content = 34, RULE_parameter = 35, RULE_coordinate = 36, 
		RULE_init_loc = 37, RULE_branchpoint = 38, RULE_location = 39, RULE_label_loc = 40, 
		RULE_name = 41, RULE_transition = 42, RULE_label_trans = 43, RULE_guard_expr = 44, 
		RULE_guard_arguments = 45, RULE_guard_type = 46, RULE_guard_typeId = 47, 
		RULE_source = 48, RULE_target = 49, RULE_nail = 50, RULE_system = 51, 
		RULE_queries = 52, RULE_query = 53, RULE_formula = 54, RULE_comment = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "prolog", "content", "element", "reference", "attribute", "chardata", 
			"misc", "nta", "declaration", "decl_content", "expr", "variableDecl", 
			"type", "prefix", "typeId", "fieldDecl", "arrayDecl", "variableID", "initialiser", 
			"typeDecl", "function", "funcParameters", "funcParameter", "block", "statement", 
			"for_loop", "iteration", "while_loop", "do_while", "if_statement", "return_statement", 
			"anything", "template", "temp_content", "parameter", "coordinate", "init_loc", 
			"branchpoint", "location", "label_loc", "name", "transition", "label_trans", 
			"guard_expr", "guard_arguments", "guard_type", "guard_typeId", "source", 
			"target", "nail", "system", "queries", "query", "formula", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", "'</'", 
			null, null, "'nta'", "'declaration'", "'template'", "'branchpoint'", 
			"'location'", "'name'", "'parameter'", "'init'", "'ref'", "'id'", "'x'", 
			"'y'", null, "'committed'", "'label'", "'kind'", "'transition'", "'source'", 
			"'target'", "'nail'", "'system'", "'queries'", "'query'", "'formula'", 
			"'comment'", "'>'", null, "'/>'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'for'", "'while'", "'do'", 
			"'if'", "'else'", "'return'", "'''", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "','", "';'", "'++'", "'--'", null, "':='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'|='", "'&amp;='", "'^='", "'&lt;&lt;='", "'&gt;&gt;='", 
			"'+'", "'-'", "'!'", "'not'", "'&lt;'", "'&lt;='", "'=='", "'!='", "'&gt;='", 
			"'&gt;'", "'*'", "'/'", "'%'", "'&amp;'", "'|'", "'^'", "'&lt;&lt;'", 
			"'&gt;&gt;'", "'&amp;&amp;'", "'||'", "'&lt;?'", "'&gt;?'", "'or'", "'and'", 
			"'imply'", "'?'", "':'", "'.'", "'forall'", "'exists'", "'sum'", null, 
			"'broadcast'", "'meta'", "'const'", "'typedef'", "'int'", "'double'", 
			"'clock'", "'chan'", "'bool'", "'scalar'", "'struct'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN_GUARD", 
			"OPEN_DECLARATION", "OPEN_PARAMETER", "OPEN", "OPEN_SLASH", "XMLDeclOpen", 
			"TEXT", "NTA", "DECLARATION", "TEMPLATE", "BRANCHPOINT", "LOCATION", 
			"NAME", "PARAMETER", "INIT", "REF", "ID", "X", "Y", "URGENT_LOC", "COMMITTED", 
			"LABEL", "KIND", "TRANSITION", "SOURCE", "TARGET", "NAIL", "SYSTEM", 
			"QUERIES", "QUERY", "FORMULA", "QUERY_COMMENT", "CLOSE", "SPECIAL_CLOSE", 
			"SLASH_CLOSE", "EQUALS", "STRING", "Name", "S", "PI", "SLASH_COMMENT", 
			"LINE_COMMENT", "CLOSE_GUARD", "CLOSE_DECLARATION", "CLOSE_PARAMETER", 
			"GUARD_S", "NAT", "POINT", "FOR", "WHILE", "DO", "IF", "ELSE", "RETURN", 
			"APOSTROPHE", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "COMMA", "SEMICOLON", "INCREMENT", 
			"DECREMENT", "ASSIGN", "ASSIGN_COLON", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", 
			"ASSIGN_DIV", "ASSIGN_PERCENT", "ASSIGN_OR", "ASSIGN_AND", "ASSIGN_XOR", 
			"ASSIGN_LSHIFT", "ASSIGN_RSHIFT", "ADD", "SUB", "EXCLAMATION", "NOT", 
			"LESS", "LESSEQ", "COMPARE", "DIFFERENT", "GREATEREQ", "GREATER", "MUL", 
			"DIV", "PERCENT", "BITAND", "BITOR", "BITXOR", "LSHIFT", "RSHIFT", "AND_SYMBOL", 
			"OR_SYMBOL", "MINIMUM", "MAXIMUM", "OR", "AND", "IMPLY", "QUESTION", 
			"COLON", "LOOKUP_OP", "FORALL", "EXISTS", "SUM", "URGENT", "BROADCAST", 
			"META", "CONST", "TYPEDEF", "INT", "DOUBLE", "CLOCK", "CHAN", "BOOL", 
			"SCALAR", "STRUCT", "TRUE", "FALSE", "IDENTIFIER"
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

	 // add members to generated UppaalParser
	    private int num=0;

	    public int getNum(){
	        return this.num;
	    }
	    public void setNum(int num){
	        this.num = num;
	    }

	public UppaalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(112);
				prolog();
				}
			}

			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(115);
				misc();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			nta();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(122);
				misc();
				}
				}
				setState(127);
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
			setState(128);
			match(XMLDeclOpen);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(129);
				attribute();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(137);
				chardata();
				}
			}

			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << OPEN) | (1L << PI))) != 0)) {
				{
				{
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN:
					{
					setState(140);
					element();
					}
					break;
				case EntityRef:
				case CharRef:
					{
					setState(141);
					reference();
					}
					break;
				case CDATA:
					{
					setState(142);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(143);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(144);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(147);
					chardata();
					}
				}

				}
				}
				setState(154);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
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
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(OPEN);
				setState(156);
				match(Name);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(157);
					attribute();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(CLOSE);
				setState(164);
				content();
				setState(165);
				match(OPEN_SLASH);
				setState(166);
				match(Name);
				setState(167);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(OPEN);
				setState(170);
				match(Name);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(171);
					attribute();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
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
			setState(180);
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
			setState(182);
			match(Name);
			setState(183);
			match(EQUALS);
			setState(184);
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
			setState(186);
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
			setState(188);
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

	public static class NtaContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
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
		public SystemContext system() {
			return getRuleContext(SystemContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
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
		public QueriesContext queries() {
			return getRuleContext(QueriesContext.class,0);
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
		enterRule(_localctx, 16, RULE_nta);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(OPEN);
			setState(191);
			match(NTA);
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
			declaration();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(200);
				misc();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(206);
					template();
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(207);
						misc();
						}
						}
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(217);
			system();
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
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(224);
				queries();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(225);
					misc();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(233);
			match(OPEN_SLASH);
			setState(234);
			match(NTA);
			setState(235);
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
		public TerminalNode OPEN_DECLARATION() { return getToken(UppaalParser.OPEN_DECLARATION, 0); }
		public Decl_contentContext decl_content() {
			return getRuleContext(Decl_contentContext.class,0);
		}
		public TerminalNode CLOSE_DECLARATION() { return getToken(UppaalParser.CLOSE_DECLARATION, 0); }
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
		enterRule(_localctx, 18, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(OPEN_DECLARATION);
			setState(238);
			decl_content();
			setState(239);
			match(CLOSE_DECLARATION);
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
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public List<TypeDeclContext> typeDecl() {
			return getRuleContexts(TypeDeclContext.class);
		}
		public TypeDeclContext typeDecl(int i) {
			return getRuleContext(TypeDeclContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_decl_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(241);
						variableDecl();
						}
						break;
					case 2:
						{
						setState(242);
						typeDecl();
						}
						break;
					case 3:
						{
						setState(243);
						function();
						}
						break;
					}
					} 
				}
				setState(248);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementExprContext extends ExprContext {
		public TerminalNode INCREMENT() { return getToken(UppaalParser.INCREMENT, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public IncrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends ExprContext {
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(UppaalParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExprContext extends ExprContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public ParenthesisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitParenthesisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitParenthesisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExprContext extends ExprContext {
		public Token binary;
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(UppaalParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(UppaalParser.LESSEQ, 0); }
		public TerminalNode COMPARE() { return getToken(UppaalParser.COMPARE, 0); }
		public TerminalNode DIFFERENT() { return getToken(UppaalParser.DIFFERENT, 0); }
		public TerminalNode GREATEREQ() { return getToken(UppaalParser.GREATEREQ, 0); }
		public TerminalNode GREATER() { return getToken(UppaalParser.GREATER, 0); }
		public ComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExprContext {
		public Token binary;
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(UppaalParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(UppaalParser.SUB, 0); }
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
		public BinaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseGuardExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(UppaalParser.FALSE, 0); }
		public FalseGuardExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFalseGuardExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFalseGuardExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFalseGuardExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIncrementContext extends ExprContext {
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(UppaalParser.INCREMENT, 0); }
		public ExprIncrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterExprIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitExprIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitExprIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotExprContext extends ExprContext {
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode LOOKUP_OP() { return getToken(UppaalParser.LOOKUP_OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public DotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallExprContext extends ExprContext {
		public TerminalNode FORALL() { return getToken(UppaalParser.FORALL, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public ForallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterForallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitForallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitForallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token unary;
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(UppaalParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(UppaalParser.ADD, 0); }
		public TerminalNode EXCLAMATION() { return getToken(UppaalParser.EXCLAMATION, 0); }
		public TerminalNode NOT() { return getToken(UppaalParser.NOT, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public Guard_argumentsContext guard_arguments() {
			return getRuleContext(Guard_argumentsContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumExprContext extends ExprContext {
		public TerminalNode SUM() { return getToken(UppaalParser.SUM, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public SumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterSumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitSumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitSumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDecrementContext extends ExprContext {
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(UppaalParser.DECREMENT, 0); }
		public ExprDecrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterExprDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitExprDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitExprDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueGuarExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(UppaalParser.TRUE, 0); }
		public TrueGuarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTrueGuarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTrueGuarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTrueGuarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public Token assign;
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
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
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleExprContext extends ExprContext {
		public TerminalNode POINT() { return getToken(UppaalParser.POINT, 0); }
		public DoubleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDoubleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDoubleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDoubleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StopWatchExprContext extends ExprContext {
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode APOSTROPHE() { return getToken(UppaalParser.APOSTROPHE, 0); }
		public StopWatchExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStopWatchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStopWatchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStopWatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NatExprContext extends ExprContext {
		public TerminalNode NAT() { return getToken(UppaalParser.NAT, 0); }
		public NatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterNatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitNatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitNatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsExprContext extends ExprContext {
		public TerminalNode EXISTS() { return getToken(UppaalParser.EXISTS, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public ExistsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterExistsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitExistsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitExistsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementExprContext extends ExprContext {
		public TerminalNode DECREMENT() { return getToken(UppaalParser.DECREMENT, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public DecrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDecrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDecrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDecrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new NatExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(NAT);
				}
				break;
			case 3:
				_localctx = new DoubleExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(POINT);
				}
				break;
			case 4:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				guard_expr(0);
				setState(253);
				match(LEFT_BRACKET);
				setState(254);
				guard_expr(0);
				setState(255);
				match(RIGHT_BRACKET);
				}
				break;
			case 5:
				_localctx = new StopWatchExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				guard_expr(0);
				setState(258);
				match(APOSTROPHE);
				}
				break;
			case 6:
				_localctx = new ParenthesisExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				match(LEFT_PARENTHESIS);
				setState(261);
				guard_expr(0);
				setState(262);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 7:
				_localctx = new ExprIncrementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				guard_expr(0);
				setState(265);
				match(INCREMENT);
				}
				break;
			case 8:
				_localctx = new IncrementExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(267);
				match(INCREMENT);
				setState(268);
				guard_expr(0);
				}
				break;
			case 9:
				_localctx = new ExprDecrementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				guard_expr(0);
				setState(270);
				match(DECREMENT);
				}
				break;
			case 10:
				_localctx = new DecrementExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(272);
				match(DECREMENT);
				setState(273);
				guard_expr(0);
				}
				break;
			case 11:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(274);
				guard_expr(0);
				setState(275);
				((AssignExprContext)_localctx).assign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASSIGN - 72)) | (1L << (ASSIGN_COLON - 72)) | (1L << (ASSIGN_ADD - 72)) | (1L << (ASSIGN_SUB - 72)) | (1L << (ASSIGN_MUL - 72)) | (1L << (ASSIGN_DIV - 72)) | (1L << (ASSIGN_PERCENT - 72)) | (1L << (ASSIGN_OR - 72)) | (1L << (ASSIGN_AND - 72)) | (1L << (ASSIGN_XOR - 72)) | (1L << (ASSIGN_LSHIFT - 72)) | (1L << (ASSIGN_RSHIFT - 72)))) != 0)) ) {
					((AssignExprContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(276);
				guard_expr(0);
				}
				break;
			case 12:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(278);
				((UnaryExprContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (ADD - 84)) | (1L << (SUB - 84)) | (1L << (EXCLAMATION - 84)) | (1L << (NOT - 84)))) != 0)) ) {
					((UnaryExprContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(279);
				guard_expr(0);
				}
				break;
			case 13:
				_localctx = new ComparisonExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(280);
				guard_expr(0);
				setState(281);
				((ComparisonExprContext)_localctx).binary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (LESS - 88)) | (1L << (LESSEQ - 88)) | (1L << (COMPARE - 88)) | (1L << (DIFFERENT - 88)) | (1L << (GREATEREQ - 88)) | (1L << (GREATER - 88)))) != 0)) ) {
					((ComparisonExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(282);
				guard_expr(0);
				}
				break;
			case 14:
				_localctx = new BinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(284);
				guard_expr(0);
				setState(285);
				((BinaryExprContext)_localctx).binary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (ADD - 84)) | (1L << (SUB - 84)) | (1L << (MUL - 84)) | (1L << (DIV - 84)) | (1L << (PERCENT - 84)) | (1L << (BITAND - 84)) | (1L << (BITOR - 84)) | (1L << (BITXOR - 84)) | (1L << (LSHIFT - 84)) | (1L << (RSHIFT - 84)) | (1L << (AND_SYMBOL - 84)) | (1L << (OR_SYMBOL - 84)) | (1L << (MINIMUM - 84)) | (1L << (MAXIMUM - 84)) | (1L << (OR - 84)) | (1L << (AND - 84)) | (1L << (IMPLY - 84)))) != 0)) ) {
					((BinaryExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(286);
				guard_expr(0);
				}
				break;
			case 15:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(288);
				guard_expr(0);
				setState(289);
				match(QUESTION);
				setState(290);
				guard_expr(0);
				setState(291);
				match(COLON);
				setState(292);
				guard_expr(0);
				}
				break;
			case 16:
				_localctx = new DotExprContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(294);
				guard_expr(0);
				setState(295);
				match(LOOKUP_OP);
				setState(296);
				match(IDENTIFIER);
				}
				break;
			case 17:
				_localctx = new FuncExprContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(298);
				guard_expr(0);
				setState(299);
				match(LEFT_PARENTHESIS);
				setState(300);
				guard_arguments();
				setState(301);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 18:
				_localctx = new ForallExprContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(303);
				match(FORALL);
				setState(304);
				match(LEFT_PARENTHESIS);
				setState(305);
				match(IDENTIFIER);
				setState(306);
				match(COLON);
				setState(307);
				type();
				setState(308);
				match(RIGHT_PARENTHESIS);
				setState(309);
				guard_expr(0);
				}
				break;
			case 19:
				_localctx = new ExistsExprContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(311);
				match(EXISTS);
				setState(312);
				match(LEFT_PARENTHESIS);
				setState(313);
				match(IDENTIFIER);
				setState(314);
				match(COLON);
				setState(315);
				type();
				setState(316);
				match(RIGHT_PARENTHESIS);
				setState(317);
				guard_expr(0);
				}
				break;
			case 20:
				_localctx = new SumExprContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(319);
				match(SUM);
				setState(320);
				match(LEFT_PARENTHESIS);
				setState(321);
				match(IDENTIFIER);
				setState(322);
				match(COLON);
				setState(323);
				type();
				setState(324);
				match(RIGHT_PARENTHESIS);
				setState(325);
				guard_expr(0);
				}
				break;
			case 21:
				_localctx = new TrueGuarExprContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(327);
				match(TRUE);
				}
				break;
			case 22:
				_localctx = new FalseGuardExprContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(328);
				match(FALSE);
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

	public static class VariableDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableIDContext> variableID() {
			return getRuleContexts(VariableIDContext.class);
		}
		public VariableIDContext variableID(int i) {
			return getRuleContext(VariableIDContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			type();
			setState(332);
			variableID();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(333);
				match(COMMA);
				setState(334);
				variableID();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(SEMICOLON);
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
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (URGENT - 115)) | (1L << (BROADCAST - 115)) | (1L << (META - 115)) | (1L << (CONST - 115)))) != 0)) {
				{
				setState(342);
				prefix();
				}
			}

			setState(345);
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

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode URGENT() { return getToken(UppaalParser.URGENT, 0); }
		public TerminalNode BROADCAST() { return getToken(UppaalParser.BROADCAST, 0); }
		public TerminalNode META() { return getToken(UppaalParser.META, 0); }
		public TerminalNode CONST() { return getToken(UppaalParser.CONST, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (URGENT - 115)) | (1L << (BROADCAST - 115)) | (1L << (META - 115)) | (1L << (CONST - 115)))) != 0)) ) {
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

	public static class TypeIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(UppaalParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(UppaalParser.DOUBLE, 0); }
		public TerminalNode CLOCK() { return getToken(UppaalParser.CLOCK, 0); }
		public TerminalNode CHAN() { return getToken(UppaalParser.CHAN, 0); }
		public TerminalNode BOOL() { return getToken(UppaalParser.BOOL, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(UppaalParser.COMMA, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public TerminalNode SCALAR() { return getToken(UppaalParser.SCALAR, 0); }
		public TerminalNode STRUCT() { return getToken(UppaalParser.STRUCT, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(UppaalParser.LEFT_BRACE, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(UppaalParser.RIGHT_BRACE, 0); }
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
		enterRule(_localctx, 30, RULE_typeId);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(CLOCK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(CHAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				match(BOOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(355);
				match(INT);
				setState(356);
				match(LEFT_BRACKET);
				setState(357);
				expr();
				setState(358);
				match(COMMA);
				setState(359);
				expr();
				setState(360);
				match(RIGHT_BRACKET);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(362);
				match(SCALAR);
				setState(363);
				match(LEFT_BRACKET);
				setState(364);
				expr();
				setState(365);
				match(RIGHT_BRACKET);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(367);
				match(STRUCT);
				setState(368);
				match(LEFT_BRACE);
				setState(369);
				fieldDecl();
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (URGENT - 115)) | (1L << (BROADCAST - 115)) | (1L << (META - 115)) | (1L << (CONST - 115)) | (1L << (INT - 115)) | (1L << (DOUBLE - 115)) | (1L << (CLOCK - 115)) | (1L << (CHAN - 115)) | (1L << (BOOL - 115)) | (1L << (SCALAR - 115)) | (1L << (STRUCT - 115)) | (1L << (IDENTIFIER - 115)))) != 0)) {
					{
					{
					setState(370);
					fieldDecl();
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				match(RIGHT_BRACE);
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

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(UppaalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(UppaalParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			type();
			setState(381);
			match(IDENTIFIER);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(382);
				arrayDecl();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(388);
				match(COMMA);
				setState(389);
				match(IDENTIFIER);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(390);
					arrayDecl();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(SEMICOLON);
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

	public static class ArrayDeclContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayDecl);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(LEFT_BRACKET);
				setState(404);
				expr();
				setState(405);
				match(RIGHT_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(LEFT_BRACKET);
				setState(408);
				type();
				setState(409);
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

	public static class VariableIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(UppaalParser.ASSIGN, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public VariableIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterVariableID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitVariableID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitVariableID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIDContext variableID() throws RecognitionException {
		VariableIDContext _localctx = new VariableIDContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(IDENTIFIER);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(414);
				arrayDecl();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(420);
				match(ASSIGN);
				setState(421);
				initialiser();
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

	public static class InitialiserContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(UppaalParser.LEFT_BRACE, 0); }
		public List<InitialiserContext> initialiser() {
			return getRuleContexts(InitialiserContext.class);
		}
		public InitialiserContext initialiser(int i) {
			return getRuleContext(InitialiserContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(UppaalParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterInitialiser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitInitialiser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitInitialiser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_initialiser);
		int _la;
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAT:
			case POINT:
			case LEFT_PARENTHESIS:
			case INCREMENT:
			case DECREMENT:
			case ADD:
			case SUB:
			case EXCLAMATION:
			case NOT:
			case FORALL:
			case EXISTS:
			case SUM:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				expr();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(LEFT_BRACE);
				setState(426);
				initialiser();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(427);
					match(COMMA);
					setState(428);
					initialiser();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(434);
				match(RIGHT_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(UppaalParser.TYPEDEF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(UppaalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(UppaalParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(TYPEDEF);
			setState(439);
			type();
			setState(440);
			match(IDENTIFIER);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(441);
				arrayDecl();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(447);
				match(COMMA);
				setState(448);
				match(IDENTIFIER);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFT_BRACKET) {
					{
					{
					setState(449);
					arrayDecl();
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			match(SEMICOLON);
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public FuncParametersContext funcParameters() {
			return getRuleContext(FuncParametersContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			type();
			setState(463);
			match(IDENTIFIER);
			setState(464);
			match(LEFT_PARENTHESIS);
			setState(465);
			funcParameters();
			setState(466);
			match(RIGHT_PARENTHESIS);
			setState(467);
			block();
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

	public static class FuncParametersContext extends ParserRuleContext {
		public List<FuncParameterContext> funcParameter() {
			return getRuleContexts(FuncParameterContext.class);
		}
		public FuncParameterContext funcParameter(int i) {
			return getRuleContext(FuncParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public FuncParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFuncParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFuncParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFuncParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParametersContext funcParameters() throws RecognitionException {
		FuncParametersContext _localctx = new FuncParametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (URGENT - 115)) | (1L << (BROADCAST - 115)) | (1L << (META - 115)) | (1L << (CONST - 115)) | (1L << (INT - 115)) | (1L << (DOUBLE - 115)) | (1L << (CLOCK - 115)) | (1L << (CHAN - 115)) | (1L << (BOOL - 115)) | (1L << (SCALAR - 115)) | (1L << (STRUCT - 115)) | (1L << (IDENTIFIER - 115)))) != 0)) {
				{
				setState(469);
				funcParameter();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(470);
					match(COMMA);
					setState(471);
					funcParameter();
					}
					}
					setState(476);
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

	public static class FuncParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode BITAND() { return getToken(UppaalParser.BITAND, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public FuncParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFuncParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFuncParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFuncParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParameterContext funcParameter() throws RecognitionException {
		FuncParameterContext _localctx = new FuncParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funcParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			type();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(480);
				match(BITAND);
				}
			}

			setState(483);
			match(IDENTIFIER);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(484);
				arrayDecl();
				}
				}
				setState(489);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(UppaalParser.LEFT_BRACE, 0); }
		public Decl_contentContext decl_content() {
			return getRuleContext(Decl_contentContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(UppaalParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(LEFT_BRACE);
			setState(491);
			decl_content();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAT) | (1L << POINT) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << RETURN) | (1L << LEFT_PARENTHESIS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LEFT_BRACE - 66)) | (1L << (SEMICOLON - 66)) | (1L << (INCREMENT - 66)) | (1L << (DECREMENT - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (EXCLAMATION - 66)) | (1L << (NOT - 66)) | (1L << (FORALL - 66)) | (1L << (EXISTS - 66)) | (1L << (SUM - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(492);
				statement();
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			match(RIGHT_BRACE);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				expr();
				setState(503);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				iteration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(507);
				while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(508);
				do_while();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(509);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(510);
				return_statement();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(UppaalParser.FOR, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(UppaalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(UppaalParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(FOR);
			setState(514);
			match(LEFT_PARENTHESIS);
			setState(515);
			expr();
			setState(516);
			match(SEMICOLON);
			setState(517);
			expr();
			setState(518);
			match(SEMICOLON);
			setState(519);
			expr();
			setState(520);
			match(RIGHT_PARENTHESIS);
			setState(521);
			statement();
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

	public static class IterationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(UppaalParser.FOR, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(FOR);
			setState(524);
			match(LEFT_PARENTHESIS);
			setState(525);
			match(IDENTIFIER);
			setState(526);
			match(COLON);
			setState(527);
			type();
			setState(528);
			match(RIGHT_PARENTHESIS);
			setState(529);
			statement();
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(UppaalParser.WHILE, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(WHILE);
			setState(532);
			match(LEFT_PARENTHESIS);
			setState(533);
			expr();
			setState(534);
			match(RIGHT_PARENTHESIS);
			setState(535);
			statement();
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

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(UppaalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(UppaalParser.WHILE, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(DO);
			setState(538);
			statement();
			setState(539);
			match(WHILE);
			setState(540);
			match(LEFT_PARENTHESIS);
			setState(541);
			expr();
			setState(542);
			match(RIGHT_PARENTHESIS);
			setState(543);
			match(SEMICOLON);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(UppaalParser.IF, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UppaalParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(IF);
			setState(546);
			match(LEFT_PARENTHESIS);
			setState(547);
			expr();
			setState(548);
			match(RIGHT_PARENTHESIS);
			setState(549);
			statement();
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(550);
				match(ELSE);
				setState(551);
				statement();
				}
				break;
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(UppaalParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(RETURN);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAT) | (1L << POINT) | (1L << LEFT_PARENTHESIS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INCREMENT - 70)) | (1L << (DECREMENT - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (EXCLAMATION - 70)) | (1L << (NOT - 70)) | (1L << (FORALL - 70)) | (1L << (EXISTS - 70)) | (1L << (SUM - 70)) | (1L << (TRUE - 70)) | (1L << (FALSE - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(555);
				expr();
				}
			}

			setState(558);
			match(SEMICOLON);
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
		enterRule(_localctx, 64, RULE_anything);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(560);
				chardata();
				}
			}

			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << PI))) != 0)) {
				{
				{
				setState(567);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EntityRef:
				case CharRef:
					{
					setState(563);
					reference();
					}
					break;
				case CDATA:
					{
					setState(564);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(565);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(566);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(569);
					chardata();
					}
				}

				}
				}
				setState(576);
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
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
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
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
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
		enterRule(_localctx, 66, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(OPEN);
			setState(578);
			match(TEMPLATE);
			setState(579);
			match(CLOSE);
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(580);
				misc();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(586);
			temp_content();
			setState(587);
			match(OPEN_SLASH);
			setState(588);
			match(TEMPLATE);
			setState(589);
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
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public List<LocationContext> location() {
			return getRuleContexts(LocationContext.class);
		}
		public LocationContext location(int i) {
			return getRuleContext(LocationContext.class,i);
		}
		public List<BranchpointContext> branchpoint() {
			return getRuleContexts(BranchpointContext.class);
		}
		public BranchpointContext branchpoint(int i) {
			return getRuleContext(BranchpointContext.class,i);
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
		enterRule(_localctx, 68, RULE_temp_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(591);
				name();
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(592);
					misc();
					}
					}
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARAMETER) {
				{
				setState(600);
				parameter();
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(601);
					misc();
					}
					}
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_DECLARATION) {
				{
				setState(609);
				declaration();
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(610);
					misc();
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(632); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(632);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						{
						setState(618);
						location();
						setState(622);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(619);
							misc();
							}
							}
							setState(624);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					case 2:
						{
						{
						setState(625);
						branchpoint();
						setState(629);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(626);
							misc();
							}
							}
							setState(631);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(634); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(636);
			init_loc();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(637);
				misc();
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(643);
				transition();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(644);
					misc();
					}
					}
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(654);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode OPEN_PARAMETER() { return getToken(UppaalParser.OPEN_PARAMETER, 0); }
		public FuncParametersContext funcParameters() {
			return getRuleContext(FuncParametersContext.class,0);
		}
		public TerminalNode CLOSE_PARAMETER() { return getToken(UppaalParser.CLOSE_PARAMETER, 0); }
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
		enterRule(_localctx, 70, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(OPEN_PARAMETER);
			setState(656);
			funcParameters();
			setState(657);
			match(CLOSE_PARAMETER);
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
		enterRule(_localctx, 72, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(X);
			setState(660);
			match(EQUALS);
			setState(661);
			match(STRING);
			setState(662);
			match(Y);
			setState(663);
			match(EQUALS);
			setState(664);
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
		enterRule(_localctx, 74, RULE_init_loc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(OPEN);
			setState(667);
			match(INIT);
			setState(668);
			match(REF);
			setState(669);
			match(EQUALS);
			setState(670);
			match(STRING);
			setState(671);
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

	public static class BranchpointContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> BRANCHPOINT() { return getTokens(UppaalParser.BRANCHPOINT); }
		public TerminalNode BRANCHPOINT(int i) {
			return getToken(UppaalParser.BRANCHPOINT, i);
		}
		public TerminalNode ID() { return getToken(UppaalParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public BranchpointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchpoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBranchpoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBranchpoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBranchpoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchpointContext branchpoint() throws RecognitionException {
		BranchpointContext _localctx = new BranchpointContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_branchpoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(OPEN);
			setState(674);
			match(BRANCHPOINT);
			setState(675);
			match(ID);
			setState(676);
			match(EQUALS);
			setState(677);
			match(STRING);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(678);
				coordinate();
				}
			}

			setState(681);
			match(CLOSE);
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(682);
				misc();
				}
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(688);
			match(OPEN_SLASH);
			setState(689);
			match(BRANCHPOINT);
			setState(690);
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

	public static class LocationContext extends ParserRuleContext {
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
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
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
		public List<Label_locContext> label_loc() {
			return getRuleContexts(Label_locContext.class);
		}
		public Label_locContext label_loc(int i) {
			return getRuleContext(Label_locContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public TerminalNode URGENT_LOC() { return getToken(UppaalParser.URGENT_LOC, 0); }
		public TerminalNode COMMITTED() { return getToken(UppaalParser.COMMITTED, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_location);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(OPEN);
			setState(693);
			match(LOCATION);
			setState(694);
			match(ID);
			setState(695);
			match(EQUALS);
			setState(696);
			match(STRING);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(697);
				coordinate();
				}
			}

			setState(700);
			match(CLOSE);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(701);
				misc();
				}
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(707);
				name();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(708);
					misc();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(716);
					label_loc();
					setState(720);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(717);
						misc();
						}
						}
						setState(722);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(728);
				match(OPEN);
				setState(729);
				_la = _input.LA(1);
				if ( !(_la==URGENT_LOC || _la==COMMITTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(730);
				match(SLASH_CLOSE);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(731);
					misc();
					}
					}
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(739);
			match(OPEN_SLASH);
			setState(740);
			match(LOCATION);
			setState(741);
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

	public static class Label_locContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> LABEL() { return getTokens(UppaalParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(UppaalParser.LABEL, i);
		}
		public TerminalNode KIND() { return getToken(UppaalParser.KIND, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public Label_locContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabel_loc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabel_loc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabel_loc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_locContext label_loc() throws RecognitionException {
		Label_locContext _localctx = new Label_locContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_label_loc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(OPEN);
			setState(744);
			match(LABEL);
			setState(745);
			match(KIND);
			setState(746);
			match(EQUALS);
			setState(747);
			match(STRING);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(748);
				coordinate();
				}
			}

			setState(751);
			match(CLOSE);
			setState(752);
			anything();
			setState(753);
			match(OPEN_SLASH);
			setState(754);
			match(LABEL);
			setState(755);
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
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
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
		enterRule(_localctx, 82, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(OPEN);
			setState(758);
			match(NAME);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(759);
				coordinate();
				}
			}

			setState(762);
			match(CLOSE);
			setState(763);
			anything();
			setState(764);
			match(OPEN_SLASH);
			setState(765);
			match(NAME);
			setState(766);
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

	public static class TransitionContext extends ParserRuleContext {
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
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<Label_transContext> label_trans() {
			return getRuleContexts(Label_transContext.class);
		}
		public Label_transContext label_trans(int i) {
			return getRuleContext(Label_transContext.class,i);
		}
		public List<NailContext> nail() {
			return getRuleContexts(NailContext.class);
		}
		public NailContext nail(int i) {
			return getRuleContext(NailContext.class,i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_transition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(OPEN);
			setState(769);
			match(TRANSITION);
			setState(770);
			match(CLOSE);
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(771);
				misc();
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(777);
			source();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(778);
				misc();
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(784);
			target();
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(785);
				misc();
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(800);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(791);
					label_trans();
					setState(795);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(792);
						misc();
						}
						}
						setState(797);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(803);
				nail();
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(804);
					misc();
					}
					}
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(815);
			match(OPEN_SLASH);
			setState(816);
			match(TRANSITION);
			setState(817);
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

	public static class Label_transContext extends ParserRuleContext {
		public Label_transContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_trans; }
	 
		public Label_transContext() { }
		public void copyFrom(Label_transContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LabelTransGuardContext extends Label_transContext {
		public TerminalNode OPEN_GUARD() { return getToken(UppaalParser.OPEN_GUARD, 0); }
		public TerminalNode CLOSE_GUARD() { return getToken(UppaalParser.CLOSE_GUARD, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public LabelTransGuardContext(Label_transContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabelTransGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabelTransGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabelTransGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelTransContext extends Label_transContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> LABEL() { return getTokens(UppaalParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(UppaalParser.LABEL, i);
		}
		public TerminalNode KIND() { return getToken(UppaalParser.KIND, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public LabelTransContext(Label_transContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabelTrans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabelTrans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabelTrans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_transContext label_trans() throws RecognitionException {
		Label_transContext _localctx = new Label_transContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_label_trans);
		int _la;
		try {
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_GUARD:
				_localctx = new LabelTransGuardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				match(OPEN_GUARD);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAT) | (1L << POINT) | (1L << LEFT_PARENTHESIS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INCREMENT - 70)) | (1L << (DECREMENT - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (EXCLAMATION - 70)) | (1L << (NOT - 70)) | (1L << (FORALL - 70)) | (1L << (EXISTS - 70)) | (1L << (SUM - 70)) | (1L << (TRUE - 70)) | (1L << (FALSE - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					setState(820);
					guard_expr(0);
					}
				}

				setState(823);
				match(CLOSE_GUARD);
				}
				break;
			case OPEN:
				_localctx = new LabelTransContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				match(OPEN);
				setState(825);
				match(LABEL);
				setState(826);
				match(KIND);
				setState(827);
				match(EQUALS);
				setState(828);
				match(STRING);
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==X) {
					{
					setState(829);
					coordinate();
					}
				}

				setState(832);
				match(CLOSE);
				setState(833);
				anything();
				setState(834);
				match(OPEN_SLASH);
				setState(835);
				match(LABEL);
				setState(836);
				match(CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public Guard_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_expr; }
	 
		public Guard_exprContext() { }
		public void copyFrom(Guard_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumGuardContext extends Guard_exprContext {
		public TerminalNode SUM() { return getToken(UppaalParser.SUM, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public Guard_typeContext guard_type() {
			return getRuleContext(Guard_typeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public SumGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterSumGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitSumGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitSumGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisGuardContext extends Guard_exprContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public ParenthesisGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterParenthesisGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitParenthesisGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitParenthesisGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseGuardContext extends Guard_exprContext {
		public TerminalNode FALSE() { return getToken(UppaalParser.FALSE, 0); }
		public FalseGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFalseGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFalseGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFalseGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignGuardContext extends Guard_exprContext {
		public Token assign;
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
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
		public AssignGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterAssignGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitAssignGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitAssignGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotGuardContext extends Guard_exprContext {
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode LOOKUP_OP() { return getToken(UppaalParser.LOOKUP_OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public DotGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDotGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDotGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDotGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementGuardContext extends Guard_exprContext {
		public TerminalNode DECREMENT() { return getToken(UppaalParser.DECREMENT, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public DecrementGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDecrementGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDecrementGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDecrementGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryGuardContext extends Guard_exprContext {
		public Token unary;
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(UppaalParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(UppaalParser.ADD, 0); }
		public TerminalNode EXCLAMATION() { return getToken(UppaalParser.EXCLAMATION, 0); }
		public TerminalNode NOT() { return getToken(UppaalParser.NOT, 0); }
		public UnaryGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterUnaryGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitUnaryGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitUnaryGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonGuardContext extends Guard_exprContext {
		public Token binary;
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(UppaalParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(UppaalParser.LESSEQ, 0); }
		public TerminalNode COMPARE() { return getToken(UppaalParser.COMPARE, 0); }
		public TerminalNode DIFFERENT() { return getToken(UppaalParser.DIFFERENT, 0); }
		public TerminalNode GREATEREQ() { return getToken(UppaalParser.GREATEREQ, 0); }
		public TerminalNode GREATER() { return getToken(UppaalParser.GREATER, 0); }
		public ComparisonGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterComparisonGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitComparisonGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitComparisonGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierGuardContext extends Guard_exprContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public IdentifierGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIdentifierGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIdentifierGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIdentifierGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryGuardContext extends Guard_exprContext {
		public Token binary;
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(UppaalParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(UppaalParser.SUB, 0); }
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
		public BinaryGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBinaryGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBinaryGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBinaryGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NatGuardContext extends Guard_exprContext {
		public TerminalNode NAT() { return getToken(UppaalParser.NAT, 0); }
		public NatGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterNatGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitNatGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitNatGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsGuardContext extends Guard_exprContext {
		public TerminalNode EXISTS() { return getToken(UppaalParser.EXISTS, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public Guard_typeContext guard_type() {
			return getRuleContext(Guard_typeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public ExistsGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterExistsGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitExistsGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitExistsGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StopWatchGuardContext extends Guard_exprContext {
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode APOSTROPHE() { return getToken(UppaalParser.APOSTROPHE, 0); }
		public StopWatchGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStopWatchGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStopWatchGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStopWatchGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayGuardContext extends Guard_exprContext {
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ArrayGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArrayGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArrayGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArrayGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallGuardContext extends Guard_exprContext {
		public TerminalNode FORALL() { return getToken(UppaalParser.FORALL, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public Guard_typeContext guard_type() {
			return getRuleContext(Guard_typeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public ForallGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterForallGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitForallGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitForallGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuardDecrementContext extends Guard_exprContext {
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(UppaalParser.DECREMENT, 0); }
		public GuardDecrementContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueGuardContext extends Guard_exprContext {
		public TerminalNode TRUE() { return getToken(UppaalParser.TRUE, 0); }
		public TrueGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTrueGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTrueGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTrueGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfGuardContext extends Guard_exprContext {
		public List<Guard_exprContext> guard_expr() {
			return getRuleContexts(Guard_exprContext.class);
		}
		public Guard_exprContext guard_expr(int i) {
			return getRuleContext(Guard_exprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(UppaalParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public IfGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIfGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIfGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIfGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncGuardContext extends Guard_exprContext {
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public Guard_argumentsContext guard_arguments() {
			return getRuleContext(Guard_argumentsContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public FuncGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFuncGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFuncGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFuncGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementGuardContext extends Guard_exprContext {
		public TerminalNode INCREMENT() { return getToken(UppaalParser.INCREMENT, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public IncrementGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIncrementGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIncrementGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIncrementGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleGuardContext extends Guard_exprContext {
		public TerminalNode POINT() { return getToken(UppaalParser.POINT, 0); }
		public DoubleGuardContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDoubleGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDoubleGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDoubleGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuardIncrementContext extends Guard_exprContext {
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(UppaalParser.INCREMENT, 0); }
		public GuardIncrementContext(Guard_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardIncrement(this);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_guard_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentifierGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(841);
				match(IDENTIFIER);
				}
				break;
			case NAT:
				{
				_localctx = new NatGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(842);
				match(NAT);
				}
				break;
			case POINT:
				{
				_localctx = new DoubleGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(843);
				match(POINT);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				_localctx = new ParenthesisGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(844);
				match(LEFT_PARENTHESIS);
				setState(845);
				guard_expr(0);
				setState(846);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case INCREMENT:
				{
				_localctx = new IncrementGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(848);
				match(INCREMENT);
				setState(849);
				guard_expr(15);
				}
				break;
			case DECREMENT:
				{
				_localctx = new DecrementGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(850);
				match(DECREMENT);
				setState(851);
				guard_expr(13);
				}
				break;
			case ADD:
			case SUB:
			case EXCLAMATION:
			case NOT:
				{
				_localctx = new UnaryGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(852);
				((UnaryGuardContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (ADD - 84)) | (1L << (SUB - 84)) | (1L << (EXCLAMATION - 84)) | (1L << (NOT - 84)))) != 0)) ) {
					((UnaryGuardContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(853);
				guard_expr(11);
				}
				break;
			case FORALL:
				{
				_localctx = new ForallGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(854);
				match(FORALL);
				setState(855);
				match(LEFT_PARENTHESIS);
				setState(856);
				match(IDENTIFIER);
				setState(857);
				match(COLON);
				setState(858);
				guard_type();
				setState(859);
				match(RIGHT_PARENTHESIS);
				setState(860);
				guard_expr(5);
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(862);
				match(EXISTS);
				setState(863);
				match(LEFT_PARENTHESIS);
				setState(864);
				match(IDENTIFIER);
				setState(865);
				match(COLON);
				setState(866);
				guard_type();
				setState(867);
				match(RIGHT_PARENTHESIS);
				setState(868);
				guard_expr(4);
				}
				break;
			case SUM:
				{
				_localctx = new SumGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(870);
				match(SUM);
				setState(871);
				match(LEFT_PARENTHESIS);
				setState(872);
				match(IDENTIFIER);
				setState(873);
				match(COLON);
				setState(874);
				guard_type();
				setState(875);
				match(RIGHT_PARENTHESIS);
				setState(876);
				guard_expr(3);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(878);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(879);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(918);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new AssignGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(882);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(883);
						((AssignGuardContext)_localctx).assign = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASSIGN - 72)) | (1L << (ASSIGN_COLON - 72)) | (1L << (ASSIGN_ADD - 72)) | (1L << (ASSIGN_SUB - 72)) | (1L << (ASSIGN_MUL - 72)) | (1L << (ASSIGN_DIV - 72)) | (1L << (ASSIGN_PERCENT - 72)) | (1L << (ASSIGN_OR - 72)) | (1L << (ASSIGN_AND - 72)) | (1L << (ASSIGN_XOR - 72)) | (1L << (ASSIGN_LSHIFT - 72)) | (1L << (ASSIGN_RSHIFT - 72)))) != 0)) ) {
							((AssignGuardContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(884);
						guard_expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(885);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(886);
						((ComparisonGuardContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (LESS - 88)) | (1L << (LESSEQ - 88)) | (1L << (COMPARE - 88)) | (1L << (DIFFERENT - 88)) | (1L << (GREATEREQ - 88)) | (1L << (GREATER - 88)))) != 0)) ) {
							((ComparisonGuardContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(887);
						guard_expr(11);


						                          this.num++;
						                          //System.out.println ((((ComparisonGuardContext)_localctx).binary!=null?((ComparisonGuardContext)_localctx).binary.getText():null));
						                          
						}
						break;
					case 3:
						{
						_localctx = new BinaryGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(890);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(891);
						((BinaryGuardContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (ADD - 84)) | (1L << (SUB - 84)) | (1L << (MUL - 84)) | (1L << (DIV - 84)) | (1L << (PERCENT - 84)) | (1L << (BITAND - 84)) | (1L << (BITOR - 84)) | (1L << (BITXOR - 84)) | (1L << (LSHIFT - 84)) | (1L << (RSHIFT - 84)) | (1L << (AND_SYMBOL - 84)) | (1L << (OR_SYMBOL - 84)) | (1L << (MINIMUM - 84)) | (1L << (MAXIMUM - 84)) | (1L << (OR - 84)) | (1L << (AND - 84)) | (1L << (IMPLY - 84)))) != 0)) ) {
							((BinaryGuardContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(892);
						guard_expr(10);
						}
						break;
					case 4:
						{
						_localctx = new IfGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(893);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(894);
						match(QUESTION);
						setState(895);
						guard_expr(0);
						setState(896);
						match(COLON);
						setState(897);
						guard_expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ArrayGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(899);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(900);
						match(LEFT_BRACKET);
						setState(901);
						guard_expr(0);
						setState(902);
						match(RIGHT_BRACKET);
						}
						break;
					case 6:
						{
						_localctx = new StopWatchGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(904);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(905);
						match(APOSTROPHE);
						}
						break;
					case 7:
						{
						_localctx = new GuardIncrementContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(906);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(907);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new GuardDecrementContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(908);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(909);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DotGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(910);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(911);
						match(LOOKUP_OP);
						setState(912);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new FuncGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(913);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(914);
						match(LEFT_PARENTHESIS);
						setState(915);
						guard_arguments();
						setState(916);
						match(RIGHT_PARENTHESIS);
						}
						break;
					}
					} 
				}
				setState(922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class Guard_argumentsContext extends ParserRuleContext {
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
		public Guard_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuard_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuard_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuard_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_argumentsContext guard_arguments() throws RecognitionException {
		Guard_argumentsContext _localctx = new Guard_argumentsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_guard_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAT) | (1L << POINT) | (1L << LEFT_PARENTHESIS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INCREMENT - 70)) | (1L << (DECREMENT - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (EXCLAMATION - 70)) | (1L << (NOT - 70)) | (1L << (FORALL - 70)) | (1L << (EXISTS - 70)) | (1L << (SUM - 70)) | (1L << (TRUE - 70)) | (1L << (FALSE - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(923);
				guard_expr(0);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(924);
					match(COMMA);
					setState(925);
					guard_expr(0);
					}
					}
					setState(930);
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

	public static class Guard_typeContext extends ParserRuleContext {
		public Guard_typeIdContext guard_typeId() {
			return getRuleContext(Guard_typeIdContext.class,0);
		}
		public TerminalNode META() { return getToken(UppaalParser.META, 0); }
		public TerminalNode CONST() { return getToken(UppaalParser.CONST, 0); }
		public Guard_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuard_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuard_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuard_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_typeContext guard_type() throws RecognitionException {
		Guard_typeContext _localctx = new Guard_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_guard_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==META || _la==CONST) {
				{
				setState(933);
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

			setState(936);
			guard_typeId();
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

	public static class Guard_typeIdContext extends ParserRuleContext {
		public Guard_typeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_typeId; }
	 
		public Guard_typeIdContext() { }
		public void copyFrom(Guard_typeIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GuardTypeIntDomainContext extends Guard_typeIdContext {
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
		public GuardTypeIntDomainContext(Guard_typeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardTypeIntDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardTypeIntDomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardTypeIntDomain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuardTypeScalarContext extends Guard_typeIdContext {
		public TerminalNode SCALAR() { return getToken(UppaalParser.SCALAR, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public GuardTypeScalarContext(Guard_typeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardTypeScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardTypeScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardTypeScalar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuardTypeIntContext extends Guard_typeIdContext {
		public TerminalNode INT() { return getToken(UppaalParser.INT, 0); }
		public GuardTypeIntContext(Guard_typeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_typeIdContext guard_typeId() throws RecognitionException {
		Guard_typeIdContext _localctx = new Guard_typeIdContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_guard_typeId);
		try {
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				_localctx = new GuardTypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				match(INT);
				}
				break;
			case 2:
				_localctx = new GuardTypeIntDomainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				match(INT);
				setState(940);
				match(LEFT_BRACKET);
				setState(941);
				guard_expr(0);
				setState(942);
				match(COMMA);
				setState(943);
				guard_expr(0);
				setState(944);
				match(RIGHT_BRACKET);
				}
				break;
			case 3:
				_localctx = new GuardTypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(946);
				match(SCALAR);
				setState(947);
				match(LEFT_BRACKET);
				setState(948);
				guard_expr(0);
				setState(949);
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
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
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
		enterRule(_localctx, 96, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(OPEN);
			setState(954);
			match(SOURCE);
			setState(955);
			match(REF);
			setState(956);
			match(EQUALS);
			setState(957);
			match(STRING);
			setState(958);
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
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
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
		enterRule(_localctx, 98, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(OPEN);
			setState(961);
			match(TARGET);
			setState(962);
			match(REF);
			setState(963);
			match(EQUALS);
			setState(964);
			match(STRING);
			setState(965);
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

	public static class NailContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public TerminalNode NAIL() { return getToken(UppaalParser.NAIL, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public NailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterNail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitNail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitNail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NailContext nail() throws RecognitionException {
		NailContext _localctx = new NailContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_nail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(OPEN);
			setState(968);
			match(NAIL);
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(969);
				coordinate();
				}
			}

			setState(972);
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

	public static class SystemContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> SYSTEM() { return getTokens(UppaalParser.SYSTEM); }
		public TerminalNode SYSTEM(int i) {
			return getToken(UppaalParser.SYSTEM, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public SystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitSystem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitSystem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemContext system() throws RecognitionException {
		SystemContext _localctx = new SystemContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_system);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(OPEN);
			setState(975);
			match(SYSTEM);
			setState(976);
			match(CLOSE);
			setState(977);
			anything();
			setState(978);
			match(OPEN_SLASH);
			setState(979);
			match(SYSTEM);
			setState(980);
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

	public static class QueriesContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> QUERIES() { return getTokens(UppaalParser.QUERIES); }
		public TerminalNode QUERIES(int i) {
			return getToken(UppaalParser.QUERIES, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public QueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueriesContext queries() throws RecognitionException {
		QueriesContext _localctx = new QueriesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_queries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(OPEN);
			setState(983);
			match(QUERIES);
			setState(984);
			match(CLOSE);
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(985);
				misc();
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(991);
				query();
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(992);
					misc();
					}
					}
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1003);
			match(OPEN_SLASH);
			setState(1004);
			match(QUERIES);
			setState(1005);
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> QUERY() { return getTokens(UppaalParser.QUERY); }
		public TerminalNode QUERY(int i) {
			return getToken(UppaalParser.QUERY, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(OPEN);
			setState(1008);
			match(QUERY);
			setState(1009);
			match(CLOSE);
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(1010);
				misc();
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1016);
				formula();
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1017);
					misc();
					}
					}
					setState(1022);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(1025);
				comment();
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1026);
					misc();
					}
					}
					setState(1031);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1034);
			match(OPEN_SLASH);
			setState(1035);
			match(QUERY);
			setState(1036);
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

	public static class FormulaContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> FORMULA() { return getTokens(UppaalParser.FORMULA); }
		public TerminalNode FORMULA(int i) {
			return getToken(UppaalParser.FORMULA, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(OPEN);
			setState(1039);
			match(FORMULA);
			setState(1040);
			match(CLOSE);
			setState(1041);
			anything();
			setState(1042);
			match(OPEN_SLASH);
			setState(1043);
			match(FORMULA);
			setState(1044);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> QUERY_COMMENT() { return getTokens(UppaalParser.QUERY_COMMENT); }
		public TerminalNode QUERY_COMMENT(int i) {
			return getToken(UppaalParser.QUERY_COMMENT, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(OPEN);
			setState(1047);
			match(QUERY_COMMENT);
			setState(1048);
			match(CLOSE);
			setState(1049);
			anything();
			setState(1050);
			match(OPEN_SLASH);
			setState(1051);
			match(QUERY_COMMENT);
			setState(1052);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 44:
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
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0083\u0421\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\5\2t\n\2\3\2\7\2w\n"+
		"\2\f\2\16\2z\13\2\3\2\3\2\7\2~\n\2\f\2\16\2\u0081\13\2\3\3\3\3\7\3\u0085"+
		"\n\3\f\3\16\3\u0088\13\3\3\3\3\3\3\4\5\4\u008d\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u0094\n\4\3\4\5\4\u0097\n\4\7\4\u0099\n\4\f\4\16\4\u009c\13\4\3\5"+
		"\3\5\3\5\7\5\u00a1\n\5\f\5\16\5\u00a4\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5\u00af\n\5\f\5\16\5\u00b2\13\5\3\5\5\5\u00b5\n\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00c5\n\n\f\n\16\n"+
		"\u00c8\13\n\3\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3\n\3\n\7\n\u00d3"+
		"\n\n\f\n\16\n\u00d6\13\n\6\n\u00d8\n\n\r\n\16\n\u00d9\3\n\3\n\7\n\u00de"+
		"\n\n\f\n\16\n\u00e1\13\n\3\n\3\n\7\n\u00e5\n\n\f\n\16\n\u00e8\13\n\5\n"+
		"\u00ea\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00f7\n"+
		"\f\f\f\16\f\u00fa\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u014c"+
		"\n\r\3\16\3\16\3\16\3\16\7\16\u0152\n\16\f\16\16\16\u0155\13\16\3\16\3"+
		"\16\3\17\5\17\u015a\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0176\n\21\f\21\16\21\u0179\13\21\3\21\3\21\5\21"+
		"\u017d\n\21\3\22\3\22\3\22\7\22\u0182\n\22\f\22\16\22\u0185\13\22\3\22"+
		"\3\22\3\22\7\22\u018a\n\22\f\22\16\22\u018d\13\22\7\22\u018f\n\22\f\22"+
		"\16\22\u0192\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u019e\n\23\3\24\3\24\7\24\u01a2\n\24\f\24\16\24\u01a5\13\24\3\24\3"+
		"\24\5\24\u01a9\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u01b0\n\25\f\25\16\25"+
		"\u01b3\13\25\3\25\3\25\5\25\u01b7\n\25\3\26\3\26\3\26\3\26\7\26\u01bd"+
		"\n\26\f\26\16\26\u01c0\13\26\3\26\3\26\3\26\7\26\u01c5\n\26\f\26\16\26"+
		"\u01c8\13\26\7\26\u01ca\n\26\f\26\16\26\u01cd\13\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u01db\n\30\f\30\16\30\u01de"+
		"\13\30\5\30\u01e0\n\30\3\31\3\31\5\31\u01e4\n\31\3\31\3\31\7\31\u01e8"+
		"\n\31\f\31\16\31\u01eb\13\31\3\32\3\32\3\32\7\32\u01f0\n\32\f\32\16\32"+
		"\u01f3\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u0202\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 "+
		"\u022b\n \3!\3!\5!\u022f\n!\3!\3!\3\"\5\"\u0234\n\"\3\"\3\"\3\"\3\"\5"+
		"\"\u023a\n\"\3\"\5\"\u023d\n\"\7\"\u023f\n\"\f\"\16\"\u0242\13\"\3#\3"+
		"#\3#\3#\7#\u0248\n#\f#\16#\u024b\13#\3#\3#\3#\3#\3#\3$\3$\7$\u0254\n$"+
		"\f$\16$\u0257\13$\5$\u0259\n$\3$\3$\7$\u025d\n$\f$\16$\u0260\13$\5$\u0262"+
		"\n$\3$\3$\7$\u0266\n$\f$\16$\u0269\13$\5$\u026b\n$\3$\3$\7$\u026f\n$\f"+
		"$\16$\u0272\13$\3$\3$\7$\u0276\n$\f$\16$\u0279\13$\6$\u027b\n$\r$\16$"+
		"\u027c\3$\3$\7$\u0281\n$\f$\16$\u0284\13$\3$\3$\7$\u0288\n$\f$\16$\u028b"+
		"\13$\7$\u028d\n$\f$\16$\u0290\13$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u02aa\n(\3(\3(\7(\u02ae"+
		"\n(\f(\16(\u02b1\13(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\5)\u02bd\n)\3)\3)\7"+
		")\u02c1\n)\f)\16)\u02c4\13)\3)\3)\7)\u02c8\n)\f)\16)\u02cb\13)\5)\u02cd"+
		"\n)\3)\3)\7)\u02d1\n)\f)\16)\u02d4\13)\7)\u02d6\n)\f)\16)\u02d9\13)\3"+
		")\3)\3)\3)\7)\u02df\n)\f)\16)\u02e2\13)\5)\u02e4\n)\3)\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3*\5*\u02f0\n*\3*\3*\3*\3*\3*\3*\3+\3+\3+\5+\u02fb\n+\3+\3+"+
		"\3+\3+\3+\3+\3,\3,\3,\3,\7,\u0307\n,\f,\16,\u030a\13,\3,\3,\7,\u030e\n"+
		",\f,\16,\u0311\13,\3,\3,\7,\u0315\n,\f,\16,\u0318\13,\3,\3,\7,\u031c\n"+
		",\f,\16,\u031f\13,\7,\u0321\n,\f,\16,\u0324\13,\3,\3,\7,\u0328\n,\f,\16"+
		",\u032b\13,\7,\u032d\n,\f,\16,\u0330\13,\3,\3,\3,\3,\3-\3-\5-\u0338\n"+
		"-\3-\3-\3-\3-\3-\3-\3-\5-\u0341\n-\3-\3-\3-\3-\3-\3-\5-\u0349\n-\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0373\n.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0399\n.\f.\16.\u039c\13.\3/\3/\3/\7/"+
		"\u03a1\n/\f/\16/\u03a4\13/\5/\u03a6\n/\3\60\5\60\u03a9\n\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u03ba\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\5\64\u03cd\n\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u03dd\n\66\f\66\16\66\u03e0"+
		"\13\66\3\66\3\66\7\66\u03e4\n\66\f\66\16\66\u03e7\13\66\7\66\u03e9\n\66"+
		"\f\66\16\66\u03ec\13\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u03f6"+
		"\n\67\f\67\16\67\u03f9\13\67\3\67\3\67\7\67\u03fd\n\67\f\67\16\67\u0400"+
		"\13\67\5\67\u0402\n\67\3\67\3\67\7\67\u0406\n\67\f\67\16\67\u0409\13\67"+
		"\5\67\u040b\n\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39"+
		"\39\39\39\39\39\39\2\3Z:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\f\3\2\6\7\4\2\b\b\17\17"+
		"\5\2\3\3\b\b\60\60\3\2JU\3\2VY\3\2Z_\4\2VW`n\3\2ux\3\2\34\35\3\2wx\2\u0487"+
		"\2s\3\2\2\2\4\u0082\3\2\2\2\6\u008c\3\2\2\2\b\u00b4\3\2\2\2\n\u00b6\3"+
		"\2\2\2\f\u00b8\3\2\2\2\16\u00bc\3\2\2\2\20\u00be\3\2\2\2\22\u00c0\3\2"+
		"\2\2\24\u00ef\3\2\2\2\26\u00f8\3\2\2\2\30\u014b\3\2\2\2\32\u014d\3\2\2"+
		"\2\34\u0159\3\2\2\2\36\u015d\3\2\2\2 \u017c\3\2\2\2\"\u017e\3\2\2\2$\u019d"+
		"\3\2\2\2&\u019f\3\2\2\2(\u01b6\3\2\2\2*\u01b8\3\2\2\2,\u01d0\3\2\2\2."+
		"\u01df\3\2\2\2\60\u01e1\3\2\2\2\62\u01ec\3\2\2\2\64\u0201\3\2\2\2\66\u0203"+
		"\3\2\2\28\u020d\3\2\2\2:\u0215\3\2\2\2<\u021b\3\2\2\2>\u0223\3\2\2\2@"+
		"\u022c\3\2\2\2B\u0233\3\2\2\2D\u0243\3\2\2\2F\u0258\3\2\2\2H\u0291\3\2"+
		"\2\2J\u0295\3\2\2\2L\u029c\3\2\2\2N\u02a3\3\2\2\2P\u02b6\3\2\2\2R\u02e9"+
		"\3\2\2\2T\u02f7\3\2\2\2V\u0302\3\2\2\2X\u0348\3\2\2\2Z\u0372\3\2\2\2\\"+
		"\u03a5\3\2\2\2^\u03a8\3\2\2\2`\u03b9\3\2\2\2b\u03bb\3\2\2\2d\u03c2\3\2"+
		"\2\2f\u03c9\3\2\2\2h\u03d0\3\2\2\2j\u03d8\3\2\2\2l\u03f1\3\2\2\2n\u0410"+
		"\3\2\2\2p\u0418\3\2\2\2rt\5\4\3\2sr\3\2\2\2st\3\2\2\2tx\3\2\2\2uw\5\20"+
		"\t\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{\177"+
		"\5\22\n\2|~\5\20\t\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\3\3\2\2\2\u0081\177\3\2\2\2\u0082\u0086\7\16\2\2\u0083\u0085"+
		"\5\f\7\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7*"+
		"\2\2\u008a\5\3\2\2\2\u008b\u008d\5\16\b\2\u008c\u008b\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u009a\3\2\2\2\u008e\u0094\5\b\5\2\u008f\u0094\5\n\6\2\u0090"+
		"\u0094\7\4\2\2\u0091\u0094\7\60\2\2\u0092\u0094\7\3\2\2\u0093\u008e\3"+
		"\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097\5\16\b\2\u0096\u0095\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0093\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\7\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009d\u009e\7\f\2\2\u009e\u00a2\7.\2\2\u009f\u00a1"+
		"\5\f\7\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7)"+
		"\2\2\u00a6\u00a7\5\6\4\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\7.\2\2\u00a9"+
		"\u00aa\7)\2\2\u00aa\u00b5\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac\u00b0\7.\2"+
		"\2\u00ad\u00af\5\f\7\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\7+\2\2\u00b4\u009d\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b5\t\3\2\2\2"+
		"\u00b6\u00b7\t\2\2\2\u00b7\13\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9\u00ba\7"+
		",\2\2\u00ba\u00bb\7-\2\2\u00bb\r\3\2\2\2\u00bc\u00bd\t\3\2\2\u00bd\17"+
		"\3\2\2\2\u00be\u00bf\t\4\2\2\u00bf\21\3\2\2\2\u00c0\u00c1\7\f\2\2\u00c1"+
		"\u00c2\7\20\2\2\u00c2\u00c6\7)\2\2\u00c3\u00c5\5\20\t\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cd\5\24\13\2\u00ca\u00cc\5"+
		"\20\t\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d7\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d4\5D"+
		"#\2\u00d1\u00d3\5\20\t\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d0\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\5h\65\2\u00dc\u00de\5\20"+
		"\t\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e9\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e6\5j"+
		"\66\2\u00e3\u00e5\5\20\t\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\7\r\2\2\u00ec\u00ed\7\20\2\2\u00ed\u00ee\7)\2\2\u00ee\23\3\2\2"+
		"\2\u00ef\u00f0\7\n\2\2\u00f0\u00f1\5\26\f\2\u00f1\u00f2\7\64\2\2\u00f2"+
		"\25\3\2\2\2\u00f3\u00f7\5\32\16\2\u00f4\u00f7\5*\26\2\u00f5\u00f7\5,\27"+
		"\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\27\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u014c\7\u0083\2\2\u00fc\u014c\7\67\2\2\u00fd\u014c"+
		"\78\2\2\u00fe\u00ff\5Z.\2\u00ff\u0100\7B\2\2\u0100\u0101\5Z.\2\u0101\u0102"+
		"\7C\2\2\u0102\u014c\3\2\2\2\u0103\u0104\5Z.\2\u0104\u0105\7?\2\2\u0105"+
		"\u014c\3\2\2\2\u0106\u0107\7@\2\2\u0107\u0108\5Z.\2\u0108\u0109\7A\2\2"+
		"\u0109\u014c\3\2\2\2\u010a\u010b\5Z.\2\u010b\u010c\7H\2\2\u010c\u014c"+
		"\3\2\2\2\u010d\u010e\7H\2\2\u010e\u014c\5Z.\2\u010f\u0110\5Z.\2\u0110"+
		"\u0111\7I\2\2\u0111\u014c\3\2\2\2\u0112\u0113\7I\2\2\u0113\u014c\5Z.\2"+
		"\u0114\u0115\5Z.\2\u0115\u0116\t\5\2\2\u0116\u0117\5Z.\2\u0117\u014c\3"+
		"\2\2\2\u0118\u0119\t\6\2\2\u0119\u014c\5Z.\2\u011a\u011b\5Z.\2\u011b\u011c"+
		"\t\7\2\2\u011c\u011d\5Z.\2\u011d\u014c\3\2\2\2\u011e\u011f\5Z.\2\u011f"+
		"\u0120\t\b\2\2\u0120\u0121\5Z.\2\u0121\u014c\3\2\2\2\u0122\u0123\5Z.\2"+
		"\u0123\u0124\7o\2\2\u0124\u0125\5Z.\2\u0125\u0126\7p\2\2\u0126\u0127\5"+
		"Z.\2\u0127\u014c\3\2\2\2\u0128\u0129\5Z.\2\u0129\u012a\7q\2\2\u012a\u012b"+
		"\7\u0083\2\2\u012b\u014c\3\2\2\2\u012c\u012d\5Z.\2\u012d\u012e\7@\2\2"+
		"\u012e\u012f\5\\/\2\u012f\u0130\7A\2\2\u0130\u014c\3\2\2\2\u0131\u0132"+
		"\7r\2\2\u0132\u0133\7@\2\2\u0133\u0134\7\u0083\2\2\u0134\u0135\7p\2\2"+
		"\u0135\u0136\5\34\17\2\u0136\u0137\7A\2\2\u0137\u0138\5Z.\2\u0138\u014c"+
		"\3\2\2\2\u0139\u013a\7s\2\2\u013a\u013b\7@\2\2\u013b\u013c\7\u0083\2\2"+
		"\u013c\u013d\7p\2\2\u013d\u013e\5\34\17\2\u013e\u013f\7A\2\2\u013f\u0140"+
		"\5Z.\2\u0140\u014c\3\2\2\2\u0141\u0142\7t\2\2\u0142\u0143\7@\2\2\u0143"+
		"\u0144\7\u0083\2\2\u0144\u0145\7p\2\2\u0145\u0146\5\34\17\2\u0146\u0147"+
		"\7A\2\2\u0147\u0148\5Z.\2\u0148\u014c\3\2\2\2\u0149\u014c\7\u0081\2\2"+
		"\u014a\u014c\7\u0082\2\2\u014b\u00fb\3\2\2\2\u014b\u00fc\3\2\2\2\u014b"+
		"\u00fd\3\2\2\2\u014b\u00fe\3\2\2\2\u014b\u0103\3\2\2\2\u014b\u0106\3\2"+
		"\2\2\u014b\u010a\3\2\2\2\u014b\u010d\3\2\2\2\u014b\u010f\3\2\2\2\u014b"+
		"\u0112\3\2\2\2\u014b\u0114\3\2\2\2\u014b\u0118\3\2\2\2\u014b\u011a\3\2"+
		"\2\2\u014b\u011e\3\2\2\2\u014b\u0122\3\2\2\2\u014b\u0128\3\2\2\2\u014b"+
		"\u012c\3\2\2\2\u014b\u0131\3\2\2\2\u014b\u0139\3\2\2\2\u014b\u0141\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\31\3\2\2\2\u014d\u014e"+
		"\5\34\17\2\u014e\u0153\5&\24\2\u014f\u0150\7F\2\2\u0150\u0152\5&\24\2"+
		"\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7G\2\2\u0157"+
		"\33\3\2\2\2\u0158\u015a\5\36\20\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015c\5 \21\2\u015c\35\3\2\2\2\u015d\u015e"+
		"\t\t\2\2\u015e\37\3\2\2\2\u015f\u017d\7\u0083\2\2\u0160\u017d\7z\2\2\u0161"+
		"\u017d\7{\2\2\u0162\u017d\7|\2\2\u0163\u017d\7}\2\2\u0164\u017d\7~\2\2"+
		"\u0165\u0166\7z\2\2\u0166\u0167\7B\2\2\u0167\u0168\5\30\r\2\u0168\u0169"+
		"\7F\2\2\u0169\u016a\5\30\r\2\u016a\u016b\7C\2\2\u016b\u017d\3\2\2\2\u016c"+
		"\u016d\7\177\2\2\u016d\u016e\7B\2\2\u016e\u016f\5\30\r\2\u016f\u0170\7"+
		"C\2\2\u0170\u017d\3\2\2\2\u0171\u0172\7\u0080\2\2\u0172\u0173\7D\2\2\u0173"+
		"\u0177\5\"\22\2\u0174\u0176\5\"\22\2\u0175\u0174\3\2\2\2\u0176\u0179\3"+
		"\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017b\7E\2\2\u017b\u017d\3\2\2\2\u017c\u015f\3\2"+
		"\2\2\u017c\u0160\3\2\2\2\u017c\u0161\3\2\2\2\u017c\u0162\3\2\2\2\u017c"+
		"\u0163\3\2\2\2\u017c\u0164\3\2\2\2\u017c\u0165\3\2\2\2\u017c\u016c\3\2"+
		"\2\2\u017c\u0171\3\2\2\2\u017d!\3\2\2\2\u017e\u017f\5\34\17\2\u017f\u0183"+
		"\7\u0083\2\2\u0180\u0182\5$\23\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2"+
		"\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0190\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186\u0187\7F\2\2\u0187\u018b\7\u0083\2\2\u0188\u018a\5$\23"+
		"\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0186\3\2\2\2\u018f"+
		"\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7G\2\2\u0194#\3\2\2\2\u0195\u0196"+
		"\7B\2\2\u0196\u0197\5\30\r\2\u0197\u0198\7C\2\2\u0198\u019e\3\2\2\2\u0199"+
		"\u019a\7B\2\2\u019a\u019b\5\34\17\2\u019b\u019c\7C\2\2\u019c\u019e\3\2"+
		"\2\2\u019d\u0195\3\2\2\2\u019d\u0199\3\2\2\2\u019e%\3\2\2\2\u019f\u01a3"+
		"\7\u0083\2\2\u01a0\u01a2\5$\23\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a8\3\2\2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a6\u01a7\7J\2\2\u01a7\u01a9\5(\25\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\'\3\2\2\2\u01aa\u01b7\5\30\r\2\u01ab\u01ac\7D\2\2"+
		"\u01ac\u01b1\5(\25\2\u01ad\u01ae\7F\2\2\u01ae\u01b0\5(\25\2\u01af\u01ad"+
		"\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7E\2\2\u01b5\u01b7\3\2"+
		"\2\2\u01b6\u01aa\3\2\2\2\u01b6\u01ab\3\2\2\2\u01b7)\3\2\2\2\u01b8\u01b9"+
		"\7y\2\2\u01b9\u01ba\5\34\17\2\u01ba\u01be\7\u0083\2\2\u01bb\u01bd\5$\23"+
		"\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01cb\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7F\2\2\u01c2"+
		"\u01c6\7\u0083\2\2\u01c3\u01c5\5$\23\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01c1\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce"+
		"\u01cf\7G\2\2\u01cf+\3\2\2\2\u01d0\u01d1\5\34\17\2\u01d1\u01d2\7\u0083"+
		"\2\2\u01d2\u01d3\7@\2\2\u01d3\u01d4\5.\30\2\u01d4\u01d5\7A\2\2\u01d5\u01d6"+
		"\5\62\32\2\u01d6-\3\2\2\2\u01d7\u01dc\5\60\31\2\u01d8\u01d9\7F\2\2\u01d9"+
		"\u01db\5\60\31\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01d7\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0/\3\2\2\2\u01e1\u01e3\5\34\17"+
		"\2\u01e2\u01e4\7c\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e9\7\u0083\2\2\u01e6\u01e8\5$\23\2\u01e7\u01e6\3\2\2"+
		"\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\61"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7D\2\2\u01ed\u01f1\5\26\f\2\u01ee"+
		"\u01f0\5\64\33\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3"+
		"\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f5\7E\2\2\u01f5\63\3\2\2\2\u01f6\u0202\5\62\32\2\u01f7\u0202\7G\2"+
		"\2\u01f8\u01f9\5\30\r\2\u01f9\u01fa\7G\2\2\u01fa\u0202\3\2\2\2\u01fb\u0202"+
		"\5\66\34\2\u01fc\u0202\58\35\2\u01fd\u0202\5:\36\2\u01fe\u0202\5<\37\2"+
		"\u01ff\u0202\5> \2\u0200\u0202\5@!\2\u0201\u01f6\3\2\2\2\u0201\u01f7\3"+
		"\2\2\2\u0201\u01f8\3\2\2\2\u0201\u01fb\3\2\2\2\u0201\u01fc\3\2\2\2\u0201"+
		"\u01fd\3\2\2\2\u0201\u01fe\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2"+
		"\2\2\u0202\65\3\2\2\2\u0203\u0204\79\2\2\u0204\u0205\7@\2\2\u0205\u0206"+
		"\5\30\r\2\u0206\u0207\7G\2\2\u0207\u0208\5\30\r\2\u0208\u0209\7G\2\2\u0209"+
		"\u020a\5\30\r\2\u020a\u020b\7A\2\2\u020b\u020c\5\64\33\2\u020c\67\3\2"+
		"\2\2\u020d\u020e\79\2\2\u020e\u020f\7@\2\2\u020f\u0210\7\u0083\2\2\u0210"+
		"\u0211\7p\2\2\u0211\u0212\5\34\17\2\u0212\u0213\7A\2\2\u0213\u0214\5\64"+
		"\33\2\u02149\3\2\2\2\u0215\u0216\7:\2\2\u0216\u0217\7@\2\2\u0217\u0218"+
		"\5\30\r\2\u0218\u0219\7A\2\2\u0219\u021a\5\64\33\2\u021a;\3\2\2\2\u021b"+
		"\u021c\7;\2\2\u021c\u021d\5\64\33\2\u021d\u021e\7:\2\2\u021e\u021f\7@"+
		"\2\2\u021f\u0220\5\30\r\2\u0220\u0221\7A\2\2\u0221\u0222\7G\2\2\u0222"+
		"=\3\2\2\2\u0223\u0224\7<\2\2\u0224\u0225\7@\2\2\u0225\u0226\5\30\r\2\u0226"+
		"\u0227\7A\2\2\u0227\u022a\5\64\33\2\u0228\u0229\7=\2\2\u0229\u022b\5\64"+
		"\33\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b?\3\2\2\2\u022c\u022e"+
		"\7>\2\2\u022d\u022f\5\30\r\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u0231\7G\2\2\u0231A\3\2\2\2\u0232\u0234\5\16\b\2"+
		"\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0240\3\2\2\2\u0235\u023a"+
		"\5\n\6\2\u0236\u023a\7\4\2\2\u0237\u023a\7\60\2\2\u0238\u023a\7\3\2\2"+
		"\u0239\u0235\3\2\2\2\u0239\u0236\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u0238"+
		"\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u023d\5\16\b\2\u023c\u023b\3\2\2\2"+
		"\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u0239\3\2\2\2\u023f\u0242"+
		"\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241C\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243\u0244\7\f\2\2\u0244\u0245\7\22\2\2\u0245\u0249\7"+
		")\2\2\u0246\u0248\5\20\t\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024c\u024d\5F$\2\u024d\u024e\7\r\2\2\u024e\u024f\7\22\2\2\u024f"+
		"\u0250\7)\2\2\u0250E\3\2\2\2\u0251\u0255\5T+\2\u0252\u0254\5\20\t\2\u0253"+
		"\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0251\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u0261\3\2\2\2\u025a\u025e\5H%\2\u025b\u025d\5\20"+
		"\t\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u025a\3\2"+
		"\2\2\u0261\u0262\3\2\2\2\u0262\u026a\3\2\2\2\u0263\u0267\5\24\13\2\u0264"+
		"\u0266\5\20\t\2\u0265\u0264\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3"+
		"\2\2\2\u0267\u0268\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u026a"+
		"\u0263\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u027a\3\2\2\2\u026c\u0270\5P"+
		")\2\u026d\u026f\5\20\t\2\u026e\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270"+
		"\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u027b\3\2\2\2\u0272\u0270\3\2"+
		"\2\2\u0273\u0277\5N(\2\u0274\u0276\5\20\t\2\u0275\u0274\3\2\2\2\u0276"+
		"\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027b\3\2"+
		"\2\2\u0279\u0277\3\2\2\2\u027a\u026c\3\2\2\2\u027a\u0273\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027e\u0282\5L\'\2\u027f\u0281\5\20\t\2\u0280\u027f\3\2\2\2\u0281"+
		"\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u028e\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0285\u0289\5V,\2\u0286\u0288\5\20\t\2\u0287"+
		"\u0286\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u0285\3\2\2\2\u028d"+
		"\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028fG\3\2\2\2"+
		"\u0290\u028e\3\2\2\2\u0291\u0292\7\13\2\2\u0292\u0293\5.\30\2\u0293\u0294"+
		"\7\65\2\2\u0294I\3\2\2\2\u0295\u0296\7\32\2\2\u0296\u0297\7,\2\2\u0297"+
		"\u0298\7-\2\2\u0298\u0299\7\33\2\2\u0299\u029a\7,\2\2\u029a\u029b\7-\2"+
		"\2\u029bK\3\2\2\2\u029c\u029d\7\f\2\2\u029d\u029e\7\27\2\2\u029e\u029f"+
		"\7\30\2\2\u029f\u02a0\7,\2\2\u02a0\u02a1\7-\2\2\u02a1\u02a2\7+\2\2\u02a2"+
		"M\3\2\2\2\u02a3\u02a4\7\f\2\2\u02a4\u02a5\7\23\2\2\u02a5\u02a6\7\31\2"+
		"\2\u02a6\u02a7\7,\2\2\u02a7\u02a9\7-\2\2\u02a8\u02aa\5J&\2\u02a9\u02a8"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02af\7)\2\2\u02ac"+
		"\u02ae\5\20\t\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3"+
		"\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2"+
		"\u02b3\7\r\2\2\u02b3\u02b4\7\23\2\2\u02b4\u02b5\7)\2\2\u02b5O\3\2\2\2"+
		"\u02b6\u02b7\7\f\2\2\u02b7\u02b8\7\24\2\2\u02b8\u02b9\7\31\2\2\u02b9\u02ba"+
		"\7,\2\2\u02ba\u02bc\7-\2\2\u02bb\u02bd\5J&\2\u02bc\u02bb\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c2\7)\2\2\u02bf\u02c1\5\20"+
		"\t\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02cc\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c9\5T"+
		"+\2\u02c6\u02c8\5\20\t\2\u02c7\u02c6\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2"+
		"\2\2\u02cc\u02c5\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02d7\3\2\2\2\u02ce"+
		"\u02d2\5R*\2\u02cf\u02d1\5\20\t\2\u02d0\u02cf\3\2\2\2\u02d1\u02d4\3\2"+
		"\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d5\u02ce\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2"+
		"\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02e3\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da"+
		"\u02db\7\f\2\2\u02db\u02dc\t\n\2\2\u02dc\u02e0\7+\2\2\u02dd\u02df\5\20"+
		"\t\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02da\3\2"+
		"\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\7\r\2\2\u02e6"+
		"\u02e7\7\24\2\2\u02e7\u02e8\7)\2\2\u02e8Q\3\2\2\2\u02e9\u02ea\7\f\2\2"+
		"\u02ea\u02eb\7\36\2\2\u02eb\u02ec\7\37\2\2\u02ec\u02ed\7,\2\2\u02ed\u02ef"+
		"\7-\2\2\u02ee\u02f0\5J&\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f2\7)\2\2\u02f2\u02f3\5B\"\2\u02f3\u02f4\7\r\2"+
		"\2\u02f4\u02f5\7\36\2\2\u02f5\u02f6\7)\2\2\u02f6S\3\2\2\2\u02f7\u02f8"+
		"\7\f\2\2\u02f8\u02fa\7\25\2\2\u02f9\u02fb\5J&\2\u02fa\u02f9\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\7)\2\2\u02fd\u02fe\5B\""+
		"\2\u02fe\u02ff\7\r\2\2\u02ff\u0300\7\25\2\2\u0300\u0301\7)\2\2\u0301U"+
		"\3\2\2\2\u0302\u0303\7\f\2\2\u0303\u0304\7 \2\2\u0304\u0308\7)\2\2\u0305"+
		"\u0307\5\20\t\2\u0306\u0305\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3"+
		"\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308\3\2\2\2\u030b"+
		"\u030f\5b\62\2\u030c\u030e\5\20\t\2\u030d\u030c\3\2\2\2\u030e\u0311\3"+
		"\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0312\3\2\2\2\u0311"+
		"\u030f\3\2\2\2\u0312\u0316\5d\63\2\u0313\u0315\5\20\t\2\u0314\u0313\3"+
		"\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u0322\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031d\5X-\2\u031a\u031c\5\20"+
		"\t\2\u031b\u031a\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0319\3\2"+
		"\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"\u032e\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0329\5f\64\2\u0326\u0328\5\20"+
		"\t\2\u0327\u0326\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u0325\3\2"+
		"\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0331\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0332\7\r\2\2\u0332\u0333\7 "+
		"\2\2\u0333\u0334\7)\2\2\u0334W\3\2\2\2\u0335\u0337\7\t\2\2\u0336\u0338"+
		"\5Z.\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u0349\7\63\2\2\u033a\u033b\7\f\2\2\u033b\u033c\7\36\2\2\u033c\u033d\7"+
		"\37\2\2\u033d\u033e\7,\2\2\u033e\u0340\7-\2\2\u033f\u0341\5J&\2\u0340"+
		"\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\7)"+
		"\2\2\u0343\u0344\5B\"\2\u0344\u0345\7\r\2\2\u0345\u0346\7\36\2\2\u0346"+
		"\u0347\7)\2\2\u0347\u0349\3\2\2\2\u0348\u0335\3\2\2\2\u0348\u033a\3\2"+
		"\2\2\u0349Y\3\2\2\2\u034a\u034b\b.\1\2\u034b\u0373\7\u0083\2\2\u034c\u0373"+
		"\7\67\2\2\u034d\u0373\78\2\2\u034e\u034f\7@\2\2\u034f\u0350\5Z.\2\u0350"+
		"\u0351\7A\2\2\u0351\u0373\3\2\2\2\u0352\u0353\7H\2\2\u0353\u0373\5Z.\21"+
		"\u0354\u0355\7I\2\2\u0355\u0373\5Z.\17\u0356\u0357\t\6\2\2\u0357\u0373"+
		"\5Z.\r\u0358\u0359\7r\2\2\u0359\u035a\7@\2\2\u035a\u035b\7\u0083\2\2\u035b"+
		"\u035c\7p\2\2\u035c\u035d\5^\60\2\u035d\u035e\7A\2\2\u035e\u035f\5Z.\7"+
		"\u035f\u0373\3\2\2\2\u0360\u0361\7s\2\2\u0361\u0362\7@\2\2\u0362\u0363"+
		"\7\u0083\2\2\u0363\u0364\7p\2\2\u0364\u0365\5^\60\2\u0365\u0366\7A\2\2"+
		"\u0366\u0367\5Z.\6\u0367\u0373\3\2\2\2\u0368\u0369\7t\2\2\u0369\u036a"+
		"\7@\2\2\u036a\u036b\7\u0083\2\2\u036b\u036c\7p\2\2\u036c\u036d\5^\60\2"+
		"\u036d\u036e\7A\2\2\u036e\u036f\5Z.\5\u036f\u0373\3\2\2\2\u0370\u0373"+
		"\7\u0081\2\2\u0371\u0373\7\u0082\2\2\u0372\u034a\3\2\2\2\u0372\u034c\3"+
		"\2\2\2\u0372\u034d\3\2\2\2\u0372\u034e\3\2\2\2\u0372\u0352\3\2\2\2\u0372"+
		"\u0354\3\2\2\2\u0372\u0356\3\2\2\2\u0372\u0358\3\2\2\2\u0372\u0360\3\2"+
		"\2\2\u0372\u0368\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0371\3\2\2\2\u0373"+
		"\u039a\3\2\2\2\u0374\u0375\f\16\2\2\u0375\u0376\t\5\2\2\u0376\u0399\5"+
		"Z.\17\u0377\u0378\f\f\2\2\u0378\u0379\t\7\2\2\u0379\u037a\5Z.\r\u037a"+
		"\u037b\b.\1\2\u037b\u0399\3\2\2\2\u037c\u037d\f\13\2\2\u037d\u037e\t\b"+
		"\2\2\u037e\u0399\5Z.\f\u037f\u0380\f\n\2\2\u0380\u0381\7o\2\2\u0381\u0382"+
		"\5Z.\2\u0382\u0383\7p\2\2\u0383\u0384\5Z.\13\u0384\u0399\3\2\2\2\u0385"+
		"\u0386\f\25\2\2\u0386\u0387\7B\2\2\u0387\u0388\5Z.\2\u0388\u0389\7C\2"+
		"\2\u0389\u0399\3\2\2\2\u038a\u038b\f\24\2\2\u038b\u0399\7?\2\2\u038c\u038d"+
		"\f\22\2\2\u038d\u0399\7H\2\2\u038e\u038f\f\20\2\2\u038f\u0399\7I\2\2\u0390"+
		"\u0391\f\t\2\2\u0391\u0392\7q\2\2\u0392\u0399\7\u0083\2\2\u0393\u0394"+
		"\f\b\2\2\u0394\u0395\7@\2\2\u0395\u0396\5\\/\2\u0396\u0397\7A\2\2\u0397"+
		"\u0399\3\2\2\2\u0398\u0374\3\2\2\2\u0398\u0377\3\2\2\2\u0398\u037c\3\2"+
		"\2\2\u0398\u037f\3\2\2\2\u0398\u0385\3\2\2\2\u0398\u038a\3\2\2\2\u0398"+
		"\u038c\3\2\2\2\u0398\u038e\3\2\2\2\u0398\u0390\3\2\2\2\u0398\u0393\3\2"+
		"\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"[\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u03a2\5Z.\2\u039e\u039f\7F\2\2\u039f"+
		"\u03a1\5Z.\2\u03a0\u039e\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2"+
		"\2\u03a2\u03a3\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u039d"+
		"\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6]\3\2\2\2\u03a7\u03a9\t\13\2\2\u03a8"+
		"\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\5`"+
		"\61\2\u03ab_\3\2\2\2\u03ac\u03ba\7z\2\2\u03ad\u03ae\7z\2\2\u03ae\u03af"+
		"\7B\2\2\u03af\u03b0\5Z.\2\u03b0\u03b1\7F\2\2\u03b1\u03b2\5Z.\2\u03b2\u03b3"+
		"\7C\2\2\u03b3\u03ba\3\2\2\2\u03b4\u03b5\7\177\2\2\u03b5\u03b6\7B\2\2\u03b6"+
		"\u03b7\5Z.\2\u03b7\u03b8\7C\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03ac\3\2\2"+
		"\2\u03b9\u03ad\3\2\2\2\u03b9\u03b4\3\2\2\2\u03baa\3\2\2\2\u03bb\u03bc"+
		"\7\f\2\2\u03bc\u03bd\7!\2\2\u03bd\u03be\7\30\2\2\u03be\u03bf\7,\2\2\u03bf"+
		"\u03c0\7-\2\2\u03c0\u03c1\7+\2\2\u03c1c\3\2\2\2\u03c2\u03c3\7\f\2\2\u03c3"+
		"\u03c4\7\"\2\2\u03c4\u03c5\7\30\2\2\u03c5\u03c6\7,\2\2\u03c6\u03c7\7-"+
		"\2\2\u03c7\u03c8\7+\2\2\u03c8e\3\2\2\2\u03c9\u03ca\7\f\2\2\u03ca\u03cc"+
		"\7#\2\2\u03cb\u03cd\5J&\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03cf\7+\2\2\u03cfg\3\2\2\2\u03d0\u03d1\7\f\2\2\u03d1"+
		"\u03d2\7$\2\2\u03d2\u03d3\7)\2\2\u03d3\u03d4\5B\"\2\u03d4\u03d5\7\r\2"+
		"\2\u03d5\u03d6\7$\2\2\u03d6\u03d7\7)\2\2\u03d7i\3\2\2\2\u03d8\u03d9\7"+
		"\f\2\2\u03d9\u03da\7%\2\2\u03da\u03de\7)\2\2\u03db\u03dd\5\20\t\2\u03dc"+
		"\u03db\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2"+
		"\2\2\u03df\u03ea\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e5\5l\67\2\u03e2"+
		"\u03e4\5\20\t\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3"+
		"\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8"+
		"\u03e1\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2"+
		"\2\2\u03eb\u03ed\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03ee\7\r\2\2\u03ee"+
		"\u03ef\7%\2\2\u03ef\u03f0\7)\2\2\u03f0k\3\2\2\2\u03f1\u03f2\7\f\2\2\u03f2"+
		"\u03f3\7&\2\2\u03f3\u03f7\7)\2\2\u03f4\u03f6\5\20\t\2\u03f5\u03f4\3\2"+
		"\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8"+
		"\u0401\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fe\5n8\2\u03fb\u03fd\5\20"+
		"\t\2\u03fc\u03fb\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe"+
		"\u03ff\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u03fa\3\2"+
		"\2\2\u0401\u0402\3\2\2\2\u0402\u040a\3\2\2\2\u0403\u0407\5p9\2\u0404\u0406"+
		"\5\20\t\2\u0405\u0404\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2"+
		"\u0407\u0408\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u0403"+
		"\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\7\r\2\2\u040d"+
		"\u040e\7&\2\2\u040e\u040f\7)\2\2\u040fm\3\2\2\2\u0410\u0411\7\f\2\2\u0411"+
		"\u0412\7\'\2\2\u0412\u0413\7)\2\2\u0413\u0414\5B\"\2\u0414\u0415\7\r\2"+
		"\2\u0415\u0416\7\'\2\2\u0416\u0417\7)\2\2\u0417o\3\2\2\2\u0418\u0419\7"+
		"\f\2\2\u0419\u041a\7(\2\2\u041a\u041b\7)\2\2\u041b\u041c\5B\"\2\u041c"+
		"\u041d\7\r\2\2\u041d\u041e\7(\2\2\u041e\u041f\7)\2\2\u041fq\3\2\2\2fs"+
		"x\177\u0086\u008c\u0093\u0096\u009a\u00a2\u00b0\u00b4\u00c6\u00cd\u00d4"+
		"\u00d9\u00df\u00e6\u00e9\u00f6\u00f8\u014b\u0153\u0159\u0177\u017c\u0183"+
		"\u018b\u0190\u019d\u01a3\u01a8\u01b1\u01b6\u01be\u01c6\u01cb\u01dc\u01df"+
		"\u01e3\u01e9\u01f1\u0201\u022a\u022e\u0233\u0239\u023c\u0240\u0249\u0255"+
		"\u0258\u025e\u0261\u0267\u026a\u0270\u0277\u027a\u027c\u0282\u0289\u028e"+
		"\u02a9\u02af\u02bc\u02c2\u02c9\u02cc\u02d2\u02d7\u02e0\u02e3\u02ef\u02fa"+
		"\u0308\u030f\u0316\u031d\u0322\u0329\u032e\u0337\u0340\u0348\u0372\u0398"+
		"\u039a\u03a2\u03a5\u03a8\u03b9\u03cc\u03de\u03e5\u03ea\u03f7\u03fe\u0401"+
		"\u0407\u040a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}