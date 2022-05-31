package php.parser.parsingnode

import php.ast.AstNode

interface ParsingNode : AstNode

data class TodoNode(val nodeType: String, val children: List<AstNode>?) : ParsingNode {
    val type = "TodoNode"
}

data class ParsingTerminalNode(val value: String) : ParsingNode {
    val type = "ParsingTerminalNode"
}

class ParsingListNode(nodes: List<AstNode>) : ParsingNode {
    val type = "ParsingListNode"
    val nodes: List<AstNode> = unwrapNode(nodes)
}

// 展开 ParsingListNode 节点
fun unwrapNode(node: AstNode): List<AstNode> = if (node is ParsingListNode) node.nodes else listOf(node)
fun unwrapNode(nodes: List<AstNode>): List<AstNode> = nodes.flatMap { unwrapNode(it) }

// 包装 ListNode 节点
fun wrapListNode(nodes: List<AstNode>): AstNode {
    return unwrapNode(nodes).let {
        if (it.size == 1) {
            it[0]
        } else {
            ParsingListNode(it)
        }
    }
}