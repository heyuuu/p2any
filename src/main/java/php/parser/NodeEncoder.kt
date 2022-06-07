package php.parser

import php.misc.JsonUtil
import php.parser.node.Node
import kotlin.reflect.full.memberProperties

class NodeEncoder {
    fun encode(value: Any?): String = JsonUtil.encode(preEncode(value))
    fun encodePretty(value: Any?): String = JsonUtil.encodePretty(preEncode(value))

    private fun preEncode(value: Any?): Any? {
        return when (value) {
            is List<*> -> value.map { preEncode(it) }
            is Map<*, *> -> value.mapValues { preEncode(it.value) }
            is Node -> mapOf(
                "type" to value::class.simpleName,
                "properties" to preEncode(getVars(value))
            )
            else -> value
        }
    }

    private fun getVars(node: Node): Map<String, *> {
        return node::class.memberProperties.associate { Pair(it.name, it.call(node)) }
    }
}