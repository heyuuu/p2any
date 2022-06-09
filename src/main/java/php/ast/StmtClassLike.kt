package php.ast

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