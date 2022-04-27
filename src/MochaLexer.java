// Generated from C:/Users/risha/Documents/GitHub/ser502-project/src\Mocha.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MochaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "DATA_TYPE", "DATA_TYPE_INT", 
			"DATA_TYPE_FLOAT", "DATA_TYPE_BOOLEAN", "DATA_TYPE_STRING", "IDENTIFIER", 
			"LITERAL", "INTEGER_LITERAL", "FLOATING_POINT_LITERAL", "BOOLEAN_LITERAL", 
			"STRING_LITERAL", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "WHITESPACE", "OP_ASSIGN", 
			"OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "OP_SET_RELATIONAL", "OP_EQUALS", 
			"OP_SMALLER", "OP_GREATER", "OP_SMALLER_EQUALS", "OP_GREATER_EQUALS", 
			"OP_SET_LOGICAL", "OP_SET_LOGICAL_UNI", "OP_SET_LOGICAL_BIN", "OP_LOGICAL_AND", 
			"OP_LOGICAL_OR", "OP_LOGICAL_NOT", "OP_TERNARY_TRUE", "OP_TERNARY_FALSE"
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


	public MochaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mocha.g4"; }

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
		"\u0004\u0000/\u0129\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0096\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u00b3\b\u0013\n\u0013\f\u0013\u00b6\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00bc\b\u0014"+
		"\u0001\u0015\u0003\u0015\u00bf\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00c3\b\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u00c7\b\u0015\u000b"+
		"\u0015\f\u0015\u00c8\u0003\u0015\u00cb\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0004\u0016\u00d0\b\u0016\u000b\u0016\f\u0016\u00d1\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00d6\b\u0017\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u00da\b\u0018\n\u0018\f\u0018\u00dd\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0004\u001b\u00ed\b\u001b\u000b\u001b\f\u001b\u00ee\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0102\b!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$"+
		"\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003"+
		"\'\u0113\b\'\u0001(\u0001(\u0001)\u0001)\u0003)\u0119\b)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001.\u0001.\u0001\u00db\u0000/\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/\u0001\u0000"+
		"\u0006\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000++--\u0001\u0000"+
		"09\u0001\u000019\u0003\u0000\t\n\r\r  \u013d\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M"+
		"\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000"+
		"\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000"+
		"\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000["+
		"\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0001_\u0001\u0000"+
		"\u0000\u0000\u0003e\u0001\u0000\u0000\u0000\u0005i\u0001\u0000\u0000\u0000"+
		"\u0007k\u0001\u0000\u0000\u0000\tm\u0001\u0000\u0000\u0000\u000bo\u0001"+
		"\u0000\u0000\u0000\rr\u0001\u0000\u0000\u0000\u000ft\u0001\u0000\u0000"+
		"\u0000\u0011v\u0001\u0000\u0000\u0000\u0013{\u0001\u0000\u0000\u0000\u0015"+
		"\u007f\u0001\u0000\u0000\u0000\u0017\u0082\u0001\u0000\u0000\u0000\u0019"+
		"\u0088\u0001\u0000\u0000\u0000\u001b\u008b\u0001\u0000\u0000\u0000\u001d"+
		"\u0095\u0001\u0000\u0000\u0000\u001f\u0097\u0001\u0000\u0000\u0000!\u009b"+
		"\u0001\u0000\u0000\u0000#\u00a1\u0001\u0000\u0000\u0000%\u00a9\u0001\u0000"+
		"\u0000\u0000\'\u00b0\u0001\u0000\u0000\u0000)\u00bb\u0001\u0000\u0000"+
		"\u0000+\u00ca\u0001\u0000\u0000\u0000-\u00cc\u0001\u0000\u0000\u0000/"+
		"\u00d5\u0001\u0000\u0000\u00001\u00d7\u0001\u0000\u0000\u00003\u00e0\u0001"+
		"\u0000\u0000\u00005\u00e5\u0001\u0000\u0000\u00007\u00ec\u0001\u0000\u0000"+
		"\u00009\u00f2\u0001\u0000\u0000\u0000;\u00f4\u0001\u0000\u0000\u0000="+
		"\u00f6\u0001\u0000\u0000\u0000?\u00f8\u0001\u0000\u0000\u0000A\u00fa\u0001"+
		"\u0000\u0000\u0000C\u0101\u0001\u0000\u0000\u0000E\u0103\u0001\u0000\u0000"+
		"\u0000G\u0106\u0001\u0000\u0000\u0000I\u0108\u0001\u0000\u0000\u0000K"+
		"\u010a\u0001\u0000\u0000\u0000M\u010d\u0001\u0000\u0000\u0000O\u0112\u0001"+
		"\u0000\u0000\u0000Q\u0114\u0001\u0000\u0000\u0000S\u0118\u0001\u0000\u0000"+
		"\u0000U\u011a\u0001\u0000\u0000\u0000W\u011e\u0001\u0000\u0000\u0000Y"+
		"\u0121\u0001\u0000\u0000\u0000[\u0125\u0001\u0000\u0000\u0000]\u0127\u0001"+
		"\u0000\u0000\u0000_`\u0005b\u0000\u0000`a\u0005e\u0000\u0000ab\u0005g"+
		"\u0000\u0000bc\u0005i\u0000\u0000cd\u0005n\u0000\u0000d\u0002\u0001\u0000"+
		"\u0000\u0000ef\u0005e\u0000\u0000fg\u0005n\u0000\u0000gh\u0005d\u0000"+
		"\u0000h\u0004\u0001\u0000\u0000\u0000ij\u0005,\u0000\u0000j\u0006\u0001"+
		"\u0000\u0000\u0000kl\u0005(\u0000\u0000l\b\u0001\u0000\u0000\u0000mn\u0005"+
		")\u0000\u0000n\n\u0001\u0000\u0000\u0000op\u0005i\u0000\u0000pq\u0005"+
		"f\u0000\u0000q\f\u0001\u0000\u0000\u0000rs\u0005{\u0000\u0000s\u000e\u0001"+
		"\u0000\u0000\u0000tu\u0005}\u0000\u0000u\u0010\u0001\u0000\u0000\u0000"+
		"vw\u0005e\u0000\u0000wx\u0005l\u0000\u0000xy\u0005s\u0000\u0000yz\u0005"+
		"e\u0000\u0000z\u0012\u0001\u0000\u0000\u0000{|\u0005f\u0000\u0000|}\u0005"+
		"o\u0000\u0000}~\u0005r\u0000\u0000~\u0014\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005t\u0000\u0000\u0080\u0081\u0005o\u0000\u0000\u0081\u0016\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005w\u0000\u0000\u0083\u0084\u0005h\u0000"+
		"\u0000\u0084\u0085\u0005i\u0000\u0000\u0085\u0086\u0005l\u0000\u0000\u0086"+
		"\u0087\u0005e\u0000\u0000\u0087\u0018\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005i\u0000\u0000\u0089\u008a\u0005n\u0000\u0000\u008a\u001a\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005p\u0000\u0000\u008c\u008d\u0005r\u0000\u0000"+
		"\u008d\u008e\u0005i\u0000\u0000\u008e\u008f\u0005n\u0000\u0000\u008f\u0090"+
		"\u0005t\u0000\u0000\u0090\u001c\u0001\u0000\u0000\u0000\u0091\u0096\u0003"+
		"\u001f\u000f\u0000\u0092\u0096\u0003!\u0010\u0000\u0093\u0096\u0003#\u0011"+
		"\u0000\u0094\u0096\u0003%\u0012\u0000\u0095\u0091\u0001\u0000\u0000\u0000"+
		"\u0095\u0092\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u001e\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005i\u0000\u0000\u0098\u0099\u0005n\u0000\u0000\u0099\u009a"+
		"\u0005t\u0000\u0000\u009a \u0001\u0000\u0000\u0000\u009b\u009c\u0005f"+
		"\u0000\u0000\u009c\u009d\u0005l\u0000\u0000\u009d\u009e\u0005o\u0000\u0000"+
		"\u009e\u009f\u0005a\u0000\u0000\u009f\u00a0\u0005t\u0000\u0000\u00a0\""+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005b\u0000\u0000\u00a2\u00a3\u0005"+
		"o\u0000\u0000\u00a3\u00a4\u0005o\u0000\u0000\u00a4\u00a5\u0005l\u0000"+
		"\u0000\u00a5\u00a6\u0005e\u0000\u0000\u00a6\u00a7\u0005a\u0000\u0000\u00a7"+
		"\u00a8\u0005n\u0000\u0000\u00a8$\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"s\u0000\u0000\u00aa\u00ab\u0005t\u0000\u0000\u00ab\u00ac\u0005r\u0000"+
		"\u0000\u00ac\u00ad\u0005i\u0000\u0000\u00ad\u00ae\u0005n\u0000\u0000\u00ae"+
		"\u00af\u0005g\u0000\u0000\u00af&\u0001\u0000\u0000\u0000\u00b0\u00b4\u0007"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0007\u0001\u0000\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5(\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00bc\u0003+\u0015"+
		"\u0000\u00b8\u00bc\u0003-\u0016\u0000\u00b9\u00bc\u0003/\u0017\u0000\u00ba"+
		"\u00bc\u00031\u0018\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc*\u0001\u0000\u0000\u0000\u00bd\u00bf\u0007"+
		"\u0002\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00cb\u0007"+
		"\u0003\u0000\u0000\u00c1\u00c3\u0007\u0002\u0000\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c6\u0007\u0004\u0000\u0000\u00c5\u00c7\u0007"+
		"\u0003\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00be\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c2\u0001\u0000\u0000\u0000\u00cb,\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0003+\u0015\u0000\u00cd\u00cf\u0005.\u0000\u0000"+
		"\u00ce\u00d0\u0007\u0003\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2.\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u00033\u0019\u0000\u00d4\u00d6\u00035\u001a\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d60\u0001\u0000"+
		"\u0000\u0000\u00d7\u00db\u0005\"\u0000\u0000\u00d8\u00da\t\u0000\u0000"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\"\u0000\u0000\u00df2\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005t\u0000\u0000\u00e1\u00e2\u0005r\u0000\u0000\u00e2\u00e3"+
		"\u0005u\u0000\u0000\u00e3\u00e4\u0005e\u0000\u0000\u00e44\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005f\u0000\u0000\u00e6\u00e7\u0005a\u0000\u0000"+
		"\u00e7\u00e8\u0005l\u0000\u0000\u00e8\u00e9\u0005s\u0000\u0000\u00e9\u00ea"+
		"\u0005e\u0000\u0000\u00ea6\u0001\u0000\u0000\u0000\u00eb\u00ed\u0007\u0005"+
		"\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0006\u001b"+
		"\u0000\u0000\u00f18\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005=\u0000\u0000"+
		"\u00f3:\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005+\u0000\u0000\u00f5<"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005-\u0000\u0000\u00f7>\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0005*\u0000\u0000\u00f9@\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005/\u0000\u0000\u00fbB\u0001\u0000\u0000\u0000\u00fc\u0102"+
		"\u0003E\"\u0000\u00fd\u0102\u0003G#\u0000\u00fe\u0102\u0003I$\u0000\u00ff"+
		"\u0102\u0003K%\u0000\u0100\u0102\u0003M&\u0000\u0101\u00fc\u0001\u0000"+
		"\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0101\u00fe\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u0102D\u0001\u0000\u0000\u0000\u0103\u0104\u0005=\u0000\u0000"+
		"\u0104\u0105\u0005=\u0000\u0000\u0105F\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0005<\u0000\u0000\u0107H\u0001\u0000\u0000\u0000\u0108\u0109\u0005>"+
		"\u0000\u0000\u0109J\u0001\u0000\u0000\u0000\u010a\u010b\u0005<\u0000\u0000"+
		"\u010b\u010c\u0005=\u0000\u0000\u010cL\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005>\u0000\u0000\u010e\u010f\u0005=\u0000\u0000\u010fN\u0001\u0000"+
		"\u0000\u0000\u0110\u0113\u0003Q(\u0000\u0111\u0113\u0003S)\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113"+
		"P\u0001\u0000\u0000\u0000\u0114\u0115\u0003Y,\u0000\u0115R\u0001\u0000"+
		"\u0000\u0000\u0116\u0119\u0003U*\u0000\u0117\u0119\u0003W+\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119"+
		"T\u0001\u0000\u0000\u0000\u011a\u011b\u0005a\u0000\u0000\u011b\u011c\u0005"+
		"n\u0000\u0000\u011c\u011d\u0005d\u0000\u0000\u011dV\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0005o\u0000\u0000\u011f\u0120\u0005r\u0000\u0000\u0120"+
		"X\u0001\u0000\u0000\u0000\u0121\u0122\u0005n\u0000\u0000\u0122\u0123\u0005"+
		"o\u0000\u0000\u0123\u0124\u0005t\u0000\u0000\u0124Z\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0005?\u0000\u0000\u0126\\\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0005:\u0000\u0000\u0128^\u0001\u0000\u0000\u0000\u000f\u0000"+
		"\u0095\u00b4\u00bb\u00be\u00c2\u00c8\u00ca\u00d1\u00d5\u00db\u00ee\u0101"+
		"\u0112\u0118\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}