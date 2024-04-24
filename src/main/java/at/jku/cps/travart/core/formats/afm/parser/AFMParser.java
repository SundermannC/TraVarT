package at.jku.cps.travart.core.formats.afm.parser;

// Generated from src/main/java/at/jku/cps/travart/core/formats/afm/parser/AFM.g4 by ANTLR 4.7.2
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
		RULE_simple_spec = 22, RULE_expression = 23, RULE_error_expression = 24, 
		RULE_logical_operator = 25, RULE_arithmetic_operator = 26, RULE_relational_operator = 27, 
		RULE_number = 28, RULE_variable = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"feature_model", "relationships_block", "relationship_spec", "init_spec", 
			"cardinality", "cardinal_spec", "obligatory_spec", "optional_spec", "non_cardinal_spec", 
			"attributes_block", "attribute_spec", "attribute_name", "attribute_domain", 
			"discrete_domain_spec", "range_domain_spec", "domain_range", "attribute_default_value", 
			"attribute_null_value", "value_spec", "constraints_block", "constraint_spec", 
			"brackets_spec", "simple_spec", "expression", "error_expression", "logical_operator", 
			"arithmetic_operator", "relational_operator", "number", "variable"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterFeature_model(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitFeature_model(this);
		}
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
			setState(60);
			relationships_block();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(61);
				attributes_block();
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(64);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterRelationships_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitRelationships_block(this);
		}
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
			setState(67);
			match(T__0);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD || _la==SPACE) {
				{
				{
				setState(68);
				relationship_spec();
				}
				}
				setState(73);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterRelationship_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitRelationship_spec(this);
		}
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
			setState(74);
			init_spec();
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(75);
					non_cardinal_spec();
					}
					break;
				case 2:
					{
					setState(76);
					cardinal_spec();
					}
					break;
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << WORD) | (1L << SPACE))) != 0) );
			setState(81);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterInit_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitInit_spec(this);
		}
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(83);
				match(SPACE);
				}
			}

			setState(86);
			match(WORD);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(87);
				match(SPACE);
				}
			}

			setState(90);
			match(T__2);
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(91);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterCardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitCardinality(this);
		}
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
			setState(94);
			match(T__3);
			setState(95);
			match(INT);
			setState(96);
			match(T__4);
			setState(97);
			match(INT);
			setState(98);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterCardinal_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitCardinal_spec(this);
		}
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(100);
				match(SPACE);
				}
			}

			setState(103);
			cardinality();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(104);
				match(SPACE);
				}
			}

			setState(107);
			match(T__6);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				obligatory_spec();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD || _la==SPACE );
			setState(113);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterObligatory_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitObligatory_spec(this);
		}
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
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(115);
				match(SPACE);
				}
			}

			setState(118);
			match(WORD);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(119);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterOptional_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitOptional_spec(this);
		}
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
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(122);
				match(SPACE);
				}
			}

			setState(125);
			match(T__3);
			setState(126);
			match(WORD);
			setState(127);
			match(T__5);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(128);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterNon_cardinal_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitNon_cardinal_spec(this);
		}
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(131);
				obligatory_spec();
				}
				break;
			case 2:
				{
				setState(132);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterAttributes_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitAttributes_block(this);
		}
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
			setState(135);
			match(T__8);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(136);
				attribute_spec();
				}
				}
				setState(141);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterAttribute_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitAttribute_spec(this);
		}
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
			setState(142);
			attribute_name();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(143);
				match(SPACE);
				}
			}

			setState(146);
			match(T__2);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(147);
				match(SPACE);
				}
				break;
			}
			setState(150);
			attribute_domain();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(151);
				match(SPACE);
				}
			}

			setState(154);
			match(T__4);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(155);
				match(SPACE);
				}
			}

			setState(158);
			attribute_default_value();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(159);
				match(SPACE);
				}
			}

			setState(162);
			match(T__4);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(163);
				match(SPACE);
				}
			}

			setState(166);
			attribute_null_value();
			setState(167);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitAttribute_name(this);
		}
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
			setState(169);
			match(WORD);
			setState(170);
			match(T__9);
			setState(171);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterAttribute_domain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitAttribute_domain(this);
		}
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
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(173);
				discrete_domain_spec();
				}
				break;
			case INTEGER:
			case SPACE:
				{
				setState(174);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterDiscrete_domain_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitDiscrete_domain_spec(this);
		}
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
			setState(177);
			match(T__3);
			setState(178);
			value_spec();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(179);
				match(T__4);
				setState(180);
				value_spec();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterRange_domain_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitRange_domain_spec(this);
		}
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
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(188);
				match(SPACE);
				}
			}

			setState(191);
			match(INTEGER);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(192);
				match(SPACE);
				}
				break;
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(195);
				domain_range();
				}
				}
				setState(200);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterDomain_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitDomain_range(this);
		}
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
			setState(201);
			match(T__3);
			setState(202);
			match(INT);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(203);
				match(SPACE);
				}
			}

			setState(206);
			match(T__10);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(207);
				match(SPACE);
				}
			}

			setState(210);
			match(INT);
			setState(211);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterAttribute_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitAttribute_default_value(this);
		}
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

	public static class Attribute_null_valueContext extends ParserRuleContext {
		public Value_specContext value_spec() {
			return getRuleContext(Value_specContext.class,0);
		}
		public Attribute_null_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_null_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterAttribute_null_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitAttribute_null_value(this);
		}
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
			setState(215);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterValue_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitValue_spec(this);
		}
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
			setState(217);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterConstraints_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitConstraints_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitConstraints_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constraints_blockContext constraints_block() throws RecognitionException {
		Constraints_blockContext _localctx = new Constraints_blockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constraints_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__11);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					constraint_spec();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterConstraint_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitConstraint_spec(this);
		}
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				brackets_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterBrackets_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitBrackets_spec(this);
		}
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
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(230);
				match(SPACE);
				}
			}

			setState(233);
			match(WORD);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(234);
				match(SPACE);
				}
			}

			setState(237);
			match(T__6);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(238);
				match(SPACE);
				}
				break;
			}
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					simple_spec();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(247);
				match(SPACE);
				}
			}

			setState(250);
			match(T__7);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(251);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterSimple_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitSimple_spec(this);
		}
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(254);
				match(SPACE);
				}
				break;
			}
			setState(257);
			expression(0);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(258);
				match(SPACE);
				}
			}

			setState(261);
			match(T__1);
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(262);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterArithmeticExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitArithmeticExp(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitAndExp(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterParenthesisExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitParenthesisExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitParenthesisExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ERRORContext extends ExpressionContext {
		public Error_expressionContext error_expression() {
			return getRuleContext(Error_expressionContext.class,0);
		}
		public ERRORContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterERROR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitERROR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitERROR(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterRelationalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitRelationalExp(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitOrExp(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitAtom(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterLogicalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitLogicalExp(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitNotExp(this);
		}
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(266);
					match(SPACE);
					}
				}

				setState(269);
				match(T__12);
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
				setState(273);
				expression(0);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(274);
					match(SPACE);
					}
				}

				setState(277);
				match(T__13);
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(278);
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
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(281);
					match(SPACE);
					}
				}

				setState(284);
				match(NOT);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(285);
					match(SPACE);
					}
					break;
				}
				setState(288);
				expression(8);
				}
				break;
			case 3:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(289);
					match(SPACE);
					}
				}

				setState(294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(292);
					variable();
					}
					break;
				case INT:
				case DOUBLE:
					{
					setState(293);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(296);
					match(SPACE);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new ERRORContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				error_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(304);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(303);
							match(SPACE);
							}
						}

						setState(306);
						arithmetic_operator();
						setState(308);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(307);
							match(SPACE);
							}
							break;
						}
						setState(310);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(313);
							match(SPACE);
							}
						}

						setState(316);
						relational_operator();
						setState(318);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(317);
							match(SPACE);
							}
							break;
						}
						setState(320);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
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
						match(AND);
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
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
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
						match(OR);
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
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(342);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(341);
							match(SPACE);
							}
						}

						setState(344);
						logical_operator();
						setState(346);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
						case 1:
							{
							setState(345);
							match(SPACE);
							}
							break;
						}
						setState(348);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class Error_expressionContext extends ParserRuleContext {
		public List<Logical_operatorContext> logical_operator() {
			return getRuleContexts(Logical_operatorContext.class);
		}
		public Logical_operatorContext logical_operator(int i) {
			return getRuleContext(Logical_operatorContext.class,i);
		}
		public List<Arithmetic_operatorContext> arithmetic_operator() {
			return getRuleContexts(Arithmetic_operatorContext.class);
		}
		public Arithmetic_operatorContext arithmetic_operator(int i) {
			return getRuleContext(Arithmetic_operatorContext.class,i);
		}
		public List<Relational_operatorContext> relational_operator() {
			return getRuleContexts(Relational_operatorContext.class);
		}
		public Relational_operatorContext relational_operator(int i) {
			return getRuleContext(Relational_operatorContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Error_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterError_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitError_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitError_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_expressionContext error_expression() throws RecognitionException {
		Error_expressionContext _localctx = new Error_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_error_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(362);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IFF:
					case IMPLIES:
					case REQUIRES:
					case EXCLUDES:
						{
						setState(355);
						logical_operator();
						}
						break;
					case ADD:
					case SUB:
					case MULT:
					case DIV:
					case MOD:
					case POW:
					case ASIG:
						{
						setState(356);
						arithmetic_operator();
						}
						break;
					case HIGHER_THAN:
					case LOWER_THAN:
					case HIGHER_EQUAL_THAN:
					case LOWER_EQUAL_THAN:
					case EQUAL:
					case DISTINCT:
						{
						setState(357);
						relational_operator();
						}
						break;
					case INT:
					case DOUBLE:
						{
						setState(358);
						number();
						}
						break;
					case WORD:
						{
						setState(359);
						variable();
						}
						break;
					case T__12:
						{
						setState(360);
						match(T__12);
						}
						break;
					case T__13:
						{
						setState(361);
						match(T__13);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterArithmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitArithmetic_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitArithmetic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AFMListener ) ((AFMListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AFMVisitor ) return ((AFMVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variable);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(WORD);
				setState(378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(376);
					match(T__9);
					setState(377);
					match(WORD);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0182\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\5"+
		"\2A\n\2\3\2\5\2D\n\2\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\4\3\4\3\4\6\4P"+
		"\n\4\r\4\16\4Q\3\4\3\4\3\5\5\5W\n\5\3\5\3\5\5\5[\n\5\3\5\3\5\5\5_\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7h\n\7\3\7\3\7\5\7l\n\7\3\7\3\7\6\7p\n"+
		"\7\r\7\16\7q\3\7\3\7\3\b\5\bw\n\b\3\b\3\b\5\b{\n\b\3\t\5\t~\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0084\n\t\3\n\3\n\5\n\u0088\n\n\3\13\3\13\7\13\u008c\n"+
		"\13\f\13\16\13\u008f\13\13\3\f\3\f\5\f\u0093\n\f\3\f\3\f\5\f\u0097\n\f"+
		"\3\f\3\f\5\f\u009b\n\f\3\f\3\f\5\f\u009f\n\f\3\f\3\f\5\f\u00a3\n\f\3\f"+
		"\3\f\5\f\u00a7\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00b2\n"+
		"\16\3\17\3\17\3\17\3\17\7\17\u00b8\n\17\f\17\16\17\u00bb\13\17\3\17\3"+
		"\17\3\20\5\20\u00c0\n\20\3\20\3\20\5\20\u00c4\n\20\3\20\7\20\u00c7\n\20"+
		"\f\20\16\20\u00ca\13\20\3\21\3\21\3\21\5\21\u00cf\n\21\3\21\3\21\5\21"+
		"\u00d3\n\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25"+
		"\u00e0\n\25\f\25\16\25\u00e3\13\25\3\26\3\26\5\26\u00e7\n\26\3\27\5\27"+
		"\u00ea\n\27\3\27\3\27\5\27\u00ee\n\27\3\27\3\27\5\27\u00f2\n\27\3\27\7"+
		"\27\u00f5\n\27\f\27\16\27\u00f8\13\27\3\27\5\27\u00fb\n\27\3\27\3\27\5"+
		"\27\u00ff\n\27\3\30\5\30\u0102\n\30\3\30\3\30\5\30\u0106\n\30\3\30\3\30"+
		"\5\30\u010a\n\30\3\31\3\31\5\31\u010e\n\31\3\31\3\31\5\31\u0112\n\31\3"+
		"\31\3\31\5\31\u0116\n\31\3\31\3\31\5\31\u011a\n\31\3\31\5\31\u011d\n\31"+
		"\3\31\3\31\5\31\u0121\n\31\3\31\3\31\5\31\u0125\n\31\3\31\3\31\5\31\u0129"+
		"\n\31\3\31\5\31\u012c\n\31\3\31\5\31\u012f\n\31\3\31\3\31\5\31\u0133\n"+
		"\31\3\31\3\31\5\31\u0137\n\31\3\31\3\31\3\31\3\31\5\31\u013d\n\31\3\31"+
		"\3\31\5\31\u0141\n\31\3\31\3\31\3\31\3\31\5\31\u0147\n\31\3\31\3\31\5"+
		"\31\u014b\n\31\3\31\3\31\3\31\5\31\u0150\n\31\3\31\3\31\5\31\u0154\n\31"+
		"\3\31\3\31\3\31\5\31\u0159\n\31\3\31\3\31\5\31\u015d\n\31\3\31\3\31\7"+
		"\31\u0161\n\31\f\31\16\31\u0164\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\7\32\u016d\n\32\f\32\16\32\u0170\13\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\5\37\u017d\n\37\3\37\5\37\u0180\n\37\3\37"+
		"\2\3\60 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<\2\7\3\2,/\3\2!$\3\2\21\27\3\2%*\3\2-.\2\u01b0\2>\3\2\2\2\4E\3\2\2\2"+
		"\6L\3\2\2\2\bV\3\2\2\2\n`\3\2\2\2\fg\3\2\2\2\16v\3\2\2\2\20}\3\2\2\2\22"+
		"\u0087\3\2\2\2\24\u0089\3\2\2\2\26\u0090\3\2\2\2\30\u00ab\3\2\2\2\32\u00b1"+
		"\3\2\2\2\34\u00b3\3\2\2\2\36\u00bf\3\2\2\2 \u00cb\3\2\2\2\"\u00d7\3\2"+
		"\2\2$\u00d9\3\2\2\2&\u00db\3\2\2\2(\u00dd\3\2\2\2*\u00e6\3\2\2\2,\u00e9"+
		"\3\2\2\2.\u0101\3\2\2\2\60\u012e\3\2\2\2\62\u016e\3\2\2\2\64\u0171\3\2"+
		"\2\2\66\u0173\3\2\2\28\u0175\3\2\2\2:\u0177\3\2\2\2<\u017f\3\2\2\2>@\5"+
		"\4\3\2?A\5\24\13\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\5(\25\2CB\3\2\2\2C"+
		"D\3\2\2\2D\3\3\2\2\2EI\7\3\2\2FH\5\6\4\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2"+
		"IJ\3\2\2\2J\5\3\2\2\2KI\3\2\2\2LO\5\b\5\2MP\5\22\n\2NP\5\f\7\2OM\3\2\2"+
		"\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\4\2\2T\7\3\2"+
		"\2\2UW\7\60\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\7,\2\2Y[\7\60\2\2ZY\3"+
		"\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\5\2\2]_\7\60\2\2^]\3\2\2\2^_\3\2\2\2"+
		"_\t\3\2\2\2`a\7\6\2\2ab\7-\2\2bc\7\7\2\2cd\7-\2\2de\7\b\2\2e\13\3\2\2"+
		"\2fh\7\60\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\5\n\6\2jl\7\60\2\2kj\3\2"+
		"\2\2kl\3\2\2\2lm\3\2\2\2mo\7\t\2\2np\5\16\b\2on\3\2\2\2pq\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\n\2\2t\r\3\2\2\2uw\7\60\2\2vu\3\2\2\2v"+
		"w\3\2\2\2wx\3\2\2\2xz\7,\2\2y{\7\60\2\2zy\3\2\2\2z{\3\2\2\2{\17\3\2\2"+
		"\2|~\7\60\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\6\2\2\u0080"+
		"\u0081\7,\2\2\u0081\u0083\7\b\2\2\u0082\u0084\7\60\2\2\u0083\u0082\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085\u0088\5\16\b\2\u0086\u0088"+
		"\5\20\t\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\23\3\2\2\2\u0089"+
		"\u008d\7\13\2\2\u008a\u008c\5\26\f\2\u008b\u008a\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\25\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0092\5\30\r\2\u0091\u0093\7\60\2\2\u0092\u0091\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\7\5\2\2\u0095"+
		"\u0097\7\60\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u009a\5\32\16\2\u0099\u009b\7\60\2\2\u009a\u0099\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\7\7\2\2\u009d\u009f"+
		"\7\60\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u00a2\5\"\22\2\u00a1\u00a3\7\60\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\7\2\2\u00a5\u00a7\7\60\2\2"+
		"\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\5$\23\2\u00a9\u00aa\7\4\2\2\u00aa\27\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac"+
		"\u00ad\7\f\2\2\u00ad\u00ae\7,\2\2\u00ae\31\3\2\2\2\u00af\u00b2\5\34\17"+
		"\2\u00b0\u00b2\5\36\20\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\33\3\2\2\2\u00b3\u00b4\7\6\2\2\u00b4\u00b9\5&\24\2\u00b5\u00b6\7\7\2"+
		"\2\u00b6\u00b8\5&\24\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7\b\2\2\u00bd\35\3\2\2\2\u00be\u00c0\7\60\2\2\u00bf\u00be\3\2\2"+
		"\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\7+\2\2\u00c2\u00c4"+
		"\7\60\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\3\2\2\2"+
		"\u00c5\u00c7\5 \21\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\7\6\2\2\u00cc\u00ce\7-\2\2\u00cd\u00cf\7\60\2\2\u00ce\u00cd\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7\r\2\2\u00d1"+
		"\u00d3\7\60\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d5\7-\2\2\u00d5\u00d6\7\b\2\2\u00d6!\3\2\2\2\u00d7\u00d8"+
		"\5&\24\2\u00d8#\3\2\2\2\u00d9\u00da\5&\24\2\u00da%\3\2\2\2\u00db\u00dc"+
		"\t\2\2\2\u00dc\'\3\2\2\2\u00dd\u00e1\7\16\2\2\u00de\u00e0\5*\26\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2)\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\5,\27\2\u00e5\u00e7"+
		"\5.\30\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7+\3\2\2\2\u00e8"+
		"\u00ea\7\60\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00eb\u00ed\7,\2\2\u00ec\u00ee\7\60\2\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\7\t\2\2\u00f0\u00f2\7\60"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3"+
		"\u00f5\5.\30\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fb\7\60\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fc\u00fe\7\n\2\2\u00fd\u00ff\7\60\2\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff-\3\2\2\2\u0100\u0102\7\60\2\2\u0101\u0100\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\5\60\31\2\u0104\u0106"+
		"\7\60\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0109\7\4\2\2\u0108\u010a\7\60\2\2\u0109\u0108\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a/\3\2\2\2\u010b\u010d\b\31\1\2\u010c\u010e\7\60\2\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\7\17"+
		"\2\2\u0110\u0112\7\60\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\5\60\31\2\u0114\u0116\7\60\2\2\u0115\u0114"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\7\20\2\2"+
		"\u0118\u011a\7\60\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u012f"+
		"\3\2\2\2\u011b\u011d\7\60\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u0120\7 \2\2\u011f\u0121\7\60\2\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u012f\5\60\31\n"+
		"\u0123\u0125\7\60\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128"+
		"\3\2\2\2\u0126\u0129\5<\37\2\u0127\u0129\5:\36\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u012c\7\60\2\2\u012b\u012a\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012f\5\62\32\2\u012e"+
		"\u010b\3\2\2\2\u012e\u011c\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u012d\3\2"+
		"\2\2\u012f\u0162\3\2\2\2\u0130\u0132\f\t\2\2\u0131\u0133\7\60\2\2\u0132"+
		"\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\5\66"+
		"\34\2\u0135\u0137\7\60\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\5\60\31\n\u0139\u0161\3\2\2\2\u013a\u013c\f"+
		"\b\2\2\u013b\u013d\7\60\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\58\35\2\u013f\u0141\7\60\2\2\u0140\u013f\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\5\60\31\t\u0143"+
		"\u0161\3\2\2\2\u0144\u0146\f\7\2\2\u0145\u0147\7\60\2\2\u0146\u0145\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\7\36\2\2\u0149"+
		"\u014b\7\60\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3"+
		"\2\2\2\u014c\u0161\5\60\31\b\u014d\u014f\f\6\2\2\u014e\u0150\7\60\2\2"+
		"\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153"+
		"\7\37\2\2\u0152\u0154\7\60\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2"+
		"\u0154\u0155\3\2\2\2\u0155\u0161\5\60\31\7\u0156\u0158\f\5\2\2\u0157\u0159"+
		"\7\60\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2"+
		"\u015a\u015c\5\64\33\2\u015b\u015d\7\60\2\2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\5\60\31\6\u015f\u0161\3"+
		"\2\2\2\u0160\u0130\3\2\2\2\u0160\u013a\3\2\2\2\u0160\u0144\3\2\2\2\u0160"+
		"\u014d\3\2\2\2\u0160\u0156\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\61\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u016d"+
		"\5\64\33\2\u0166\u016d\5\66\34\2\u0167\u016d\58\35\2\u0168\u016d\5:\36"+
		"\2\u0169\u016d\5<\37\2\u016a\u016d\7\17\2\2\u016b\u016d\7\20\2\2\u016c"+
		"\u0165\3\2\2\2\u016c\u0166\3\2\2\2\u016c\u0167\3\2\2\2\u016c\u0168\3\2"+
		"\2\2\u016c\u0169\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\63\3\2\2"+
		"\2\u0170\u016e\3\2\2\2\u0171\u0172\t\3\2\2\u0172\65\3\2\2\2\u0173\u0174"+
		"\t\4\2\2\u0174\67\3\2\2\2\u0175\u0176\t\5\2\2\u01769\3\2\2\2\u0177\u0178"+
		"\t\6\2\2\u0178;\3\2\2\2\u0179\u017c\7,\2\2\u017a\u017b\7\f\2\2\u017b\u017d"+
		"\7,\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u0180\7,\2\2\u017f\u0179\3\2\2\2\u017f\u017e\3\2\2\2\u0180=\3\2\2\2E"+
		"@CIOQVZ^gkqvz}\u0083\u0087\u008d\u0092\u0096\u009a\u009e\u00a2\u00a6\u00b1"+
		"\u00b9\u00bf\u00c3\u00c8\u00ce\u00d2\u00e1\u00e6\u00e9\u00ed\u00f1\u00f6"+
		"\u00fa\u00fe\u0101\u0105\u0109\u010d\u0111\u0115\u0119\u011c\u0120\u0124"+
		"\u0128\u012b\u012e\u0132\u0136\u013c\u0140\u0146\u014a\u014f\u0153\u0158"+
		"\u015c\u0160\u0162\u016c\u016e\u017c\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}