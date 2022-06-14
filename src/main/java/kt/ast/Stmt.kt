package kt.ast

interface Stmt : Node

data class StmtConst(val name: Name, val value: Expr) : Stmt {
    val simpleName: String get() = name.last()
}

data class StmtDeclare(val declares: List<Pair<Identifier, Expr>>, val stmts: List<Stmt>?) : Stmt

data class StmtNamespace(val name: Name?, val stmts: List<Stmt>) : Stmt

data class StmtUse(val type: Type, val name: Name, val alias: Identifier?) : Stmt {
    enum class Type(val type: Int) {
        /** Class or namespace import */
        NORMAL(1),

        /** Function import */
        FUNCTION(2),

        /** Constant import */
        CONSTANT(3);
    }
}

data class StmtEcho(val exprs: List<Expr>) : Stmt
data class StmtExpression(val expr: Expr) : Stmt
data class StmtFunction(
    val byRef: Boolean,
    val name: Identifier,
    val params: List<Param>,
    val returnType: TypeHint?,
    val stmts: List<Stmt>,
    val namespacedName: Name
) : Stmt,
    Node, FunctionLike

data class StmtGlobal(val vars: List<Expr>) : Stmt
data class StmtInlineHTML(val value: String) : Stmt
object StmtNop : Stmt
data class StmtStatic(val vars: List<StmtStaticVar>) : Stmt
data class StmtStaticVar(val `var`: ExprVariable, val default: Expr?) : Stmt
data class StmtUnset(val vars: List<Expr>) : Stmt
