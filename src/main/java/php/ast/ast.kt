package php.ast

interface AstNode
interface Stmt : AstNode
interface Expr : AstNode
interface FunctionLike : AstNode

data class Name(val parts: List<String>) : AstNode
data class Identifier(val name: String) : AstNode

data class Param(
    val name: Identifier,
    val type: TypeHint?,
    val byRef: Boolean,
    val variadic: Boolean,
    val default: Expr?
) : AstNode

data class Arg(
    val value: Expr,
    val byRef: Boolean,
    val unpack: Boolean
) : AstNode

data class Const(val name: Identifier, val value: Expr) : AstNode

data class TypeHint(val type: Name, val nullable: Boolean)

