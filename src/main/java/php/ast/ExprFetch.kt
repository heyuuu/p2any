package php.ast

sealed interface ExprFetch : Expr
data class ExprArrayDimFetch(val `var`: Expr, val dim: Expr?) : ExprFetch
data class ExprClassConstFetch(val `class`: AnyOf2<Name, Expr>, val name: Identifier) : ExprFetch
data class ExprConstFetch(val name: Name) : ExprFetch
data class ExprPropertyFetch(val `var`: Expr, val name: AnyOf2<Identifier, Expr>) : ExprFetch
data class ExprStaticPropertyFetch(val `class`: AnyOf2<Name, Expr>, val name: AnyOf2<Identifier, Expr>) : ExprFetch