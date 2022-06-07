package php.parser

import php.misc.JsonDecoder
import php.parser.node.AnyOf2
import php.parser.node.AnyOf3
import php.parser.node.Node
import java.io.File
import kotlin.reflect.KClass
import kotlin.reflect.cast
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.safeCast

abstract class NodeDecoderAbstract {
    protected class ValueMap(val map: Map<String, Any?>) : Map<String, Any?> by map {
        // map number
        private fun castNumber(value: Number, type: KClass<out Number>): Number {
            return when (type) {
                Int::class -> value.toInt()
                Double::class -> value.toDouble()
                else -> throw Exception("预期外的 Number 类: " + type.qualifiedName)
            }
        }


        // get as simple
        fun <T : Any> getAs(key: String, type: KClass<T>): T = getAsOrNull(key, type)!!
        fun <T : Any> getAsOrNull(key: String, type: KClass<T>): T? {
            return map[key]?.let {
                if (it is Number && type.isSubclassOf(Number::class)) {
                    castNumber(it, type as KClass<out Number>) as T
                } else {
                    type.safeCast(it)
                }
            }
        }

        // get as list
        fun <T : Any> getAsListOrNull(key: String, itemType: KClass<T>): List<T>? {
            return getAsOrNull(key, List::class)?.map { itemType.cast(it) }
        }

        fun <T : Any> getAsList(key: String, itemType: KClass<T>): List<T> = getAsListOrNull(key, itemType)!!

        fun <T : Any> getAsListOfNullableOrNull(key: String, itemType: KClass<T>): List<T?>? {
            return getAsOrNull(key, List::class)?.map { itemType.safeCast(it) }
        }

        fun <T : Any> getAsListOfNullable(key: String, itemType: KClass<T>): List<T?> = getAsListOrNull(key, itemType)!!

        // get as any-of
        fun <T1 : Any, T2 : Any> getAsAnyOf2OrNull(key: String, type1: KClass<T1>, type2: KClass<T2>): AnyOf2<T1, T2>? {
            return map[key]?.let { AnyOf2(it, type1, type2) }
        }

        fun <T1 : Any, T2 : Any> getAsAnyOf2(key: String, type1: KClass<T1>, type2: KClass<T2>): AnyOf2<T1, T2> {
            return getAsAnyOf2OrNull(key, type1, type2)!!
        }

        fun <T1 : Any, T2 : Any, T3 : Any> getAsAnyOf3OrNull(
            key: String, type1: KClass<T1>, type2: KClass<T2>, type3: KClass<T3>
        ): AnyOf3<T1, T2, T3>? {
            return map[key]?.let { AnyOf3(it, type1, type2, type3) }
        }

        fun <T1 : Any, T2 : Any, T3 : Any> getAsAnyOf3(key: String, type1: KClass<T1>, type2: KClass<T2>, type3: KClass<T3>): AnyOf3<T1, T2, T3> {
            return getAsAnyOf3OrNull(key, type1, type2, type3)!!
        }
    }

    private val jsonDecoder = JsonDecoder { resolveObject(ValueMap(it)) }

    fun decode(json: String): Any? {
        return jsonDecoder.decode(json)
    }

    fun decodeFile(file: File) = decode(file.readText())

    private fun resolveObject(map: ValueMap): Any? {
        val nodeType = map.getAsOrNull("type", String::class)
        val properties = map.getAsOrNull("properties", ValueMap::class)
        if (nodeType != null && properties != null) {
            return tryResolveNode(nodeType, properties)
        }

        return map
    }

    /**
     * 尝试解析成Node对象, 若无法解析成Node则返回null
     */
    protected abstract fun tryResolveNode(nodeType: String, properties: ValueMap): Node?
}