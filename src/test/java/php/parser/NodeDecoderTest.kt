package php.parser

import org.junit.Assert.*
import org.junit.Test
import php.misc.FileUtil
import php.misc.JsonUtil
import java.io.File

class NodeDecoderTest {
    companion object {
        private val workDir = System.getProperty("user.dir")!!
        val srcRoot = "$workDir/runtime/ast_by_php/"
        val dstRoot = "$workDir/runtime/ast_by_java/"
    }

    @Test
    fun testPhpParserCase() {
        runCaseInDir(srcRoot, dstRoot)
    }

    private fun runCaseInDir(srcRoot: String, dstRoot: String) {
        val decoder = NodeDecoder()
        val encoder = NodeEncoder()
        val baseDir = File(srcRoot)
        baseDir.walk()
            .filter { it.isFile }
            .filter { it.name.endsWith(".json") }
            .forEach { file ->
                val relativePath = file.relativeTo(baseDir).path
                println("Handle file: $relativePath")

                val dstFilePath = dstRoot + relativePath
                val result = decoder.decodeFile(file)
                val json = encoder.encodePretty(result)
                FileUtil.saveFile(dstFilePath, json)
            }
    }
}