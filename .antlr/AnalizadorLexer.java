// Generated from c:/Users/Usuario/Desktop/MARAAA/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AnalizadorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, EQ=4, COMMA=5, SEMI=6, LPAREN=7, RPAREN=8, LCURLY=9, 
		RCURLY=10, LOG=11, CONSOLE=12, WHILE=13, Com=14, Point=15, ADD=16, RES=17, 
		MULT=18, DIV=19, BAJO=20, INT=21, ID=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", "LCURLY", 
			"RCURLY", "LOG", "CONSOLE", "WHILE", "Com", "Point", "ADD", "RES", "MULT", 
			"DIV", "BAJO", "INT", "ID", "WS"
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


	public AnalizadorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analizador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0004\u0014n\b\u0014\u000b\u0014\f\u0014o\u0001\u0015\u0001\u0015\u0005"+
		"\u0015t\b\u0015\n\u0015\f\u0015w\t\u0015\u0001\u0016\u0004\u0016z\b\u0016"+
		"\u000b\u0016\f\u0016{\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001"+
		"\u0000\u0004\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003"+
		"\u0000\t\n\f\r  \u0081\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000"+
		"\u0000\u00056\u0001\u0000\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t"+
		"<\u0001\u0000\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\r@\u0001\u0000"+
		"\u0000\u0000\u000fB\u0001\u0000\u0000\u0000\u0011D\u0001\u0000\u0000\u0000"+
		"\u0013F\u0001\u0000\u0000\u0000\u0015H\u0001\u0000\u0000\u0000\u0017L"+
		"\u0001\u0000\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001bZ\u0001\u0000"+
		"\u0000\u0000\u001d^\u0001\u0000\u0000\u0000\u001fb\u0001\u0000\u0000\u0000"+
		"!d\u0001\u0000\u0000\u0000#f\u0001\u0000\u0000\u0000%h\u0001\u0000\u0000"+
		"\u0000\'j\u0001\u0000\u0000\u0000)m\u0001\u0000\u0000\u0000+q\u0001\u0000"+
		"\u0000\u0000-y\u0001\u0000\u0000\u0000/0\u0005a\u0000\u000001\u0005n\u0000"+
		"\u000012\u0005d\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005o\u0000"+
		"\u000045\u0005r\u0000\u00005\u0004\u0001\u0000\u0000\u000067\u0005n\u0000"+
		"\u000078\u0005o\u0000\u000089\u0005t\u0000\u00009\u0006\u0001\u0000\u0000"+
		"\u0000:;\u0005=\u0000\u0000;\b\u0001\u0000\u0000\u0000<=\u0005,\u0000"+
		"\u0000=\n\u0001\u0000\u0000\u0000>?\u0005;\u0000\u0000?\f\u0001\u0000"+
		"\u0000\u0000@A\u0005(\u0000\u0000A\u000e\u0001\u0000\u0000\u0000BC\u0005"+
		")\u0000\u0000C\u0010\u0001\u0000\u0000\u0000DE\u0005{\u0000\u0000E\u0012"+
		"\u0001\u0000\u0000\u0000FG\u0005}\u0000\u0000G\u0014\u0001\u0000\u0000"+
		"\u0000HI\u0005l\u0000\u0000IJ\u0005o\u0000\u0000JK\u0005g\u0000\u0000"+
		"K\u0016\u0001\u0000\u0000\u0000LM\u0005c\u0000\u0000MN\u0005o\u0000\u0000"+
		"NO\u0005n\u0000\u0000OP\u0005s\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005"+
		"l\u0000\u0000RS\u0005e\u0000\u0000S\u0018\u0001\u0000\u0000\u0000TU\u0005"+
		"w\u0000\u0000UV\u0005h\u0000\u0000VW\u0005i\u0000\u0000WX\u0005l\u0000"+
		"\u0000XY\u0005e\u0000\u0000Y\u001a\u0001\u0000\u0000\u0000Z[\u0005 \u0000"+
		"\u0000[\\\u0005\"\u0000\u0000\\]\u0005 \u0000\u0000]\u001c\u0001\u0000"+
		"\u0000\u0000^_\u0005 \u0000\u0000_`\u0005.\u0000\u0000`a\u0005 \u0000"+
		"\u0000a\u001e\u0001\u0000\u0000\u0000bc\u0005+\u0000\u0000c \u0001\u0000"+
		"\u0000\u0000de\u0005-\u0000\u0000e\"\u0001\u0000\u0000\u0000fg\u0005*"+
		"\u0000\u0000g$\u0001\u0000\u0000\u0000hi\u0005/\u0000\u0000i&\u0001\u0000"+
		"\u0000\u0000jk\u0005_\u0000\u0000k(\u0001\u0000\u0000\u0000ln\u0007\u0000"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p*\u0001\u0000\u0000\u0000"+
		"qu\u0007\u0001\u0000\u0000rt\u0007\u0002\u0000\u0000sr\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000v,\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xz\u0007"+
		"\u0003\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0006\u0016\u0000\u0000~.\u0001\u0000\u0000\u0000\u0004\u0000"+
		"ou{\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}