package php.parser

import php.ast.Stmt
import java.io.File

class ProjectParser(
    private val config: ProjectConfig
) {
    private val projectRootToken: String = "__PROJECT_ROOT__"
    private val nodeDecoder: NodeDecoder = NodeDecoder()
    private val astTransformer: AstTransformer = AstTransformer()

    private val compiledFiles: MutableSet<String> = mutableSetOf()
    private val compilingFiles: MutableSet<String> = mutableSetOf()

    fun compile() {
        // init
        compiledFiles.clear()
        compilingFiles.clear()

        // compile each file
        config.allCodeFiles.forEach { file -> compileFile(file) }
    }

    private fun compileFile(file: String) {
        // 避免重复编译
        if (compiledFiles.contains(file) || compilingFiles.contains(file)) {
            return
        }

        // before compile file
        compilingFiles.add(file)

        // real compile file
        realCompileFile(file)

        // after compile file
        compilingFiles.remove(file)
        compiledFiles.add(file)
    }

    private fun realCompileFile(file: String) {
        val ast = getFileAst(file)



    }

    private fun getFileAst(file: String): List<Stmt> {
        val nodeJsonFilePath = config.preparseRoot + "/" + file.replace(".php", ".json")
        val nodes = nodeDecoder.decodeFile(File(nodeJsonFilePath))
        return astTransformer.transform(nodes)
    }
}