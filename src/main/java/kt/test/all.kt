import kt.test.getConfig
import java.io.File

fun simpleType(type: String): String = type.substringAfterLast(".")




fun main() {
    val config = getConfig()
    val targetFile = "/Users/heyu/Code/local/p2any/src/main/java/kt/tool/KtAstTransformer.kt"

    val methods = config.map { (type, props) ->
        """
    private fun p${simpleType(type)}(node: ${type}): kt.ast.${type} {
        return kt.ast.${type}(
            ${
                props.joinToString(",\n            ") { (propName, propType) ->
                    if (config.containsKey(propType)) {
                        "${propName} = p${simpleType(type)}(node.${propName})"
                    } else {
                        "${propName} = p(node.${propName}, ${propType}::class)"
                    }
                    
                }
            }
        )
    }
"""
    }

    val code = """
package kt.tool

import php.ast.*

class KtAstTransformer : KtAstTransformerAbstract() {
    override fun p(node: Node): kt.ast.Node {
        when (node) {
            ${
        config.keys.joinToString("\n            ") { type -> "is $type -> p${simpleType(type)}(node)" }
    }
            else -> throw Exception("不支持的 php.ast.node 类型: \$\{node::class.qualifiedName}")
        }
    }
    
    ${
        methods.joinToString("\n\n")
    }
}
"""

    File(targetFile).writeText(code)
}