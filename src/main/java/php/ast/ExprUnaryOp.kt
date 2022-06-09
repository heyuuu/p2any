package php.ast

sealed interface ExprUnaryOp : Expr

data class ExprBitwiseNot(val expr: Expr) : ExprUnaryOp
data class ExprBooleanNot(val expr: Expr) : ExprUnaryOp
data class ExprErrorSuppress(val expr: Expr) : ExprUnaryOp
data class ExprPostDec(val `var`: Expr) : ExprUnaryOp
data class ExprPostInc(val `var`: Expr) : ExprUnaryOp
data class ExprPreDec(val `var`: Expr) : ExprUnaryOp
data class ExprPreInc(val `var`: Expr) : ExprUnaryOp
data class ExprPrint(val expr: Expr) : ExprUnaryOp
data class ExprUnaryMinus(val expr: Expr) : ExprUnaryOp
data class ExprUnaryPlus(val expr: Expr) : ExprUnaryOp