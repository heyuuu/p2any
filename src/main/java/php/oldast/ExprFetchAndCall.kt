package php.oldast

sealed interface NameOrExpr {
    data class ByName(val `class`: Name)
    data class ByExpr(val `class`: Expr)
}

sealed interface IdentifierOrExpr {
    data class ByName(val `class`: Name)
    data class ByExpr(val `class`: Expr)
}


// fetch
sealed interface ExprFetch : Expr
data class ExprArrayDimFetch(val `var`: Expr, val dim: Expr?) : ExprFetch
data class ExprClassConstFetch(val `class`: NameOrExpr, val name: Identifier) : ExprFetch
data class ExprPropertyFetch(val `var`: Expr, val name: IdentifierOrExpr) : ExprFetch
data class ExprStaticPropertyFetch(val `class`: NameOrExpr, val name: IdentifierOrExpr) : ExprFetch

// call
sealed interface ExprCall : Expr {
    val args: List<Arg>
}

data class ExprFuncCall(val name: NameOrExpr, override val args: List<Arg>) : ExprCall
data class ExprMethodCall(val `var`: Expr, val name: IdentifierOrExpr, override val args: List<Arg>) : ExprCall
data class ExprStaticCall(val `class`: NameOrExpr, val name: IdentifierOrExpr, override val args: List<Arg>) : ExprCall

sealed interface ExprNew : ExprCall {
    data class Static(val `class`: NameOrExpr, override val args: List<Arg>) : ExprNew
    data class Anonymous(val `class`: StmtClass, override val args: List<Arg>) : ExprNew
}
