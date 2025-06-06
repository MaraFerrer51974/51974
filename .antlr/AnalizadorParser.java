// Generated from c:/Users/Usuario/Desktop/MARAAA/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AnalizadorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, EQ=4, COMMA=5, SEMI=6, LPAREN=7, RPAREN=8, LCURLY=9, 
		RCURLY=10, LOG=11, CONSOLE=12, WHILE=13, Com=14, Point=15, ADD=16, RES=17, 
		MULT=18, DIV=19, BAJO=20, INT=21, ID=22, WS=23;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_whileStatment = 2, RULE_assignmentStatement = 3, 
		RULE_consoleStatement = 4, RULE_block = 5, RULE_expression = 6, RULE_simb = 7, 
		RULE_term = 8, RULE_identifier = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "whileStatment", "assignmentStatement", "consoleStatement", 
			"block", "expression", "simb", "term", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'not'", "'='", "','", "';'", "'('", "')'", "'{'", 
			"'}'", "'log'", "'console'", "'while'", "' \" '", "' . '", "'+'", "'-'", 
			"'*'", "'/'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "LOG", "CONSOLE", "WHILE", "Com", "Point", "ADD", 
			"RES", "MULT", "DIV", "BAJO", "INT", "ID", "WS"
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
	public String getGrammarFileName() { return "Analizador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AnalizadorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4206592L) != 0)) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public WhileStatmentContext whileStatment() {
			return getRuleContext(WhileStatmentContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ConsoleStatementContext consoleStatement() {
			return getRuleContext(ConsoleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				whileStatment();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				assignmentStatement();
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				consoleStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatmentContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AnalizadorParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AnalizadorParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AnalizadorParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterWhileStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitWhileStatment(this);
		}
	}

	public final WhileStatmentContext whileStatment() throws RecognitionException {
		WhileStatmentContext _localctx = new WhileStatmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whileStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(WHILE);
			setState(32);
			match(LPAREN);
			setState(33);
			expression();
			setState(34);
			match(RPAREN);
			setState(35);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(AnalizadorParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AnalizadorParser.SEMI, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			identifier();
			setState(38);
			match(EQ);
			setState(39);
			expression();
			setState(40);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleStatementContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(AnalizadorParser.CONSOLE, 0); }
		public TerminalNode Point() { return getToken(AnalizadorParser.Point, 0); }
		public TerminalNode LOG() { return getToken(AnalizadorParser.LOG, 0); }
		public TerminalNode LPAREN() { return getToken(AnalizadorParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AnalizadorParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AnalizadorParser.SEMI, 0); }
		public ConsoleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterConsoleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitConsoleStatement(this);
		}
	}

	public final ConsoleStatementContext consoleStatement() throws RecognitionException {
		ConsoleStatementContext _localctx = new ConsoleStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_consoleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(CONSOLE);
			setState(43);
			match(Point);
			setState(44);
			match(LOG);
			setState(45);
			match(LPAREN);
			setState(46);
			expression();
			setState(47);
			match(RPAREN);
			setState(48);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AnalizadorParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AnalizadorParser.RCURLY, 0); }
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
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LCURLY);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4206592L) != 0)) {
				{
				{
				setState(51);
				statement();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<SimbContext> simb() {
			return getRuleContexts(SimbContext.class);
		}
		public SimbContext simb(int i) {
			return getRuleContext(SimbContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			term();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0)) {
				{
				{
				setState(60);
				simb();
				setState(61);
				term();
				}
				}
				setState(67);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimbContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(AnalizadorParser.ADD, 0); }
		public TerminalNode RES() { return getToken(AnalizadorParser.RES, 0); }
		public TerminalNode MULT() { return getToken(AnalizadorParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(AnalizadorParser.DIV, 0); }
		public SimbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterSimb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitSimb(this);
		}
	}

	public final SimbContext simb() throws RecognitionException {
		SimbContext _localctx = new SimbContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INT() { return getToken(AnalizadorParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(AnalizadorParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AnalizadorParser.RPAREN, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				identifier();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(INT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(LPAREN);
				setState(73);
				expression();
				setState(74);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AnalizadorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AnalizadorParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(AnalizadorParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AnalizadorParser.INT, i);
		}
		public List<TerminalNode> BAJO() { return getTokens(AnalizadorParser.BAJO); }
		public TerminalNode BAJO(int i) {
			return getToken(AnalizadorParser.BAJO, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				{
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(84);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017V\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u00055\b\u0005"+
		"\n\u0005\f\u00058\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006@\b\u0006\n\u0006\f\u0006C\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bM\b\b\u0001\t\u0001\t\u0005\tQ\b\t\n\t\f\tT\t\t\u0001\t\u0000"+
		"\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0001"+
		"\u0000\u0010\u0013\u0001\u0000\u0014\u0016S\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000"+
		"\u0000\u0006%\u0001\u0000\u0000\u0000\b*\u0001\u0000\u0000\u0000\n2\u0001"+
		"\u0000\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000eD\u0001\u0000\u0000"+
		"\u0000\u0010L\u0001\u0000\u0000\u0000\u0012N\u0001\u0000\u0000\u0000\u0014"+
		"\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u001a\u001e\u0003\u0004\u0002\u0000\u001b"+
		"\u001e\u0003\u0006\u0003\u0000\u001c\u001e\u0003\b\u0004\u0000\u001d\u001a"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005"+
		"\r\u0000\u0000 !\u0005\u0007\u0000\u0000!\"\u0003\f\u0006\u0000\"#\u0005"+
		"\b\u0000\u0000#$\u0003\n\u0005\u0000$\u0005\u0001\u0000\u0000\u0000%&"+
		"\u0003\u0012\t\u0000&\'\u0005\u0004\u0000\u0000\'(\u0003\f\u0006\u0000"+
		"()\u0005\u0006\u0000\u0000)\u0007\u0001\u0000\u0000\u0000*+\u0005\f\u0000"+
		"\u0000+,\u0005\u000f\u0000\u0000,-\u0005\u000b\u0000\u0000-.\u0005\u0007"+
		"\u0000\u0000./\u0003\f\u0006\u0000/0\u0005\b\u0000\u000001\u0005\u0006"+
		"\u0000\u00001\t\u0001\u0000\u0000\u000026\u0005\t\u0000\u000035\u0003"+
		"\u0002\u0001\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u00009:\u0005\n\u0000\u0000:\u000b\u0001\u0000"+
		"\u0000\u0000;A\u0003\u0010\b\u0000<=\u0003\u000e\u0007\u0000=>\u0003\u0010"+
		"\b\u0000>@\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@C\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\r\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0007\u0000\u0000\u0000"+
		"E\u000f\u0001\u0000\u0000\u0000FM\u0003\u0012\t\u0000GM\u0005\u0015\u0000"+
		"\u0000HI\u0005\u0007\u0000\u0000IJ\u0003\f\u0006\u0000JK\u0005\b\u0000"+
		"\u0000KM\u0001\u0000\u0000\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000"+
		"\u0000\u0000LH\u0001\u0000\u0000\u0000M\u0011\u0001\u0000\u0000\u0000"+
		"NR\u0005\u0016\u0000\u0000OQ\u0007\u0001\u0000\u0000PO\u0001\u0000\u0000"+
		"\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000S\u0013\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"\u0006\u0017\u001d6ALR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}