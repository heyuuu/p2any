package php.parser.node

import kotlin.reflect.KClass

sealed class AnyOf(protected val value: Any, protected val types: List<KClass<*>>) {
    fun isType(index: Int) = if (index >= 1 && index <= types.size) types[index - 1].isInstance(value) else false
    fun asType(index: Int) = value.takeIf { isType(index) }
}

class AnyOf2<T1 : Any, T2 : Any>(
    value: Any, type1: KClass<T1>, type2: KClass<T2>
) : AnyOf(value, listOf(type1, type2)) {
    val isType1 = isType(1)
    val isType2 = isType(2)
    val asType1 = asType(1) as T1?
    val asType2 = asType(2) as T2?
}

class AnyOf3<T1 : Any, T2 : Any, T3 : Any>(
    value: Any, type1: KClass<T1>, type2: KClass<T2>, type3: KClass<T3>
) : AnyOf(value, listOf(type1, type2)) {
    val isType1 = isType(1)
    val isType2 = isType(2)
    val isType3 = isType(3)
    val asType1 = asType(1) as T1?
    val asType2 = asType(2) as T2?
    val asType3 = asType(3) as T3?
}