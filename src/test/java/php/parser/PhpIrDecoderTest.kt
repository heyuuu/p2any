package php.parser

import org.junit.Assert.*
import org.junit.Test
import java.io.File

class PhpIrDecoderTest {
    companion object {
        private val USER_DIR = System.getProperty("user.dir")!!
        private val BASE_CASE = "$USER_DIR/runtime/ir_compiler/dst/1.json"
    }

    @Test
    fun testBase() {
        val file = File(BASE_CASE)
        PhpIrDecoder().load(file)
    }
}