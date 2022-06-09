package php.parser

import org.junit.Ignore
import org.junit.Test
import php.parser.antlr.PhpParserVisitor
import java.io.File

class GenerateParserTest {
    private val targetFile = System.getProperty("user.dir")!! + "/src/main/java/php/parser/PhpAstVisitor.kt"

    private val methodList = listOf(
        "visitHtmlDocument",
        "visitInlineHtml",
        "visitHtmlElement",
        "visitScriptText",
        "visitPhpBlock",
        "visitImportStatement",
        "visitTopStatement",
        "visitUseDeclaration",
        "visitUseDeclarationContentList",
        "visitUseDeclarationContent",
        "visitNamespaceDeclaration",
        "visitNamespaceStatement",
        "visitFunctionDeclaration",
        "visitClassDeclaration",
        "visitClassEntryType",
        "visitInterfaceList",
        "visitTypeParameterListInBrackets",
        "visitTypeParameterList",
        "visitTypeParameterWithDefaultsList",
        "visitTypeParameterDecl",
        "visitTypeParameterWithDefaultDecl",
        "visitGenericDynamicArgs",
        "visitAttributes",
        "visitAttributeGroup",
        "visitAttribute",
        "visitInnerStatementList",
        "visitInnerStatement",
        "visitStatement",
        "visitEmptyStatement_",
        "visitBlockStatement",
        "visitIfStatement",
        "visitElseIfStatement",
        "visitElseIfColonStatement",
        "visitElseStatement",
        "visitElseColonStatement",
        "visitWhileStatement",
        "visitDoWhileStatement",
        "visitForStatement",
        "visitForInit",
        "visitForUpdate",
        "visitSwitchStatement",
        "visitSwitchBlock",
        "visitBreakStatement",
        "visitContinueStatement",
        "visitReturnStatement",
        "visitExpressionStatement",
        "visitUnsetStatement",
        "visitForeachStatement",
        "visitTryCatchFinally",
        "visitCatchClause",
        "visitFinallyStatement",
        "visitThrowStatement",
        "visitGotoStatement",
        "visitDeclareStatement",
        "visitInlineHtmlStatement",
        "visitDeclareList",
        "visitFormalParameterList",
        "visitFormalParameter",
        "visitTypeHint",
        "visitGlobalStatement",
        "visitGlobalVar",
        "visitEchoStatement",
        "visitStaticVariableStatement",
        "visitClassStatement",
        "visitTraitAdaptations",
        "visitTraitAdaptationStatement",
        "visitTraitPrecedence",
        "visitTraitAlias",
        "visitTraitMethodReference",
        "visitBaseCtorCall",
        "visitMethodBody",
        "visitPropertyModifiers",
        "visitMemberModifiers",
        "visitVariableInitializer",
        "visitIdentifierInitializer",
        "visitGlobalConstantDeclaration",
        "visitExpressionList",
        "visitParentheses",
        "visitChainExpression",
        "visitSpecialWordExpression",
        "visitArrayCreationExpression",
        "visitBackQuoteStringExpression",
        "visitMatchExpression",
        "visitLogicalExpression",
        "visitPrintExpression",
        "visitAssignmentExpression",
        "visitPostfixIncDecExpression",
        "visitCloneExpression",
        "visitUnaryOperatorExpression",
        "visitNewExpression",
        "visitParenthesisExpression",
        "visitSpaceshipExpression",
        "visitConditionalExpression",
        "visitNullCoalescingExpression",
        "visitArithmeticExpression",
        "visitIndexerExpression",
        "visitScalarExpression",
        "visitPrefixIncDecExpression",
        "visitComparisonExpression",
        "visitCastExpression",
        "visitInstanceOfExpression",
        "visitLambdaFunctionExpression",
        "visitBitwiseExpression",
        "visitAssignable",
        "visitArrayCreation",
        "visitLambdaFunctionExpr",
        "visitMatchExpr",
        "visitMatchItem",
        "visitNewExpr",
        "visitAssignmentOperator",
        "visitYieldExpression",
        "visitArrayItemList",
        "visitArrayItem",
        "visitLambdaFunctionUseVars",
        "visitLambdaFunctionUseVar",
        "visitQualifiedStaticTypeRef",
        "visitTypeRef",
        "visitAnonymousClass",
        "visitIndirectTypeRef",
        "visitQualifiedNamespaceName",
        "visitNamespaceNameList",
        "visitNamespaceNameTail",
        "visitQualifiedNamespaceNameList",
        "visitArguments",
        "visitActualArgument",
        "visitArgumentName",
        "visitConstantInitializer",
        "visitConstant",
        "visitLiteralConstant",
        "visitNumericConstant",
        "visitClassConstant",
        "visitStringConstant",
        "visitString",
        "visitInterpolatedStringPart",
        "visitChainList",
        "visitChain",
        "visitChainOrigin",
        "visitMemberAccess",
        "visitFunctionCall",
        "visitFunctionCallName",
        "visitActualArguments",
        "visitChainBase",
        "visitKeyedFieldName",
        "visitKeyedSimpleFieldName",
        "visitKeyedVariable",
        "visitSquareCurlyExpression",
        "visitAssignmentList",
        "visitAssignmentListElement",
        "visitModifier",
        "visitIdentifier",
        "visitMemberModifier",
        "visitMagicConstant",
        "visitMagicMethod",
        "visitPrimitiveType",
        "visitCastOperation",
    )

    /**
     * 生成 Parser 基础代码的脚本，非正常测试case
     */
    @Test
    @Ignore
    fun testGenerateParser() {
        val code = StringBuilder()
        code.append(
            """package php.parser

import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import php.ast.AstNode
import php.parser.antlr.PhpParser
import php.parser.antlr.PhpBaseParserVisitor

class PhpAstVisitor: PhpBaseParserVisitor<AstNode>() {
    override fun visit(tree: ParseTree?): AstNode {
        TODO("Not yet implemented")
    }

    override fun visitChildren(node: RuleNode?): AstNode {
        TODO("Not yet implemented")
    }

    override fun visitTerminal(node: TerminalNode?): AstNode {
        TODO("Not yet implemented")
    }

    override fun visitErrorNode(node: ErrorNode?): AstNode {
        TODO("Not yet implemented")
    }
    """
        )


        val refClass = PhpParserVisitor::class.java
        refClass.declaredMethods.sortedBy { methodList.indexOf(it.name) }.forEach { method ->
            if (method.parameterCount != 1) {
                return
            }

            val type = method.parameters[0].type
            val typeMethods = type.declaredMethods.filter {
                it.parameterCount == 0 && it.returnType != Void.TYPE
            }.map { it.name }

            val simpleType = "PhpParser." + type.simpleName.replace("?", "")

            code.append(
                """
            
    override fun ${method.name}(ctx: ${simpleType}): AstNode {
        """
            )

            typeMethods.forEach { typeMethodName ->
                code.append(
                    """
        val $typeMethodName = ctx.$typeMethodName()        
            """
                )
            }

            code.append(
                """
            
        TODO("Not yet implemented")
    }
        """
            )
        }
        code.append("\n}\n")


        File(targetFile).writeText(code.toString())
    }
}