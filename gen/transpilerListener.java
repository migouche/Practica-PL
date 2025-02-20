// Generated from C:/Users/ferch/Desktop/GITHUB/Practica-PL/transpiler.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link transpilerParser}.
 */
public interface transpilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link transpilerParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(transpilerParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(transpilerParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#libimport}.
	 * @param ctx the parse tree
	 */
	void enterLibimport(transpilerParser.LibimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#libimport}.
	 * @param ctx the parse tree
	 */
	void exitLibimport(transpilerParser.LibimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(transpilerParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(transpilerParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(transpilerParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(transpilerParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(transpilerParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(transpilerParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(transpilerParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(transpilerParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(transpilerParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(transpilerParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(transpilerParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(transpilerParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(transpilerParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(transpilerParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(transpilerParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(transpilerParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist(transpilerParser.DefvarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist(transpilerParser.DefvarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(transpilerParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(transpilerParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#defproc}.
	 * @param ctx the parse tree
	 */
	void enterDefproc(transpilerParser.DefprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#defproc}.
	 * @param ctx the parse tree
	 */
	void exitDefproc(transpilerParser.DefprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#deffun}.
	 * @param ctx the parse tree
	 */
	void enterDeffun(transpilerParser.DeffunContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#deffun}.
	 * @param ctx the parse tree
	 */
	void exitDeffun(transpilerParser.DeffunContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(transpilerParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(transpilerParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param(transpilerParser.Formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param(transpilerParser.Formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(transpilerParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(transpilerParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(transpilerParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(transpilerParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(transpilerParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(transpilerParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(transpilerParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(transpilerParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(transpilerParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(transpilerParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#oparit}.
	 * @param ctx the parse tree
	 */
	void enterOparit(transpilerParser.OparitContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#oparit}.
	 * @param ctx the parse tree
	 */
	void exitOparit(transpilerParser.OparitContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(transpilerParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(transpilerParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubparamlist(transpilerParser.SubparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubparamlist(transpilerParser.SubparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(transpilerParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(transpilerParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(transpilerParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(transpilerParser.Proc_callContext ctx);
}