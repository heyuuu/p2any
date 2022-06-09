package php.ast


interface Expr : Node

data class ExprArray(val items: List<ExprArrayItem?>) : Expr
data class ExprArrayItem(val key: Expr?, val value: Expr, val byRef: Boolean, val unpack: Boolean) : Expr

data class ExprInstanceof(val expr: Expr, val `class`: AnyOf2<Name, ExprVariable>) : Expr

data class ExprExit(val expr: Expr?) : Expr

data class ExprList(val items: List<ExprArrayItem?>) : Expr
data class ExprTernary(val cond: Expr, val `if`: Expr?, val `else`: Expr) : Expr
data class ExprThrow(val expr: Expr) : Expr
data class ExprVariable(val name: AnyOf2<String, Expr>) : Expr
data class ExprYield(val key: Expr?, val value: Expr?) : Expr
data class ExprYieldFrom(val expr: Expr) : Expr