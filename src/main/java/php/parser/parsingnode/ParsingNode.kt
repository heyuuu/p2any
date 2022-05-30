package php.parser.parsingnode

import php.ast.AstNode

interface ParsingNode : AstNode

data class TodoNode(val type: String, val children: List<AstNode>?) : ParsingNode
data class ParsingTerminalNode(val value: String) : ParsingNode

class ParsingListNode(nodes: List<AstNode>) : ParsingNode {
    companion object {
        fun unwrapNode(node: AstNode): List<AstNode> {
            return when (node) {
                is ParsingListNode -> node.nodes
                else -> listOf(node)
            }
        }

        fun unwrapListNode(nodes: List<AstNode>): List<AstNode> {
            return nodes.flatMap { unwrapNode(it) }
        }
    }


    val type = "ParsingListNode"
    val nodes: List<AstNode> = unwrapListNode(nodes)
}

