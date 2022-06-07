package php.misc

import com.fasterxml.jackson.core.PrettyPrinter
import com.fasterxml.jackson.databind.ObjectMapper
import php.misc.json.PhpStylePrettyPrinter

typealias JsonObjectRebuilder = (Map<String, Any?>) -> Any?

object JsonUtil {
    fun encode(obj: Any?): String {
        val objectMapper = ObjectMapper()
        return objectMapper.writeValueAsString(obj)
    }

    fun encodePretty(obj: Any?): String {
        val objectMapper = ObjectMapper().setDefaultPrettyPrinter(PhpStylePrettyPrinter())
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj)
    }

    fun decode(json: String, objectRebuilder: JsonObjectRebuilder? = null): Any? {
        val objectMapper = ObjectMapper()
        val value = objectMapper.readValue(json, Object::class.java)
        return if (objectRebuilder != null) {
            rebuild(value, objectRebuilder)
        } else {
            value
        }
    }

    private fun rebuild(value: Any?, objectRebuilder: JsonObjectRebuilder): Any? {
        return when (value) {
            is List<*> -> value.map { rebuild(it, objectRebuilder) }
            is Map<*, *> -> {
                val map = value.mapValues { rebuild(it.value, objectRebuilder) } as Map<String, *>
                objectRebuilder(map)
            }
            else -> value
        }
    }
}