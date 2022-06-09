package php.ast

sealed class ExprCallLike(): Expr
data class ExprFuncCall(val name: AnyOf2<Name, Expr>, val args: List<Arg>): ExprCallLike()
data class ExprMethodCall(val `var`: Expr, val name: AnyOf2<Identifier, Expr>, val args: List<Arg>): ExprCallLike()
data class ExprNew(val `class`: AnyOf3<Name, Expr, StmtClass>, val args: List<Arg>): ExprCallLike()
data class ExprStaticCall(val `class`: AnyOf2<Name, Expr>, val name: AnyOf2<Identifier, Expr>, val args: List<Arg>): ExprCallLike()