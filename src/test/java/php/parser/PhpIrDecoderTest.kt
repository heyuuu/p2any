package php.parser

import org.junit.Assert.*
import org.junit.Test
import java.io.File

class PhpIrDecoderTest {
    companion object {
        private val USER_DIR = System.getProperty("user.dir")!!
        private val BASE_CASE = "$USER_DIR/runtime/ir_compiler/dst/1.json"
        private val PHP_PARSER_CASE = "$USER_DIR/runtime/ir_by_php/"
    }

    @Test
    fun testBaseCase() {
        val file = File(BASE_CASE)
        PhpIrDecoder().load(file)
    }

    @Test
    fun testPhpParserCase() {
        val dir = File(PHP_PARSER_CASE)
        dir.walk()
            .filter { it.isFile }
            .filter { it.name.endsWith(".json") }
            .forEach { file ->
                println("Handle file: ${file.path}")
                PhpIrDecoder().load(file)
            }
    }
}