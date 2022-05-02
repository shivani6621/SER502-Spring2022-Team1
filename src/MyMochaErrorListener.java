import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MyMochaErrorListener extends BaseErrorListener {

    private final PrintStream outputStream;
    private final List<Error> syntaxErrorList = new ArrayList<>();

    public MyMochaErrorListener(PrintStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {
        syntaxErrorList.add(new Error(msg, line, charPositionInLine + 1));
    }

    public boolean parseResult() {
        if (syntaxErrorList.size() == 0) {
            outputStream.println("Program Parsing Successful.");
            return true;
        } else {
            outputStream.println("Program Parsing Failed. Please Correct The Following Errors:");
            for (Error syntaxError : syntaxErrorList)
                outputStream.println(syntaxError);
            return false;
        }
    }
}
