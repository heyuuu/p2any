package kt.ast

sealed interface ExprBinaryOp : Expr {
    val left: Expr
    val right: Expr
}

data class ExprBinaryOpBitwiseAnd(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpBitwiseOr(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpBitwiseXor(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpBooleanAnd(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpBooleanOr(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpCoalesce(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpConcat(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpDiv(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpEqual(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpGreater(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpGreaterOrEqual(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpIdentical(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpLogicalAnd(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpLogicalOr(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpLogicalXor(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpMinus(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpMod(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpMul(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpNotEqual(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpNotIdentical(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpPlus(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpPow(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpShiftLeft(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpShiftRight(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpSmaller(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpSmallerOrEqual(override val left: Expr, override val right: Expr) : ExprBinaryOp
data class ExprBinaryOpSpaceship(override val left: Expr, override val right: Expr) : ExprBinaryOp