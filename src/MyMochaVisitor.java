import com.sun.jdi.Value;
import org.antlr.v4.runtime.Token;

import javax.sound.midi.Soundbank;
import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    private List<String> semanticsErrors;
    private Map<String, Var> variable;

    public MyMochaVisitor(PrintStream outputStream) {
        this.outputStream = outputStream;
        this.semanticsErrors = new ArrayList<>();
        this.variable = new HashMap<String, Var>();
    }

    @Override public Object visitProgram(MochaParser.ProgramContext ctx) {
        outputStream.println("Visiting Program ...");
        return visitChildren(ctx);
    }

    @Override public Object visitBody(MochaParser.BodyContext ctx) {
        outputStream.println("Visiting Body ...");
        System.out.println(ctx.getText());
        System.out.println("there are " + ctx.statement().size() + " statements");
//        for (MochaParser.StatementContext statementContext : ctx.statement()) {
//            System.out.println("statementContext: " + statementContext.getText());
//            visitChildren(statementContext);
//        }
        return visitChildren(ctx);
    }


    @Override
    public Object visitStatement(MochaParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable_declaration(MochaParser.Variable_declarationContext ctx) {
        String data_type = ctx.DATA_TYPE().getText();
        String idToken = ctx.identifier_list().getText();
        Var var = new Var();
        var.setDataType(data_type);
        var.setValue("");
        variable.put(idToken,var);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdentifier_list(MochaParser.Identifier_listContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignment_statement(MochaParser.Assignment_statementContext ctx) {
        Token idToken = ctx.IDENTIFIER().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String id = ctx.IDENTIFIER().getText();
        if (!variable.containsKey(id)) {
            outputStream.println("Err: Variable " + id + " at line " + line + " column " + column + " is not declared" );
            semanticsErrors.add("Err: Variable " + id + " at line " + line + " column " + column + " is not declared" );
        } else {
            // TYPE CHECKING HERE
            Var value = (Var) visit(ctx.expression());
            System.out.println("value: " + value.getValue() + " type: " + value.getDataType());
            variable.put(id, value);
        }
        return null;
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

        //Value left = this.visit
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
        String rtn;
        if (ctx.IDENTIFIER() != null) {
            if (!variable.containsKey(ctx.IDENTIFIER().getText())) {
                Token idToken = ctx.IDENTIFIER().getSymbol();
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine() + 1;
                String id = ctx.IDENTIFIER().getText();
                outputStream.println("Err: Variable " + id + " at line " + line + " column " + column + " is not declared" );
                semanticsErrors.add("Err: Variable " + id + " at line " + line + " column " + column + " is not declared" );
            }
            rtn = ctx.IDENTIFIER().getText();
        } else {
            rtn = ctx.LITERAL().getText();
        }
        return rtn;
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
