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
        return visitChildren(ctx);
    }

    @Override public Object visitBody(MochaParser.BodyContext ctx) {
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
        if (!variable.containsKey(idToken)){
            Var var = new Var(data_type);
            variable.put(idToken,var);
        }else {
            outputStream.println("Err: duplicate declare " + idToken);
            semanticsErrors.add("Err: duplicate declare " + idToken);
        }
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
            Object rtn =  visit(ctx.expression());
//            Var value = (Var) visit(ctx.expression());
            variable.get(id).setValue(rtn);
//            System.out.println("value: " + value.getValue() + " type: " + value.getDataType());
//            variable.put(id, value);
        }
        return null;
    }

    @Override
    public Object visitExpression(MochaParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitArithmetic_expression(MochaParser.Arithmetic_expressionContext ctx) {
        if (ctx.arithmetic_expression().size() < 2) {
            return visitChildren(ctx);
        }
        String op = ctx.children.get(1).getText();
        Double left = Double.valueOf(visit(ctx.arithmetic_expression(0)).toString()) ;

        Double right = Double.valueOf(visit(ctx.arithmetic_expression(1)).toString()) ;
        Double rtn = 0.0;
        if (op.equals("+")) {
            rtn = left + right;
        } else if (op.equals("-")) {
            rtn = left - right;
        } else if (op.equals("*")) {
            rtn = left * right;
        } else if (op.equals("/")) {
            rtn = left / right;
        }
        return rtn;
    }

    @Override
    public Object visitRelational_expression(MochaParser.Relational_expressionContext ctx) {

        Double left = Double.valueOf(visit(ctx.expression_term(0)).toString()) ;
        Double right = Double.valueOf(visit(ctx.expression_term(1)).toString());
        String op = ctx.children.get(1).getText();
        if (op.equals("<")) {
            return left < right;
        } else if (op.equals(">")) {
            return left > right;
        } else if (op.equals("<=")) {
            return left <= right;
        } else if (op.equals(">=")) {
            return left >= right;
        } else if (op.equals("==")) {
            return left.equals(right);
        }else {
            return null;
        }
    }

    @Override
    public Object visitLogical_expression(MochaParser.Logical_expressionContext ctx) {
        if (ctx.expression_term().size() < 2 && ctx.OP_LOGICAL_NOT() != null) {
            return ! Boolean.valueOf(visit(ctx.expression_term(0)).toString());
        }
        Boolean left = Boolean.valueOf(visit(ctx.expression_term(0)).toString()) ;
        Boolean right = Boolean.valueOf(visit(ctx.expression_term(1)).toString());
        String op = ctx.children.get(1).getText();
        if (op.equals("&&")) {
            return left && right;
        } else if (op.equals("||")) {
            return left || right;
        }else{
            return null;
        }

    }

    @Override
    public Object visitTernary_expression(MochaParser.Ternary_expressionContext ctx) {

        return visitChildren(ctx);
    }


    @Override
    public Object visitExpression_term(MochaParser.Expression_termContext ctx) {
        Object rtn;
        if (ctx.IDENTIFIER() != null) {
            if (!variable.containsKey(ctx.IDENTIFIER().getText())) {
                Token idToken = ctx.IDENTIFIER().getSymbol();
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine() + 1;
                String id = ctx.IDENTIFIER().getText();
                outputStream.println("Err: Variable " + id + " at line " + line + " column " + column + " is not declared" );
                semanticsErrors.add("Err: Variable " + id + " at line " + line + " column " + column + " is not declared" );
            }
            String name = ctx.IDENTIFIER().getText();
            rtn = variable.get(name).getValue();

        } else {
            rtn = ctx.LITERAL();
        }
        System.out.println("expression term: " + rtn);
        return rtn;
    }

    @Override
    public Object visitIf_else_statement(MochaParser.If_else_statementContext ctx) {
//        if (ctx. != null) {
//            Object left = visit(ctx.expression_term(0));
//            Object right = visit(ctx.expression_term(1));
//            if (ctx.OP_SET_LOGICAL_BIN().getText().equals("and")) {
//                return (Boolean) left && (Boolean) right;
//            } else {
//                return (Boolean) left || (Boolean) right;
//            }
//        }
//        if (ctx.OP_SET_LOGICAL_UNI() != null) {
//            return !(Boolean) visit(ctx.expression_term(0));
//        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitIf_condition(MochaParser.If_conditionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_statement(MochaParser.For_statementContext ctx) {
        String var = ctx.for_expression().IDENTIFIER().getText();
        int start = Integer.parseInt(ctx.for_expression().LITERAL(0).getText());
        System.out.println("start: " + start);
        int end = Integer.parseInt(ctx.for_expression().LITERAL(1).getText());
        System.out.println("end: " + end);
        Var var1 = new Var("int");
        var1.setValue(start);
        variable.put(var, var1);
        for (int i = start; i < end; i++) {
            variable.get(var).setValue(i);
            visit(ctx.statement());
        }
        variable.remove(var);
        return null;
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

    public void printResults() {
        if (semanticsErrors.size() == 0){
            outputStream.println("Compiled successfully");
            printEnvironment();
        }else {
            for (int i = 0; i < semanticsErrors.size(); i++){
                outputStream.println(semanticsErrors.get(i));
            }
        }
    }

    public void printEnvironment() {
        for (Map.Entry<String, Var> set :
                variable.entrySet()) {
            outputStream.println(set.getKey() + " = "
                    + set.getValue().getValue());
        }
    }
}
