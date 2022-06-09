package php.oldast

sealed interface ExprAssignOp : Expr {
    val `var`: Expr
    val expr: Expr
}

data class ExprAssignOpBitwiseAnd(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpBitwiseOr(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpBitwiseXor(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpConcat(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpDiv(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpMinus(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpMod(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpMul(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpPlus(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpPow(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpShiftLeft(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode
data class ExprAssignOpShiftRight(override val `var`: Expr, override val expr: Expr) : ExprAssignOp, AstNode