package php.misc.json

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.PrettyPrinter

class PhpStylePrettyPrinter : PrettyPrinter {
    @Transient
    private var level = 0

    private val objectFieldValueSeparator = ": "
    private val objectEntrySeparator = ","
    private val arrayValueSeparator = ","
    private val preIndent = "    "
    private val endOfLine = "\n"

    private fun JsonGenerator.writeIndent(level: Int) {
        writeRaw(endOfLine)
        if (level > 0) {
            writeRaw(preIndent.repeat(level))
        }
    }

    /*
    / **********************************************************
    / * PrettyPrinter impl
    / **********************************************************
     */
    override fun writeRootValueSeparator(g: JsonGenerator) {}

    override fun writeStartObject(g: JsonGenerator) {
        g.writeRaw('{')
        level++
    }

    override fun beforeObjectEntries(g: JsonGenerator) {
        g.writeIndent(level)
    }

    override fun writeObjectFieldValueSeparator(g: JsonGenerator) {
        g.writeRaw(objectFieldValueSeparator)
    }

    override fun writeObjectEntrySeparator(g: JsonGenerator) {
        g.writeRaw(objectEntrySeparator)
        g.writeIndent(level)
    }

    override fun writeEndObject(g: JsonGenerator, nrOfEntries: Int) {
        level--
        if (nrOfEntries > 0) {
            g.writeIndent(level)
        }
        g.writeRaw('}')
    }

    override fun writeStartArray(g: JsonGenerator) {
        level++
        g.writeRaw('[')
    }

    override fun beforeArrayValues(g: JsonGenerator) {
        g.writeIndent(level)
    }

    override fun writeArrayValueSeparator(g: JsonGenerator) {
        g.writeRaw(arrayValueSeparator)
        g.writeIndent(level)
    }

    override fun writeEndArray(g: JsonGenerator, nrOfValues: Int) {
        level--
        if (nrOfValues > 0) {
            g.writeIndent(level)
        }
        g.writeRaw(']')
    }
}