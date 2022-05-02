import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMochaVisitor extends MochaBaseVisitor<Object> {

    private final PrintStream outputStream;
    private final List<Error> semanticErrorList;
    private final Map<String, Variable> variableMap;

    public MyMochaVisitor(PrintStream outputStream) {
        this.outputStream = outputStream;
        this.semanticErrorList = new ArrayList<>();
        this.variableMap = new HashMap<>();
    }

    @Override public Object visitProgram(MochaParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitBody(MochaParser.BodyContext ctx) {
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
        Token idToken = ctx.IDENTIFIER().getSymbol();
        String identifier = ctx.IDENTIFIER().getText();
        if (!variableMap.containsKey(identifier)) {
            try {
                Variable variable = new Variable(variableDeclarationDataType);
                if (ctx.OP_ASSIGN() != null)
                    variable.setValue(visit(ctx.literal()));
                variableMap.put(identifier, variable);
            } catch (Exception ex) {
                semanticErrorList.add(new Error(String.format("variable '%s' initialization failed: %s",
                        identifier, ex.getMessage()), idToken.getLine(), idToken.getCharPositionInLine() + 1));
            }
        } else {
            semanticErrorList.add(new Error(String.format("variable '%s' is previously declared", identifier),
                    idToken.getLine(), idToken.getCharPositionInLine() + 1));
        }
        return visitChildren(ctx);
    }

    @Override public Object visitAssignment_statement(MochaParser.Assignment_statementContext ctx) {
        Token idToken = ctx.IDENTIFIER().getSymbol();
        String identifier = ctx.IDENTIFIER().getText();
        if (!variableMap.containsKey(identifier)) {
            semanticErrorList.add(new Error(String.format("variable '%s' is not declared", identifier),
                    idToken.getLine(), idToken.getCharPositionInLine() + 1));
        } else {
            try {
                Object value = visit(ctx.expression());
                variableMap.get(identifier).setValue(value);
            } catch (Exception ex) {
                semanticErrorList.add(new Error(String.format("variable '%s' cannot be assigned to RHS: %s",
                        identifier, ex.getMessage()), idToken.getLine(), idToken.getCharPositionInLine() + 1));
            }
        }
        return null;
    }

    @Override public Object visitExpression(MochaParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitArithmetic_expression(MochaParser.Arithmetic_expressionContext ctx) {
        if (ctx.arithmetic_expression().size() < 2)
            return visitChildren(ctx);

        Object leftOperand = visit(ctx.arithmetic_expression(0));
        Object rightOperand = visit(ctx.arithmetic_expression(1));

        TerminalNode operatorNode = ctx.OP_ADD() != null ? ctx.OP_ADD()
                : ctx.OP_SUB() != null ? ctx.OP_SUB()
                : ctx.OP_MUL() != null ? ctx.OP_MUL()
                : ctx.OP_DIV();
        Token operatorToken = operatorNode.getSymbol();
        String operator = operatorNode.getText();

        if ((leftOperand instanceof Integer || leftOperand instanceof Double) &&
                (rightOperand instanceof Integer || rightOperand instanceof Double)) {

            if (leftOperand instanceof Integer && rightOperand instanceof Integer) { // INTEGER ARITHMETIC
                int leftOperandInt = (Integer) leftOperand;
                double rightOperandInt = (Integer) rightOperand;

                if (operator.equals("+")) return leftOperandInt + rightOperandInt;
                else if (operator.equals("-")) return leftOperandInt - rightOperandInt;
                else if (operator.equals("*")) return leftOperandInt * rightOperandInt;
                else if (operator.equals("/")) {
                    if (rightOperandInt != 0) return leftOperandInt / rightOperandInt;
                    else semanticErrorList.add(new Error("divide by zero", operatorToken.getLine(),
                            operatorToken.getCharPositionInLine() + 1));
                }
            } else { // FLOATING POINT ARITHMETIC
                double leftOperandDouble = leftOperand instanceof Double ? (Double)leftOperand : ((Integer)leftOperand).doubleValue();
                double rightOperandDouble = rightOperand instanceof Double ? (Double)rightOperand : ((Integer)rightOperand).doubleValue();

                if (operator.equals("+")) return leftOperandDouble + rightOperandDouble;
                else if (operator.equals("-")) return leftOperandDouble - rightOperandDouble;
                else if (operator.equals("*")) return leftOperandDouble * rightOperandDouble;
                else if (operator.equals("/")) {
                    if (rightOperandDouble != 0.0) return leftOperandDouble / rightOperandDouble;
                    else semanticErrorList.add(new Error("divide by zero",  operatorToken.getLine(),
                            operatorToken.getCharPositionInLine() + 1));
                }
            }
        } else {
            semanticErrorList.add(new Error("unsupported operands in arithmetic expression",
                    operatorToken.getLine(), operatorToken.getCharPositionInLine() + 1));
        }
        return null;
    }

    @Override public Object visitRelational_expression(MochaParser.Relational_expressionContext ctx) {
        if (ctx.expression_term().size() < 2)
            return visitChildren(ctx);

        Object leftOperand = visit(ctx.expression_term(0));
        Object rightOperand = visit(ctx.expression_term(1));

        TerminalNode operatorNode = ctx.OP_EQUALS() != null ? ctx.OP_EQUALS()
                : ctx.OP_GREATER() != null ? ctx.OP_GREATER()
                : ctx.OP_SMALLER() != null ? ctx.OP_SMALLER()
                : ctx.OP_GREATER_EQUALS() != null ? ctx.OP_GREATER_EQUALS()
                : ctx.OP_SMALLER_EQUALS();
        Token operatorToken = operatorNode.getSymbol();
        String operator = operatorNode.getText();

        if ((leftOperand instanceof Integer || leftOperand instanceof Double) &&
                (rightOperand instanceof Integer || rightOperand instanceof Double)) {

            double leftOperandDouble = leftOperand instanceof Double ? (Double)leftOperand : ((Integer)leftOperand).doubleValue();
            double rightOperandDouble = rightOperand instanceof Double ? (Double)rightOperand : ((Integer)rightOperand).doubleValue();

            if (operator.equals("<")) return leftOperandDouble < rightOperandDouble;
            else if (operator.equals(">"))return leftOperandDouble > rightOperandDouble;
            else if (operator.equals("<=")) return leftOperandDouble <= rightOperandDouble;
            else if (operator.equals(">=")) return leftOperandDouble >= rightOperandDouble;
            else if (operator.equals("==")) return leftOperandDouble == rightOperandDouble;
        } else {
            semanticErrorList.add(new Error("unsupported operands in relational expression",
                    operatorToken.getLine(), operatorToken.getCharPositionInLine() + 1));
        }
        return null;
    }

    @Override public Object visitLogical_expression(MochaParser.Logical_expressionContext ctx) {
        if (ctx.OP_LOGICAL_NOT() != null)
            return ! ((Boolean) visit(ctx.expression_term(0)));

        if (ctx.expression_term().size() == 1)
            return visit(ctx.expression_term(0));

        Object leftOperand = visit(ctx.expression_term(0));
        Object rightOperand = visit(ctx.expression_term(1));

        TerminalNode operatorNode = ctx.OP_LOGICAL_AND() != null ? ctx.OP_LOGICAL_AND() : ctx.OP_LOGICAL_OR();
        Token operatorToken = operatorNode.getSymbol();
        String operator = operatorNode.getText();

        if (leftOperand instanceof Boolean && rightOperand instanceof Boolean) {
            if (operator.equals("&&")) return (Boolean)leftOperand && (Boolean)rightOperand;
            else if (operator.equals("||")) return (Boolean)leftOperand || (Boolean)rightOperand;
        } else {
            semanticErrorList.add(new Error("unsupported operands in logical expression",
                    operatorToken.getLine(), operatorToken.getCharPositionInLine() + 1));
        }
        return null;
    }

    @Override public Object visitTernary_expression(MochaParser.Ternary_expressionContext ctx) {
        Object conditionValue = visit(ctx.relational_expression());
        Object value1 = visit(ctx.expression(0));
        Object value2 = visit(ctx.expression(1));
        return (Boolean) conditionValue ? value1 : value2;
    }

    @Override public Object visitExpression_term(MochaParser.Expression_termContext ctx) {
        if (ctx.BOOLEAN_FALSE() != null) return false;
        else if (ctx.BOOLEAN_TRUE() != null) return true;
        else if (ctx.IDENTIFIER() != null) {
            Token idToken = ctx.IDENTIFIER().getSymbol();
            String identifier = ctx.IDENTIFIER().getText();
            if (!variableMap.containsKey(ctx.IDENTIFIER().getText())) {
                semanticErrorList.add(new Error(String.format("variable '%s' is not declared", identifier),
                        idToken.getLine(), idToken.getCharPositionInLine() + 1));
            }
            return variableMap.get(identifier).getValue();
        } else return visit(ctx.literal());
    }

    @Override public Object visitIf_else_statement(MochaParser.If_else_statementContext ctx) {
        Object conditionValue = visit(ctx.if_condition());
        if ((Boolean) conditionValue) visit(ctx.body(0));
        else if (ctx.body(1) != null)
            visit(ctx.body(1));
        return null;
    }

    @Override public Object visitIf_condition(MochaParser.If_conditionContext ctx) {
        if (ctx.relational_expression() != null)
            return visit(ctx.relational_expression());
        else return visit(ctx.logical_expression());
    }

    @Override public Object visitFor_statement(MochaParser.For_statementContext ctx) {
        Token idToken = ctx.for_expression().IDENTIFIER().getSymbol();
        String identifier = ctx.for_expression().IDENTIFIER().getText();
        if (variableMap.containsKey(identifier)) {
            semanticErrorList.add(new Error(String.format("variable '%s' is previously declared", identifier),
                    idToken.getLine(), idToken.getCharPositionInLine() + 1));
            return null;
        }

        try {
            int start = Integer.parseInt(ctx.for_expression().INTEGER_LITERAL(0).getText());
            int end = Integer.parseInt(ctx.for_expression().INTEGER_LITERAL(1).getText());

            Variable variable = new Variable("int");
            variable.setValue(start);
            variableMap.put(identifier, variable);

            for (int i = start; i < end; i++) {
                variableMap.get(identifier).setValue(i);
                visit(ctx.body());
            }
        } catch (Exception ignored) {
        } finally {
            variableMap.remove(identifier);
        }
        return null;
    }

    @Override public Object visitFor_expression(MochaParser.For_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitWhile_statement(MochaParser.While_statementContext ctx) {
        Object conditionValue = visit(ctx.while_condition());
        while ((Boolean) conditionValue) {
            visit(ctx.body());
            conditionValue = visit(ctx.while_condition());
        }
        return null;
    }

    @Override public Object visitWhile_condition(MochaParser.While_conditionContext ctx) {
       return ctx.relational_expression() != null ? visit(ctx.relational_expression()) : visit(ctx.logical_expression());
    }

    @Override
    public Object visitFor_in_range_statement(MochaParser.For_in_range_statementContext ctx) {
        Token idToken = ctx.IDENTIFIER().getSymbol();
        String identifier = ctx.IDENTIFIER().getText();
        if (variableMap.containsKey(identifier)) {
            semanticErrorList.add(new Error(String.format("variable '%s' is previously declared", identifier),
                    idToken.getLine(), idToken.getCharPositionInLine() + 1));
            return null;
        }

        try {
            int start = Integer.parseInt(ctx.range().INTEGER_LITERAL(0).getText());
            int end = Integer.parseInt(ctx.range().INTEGER_LITERAL(1).getText());

            Variable variable = new Variable("int");
            variable.setValue(start);
            variableMap.put(identifier, variable);

            for (int i = start; i < end; i++) {
                variableMap.get(identifier).setValue(i);
                visit(ctx.body());
            }
        } catch (Exception ignored) {
        } finally {
            variableMap.remove(identifier);
        }
        return null;
    }

    @Override public Object visitRange(MochaParser.RangeContext ctx) {
        return visitChildren(ctx);
    }

    private final StringBuilder printBuffer = new StringBuilder();
    @Override public Object visitPrint_statement(MochaParser.Print_statementContext ctx) {
        visit(ctx.print_argument_list());
        return null;
    }

    @Override public Object visitPrint_argument_list(MochaParser.Print_argument_listContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            Token idToken = ctx.IDENTIFIER().getSymbol();
            String identifier = ctx.IDENTIFIER().getText();
            if (variableMap.containsKey(identifier)) {
                printBuffer.append(variableMap.get(identifier).getValue());
            } else {
                semanticErrorList.add(new Error(String.format("variable '%s' is not declared", identifier),
                        idToken.getLine(), idToken.getCharPositionInLine() + 1));
            }
        } else if (ctx.literal() != null) {
            printBuffer.append(visit(ctx.literal()));
        }
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

    public void evaluationResult() {
        if (semanticErrorList.size() == 0) {
            outputStream.println("Program Evaluation Successful.");
            outputStream.println(printBuffer);
        } else {
            outputStream.println("Program Evaluation Failed. Please Correct The Following Errors:");
            for (Error semanticError : semanticErrorList)
                outputStream.println(semanticError);
        }
    }

    public Map<String, Variable> getVariableMap() {
        return variableMap;
    }
}
