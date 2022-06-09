package php.ast

sealed class ExprAssignOp(open val `var`: Expr, open val expr: Expr): Expr
data class ExprAssignOpBitwiseAnd(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpBitwiseOr(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpBitwiseXor(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpConcat(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpDiv(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpMinus(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpMod(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpMul(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpPlus(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpPow(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpShiftLeft(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)
data class ExprAssignOpShiftRight(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr)