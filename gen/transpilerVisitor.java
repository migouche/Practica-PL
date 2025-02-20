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
	 * Visit a parse tree produced by {@link transpilerParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(transpilerParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#libimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibimport(transpilerParser.LibimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(transpilerParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(transpilerParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(transpilerParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(transpilerParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(transpilerParser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(transpilerParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(transpilerParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(transpilerParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#defvarlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist(transpilerParser.DefvarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(transpilerParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#defproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefproc(transpilerParser.DefprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#deffun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffun(transpilerParser.DeffunContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(transpilerParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param(transpilerParser.Formal_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(transpilerParser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(transpilerParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(transpilerParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(transpilerParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(transpilerParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#oparit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOparit(transpilerParser.OparitContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(transpilerParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#subparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubparamlist(transpilerParser.SubparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(transpilerParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(transpilerParser.Proc_callContext ctx);
}