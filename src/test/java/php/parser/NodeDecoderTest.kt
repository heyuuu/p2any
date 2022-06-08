package php.parser

import org.junit.Test
import php.misc.FileUtil
import php.parser.node.Stmt
import java.io.File

class NodeDecoderTest {
    companion object {
        private val workDir = System.getProperty("user.dir")!!
        val phpNodeRoot = "$workDir/runtime/case_php/node_json/"
        val nodeRoot = "$workDir/runtime/case_java/node_json/"
        val printRoot = "$workDir/runtime/case_java/node_print/"
    }

    @Test
    fun testPhpParserCase() {
        runCaseInDir(phpNodeRoot, nodeRoot, printRoot)
    }

    private fun runCaseInDir(phpNodeRoot: String, nodeRoot: String, printRoot: String) {
        val decoder = NodeDecoder()
        val encoder = NodeEncoder()
        val printer = NodePrinter()
        val baseDir = File(phpNodeRoot)
        baseDir.walk()
            .filter { it.isFile }
            .filter { it.name.endsWith(".json") }
            .forEach { file ->
                val relativePath = file.relativeTo(baseDir).path
                println("Handle file: $relativePath")

                val nodeFile = nodeRoot + relativePath
                val result = decoder.decodeFile(file)
                val json = encoder.encodePretty(result)
                FileUtil.saveFile(nodeFile, json)

                val printFile = printRoot + relativePath.replace(".json", ".php")
                val code = printer.prettyPrintFile(result as List<Stmt>)
                FileUtil.saveFile(printFile, code)
            }
    }
}