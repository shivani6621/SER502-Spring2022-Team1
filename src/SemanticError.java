public class SemanticError {

    private final String message;
    private final int lineNo;
    private final int position;

    public SemanticError(String message, int lineNo, int position) {
        this.message = message;
        this.lineNo = lineNo;
        this.position = position;
    }

    public String toString() {
        return String.format("Line %02d (Position: %02d) - %s", lineNo, position, message);
    }
}
