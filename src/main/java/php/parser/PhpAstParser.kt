package php.parser

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import php.ast.AstNode
import php.parser.antlr.PhpLexer
import php.parser.antlr.PhpParser
import php.parser.parsingnode.ParsingListNode

class PhpAstParser {
    fun parse(code: String): List<AstNode> {
        val lexer = PhpLexer(CharStreams.fromString(code))
        val parser = PhpParser(CommonTokenStream(lexer))
        val visitor = PhpAstVisitor()
        val node = visitor.visit(parser.htmlDocument())

        return ParsingListNode.unwrapNode(node)
    }
}