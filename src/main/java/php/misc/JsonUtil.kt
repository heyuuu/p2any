package php.misc

import com.fasterxml.jackson.core.PrettyPrinter
import com.fasterxml.jackson.core.util.DefaultIndenter
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter
import com.fasterxml.jackson.databind.ObjectMapper

typealias JsonObjectRebuilder = (Map<String, Any?>) -> Any?

object JsonUtil {
    fun encode(obj: Any?): String {
        val objectMapper = ObjectMapper()
        return objectMapper.writeValueAsString(obj)
    }

    fun encodePretty(obj: Any?): String {
        val objectMapper = ObjectMapper().setDefaultPrettyPrinter(prettyPrinter())
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj)
    }

    private fun prettyPrinter(): PrettyPrinter {
        return DefaultPrettyPrinter()
            .withArrayIndenter(DefaultIndenter("    ", "\n"))
            .withObjectIndenter(DefaultIndenter("    ", "\n"))
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