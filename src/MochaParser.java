// Generated from C:/Users/risha/Documents/GitHub/mocha/src\Mocha.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MochaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, DATA_TYPE=15, DATA_TYPE_INT=16, 
		DATA_TYPE_FLOAT=17, DATA_TYPE_BOOLEAN=18, DATA_TYPE_STRING=19, IDENTIFIER=20, 
		LITERAL=21, INTEGER_LITERAL=22, FLOATING_POINT_LITERAL=23, BOOLEAN_LITERAL=24, 
		STRING_LITERAL=25, BOOLEAN_TRUE=26, BOOLEAN_FALSE=27, WHITESPACE=28, OP_ASSIGN=29, 
		OP_ADD=30, OP_SUB=31, OP_MUL=32, OP_DIV=33, OP_SET_RELATIONAL=34, OP_EQUALS=35, 
		OP_SMALLER=36, OP_GREATER=37, OP_SMALLER_EQUALS=38, OP_GREATER_EQUALS=39, 
		OP_SET_LOGICAL=40, OP_SET_LOGICAL_UNI=41, OP_SET_LOGICAL_BIN=42, OP_LOGICAL_AND=43, 
		OP_LOGICAL_OR=44, OP_LOGICAL_NOT=45, OP_TERNARY_TRUE=46, OP_TERNARY_FALSE=47;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_statement = 2, RULE_variable_declaration = 3, 
		RULE_identifier_list = 4, RULE_assignment_statement = 5, RULE_expression = 6, 
		RULE_arithmetic_expression = 7, RULE_relational_expression = 8, RULE_logical_expression = 9, 
		RULE_ternary_expression = 10, RULE_expression_term = 11, RULE_if_else_statement = 12, 
		RULE_if_condition = 13, RULE_for_statement = 14, RULE_for_expression = 15, 
		RULE_while_statement = 16, RULE_while_condition = 17, RULE_for_in_range_statement = 18, 
		RULE_range = 19, RULE_print_statement = 20, RULE_print_argument_list = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "statement", "variable_declaration", "identifier_list", 
			"assignment_statement", "expression", "arithmetic_expression", "relational_expression", 
			"logical_expression", "ternary_expression", "expression_term", "if_else_statement", 
			"if_condition", "for_statement", "for_expression", "while_statement", 
			"while_condition", "for_in_range_statement", "range", "print_statement", 
			"print_argument_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "','", "'('", "')'", "'if'", "'{'", "'}'", 
			"'else'", "'for'", "'to'", "'while'", "'in'", "'print'", null, "'int'", 
			"'float'", "'boolean'", "'string'", null, null, null, null, null, null, 
			"'true'", "'false'", null, "'='", "'+'", "'-'", "'*'", "'/'", null, "'=='", 
			"'<'", "'>'", "'<='", "'>='", null, null, null, "'and'", "'or'", "'not'", 
			"'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "DATA_TYPE", "DATA_TYPE_INT", "DATA_TYPE_FLOAT", "DATA_TYPE_BOOLEAN", 
			"DATA_TYPE_STRING", "IDENTIFIER", "LITERAL", "INTEGER_LITERAL", "FLOATING_POINT_LITERAL", 
			"BOOLEAN_LITERAL", "STRING_LITERAL", "BOOLEAN_TRUE", "BOOLEAN_FALSE", 
			"WHITESPACE", "OP_ASSIGN", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "OP_SET_RELATIONAL", 
			"OP_EQUALS", "OP_SMALLER", "OP_GREATER", "OP_SMALLER_EQUALS", "OP_GREATER_EQUALS", 
			"OP_SET_LOGICAL", "OP_SET_LOGICAL_UNI", "OP_SET_LOGICAL_BIN", "OP_LOGICAL_AND", 
			"OP_LOGICAL_OR", "OP_LOGICAL_NOT", "OP_TERNARY_TRUE", "OP_TERNARY_FALSE"
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
	public String getGrammarFileName() { return "Mocha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MochaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			body();
			setState(46);
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

	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(48);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_else_statementContext if_else_statement() {
			return getRuleContext(If_else_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_in_range_statementContext for_in_range_statement() {
			return getRuleContext(For_in_range_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				if_else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				for_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				while_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				for_in_range_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				print_statement();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(MochaParser.DATA_TYPE, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(DATA_TYPE);
			setState(64);
			identifier_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MochaParser.IDENTIFIER, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(MochaParser.OP_ASSIGN, 0); }
		public TerminalNode LITERAL() { return getToken(MochaParser.LITERAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IDENTIFIER);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(67);
				match(OP_ASSIGN);
				setState(68);
				match(LITERAL);
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(71);
				match(T__2);
				setState(72);
				identifier_list();
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MochaParser.IDENTIFIER, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(MochaParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IDENTIFIER);
			setState(76);
			match(OP_ASSIGN);
			setState(77);
			expression();
			}
		}
		catch (RecognitionException re) {
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
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Ternary_expressionContext ternary_expression() {
			return getRuleContext(Ternary_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				arithmetic_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				relational_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				logical_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				ternary_expression();
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

	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public Expression_termContext expression_term() {
			return getRuleContext(Expression_termContext.class,0);
		}
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode OP_MUL() { return getToken(MochaParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(MochaParser.OP_DIV, 0); }
		public TerminalNode OP_ADD() { return getToken(MochaParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(MochaParser.OP_SUB, 0); }
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitArithmetic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitArithmetic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		return arithmetic_expression(0);
	}

	private Arithmetic_expressionContext arithmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, _parentState);
		Arithmetic_expressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_arithmetic_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case LITERAL:
				{
				setState(86);
				expression_term();
				}
				break;
			case T__3:
				{
				setState(87);
				match(T__3);
				setState(88);
				arithmetic_expression(0);
				setState(89);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(93);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==OP_MUL || _la==OP_DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						arithmetic_expression(3);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(96);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(97);
						_la = _input.LA(1);
						if ( !(_la==OP_ADD || _la==OP_SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						arithmetic_expression(2);
						}
						break;
					}
					} 
				}
				setState(103);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Expression_termContext> expression_term() {
			return getRuleContexts(Expression_termContext.class);
		}
		public Expression_termContext expression_term(int i) {
			return getRuleContext(Expression_termContext.class,i);
		}
		public TerminalNode OP_SET_RELATIONAL() { return getToken(MochaParser.OP_SET_RELATIONAL, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relational_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			expression_term();
			setState(105);
			match(OP_SET_RELATIONAL);
			setState(106);
			expression_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_expressionContext extends ParserRuleContext {
		public List<Expression_termContext> expression_term() {
			return getRuleContexts(Expression_termContext.class);
		}
		public Expression_termContext expression_term(int i) {
			return getRuleContext(Expression_termContext.class,i);
		}
		public TerminalNode OP_SET_LOGICAL_BIN() { return getToken(MochaParser.OP_SET_LOGICAL_BIN, 0); }
		public TerminalNode OP_SET_LOGICAL_UNI() { return getToken(MochaParser.OP_SET_LOGICAL_UNI, 0); }
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logical_expression);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				expression_term();
				setState(109);
				match(OP_SET_LOGICAL_BIN);
				setState(110);
				expression_term();
				}
				break;
			case OP_SET_LOGICAL_UNI:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(OP_SET_LOGICAL_UNI);
				setState(113);
				expression_term();
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

	public static class Ternary_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode OP_TERNARY_TRUE() { return getToken(MochaParser.OP_TERNARY_TRUE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_TERNARY_FALSE() { return getToken(MochaParser.OP_TERNARY_FALSE, 0); }
		public Ternary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterTernary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitTernary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitTernary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_expressionContext ternary_expression() throws RecognitionException {
		Ternary_expressionContext _localctx = new Ternary_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ternary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			relational_expression();
			setState(117);
			match(OP_TERNARY_TRUE);
			setState(118);
			expression();
			setState(119);
			match(OP_TERNARY_FALSE);
			setState(120);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_termContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MochaParser.IDENTIFIER, 0); }
		public TerminalNode LITERAL() { return getToken(MochaParser.LITERAL, 0); }
		public Expression_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterExpression_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitExpression_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitExpression_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_termContext expression_term() throws RecognitionException {
		Expression_termContext _localctx = new Expression_termContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==LITERAL) ) {
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

	public static class If_else_statementContext extends ParserRuleContext {
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterIf_else_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitIf_else_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitIf_else_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_statementContext if_else_statement() throws RecognitionException {
		If_else_statementContext _localctx = new If_else_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__5);
			setState(125);
			if_condition();
			setState(126);
			match(T__6);
			setState(127);
			statement();
			setState(128);
			match(T__7);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(129);
				match(T__8);
				setState(130);
				match(T__6);
				setState(131);
				statement();
				setState(132);
				match(T__7);
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

	public static class If_conditionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_condition);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				relational_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				logical_expression();
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

	public static class For_statementContext extends ParserRuleContext {
		public For_expressionContext for_expression() {
			return getRuleContext(For_expressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__9);
			setState(141);
			for_expression();
			setState(142);
			match(T__6);
			setState(143);
			statement();
			setState(144);
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

	public static class For_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MochaParser.IDENTIFIER, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(MochaParser.OP_ASSIGN, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(MochaParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(MochaParser.INTEGER_LITERAL, i);
		}
		public For_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterFor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitFor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitFor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_expressionContext for_expression() throws RecognitionException {
		For_expressionContext _localctx = new For_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IDENTIFIER);
			setState(147);
			match(OP_ASSIGN);
			setState(148);
			match(INTEGER_LITERAL);
			setState(149);
			match(T__10);
			setState(150);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public While_conditionContext while_condition() {
			return getRuleContext(While_conditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__11);
			setState(153);
			while_condition();
			setState(154);
			match(T__6);
			setState(155);
			statement();
			setState(156);
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

	public static class While_conditionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public While_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterWhile_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitWhile_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitWhile_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_conditionContext while_condition() throws RecognitionException {
		While_conditionContext _localctx = new While_conditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_condition);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				relational_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				logical_expression();
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

	public static class For_in_range_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MochaParser.IDENTIFIER, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_in_range_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_range_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterFor_in_range_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitFor_in_range_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitFor_in_range_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_range_statementContext for_in_range_statement() throws RecognitionException {
		For_in_range_statementContext _localctx = new For_in_range_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for_in_range_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__9);
			setState(163);
			match(IDENTIFIER);
			setState(164);
			match(T__12);
			setState(165);
			range();
			setState(166);
			match(T__6);
			setState(167);
			statement();
			setState(168);
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

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(MochaParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(MochaParser.INTEGER_LITERAL, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(INTEGER_LITERAL);
			setState(171);
			match(T__2);
			setState(172);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_statementContext extends ParserRuleContext {
		public Print_argument_listContext print_argument_list() {
			return getRuleContext(Print_argument_listContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__13);
			setState(175);
			print_argument_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_argument_listContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(MochaParser.LITERAL, 0); }
		public Print_argument_listContext print_argument_list() {
			return getRuleContext(Print_argument_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MochaParser.IDENTIFIER, 0); }
		public Print_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).enterPrint_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MochaListener ) ((MochaListener)listener).exitPrint_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MochaVisitor ) return ((MochaVisitor<? extends T>)visitor).visitPrint_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_argument_listContext print_argument_list() throws RecognitionException {
		Print_argument_listContext _localctx = new Print_argument_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_print_argument_list);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(LITERAL);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(178);
					match(T__2);
					setState(179);
					print_argument_list();
					}
				}

				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(IDENTIFIER);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(183);
					match(T__2);
					setState(184);
					print_argument_list();
					}
				}

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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return arithmetic_expression_sempred((Arithmetic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_expression_sempred(Arithmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00be\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"2\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004F\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006T\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\\\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007d\b\u0007\n\u0007\f\u0007g\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\ts\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0087\b\f\u0001\r\u0001\r\u0003\r\u008b\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00a1\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00b5\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00ba\b\u0015\u0003\u0015\u00bc\b\u0015"+
		"\u0001\u0015\u0000\u0001\u000e\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0003\u0001"+
		"\u0000 !\u0001\u0000\u001e\u001f\u0001\u0000\u0014\u0015\u00bd\u0000,"+
		"\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u0004=\u0001\u0000"+
		"\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000"+
		"\nK\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000e[\u0001\u0000"+
		"\u0000\u0000\u0010h\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000\u0000"+
		"\u0014t\u0001\u0000\u0000\u0000\u0016z\u0001\u0000\u0000\u0000\u0018|"+
		"\u0001\u0000\u0000\u0000\u001a\u008a\u0001\u0000\u0000\u0000\u001c\u008c"+
		"\u0001\u0000\u0000\u0000\u001e\u0092\u0001\u0000\u0000\u0000 \u0098\u0001"+
		"\u0000\u0000\u0000\"\u00a0\u0001\u0000\u0000\u0000$\u00a2\u0001\u0000"+
		"\u0000\u0000&\u00aa\u0001\u0000\u0000\u0000(\u00ae\u0001\u0000\u0000\u0000"+
		"*\u00bb\u0001\u0000\u0000\u0000,-\u0005\u0001\u0000\u0000-.\u0003\u0002"+
		"\u0001\u0000./\u0005\u0002\u0000\u0000/\u0001\u0001\u0000\u0000\u0000"+
		"02\u0003\u0004\u0002\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0003\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u00006>\u0003\u0006\u0003\u0000"+
		"7>\u0003\n\u0005\u00008>\u0003\u0018\f\u00009>\u0003\u001c\u000e\u0000"+
		":>\u0003 \u0010\u0000;>\u0003$\u0012\u0000<>\u0003(\u0014\u0000=6\u0001"+
		"\u0000\u0000\u0000=7\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000"+
		"=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=<\u0001\u0000\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?@\u0005"+
		"\u000f\u0000\u0000@A\u0003\b\u0004\u0000A\u0007\u0001\u0000\u0000\u0000"+
		"BE\u0005\u0014\u0000\u0000CD\u0005\u001d\u0000\u0000DF\u0005\u0015\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FI\u0001\u0000"+
		"\u0000\u0000GH\u0005\u0003\u0000\u0000HJ\u0003\b\u0004\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000KL\u0005"+
		"\u0014\u0000\u0000LM\u0005\u001d\u0000\u0000MN\u0003\f\u0006\u0000N\u000b"+
		"\u0001\u0000\u0000\u0000OT\u0003\u000e\u0007\u0000PT\u0003\u0010\b\u0000"+
		"QT\u0003\u0012\t\u0000RT\u0003\u0014\n\u0000SO\u0001\u0000\u0000\u0000"+
		"SP\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000T\r\u0001\u0000\u0000\u0000UV\u0006\u0007\uffff\uffff\u0000V\\\u0003"+
		"\u0016\u000b\u0000WX\u0005\u0004\u0000\u0000XY\u0003\u000e\u0007\u0000"+
		"YZ\u0005\u0005\u0000\u0000Z\\\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000"+
		"\u0000[W\u0001\u0000\u0000\u0000\\e\u0001\u0000\u0000\u0000]^\n\u0002"+
		"\u0000\u0000^_\u0007\u0000\u0000\u0000_d\u0003\u000e\u0007\u0003`a\n\u0001"+
		"\u0000\u0000ab\u0007\u0001\u0000\u0000bd\u0003\u000e\u0007\u0002c]\u0001"+
		"\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u000f\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0003\u0016\u000b\u0000ij\u0005"+
		"\"\u0000\u0000jk\u0003\u0016\u000b\u0000k\u0011\u0001\u0000\u0000\u0000"+
		"lm\u0003\u0016\u000b\u0000mn\u0005*\u0000\u0000no\u0003\u0016\u000b\u0000"+
		"os\u0001\u0000\u0000\u0000pq\u0005)\u0000\u0000qs\u0003\u0016\u000b\u0000"+
		"rl\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000s\u0013\u0001\u0000"+
		"\u0000\u0000tu\u0003\u0010\b\u0000uv\u0005.\u0000\u0000vw\u0003\f\u0006"+
		"\u0000wx\u0005/\u0000\u0000xy\u0003\f\u0006\u0000y\u0015\u0001\u0000\u0000"+
		"\u0000z{\u0007\u0002\u0000\u0000{\u0017\u0001\u0000\u0000\u0000|}\u0005"+
		"\u0006\u0000\u0000}~\u0003\u001a\r\u0000~\u007f\u0005\u0007\u0000\u0000"+
		"\u007f\u0080\u0003\u0004\u0002\u0000\u0080\u0086\u0005\b\u0000\u0000\u0081"+
		"\u0082\u0005\t\u0000\u0000\u0082\u0083\u0005\u0007\u0000\u0000\u0083\u0084"+
		"\u0003\u0004\u0002\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085\u0087\u0001"+
		"\u0000\u0000\u0000\u0086\u0081\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0019\u0001\u0000\u0000\u0000\u0088\u008b\u0003"+
		"\u0010\b\u0000\u0089\u008b\u0003\u0012\t\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u001b\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\n\u0000\u0000\u008d\u008e\u0003\u001e\u000f"+
		"\u0000\u008e\u008f\u0005\u0007\u0000\u0000\u008f\u0090\u0003\u0004\u0002"+
		"\u0000\u0090\u0091\u0005\b\u0000\u0000\u0091\u001d\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u0014\u0000\u0000\u0093\u0094\u0005\u001d\u0000\u0000"+
		"\u0094\u0095\u0005\u0016\u0000\u0000\u0095\u0096\u0005\u000b\u0000\u0000"+
		"\u0096\u0097\u0005\u0016\u0000\u0000\u0097\u001f\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005\f\u0000\u0000\u0099\u009a\u0003\"\u0011\u0000\u009a"+
		"\u009b\u0005\u0007\u0000\u0000\u009b\u009c\u0003\u0004\u0002\u0000\u009c"+
		"\u009d\u0005\b\u0000\u0000\u009d!\u0001\u0000\u0000\u0000\u009e\u00a1"+
		"\u0003\u0010\b\u0000\u009f\u00a1\u0003\u0012\t\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1#\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005\n\u0000\u0000\u00a3\u00a4\u0005\u0014\u0000"+
		"\u0000\u00a4\u00a5\u0005\r\u0000\u0000\u00a5\u00a6\u0003&\u0013\u0000"+
		"\u00a6\u00a7\u0005\u0007\u0000\u0000\u00a7\u00a8\u0003\u0004\u0002\u0000"+
		"\u00a8\u00a9\u0005\b\u0000\u0000\u00a9%\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0016\u0000\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0016\u0000\u0000\u00ad\'\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u000e\u0000\u0000\u00af\u00b0\u0003*\u0015\u0000\u00b0)\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0005\u0015\u0000\u0000\u00b2\u00b3\u0005\u0003"+
		"\u0000\u0000\u00b3\u00b5\u0003*\u0015\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00bc\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b9\u0005\u0014\u0000\u0000\u00b7\u00b8\u0005\u0003\u0000"+
		"\u0000\u00b8\u00ba\u0003*\u0015\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b1\u0001\u0000\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000"+
		"\u00bc+\u0001\u0000\u0000\u0000\u000f3=EIS[cer\u0086\u008a\u00a0\u00b4"+
		"\u00b9\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}