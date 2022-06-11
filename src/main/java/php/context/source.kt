package php.context

data class SourceProject(
    val projectRoot: String,
    val preparseRoot: String,
    val phpFiles: Set<SourceFile>,
    val autoload: Map<String, SourceFile>,
)

class SourceFile(val relativePath: String)