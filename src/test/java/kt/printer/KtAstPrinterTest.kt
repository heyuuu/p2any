package kt.printer

import org.junit.Test
import php.misc.FileUtil
import php.parser.AstTransformer
import php.parser.NodeDecoder
import php.parser.node.Stmt
import php.printer.AstPrinter
import java.io.File

class KtAstPrinterTest {
    companion object {
        private val workDir = System.getProperty("user.dir")!!
        val phpNodeRoot = "$workDir/runtime/case_php/node_json/"
        val astPrintRoot = "$workDir/runtime/case_java/ast_printer/"
    }

    @Test
    fun testAll() {
        runCaseGroup(null)
    }

    @Test
    fun testBase() {
        runCaseGroup("base")
    }

    @Test
    fun testPhpParserCase() {
        runCaseGroup("PhpParser")
    }

    private fun runCaseGroup(group: String?) {
        if (group == null) {
            runCaseInDir(phpNodeRoot, astPrintRoot)
        } else {
            runCaseInDir("$phpNodeRoot$group/", "$astPrintRoot$group/")
        }
    }

    private fun runCaseInDir(phpNodeRoot: String, astPrintRoot: String) {
        val decoder = NodeDecoder()
        val transformer = AstTransformer()
        val printer = AstPrinter()
        val baseDir = File(phpNodeRoot)
        baseDir.walk()
            .filter { it.isFile }
            .filter { it.name.endsWith(".json") }
            .forEach { file ->
                val relativePath = file.relativeTo(baseDir).path
                println("Handle file: $relativePath")

                val nodes = decoder.decodeFile(file) as List<Stmt>
                val ast = transformer.transform(nodes)
                val code = printer.prettyPrintFile(ast)
                val astPrintFile = astPrintRoot + relativePath.replace(".json", ".php")
                FileUtil.saveFile(astPrintFile, code)
            }
    }
}