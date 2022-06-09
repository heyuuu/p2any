package php.oldast

import com.sun.org.apache.xpath.internal.operations.Variable

// use
data class StmtUse(val type: Type, val uses: List<UseUse>) : Stmt {
    enum class Type(val type: Int) {
        TYPE_UNKNOWN(0),

        /** Class or namespace import */
        TYPE_NORMAL(1),

        /** Function import */
        TYPE_FUNCTION(2),

        /** Constant import */
        TYPE_CONSTANT(3),
    }

    data class UseUse(val type: Type, val name: Name, val alias: Identifier?): Stmt
}

data class StmtGroupUse(val type: StmtUse.Type, val prefix: Name, val uses: List<StmtUse.UseUse>) : Stmt

// trait-use
data class StmtTraitUse(val traits: List<Name>, val adaptations: List<UseAdaptation>) : Stmt {
    sealed class UseAdaptation(val trait: Name?, val method: Identifier) : Stmt {
        class Precedence(
            val insteadof: List<Name>,
            trait: Name?,
            method: Identifier
        ) : UseAdaptation(trait, method)

        class Alias(
            val newModifier: Int?,
            val newName: Identifier?,
            trait: Name?,
            method: Identifier
        ) : UseAdaptation(trait, method)
    }
}

// declare
data class StmtDeclare(val declares: List<StmtDeclareDeclare>, val stmts: List<Stmt>?) : Stmt
data class StmtDeclareDeclare(val key: Identifier, val value: Expr) : Stmt

// misc
data class StmtExpression(val expr: Expr) : Stmt
data class StmtGlobal(val vars: List<Expr>) : Stmt
data class StmtNamespace(val name: Name?, val stmts: List<Stmt>) : Stmt
data class StmtStatic(val vars: List<StmtStaticVar>) : Stmt
data class StmtStaticVar(val `var`: Variable, val default: Expr?) : Stmt

data class StmtUnset(val vars: List<Expr>) : Stmt
data class StmtHaltCompiler(val remaining: String) : Stmt
data class StmtEcho(val exprs: List<Expr>) : Stmt
data class StmtConst(val consts: List<Const>) : Stmt
data class StmtInlineHTML(val value: String) : Stmt
class StmtNop() : Stmt

// branch
data class StmtIf(val branches: List<CondBranch>, val `else`: DefaultBranch?) : Stmt {
    data class CondBranch(val cond: Expr, val stmts: List<Stmt>): Stmt
    data class DefaultBranch(val stmts: List<Stmt>): Stmt
}

data class StmtTryCatch(val stmts: List<Stmt>, val catches: List<CatchBranch>, val finally: FinallyBranch?) : Stmt {
    data class CatchBranch(val types: List<Name>, val `var`: Variable, val stmts: List<Stmt>) : Stmt
    data class FinallyBranch(val types: List<Name>, val `var`: Variable, val stmts: List<Stmt>) : Stmt
}

data class StmtSwitch(val cond: Expr, val cases: List<CaseBranch>) : Stmt {
    data class CaseBranch(val cond: Expr?, val stmts: List<Stmt>): Stmt
}

data class StmtFor(val init: List<Expr>, val cond: List<Expr>, val loop: List<Expr>, val stmts: List<Stmt>) : Stmt
data class StmtForeach(val expr: Expr, val keyVar: Expr?, val byRef: Boolean, val valueVar: Expr, val stmts: List<Stmt>) : Stmt

data class StmtWhile(val cond: Expr, val stmts: List<Stmt>) : Stmt
data class StmtDo(val stmts: List<Stmt>, val cond: Expr) : Stmt

data class StmtContinue(val num: Expr?) : Stmt
data class StmtBreak(val num: Expr?) : Stmt
data class StmtReturn(val expr: Expr?) : Stmt
data class StmtThrow(val expr: Expr) : Stmt

data class StmtLabel(val name: Identifier) : Stmt
data class StmtGoto(val name: Identifier) : Stmt

