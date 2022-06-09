package php.ast

sealed interface StmtFlowControl : Stmt

data class StmtBreak(val num: Expr?) : StmtFlowControl
data class StmtContinue(val num: Expr?) : StmtFlowControl
data class StmtReturn(val expr: Expr?) : StmtFlowControl
data class StmtThrow(val expr: Expr) : StmtFlowControl

data class StmtLabel(val name: Identifier) : StmtFlowControl
data class StmtGoto(val name: Identifier) : StmtFlowControl

data class StmtIf(
    val branches: List<Pair<Expr, List<Stmt>>>,
    val defaultBranch: List<Stmt>?
) : StmtFlowControl

data class StmtSwitch(
    val cond: Expr,
    val cases: List<Pair<Expr?, List<Stmt>>>
) : StmtFlowControl

data class StmtTryCatch(
    val stmts: List<Stmt>,
    val catches: List<CatchBranch>,
    val finally: List<Stmt>?
) : StmtFlowControl {
    data class CatchBranch(val types: List<Name>, val `var`: ExprVariable, val stmts: List<Stmt>)
}

data class StmtFor(val init: List<Expr>, val cond: List<Expr>, val loop: List<Expr>, val stmts: List<Stmt>) : StmtFlowControl
data class StmtForeach(val expr: Expr, val keyVar: Expr?, val byRef: Boolean, val valueVar: Expr, val stmts: List<Stmt>) : StmtFlowControl

data class StmtWhile(val cond: Expr, val stmts: List<Stmt>) : StmtFlowControl
data class StmtDo(val stmts: List<Stmt>, val cond: Expr) : StmtFlowControl
