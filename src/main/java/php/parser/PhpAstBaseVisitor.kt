package php.parser

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import php.ast.AstNode
import php.parser.antlr.PhpParser
import php.parser.antlr.PhpParserBaseVisitor
import php.parser.exception.UnexpectedException
import php.parser.exception.UnsupportedException
import php.parser.parsingnode.unwrapNode
import php.parser.parsingnode.wrapListNode

abstract class PhpAstBaseVisitor : PhpParserBaseVisitor<AstNode>() {
    companion object {
        val unsupported = setOf(
            PhpParser.InlineHtmlContext::class,
            PhpParser.HtmlElementContext::class,
            PhpParser.ScriptTextContext::class,
        )
    }

    override fun visitChildren(node: RuleNode): AstNode {
        if (unsupported.contains(node::class)) {
            unexpected("不支持此语法节点 - ${node::class.simpleName}")
        }
        
        if (node is ParserRuleContext) {
            return (node.children ?: emptyList()).filterIsInstance<ParserRuleContext>().map { visit(it) }.let { wrapListNode(it) }
        }

        unexpected("不支持此语法节点 - ${node::class.simpleName}")
    }

    override fun visitTerminal(node: TerminalNode): AstNode {
        unexpected("不应直接处理 TerminalNode 节点")
    }

    override fun visitErrorNode(node: ErrorNode): AstNode {
        unexpected("不应出现 ErrorNode 节点")
    }

    private fun unexpected(message: String): Nothing {
        throw UnexpectedException("预期外的语法节点: $message")
    }

    protected fun unsupported(feature: String): Nothing {
        throw UnsupportedException("未支持的语法节点: $feature")
    }
}