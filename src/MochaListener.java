// Generated from C:/Users/risha/Documents/GitHub/ser502-project/src\Mocha.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MochaParser}.
 */
public interface MochaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MochaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MochaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MochaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MochaParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MochaParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MochaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MochaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(MochaParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(MochaParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(MochaParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(MochaParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(MochaParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(MochaParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MochaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MochaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(MochaParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(MochaParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(MochaParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(MochaParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(MochaParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(MochaParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#ternary_expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary_expression(MochaParser.Ternary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#ternary_expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary_expression(MochaParser.Ternary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#expression_term}.
	 * @param ctx the parse tree
	 */
	void enterExpression_term(MochaParser.Expression_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#expression_term}.
	 * @param ctx the parse tree
	 */
	void exitExpression_term(MochaParser.Expression_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#if_else_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_statement(MochaParser.If_else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#if_else_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_statement(MochaParser.If_else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(MochaParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(MochaParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(MochaParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(MochaParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#for_expression}.
	 * @param ctx the parse tree
	 */
	void enterFor_expression(MochaParser.For_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#for_expression}.
	 * @param ctx the parse tree
	 */
	void exitFor_expression(MochaParser.For_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(MochaParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(MochaParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void enterWhile_condition(MochaParser.While_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void exitWhile_condition(MochaParser.While_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#for_in_range_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_range_statement(MochaParser.For_in_range_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#for_in_range_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_range_statement(MochaParser.For_in_range_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(MochaParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(MochaParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(MochaParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(MochaParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MochaParser#print_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPrint_argument_list(MochaParser.Print_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MochaParser#print_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPrint_argument_list(MochaParser.Print_argument_listContext ctx);
}