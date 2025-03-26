// Generated from C:/Users/ferch/Desktop/GITHUB/Practica-PL/transpiler.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link transpilerParser#sentlist_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist_p(transpilerParser.Sentlist_pContext ctx);
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
	 * Visit a parse tree produced by {@link transpilerParser#ctelist_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist_p(transpilerParser.Ctelist_pContext ctx);
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
	 * Visit a parse tree produced by {@link transpilerParser#defvarlist_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist_p(transpilerParser.Defvarlist_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(transpilerParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#varlist_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist_p(transpilerParser.Varlist_pContext ctx);
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
	 * Visit a parse tree produced by {@link transpilerParser#formal_param_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param_p(transpilerParser.Formal_param_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#sent_master}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent_master(transpilerParser.Sent_masterContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(transpilerParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(transpilerParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(transpilerParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(transpilerParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(transpilerParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#sent_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent_p(transpilerParser.Sent_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(transpilerParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#exp_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_p(transpilerParser.Exp_pContext ctx);
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
	 * Visit a parse tree produced by {@link transpilerParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(transpilerParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(transpilerParser.OpcompContext ctx);
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
	 * Visit a parse tree produced by {@link transpilerParser#explist_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist_p(transpilerParser.Explist_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(transpilerParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#expcond_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond_p(transpilerParser.Expcond_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link transpilerParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(transpilerParser.FactorcondContext ctx);
}