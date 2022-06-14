package kt.ast

data class ExprClosure(
    val static: Boolean,
    val byRef: Boolean,
    val params: List<Param>,
    val uses: List<ExprClosureUse>,
    val returnType: TypeHint?,
    val stmts: List<Stmt>
) : Expr, FunctionLike {

}

data class ExprClosureUse(val `var`: ExprVariable, val byRef: Boolean) : Expr