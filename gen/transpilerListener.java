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
	 * Enter a parse tree produced by {@link transpilerParser#sentlist_p}.
	 * @param ctx the parse tree
	 */
	void enterSentlist_p(transpilerParser.Sentlist_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#sentlist_p}.
	 * @param ctx the parse tree
	 */
	void exitSentlist_p(transpilerParser.Sentlist_pContext ctx);
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
	 * Enter a parse tree produced by {@link transpilerParser#ctelist_p}.
	 * @param ctx the parse tree
	 */
	void enterCtelist_p(transpilerParser.Ctelist_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#ctelist_p}.
	 * @param ctx the parse tree
	 */
	void exitCtelist_p(transpilerParser.Ctelist_pContext ctx);
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
	 * Enter a parse tree produced by {@link transpilerParser#defvarlist_p}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist_p(transpilerParser.Defvarlist_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#defvarlist_p}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist_p(transpilerParser.Defvarlist_pContext ctx);
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
	 * Enter a parse tree produced by {@link transpilerParser#varlist_p}.
	 * @param ctx the parse tree
	 */
	void enterVarlist_p(transpilerParser.Varlist_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#varlist_p}.
	 * @param ctx the parse tree
	 */
	void exitVarlist_p(transpilerParser.Varlist_pContext ctx);
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
	 * Enter a parse tree produced by {@link transpilerParser#formal_param_p}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param_p(transpilerParser.Formal_param_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#formal_param_p}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param_p(transpilerParser.Formal_param_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#sent_master}.
	 * @param ctx the parse tree
	 */
	void enterSent_master(transpilerParser.Sent_masterContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#sent_master}.
	 * @param ctx the parse tree
	 */
	void exitSent_master(transpilerParser.Sent_masterContext ctx);
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
	 * Enter a parse tree produced by {@link transpilerParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(transpilerParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(transpilerParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(transpilerParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(transpilerParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(transpilerParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(transpilerParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(transpilerParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(transpilerParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#sent_p}.
	 * @param ctx the parse tree
	 */
	void enterSent_p(transpilerParser.Sent_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#sent_p}.
	 * @param ctx the parse tree
	 */
	void exitSent_p(transpilerParser.Sent_pContext ctx);
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
	 * Enter a parse tree produced by {@link transpilerParser#exp_p}.
	 * @param ctx the parse tree
	 */
	void enterExp_p(transpilerParser.Exp_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#exp_p}.
	 * @param ctx the parse tree
	 */
	void exitExp_p(transpilerParser.Exp_pContext ctx);
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
	 * Enter a parse tree produced by {@link transpilerParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(transpilerParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(transpilerParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(transpilerParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(transpilerParser.OpcompContext ctx);
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
	 * Enter a parse tree produced by {@link transpilerParser#explist_p}.
	 * @param ctx the parse tree
	 */
	void enterExplist_p(transpilerParser.Explist_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#explist_p}.
	 * @param ctx the parse tree
	 */
	void exitExplist_p(transpilerParser.Explist_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(transpilerParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(transpilerParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#expcond_p}.
	 * @param ctx the parse tree
	 */
	void enterExpcond_p(transpilerParser.Expcond_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#expcond_p}.
	 * @param ctx the parse tree
	 */
	void exitExpcond_p(transpilerParser.Expcond_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link transpilerParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(transpilerParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link transpilerParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(transpilerParser.FactorcondContext ctx);
}