package php.context

/**
 * 项目资源配置
 */
open class SourceProject(
    val projectRoot: String,
    val mainFiles: Map<String, String>,
    val allFiles: List<String>,
    val autoloadFiles: List<String>,
    val autoloadClasses: Map<String, String>
)

/**
 * 预解析的项目资源配置(用于PHP预解析场景)
 */
class SourceProjectStatic(
    projectRoot: String,
    mainFiles: Map<String, String>,
    allFiles: List<String>,
    autoloadFiles: List<String>,
    autoloadClasses: Map<String, String>,
    // preparse
    val preparseRoot: String
) : SourceProject(projectRoot, mainFiles, allFiles, autoloadFiles, autoloadClasses)

