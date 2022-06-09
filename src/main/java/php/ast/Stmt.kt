package php.ast

sealed interface Stmt: Node

data class StmtClass(val flags: Int, val extends: Name?, val implements: List<Name>, override val name: Identifier?, override val stmts: List<Stmt>, override val namespacedName: Name): StmtClassLike(name, stmts, namespacedName)
data class StmtClassConst(val flags: Int, val consts: List<Const>): Stmt
sealed class StmtClassLike(open val name: Identifier?, open val stmts: List<Stmt>, open val namespacedName: Name): Stmt
data class StmtClassMethod(val flags: Int, val byRef: Boolean, val name: Identifier, val params: List<Param>, val returnType: AnyOf3<Identifier, Name, ComplexType>?, val stmts: List<Stmt>?): Stmt,
    Node, FunctionLike
data class StmtConst(val consts: List<Const>): Stmt
data class StmtDeclare(val declares: List<StmtDeclareDeclare>, val stmts: List<Stmt>?): Stmt
data class StmtDeclareDeclare(val key: Identifier, val value: Expr): Stmt
data class StmtEcho(val exprs: List<Expr>): Stmt
data class StmtExpression(val expr: Expr): Stmt
data class StmtFunction(val byRef: Boolean, val name: Identifier, val params: List<Param>, val returnType: AnyOf3<Identifier, Name, ComplexType>?, val stmts: List<Stmt>, val namespacedName: Name): Stmt,
    Node, FunctionLike
data class StmtGlobal(val vars: List<Expr>): Stmt
data class StmtGroupUse(val type: Int, val prefix: Name, val uses: List<StmtUseUse>): Stmt
data class StmtInlineHTML(val value: String): Stmt
data class StmtInterface(val extends: List<Name>, override val name: Identifier, override val stmts: List<Stmt>, override val namespacedName: Name): StmtClassLike(name, stmts, namespacedName)
data class StmtNamespace(val name: Name?, val stmts: List<Stmt>): Stmt
object StmtNop: Stmt
data class StmtProperty(val flags: Int, val props: List<StmtPropertyProperty>): Stmt
data class StmtPropertyProperty(val name: Identifier, val default: Expr?): Stmt
data class StmtStatic(val vars: List<StmtStaticVar>): Stmt
data class StmtStaticVar(val `var`: ExprVariable, val default: Expr?): Stmt
data class StmtTrait(override val name: Identifier, override val stmts: List<Stmt>, override val namespacedName: Name): StmtClassLike(name, stmts, namespacedName)
data class StmtTraitUse(val traits: List<Name>, val adaptations: List<StmtTraitUseAdaptation>): Stmt
sealed class StmtTraitUseAdaptation(open val trait: Name?, open val method: Identifier): Stmt
data class StmtTraitUseAdaptationAlias(val newModifier: Int?, val newName: Identifier?, override val trait: Name?, override val method: Identifier): StmtTraitUseAdaptation(trait, method)
data class StmtTraitUseAdaptationPrecedence(val insteadof: List<Name>, override val trait: Name?, override val method: Identifier): StmtTraitUseAdaptation(trait, method)
data class StmtUnset(val vars: List<Expr>): Stmt
data class StmtUse(val type: Int, val uses: List<StmtUseUse>): Stmt
data class StmtUseUse(val type: Int, val name: Name, val alias: Identifier?): Stmt
