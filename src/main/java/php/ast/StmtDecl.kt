package php.ast

sealed interface StmtDecl : Stmt
sealed interface StmtClassLike : StmtDecl {
    val name: Identifier?
    val stmts: List<Stmt>
}


data class StmtFunction(
    val byRef: Boolean,
    val name: Identifier,
    val params: List<Param>,
    val returnType: TypeHint?,
    val stmts: List<Stmt>
) : StmtDecl, FunctionLike

data class StmtClass(
    val flags: Int,
    val extends: Name?,
    val implements: List<Name>,
    override val name: Identifier?,
    override val stmts: List<Stmt>
) : StmtClassLike

class StmtInterface(
    val extends: List<Name>,
    override val name: Identifier,
    override val stmts: List<Stmt>
) : StmtClassLike

class StmtTrait(
    override val name: Identifier,
    override val stmts: List<Stmt>
) : StmtClassLike

data class StmtClassConst(val flags: Int, val consts: List<Const>) : Stmt
data class StmtProperty(val flags: Int, val props: List<StmtPropertyProperty>) : Stmt
data class StmtPropertyProperty(val name: Identifier, val default: Expr?) : Stmt
data class StmtClassMethod(
    val flags: Int,
    val byRef: Boolean,
    val name: Identifier,
    val params: List<Param>,
    val returnType: TypeHint?,
    val stmts: List<Stmt>
) : Stmt, FunctionLike