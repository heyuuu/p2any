package php.ast

sealed interface StmtFlowControl: Stmt

data class StmtBreak(val num: Expr?) : StmtFlowControl
data class StmtContinue(val num: Expr?) : StmtFlowControl
data class StmtReturn(val expr: Expr?) : StmtFlowControl
data class StmtThrow(val expr: Expr) : StmtFlowControl

data class StmtLabel(val name: Identifier) : StmtFlowControl
data class StmtGoto(val name: Identifier) : StmtFlowControl

data class StmtIf(
    val cond: Expr,
    val stmts: List<Stmt>,
    val elseifs: List<StmtElseIf>,
    val `else`: StmtElse?
) : StmtFlowControl

data class StmtElseIf(val cond: Expr, val stmts: List<Stmt>) : StmtFlowControl
data class StmtElse(val stmts: List<Stmt>) : StmtFlowControl

data class StmtFor(val init: List<Expr>, val cond: List<Expr>, val loop: List<Expr>, val stmts: List<Stmt>) : StmtFlowControl
data class StmtForeach(val expr: Expr, val keyVar: Expr?, val byRef: Boolean, val valueVar: Expr, val stmts: List<Stmt>) : StmtFlowControl

data class StmtSwitch(val cond: Expr, val cases: List<StmtCase>) : StmtFlowControl
data class StmtCase(val cond: Expr?, val stmts: List<Stmt>) : StmtFlowControl

data class StmtWhile(val cond: Expr, val stmts: List<Stmt>) : StmtFlowControl
data class StmtDo(val stmts: List<Stmt>, val cond: Expr) : StmtFlowControl

data class StmtTryCatch(val stmts: List<Stmt>, val catches: List<StmtCatch>, val finally: StmtFinally?) : StmtFlowControl
data class StmtCatch(val types: List<Name>, val `var`: ExprVariable, val stmts: List<Stmt>) : StmtFlowControl
data class StmtFinally(val stmts: List<Stmt>) : StmtFlowControl

