package php.parser

import org.junit.Test
import php.misc.FileUtil
import php.misc.JsonUtil
import java.io.File

class PhpAstParserTest {
    companion object {
        private val workDir = System.getProperty("user.dir")!!
        val srcRoot = "$workDir/php/src/PhpParser/"
        val dstRoot = "$workDir/runtime/ast_by_java/"
        val specialSrcRoot = "$workDir/runtime/special_case/php/"
        val specialDstRoot = "$workDir/runtime/special_case/ast/"
    }

    @Test
    fun testPhpParserCase() {
        runCaseInDir(srcRoot, dstRoot)
    }

    @Test
    fun testSpecialCase() {
        runCaseInDir(specialSrcRoot, specialDstRoot)
    }

    private fun runCaseInDir(srcRoot: String, dstRoot: String) {
        val parser = PhpAstParser()
        val baseDir = File(srcRoot)
        baseDir.walk()
            .filter { it.isFile }
            .filter { it.name.endsWith(".php") }
            .forEach { file ->
                val relativePath = file.relativeTo(baseDir).path
                println("Handle file: $relativePath")
                val dstFilePath = dstRoot + relativePath.replace(".php", ".json")
                val ast = parser.parse(file.readText())
                FileUtil.saveFile(dstFilePath, JsonUtil.encodePretty(ast))
            }
    }
}