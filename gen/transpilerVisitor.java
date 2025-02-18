// Generated from C:/Users/migou/codes/URJC/PL/Practica-PL/transpiler.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link transpilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface transpilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link transpilerParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitG(transpilerParser.GContext ctx);
}