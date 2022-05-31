package php.ast

sealed interface ExprCast : Expr {
    val expr: Expr
}

data class ExprCastArray(override val expr: Expr) : ExprCast
data class ExprCastBool(override val expr: Expr) : ExprCast
data class ExprCastDouble(override val expr: Expr) : ExprCast
data class ExprCastInt(override val expr: Expr) : ExprCast
data class ExprCastObject(override val expr: Expr) : ExprCast
data class ExprCastString(override val expr: Expr) : ExprCast
data class ExprCastUnset(override val expr: Expr) : ExprCast