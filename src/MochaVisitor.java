// Generated from C:/Users/Shengdong/Documents/GitHub/SER502-Spring2022-Team1/src\Mocha.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MochaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MochaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MochaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MochaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MochaParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MochaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(MochaParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(MochaParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(MochaParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MochaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expression(MochaParser.Arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(MochaParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(MochaParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#ternary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_expression(MochaParser.Ternary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#expression_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_term(MochaParser.Expression_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#if_else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_statement(MochaParser.If_else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(MochaParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(MochaParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#for_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_expression(MochaParser.For_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(MochaParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#while_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_condition(MochaParser.While_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#for_in_range_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_range_statement(MochaParser.For_in_range_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(MochaParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(MochaParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MochaParser#print_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_argument_list(MochaParser.Print_argument_listContext ctx);
}