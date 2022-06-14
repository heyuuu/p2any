package kt.ast

data class StmtClassConst(val flags: Int, val name: Identifier, val value: Expr) : Stmt
data class StmtProperty(val flags: Int, val name: Identifier, val default: Expr?) : Stmt
data class StmtClassMethod(
    val flags: Int,
    val byRef: Boolean,
    val name: Identifier,
    val params: List<Param>,
    val returnType: TypeHint?,
    val stmts: List<Stmt>?
) : Stmt, FunctionLike

sealed interface StmtClassLike : Stmt {
    val name: Identifier?
    val stmts: List<Stmt>
    val namespacedName: Name
}

data class StmtClass(
    val flags: Int,
    val extends: Name?,
    val implements: List<Name>,
    override val name: Identifier?,
    override val stmts: List<Stmt>,
    override val namespacedName: Name
) : StmtClassLike

data class StmtInterface(
    val extends: List<Name>,
    override val name: Identifier,
    override val stmts: List<Stmt>,
    override val namespacedName: Name
) : StmtClassLike

data class StmtTrait(
    override val name: Identifier,
    override val stmts: List<Stmt>,
    override val namespacedName: Name
) : StmtClassLike