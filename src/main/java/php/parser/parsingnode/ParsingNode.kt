package php.parser.parsingnode

import php.ast.AstNode

interface ParsingNode : AstNode

data class TodoNode(val name: String, val children: List<AstNode>?) : ParsingNode {
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