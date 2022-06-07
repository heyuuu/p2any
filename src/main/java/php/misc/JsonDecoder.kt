package php.misc

import com.google.gson.*

class JsonDecoder(
    private val objectDecoder: (Map<String, Any?>) -> Any?
) {
    constructor() : this({ it })

    fun decode(json: String): Any? {
        val value = Gson().fromJson(json, JsonElement::class.java)
        return resolve(value)
    }

    private fun resolve(element: JsonElement): Any? {
        return when (element) {
            is JsonNull -> null
            is JsonPrimitive -> resolvePrimitive(element)
            is JsonArray -> resolveArray(element)
            is JsonObject -> resolveObject(element)
            else -> throw RuntimeException("预期外的 JsonElement 子类: " + element::class.qualifiedName)
        }
    }

    private fun resolvePrimitive(element: JsonPrimitive): Any? {
        return when {
            element.isBoolean -> element.asBoolean
            element.isNumber -> element.asNumber
            element.isString -> element.asString
            else -> throw RuntimeException("预期外的 JsonPrimitive 类值, value: $element")
        }
    }

    private fun resolveArray(element: JsonArray): List<Any?> {
        return element.toList().map { resolve(it) }
    }

    private fun resolveObject(element: JsonObject): Any? {
        val map: Map<String, Any?> = element.entrySet().associate { Pair(it.key, resolve(it.value)) }

        return objectDecoder(map)
    }
}