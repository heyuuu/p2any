package kt.ast


interface Expr : Node

data class ExprArray(val items: List<ExprArrayItem?>) : Expr
data class ExprArrayItem(val key: Expr?, val value: Expr, val byRef: Boolean, val unpack: Boolean) : Expr

data class ExprExit(val expr: Expr?) : Expr

data class ExprList(val items: List<ExprArrayItem?>) : Expr
data class ExprTernary(val cond: Expr, val `if`: Expr?, val `else`: Expr) : Expr
data class ExprThrow(val expr: Expr) : Expr
data class ExprYield(val key: Expr?, val value: Expr?) : Expr
data class ExprYieldFrom(val expr: Expr) : Expr

sealed interface ExprVariable: Expr {
    data class ExprVariableSimple(val name: String): ExprVariable
    data class ExprVariableDynamic(val name: Expr): ExprVariable
}

sealed interface ExprInstanceof : Expr {
    val expr: Expr

    data class ExprInstanceofName(override val expr: Expr, val `class`: Name) : ExprInstanceof
    data class ExprInstanceofVariable(override val expr: Expr, val `class`: ExprVariable) : ExprInstanceof
}