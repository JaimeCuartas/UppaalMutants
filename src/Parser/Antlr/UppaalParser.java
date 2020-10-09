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
		IF=58, ELSE=59, RETURN=60, PRIORITY=61, DEFAULT=62, APOSTROPHE=63, LEFT_PARENTHESIS=64, 
		RIGHT_PARENTHESIS=65, LEFT_BRACKET=66, RIGHT_BRACKET=67, LEFT_BRACE=68, 
		RIGHT_BRACE=69, COMMA=70, SEMICOLON=71, INCREMENT=72, DECREMENT=73, ASSIGN=74, 
		ASSIGN_COLON=75, ASSIGN_ADD=76, ASSIGN_SUB=77, ASSIGN_MUL=78, ASSIGN_DIV=79, 
		ASSIGN_PERCENT=80, ASSIGN_OR=81, ASSIGN_AND=82, ASSIGN_XOR=83, ASSIGN_LSHIFT=84, 
		ASSIGN_RSHIFT=85, ADD=86, SUB=87, EXCLAMATION=88, NOT=89, LESS=90, LESSEQ=91, 
		COMPARE=92, DIFFERENT=93, GREATEREQ=94, GREATER=95, MUL=96, DIV=97, PERCENT=98, 
		BITAND=99, BITOR=100, BITXOR=101, LSHIFT=102, RSHIFT=103, AND_SYMBOL=104, 
		OR_SYMBOL=105, MINIMUM=106, MAXIMUM=107, OR=108, AND=109, IMPLY=110, QUESTION=111, 
		COLON=112, LOOKUP_OP=113, FORALL=114, EXISTS=115, SUM=116, URGENT=117, 
		BROADCAST=118, META=119, CONST=120, TYPEDEF=121, INT=122, DOUBLE=123, 
		CLOCK=124, CHAN=125, BOOL=126, SCALAR=127, STRUCT=128, TRUE=129, FALSE=130, 
		IDENTIFIER=131;
	public static final int
		RULE_model = 0, RULE_prolog = 1, RULE_content = 2, RULE_element = 3, RULE_reference = 4, 
		RULE_attribute = 5, RULE_chardata = 6, RULE_misc = 7, RULE_nta = 8, RULE_declaration = 9, 
		RULE_decl_content = 10, RULE_declarations = 11, RULE_expr = 12, RULE_variableDecl = 13, 
		RULE_type = 14, RULE_prefix = 15, RULE_typeId = 16, RULE_fieldDecl = 17, 
		RULE_varFieldDecl = 18, RULE_arrayDecl = 19, RULE_variableID = 20, RULE_initialiser = 21, 
		RULE_typeDecl = 22, RULE_function = 23, RULE_funcParameters = 24, RULE_funcParameter = 25, 
		RULE_block = 26, RULE_statement = 27, RULE_forLoop = 28, RULE_iteration = 29, 
		RULE_whileLoop = 30, RULE_doWhile = 31, RULE_ifStatement = 32, RULE_returnStatement = 33, 
		RULE_chanPriority = 34, RULE_chanOrDef = 35, RULE_chanSeparator = 36, 
		RULE_chanExpr = 37, RULE_anything = 38, RULE_template = 39, RULE_temp_content = 40, 
		RULE_parameter = 41, RULE_coordinate = 42, RULE_init_loc = 43, RULE_branchpoint = 44, 
		RULE_location = 45, RULE_label_loc = 46, RULE_name = 47, RULE_transition = 48, 
		RULE_label_trans = 49, RULE_guard_expr = 50, RULE_guard_arguments = 51, 
		RULE_guard_type = 52, RULE_guard_typeId = 53, RULE_source = 54, RULE_target = 55, 
		RULE_nail = 56, RULE_system = 57, RULE_queries = 58, RULE_query = 59, 
		RULE_formula = 60, RULE_comment = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "prolog", "content", "element", "reference", "attribute", "chardata", 
			"misc", "nta", "declaration", "decl_content", "declarations", "expr", 
			"variableDecl", "type", "prefix", "typeId", "fieldDecl", "varFieldDecl", 
			"arrayDecl", "variableID", "initialiser", "typeDecl", "function", "funcParameters", 
			"funcParameter", "block", "statement", "forLoop", "iteration", "whileLoop", 
			"doWhile", "ifStatement", "returnStatement", "chanPriority", "chanOrDef", 
			"chanSeparator", "chanExpr", "anything", "template", "temp_content", 
			"parameter", "coordinate", "init_loc", "branchpoint", "location", "label_loc", 
			"name", "transition", "label_trans", "guard_expr", "guard_arguments", 
			"guard_type", "guard_typeId", "source", "target", "nail", "system", "queries", 
			"query", "formula", "comment"
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
			"'if'", "'else'", "'return'", "'priority'", "'default'", "'''", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "','", "';'", "'++'", "'--'", null, 
			"':='", "'+='", "'-='", "'*='", "'/='", "'%='", "'|='", "'&amp;='", "'^='", 
			"'&lt;&lt;='", "'&gt;&gt;='", "'+'", "'-'", "'!'", "'not'", "'&lt;'", 
			"'&lt;='", "'=='", "'!='", "'&gt;='", "'&gt;'", "'*'", "'/'", "'%'", 
			"'&amp;'", "'|'", "'^'", "'&lt;&lt;'", "'&gt;&gt;'", "'&amp;&amp;'", 
			"'||'", "'&lt;?'", "'&gt;?'", "'or'", "'and'", "'imply'", "'?'", "':'", 
			"'.'", "'forall'", "'exists'", "'sum'", null, "'broadcast'", "'meta'", 
			"'const'", "'typedef'", "'int'", "'double'", "'clock'", "'chan'", "'bool'", 
			"'scalar'", "'struct'", "'true'", "'false'"
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
			"PRIORITY", "DEFAULT", "APOSTROPHE", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "COMMA", 
			"SEMICOLON", "INCREMENT", "DECREMENT", "ASSIGN", "ASSIGN_COLON", "ASSIGN_ADD", 
			"ASSIGN_SUB", "ASSIGN_MUL", "ASSIGN_DIV", "ASSIGN_PERCENT", "ASSIGN_OR", 
			"ASSIGN_AND", "ASSIGN_XOR", "ASSIGN_LSHIFT", "ASSIGN_RSHIFT", "ADD", 
			"SUB", "EXCLAMATION", "NOT", "LESS", "LESSEQ", "COMPARE", "DIFFERENT", 
			"GREATEREQ", "GREATER", "MUL", "DIV", "PERCENT", "BITAND", "BITOR", "BITXOR", 
			"LSHIFT", "RSHIFT", "AND_SYMBOL", "OR_SYMBOL", "MINIMUM", "MAXIMUM", 
			"OR", "AND", "IMPLY", "QUESTION", "COLON", "LOOKUP_OP", "FORALL", "EXISTS", 
			"SUM", "URGENT", "BROADCAST", "META", "CONST", "TYPEDEF", "INT", "DOUBLE", 
			"CLOCK", "CHAN", "BOOL", "SCALAR", "STRUCT", "TRUE", "FALSE", "IDENTIFIER"
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(124);
				prolog();
				}
			}

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
			setState(133);
			nta();
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
			setState(140);
			match(XMLDeclOpen);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(141);
				attribute();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
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
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(149);
				chardata();
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << OPEN) | (1L << PI))) != 0)) {
				{
				{
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN:
					{
					setState(152);
					element();
					}
					break;
				case EntityRef:
				case CharRef:
					{
					setState(153);
					reference();
					}
					break;
				case CDATA:
					{
					setState(154);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(155);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(156);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(159);
					chardata();
					}
				}

				}
				}
				setState(166);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(OPEN);
				setState(168);
				match(Name);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(169);
					attribute();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(CLOSE);
				setState(176);
				content();
				setState(177);
				match(OPEN_SLASH);
				setState(178);
				match(Name);
				setState(179);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(OPEN);
				setState(182);
				match(Name);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(183);
					attribute();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
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
			setState(192);
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
			setState(194);
			match(Name);
			setState(195);
			match(EQUALS);
			setState(196);
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
			setState(198);
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
			setState(200);
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
			setState(202);
			match(OPEN);
			setState(203);
			match(NTA);
			setState(204);
			match(CLOSE);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(205);
				misc();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			declaration();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(212);
				misc();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(218);
					template();
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(219);
						misc();
						}
						}
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(229);
			system();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(230);
				misc();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(236);
				queries();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(237);
					misc();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(245);
			match(OPEN_SLASH);
			setState(246);
			match(NTA);
			setState(247);
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
			setState(249);
			match(OPEN_DECLARATION);
			setState(250);
			decl_content();
			setState(251);
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
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
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
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					declarations();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclarationContext extends DeclarationsContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionDeclarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationContext extends DeclarationsContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public VariableDeclarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDeclarationContext extends DeclarationsContext {
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public TypeDeclarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChanDeclarationContext extends DeclarationsContext {
		public ChanPriorityContext chanPriority() {
			return getRuleContext(ChanPriorityContext.class,0);
		}
		public ChanDeclarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarations);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				variableDecl();
				}
				break;
			case 2:
				_localctx = new TypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				typeDecl();
				}
				break;
			case 3:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				function();
				}
				break;
			case 4:
				_localctx = new ChanDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				chanPriority();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(UppaalParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExprContext extends ExprContext {
		public Token binary;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
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
	public static class ExprIncrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
	public static class SumExprContext extends ExprContext {
		public TerminalNode SUM() { return getToken(UppaalParser.SUM, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
	public static class FuncExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
	public static class ExprDecrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(UppaalParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public Token assign;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public Guard_exprContext guard_expr() {
			return getRuleContext(Guard_exprContext.class,0);
		}
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(266);
				match(IDENTIFIER);
				}
				break;
			case NAT:
				{
				_localctx = new NatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(NAT);
				}
				break;
			case POINT:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(POINT);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				_localctx = new ParenthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(LEFT_PARENTHESIS);
				setState(270);
				expr(0);
				setState(271);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case INCREMENT:
				{
				_localctx = new IncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(INCREMENT);
				setState(274);
				expr(15);
				}
				break;
			case DECREMENT:
				{
				_localctx = new DecrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(DECREMENT);
				setState(276);
				expr(13);
				}
				break;
			case ADD:
			case SUB:
			case EXCLAMATION:
			case NOT:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				((UnaryExprContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ADD - 86)) | (1L << (SUB - 86)) | (1L << (EXCLAMATION - 86)) | (1L << (NOT - 86)))) != 0)) ) {
					((UnaryExprContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
				expr(11);
				}
				break;
			case FORALL:
				{
				_localctx = new ForallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(FORALL);
				setState(280);
				match(LEFT_PARENTHESIS);
				setState(281);
				match(IDENTIFIER);
				setState(282);
				match(COLON);
				setState(283);
				type();
				setState(284);
				match(RIGHT_PARENTHESIS);
				setState(285);
				expr(5);
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(EXISTS);
				setState(288);
				match(LEFT_PARENTHESIS);
				setState(289);
				match(IDENTIFIER);
				setState(290);
				match(COLON);
				setState(291);
				type();
				setState(292);
				match(RIGHT_PARENTHESIS);
				setState(293);
				expr(4);
				}
				break;
			case SUM:
				{
				_localctx = new SumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(SUM);
				setState(296);
				match(LEFT_PARENTHESIS);
				setState(297);
				match(IDENTIFIER);
				setState(298);
				match(COLON);
				setState(299);
				type();
				setState(300);
				match(RIGHT_PARENTHESIS);
				setState(301);
				expr(3);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(308);
						((AssignExprContext)_localctx).assign = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ASSIGN - 74)) | (1L << (ASSIGN_COLON - 74)) | (1L << (ASSIGN_ADD - 74)) | (1L << (ASSIGN_SUB - 74)) | (1L << (ASSIGN_MUL - 74)) | (1L << (ASSIGN_DIV - 74)) | (1L << (ASSIGN_PERCENT - 74)) | (1L << (ASSIGN_OR - 74)) | (1L << (ASSIGN_AND - 74)) | (1L << (ASSIGN_XOR - 74)) | (1L << (ASSIGN_LSHIFT - 74)) | (1L << (ASSIGN_RSHIFT - 74)))) != 0)) ) {
							((AssignExprContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(309);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(311);
						((ComparisonExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LESS - 90)) | (1L << (LESSEQ - 90)) | (1L << (COMPARE - 90)) | (1L << (DIFFERENT - 90)) | (1L << (GREATEREQ - 90)) | (1L << (GREATER - 90)))) != 0)) ) {
							((ComparisonExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(312);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new IfExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(314);
						match(QUESTION);
						setState(315);
						expr(0);
						setState(316);
						match(COLON);
						setState(317);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(320);
						match(LEFT_BRACKET);
						setState(321);
						guard_expr(0);
						setState(322);
						match(RIGHT_BRACKET);
						}
						break;
					case 5:
						{
						_localctx = new StopWatchExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(325);
						match(APOSTROPHE);
						}
						break;
					case 6:
						{
						_localctx = new ExprIncrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(326);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(327);
						match(INCREMENT);
						}
						break;
					case 7:
						{
						_localctx = new ExprDecrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(329);
						match(DECREMENT);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(331);
						((BinaryExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ADD - 86)) | (1L << (SUB - 86)) | (1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (PERCENT - 86)) | (1L << (BITAND - 86)) | (1L << (BITOR - 86)) | (1L << (BITXOR - 86)) | (1L << (LSHIFT - 86)) | (1L << (RSHIFT - 86)) | (1L << (AND_SYMBOL - 86)) | (1L << (OR_SYMBOL - 86)) | (1L << (MINIMUM - 86)) | (1L << (MAXIMUM - 86)) | (1L << (OR - 86)) | (1L << (AND - 86)) | (1L << (IMPLY - 86)))) != 0)) ) {
							((BinaryExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(332);
						guard_expr(0);
						}
						break;
					case 9:
						{
						_localctx = new DotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(333);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(334);
						match(LOOKUP_OP);
						setState(335);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new FuncExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(336);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(337);
						match(LEFT_PARENTHESIS);
						setState(338);
						guard_arguments();
						setState(339);
						match(RIGHT_PARENTHESIS);
						}
						break;
					}
					} 
				}
				setState(345);
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
		enterRule(_localctx, 26, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			type();
			setState(347);
			variableID();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(348);
				match(COMMA);
				setState(349);
				variableID();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
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
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (URGENT - 117)) | (1L << (BROADCAST - 117)) | (1L << (META - 117)) | (1L << (CONST - 117)))) != 0)) {
				{
				setState(357);
				prefix();
				}
			}

			setState(360);
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
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
	 
		public PrefixContext() { }
		public void copyFrom(PrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BroadcastPrefixContext extends PrefixContext {
		public TerminalNode BROADCAST() { return getToken(UppaalParser.BROADCAST, 0); }
		public BroadcastPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBroadcastPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBroadcastPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBroadcastPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MetaPrefixContext extends PrefixContext {
		public TerminalNode META() { return getToken(UppaalParser.META, 0); }
		public MetaPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterMetaPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitMetaPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitMetaPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstPrefixContext extends PrefixContext {
		public TerminalNode CONST() { return getToken(UppaalParser.CONST, 0); }
		public ConstPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterConstPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitConstPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitConstPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UrgentPrefixContext extends PrefixContext {
		public TerminalNode URGENT() { return getToken(UppaalParser.URGENT, 0); }
		public UrgentPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterUrgentPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitUrgentPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitUrgentPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_prefix);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URGENT:
				_localctx = new UrgentPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(URGENT);
				}
				break;
			case BROADCAST:
				_localctx = new BroadcastPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(BROADCAST);
				}
				break;
			case META:
				_localctx = new MetaPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(META);
				}
				break;
			case CONST:
				_localctx = new ConstPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				match(CONST);
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

	public static class TypeIdContext extends ParserRuleContext {
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
	 
		public TypeIdContext() { }
		public void copyFrom(TypeIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolTypeContext extends TypeIdContext {
		public TerminalNode BOOL() { return getToken(UppaalParser.BOOL, 0); }
		public BoolTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructTypeContext extends TypeIdContext {
		public TerminalNode STRUCT() { return getToken(UppaalParser.STRUCT, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(UppaalParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(UppaalParser.RIGHT_BRACE, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public StructTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleTypeContext extends TypeIdContext {
		public TerminalNode DOUBLE() { return getToken(UppaalParser.DOUBLE, 0); }
		public DoubleTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarTypeContext extends TypeIdContext {
		public TerminalNode SCALAR() { return getToken(UppaalParser.SCALAR, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ScalarTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierTypeContext extends TypeIdContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public IdentifierTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIdentifierType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIdentifierType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIdentifierType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDomainTypeContext extends TypeIdContext {
		public TerminalNode INT() { return getToken(UppaalParser.INT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(UppaalParser.COMMA, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public IntDomainTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIntDomainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIntDomainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIntDomainType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeIdContext {
		public TerminalNode INT() { return getToken(UppaalParser.INT, 0); }
		public IntTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClockTypeContext extends TypeIdContext {
		public TerminalNode CLOCK() { return getToken(UppaalParser.CLOCK, 0); }
		public ClockTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterClockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitClockType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitClockType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChanTypeContext extends TypeIdContext {
		public TerminalNode CHAN() { return getToken(UppaalParser.CHAN, 0); }
		public ChanTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeId);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(INT);
				}
				break;
			case 3:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(DOUBLE);
				}
				break;
			case 4:
				_localctx = new ClockTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				match(CLOCK);
				}
				break;
			case 5:
				_localctx = new ChanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(372);
				match(CHAN);
				}
				break;
			case 6:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(373);
				match(BOOL);
				}
				break;
			case 7:
				_localctx = new IntDomainTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(374);
				match(INT);
				setState(375);
				match(LEFT_BRACKET);
				setState(376);
				expr(0);
				setState(377);
				match(COMMA);
				setState(378);
				expr(0);
				setState(379);
				match(RIGHT_BRACKET);
				}
				break;
			case 8:
				_localctx = new ScalarTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(381);
				match(SCALAR);
				setState(382);
				match(LEFT_BRACKET);
				setState(383);
				expr(0);
				setState(384);
				match(RIGHT_BRACKET);
				}
				break;
			case 9:
				_localctx = new StructTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(386);
				match(STRUCT);
				setState(387);
				match(LEFT_BRACE);
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(388);
					fieldDecl();
					}
					}
					setState(391); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (URGENT - 117)) | (1L << (BROADCAST - 117)) | (1L << (META - 117)) | (1L << (CONST - 117)) | (1L << (INT - 117)) | (1L << (DOUBLE - 117)) | (1L << (CLOCK - 117)) | (1L << (CHAN - 117)) | (1L << (BOOL - 117)) | (1L << (SCALAR - 117)) | (1L << (STRUCT - 117)) | (1L << (IDENTIFIER - 117)))) != 0) );
				setState(393);
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
		public List<VarFieldDeclContext> varFieldDecl() {
			return getRuleContexts(VarFieldDeclContext.class);
		}
		public VarFieldDeclContext varFieldDecl(int i) {
			return getRuleContext(VarFieldDeclContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 34, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			type();
			setState(398);
			varFieldDecl();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(399);
				match(COMMA);
				setState(400);
				varFieldDecl();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
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

	public static class VarFieldDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public VarFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterVarFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitVarFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitVarFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarFieldDeclContext varFieldDecl() throws RecognitionException {
		VarFieldDeclContext _localctx = new VarFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varFieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(IDENTIFIER);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(409);
				arrayDecl();
				}
				}
				setState(414);
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

	public static class ArrayDeclContext extends ParserRuleContext {
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
	 
		public ArrayDeclContext() { }
		public void copyFrom(ArrayDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclExprContext extends ArrayDeclContext {
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ArrayDeclExprContext(ArrayDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArrayDeclExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArrayDeclExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArrayDeclExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclTypeContext extends ArrayDeclContext {
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ArrayDeclTypeContext(ArrayDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArrayDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArrayDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArrayDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayDecl);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(LEFT_BRACKET);
				setState(416);
				expr(0);
				setState(417);
				match(RIGHT_BRACKET);
				}
				break;
			case 2:
				_localctx = new ArrayDeclTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(LEFT_BRACKET);
				setState(420);
				type();
				setState(421);
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
		enterRule(_localctx, 40, RULE_variableID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(IDENTIFIER);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(426);
				arrayDecl();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(432);
				match(ASSIGN);
				setState(433);
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
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
	 
		public InitialiserContext() { }
		public void copyFrom(InitialiserContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitialiserExprContext extends InitialiserContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitialiserExprContext(InitialiserContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterInitialiserExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitInitialiserExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitInitialiserExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitialiserArrayContext extends InitialiserContext {
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
		public InitialiserArrayContext(InitialiserContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterInitialiserArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitInitialiserArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitInitialiserArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_initialiser);
		int _la;
		try {
			setState(448);
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
				_localctx = new InitialiserExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				expr(0);
				}
				break;
			case LEFT_BRACE:
				_localctx = new InitialiserArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(LEFT_BRACE);
				setState(438);
				initialiser();
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(439);
					match(COMMA);
					setState(440);
					initialiser();
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(446);
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
		public List<VarFieldDeclContext> varFieldDecl() {
			return getRuleContexts(VarFieldDeclContext.class);
		}
		public VarFieldDeclContext varFieldDecl(int i) {
			return getRuleContext(VarFieldDeclContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 44, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(TYPEDEF);
			setState(451);
			type();
			setState(452);
			varFieldDecl();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(453);
				match(COMMA);
				setState(454);
				varFieldDecl();
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
		enterRule(_localctx, 46, RULE_function);
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
		enterRule(_localctx, 48, RULE_funcParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (URGENT - 117)) | (1L << (BROADCAST - 117)) | (1L << (META - 117)) | (1L << (CONST - 117)) | (1L << (INT - 117)) | (1L << (DOUBLE - 117)) | (1L << (CLOCK - 117)) | (1L << (CHAN - 117)) | (1L << (BOOL - 117)) | (1L << (SCALAR - 117)) | (1L << (STRUCT - 117)) | (1L << (IDENTIFIER - 117)))) != 0)) {
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
		public VarFieldDeclContext varFieldDecl() {
			return getRuleContext(VarFieldDeclContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(UppaalParser.BITAND, 0); }
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
		enterRule(_localctx, 50, RULE_funcParameter);
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
			varFieldDecl();
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
		enterRule(_localctx, 52, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(LEFT_BRACE);
			setState(486);
			decl_content();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (NAT - 53)) | (1L << (POINT - 53)) | (1L << (FOR - 53)) | (1L << (WHILE - 53)) | (1L << (DO - 53)) | (1L << (IF - 53)) | (1L << (RETURN - 53)) | (1L << (LEFT_PARENTHESIS - 53)) | (1L << (LEFT_BRACE - 53)) | (1L << (SEMICOLON - 53)) | (1L << (INCREMENT - 53)) | (1L << (DECREMENT - 53)) | (1L << (ADD - 53)) | (1L << (SUB - 53)) | (1L << (EXCLAMATION - 53)) | (1L << (NOT - 53)) | (1L << (FORALL - 53)) | (1L << (EXISTS - 53)) | (1L << (SUM - 53)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (TRUE - 129)) | (1L << (FALSE - 129)) | (1L << (IDENTIFIER - 129)))) != 0)) {
				{
				{
				setState(487);
				statement();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementIfContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementForContext extends StatementContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public StatementForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementExprContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public StatementExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementWhileContext extends StatementContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementSemicolonContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public StatementSemicolonContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementIterationContext extends StatementContext {
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public StatementIterationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementIteration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDoWhileContext extends StatementContext {
		public DoWhileContext doWhile() {
			return getRuleContext(DoWhileContext.class,0);
		}
		public StatementDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementBlockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new StatementBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				block();
				}
				break;
			case 2:
				_localctx = new StatementSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new StatementExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				expr(0);
				setState(498);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new StatementForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				forLoop();
				}
				break;
			case 5:
				_localctx = new StatementIterationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				iteration();
				}
				break;
			case 6:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(502);
				whileLoop();
				}
				break;
			case 7:
				_localctx = new StatementDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(503);
				doWhile();
				}
				break;
			case 8:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(504);
				ifStatement();
				}
				break;
			case 9:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(505);
				returnStatement();
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

	public static class ForLoopContext extends ParserRuleContext {
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
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(FOR);
			setState(509);
			match(LEFT_PARENTHESIS);
			setState(510);
			expr(0);
			setState(511);
			match(SEMICOLON);
			setState(512);
			expr(0);
			setState(513);
			match(SEMICOLON);
			setState(514);
			expr(0);
			setState(515);
			match(RIGHT_PARENTHESIS);
			setState(516);
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
		enterRule(_localctx, 58, RULE_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(FOR);
			setState(519);
			match(LEFT_PARENTHESIS);
			setState(520);
			match(IDENTIFIER);
			setState(521);
			match(COLON);
			setState(522);
			type();
			setState(523);
			match(RIGHT_PARENTHESIS);
			setState(524);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(UppaalParser.WHILE, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(WHILE);
			setState(527);
			match(LEFT_PARENTHESIS);
			setState(528);
			expr(0);
			setState(529);
			match(RIGHT_PARENTHESIS);
			setState(530);
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

	public static class DoWhileContext extends ParserRuleContext {
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
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(DO);
			setState(533);
			statement();
			setState(534);
			match(WHILE);
			setState(535);
			match(LEFT_PARENTHESIS);
			setState(536);
			expr(0);
			setState(537);
			match(RIGHT_PARENTHESIS);
			setState(538);
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

	public static class IfStatementContext extends ParserRuleContext {
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
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(IF);
			setState(541);
			match(LEFT_PARENTHESIS);
			setState(542);
			expr(0);
			setState(543);
			match(RIGHT_PARENTHESIS);
			setState(544);
			statement();
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(545);
				match(ELSE);
				setState(546);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(UppaalParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(RETURN);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (NAT - 53)) | (1L << (POINT - 53)) | (1L << (LEFT_PARENTHESIS - 53)) | (1L << (INCREMENT - 53)) | (1L << (DECREMENT - 53)) | (1L << (ADD - 53)) | (1L << (SUB - 53)) | (1L << (EXCLAMATION - 53)) | (1L << (NOT - 53)) | (1L << (FORALL - 53)) | (1L << (EXISTS - 53)) | (1L << (SUM - 53)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (TRUE - 129)) | (1L << (FALSE - 129)) | (1L << (IDENTIFIER - 129)))) != 0)) {
				{
				setState(550);
				expr(0);
				}
			}

			setState(553);
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

	public static class ChanPriorityContext extends ParserRuleContext {
		public TerminalNode CHAN() { return getToken(UppaalParser.CHAN, 0); }
		public TerminalNode PRIORITY() { return getToken(UppaalParser.PRIORITY, 0); }
		public List<ChanOrDefContext> chanOrDef() {
			return getRuleContexts(ChanOrDefContext.class);
		}
		public ChanOrDefContext chanOrDef(int i) {
			return getRuleContext(ChanOrDefContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public List<ChanSeparatorContext> chanSeparator() {
			return getRuleContexts(ChanSeparatorContext.class);
		}
		public ChanSeparatorContext chanSeparator(int i) {
			return getRuleContext(ChanSeparatorContext.class,i);
		}
		public ChanPriorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanPriority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanPriority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanPriorityContext chanPriority() throws RecognitionException {
		ChanPriorityContext _localctx = new ChanPriorityContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_chanPriority);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(CHAN);
			setState(556);
			match(PRIORITY);
			setState(557);
			chanOrDef();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==LESS) {
				{
				{
				setState(558);
				chanSeparator();
				setState(559);
				chanOrDef();
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
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

	public static class ChanOrDefContext extends ParserRuleContext {
		public ChanExprContext chanExpr() {
			return getRuleContext(ChanExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(UppaalParser.DEFAULT, 0); }
		public ChanOrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanOrDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanOrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanOrDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanOrDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanOrDefContext chanOrDef() throws RecognitionException {
		ChanOrDefContext _localctx = new ChanOrDefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_chanOrDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(568);
				chanExpr(0);
				}
				break;
			case DEFAULT:
				{
				setState(569);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ChanSeparatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(UppaalParser.COMMA, 0); }
		public TerminalNode LESS() { return getToken(UppaalParser.LESS, 0); }
		public ChanSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanSeparatorContext chanSeparator() throws RecognitionException {
		ChanSeparatorContext _localctx = new ChanSeparatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_chanSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==LESS) ) {
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

	public static class ChanExprContext extends ParserRuleContext {
		public ChanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanExpr; }
	 
		public ChanExprContext() { }
		public void copyFrom(ChanExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChanArrayContext extends ChanExprContext {
		public ChanExprContext chanExpr() {
			return getRuleContext(ChanExprContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ChanArrayContext(ChanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChanIdentifierContext extends ChanExprContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public ChanIdentifierContext(ChanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanExprContext chanExpr() throws RecognitionException {
		return chanExpr(0);
	}

	private ChanExprContext chanExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ChanExprContext _localctx = new ChanExprContext(_ctx, _parentState);
		ChanExprContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_chanExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ChanIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(575);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChanArrayContext(new ChanExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_chanExpr);
					setState(577);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(578);
					match(LEFT_BRACKET);
					setState(579);
					expr(0);
					setState(580);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 76, RULE_anything);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(587);
				chardata();
				}
			}

			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << PI))) != 0)) {
				{
				{
				setState(594);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EntityRef:
				case CharRef:
					{
					setState(590);
					reference();
					}
					break;
				case CDATA:
					{
					setState(591);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(592);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(593);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(596);
					chardata();
					}
				}

				}
				}
				setState(603);
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
		enterRule(_localctx, 78, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(OPEN);
			setState(605);
			match(TEMPLATE);
			setState(606);
			match(CLOSE);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(607);
				misc();
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			temp_content();
			setState(614);
			match(OPEN_SLASH);
			setState(615);
			match(TEMPLATE);
			setState(616);
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
		enterRule(_localctx, 80, RULE_temp_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(618);
				name();
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
				break;
			}
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARAMETER) {
				{
				setState(627);
				parameter();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(628);
					misc();
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_DECLARATION) {
				{
				setState(636);
				declaration();
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
			}

			setState(659); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(659);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						{
						setState(645);
						location();
						setState(649);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(646);
							misc();
							}
							}
							setState(651);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					case 2:
						{
						{
						setState(652);
						branchpoint();
						setState(656);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(653);
							misc();
							}
							}
							setState(658);
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
				setState(661); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(663);
			init_loc();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(664);
				misc();
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(670);
				transition();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(671);
					misc();
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(681);
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
		enterRule(_localctx, 82, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(OPEN_PARAMETER);
			setState(683);
			funcParameters();
			setState(684);
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
		enterRule(_localctx, 84, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(X);
			setState(687);
			match(EQUALS);
			setState(688);
			match(STRING);
			setState(689);
			match(Y);
			setState(690);
			match(EQUALS);
			setState(691);
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
		enterRule(_localctx, 86, RULE_init_loc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(OPEN);
			setState(694);
			match(INIT);
			setState(695);
			match(REF);
			setState(696);
			match(EQUALS);
			setState(697);
			match(STRING);
			setState(698);
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
		enterRule(_localctx, 88, RULE_branchpoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(OPEN);
			setState(701);
			match(BRANCHPOINT);
			setState(702);
			match(ID);
			setState(703);
			match(EQUALS);
			setState(704);
			match(STRING);
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(705);
				coordinate();
				}
			}

			setState(708);
			match(CLOSE);
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(709);
				misc();
				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(715);
			match(OPEN_SLASH);
			setState(716);
			match(BRANCHPOINT);
			setState(717);
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
		enterRule(_localctx, 90, RULE_location);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(OPEN);
			setState(720);
			match(LOCATION);
			setState(721);
			match(ID);
			setState(722);
			match(EQUALS);
			setState(723);
			match(STRING);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(724);
				coordinate();
				}
			}

			setState(727);
			match(CLOSE);
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(728);
				misc();
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(734);
				name();
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(735);
					misc();
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					label_loc();
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(744);
						misc();
						}
						}
						setState(749);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(755);
				match(OPEN);
				setState(756);
				_la = _input.LA(1);
				if ( !(_la==URGENT_LOC || _la==COMMITTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(757);
				match(SLASH_CLOSE);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(758);
					misc();
					}
					}
					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(766);
			match(OPEN_SLASH);
			setState(767);
			match(LOCATION);
			setState(768);
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
		enterRule(_localctx, 92, RULE_label_loc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(OPEN);
			setState(771);
			match(LABEL);
			setState(772);
			match(KIND);
			setState(773);
			match(EQUALS);
			setState(774);
			match(STRING);
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(775);
				coordinate();
				}
			}

			setState(778);
			match(CLOSE);
			setState(779);
			anything();
			setState(780);
			match(OPEN_SLASH);
			setState(781);
			match(LABEL);
			setState(782);
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
		enterRule(_localctx, 94, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(OPEN);
			setState(785);
			match(NAME);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(786);
				coordinate();
				}
			}

			setState(789);
			match(CLOSE);
			setState(790);
			anything();
			setState(791);
			match(OPEN_SLASH);
			setState(792);
			match(NAME);
			setState(793);
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
		enterRule(_localctx, 96, RULE_transition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(OPEN);
			setState(796);
			match(TRANSITION);
			setState(797);
			match(CLOSE);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(798);
				misc();
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(804);
			source();
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(805);
				misc();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(811);
			target();
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(812);
				misc();
				}
				}
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(827);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(818);
					label_trans();
					setState(822);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(819);
						misc();
						}
						}
						setState(824);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(830);
				nail();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(831);
					misc();
					}
					}
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(842);
			match(OPEN_SLASH);
			setState(843);
			match(TRANSITION);
			setState(844);
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
		enterRule(_localctx, 98, RULE_label_trans);
		int _la;
		try {
			setState(865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_GUARD:
				_localctx = new LabelTransGuardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				match(OPEN_GUARD);
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (NAT - 53)) | (1L << (POINT - 53)) | (1L << (LEFT_PARENTHESIS - 53)) | (1L << (INCREMENT - 53)) | (1L << (DECREMENT - 53)) | (1L << (ADD - 53)) | (1L << (SUB - 53)) | (1L << (EXCLAMATION - 53)) | (1L << (NOT - 53)) | (1L << (FORALL - 53)) | (1L << (EXISTS - 53)) | (1L << (SUM - 53)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (TRUE - 129)) | (1L << (FALSE - 129)) | (1L << (IDENTIFIER - 129)))) != 0)) {
					{
					setState(847);
					guard_expr(0);
					}
				}

				setState(850);
				match(CLOSE_GUARD);
				}
				break;
			case OPEN:
				_localctx = new LabelTransContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				match(OPEN);
				setState(852);
				match(LABEL);
				setState(853);
				match(KIND);
				setState(854);
				match(EQUALS);
				setState(855);
				match(STRING);
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==X) {
					{
					setState(856);
					coordinate();
					}
				}

				setState(859);
				match(CLOSE);
				setState(860);
				anything();
				setState(861);
				match(OPEN_SLASH);
				setState(862);
				match(LABEL);
				setState(863);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_guard_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentifierGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(868);
				match(IDENTIFIER);
				}
				break;
			case NAT:
				{
				_localctx = new NatGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(869);
				match(NAT);
				}
				break;
			case POINT:
				{
				_localctx = new DoubleGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(870);
				match(POINT);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				_localctx = new ParenthesisGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(871);
				match(LEFT_PARENTHESIS);
				setState(872);
				guard_expr(0);
				setState(873);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case INCREMENT:
				{
				_localctx = new IncrementGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(875);
				match(INCREMENT);
				setState(876);
				guard_expr(15);
				}
				break;
			case DECREMENT:
				{
				_localctx = new DecrementGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(877);
				match(DECREMENT);
				setState(878);
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
				setState(879);
				((UnaryGuardContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ADD - 86)) | (1L << (SUB - 86)) | (1L << (EXCLAMATION - 86)) | (1L << (NOT - 86)))) != 0)) ) {
					((UnaryGuardContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(880);
				guard_expr(11);
				}
				break;
			case FORALL:
				{
				_localctx = new ForallGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(881);
				match(FORALL);
				setState(882);
				match(LEFT_PARENTHESIS);
				setState(883);
				match(IDENTIFIER);
				setState(884);
				match(COLON);
				setState(885);
				guard_type();
				setState(886);
				match(RIGHT_PARENTHESIS);
				setState(887);
				guard_expr(5);
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(889);
				match(EXISTS);
				setState(890);
				match(LEFT_PARENTHESIS);
				setState(891);
				match(IDENTIFIER);
				setState(892);
				match(COLON);
				setState(893);
				guard_type();
				setState(894);
				match(RIGHT_PARENTHESIS);
				setState(895);
				guard_expr(4);
				}
				break;
			case SUM:
				{
				_localctx = new SumGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(897);
				match(SUM);
				setState(898);
				match(LEFT_PARENTHESIS);
				setState(899);
				match(IDENTIFIER);
				setState(900);
				match(COLON);
				setState(901);
				guard_type();
				setState(902);
				match(RIGHT_PARENTHESIS);
				setState(903);
				guard_expr(3);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(905);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(906);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(945);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						_localctx = new AssignGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(909);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(910);
						((AssignGuardContext)_localctx).assign = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ASSIGN - 74)) | (1L << (ASSIGN_COLON - 74)) | (1L << (ASSIGN_ADD - 74)) | (1L << (ASSIGN_SUB - 74)) | (1L << (ASSIGN_MUL - 74)) | (1L << (ASSIGN_DIV - 74)) | (1L << (ASSIGN_PERCENT - 74)) | (1L << (ASSIGN_OR - 74)) | (1L << (ASSIGN_AND - 74)) | (1L << (ASSIGN_XOR - 74)) | (1L << (ASSIGN_LSHIFT - 74)) | (1L << (ASSIGN_RSHIFT - 74)))) != 0)) ) {
							((AssignGuardContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(911);
						guard_expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(912);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(913);
						((ComparisonGuardContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LESS - 90)) | (1L << (LESSEQ - 90)) | (1L << (COMPARE - 90)) | (1L << (DIFFERENT - 90)) | (1L << (GREATEREQ - 90)) | (1L << (GREATER - 90)))) != 0)) ) {
							((ComparisonGuardContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(914);
						guard_expr(11);


						                          this.num++;
						                          //System.out.println ((((ComparisonGuardContext)_localctx).binary!=null?((ComparisonGuardContext)_localctx).binary.getText():null));
						                          
						}
						break;
					case 3:
						{
						_localctx = new BinaryGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(917);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(918);
						((BinaryGuardContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ADD - 86)) | (1L << (SUB - 86)) | (1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (PERCENT - 86)) | (1L << (BITAND - 86)) | (1L << (BITOR - 86)) | (1L << (BITXOR - 86)) | (1L << (LSHIFT - 86)) | (1L << (RSHIFT - 86)) | (1L << (AND_SYMBOL - 86)) | (1L << (OR_SYMBOL - 86)) | (1L << (MINIMUM - 86)) | (1L << (MAXIMUM - 86)) | (1L << (OR - 86)) | (1L << (AND - 86)) | (1L << (IMPLY - 86)))) != 0)) ) {
							((BinaryGuardContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(919);
						guard_expr(10);
						}
						break;
					case 4:
						{
						_localctx = new IfGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(920);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(921);
						match(QUESTION);
						setState(922);
						guard_expr(0);
						setState(923);
						match(COLON);
						setState(924);
						guard_expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ArrayGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(926);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(927);
						match(LEFT_BRACKET);
						setState(928);
						guard_expr(0);
						setState(929);
						match(RIGHT_BRACKET);
						}
						break;
					case 6:
						{
						_localctx = new StopWatchGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(931);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(932);
						match(APOSTROPHE);
						}
						break;
					case 7:
						{
						_localctx = new GuardIncrementContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(933);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(934);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new GuardDecrementContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(935);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(936);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DotGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(937);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(938);
						match(LOOKUP_OP);
						setState(939);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new FuncGuardContext(new Guard_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guard_expr);
						setState(940);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(941);
						match(LEFT_PARENTHESIS);
						setState(942);
						guard_arguments();
						setState(943);
						match(RIGHT_PARENTHESIS);
						}
						break;
					}
					} 
				}
				setState(949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		enterRule(_localctx, 102, RULE_guard_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (NAT - 53)) | (1L << (POINT - 53)) | (1L << (LEFT_PARENTHESIS - 53)) | (1L << (INCREMENT - 53)) | (1L << (DECREMENT - 53)) | (1L << (ADD - 53)) | (1L << (SUB - 53)) | (1L << (EXCLAMATION - 53)) | (1L << (NOT - 53)) | (1L << (FORALL - 53)) | (1L << (EXISTS - 53)) | (1L << (SUM - 53)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (TRUE - 129)) | (1L << (FALSE - 129)) | (1L << (IDENTIFIER - 129)))) != 0)) {
				{
				setState(950);
				guard_expr(0);
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(951);
					match(COMMA);
					setState(952);
					guard_expr(0);
					}
					}
					setState(957);
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
		enterRule(_localctx, 104, RULE_guard_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==META || _la==CONST) {
				{
				setState(960);
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

			setState(963);
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
		enterRule(_localctx, 106, RULE_guard_typeId);
		try {
			setState(978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				_localctx = new GuardTypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				match(INT);
				}
				break;
			case 2:
				_localctx = new GuardTypeIntDomainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				match(INT);
				setState(967);
				match(LEFT_BRACKET);
				setState(968);
				guard_expr(0);
				setState(969);
				match(COMMA);
				setState(970);
				guard_expr(0);
				setState(971);
				match(RIGHT_BRACKET);
				}
				break;
			case 3:
				_localctx = new GuardTypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(973);
				match(SCALAR);
				setState(974);
				match(LEFT_BRACKET);
				setState(975);
				guard_expr(0);
				setState(976);
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
		enterRule(_localctx, 108, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(OPEN);
			setState(981);
			match(SOURCE);
			setState(982);
			match(REF);
			setState(983);
			match(EQUALS);
			setState(984);
			match(STRING);
			setState(985);
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
		enterRule(_localctx, 110, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(OPEN);
			setState(988);
			match(TARGET);
			setState(989);
			match(REF);
			setState(990);
			match(EQUALS);
			setState(991);
			match(STRING);
			setState(992);
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
		enterRule(_localctx, 112, RULE_nail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(OPEN);
			setState(995);
			match(NAIL);
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(996);
				coordinate();
				}
			}

			setState(999);
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
		enterRule(_localctx, 114, RULE_system);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(OPEN);
			setState(1002);
			match(SYSTEM);
			setState(1003);
			match(CLOSE);
			setState(1004);
			anything();
			setState(1005);
			match(OPEN_SLASH);
			setState(1006);
			match(SYSTEM);
			setState(1007);
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
		enterRule(_localctx, 116, RULE_queries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(OPEN);
			setState(1010);
			match(QUERIES);
			setState(1011);
			match(CLOSE);
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(1012);
				misc();
				}
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(1018);
				query();
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1019);
					misc();
					}
					}
					setState(1024);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1030);
			match(OPEN_SLASH);
			setState(1031);
			match(QUERIES);
			setState(1032);
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
		enterRule(_localctx, 118, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(OPEN);
			setState(1035);
			match(QUERY);
			setState(1036);
			match(CLOSE);
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(1037);
				misc();
				}
				}
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1043);
				formula();
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1044);
					misc();
					}
					}
					setState(1049);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(1052);
				comment();
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1053);
					misc();
					}
					}
					setState(1058);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1061);
			match(OPEN_SLASH);
			setState(1062);
			match(QUERY);
			setState(1063);
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
		enterRule(_localctx, 120, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(OPEN);
			setState(1066);
			match(FORMULA);
			setState(1067);
			match(CLOSE);
			setState(1068);
			anything();
			setState(1069);
			match(OPEN_SLASH);
			setState(1070);
			match(FORMULA);
			setState(1071);
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
		enterRule(_localctx, 122, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(OPEN);
			setState(1074);
			match(QUERY_COMMENT);
			setState(1075);
			match(CLOSE);
			setState(1076);
			anything();
			setState(1077);
			match(OPEN_SLASH);
			setState(1078);
			match(QUERY_COMMENT);
			setState(1079);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 37:
			return chanExpr_sempred((ChanExprContext)_localctx, predIndex);
		case 50:
			return guard_expr_sempred((Guard_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean chanExpr_sempred(ChanExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean guard_expr_sempred(Guard_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 9);
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 19);
		case 16:
			return precpred(_ctx, 18);
		case 17:
			return precpred(_ctx, 16);
		case 18:
			return precpred(_ctx, 14);
		case 19:
			return precpred(_ctx, 7);
		case 20:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0085\u043c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\5\2\u0080\n\2\3\2\7\2\u0083\n\2\f\2\16\2\u0086\13\2\3"+
		"\2\3\2\7\2\u008a\n\2\f\2\16\2\u008d\13\2\3\3\3\3\7\3\u0091\n\3\f\3\16"+
		"\3\u0094\13\3\3\3\3\3\3\4\5\4\u0099\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a0"+
		"\n\4\3\4\5\4\u00a3\n\4\7\4\u00a5\n\4\f\4\16\4\u00a8\13\4\3\5\3\5\3\5\7"+
		"\5\u00ad\n\5\f\5\16\5\u00b0\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5\u00bb\n\5\f\5\16\5\u00be\13\5\3\5\5\5\u00c1\n\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00d1\n\n\f\n\16\n\u00d4\13\n"+
		"\3\n\3\n\7\n\u00d8\n\n\f\n\16\n\u00db\13\n\3\n\3\n\7\n\u00df\n\n\f\n\16"+
		"\n\u00e2\13\n\6\n\u00e4\n\n\r\n\16\n\u00e5\3\n\3\n\7\n\u00ea\n\n\f\n\16"+
		"\n\u00ed\13\n\3\n\3\n\7\n\u00f1\n\n\f\n\16\n\u00f4\13\n\5\n\u00f6\n\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\7\f\u0101\n\f\f\f\16\f\u0104"+
		"\13\f\3\r\3\r\3\r\3\r\5\r\u010a\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0134\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0158\n\16\f\16\16\16\u015b\13\16\3\17\3\17\3\17\3\17\7\17\u0161"+
		"\n\17\f\17\16\17\u0164\13\17\3\17\3\17\3\20\5\20\u0169\n\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u0171\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\6\22\u0188\n\22\r\22\16\22\u0189\3\22\3\22\5\22\u018e\n\22\3\23\3\23"+
		"\3\23\3\23\7\23\u0194\n\23\f\23\16\23\u0197\13\23\3\23\3\23\3\24\3\24"+
		"\7\24\u019d\n\24\f\24\16\24\u01a0\13\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u01aa\n\25\3\26\3\26\7\26\u01ae\n\26\f\26\16\26\u01b1"+
		"\13\26\3\26\3\26\5\26\u01b5\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u01bc\n"+
		"\27\f\27\16\27\u01bf\13\27\3\27\3\27\5\27\u01c3\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\7\30\u01ca\n\30\f\30\16\30\u01cd\13\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u01db\n\32\f\32\16\32\u01de"+
		"\13\32\5\32\u01e0\n\32\3\33\3\33\5\33\u01e4\n\33\3\33\3\33\3\34\3\34\3"+
		"\34\7\34\u01eb\n\34\f\34\16\34\u01ee\13\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01fd\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u0226\n\"\3#\3#\5#\u022a\n#\3#\3#\3$\3$\3$\3$\3$\3$\7$\u0234"+
		"\n$\f$\16$\u0237\13$\3$\3$\3%\3%\5%\u023d\n%\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\7\'\u0249\n\'\f\'\16\'\u024c\13\'\3(\5(\u024f\n(\3(\3(\3"+
		"(\3(\5(\u0255\n(\3(\5(\u0258\n(\7(\u025a\n(\f(\16(\u025d\13(\3)\3)\3)"+
		"\3)\7)\u0263\n)\f)\16)\u0266\13)\3)\3)\3)\3)\3)\3*\3*\7*\u026f\n*\f*\16"+
		"*\u0272\13*\5*\u0274\n*\3*\3*\7*\u0278\n*\f*\16*\u027b\13*\5*\u027d\n"+
		"*\3*\3*\7*\u0281\n*\f*\16*\u0284\13*\5*\u0286\n*\3*\3*\7*\u028a\n*\f*"+
		"\16*\u028d\13*\3*\3*\7*\u0291\n*\f*\16*\u0294\13*\6*\u0296\n*\r*\16*\u0297"+
		"\3*\3*\7*\u029c\n*\f*\16*\u029f\13*\3*\3*\7*\u02a3\n*\f*\16*\u02a6\13"+
		"*\7*\u02a8\n*\f*\16*\u02ab\13*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\5.\u02c5\n.\3.\3.\7.\u02c9\n.\f.\16"+
		".\u02cc\13.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\5/\u02d8\n/\3/\3/\7/\u02dc\n"+
		"/\f/\16/\u02df\13/\3/\3/\7/\u02e3\n/\f/\16/\u02e6\13/\5/\u02e8\n/\3/\3"+
		"/\7/\u02ec\n/\f/\16/\u02ef\13/\7/\u02f1\n/\f/\16/\u02f4\13/\3/\3/\3/\3"+
		"/\7/\u02fa\n/\f/\16/\u02fd\13/\5/\u02ff\n/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u030b\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\5\61\u0316\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\7\62\u0322\n\62\f\62\16\62\u0325\13\62\3\62\3\62\7\62\u0329\n\62\f\62"+
		"\16\62\u032c\13\62\3\62\3\62\7\62\u0330\n\62\f\62\16\62\u0333\13\62\3"+
		"\62\3\62\7\62\u0337\n\62\f\62\16\62\u033a\13\62\7\62\u033c\n\62\f\62\16"+
		"\62\u033f\13\62\3\62\3\62\7\62\u0343\n\62\f\62\16\62\u0346\13\62\7\62"+
		"\u0348\n\62\f\62\16\62\u034b\13\62\3\62\3\62\3\62\3\62\3\63\3\63\5\63"+
		"\u0353\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u035c\n\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\5\63\u0364\n\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u038e\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\7\64\u03b4\n\64\f\64\16\64\u03b7\13\64\3\65\3\65\3\65"+
		"\7\65\u03bc\n\65\f\65\16\65\u03bf\13\65\5\65\u03c1\n\65\3\66\5\66\u03c4"+
		"\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u03d5\n\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\3"+
		":\3:\3:\5:\u03e8\n:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\7<\u03f8"+
		"\n<\f<\16<\u03fb\13<\3<\3<\7<\u03ff\n<\f<\16<\u0402\13<\7<\u0404\n<\f"+
		"<\16<\u0407\13<\3<\3<\3<\3<\3=\3=\3=\3=\7=\u0411\n=\f=\16=\u0414\13=\3"+
		"=\3=\7=\u0418\n=\f=\16=\u041b\13=\5=\u041d\n=\3=\3=\7=\u0421\n=\f=\16"+
		"=\u0424\13=\5=\u0426\n=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\2\5\32Lf@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\f\3\2\6\7\4\2"+
		"\b\b\17\17\5\2\3\3\b\b\60\60\3\2X[\3\2LW\3\2\\a\4\2XYbp\4\2HH\\\\\3\2"+
		"\34\35\3\2yz\2\u049f\2\177\3\2\2\2\4\u008e\3\2\2\2\6\u0098\3\2\2\2\b\u00c0"+
		"\3\2\2\2\n\u00c2\3\2\2\2\f\u00c4\3\2\2\2\16\u00c8\3\2\2\2\20\u00ca\3\2"+
		"\2\2\22\u00cc\3\2\2\2\24\u00fb\3\2\2\2\26\u0102\3\2\2\2\30\u0109\3\2\2"+
		"\2\32\u0133\3\2\2\2\34\u015c\3\2\2\2\36\u0168\3\2\2\2 \u0170\3\2\2\2\""+
		"\u018d\3\2\2\2$\u018f\3\2\2\2&\u019a\3\2\2\2(\u01a9\3\2\2\2*\u01ab\3\2"+
		"\2\2,\u01c2\3\2\2\2.\u01c4\3\2\2\2\60\u01d0\3\2\2\2\62\u01df\3\2\2\2\64"+
		"\u01e1\3\2\2\2\66\u01e7\3\2\2\28\u01fc\3\2\2\2:\u01fe\3\2\2\2<\u0208\3"+
		"\2\2\2>\u0210\3\2\2\2@\u0216\3\2\2\2B\u021e\3\2\2\2D\u0227\3\2\2\2F\u022d"+
		"\3\2\2\2H\u023c\3\2\2\2J\u023e\3\2\2\2L\u0240\3\2\2\2N\u024e\3\2\2\2P"+
		"\u025e\3\2\2\2R\u0273\3\2\2\2T\u02ac\3\2\2\2V\u02b0\3\2\2\2X\u02b7\3\2"+
		"\2\2Z\u02be\3\2\2\2\\\u02d1\3\2\2\2^\u0304\3\2\2\2`\u0312\3\2\2\2b\u031d"+
		"\3\2\2\2d\u0363\3\2\2\2f\u038d\3\2\2\2h\u03c0\3\2\2\2j\u03c3\3\2\2\2l"+
		"\u03d4\3\2\2\2n\u03d6\3\2\2\2p\u03dd\3\2\2\2r\u03e4\3\2\2\2t\u03eb\3\2"+
		"\2\2v\u03f3\3\2\2\2x\u040c\3\2\2\2z\u042b\3\2\2\2|\u0433\3\2\2\2~\u0080"+
		"\5\4\3\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0084\3\2\2\2\u0081\u0083"+
		"\5\20\t\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b"+
		"\5\22\n\2\u0088\u008a\5\20\t\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\3\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008e\u0092\7\16\2\2\u008f\u0091\5\f\7\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7*\2\2\u0096\5\3\2\2\2\u0097\u0099"+
		"\5\16\b\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a6\3\2\2\2"+
		"\u009a\u00a0\5\b\5\2\u009b\u00a0\5\n\6\2\u009c\u00a0\7\4\2\2\u009d\u00a0"+
		"\7\60\2\2\u009e\u00a0\7\3\2\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2"+
		"\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u00a3\5\16\b\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a5\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\7\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7\f\2\2\u00aa\u00ae\7.\2\2\u00ab\u00ad\5\f\7\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7)\2\2\u00b2\u00b3\5\6"+
		"\4\2\u00b3\u00b4\7\r\2\2\u00b4\u00b5\7.\2\2\u00b5\u00b6\7)\2\2\u00b6\u00c1"+
		"\3\2\2\2\u00b7\u00b8\7\f\2\2\u00b8\u00bc\7.\2\2\u00b9\u00bb\5\f\7\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\7+\2\2\u00c0"+
		"\u00a9\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c1\t\3\2\2\2\u00c2\u00c3\t\2\2\2"+
		"\u00c3\13\3\2\2\2\u00c4\u00c5\7.\2\2\u00c5\u00c6\7,\2\2\u00c6\u00c7\7"+
		"-\2\2\u00c7\r\3\2\2\2\u00c8\u00c9\t\3\2\2\u00c9\17\3\2\2\2\u00ca\u00cb"+
		"\t\4\2\2\u00cb\21\3\2\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\7\20\2\2\u00ce"+
		"\u00d2\7)\2\2\u00cf\u00d1\5\20\t\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d9\5\24\13\2\u00d6\u00d8\5\20\t\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00e3\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e0\5P)\2\u00dd\u00df\5\20"+
		"\t\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00dc\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00eb\5t;\2\u00e8\u00ea\5\20\t\2\u00e9\u00e8\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00f5\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f2\5v<\2\u00ef\u00f1\5\20"+
		"\t\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00ee\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\r\2\2\u00f8"+
		"\u00f9\7\20\2\2\u00f9\u00fa\7)\2\2\u00fa\23\3\2\2\2\u00fb\u00fc\7\n\2"+
		"\2\u00fc\u00fd\5\26\f\2\u00fd\u00fe\7\64\2\2\u00fe\25\3\2\2\2\u00ff\u0101"+
		"\5\30\r\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\27\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u010a"+
		"\5\34\17\2\u0106\u010a\5.\30\2\u0107\u010a\5\60\31\2\u0108\u010a\5F$\2"+
		"\u0109\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\31\3\2\2\2\u010b\u010c\b\16\1\2\u010c\u0134\7\u0085\2\2"+
		"\u010d\u0134\7\67\2\2\u010e\u0134\78\2\2\u010f\u0110\7B\2\2\u0110\u0111"+
		"\5\32\16\2\u0111\u0112\7C\2\2\u0112\u0134\3\2\2\2\u0113\u0114\7J\2\2\u0114"+
		"\u0134\5\32\16\21\u0115\u0116\7K\2\2\u0116\u0134\5\32\16\17\u0117\u0118"+
		"\t\5\2\2\u0118\u0134\5\32\16\r\u0119\u011a\7t\2\2\u011a\u011b\7B\2\2\u011b"+
		"\u011c\7\u0085\2\2\u011c\u011d\7r\2\2\u011d\u011e\5\36\20\2\u011e\u011f"+
		"\7C\2\2\u011f\u0120\5\32\16\7\u0120\u0134\3\2\2\2\u0121\u0122\7u\2\2\u0122"+
		"\u0123\7B\2\2\u0123\u0124\7\u0085\2\2\u0124\u0125\7r\2\2\u0125\u0126\5"+
		"\36\20\2\u0126\u0127\7C\2\2\u0127\u0128\5\32\16\6\u0128\u0134\3\2\2\2"+
		"\u0129\u012a\7v\2\2\u012a\u012b\7B\2\2\u012b\u012c\7\u0085\2\2\u012c\u012d"+
		"\7r\2\2\u012d\u012e\5\36\20\2\u012e\u012f\7C\2\2\u012f\u0130\5\32\16\5"+
		"\u0130\u0134\3\2\2\2\u0131\u0134\7\u0083\2\2\u0132\u0134\7\u0084\2\2\u0133"+
		"\u010b\3\2\2\2\u0133\u010d\3\2\2\2\u0133\u010e\3\2\2\2\u0133\u010f\3\2"+
		"\2\2\u0133\u0113\3\2\2\2\u0133\u0115\3\2\2\2\u0133\u0117\3\2\2\2\u0133"+
		"\u0119\3\2\2\2\u0133\u0121\3\2\2\2\u0133\u0129\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0132\3\2\2\2\u0134\u0159\3\2\2\2\u0135\u0136\f\16\2\2\u0136"+
		"\u0137\t\6\2\2\u0137\u0158\5\32\16\17\u0138\u0139\f\f\2\2\u0139\u013a"+
		"\t\7\2\2\u013a\u0158\5\32\16\r\u013b\u013c\f\n\2\2\u013c\u013d\7q\2\2"+
		"\u013d\u013e\5\32\16\2\u013e\u013f\7r\2\2\u013f\u0140\5\32\16\13\u0140"+
		"\u0158\3\2\2\2\u0141\u0142\f\25\2\2\u0142\u0143\7D\2\2\u0143\u0144\5f"+
		"\64\2\u0144\u0145\7E\2\2\u0145\u0158\3\2\2\2\u0146\u0147\f\24\2\2\u0147"+
		"\u0158\7A\2\2\u0148\u0149\f\22\2\2\u0149\u0158\7J\2\2\u014a\u014b\f\20"+
		"\2\2\u014b\u0158\7K\2\2\u014c\u014d\f\13\2\2\u014d\u014e\t\b\2\2\u014e"+
		"\u0158\5f\64\2\u014f\u0150\f\t\2\2\u0150\u0151\7s\2\2\u0151\u0158\7\u0085"+
		"\2\2\u0152\u0153\f\b\2\2\u0153\u0154\7B\2\2\u0154\u0155\5h\65\2\u0155"+
		"\u0156\7C\2\2\u0156\u0158\3\2\2\2\u0157\u0135\3\2\2\2\u0157\u0138\3\2"+
		"\2\2\u0157\u013b\3\2\2\2\u0157\u0141\3\2\2\2\u0157\u0146\3\2\2\2\u0157"+
		"\u0148\3\2\2\2\u0157\u014a\3\2\2\2\u0157\u014c\3\2\2\2\u0157\u014f\3\2"+
		"\2\2\u0157\u0152\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\33\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\5\36\20"+
		"\2\u015d\u0162\5*\26\2\u015e\u015f\7H\2\2\u015f\u0161\5*\26\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7I\2\2\u0166\35\3\2\2\2"+
		"\u0167\u0169\5 \21\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016b\5\"\22\2\u016b\37\3\2\2\2\u016c\u0171\7w\2\2\u016d"+
		"\u0171\7x\2\2\u016e\u0171\7y\2\2\u016f\u0171\7z\2\2\u0170\u016c\3\2\2"+
		"\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171!"+
		"\3\2\2\2\u0172\u018e\7\u0085\2\2\u0173\u018e\7|\2\2\u0174\u018e\7}\2\2"+
		"\u0175\u018e\7~\2\2\u0176\u018e\7\177\2\2\u0177\u018e\7\u0080\2\2\u0178"+
		"\u0179\7|\2\2\u0179\u017a\7D\2\2\u017a\u017b\5\32\16\2\u017b\u017c\7H"+
		"\2\2\u017c\u017d\5\32\16\2\u017d\u017e\7E\2\2\u017e\u018e\3\2\2\2\u017f"+
		"\u0180\7\u0081\2\2\u0180\u0181\7D\2\2\u0181\u0182\5\32\16\2\u0182\u0183"+
		"\7E\2\2\u0183\u018e\3\2\2\2\u0184\u0185\7\u0082\2\2\u0185\u0187\7F\2\2"+
		"\u0186\u0188\5$\23\2\u0187\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\7G\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u0172\3\2\2\2\u018d\u0173\3\2\2\2\u018d\u0174\3\2"+
		"\2\2\u018d\u0175\3\2\2\2\u018d\u0176\3\2\2\2\u018d\u0177\3\2\2\2\u018d"+
		"\u0178\3\2\2\2\u018d\u017f\3\2\2\2\u018d\u0184\3\2\2\2\u018e#\3\2\2\2"+
		"\u018f\u0190\5\36\20\2\u0190\u0195\5&\24\2\u0191\u0192\7H\2\2\u0192\u0194"+
		"\5&\24\2\u0193\u0191\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7I"+
		"\2\2\u0199%\3\2\2\2\u019a\u019e\7\u0085\2\2\u019b\u019d\5(\25\2\u019c"+
		"\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\'\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\7D\2\2\u01a2\u01a3"+
		"\5\32\16\2\u01a3\u01a4\7E\2\2\u01a4\u01aa\3\2\2\2\u01a5\u01a6\7D\2\2\u01a6"+
		"\u01a7\5\36\20\2\u01a7\u01a8\7E\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a1\3"+
		"\2\2\2\u01a9\u01a5\3\2\2\2\u01aa)\3\2\2\2\u01ab\u01af\7\u0085\2\2\u01ac"+
		"\u01ae\5(\25\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b4\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b3\7L\2\2\u01b3\u01b5\5,\27\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5+\3\2\2\2\u01b6\u01c3\5\32\16\2\u01b7\u01b8\7F\2\2\u01b8\u01bd"+
		"\5,\27\2\u01b9\u01ba\7H\2\2\u01ba\u01bc\5,\27\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\7G\2\2\u01c1\u01c3\3\2\2\2\u01c2"+
		"\u01b6\3\2\2\2\u01c2\u01b7\3\2\2\2\u01c3-\3\2\2\2\u01c4\u01c5\7{\2\2\u01c5"+
		"\u01c6\5\36\20\2\u01c6\u01cb\5&\24\2\u01c7\u01c8\7H\2\2\u01c8\u01ca\5"+
		"&\24\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\7I"+
		"\2\2\u01cf/\3\2\2\2\u01d0\u01d1\5\36\20\2\u01d1\u01d2\7\u0085\2\2\u01d2"+
		"\u01d3\7B\2\2\u01d3\u01d4\5\62\32\2\u01d4\u01d5\7C\2\2\u01d5\u01d6\5\66"+
		"\34\2\u01d6\61\3\2\2\2\u01d7\u01dc\5\64\33\2\u01d8\u01d9\7H\2\2\u01d9"+
		"\u01db\5\64\33\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01d7\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\63\3\2\2\2\u01e1\u01e3\5\36\20"+
		"\2\u01e2\u01e4\7e\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e6\5&\24\2\u01e6\65\3\2\2\2\u01e7\u01e8\7F\2\2\u01e8"+
		"\u01ec\5\26\f\2\u01e9\u01eb\58\35\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3"+
		"\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01f0\7G\2\2\u01f0\67\3\2\2\2\u01f1\u01fd\5\66\34"+
		"\2\u01f2\u01fd\7I\2\2\u01f3\u01f4\5\32\16\2\u01f4\u01f5\7I\2\2\u01f5\u01fd"+
		"\3\2\2\2\u01f6\u01fd\5:\36\2\u01f7\u01fd\5<\37\2\u01f8\u01fd\5> \2\u01f9"+
		"\u01fd\5@!\2\u01fa\u01fd\5B\"\2\u01fb\u01fd\5D#\2\u01fc\u01f1\3\2\2\2"+
		"\u01fc\u01f2\3\2\2\2\u01fc\u01f3\3\2\2\2\u01fc\u01f6\3\2\2\2\u01fc\u01f7"+
		"\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fb\3\2\2\2\u01fd9\3\2\2\2\u01fe\u01ff\79\2\2\u01ff\u0200\7B\2\2\u0200"+
		"\u0201\5\32\16\2\u0201\u0202\7I\2\2\u0202\u0203\5\32\16\2\u0203\u0204"+
		"\7I\2\2\u0204\u0205\5\32\16\2\u0205\u0206\7C\2\2\u0206\u0207\58\35\2\u0207"+
		";\3\2\2\2\u0208\u0209\79\2\2\u0209\u020a\7B\2\2\u020a\u020b\7\u0085\2"+
		"\2\u020b\u020c\7r\2\2\u020c\u020d\5\36\20\2\u020d\u020e\7C\2\2\u020e\u020f"+
		"\58\35\2\u020f=\3\2\2\2\u0210\u0211\7:\2\2\u0211\u0212\7B\2\2\u0212\u0213"+
		"\5\32\16\2\u0213\u0214\7C\2\2\u0214\u0215\58\35\2\u0215?\3\2\2\2\u0216"+
		"\u0217\7;\2\2\u0217\u0218\58\35\2\u0218\u0219\7:\2\2\u0219\u021a\7B\2"+
		"\2\u021a\u021b\5\32\16\2\u021b\u021c\7C\2\2\u021c\u021d\7I\2\2\u021dA"+
		"\3\2\2\2\u021e\u021f\7<\2\2\u021f\u0220\7B\2\2\u0220\u0221\5\32\16\2\u0221"+
		"\u0222\7C\2\2\u0222\u0225\58\35\2\u0223\u0224\7=\2\2\u0224\u0226\58\35"+
		"\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226C\3\2\2\2\u0227\u0229"+
		"\7>\2\2\u0228\u022a\5\32\16\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2"+
		"\u022a\u022b\3\2\2\2\u022b\u022c\7I\2\2\u022cE\3\2\2\2\u022d\u022e\7\177"+
		"\2\2\u022e\u022f\7?\2\2\u022f\u0235\5H%\2\u0230\u0231\5J&\2\u0231\u0232"+
		"\5H%\2\u0232\u0234\3\2\2\2\u0233\u0230\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0238\u0239\7I\2\2\u0239G\3\2\2\2\u023a\u023d\5L\'\2\u023b\u023d"+
		"\7@\2\2\u023c\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023dI\3\2\2\2\u023e\u023f"+
		"\t\t\2\2\u023fK\3\2\2\2\u0240\u0241\b\'\1\2\u0241\u0242\7\u0085\2\2\u0242"+
		"\u024a\3\2\2\2\u0243\u0244\f\3\2\2\u0244\u0245\7D\2\2\u0245\u0246\5\32"+
		"\16\2\u0246\u0247\7E\2\2\u0247\u0249\3\2\2\2\u0248\u0243\3\2\2\2\u0249"+
		"\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024bM\3\2\2\2"+
		"\u024c\u024a\3\2\2\2\u024d\u024f\5\16\b\2\u024e\u024d\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u025b\3\2\2\2\u0250\u0255\5\n\6\2\u0251\u0255\7\4\2\2\u0252"+
		"\u0255\7\60\2\2\u0253\u0255\7\3\2\2\u0254\u0250\3\2\2\2\u0254\u0251\3"+
		"\2\2\2\u0254\u0252\3\2\2\2\u0254\u0253\3\2\2\2\u0255\u0257\3\2\2\2\u0256"+
		"\u0258\5\16\b\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3"+
		"\2\2\2\u0259\u0254\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025cO\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u025f\7\f\2\2"+
		"\u025f\u0260\7\22\2\2\u0260\u0264\7)\2\2\u0261\u0263\5\20\t\2\u0262\u0261"+
		"\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0268\5R*\2\u0268\u0269\7\r\2"+
		"\2\u0269\u026a\7\22\2\2\u026a\u026b\7)\2\2\u026bQ\3\2\2\2\u026c\u0270"+
		"\5`\61\2\u026d\u026f\5\20\t\2\u026e\u026d\3\2\2\2\u026f\u0272\3\2\2\2"+
		"\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0273\u026c\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u027c\3\2\2\2\u0275"+
		"\u0279\5T+\2\u0276\u0278\5\20\t\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2"+
		"\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027d\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027c\u0275\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0285\3\2"+
		"\2\2\u027e\u0282\5\24\13\2\u027f\u0281\5\20\t\2\u0280\u027f\3\2\2\2\u0281"+
		"\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0286\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0285\u027e\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0295\3\2\2\2\u0287\u028b\5\\/\2\u0288\u028a\5\20\t\2\u0289\u0288\3\2"+
		"\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u0296\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0292\5Z.\2\u028f\u0291\5\20"+
		"\t\2\u0290\u028f\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0287\3\2"+
		"\2\2\u0295\u028e\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029d\5X-\2\u029a\u029c\5\20"+
		"\t\2\u029b\u029a\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u02a9\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a4\5b"+
		"\62\2\u02a1\u02a3\5\20\t\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2"+
		"\2\2\u02a7\u02a0\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aaS\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\7\13\2\2"+
		"\u02ad\u02ae\5\62\32\2\u02ae\u02af\7\65\2\2\u02afU\3\2\2\2\u02b0\u02b1"+
		"\7\32\2\2\u02b1\u02b2\7,\2\2\u02b2\u02b3\7-\2\2\u02b3\u02b4\7\33\2\2\u02b4"+
		"\u02b5\7,\2\2\u02b5\u02b6\7-\2\2\u02b6W\3\2\2\2\u02b7\u02b8\7\f\2\2\u02b8"+
		"\u02b9\7\27\2\2\u02b9\u02ba\7\30\2\2\u02ba\u02bb\7,\2\2\u02bb\u02bc\7"+
		"-\2\2\u02bc\u02bd\7+\2\2\u02bdY\3\2\2\2\u02be\u02bf\7\f\2\2\u02bf\u02c0"+
		"\7\23\2\2\u02c0\u02c1\7\31\2\2\u02c1\u02c2\7,\2\2\u02c2\u02c4\7-\2\2\u02c3"+
		"\u02c5\5V,\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2"+
		"\2\u02c6\u02ca\7)\2\2\u02c7\u02c9\5\20\t\2\u02c8\u02c7\3\2\2\2\u02c9\u02cc"+
		"\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cd\u02ce\7\r\2\2\u02ce\u02cf\7\23\2\2\u02cf\u02d0\7"+
		")\2\2\u02d0[\3\2\2\2\u02d1\u02d2\7\f\2\2\u02d2\u02d3\7\24\2\2\u02d3\u02d4"+
		"\7\31\2\2\u02d4\u02d5\7,\2\2\u02d5\u02d7\7-\2\2\u02d6\u02d8\5V,\2\u02d7"+
		"\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dd\7)"+
		"\2\2\u02da\u02dc\5\20\t\2\u02db\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e7\3\2\2\2\u02df\u02dd\3\2"+
		"\2\2\u02e0\u02e4\5`\61\2\u02e1\u02e3\5\20\t\2\u02e2\u02e1\3\2\2\2\u02e3"+
		"\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e8\3\2"+
		"\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e0\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02f2\3\2\2\2\u02e9\u02ed\5^\60\2\u02ea\u02ec\5\20\t\2\u02eb\u02ea\3"+
		"\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02e9\3\2\2\2\u02f1\u02f4\3\2"+
		"\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02fe\3\2\2\2\u02f4"+
		"\u02f2\3\2\2\2\u02f5\u02f6\7\f\2\2\u02f6\u02f7\t\n\2\2\u02f7\u02fb\7+"+
		"\2\2\u02f8\u02fa\5\20\t\2\u02f9\u02f8\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb"+
		"\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2"+
		"\2\2\u02fe\u02f5\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0301\7\r\2\2\u0301\u0302\7\24\2\2\u0302\u0303\7)\2\2\u0303]\3\2\2\2"+
		"\u0304\u0305\7\f\2\2\u0305\u0306\7\36\2\2\u0306\u0307\7\37\2\2\u0307\u0308"+
		"\7,\2\2\u0308\u030a\7-\2\2\u0309\u030b\5V,\2\u030a\u0309\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\7)\2\2\u030d\u030e\5N("+
		"\2\u030e\u030f\7\r\2\2\u030f\u0310\7\36\2\2\u0310\u0311\7)\2\2\u0311_"+
		"\3\2\2\2\u0312\u0313\7\f\2\2\u0313\u0315\7\25\2\2\u0314\u0316\5V,\2\u0315"+
		"\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7)"+
		"\2\2\u0318\u0319\5N(\2\u0319\u031a\7\r\2\2\u031a\u031b\7\25\2\2\u031b"+
		"\u031c\7)\2\2\u031ca\3\2\2\2\u031d\u031e\7\f\2\2\u031e\u031f\7 \2\2\u031f"+
		"\u0323\7)\2\2\u0320\u0322\5\20\t\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2"+
		"\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2\2\2\u0325"+
		"\u0323\3\2\2\2\u0326\u032a\5n8\2\u0327\u0329\5\20\t\2\u0328\u0327\3\2"+
		"\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b"+
		"\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u0331\5p9\2\u032e\u0330\5\20"+
		"\t\2\u032f\u032e\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u033d\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0338\5d"+
		"\63\2\u0335\u0337\5\20\t\2\u0336\u0335\3\2\2\2\u0337\u033a\3\2\2\2\u0338"+
		"\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2"+
		"\2\2\u033b\u0334\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u0349\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0344\5r"+
		":\2\u0341\u0343\5\20\t\2\u0342\u0341\3\2\2\2\u0343\u0346\3\2\2\2\u0344"+
		"\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2"+
		"\2\2\u0347\u0340\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034c\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u034d\7\r"+
		"\2\2\u034d\u034e\7 \2\2\u034e\u034f\7)\2\2\u034fc\3\2\2\2\u0350\u0352"+
		"\7\t\2\2\u0351\u0353\5f\64\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0364\7\63\2\2\u0355\u0356\7\f\2\2\u0356\u0357\7"+
		"\36\2\2\u0357\u0358\7\37\2\2\u0358\u0359\7,\2\2\u0359\u035b\7-\2\2\u035a"+
		"\u035c\5V,\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2"+
		"\2\u035d\u035e\7)\2\2\u035e\u035f\5N(\2\u035f\u0360\7\r\2\2\u0360\u0361"+
		"\7\36\2\2\u0361\u0362\7)\2\2\u0362\u0364\3\2\2\2\u0363\u0350\3\2\2\2\u0363"+
		"\u0355\3\2\2\2\u0364e\3\2\2\2\u0365\u0366\b\64\1\2\u0366\u038e\7\u0085"+
		"\2\2\u0367\u038e\7\67\2\2\u0368\u038e\78\2\2\u0369\u036a\7B\2\2\u036a"+
		"\u036b\5f\64\2\u036b\u036c\7C\2\2\u036c\u038e\3\2\2\2\u036d\u036e\7J\2"+
		"\2\u036e\u038e\5f\64\21\u036f\u0370\7K\2\2\u0370\u038e\5f\64\17\u0371"+
		"\u0372\t\5\2\2\u0372\u038e\5f\64\r\u0373\u0374\7t\2\2\u0374\u0375\7B\2"+
		"\2\u0375\u0376\7\u0085\2\2\u0376\u0377\7r\2\2\u0377\u0378\5j\66\2\u0378"+
		"\u0379\7C\2\2\u0379\u037a\5f\64\7\u037a\u038e\3\2\2\2\u037b\u037c\7u\2"+
		"\2\u037c\u037d\7B\2\2\u037d\u037e\7\u0085\2\2\u037e\u037f\7r\2\2\u037f"+
		"\u0380\5j\66\2\u0380\u0381\7C\2\2\u0381\u0382\5f\64\6\u0382\u038e\3\2"+
		"\2\2\u0383\u0384\7v\2\2\u0384\u0385\7B\2\2\u0385\u0386\7\u0085\2\2\u0386"+
		"\u0387\7r\2\2\u0387\u0388\5j\66\2\u0388\u0389\7C\2\2\u0389\u038a\5f\64"+
		"\5\u038a\u038e\3\2\2\2\u038b\u038e\7\u0083\2\2\u038c\u038e\7\u0084\2\2"+
		"\u038d\u0365\3\2\2\2\u038d\u0367\3\2\2\2\u038d\u0368\3\2\2\2\u038d\u0369"+
		"\3\2\2\2\u038d\u036d\3\2\2\2\u038d\u036f\3\2\2\2\u038d\u0371\3\2\2\2\u038d"+
		"\u0373\3\2\2\2\u038d\u037b\3\2\2\2\u038d\u0383\3\2\2\2\u038d\u038b\3\2"+
		"\2\2\u038d\u038c\3\2\2\2\u038e\u03b5\3\2\2\2\u038f\u0390\f\16\2\2\u0390"+
		"\u0391\t\6\2\2\u0391\u03b4\5f\64\17\u0392\u0393\f\f\2\2\u0393\u0394\t"+
		"\7\2\2\u0394\u0395\5f\64\r\u0395\u0396\b\64\1\2\u0396\u03b4\3\2\2\2\u0397"+
		"\u0398\f\13\2\2\u0398\u0399\t\b\2\2\u0399\u03b4\5f\64\f\u039a\u039b\f"+
		"\n\2\2\u039b\u039c\7q\2\2\u039c\u039d\5f\64\2\u039d\u039e\7r\2\2\u039e"+
		"\u039f\5f\64\13\u039f\u03b4\3\2\2\2\u03a0\u03a1\f\25\2\2\u03a1\u03a2\7"+
		"D\2\2\u03a2\u03a3\5f\64\2\u03a3\u03a4\7E\2\2\u03a4\u03b4\3\2\2\2\u03a5"+
		"\u03a6\f\24\2\2\u03a6\u03b4\7A\2\2\u03a7\u03a8\f\22\2\2\u03a8\u03b4\7"+
		"J\2\2\u03a9\u03aa\f\20\2\2\u03aa\u03b4\7K\2\2\u03ab\u03ac\f\t\2\2\u03ac"+
		"\u03ad\7s\2\2\u03ad\u03b4\7\u0085\2\2\u03ae\u03af\f\b\2\2\u03af\u03b0"+
		"\7B\2\2\u03b0\u03b1\5h\65\2\u03b1\u03b2\7C\2\2\u03b2\u03b4\3\2\2\2\u03b3"+
		"\u038f\3\2\2\2\u03b3\u0392\3\2\2\2\u03b3\u0397\3\2\2\2\u03b3\u039a\3\2"+
		"\2\2\u03b3\u03a0\3\2\2\2\u03b3\u03a5\3\2\2\2\u03b3\u03a7\3\2\2\2\u03b3"+
		"\u03a9\3\2\2\2\u03b3\u03ab\3\2\2\2\u03b3\u03ae\3\2\2\2\u03b4\u03b7\3\2"+
		"\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6g\3\2\2\2\u03b7\u03b5"+
		"\3\2\2\2\u03b8\u03bd\5f\64\2\u03b9\u03ba\7H\2\2\u03ba\u03bc\5f\64\2\u03bb"+
		"\u03b9\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2"+
		"\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03b8\3\2\2\2\u03c0"+
		"\u03c1\3\2\2\2\u03c1i\3\2\2\2\u03c2\u03c4\t\13\2\2\u03c3\u03c2\3\2\2\2"+
		"\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\5l\67\2\u03c6k\3"+
		"\2\2\2\u03c7\u03d5\7|\2\2\u03c8\u03c9\7|\2\2\u03c9\u03ca\7D\2\2\u03ca"+
		"\u03cb\5f\64\2\u03cb\u03cc\7H\2\2\u03cc\u03cd\5f\64\2\u03cd\u03ce\7E\2"+
		"\2\u03ce\u03d5\3\2\2\2\u03cf\u03d0\7\u0081\2\2\u03d0\u03d1\7D\2\2\u03d1"+
		"\u03d2\5f\64\2\u03d2\u03d3\7E\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03c7\3\2"+
		"\2\2\u03d4\u03c8\3\2\2\2\u03d4\u03cf\3\2\2\2\u03d5m\3\2\2\2\u03d6\u03d7"+
		"\7\f\2\2\u03d7\u03d8\7!\2\2\u03d8\u03d9\7\30\2\2\u03d9\u03da\7,\2\2\u03da"+
		"\u03db\7-\2\2\u03db\u03dc\7+\2\2\u03dco\3\2\2\2\u03dd\u03de\7\f\2\2\u03de"+
		"\u03df\7\"\2\2\u03df\u03e0\7\30\2\2\u03e0\u03e1\7,\2\2\u03e1\u03e2\7-"+
		"\2\2\u03e2\u03e3\7+\2\2\u03e3q\3\2\2\2\u03e4\u03e5\7\f\2\2\u03e5\u03e7"+
		"\7#\2\2\u03e6\u03e8\5V,\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03ea\7+\2\2\u03eas\3\2\2\2\u03eb\u03ec\7\f\2\2\u03ec"+
		"\u03ed\7$\2\2\u03ed\u03ee\7)\2\2\u03ee\u03ef\5N(\2\u03ef\u03f0\7\r\2\2"+
		"\u03f0\u03f1\7$\2\2\u03f1\u03f2\7)\2\2\u03f2u\3\2\2\2\u03f3\u03f4\7\f"+
		"\2\2\u03f4\u03f5\7%\2\2\u03f5\u03f9\7)\2\2\u03f6\u03f8\5\20\t\2\u03f7"+
		"\u03f6\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2"+
		"\2\2\u03fa\u0405\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fc\u0400\5x=\2\u03fd\u03ff"+
		"\5\20\t\2\u03fe\u03fd\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2"+
		"\u0400\u0401\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u03fc"+
		"\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0408\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u0409\7\r\2\2\u0409\u040a\7%"+
		"\2\2\u040a\u040b\7)\2\2\u040bw\3\2\2\2\u040c\u040d\7\f\2\2\u040d\u040e"+
		"\7&\2\2\u040e\u0412\7)\2\2\u040f\u0411\5\20\t\2\u0410\u040f\3\2\2\2\u0411"+
		"\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u041c\3\2"+
		"\2\2\u0414\u0412\3\2\2\2\u0415\u0419\5z>\2\u0416\u0418\5\20\t\2\u0417"+
		"\u0416\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2"+
		"\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u0415\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041d\u0425\3\2\2\2\u041e\u0422\5|?\2\u041f\u0421\5\20"+
		"\t\2\u0420\u041f\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u041e\3\2"+
		"\2\2\u0425\u0426\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\7\r\2\2\u0428"+
		"\u0429\7&\2\2\u0429\u042a\7)\2\2\u042ay\3\2\2\2\u042b\u042c\7\f\2\2\u042c"+
		"\u042d\7\'\2\2\u042d\u042e\7)\2\2\u042e\u042f\5N(\2\u042f\u0430\7\r\2"+
		"\2\u0430\u0431\7\'\2\2\u0431\u0432\7)\2\2\u0432{\3\2\2\2\u0433\u0434\7"+
		"\f\2\2\u0434\u0435\7(\2\2\u0435\u0436\7)\2\2\u0436\u0437\5N(\2\u0437\u0438"+
		"\7\r\2\2\u0438\u0439\7(\2\2\u0439\u043a\7)\2\2\u043a}\3\2\2\2h\177\u0084"+
		"\u008b\u0092\u0098\u009f\u00a2\u00a6\u00ae\u00bc\u00c0\u00d2\u00d9\u00e0"+
		"\u00e5\u00eb\u00f2\u00f5\u0102\u0109\u0133\u0157\u0159\u0162\u0168\u0170"+
		"\u0189\u018d\u0195\u019e\u01a9\u01af\u01b4\u01bd\u01c2\u01cb\u01dc\u01df"+
		"\u01e3\u01ec\u01fc\u0225\u0229\u0235\u023c\u024a\u024e\u0254\u0257\u025b"+
		"\u0264\u0270\u0273\u0279\u027c\u0282\u0285\u028b\u0292\u0295\u0297\u029d"+
		"\u02a4\u02a9\u02c4\u02ca\u02d7\u02dd\u02e4\u02e7\u02ed\u02f2\u02fb\u02fe"+
		"\u030a\u0315\u0323\u032a\u0331\u0338\u033d\u0344\u0349\u0352\u035b\u0363"+
		"\u038d\u03b3\u03b5\u03bd\u03c0\u03c3\u03d4\u03e7\u03f9\u0400\u0405\u0412"+
		"\u0419\u041c\u0422\u0425";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}