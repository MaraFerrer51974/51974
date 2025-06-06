// Generated from c:/Users/Usuario/Desktop/MARAAA/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnalizadorParser}.
 */
public interface AnalizadorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AnalizadorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AnalizadorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AnalizadorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AnalizadorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#whileStatment}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatment(AnalizadorParser.WhileStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#whileStatment}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatment(AnalizadorParser.WhileStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(AnalizadorParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(AnalizadorParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#consoleStatement}.
	 * @param ctx the parse tree
	 */
	void enterConsoleStatement(AnalizadorParser.ConsoleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#consoleStatement}.
	 * @param ctx the parse tree
	 */
	void exitConsoleStatement(AnalizadorParser.ConsoleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AnalizadorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AnalizadorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AnalizadorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AnalizadorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#simb}.
	 * @param ctx the parse tree
	 */
	void enterSimb(AnalizadorParser.SimbContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#simb}.
	 * @param ctx the parse tree
	 */
	void exitSimb(AnalizadorParser.SimbContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AnalizadorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AnalizadorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AnalizadorParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AnalizadorParser.IdentifierContext ctx);
}