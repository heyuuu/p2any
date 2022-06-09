package php.lang

sealed interface PVal

// 基础类型
object PNull : PVal

sealed interface PBool : PVal
object PTrue : PBool
object PFalse : PBool

data class PInt(val value: Long) : PVal
data class PFloat(val value: Double) : PVal
data class PString(val value: String) : PVal

// 资源类型
data class PResource(val resource: Any) : PVal

// 数组类型
class PArray : PVal {
    private val items: MutableList<Pair<PVal, PVal>> = mutableListOf()
}

// 对象类型
data class PObject(
    val type: PClass,
    // todo 考虑父类private属性等情况
    val properties: Map<String, PVal>
) : PVal {
}

