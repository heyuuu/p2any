package php.ast

sealed class ExprCast(open val expr: Expr) : Expr
data class ExprCastArray(override val expr: Expr) : ExprCast(expr)
data class ExprCastBool(override val expr: Expr) : ExprCast(expr)
data class ExprCastDouble(override val expr: Expr) : ExprCast(expr)
data class ExprCastInt(override val expr: Expr) : ExprCast(expr)
data class ExprCastObject(override val expr: Expr) : ExprCast(expr)
data class ExprCastString(override val expr: Expr) : ExprCast(expr)
data class ExprCastUnset(override val expr: Expr) : ExprCast(expr) // todo delete