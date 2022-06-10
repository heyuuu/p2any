package php.ast

interface Stmt: Node

data class StmtConst(val name: Name, val value: Expr): Stmt {
    val simpleName: String get() = name.last()
}
data class StmtDeclare(val declares: List<StmtDeclareDeclare>, val stmts: List<Stmt>?): Stmt
data class StmtDeclareDeclare(val key: Identifier, val value: Expr): Stmt
data class StmtEcho(val exprs: List<Expr>): Stmt
data class StmtExpression(val expr: Expr): Stmt
data class StmtFunction(val byRef: Boolean, val name: Identifier, val params: List<Param>, val returnType: TypeHint?, val stmts: List<Stmt>, val namespacedName: Name): Stmt,
    Node, FunctionLike
data class StmtGlobal(val vars: List<Expr>): Stmt
data class StmtGroupUse(val type: Int, val prefix: Name, val uses: List<StmtUseUse>): Stmt
data class StmtInlineHTML(val value: String): Stmt
data class StmtNamespace(val name: Name?, val stmts: List<Stmt>): Stmt
object StmtNop: Stmt
data class StmtStatic(val vars: List<StmtStaticVar>): Stmt
data class StmtStaticVar(val `var`: ExprVariable, val default: Expr?): Stmt
data class StmtUnset(val vars: List<Expr>): Stmt
data class StmtUse(val type: Int, val uses: List<StmtUseUse>): Stmt
data class StmtUseUse(val type: Int, val name: Name, val alias: Identifier?): Stmt
