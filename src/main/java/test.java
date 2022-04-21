import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class test {
    public static void main(String[] args) {
        String MochaContent = "begin\n i = (4 + 4) * 3 - 2 / 2 \nend";
        MochaLexer mochaLexer = new MochaLexer(CharStreams.fromString(MochaContent));
        CommonTokenStream tokens = new CommonTokenStream(mochaLexer);
        MochaParser parser = new MochaParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
    }
}
