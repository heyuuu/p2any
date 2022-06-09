package php.ast


interface Expr: Node
data class ExprArray(val items: List<ExprArrayItem?>): Expr
data class ExprArrayDimFetch(val `var`: Expr, val dim: Expr?): Expr
data class ExprArrayItem(val key: Expr?, val value: Expr, val byRef: Boolean, val unpack: Boolean): Expr
data class ExprAssign(val `var`: Expr, val expr: Expr): Expr
data class ExprAssignRef(val `var`: Expr, val expr: Expr): Expr
data class ExprBitwiseNot(val expr: Expr): Expr
data class ExprBooleanNot(val expr: Expr): Expr
data class ExprClassConstFetch(val `class`: AnyOf2<Name, Expr>, val name: Identifier): Expr
data class ExprClone(val expr: Expr): Expr
data class ExprClosure(val static: Boolean, val byRef: Boolean, val params: List<Param>, val uses: List<ExprClosureUse>, val returnType: AnyOf3<Identifier, Name, ComplexType>?, val stmts: List<Stmt>): Expr, Node, FunctionLike
data class ExprClosureUse(val `var`: ExprVariable, val byRef: Boolean): Expr
data class ExprConstFetch(val name: Name): Expr
data class ExprEmpty(val expr: Expr): Expr
class ExprError(): Expr
data class ExprErrorSuppress(val expr: Expr): Expr
data class ExprEval(val expr: Expr): Expr
data class ExprExit(val expr: Expr?): Expr
data class ExprInclude(val expr: Expr, val type: Int): Expr
data class ExprInstanceof(val expr: Expr, val `class`: AnyOf2<Name, ExprVariable>): Expr
data class ExprIsset(val vars: List<Expr>): Expr
data class ExprList(val items: List<ExprArrayItem?>): Expr
data class ExprPostDec(val `var`: Expr): Expr
data class ExprPostInc(val `var`: Expr): Expr
data class ExprPreDec(val `var`: Expr): Expr
data class ExprPreInc(val `var`: Expr): Expr
data class ExprPrint(val expr: Expr): Expr
data class ExprPropertyFetch(val `var`: Expr, val name: AnyOf2<Identifier, Expr>): Expr
data class ExprShellExec(val parts: List<Any>): Expr
data class ExprStaticPropertyFetch(val `class`: AnyOf2<Name, Expr>, val name: AnyOf2<Identifier, Expr>): Expr
data class ExprTernary(val cond: Expr, val `if`: Expr?, val `else`: Expr): Expr
data class ExprThrow(val expr: Expr): Expr
data class ExprUnaryMinus(val expr: Expr): Expr
data class ExprUnaryPlus(val expr: Expr): Expr
data class ExprVariable(val name: AnyOf2<String, Expr>): Expr
data class ExprYield(val key: Expr?, val value: Expr?): Expr
data class ExprYieldFrom(val expr: Expr): Expr