package php.parser

data class ProjectConfig(
    // 项目目录
    val projectRoot: String,
    // 入口文件列表
    val mainFiles: Map<String, String>,
    // 所有代码文件
    val allCodeFiles: List<String>,
    // 自动加载文件
    val autoloadFiles: List<String>,
    // 自动加载类文件
    val autoloadClassFiles: Map<String, String>,
    // 预解析目录
    val preparseRoot: String
)
