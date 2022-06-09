package php.oldast

sealed interface ExprBinaryOp : Expr {
    val left: Expr
    val right: Expr
}

data class ExprBinaryOpBitwiseAnd(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpBitwiseOr(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpBitwiseXor(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpBooleanAnd(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpBooleanOr(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpCoalesce(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpConcat(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpDiv(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpEqual(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpGreater(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpGreaterOrEqual(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpIdentical(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpLogicalAnd(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpLogicalOr(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpLogicalXor(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpMinus(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpMod(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpMul(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpNotEqual(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpNotIdentical(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpPlus(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpPow(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpShiftLeft(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpShiftRight(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpSmaller(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpSmallerOrEqual(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode
data class ExprBinaryOpSpaceship(override val left: Expr, override val right: Expr) : ExprBinaryOp, AstNode