package kt.ast

sealed interface ExprInternalFunc : Expr

data class ExprEmpty(val expr: Expr) : ExprInternalFunc
data class ExprInclude(val expr: Expr, val type: Int) : ExprInternalFunc
data class ExprIsset(val vars: List<Expr>) : ExprInternalFunc
data class ExprClone(val expr: Expr) : ExprInternalFunc