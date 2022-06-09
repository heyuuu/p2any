package php.ast


interface Node
interface FunctionLike : Node

data class Arg(val value: Expr, val byRef: Boolean, val unpack: Boolean) : Node
data class Param(
    val type: TypeHint?,
    val byRef: Boolean,
    val variadic: Boolean,
    val `var`: ExprVariable,
    val default: Expr?
) : Node

data class TypeHint(
    val name: String,
    val nullable: Boolean,
    val isBuiltin: Boolean
) {
    fun toCodeString() = name + (if (nullable) "?" else "")
}


data class Const(val name: Identifier, val value: Expr, val namespacedName: Name?) : Node

data class Identifier(val name: String, val varLike: Boolean = false) : Node

data class Name(val parts: List<String>, val fullyQualified: Boolean = false) : Node {
    init {
        assert(parts.isNotEmpty()) { "Name 的 parts 参数不可为空" }
    }

    fun last() = parts.last()
    fun toCodeString() = (if (fullyQualified) "\\" else "") + parts.joinToString { "\\" }
}
