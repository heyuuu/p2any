package php.ast


interface Node
interface FunctionLike : Node

data class Arg(val value: Expr, val byRef: Boolean, val unpack: Boolean) : Node
data class Param(
    val type: AnyOf3<Identifier, Name, ComplexType>?,
    val byRef: Boolean,
    val variadic: Boolean,
    val `var`: ExprVariable,
    val default: Expr?
) : Node


data class NullableType(val type: AnyOf2<Identifier, Name>) : ComplexType()
sealed class ComplexType() : Node

data class Const(val name: Identifier, val value: Expr, val namespacedName: Name?) : Node

data class Identifier(val name: String, val varLike: Boolean = false) : Node

data class Name(val parts: List<String>, val fullyQualified: Boolean = false) : Node
