package php.ast

import com.sun.org.apache.xpath.internal.operations.Variable

data class ExprArray(val items: List<ExprArrayItem?>) : Expr
data class ExprArrayItem(val key: Expr?, val value: Expr, val byRef: Boolean = false, val unpack: Boolean = false) : Expr
data class ExprList(val items: List<ExprArrayItem?>) : Expr


data class ExprAssign(val `var`: Expr, val expr: Expr) : Expr
data class ExprAssignRef(val `var`: Expr, val expr: Expr) : Expr

data class ExprYield(val key: Expr?, val value: Expr?) : Expr
data class ExprYieldFrom(val expr: Expr) : Expr

data class ExprShellExec(val parts: Any?) : Expr
data class ExprEval(val expr: Expr) : Expr

data class ExprConstFetch(val name: Name) : Expr

data class ExprPrint(val expr: Expr) : Expr

data class ExprThrow(val expr: Expr) : Expr

data class ExprPreInc(val `var`: Expr) : Expr
data class ExprPreDec(val `var`: Expr) : Expr
data class ExprPostInc(val `var`: Expr) : Expr
data class ExprPostDec(val `var`: Expr) : Expr

data class ExprUnaryPlus(val expr: Expr) : Expr
data class ExprUnaryMinus(val expr: Expr) : Expr

data class ExprBitwiseNot(val expr: Expr) : Expr
data class ExprBooleanNot(val expr: Expr) : Expr

data class ExprTernary(val cond: Expr, val `if`: Expr?, val `else`: Expr) : Expr

data class ExprErrorSuppress(val expr: Expr) : Expr
data class ExprEmpty(val expr: Expr) : Expr
data class ExprExit(val expr: Expr) : Expr
data class ExprClone(val expr: Expr) : Expr
data class ExprIsset(val vars: List<Expr>) : Expr

data class ExprClosure(
    val static: Boolean,
    val byRef: Boolean,
    val params: List<Param>,
    val uses: List<ExprClosureUse>,
    val returnType: TypeHint?,
    val stmts: List<Stmt>
) : Expr, FunctionLike

data class ExprClosureUse(val `var`: ExprVariable, val byRef: Boolean = false) : Expr

data class ExprInclude(val expr: Expr, val type: Type) : Expr {
    enum class Type(val type: Int) {
        TYPE_INCLUDE(1),
        TYPE_INCLUDE_ONCE(2),
        TYPE_REQUIRE(3),
        TYPE_REQUIRE_ONCE(4);
    }
}

sealed interface ExprVariable : Expr {
    data class Static(val name: String) : ExprVariable
    data class Dynamic(val name: Expr) : ExprVariable
}

sealed interface ExprInstanceof : Expr {
    data class ByName(val name: Name) : ExprVariable
    data class ByVariable(val name: Variable) : ExprVariable
}