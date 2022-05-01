import org.antlr.v4.runtime.Token;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMochaVisitor extends MochaBaseVisitor<Object> {

    private final PrintStream outputStream;
    private final List<String> semanticsErrors;
    private final Map<String, Variable> variableMap;

    public MyMochaVisitor(PrintStream outputStream) {
        this.outputStream = outputStream;
        this.semanticsErrors = new ArrayList<>();
        this.variableMap = new HashMap<>();
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

    @Override public Object visitStatement(MochaParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    private String variableDeclarationDataType = null;
    @Override public Object visitVariable_declaration(MochaParser.Variable_declarationContext ctx) {
        variableDeclarationDataType = ctx.data_type().getText();
        return visitChildren(ctx);
    }

    @Override public Object visitIdentifier_list(MochaParser.Identifier_listContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if (!variableMap.containsKey(identifier)) {
            try {
                Variable variable = new Variable(variableDeclarationDataType);
                if (ctx.OP_ASSIGN() != null)
                    variable.setValue(visit(ctx.literal()));
                variableMap.put(identifier, variable);
            } catch (Exception ex) {
                outputStream.println("Err: failed to instantiate " + identifier);
                semanticsErrors.add("Err: failed to instantiate " + identifier);
            }
        } else {
            outputStream.println("Err: duplicate declare " + identifier);
            semanticsErrors.add("Err: duplicate declare " + identifier);
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignment_statement(MochaParser.Assignment_statementContext ctx) {
        Token idToken = ctx.IDENTIFIER().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String id = ctx.IDENTIFIER().getText();
        if (!variableMap.containsKey(id)) {
//            outputStream.println("Err: Variable " + id + " at line " + line + " column " + column + " is not declared" );
            semanticsErrors.add("Err: Variable " + id + " at line " + line + " column " + column + " is not declared" );
        } else {
            // TYPE CHECKING HERE
            Object rtn =  visit(ctx.expression());
//            Var value = (Var) visit(ctx.expression());
            try {
                variableMap.get(id).setValue(rtn);
            } catch (Exception ex) {
                // TODO: Record error that failed to assign value
            }
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
        Object expr= visit(ctx.relational_expression());
        Object value1 = visit(ctx.expression(0));
        Object value2 = visit(ctx.expression(1));
        if((boolean)expr == true){
            return value1;
        }
        else if((boolean)expr == false){
            return value2;
        }
        else{
            return null;
        }
    }


    @Override
    public Object visitExpression_term(MochaParser.Expression_termContext ctx) {
        Object rtn;
        if (ctx.IDENTIFIER() != null) {
            if (!variableMap.containsKey(ctx.IDENTIFIER().getText())) {
                Token idToken = ctx.IDENTIFIER().getSymbol();
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine() + 1;
                String id = ctx.IDENTIFIER().getText();
//                outputStream.println("Err: Variable " + id + " at line " + line + " column " + column + " is not declared" );
                semanticsErrors.add("Err: Variable " + id + " at line " + line + " column " + column + " is not declared" );
            }
            String name = ctx.IDENTIFIER().getText();
            rtn = variableMap.get(name).getValue();

        } else {
            rtn = visit(ctx.literal());
        }
//        System.out.println("expression term: " + rtn);
        return rtn;
    }

    @Override
    public Object visitIf_else_statement(MochaParser.If_else_statementContext ctx) {
        if (ctx.if_condition() == null) {
            return null;
        }
        System.out.println("if_else_statement" + ctx.getText());
        Object cond = visit(ctx.if_condition());
        if ((boolean)cond) {
            visit(ctx.body(0));
        } else {
            if (ctx.body(1) != null) {
                visit(ctx.body(1));
            }
        }
        return null;
    }

    @Override
    public Object visitIf_condition(MochaParser.If_conditionContext ctx) {
        if (ctx.relational_expression() != null) {
            return visit(ctx.relational_expression());
        } else {
            return visit(ctx.logical_expression());
        }
    }

    @Override
    public Object visitFor_statement(MochaParser.For_statementContext ctx) {
        String var = ctx.for_expression().IDENTIFIER().getText();
        if (variableMap.containsKey(var)) {
            Token idToken = ctx.for_expression().IDENTIFIER().getSymbol();
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            String id = ctx.for_expression().IDENTIFIER().getText();
            semanticsErrors.add("Err: Variable " + id + " at line " + line + " column " + column + " has been declared" );
            return null;
        }
        int start = Integer.parseInt(ctx.for_expression().INTEGER_LITERAL(0).getText());
        int end = Integer.parseInt(ctx.for_expression().INTEGER_LITERAL(1).getText());


        try {
        Variable var1 = new Variable("int");
            var1.setValue(start);
            variableMap.put(var, var1);
            for (int i = start; i < end; i++) {
                variableMap.get(var).setValue(i);
                visit(ctx.body());
            }
        } catch(Exception ex) {
            // TODO
        }
        variableMap.remove(var);
        return null;
    }

    @Override
    public Object visitFor_expression(MochaParser.For_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhile_statement(MochaParser.While_statementContext ctx) {
//        if (ctx.while_condition() == null) {
//            return null;
//        }
        Object cond = visit(ctx.while_condition());
        while ((boolean) cond){

            visit(ctx.body());
            cond = visit(ctx.while_condition());
        }
        return null;
    }

    @Override
    public Object visitWhile_condition(MochaParser.While_conditionContext ctx) {
        if (ctx.relational_expression() != null) {
            return visit(ctx.relational_expression());
        } else {
            return visit(ctx.logical_expression());
        }
    }

    @Override
    public Object visitFor_in_range_statement(MochaParser.For_in_range_statementContext ctx) {
        String var = ctx.IDENTIFIER().getText();
        if (variableMap.containsKey(var)) {
            Token idToken = ctx.IDENTIFIER().getSymbol();
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            String id = ctx.IDENTIFIER().getText();
            semanticsErrors.add("Err: Variable " + id + " at line " + line + " column " + column + " has been declared" );
            return null;
        }
        int start = Integer.parseInt(ctx.range().INTEGER_LITERAL(0).getText());
        int end = Integer.parseInt(ctx.range().INTEGER_LITERAL(1).getText());

        try {
            Variable var1 = new Variable("int");
            var1.setValue(start);
            variableMap.put(var, var1);
            for (int i = start; i < end; i++) {
                variableMap.get(var).setValue(i);
                visit(ctx.body());
            }
        } catch (Exception ex) {
            // TODO
        }
        variableMap.remove(var);
        return null;
    }

    @Override
    public Object visitRange(MochaParser.RangeContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitPrint_statement(MochaParser.Print_statementContext ctx) {
        visit(ctx.print_argument_list());
        return null;
    }

    @Override public Object visitPrint_argument_list(MochaParser.Print_argument_listContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String identifier = ctx.IDENTIFIER().getText();
            if (variableMap.containsKey(identifier)) {
                outputStream.print(variableMap.get(identifier).getValue());
            } else outputStream.print(identifier);
        } else if (ctx.literal() != null) outputStream.print(visit(ctx.literal()));
        else semanticsErrors.add("can not print null ");

//         if (ctx.print_argument_list() != null) {
//             visit(ctx.print_argument_list());
//         }
        return visitChildren(ctx);
    }

    @Override public Object visitLiteral(MochaParser.LiteralContext ctx) {
        String literal = ctx.getChild(0).getText();
        if (ctx.INTEGER_LITERAL() != null) return Integer.parseInt(literal);
        else if (ctx.FLOATING_POINT_LITERAL() != null) return Double.parseDouble(literal);
        else if (ctx.BOOLEAN_LITERAL() != null) return Boolean.parseBoolean(literal);
        else return literal.substring(1, literal.length() - 1);
    }

    @Override public Object visitData_type(MochaParser.Data_typeContext ctx) {
        return visitChildren(ctx);
    }

    public void printResults() {
        if (semanticsErrors.size() == 0) {
            outputStream.println("Compiled successfully");
//            printEnvironment();
        } else {
            for (String semanticsError : semanticsErrors) {
                outputStream.println(semanticsError);
            }
        }
    }

    public Map<String, Variable> getVariableMap() {
        return variableMap;
    };
}
