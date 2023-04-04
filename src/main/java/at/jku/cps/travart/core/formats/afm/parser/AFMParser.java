package at.jku.cps.travart.core.formats.afm.parser;


// Generated from src/main/java/at/jku/cps/travart/afm/decision/parser/AFM.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AFMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ADD=15, SUB=16, MULT=17, 
		DIV=18, MOD=19, POW=20, ASIG=21, ABS=22, MAX=23, MIN=24, COS=25, SIN=26, 
		SUM=27, AND=28, OR=29, NOT=30, IFF=31, IMPLIES=32, REQUIRES=33, EXCLUDES=34, 
		HIGHER_THAN=35, LOWER_THAN=36, HIGHER_EQUAL_THAN=37, LOWER_EQUAL_THAN=38, 
		EQUAL=39, DISTINCT=40, INTEGER=41, WORD=42, INT=43, DOUBLE=44, STRING=45, 
		SPACE=46, WS=47;
	public static final int
		RULE_feature_model = 0, RULE_relationships_block = 1, RULE_relationship_spec = 2, 
		RULE_init_spec = 3, RULE_cardinality = 4, RULE_cardinal_spec = 5, RULE_obligatory_spec = 6, 
		RULE_optional_spec = 7, RULE_non_cardinal_spec = 8, RULE_attributes_block = 9, 
		RULE_attribute_spec = 10, RULE_attribute_name = 11, RULE_attribute_domain = 12, 
		RULE_discrete_domain_spec = 13, RULE_range_domain_spec = 14, RULE_domain_range = 15, 
		RULE_attribute_default_value = 16, RULE_attribute_null_value = 17, RULE_value_spec = 18, 
		RULE_constraints_block = 19, RULE_constraint_spec = 20, RULE_brackets_spec = 21, 
		RULE_simple_spec = 22, RULE_expression = 23, RULE_logical_operator = 24, 
		RULE_arithmetic_operator = 25, RULE_relational_operator = 26, RULE_number = 27, 
		RULE_variable = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"feature_model", "relationships_block", "relationship_spec", "init_spec", 
			"cardinality", "cardinal_spec", "obligatory_spec", "optional_spec", "non_cardinal_spec", 
			"attributes_block", "attribute_spec", "attribute_name", "attribute_domain", 
			"discrete_domain_spec", "range_domain_spec", "domain_range", "attribute_default_value", 
			"attribute_null_value", "value_spec", "constraints_block", "constraint_spec", 
			"brackets_spec", "simple_spec", "expression", "logical_operator", "arithmetic_operator", 
			"relational_operator", "number", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%Relationships'", "';'", "':'", "'['", "','", "']'", "'{'", "'}'", 
			"'%Attributes'", "'.'", "'to'", "'%Constraints'", "'('", "')'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'='", "'abs'", "'max'", "'min'", 
			"'cos'", "'sin'", "'sum'", "'AND'", "'OR'", "'NOT'", "'IFF'", "'IMPLIES'", 
			"'REQUIRES'", "'EXCLUDES'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'Integer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ADD", "SUB", "MULT", "DIV", "MOD", "POW", "ASIG", 
			"ABS", "MAX", "MIN", "COS", "SIN", "SUM", "AND", "OR", "NOT", "IFF", 
			"IMPLIES", "REQUIRES", "EXCLUDES", "HIGHER_THAN", "LOWER_THAN", "HIGHER_EQUAL_THAN", 
			"LOWER_EQUAL_THAN", "EQUAL", "DISTINCT", "INTEGER", "WORD", "INT", "DOUBLE", 
			"STRING", "SPACE", "WS"
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
	public String getGrammarFileName() { return "AFM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AFMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Feature_modelContext extends ParserRuleContext {
		public Relationships_blockContext relationships_block() {
			return getRuleContext(Relationships_blockContext.class,0);
		}
		public Attributes_blockContext attributes_block() {
			return getRuleContext(Attributes_blockContext.class,0);
		}
		public Constraints_blockContext constraints_block() {
			return getRuleContext(Constraints_blockContext.class,0);
		}
		public Feature_modelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_model; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitFeature_model(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_modelContext feature_model() throws RecognitionException {
		Feature_modelContext _localctx = new Feature_modelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_feature_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			relationships_block();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(59);
				attributes_block();
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(62);
				constraints_block();
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

	public static class Relationships_blockContext extends ParserRuleContext {
		public List<Relationship_specContext> relationship_spec() {
			return getRuleContexts(Relationship_specContext.class);
		}
		public Relationship_specContext relationship_spec(int i) {
			return getRuleContext(Relationship_specContext.class,i);
		}
		public Relationships_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationships_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitRelationships_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relationships_blockContext relationships_block() throws RecognitionException {
		Relationships_blockContext _localctx = new Relationships_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_relationships_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__0);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD || _la==SPACE) {
				{
				{
				setState(66);
				relationship_spec();
				}
				}
				setState(71);
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

	public static class Relationship_specContext extends ParserRuleContext {
		public Init_specContext init_spec() {
			return getRuleContext(Init_specContext.class,0);
		}
		public List<Non_cardinal_specContext> non_cardinal_spec() {
			return getRuleContexts(Non_cardinal_specContext.class);
		}
		public Non_cardinal_specContext non_cardinal_spec(int i) {
			return getRuleContext(Non_cardinal_specContext.class,i);
		}
		public List<Cardinal_specContext> cardinal_spec() {
			return getRuleContexts(Cardinal_specContext.class);
		}
		public Cardinal_specContext cardinal_spec(int i) {
			return getRuleContext(Cardinal_specContext.class,i);
		}
		public Relationship_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitRelationship_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relationship_specContext relationship_spec() throws RecognitionException {
		Relationship_specContext _localctx = new Relationship_specContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_relationship_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			init_spec();
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(73);
					non_cardinal_spec();
					}
					break;
				case 2:
					{
					setState(74);
					cardinal_spec();
					}
					break;
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << WORD) | (1L << SPACE))) != 0) );
			setState(79);
			match(T__1);
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

	public static class Init_specContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(AFMParser.WORD, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public Init_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitInit_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_specContext init_spec() throws RecognitionException {
		Init_specContext _localctx = new Init_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_init_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(81);
				match(SPACE);
				}
			}

			setState(84);
			match(WORD);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(85);
				match(SPACE);
				}
			}

			setState(88);
			match(T__2);
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(89);
				match(SPACE);
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

	public static class CardinalityContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(AFMParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AFMParser.INT, i);
		}
		public CardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardinality; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitCardinality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardinalityContext cardinality() throws RecognitionException {
		CardinalityContext _localctx = new CardinalityContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cardinality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__3);
			setState(93);
			match(INT);
			setState(94);
			match(T__4);
			setState(95);
			match(INT);
			setState(96);
			match(T__5);
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

	public static class Cardinal_specContext extends ParserRuleContext {
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public List<Obligatory_specContext> obligatory_spec() {
			return getRuleContexts(Obligatory_specContext.class);
		}
		public Obligatory_specContext obligatory_spec(int i) {
			return getRuleContext(Obligatory_specContext.class,i);
		}
		public Cardinal_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardinal_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitCardinal_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cardinal_specContext cardinal_spec() throws RecognitionException {
		Cardinal_specContext _localctx = new Cardinal_specContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cardinal_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(98);
				match(SPACE);
				}
			}

			setState(101);
			cardinality();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(102);
				match(SPACE);
				}
			}

			setState(105);
			match(T__6);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				obligatory_spec();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD || _la==SPACE );
			setState(111);
			match(T__7);
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

	public static class Obligatory_specContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(AFMParser.WORD, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public Obligatory_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obligatory_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitObligatory_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obligatory_specContext obligatory_spec() throws RecognitionException {
		Obligatory_specContext _localctx = new Obligatory_specContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_obligatory_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(113);
				match(SPACE);
				}
			}

			setState(116);
			match(WORD);
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(117);
				match(SPACE);
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

	public static class Optional_specContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(AFMParser.WORD, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public Optional_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitOptional_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_specContext optional_spec() throws RecognitionException {
		Optional_specContext _localctx = new Optional_specContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_optional_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(120);
				match(SPACE);
				}
			}

			setState(123);
			match(T__3);
			setState(124);
			match(WORD);
			setState(125);
			match(T__5);
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(126);
				match(SPACE);
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

	public static class Non_cardinal_specContext extends ParserRuleContext {
		public Obligatory_specContext obligatory_spec() {
			return getRuleContext(Obligatory_specContext.class,0);
		}
		public Optional_specContext optional_spec() {
			return getRuleContext(Optional_specContext.class,0);
		}
		public Non_cardinal_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_cardinal_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitNon_cardinal_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_cardinal_specContext non_cardinal_spec() throws RecognitionException {
		Non_cardinal_specContext _localctx = new Non_cardinal_specContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_non_cardinal_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(129);
				obligatory_spec();
				}
				break;
			case 2:
				{
				setState(130);
				optional_spec();
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

	public static class Attributes_blockContext extends ParserRuleContext {
		public List<Attribute_specContext> attribute_spec() {
			return getRuleContexts(Attribute_specContext.class);
		}
		public Attribute_specContext attribute_spec(int i) {
			return getRuleContext(Attribute_specContext.class,i);
		}
		public Attributes_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitAttributes_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attributes_blockContext attributes_block() throws RecognitionException {
		Attributes_blockContext _localctx = new Attributes_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributes_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__8);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(134);
				attribute_spec();
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

	public static class Attribute_specContext extends ParserRuleContext {
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_domainContext attribute_domain() {
			return getRuleContext(Attribute_domainContext.class,0);
		}
		public Attribute_default_valueContext attribute_default_value() {
			return getRuleContext(Attribute_default_valueContext.class,0);
		}
		public Attribute_null_valueContext attribute_null_value() {
			return getRuleContext(Attribute_null_valueContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public Attribute_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitAttribute_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_specContext attribute_spec() throws RecognitionException {
		Attribute_specContext _localctx = new Attribute_specContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			attribute_name();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(141);
				match(SPACE);
				}
			}

			setState(144);
			match(T__2);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(145);
				match(SPACE);
				}
				break;
			}
			setState(148);
			attribute_domain();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(149);
				match(SPACE);
				}
			}

			setState(152);
			match(T__4);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(153);
				match(SPACE);
				}
			}

			setState(156);
			attribute_default_value();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(157);
				match(SPACE);
				}
			}

			setState(160);
			match(T__4);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(161);
				match(SPACE);
				}
			}

			setState(164);
			attribute_null_value();
			setState(165);
			match(T__1);
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

	public static class Attribute_nameContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(AFMParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(AFMParser.WORD, i);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(WORD);
			setState(168);
			match(T__9);
			setState(169);
			match(WORD);
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

	public static class Attribute_domainContext extends ParserRuleContext {
		public Discrete_domain_specContext discrete_domain_spec() {
			return getRuleContext(Discrete_domain_specContext.class,0);
		}
		public Range_domain_specContext range_domain_spec() {
			return getRuleContext(Range_domain_specContext.class,0);
		}
		public Attribute_domainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_domain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitAttribute_domain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_domainContext attribute_domain() throws RecognitionException {
		Attribute_domainContext _localctx = new Attribute_domainContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attribute_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(171);
				discrete_domain_spec();
				}
				break;
			case INTEGER:
			case SPACE:
				{
				setState(172);
				range_domain_spec();
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

	public static class Discrete_domain_specContext extends ParserRuleContext {
		public List<Value_specContext> value_spec() {
			return getRuleContexts(Value_specContext.class);
		}
		public Value_specContext value_spec(int i) {
			return getRuleContext(Value_specContext.class,i);
		}
		public Discrete_domain_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discrete_domain_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitDiscrete_domain_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Discrete_domain_specContext discrete_domain_spec() throws RecognitionException {
		Discrete_domain_specContext _localctx = new Discrete_domain_specContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_discrete_domain_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__3);
			setState(176);
			value_spec();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(177);
				match(T__4);
				setState(178);
				value_spec();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(T__5);
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

	public static class Range_domain_specContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(AFMParser.INTEGER, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public List<Domain_rangeContext> domain_range() {
			return getRuleContexts(Domain_rangeContext.class);
		}
		public Domain_rangeContext domain_range(int i) {
			return getRuleContext(Domain_rangeContext.class,i);
		}
		public Range_domain_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_domain_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitRange_domain_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_domain_specContext range_domain_spec() throws RecognitionException {
		Range_domain_specContext _localctx = new Range_domain_specContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_range_domain_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(186);
				match(SPACE);
				}
			}

			setState(189);
			match(INTEGER);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(190);
				match(SPACE);
				}
				break;
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(193);
				domain_range();
				}
				}
				setState(198);
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

	public static class Domain_rangeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(AFMParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AFMParser.INT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public Domain_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitDomain_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Domain_rangeContext domain_range() throws RecognitionException {
		Domain_rangeContext _localctx = new Domain_rangeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_domain_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__3);
			setState(200);
			match(INT);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(201);
				match(SPACE);
				}
			}

			setState(204);
			match(T__10);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(205);
				match(SPACE);
				}
			}

			setState(208);
			match(INT);
			setState(209);
			match(T__5);
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

	public static class Attribute_default_valueContext extends ParserRuleContext {
		public Value_specContext value_spec() {
			return getRuleContext(Value_specContext.class,0);
		}
		public Attribute_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_default_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitAttribute_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_default_valueContext attribute_default_value() throws RecognitionException {
		Attribute_default_valueContext _localctx = new Attribute_default_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attribute_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			value_spec();
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

	public static class Attribute_null_valueContext extends ParserRuleContext {
		public Value_specContext value_spec() {
			return getRuleContext(Value_specContext.class,0);
		}
		public Attribute_null_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_null_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitAttribute_null_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_null_valueContext attribute_null_value() throws RecognitionException {
		Attribute_null_valueContext _localctx = new Attribute_null_valueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attribute_null_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			value_spec();
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

	public static class Value_specContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(AFMParser.WORD, 0); }
		public TerminalNode INT() { return getToken(AFMParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(AFMParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(AFMParser.STRING, 0); }
		public Value_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitValue_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_specContext value_spec() throws RecognitionException {
		Value_specContext _localctx = new Value_specContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
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

	public static class Constraints_blockContext extends ParserRuleContext {
		public List<Constraint_specContext> constraint_spec() {
			return getRuleContexts(Constraint_specContext.class);
		}
		public Constraint_specContext constraint_spec(int i) {
			return getRuleContext(Constraint_specContext.class,i);
		}
		public Constraints_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraints_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitConstraints_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constraints_blockContext constraints_block() throws RecognitionException {
		Constraints_blockContext _localctx = new Constraints_blockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constraints_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__11);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << NOT) | (1L << WORD) | (1L << INT) | (1L << DOUBLE) | (1L << SPACE))) != 0)) {
				{
				{
				setState(218);
				constraint_spec();
				}
				}
				setState(223);
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

	public static class Constraint_specContext extends ParserRuleContext {
		public Brackets_specContext brackets_spec() {
			return getRuleContext(Brackets_specContext.class,0);
		}
		public Simple_specContext simple_spec() {
			return getRuleContext(Simple_specContext.class,0);
		}
		public Constraint_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitConstraint_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constraint_specContext constraint_spec() throws RecognitionException {
		Constraint_specContext _localctx = new Constraint_specContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constraint_spec);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				brackets_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				simple_spec();
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

	public static class Brackets_specContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(AFMParser.WORD, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public List<Simple_specContext> simple_spec() {
			return getRuleContexts(Simple_specContext.class);
		}
		public Simple_specContext simple_spec(int i) {
			return getRuleContext(Simple_specContext.class,i);
		}
		public Brackets_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitBrackets_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Brackets_specContext brackets_spec() throws RecognitionException {
		Brackets_specContext _localctx = new Brackets_specContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_brackets_spec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(228);
				match(SPACE);
				}
			}

			setState(231);
			match(WORD);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(232);
				match(SPACE);
				}
			}

			setState(235);
			match(T__6);
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(236);
				match(SPACE);
				}
				break;
			}
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					simple_spec();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(245);
				match(SPACE);
				}
			}

			setState(248);
			match(T__7);
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(249);
				match(SPACE);
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

	public static class Simple_specContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public Simple_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitSimple_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_specContext simple_spec() throws RecognitionException {
		Simple_specContext _localctx = new Simple_specContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simple_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(252);
				match(SPACE);
				}
				break;
			}
			setState(255);
			expression(0);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(256);
				match(SPACE);
				}
			}

			setState(259);
			match(T__1);
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(260);
				match(SPACE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithmeticExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Arithmetic_operatorContext arithmetic_operator() {
			return getRuleContext(Arithmetic_operatorContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public ArithmeticExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitArithmeticExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AFMParser.AND, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public AndExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public ParenthesisExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitParenthesisExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public RelationalExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitRelationalExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(AFMParser.OR, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public OrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public AtomContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public LogicalExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitLogicalExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(AFMParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AFMParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AFMParser.SPACE, i);
		}
		public NotExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitNotExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(264);
					match(SPACE);
					}
				}

				setState(267);
				match(T__12);
				setState(268);
				expression(0);
				setState(269);
				match(T__13);
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(270);
					match(SPACE);
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(273);
					match(SPACE);
					}
				}

				setState(276);
				match(NOT);
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(277);
					match(SPACE);
					}
					break;
				}
				setState(280);
				expression(7);
				}
				break;
			case 3:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(281);
					match(SPACE);
					}
				}

				setState(286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(284);
					variable();
					}
					break;
				case INT:
				case DOUBLE:
					{
					setState(285);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(288);
					match(SPACE);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(295);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(294);
							match(SPACE);
							}
						}

						setState(297);
						arithmetic_operator();
						setState(299);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
						case 1:
							{
							setState(298);
							match(SPACE);
							}
							break;
						}
						setState(301);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(303);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(305);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(304);
							match(SPACE);
							}
						}

						setState(307);
						relational_operator();
						setState(309);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(308);
							match(SPACE);
							}
							break;
						}
						setState(311);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(314);
							match(SPACE);
							}
						}

						setState(317);
						match(AND);
						setState(319);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(318);
							match(SPACE);
							}
							break;
						}
						setState(321);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(324);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(323);
							match(SPACE);
							}
						}

						setState(326);
						match(OR);
						setState(328);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(327);
							match(SPACE);
							}
							break;
						}
						setState(330);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(333);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(332);
							match(SPACE);
							}
						}

						setState(335);
						logical_operator();
						setState(337);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
						case 1:
							{
							setState(336);
							match(SPACE);
							}
							break;
						}
						setState(339);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode IFF() { return getToken(AFMParser.IFF, 0); }
		public TerminalNode IMPLIES() { return getToken(AFMParser.IMPLIES, 0); }
		public TerminalNode REQUIRES() { return getToken(AFMParser.REQUIRES, 0); }
		public TerminalNode EXCLUDES() { return getToken(AFMParser.EXCLUDES, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IFF) | (1L << IMPLIES) | (1L << REQUIRES) | (1L << EXCLUDES))) != 0)) ) {
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

	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(AFMParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AFMParser.SUB, 0); }
		public TerminalNode MULT() { return getToken(AFMParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(AFMParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(AFMParser.MOD, 0); }
		public TerminalNode POW() { return getToken(AFMParser.POW, 0); }
		public TerminalNode ASIG() { return getToken(AFMParser.ASIG, 0); }
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitArithmetic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << POW) | (1L << ASIG))) != 0)) ) {
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

	public static class Relational_operatorContext extends ParserRuleContext {
		public TerminalNode HIGHER_THAN() { return getToken(AFMParser.HIGHER_THAN, 0); }
		public TerminalNode LOWER_THAN() { return getToken(AFMParser.LOWER_THAN, 0); }
		public TerminalNode HIGHER_EQUAL_THAN() { return getToken(AFMParser.HIGHER_EQUAL_THAN, 0); }
		public TerminalNode LOWER_EQUAL_THAN() { return getToken(AFMParser.LOWER_EQUAL_THAN, 0); }
		public TerminalNode EQUAL() { return getToken(AFMParser.EQUAL, 0); }
		public TerminalNode DISTINCT() { return getToken(AFMParser.DISTINCT, 0); }
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << HIGHER_EQUAL_THAN) | (1L << LOWER_EQUAL_THAN) | (1L << EQUAL) | (1L << DISTINCT))) != 0)) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AFMParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(AFMParser.DOUBLE, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(AFMParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(AFMParser.WORD, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variable);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(WORD);
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(355);
					match(T__9);
					setState(356);
					match(WORD);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(WORD);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u016d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\5\2?\n\2\3"+
		"\2\5\2B\n\2\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\4\3\4\3\4\6\4N\n\4\r\4\16"+
		"\4O\3\4\3\4\3\5\5\5U\n\5\3\5\3\5\5\5Y\n\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\5\7f\n\7\3\7\3\7\5\7j\n\7\3\7\3\7\6\7n\n\7\r\7\16\7o"+
		"\3\7\3\7\3\b\5\bu\n\b\3\b\3\b\5\by\n\b\3\t\5\t|\n\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0082\n\t\3\n\3\n\5\n\u0086\n\n\3\13\3\13\7\13\u008a\n\13\f\13\16\13"+
		"\u008d\13\13\3\f\3\f\5\f\u0091\n\f\3\f\3\f\5\f\u0095\n\f\3\f\3\f\5\f\u0099"+
		"\n\f\3\f\3\f\5\f\u009d\n\f\3\f\3\f\5\f\u00a1\n\f\3\f\3\f\5\f\u00a5\n\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00b0\n\16\3\17\3\17\3\17"+
		"\3\17\7\17\u00b6\n\17\f\17\16\17\u00b9\13\17\3\17\3\17\3\20\5\20\u00be"+
		"\n\20\3\20\3\20\5\20\u00c2\n\20\3\20\7\20\u00c5\n\20\f\20\16\20\u00c8"+
		"\13\20\3\21\3\21\3\21\5\21\u00cd\n\21\3\21\3\21\5\21\u00d1\n\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25\u00de\n\25\f\25"+
		"\16\25\u00e1\13\25\3\26\3\26\5\26\u00e5\n\26\3\27\5\27\u00e8\n\27\3\27"+
		"\3\27\5\27\u00ec\n\27\3\27\3\27\5\27\u00f0\n\27\3\27\7\27\u00f3\n\27\f"+
		"\27\16\27\u00f6\13\27\3\27\5\27\u00f9\n\27\3\27\3\27\5\27\u00fd\n\27\3"+
		"\30\5\30\u0100\n\30\3\30\3\30\5\30\u0104\n\30\3\30\3\30\5\30\u0108\n\30"+
		"\3\31\3\31\5\31\u010c\n\31\3\31\3\31\3\31\3\31\5\31\u0112\n\31\3\31\5"+
		"\31\u0115\n\31\3\31\3\31\5\31\u0119\n\31\3\31\3\31\5\31\u011d\n\31\3\31"+
		"\3\31\5\31\u0121\n\31\3\31\5\31\u0124\n\31\5\31\u0126\n\31\3\31\3\31\5"+
		"\31\u012a\n\31\3\31\3\31\5\31\u012e\n\31\3\31\3\31\3\31\3\31\5\31\u0134"+
		"\n\31\3\31\3\31\5\31\u0138\n\31\3\31\3\31\3\31\3\31\5\31\u013e\n\31\3"+
		"\31\3\31\5\31\u0142\n\31\3\31\3\31\3\31\5\31\u0147\n\31\3\31\3\31\5\31"+
		"\u014b\n\31\3\31\3\31\3\31\5\31\u0150\n\31\3\31\3\31\5\31\u0154\n\31\3"+
		"\31\3\31\7\31\u0158\n\31\f\31\16\31\u015b\13\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u0168\n\36\3\36\5\36\u016b\n\36"+
		"\3\36\2\3\60\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\7\3\2,/\3\2!$\3\2\21\27\3\2%*\3\2-.\2\u0192\2<\3\2\2\2\4C\3"+
		"\2\2\2\6J\3\2\2\2\bT\3\2\2\2\n^\3\2\2\2\fe\3\2\2\2\16t\3\2\2\2\20{\3\2"+
		"\2\2\22\u0085\3\2\2\2\24\u0087\3\2\2\2\26\u008e\3\2\2\2\30\u00a9\3\2\2"+
		"\2\32\u00af\3\2\2\2\34\u00b1\3\2\2\2\36\u00bd\3\2\2\2 \u00c9\3\2\2\2\""+
		"\u00d5\3\2\2\2$\u00d7\3\2\2\2&\u00d9\3\2\2\2(\u00db\3\2\2\2*\u00e4\3\2"+
		"\2\2,\u00e7\3\2\2\2.\u00ff\3\2\2\2\60\u0125\3\2\2\2\62\u015c\3\2\2\2\64"+
		"\u015e\3\2\2\2\66\u0160\3\2\2\28\u0162\3\2\2\2:\u016a\3\2\2\2<>\5\4\3"+
		"\2=?\5\24\13\2>=\3\2\2\2>?\3\2\2\2?A\3\2\2\2@B\5(\25\2A@\3\2\2\2AB\3\2"+
		"\2\2B\3\3\2\2\2CG\7\3\2\2DF\5\6\4\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3"+
		"\2\2\2H\5\3\2\2\2IG\3\2\2\2JM\5\b\5\2KN\5\22\n\2LN\5\f\7\2MK\3\2\2\2M"+
		"L\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\4\2\2R\7\3\2\2\2"+
		"SU\7\60\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\7,\2\2WY\7\60\2\2XW\3\2\2"+
		"\2XY\3\2\2\2YZ\3\2\2\2Z\\\7\5\2\2[]\7\60\2\2\\[\3\2\2\2\\]\3\2\2\2]\t"+
		"\3\2\2\2^_\7\6\2\2_`\7-\2\2`a\7\7\2\2ab\7-\2\2bc\7\b\2\2c\13\3\2\2\2d"+
		"f\7\60\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\5\n\6\2hj\7\60\2\2ih\3\2\2"+
		"\2ij\3\2\2\2jk\3\2\2\2km\7\t\2\2ln\5\16\b\2ml\3\2\2\2no\3\2\2\2om\3\2"+
		"\2\2op\3\2\2\2pq\3\2\2\2qr\7\n\2\2r\r\3\2\2\2su\7\60\2\2ts\3\2\2\2tu\3"+
		"\2\2\2uv\3\2\2\2vx\7,\2\2wy\7\60\2\2xw\3\2\2\2xy\3\2\2\2y\17\3\2\2\2z"+
		"|\7\60\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\6\2\2~\177\7,\2\2\177\u0081"+
		"\7\b\2\2\u0080\u0082\7\60\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2"+
		"\u0082\21\3\2\2\2\u0083\u0086\5\16\b\2\u0084\u0086\5\20\t\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\23\3\2\2\2\u0087\u008b\7\13\2\2\u0088"+
		"\u008a\5\26\f\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\5\30\r\2\u008f\u0091\7\60\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7\5\2\2\u0093\u0095\7\60\2\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\5\32"+
		"\16\2\u0097\u0099\7\60\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\7\7\2\2\u009b\u009d\7\60\2\2\u009c\u009b\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\5\"\22\2\u009f"+
		"\u00a1\7\60\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\u00a4\7\7\2\2\u00a3\u00a5\7\60\2\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\7\4"+
		"\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00ac"+
		"\7,\2\2\u00ac\31\3\2\2\2\u00ad\u00b0\5\34\17\2\u00ae\u00b0\5\36\20\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\33\3\2\2\2\u00b1\u00b2\7\6\2"+
		"\2\u00b2\u00b7\5&\24\2\u00b3\u00b4\7\7\2\2\u00b4\u00b6\5&\24\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\b\2\2\u00bb\35\3\2\2"+
		"\2\u00bc\u00be\7\60\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c1\7+\2\2\u00c0\u00c2\7\60\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c5\5 \21\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\37\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca\u00cc"+
		"\7-\2\2\u00cb\u00cd\7\60\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\7\r\2\2\u00cf\u00d1\7\60\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3"+
		"\u00d4\7\b\2\2\u00d4!\3\2\2\2\u00d5\u00d6\5&\24\2\u00d6#\3\2\2\2\u00d7"+
		"\u00d8\5&\24\2\u00d8%\3\2\2\2\u00d9\u00da\t\2\2\2\u00da\'\3\2\2\2\u00db"+
		"\u00df\7\16\2\2\u00dc\u00de\5*\26\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0)\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e5\5,\27\2\u00e3\u00e5\5.\30\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5+\3\2\2\2\u00e6\u00e8\7\60\2\2\u00e7\u00e6\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\7,\2\2\u00ea\u00ec"+
		"\7\60\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00ef\7\t\2\2\u00ee\u00f0\7\60\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\5.\30\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\7\60\2\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\7\n\2\2\u00fb\u00fd\7\60"+
		"\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd-\3\2\2\2\u00fe\u0100"+
		"\7\60\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2"+
		"\u0101\u0103\5\60\31\2\u0102\u0104\7\60\2\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\7\4\2\2\u0106\u0108\7\60"+
		"\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108/\3\2\2\2\u0109\u010b"+
		"\b\31\1\2\u010a\u010c\7\60\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u010e\7\17\2\2\u010e\u010f\5\60\31\2\u010f"+
		"\u0111\7\20\2\2\u0110\u0112\7\60\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\u0126\3\2\2\2\u0113\u0115\7\60\2\2\u0114\u0113\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\7 \2\2\u0117\u0119\7\60"+
		"\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0126\5\60\31\t\u011b\u011d\7\60\2\2\u011c\u011b\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u0121\5:\36\2\u011f\u0121\58\35\2\u0120"+
		"\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0124\7\60"+
		"\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0109\3\2\2\2\u0125\u0114\3\2\2\2\u0125\u011c\3\2\2\2\u0126\u0159\3\2"+
		"\2\2\u0127\u0129\f\b\2\2\u0128\u012a\7\60\2\2\u0129\u0128\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\5\64\33\2\u012c\u012e\7"+
		"\60\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\5\60\31\t\u0130\u0158\3\2\2\2\u0131\u0133\f\7\2\2\u0132\u0134\7"+
		"\60\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0137\5\66\34\2\u0136\u0138\7\60\2\2\u0137\u0136\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\5\60\31\b\u013a\u0158\3\2\2\2"+
		"\u013b\u013d\f\6\2\2\u013c\u013e\7\60\2\2\u013d\u013c\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\7\36\2\2\u0140\u0142\7\60\2\2"+
		"\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0158"+
		"\5\60\31\7\u0144\u0146\f\5\2\2\u0145\u0147\7\60\2\2\u0146\u0145\3\2\2"+
		"\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\7\37\2\2\u0149"+
		"\u014b\7\60\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3"+
		"\2\2\2\u014c\u0158\5\60\31\6\u014d\u014f\f\4\2\2\u014e\u0150\7\60\2\2"+
		"\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153"+
		"\5\62\32\2\u0152\u0154\7\60\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2"+
		"\2\u0154\u0155\3\2\2\2\u0155\u0156\5\60\31\5\u0156\u0158\3\2\2\2\u0157"+
		"\u0127\3\2\2\2\u0157\u0131\3\2\2\2\u0157\u013b\3\2\2\2\u0157\u0144\3\2"+
		"\2\2\u0157\u014d\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\61\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\t\3\2"+
		"\2\u015d\63\3\2\2\2\u015e\u015f\t\4\2\2\u015f\65\3\2\2\2\u0160\u0161\t"+
		"\5\2\2\u0161\67\3\2\2\2\u0162\u0163\t\6\2\2\u01639\3\2\2\2\u0164\u0167"+
		"\7,\2\2\u0165\u0166\7\f\2\2\u0166\u0168\7,\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u016b\7,\2\2\u016a\u0164\3\2"+
		"\2\2\u016a\u0169\3\2\2\2\u016b;\3\2\2\2A>AGMOTX\\eiotx{\u0081\u0085\u008b"+
		"\u0090\u0094\u0098\u009c\u00a0\u00a4\u00af\u00b7\u00bd\u00c1\u00c6\u00cc"+
		"\u00d0\u00df\u00e4\u00e7\u00eb\u00ef\u00f4\u00f8\u00fc\u00ff\u0103\u0107"+
		"\u010b\u0111\u0114\u0118\u011c\u0120\u0123\u0125\u0129\u012d\u0133\u0137"+
		"\u013d\u0141\u0146\u014a\u014f\u0153\u0157\u0159\u0167\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}