package php.ast

sealed interface Stmt: Node
data class StmtBreak(val num: Expr?): Stmt
data class StmtCase(val cond: Expr?, val stmts: List<Stmt>): Stmt
data class StmtCatch(val types: List<Name>, val `var`: ExprVariable, val stmts: List<Stmt>): Stmt
data class StmtClass(val flags: Int, val extends: Name?, val implements: List<Name>, override val name: Identifier?, override val stmts: List<Stmt>, override val namespacedName: Name): StmtClassLike(name, stmts, namespacedName)
data class StmtClassConst(val flags: Int, val consts: List<Const>): Stmt
sealed class StmtClassLike(open val name: Identifier?, open val stmts: List<Stmt>, open val namespacedName: Name): Stmt
data class StmtClassMethod(val flags: Int, val byRef: Boolean, val name: Identifier, val params: List<Param>, val returnType: AnyOf3<Identifier, Name, ComplexType>?, val stmts: List<Stmt>?): Stmt,
    Node, FunctionLike
data class StmtConst(val consts: List<Const>): Stmt
data class StmtContinue(val num: Expr?): Stmt
data class StmtDeclare(val declares: List<StmtDeclareDeclare>, val stmts: List<Stmt>?): Stmt
data class StmtDeclareDeclare(val key: Identifier, val value: Expr): Stmt
data class StmtDo(val stmts: List<Stmt>, val cond: Expr): Stmt
data class StmtEcho(val exprs: List<Expr>): Stmt
data class StmtElse(val stmts: List<Stmt>): Stmt
data class StmtElseIf(val cond: Expr, val stmts: List<Stmt>): Stmt
data class StmtExpression(val expr: Expr): Stmt
data class StmtFinally(val stmts: List<Stmt>): Stmt
data class StmtFor(val init: List<Expr>, val cond: List<Expr>, val loop: List<Expr>, val stmts: List<Stmt>): Stmt
data class StmtForeach(val expr: Expr, val keyVar: Expr?, val byRef: Boolean, val valueVar: Expr, val stmts: List<Stmt>): Stmt
data class StmtFunction(val byRef: Boolean, val name: Identifier, val params: List<Param>, val returnType: AnyOf3<Identifier, Name, ComplexType>?, val stmts: List<Stmt>, val namespacedName: Name): Stmt,
    Node, FunctionLike
data class StmtGlobal(val vars: List<Expr>): Stmt
data class StmtGoto(val name: Identifier): Stmt
data class StmtGroupUse(val type: Int, val prefix: Name, val uses: List<StmtUseUse>): Stmt
data class StmtHaltCompiler(val remaining: String): Stmt
data class StmtIf(val cond: Expr, val stmts: List<Stmt>, val elseifs: List<StmtElseIf>, val `else`: StmtElse?): Stmt
data class StmtInlineHTML(val value: String): Stmt
data class StmtInterface(val extends: List<Name>, override val name: Identifier, override val stmts: List<Stmt>, override val namespacedName: Name): StmtClassLike(name, stmts, namespacedName)
data class StmtLabel(val name: Identifier): Stmt
data class StmtNamespace(val name: Name?, val stmts: List<Stmt>): Stmt
object StmtNop: Stmt
data class StmtProperty(val flags: Int, val props: List<StmtPropertyProperty>): Stmt
data class StmtPropertyProperty(val name: Identifier, val default: Expr?): Stmt
data class StmtReturn(val expr: Expr?): Stmt
data class StmtStatic(val vars: List<StmtStaticVar>): Stmt
data class StmtStaticVar(val `var`: ExprVariable, val default: Expr?): Stmt
data class StmtSwitch(val cond: Expr, val cases: List<StmtCase>): Stmt
data class StmtThrow(val expr: Expr): Stmt
data class StmtTrait(override val name: Identifier, override val stmts: List<Stmt>, override val namespacedName: Name): StmtClassLike(name, stmts, namespacedName)
data class StmtTraitUse(val traits: List<Name>, val adaptations: List<StmtTraitUseAdaptation>): Stmt
sealed class StmtTraitUseAdaptation(open val trait: Name?, open val method: Identifier): Stmt
data class StmtTraitUseAdaptationAlias(val newModifier: Int?, val newName: Identifier?, override val trait: Name?, override val method: Identifier): StmtTraitUseAdaptation(trait, method)
data class StmtTraitUseAdaptationPrecedence(val insteadof: List<Name>, override val trait: Name?, override val method: Identifier): StmtTraitUseAdaptation(trait, method)
data class StmtTryCatch(val stmts: List<Stmt>, val catches: List<StmtCatch>, val finally: StmtFinally?): Stmt
data class StmtUnset(val vars: List<Expr>): Stmt
data class StmtUse(val type: Int, val uses: List<StmtUseUse>): Stmt
data class StmtUseUse(val type: Int, val name: Name, val alias: Identifier?): Stmt
data class StmtWhile(val cond: Expr, val stmts: List<Stmt>): Stmt