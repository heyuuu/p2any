package php.ast

data class ExprAssign(val `var`: Expr, val expr: Expr): Expr
data class ExprAssignRef(val `var`: Expr, val expr: Expr): Expr

sealed class ExprAssignOp(val `var`: Expr, val expr: Expr) : Expr
class ExprAssignOpBitwiseAnd(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpBitwiseOr(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpBitwiseXor(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpConcat(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpDiv(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpMinus(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpMod(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpMul(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpPlus(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpPow(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpShiftLeft(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)
class ExprAssignOpShiftRight(`var`: Expr, expr: Expr) : ExprAssignOp(`var`, expr)