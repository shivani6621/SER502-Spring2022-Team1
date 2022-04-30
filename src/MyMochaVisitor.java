import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class MyMochaVisitor extends MochaBaseVisitor<Object> {

    /* TODO: Need to store the variables in a map (Our environment). We can either store all of the variable values in
        one single map or we can store int, float, boolean and string values in four separate maps.
        Method 1:
            private Map<String, Object> variableMap = new HashMap<>();
        Method2:
            private Map<String, Integer> intVariableMap = new HashMap<>();
            private Map<String, Float> floatVariableMap = new HashMap<>();
            private Map<String, Boolean> booleanVariableMap = new HashMap<>();
            private Map<String, String> stringVariableMap = new HashMap<>();
    */

    private final PrintStream outputStream;

    public MyMochaVisitor(PrintStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override public Object visitProgram(MochaParser.ProgramContext ctx) {
        outputStream.println("Visiting Program ...");
        return visitChildren(ctx);
    }

    @Override public Object visitBody(MochaParser.BodyContext ctx) {
        outputStream.println("Visiting Body ...");
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement(MochaParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable_declaration(MochaParser.Variable_declarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdentifier_list(MochaParser.Identifier_listContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignment_statement(MochaParser.Assignment_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpression(MochaParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitArithmetic_expression(MochaParser.Arithmetic_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitRelational_expression(MochaParser.Relational_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitLogical_expression(MochaParser.Logical_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitTernary_expression(MochaParser.Ternary_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpression_term(MochaParser.Expression_termContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitIf_else_statement(MochaParser.If_else_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitIf_condition(MochaParser.If_conditionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_statement(MochaParser.For_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_expression(MochaParser.For_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhile_statement(MochaParser.While_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhile_condition(MochaParser.While_conditionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_in_range_statement(MochaParser.For_in_range_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitRange(MochaParser.RangeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrint_statement(MochaParser.Print_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrint_argument_list(MochaParser.Print_argument_listContext ctx) {
        return visitChildren(ctx);
    }
}
