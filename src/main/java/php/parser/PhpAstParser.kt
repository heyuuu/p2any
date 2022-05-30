package php.parser

import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import php.ast.AstNode
import php.parser.antlr.PhpParser
import php.parser.antlr.PhpParserVisitor

class PhpAstParser: PhpParserVisitor<AstNode> {
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
    
            
    override fun visitHtmlDocument(ctx: PhpParser.HtmlDocumentContext): AstNode {
        
        val Shebang = ctx.Shebang()        
            
        val phpBlock = ctx.phpBlock()        
            
        val EOF = ctx.EOF()        
            
        val inlineHtml = ctx.inlineHtml()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitInlineHtml(ctx: PhpParser.InlineHtmlContext): AstNode {
        
        val htmlElement = ctx.htmlElement()        
            
        val scriptText = ctx.scriptText()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitHtmlElement(ctx: PhpParser.HtmlElementContext): AstNode {
        
        val HtmlStartDoubleQuoteString = ctx.HtmlStartDoubleQuoteString()        
            
        val HtmlDtd = ctx.HtmlDtd()        
            
        val HtmlOpen = ctx.HtmlOpen()        
            
        val HtmlName = ctx.HtmlName()        
            
        val HtmlText = ctx.HtmlText()        
            
        val HtmlHex = ctx.HtmlHex()        
            
        val XmlStart = ctx.XmlStart()        
            
        val XmlClose = ctx.XmlClose()        
            
        val XmlText = ctx.XmlText()        
            
        val HtmlClose = ctx.HtmlClose()        
            
        val HtmlStyleOpen = ctx.HtmlStyleOpen()        
            
        val HtmlSlashClose = ctx.HtmlSlashClose()        
            
        val HtmlSlash = ctx.HtmlSlash()        
            
        val HtmlEquals = ctx.HtmlEquals()        
            
        val HtmlStartQuoteString = ctx.HtmlStartQuoteString()        
            
        val HtmlEndQuoteString = ctx.HtmlEndQuoteString()        
            
        val HtmlEndDoubleQuoteString = ctx.HtmlEndDoubleQuoteString()        
            
        val HtmlDecimal = ctx.HtmlDecimal()        
            
        val HtmlQuoteString = ctx.HtmlQuoteString()        
            
        val HtmlDoubleQuoteString = ctx.HtmlDoubleQuoteString()        
            
        val StyleBody = ctx.StyleBody()        
            
        val HtmlScriptOpen = ctx.HtmlScriptOpen()        
            
        val HtmlScriptClose = ctx.HtmlScriptClose()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitScriptText(ctx: PhpParser.ScriptTextContext): AstNode {
        
        val ScriptText = ctx.ScriptText()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitPhpBlock(ctx: PhpParser.PhpBlockContext): AstNode {
        
        val importStatement = ctx.importStatement()        
            
        val topStatement = ctx.topStatement()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitImportStatement(ctx: PhpParser.ImportStatementContext): AstNode {
        
        val Import = ctx.Import()        
            
        val SemiColon = ctx.SemiColon()        
            
        val Namespace = ctx.Namespace()        
            
        val namespaceNameList = ctx.namespaceNameList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTopStatement(ctx: PhpParser.TopStatementContext): AstNode {
        
        val globalConstantDeclaration = ctx.globalConstantDeclaration()        
            
        val useDeclaration = ctx.useDeclaration()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val namespaceDeclaration = ctx.namespaceDeclaration()        
            
        val functionDeclaration = ctx.functionDeclaration()        
            
        val classDeclaration = ctx.classDeclaration()        
            
        val statement = ctx.statement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitUseDeclaration(ctx: PhpParser.UseDeclarationContext): AstNode {
        
        val useDeclarationContentList = ctx.useDeclarationContentList()        
            
        val Const = ctx.Const()        
            
        val Use = ctx.Use()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val Function_ = ctx.Function_()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitUseDeclarationContentList(ctx: PhpParser.UseDeclarationContentListContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val useDeclarationContent = ctx.useDeclarationContent()        
            
        val NamespaceSeparator = ctx.NamespaceSeparator()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitUseDeclarationContent(ctx: PhpParser.UseDeclarationContentContext): AstNode {
        
        val namespaceNameList = ctx.namespaceNameList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitNamespaceDeclaration(ctx: PhpParser.NamespaceDeclarationContext): AstNode {
        
        val namespaceStatement = ctx.namespaceStatement()        
            
        val SemiColon = ctx.SemiColon()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val Namespace = ctx.Namespace()        
            
        val namespaceNameList = ctx.namespaceNameList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitNamespaceStatement(ctx: PhpParser.NamespaceStatementContext): AstNode {
        
        val globalConstantDeclaration = ctx.globalConstantDeclaration()        
            
        val useDeclaration = ctx.useDeclaration()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val functionDeclaration = ctx.functionDeclaration()        
            
        val classDeclaration = ctx.classDeclaration()        
            
        val statement = ctx.statement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitFunctionDeclaration(ctx: PhpParser.FunctionDeclarationContext): AstNode {
        
        val typeParameterListInBrackets = ctx.typeParameterListInBrackets()        
            
        val typeHint = ctx.typeHint()        
            
        val Colon = ctx.Colon()        
            
        val identifier = ctx.identifier()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val Ampersand = ctx.Ampersand()        
            
        val QuestionMark = ctx.QuestionMark()        
            
        val attributes = ctx.attributes()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val Function_ = ctx.Function_()        
            
        val formalParameterList = ctx.formalParameterList()        
            
        val blockStatement = ctx.blockStatement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitClassDeclaration(ctx: PhpParser.ClassDeclarationContext): AstNode {
        
        val typeParameterListInBrackets = ctx.typeParameterListInBrackets()        
            
        val Private = ctx.Private()        
            
        val Extends = ctx.Extends()        
            
        val Partial = ctx.Partial()        
            
        val modifier = ctx.modifier()        
            
        val qualifiedStaticTypeRef = ctx.qualifiedStaticTypeRef()        
            
        val identifier = ctx.identifier()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val attributes = ctx.attributes()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val interfaceList = ctx.interfaceList()        
            
        val Implements = ctx.Implements()        
            
        val classStatement = ctx.classStatement()        
            
        val classEntryType = ctx.classEntryType()        
            
        val Interface = ctx.Interface()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitClassEntryType(ctx: PhpParser.ClassEntryTypeContext): AstNode {
        
        val Trait = ctx.Trait()        
            
        val Class = ctx.Class()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitInterfaceList(ctx: PhpParser.InterfaceListContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val qualifiedStaticTypeRef = ctx.qualifiedStaticTypeRef()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTypeParameterListInBrackets(ctx: PhpParser.TypeParameterListInBracketsContext): AstNode {
        
        val typeParameterWithDefaultsList = ctx.typeParameterWithDefaultsList()        
            
        val Comma = ctx.Comma()        
            
        val Lgeneric = ctx.Lgeneric()        
            
        val Rgeneric = ctx.Rgeneric()        
            
        val typeParameterList = ctx.typeParameterList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTypeParameterList(ctx: PhpParser.TypeParameterListContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val typeParameterDecl = ctx.typeParameterDecl()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTypeParameterWithDefaultsList(ctx: PhpParser.TypeParameterWithDefaultsListContext): AstNode {
        
        val typeParameterWithDefaultDecl = ctx.typeParameterWithDefaultDecl()        
            
        val Comma = ctx.Comma()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTypeParameterDecl(ctx: PhpParser.TypeParameterDeclContext): AstNode {
        
        val identifier = ctx.identifier()        
            
        val attributes = ctx.attributes()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTypeParameterWithDefaultDecl(ctx: PhpParser.TypeParameterWithDefaultDeclContext): AstNode {
        
        val Eq = ctx.Eq()        
            
        val qualifiedStaticTypeRef = ctx.qualifiedStaticTypeRef()        
            
        val identifier = ctx.identifier()        
            
        val attributes = ctx.attributes()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val primitiveType = ctx.primitiveType()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitGenericDynamicArgs(ctx: PhpParser.GenericDynamicArgsContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val Lgeneric = ctx.Lgeneric()        
            
        val Rgeneric = ctx.Rgeneric()        
            
        val typeRef = ctx.typeRef()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitAttributes(ctx: PhpParser.AttributesContext): AstNode {
        
        val attributeGroup = ctx.attributeGroup()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitAttributeGroup(ctx: PhpParser.AttributeGroupContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val Colon = ctx.Colon()        
            
        val identifier = ctx.identifier()        
            
        val CloseSquareBracket = ctx.CloseSquareBracket()        
            
        val AttributeStart = ctx.AttributeStart()        
            
        val attribute = ctx.attribute()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitAttribute(ctx: PhpParser.AttributeContext): AstNode {
        
        val qualifiedNamespaceName = ctx.qualifiedNamespaceName()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val arguments = ctx.arguments()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitInnerStatementList(ctx: PhpParser.InnerStatementListContext): AstNode {
        
        val innerStatement = ctx.innerStatement()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitInnerStatement(ctx: PhpParser.InnerStatementContext): AstNode {
        
        val getRuleIndex = ctx.getRuleIndex()        
            
        val functionDeclaration = ctx.functionDeclaration()        
            
        val classDeclaration = ctx.classDeclaration()        
            
        val statement = ctx.statement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitStatement(ctx: PhpParser.StatementContext): AstNode {
        
        val Colon = ctx.Colon()        
            
        val identifier = ctx.identifier()        
            
        val SemiColon = ctx.SemiColon()        
            
        val ifStatement = ctx.ifStatement()        
            
        val whileStatement = ctx.whileStatement()        
            
        val doWhileStatement = ctx.doWhileStatement()        
            
        val forStatement = ctx.forStatement()        
            
        val switchStatement = ctx.switchStatement()        
            
        val breakStatement = ctx.breakStatement()        
            
        val continueStatement = ctx.continueStatement()        
            
        val returnStatement = ctx.returnStatement()        
            
        val yieldExpression = ctx.yieldExpression()        
            
        val globalStatement = ctx.globalStatement()        
            
        val staticVariableStatement = ctx.staticVariableStatement()        
            
        val echoStatement = ctx.echoStatement()        
            
        val expressionStatement = ctx.expressionStatement()        
            
        val unsetStatement = ctx.unsetStatement()        
            
        val foreachStatement = ctx.foreachStatement()        
            
        val tryCatchFinally = ctx.tryCatchFinally()        
            
        val throwStatement = ctx.throwStatement()        
            
        val gotoStatement = ctx.gotoStatement()        
            
        val declareStatement = ctx.declareStatement()        
            
        val emptyStatement_ = ctx.emptyStatement_()        
            
        val inlineHtmlStatement = ctx.inlineHtmlStatement()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val blockStatement = ctx.blockStatement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitEmptyStatement_(ctx: PhpParser.EmptyStatement_Context): AstNode {
        
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitBlockStatement(ctx: PhpParser.BlockStatementContext): AstNode {
        
        val innerStatementList = ctx.innerStatementList()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitIfStatement(ctx: PhpParser.IfStatementContext): AstNode {
        
        val Colon = ctx.Colon()        
            
        val If = ctx.If()        
            
        val EndIf = ctx.EndIf()        
            
        val innerStatementList = ctx.innerStatementList()        
            
        val parentheses = ctx.parentheses()        
            
        val SemiColon = ctx.SemiColon()        
            
        val elseIfStatement = ctx.elseIfStatement()        
            
        val elseStatement = ctx.elseStatement()        
            
        val elseIfColonStatement = ctx.elseIfColonStatement()        
            
        val elseColonStatement = ctx.elseColonStatement()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val statement = ctx.statement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitElseIfStatement(ctx: PhpParser.ElseIfStatementContext): AstNode {
        
        val ElseIf = ctx.ElseIf()        
            
        val parentheses = ctx.parentheses()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val statement = ctx.statement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitElseIfColonStatement(ctx: PhpParser.ElseIfColonStatementContext): AstNode {
        
        val ElseIf = ctx.ElseIf()        
            
        val Colon = ctx.Colon()        
            
        val innerStatementList = ctx.innerStatementList()        
            
        val parentheses = ctx.parentheses()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitElseStatement(ctx: PhpParser.ElseStatementContext): AstNode {
        
        val Else = ctx.Else()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val statement = ctx.statement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitElseColonStatement(ctx: PhpParser.ElseColonStatementContext): AstNode {
        
        val Colon = ctx.Colon()        
            
        val Else = ctx.Else()        
            
        val innerStatementList = ctx.innerStatementList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitWhileStatement(ctx: PhpParser.WhileStatementContext): AstNode {
        
        val Colon = ctx.Colon()        
            
        val While = ctx.While()        
            
        val EndWhile = ctx.EndWhile()        
            
        val innerStatementList = ctx.innerStatementList()        
            
        val parentheses = ctx.parentheses()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val statement = ctx.statement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitDoWhileStatement(ctx: PhpParser.DoWhileStatementContext): AstNode {
        
        val While = ctx.While()        
            
        val Do = ctx.Do()        
            
        val parentheses = ctx.parentheses()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val statement = ctx.statement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitForStatement(ctx: PhpParser.ForStatementContext): AstNode {
        
        val Colon = ctx.Colon()        
            
        val forInit = ctx.forInit()        
            
        val EndFor = ctx.EndFor()        
            
        val For = ctx.For()        
            
        val innerStatementList = ctx.innerStatementList()        
            
        val SemiColon = ctx.SemiColon()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val expressionList = ctx.expressionList()        
            
        val forUpdate = ctx.forUpdate()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val statement = ctx.statement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitForInit(ctx: PhpParser.ForInitContext): AstNode {
        
        val expressionList = ctx.expressionList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitForUpdate(ctx: PhpParser.ForUpdateContext): AstNode {
        
        val expressionList = ctx.expressionList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitSwitchStatement(ctx: PhpParser.SwitchStatementContext): AstNode {
        
        val Colon = ctx.Colon()        
            
        val Switch = ctx.Switch()        
            
        val parentheses = ctx.parentheses()        
            
        val SemiColon = ctx.SemiColon()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val EndSwitch = ctx.EndSwitch()        
            
        val switchBlock = ctx.switchBlock()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitSwitchBlock(ctx: PhpParser.SwitchBlockContext): AstNode {
        
        val Default = ctx.Default()        
            
        val Colon = ctx.Colon()        
            
        val Case = ctx.Case()        
            
        val innerStatementList = ctx.innerStatementList()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitBreakStatement(ctx: PhpParser.BreakStatementContext): AstNode {
        
        val Break = ctx.Break()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitContinueStatement(ctx: PhpParser.ContinueStatementContext): AstNode {
        
        val Continue = ctx.Continue()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitReturnStatement(ctx: PhpParser.ReturnStatementContext): AstNode {
        
        val Return = ctx.Return()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitExpressionStatement(ctx: PhpParser.ExpressionStatementContext): AstNode {
        
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitUnsetStatement(ctx: PhpParser.UnsetStatementContext): AstNode {
        
        val Unset = ctx.Unset()        
            
        val SemiColon = ctx.SemiColon()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val chainList = ctx.chainList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitForeachStatement(ctx: PhpParser.ForeachStatementContext): AstNode {
        
        val Colon = ctx.Colon()        
            
        val chain = ctx.chain()        
            
        val List = ctx.List()        
            
        val Foreach = ctx.Foreach()        
            
        val As = ctx.As()        
            
        val innerStatementList = ctx.innerStatementList()        
            
        val SemiColon = ctx.SemiColon()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val assignmentList = ctx.assignmentList()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val assignable = ctx.assignable()        
            
        val Ampersand = ctx.Ampersand()        
            
        val EndForeach = ctx.EndForeach()        
            
        val DoubleArrow = ctx.DoubleArrow()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val statement = ctx.statement()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTryCatchFinally(ctx: PhpParser.TryCatchFinallyContext): AstNode {
        
        val Try = ctx.Try()        
            
        val finallyStatement = ctx.finallyStatement()        
            
        val catchClause = ctx.catchClause()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val blockStatement = ctx.blockStatement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitCatchClause(ctx: PhpParser.CatchClauseContext): AstNode {
        
        val VarName = ctx.VarName()        
            
        val Catch = ctx.Catch()        
            
        val Pipe = ctx.Pipe()        
            
        val qualifiedStaticTypeRef = ctx.qualifiedStaticTypeRef()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val blockStatement = ctx.blockStatement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitFinallyStatement(ctx: PhpParser.FinallyStatementContext): AstNode {
        
        val Finally = ctx.Finally()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val blockStatement = ctx.blockStatement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitThrowStatement(ctx: PhpParser.ThrowStatementContext): AstNode {
        
        val Throw = ctx.Throw()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitGotoStatement(ctx: PhpParser.GotoStatementContext): AstNode {
        
        val Goto = ctx.Goto()        
            
        val identifier = ctx.identifier()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitDeclareStatement(ctx: PhpParser.DeclareStatementContext): AstNode {
        
        val Colon = ctx.Colon()        
            
        val Declare = ctx.Declare()        
            
        val innerStatementList = ctx.innerStatementList()        
            
        val SemiColon = ctx.SemiColon()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val statement = ctx.statement()        
            
        val declareList = ctx.declareList()        
            
        val EndDeclare = ctx.EndDeclare()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitInlineHtmlStatement(ctx: PhpParser.InlineHtmlStatementContext): AstNode {
        
        val inlineHtml = ctx.inlineHtml()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitDeclareList(ctx: PhpParser.DeclareListContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val identifierInitializer = ctx.identifierInitializer()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitFormalParameterList(ctx: PhpParser.FormalParameterListContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val formalParameter = ctx.formalParameter()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitFormalParameter(ctx: PhpParser.FormalParameterContext): AstNode {
        
        val Ellipsis = ctx.Ellipsis()        
            
        val typeHint = ctx.typeHint()        
            
        val variableInitializer = ctx.variableInitializer()        
            
        val Ampersand = ctx.Ampersand()        
            
        val QuestionMark = ctx.QuestionMark()        
            
        val attributes = ctx.attributes()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val memberModifier = ctx.memberModifier()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTypeHint(ctx: PhpParser.TypeHintContext): AstNode {
        
        val typeHint = ctx.typeHint()        
            
        val Callable = ctx.Callable()        
            
        val Pipe = ctx.Pipe()        
            
        val qualifiedStaticTypeRef = ctx.qualifiedStaticTypeRef()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val primitiveType = ctx.primitiveType()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitGlobalStatement(ctx: PhpParser.GlobalStatementContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val Global = ctx.Global()        
            
        val SemiColon = ctx.SemiColon()        
            
        val globalVar = ctx.globalVar()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitGlobalVar(ctx: PhpParser.GlobalVarContext): AstNode {
        
        val chain = ctx.chain()        
            
        val VarName = ctx.VarName()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
        val Dollar = ctx.Dollar()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitEchoStatement(ctx: PhpParser.EchoStatementContext): AstNode {
        
        val Echo = ctx.Echo()        
            
        val SemiColon = ctx.SemiColon()        
            
        val expressionList = ctx.expressionList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitStaticVariableStatement(ctx: PhpParser.StaticVariableStatementContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val variableInitializer = ctx.variableInitializer()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val Static = ctx.Static()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitClassStatement(ctx: PhpParser.ClassStatementContext): AstNode {
        
        val typeParameterListInBrackets = ctx.typeParameterListInBrackets()        
            
        val qualifiedNamespaceNameList = ctx.qualifiedNamespaceNameList()        
            
        val Comma = ctx.Comma()        
            
        val typeHint = ctx.typeHint()        
            
        val Const = ctx.Const()        
            
        val Use = ctx.Use()        
            
        val variableInitializer = ctx.variableInitializer()        
            
        val identifier = ctx.identifier()        
            
        val SemiColon = ctx.SemiColon()        
            
        val identifierInitializer = ctx.identifierInitializer()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val Ampersand = ctx.Ampersand()        
            
        val propertyModifiers = ctx.propertyModifiers()        
            
        val methodBody = ctx.methodBody()        
            
        val memberModifiers = ctx.memberModifiers()        
            
        val baseCtorCall = ctx.baseCtorCall()        
            
        val traitAdaptations = ctx.traitAdaptations()        
            
        val attributes = ctx.attributes()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val Function_ = ctx.Function_()        
            
        val formalParameterList = ctx.formalParameterList()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTraitAdaptations(ctx: PhpParser.TraitAdaptationsContext): AstNode {
        
        val SemiColon = ctx.SemiColon()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val traitAdaptationStatement = ctx.traitAdaptationStatement()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTraitAdaptationStatement(ctx: PhpParser.TraitAdaptationStatementContext): AstNode {
        
        val traitPrecedence = ctx.traitPrecedence()        
            
        val traitAlias = ctx.traitAlias()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTraitPrecedence(ctx: PhpParser.TraitPrecedenceContext): AstNode {
        
        val qualifiedNamespaceNameList = ctx.qualifiedNamespaceNameList()        
            
        val identifier = ctx.identifier()        
            
        val SemiColon = ctx.SemiColon()        
            
        val qualifiedNamespaceName = ctx.qualifiedNamespaceName()        
            
        val DoubleColon = ctx.DoubleColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val InsteadOf = ctx.InsteadOf()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTraitAlias(ctx: PhpParser.TraitAliasContext): AstNode {
        
        val As = ctx.As()        
            
        val identifier = ctx.identifier()        
            
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val memberModifier = ctx.memberModifier()        
            
        val traitMethodReference = ctx.traitMethodReference()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTraitMethodReference(ctx: PhpParser.TraitMethodReferenceContext): AstNode {
        
        val identifier = ctx.identifier()        
            
        val qualifiedNamespaceName = ctx.qualifiedNamespaceName()        
            
        val DoubleColon = ctx.DoubleColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitBaseCtorCall(ctx: PhpParser.BaseCtorCallContext): AstNode {
        
        val typeHint = ctx.typeHint()        
            
        val Colon = ctx.Colon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val arguments = ctx.arguments()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitMethodBody(ctx: PhpParser.MethodBodyContext): AstNode {
        
        val SemiColon = ctx.SemiColon()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val blockStatement = ctx.blockStatement()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitPropertyModifiers(ctx: PhpParser.PropertyModifiersContext): AstNode {
        
        val Var = ctx.Var()        
            
        val memberModifiers = ctx.memberModifiers()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitMemberModifiers(ctx: PhpParser.MemberModifiersContext): AstNode {
        
        val getRuleIndex = ctx.getRuleIndex()        
            
        val memberModifier = ctx.memberModifier()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitVariableInitializer(ctx: PhpParser.VariableInitializerContext): AstNode {
        
        val Eq = ctx.Eq()        
            
        val VarName = ctx.VarName()        
            
        val constantInitializer = ctx.constantInitializer()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitIdentifierInitializer(ctx: PhpParser.IdentifierInitializerContext): AstNode {
        
        val Eq = ctx.Eq()        
            
        val identifier = ctx.identifier()        
            
        val constantInitializer = ctx.constantInitializer()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitGlobalConstantDeclaration(ctx: PhpParser.GlobalConstantDeclarationContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val Const = ctx.Const()        
            
        val SemiColon = ctx.SemiColon()        
            
        val identifierInitializer = ctx.identifierInitializer()        
            
        val attributes = ctx.attributes()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitExpressionList(ctx: PhpParser.ExpressionListContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitParentheses(ctx: PhpParser.ParenthesesContext): AstNode {
        
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val yieldExpression = ctx.yieldExpression()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitChainExpression(ctx: PhpParser.ChainExpressionContext): AstNode {
        
        val chain = ctx.chain()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitSpecialWordExpression(ctx: PhpParser.SpecialWordExpressionContext): AstNode {
        
        val IsSet = ctx.IsSet()        
            
        val Empty = ctx.Empty()        
            
        val Yield = ctx.Yield()        
            
        val Eval = ctx.Eval()        
            
        val Throw = ctx.Throw()        
            
        val Eq = ctx.Eq()        
            
        val Require = ctx.Require()        
            
        val Include = ctx.Include()        
            
        val chain = ctx.chain()        
            
        val Exit = ctx.Exit()        
            
        val List = ctx.List()        
            
        val parentheses = ctx.parentheses()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val assignmentList = ctx.assignmentList()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val chainList = ctx.chainList()        
            
        val IncludeOnce = ctx.IncludeOnce()        
            
        val RequireOnce = ctx.RequireOnce()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitArrayCreationExpression(ctx: PhpParser.ArrayCreationExpressionContext): AstNode {
        
        val arrayCreation = ctx.arrayCreation()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitBackQuoteStringExpression(ctx: PhpParser.BackQuoteStringExpressionContext): AstNode {
        
        val BackQuoteString = ctx.BackQuoteString()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitMatchExpression(ctx: PhpParser.MatchExpressionContext): AstNode {
        
        val matchExpr = ctx.matchExpr()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitLogicalExpression(ctx: PhpParser.LogicalExpressionContext): AstNode {
        
        val LogicalAnd = ctx.LogicalAnd()        
            
        val LogicalXor = ctx.LogicalXor()        
            
        val LogicalOr = ctx.LogicalOr()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitPrintExpression(ctx: PhpParser.PrintExpressionContext): AstNode {
        
        val Print = ctx.Print()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitAssignmentExpression(ctx: PhpParser.AssignmentExpressionContext): AstNode {
        
        val newExpr = ctx.newExpr()        
            
        val Eq = ctx.Eq()        
            
        val chain = ctx.chain()        
            
        val assignable = ctx.assignable()        
            
        val assignmentOperator = ctx.assignmentOperator()        
            
        val Ampersand = ctx.Ampersand()        
            
        val attributes = ctx.attributes()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitPostfixIncDecExpression(ctx: PhpParser.PostfixIncDecExpressionContext): AstNode {
        
        val Inc = ctx.Inc()        
            
        val chain = ctx.chain()        
            
        val Dec = ctx.Dec()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitCloneExpression(ctx: PhpParser.CloneExpressionContext): AstNode {
        
        val Clone = ctx.Clone()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitUnaryOperatorExpression(ctx: PhpParser.UnaryOperatorExpressionContext): AstNode {
        
        val Tilde = ctx.Tilde()        
            
        val Bang = ctx.Bang()        
            
        val Plus = ctx.Plus()        
            
        val Minus = ctx.Minus()        
            
        val SuppressWarnings = ctx.SuppressWarnings()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitNewExpression(ctx: PhpParser.NewExpressionContext): AstNode {
        
        val newExpr = ctx.newExpr()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitParenthesisExpression(ctx: PhpParser.ParenthesisExpressionContext): AstNode {
        
        val parentheses = ctx.parentheses()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitSpaceshipExpression(ctx: PhpParser.SpaceshipExpressionContext): AstNode {
        
        val Spaceship = ctx.Spaceship()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitConditionalExpression(ctx: PhpParser.ConditionalExpressionContext): AstNode {
        
        val Colon = ctx.Colon()        
            
        val QuestionMark = ctx.QuestionMark()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitNullCoalescingExpression(ctx: PhpParser.NullCoalescingExpressionContext): AstNode {
        
        val NullCoalescing = ctx.NullCoalescing()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitArithmeticExpression(ctx: PhpParser.ArithmeticExpressionContext): AstNode {
        
        val Plus = ctx.Plus()        
            
        val Minus = ctx.Minus()        
            
        val Pow = ctx.Pow()        
            
        val Asterisk = ctx.Asterisk()        
            
        val Divide = ctx.Divide()        
            
        val Percent = ctx.Percent()        
            
        val expression = ctx.expression()        
            
        val Dot = ctx.Dot()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitIndexerExpression(ctx: PhpParser.IndexerExpressionContext): AstNode {
        
        val OpenSquareBracket = ctx.OpenSquareBracket()        
            
        val CloseSquareBracket = ctx.CloseSquareBracket()        
            
        val stringConstant = ctx.stringConstant()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitScalarExpression(ctx: PhpParser.ScalarExpressionContext): AstNode {
        
        val Label = ctx.Label()        
            
        val constant = ctx.constant()        
            
        val string = ctx.string()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitPrefixIncDecExpression(ctx: PhpParser.PrefixIncDecExpressionContext): AstNode {
        
        val Inc = ctx.Inc()        
            
        val chain = ctx.chain()        
            
        val Dec = ctx.Dec()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitComparisonExpression(ctx: PhpParser.ComparisonExpressionContext): AstNode {
        
        val Less = ctx.Less()        
            
        val Greater = ctx.Greater()        
            
        val IsEqual = ctx.IsEqual()        
            
        val IsNotEq = ctx.IsNotEq()        
            
        val ShiftLeft = ctx.ShiftLeft()        
            
        val ShiftRight = ctx.ShiftRight()        
            
        val IsSmallerOrEqual = ctx.IsSmallerOrEqual()        
            
        val IsGreaterOrEqual = ctx.IsGreaterOrEqual()        
            
        val IsIdentical = ctx.IsIdentical()        
            
        val IsNoidentical = ctx.IsNoidentical()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitCastExpression(ctx: PhpParser.CastExpressionContext): AstNode {
        
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val castOperation = ctx.castOperation()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitInstanceOfExpression(ctx: PhpParser.InstanceOfExpressionContext): AstNode {
        
        val typeRef = ctx.typeRef()        
            
        val InstanceOf = ctx.InstanceOf()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitLambdaFunctionExpression(ctx: PhpParser.LambdaFunctionExpressionContext): AstNode {
        
        val lambdaFunctionExpr = ctx.lambdaFunctionExpr()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitBitwiseExpression(ctx: PhpParser.BitwiseExpressionContext): AstNode {
        
        val Pipe = ctx.Pipe()        
            
        val Ampersand = ctx.Ampersand()        
            
        val BooleanAnd = ctx.BooleanAnd()        
            
        val BooleanOr = ctx.BooleanOr()        
            
        val expression = ctx.expression()        
            
        val Caret = ctx.Caret()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitAssignable(ctx: PhpParser.AssignableContext): AstNode {
        
        val chain = ctx.chain()        
            
        val arrayCreation = ctx.arrayCreation()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitArrayCreation(ctx: PhpParser.ArrayCreationContext): AstNode {
        
        val Array = ctx.Array()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val OpenSquareBracket = ctx.OpenSquareBracket()        
            
        val CloseSquareBracket = ctx.CloseSquareBracket()        
            
        val arrayItemList = ctx.arrayItemList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitLambdaFunctionExpr(ctx: PhpParser.LambdaFunctionExprContext): AstNode {
        
        val typeHint = ctx.typeHint()        
            
        val Colon = ctx.Colon()        
            
        val LambdaFn = ctx.LambdaFn()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val Ampersand = ctx.Ampersand()        
            
        val lambdaFunctionUseVars = ctx.lambdaFunctionUseVars()        
            
        val DoubleArrow = ctx.DoubleArrow()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val Function_ = ctx.Function_()        
            
        val formalParameterList = ctx.formalParameterList()        
            
        val blockStatement = ctx.blockStatement()        
            
        val expression = ctx.expression()        
            
        val Static = ctx.Static()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitMatchExpr(ctx: PhpParser.MatchExprContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val Match_ = ctx.Match_()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val matchItem = ctx.matchItem()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitMatchItem(ctx: PhpParser.MatchItemContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val DoubleArrow = ctx.DoubleArrow()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitNewExpr(ctx: PhpParser.NewExprContext): AstNode {
        
        val typeRef = ctx.typeRef()        
            
        val New = ctx.New()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val arguments = ctx.arguments()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitAssignmentOperator(ctx: PhpParser.AssignmentOperatorContext): AstNode {
        
        val Eq = ctx.Eq()        
            
        val DivEqual = ctx.DivEqual()        
            
        val PowEqual = ctx.PowEqual()        
            
        val MulEqual = ctx.MulEqual()        
            
        val ModEqual = ctx.ModEqual()        
            
        val AndEqual = ctx.AndEqual()        
            
        val OrEqual = ctx.OrEqual()        
            
        val XorEqual = ctx.XorEqual()        
            
        val PlusEqual = ctx.PlusEqual()        
            
        val MinusEqual = ctx.MinusEqual()        
            
        val Concaequal = ctx.Concaequal()        
            
        val ShiftLeftEqual = ctx.ShiftLeftEqual()        
            
        val ShiftRightEqual = ctx.ShiftRightEqual()        
            
        val NullCoalescingEqual = ctx.NullCoalescingEqual()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitYieldExpression(ctx: PhpParser.YieldExpressionContext): AstNode {
        
        val Yield = ctx.Yield()        
            
        val From = ctx.From()        
            
        val DoubleArrow = ctx.DoubleArrow()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitArrayItemList(ctx: PhpParser.ArrayItemListContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val arrayItem = ctx.arrayItem()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitArrayItem(ctx: PhpParser.ArrayItemContext): AstNode {
        
        val chain = ctx.chain()        
            
        val Ampersand = ctx.Ampersand()        
            
        val DoubleArrow = ctx.DoubleArrow()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitLambdaFunctionUseVars(ctx: PhpParser.LambdaFunctionUseVarsContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val Use = ctx.Use()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val lambdaFunctionUseVar = ctx.lambdaFunctionUseVar()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitLambdaFunctionUseVar(ctx: PhpParser.LambdaFunctionUseVarContext): AstNode {
        
        val VarName = ctx.VarName()        
            
        val Ampersand = ctx.Ampersand()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitQualifiedStaticTypeRef(ctx: PhpParser.QualifiedStaticTypeRefContext): AstNode {
        
        val qualifiedNamespaceName = ctx.qualifiedNamespaceName()        
            
        val genericDynamicArgs = ctx.genericDynamicArgs()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val Static = ctx.Static()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitTypeRef(ctx: PhpParser.TypeRefContext): AstNode {
        
        val qualifiedNamespaceName = ctx.qualifiedNamespaceName()        
            
        val genericDynamicArgs = ctx.genericDynamicArgs()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val indirectTypeRef = ctx.indirectTypeRef()        
            
        val anonymousClass = ctx.anonymousClass()        
            
        val Static = ctx.Static()        
            
        val primitiveType = ctx.primitiveType()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitAnonymousClass(ctx: PhpParser.AnonymousClassContext): AstNode {
        
        val typeParameterListInBrackets = ctx.typeParameterListInBrackets()        
            
        val Private = ctx.Private()        
            
        val Extends = ctx.Extends()        
            
        val Partial = ctx.Partial()        
            
        val modifier = ctx.modifier()        
            
        val qualifiedStaticTypeRef = ctx.qualifiedStaticTypeRef()        
            
        val identifier = ctx.identifier()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val attributes = ctx.attributes()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val interfaceList = ctx.interfaceList()        
            
        val Implements = ctx.Implements()        
            
        val classStatement = ctx.classStatement()        
            
        val classEntryType = ctx.classEntryType()        
            
        val Interface = ctx.Interface()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitIndirectTypeRef(ctx: PhpParser.IndirectTypeRefContext): AstNode {
        
        val getRuleIndex = ctx.getRuleIndex()        
            
        val chainBase = ctx.chainBase()        
            
        val ObjectOperator = ctx.ObjectOperator()        
            
        val keyedFieldName = ctx.keyedFieldName()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitQualifiedNamespaceName(ctx: PhpParser.QualifiedNamespaceNameContext): AstNode {
        
        val Namespace = ctx.Namespace()        
            
        val namespaceNameList = ctx.namespaceNameList()        
            
        val NamespaceSeparator = ctx.NamespaceSeparator()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitNamespaceNameList(ctx: PhpParser.NamespaceNameListContext): AstNode {
        
        val identifier = ctx.identifier()        
            
        val NamespaceSeparator = ctx.NamespaceSeparator()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val namespaceNameTail = ctx.namespaceNameTail()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitNamespaceNameTail(ctx: PhpParser.NamespaceNameTailContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val As = ctx.As()        
            
        val identifier = ctx.identifier()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val namespaceNameTail = ctx.namespaceNameTail()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitQualifiedNamespaceNameList(ctx: PhpParser.QualifiedNamespaceNameListContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val qualifiedNamespaceName = ctx.qualifiedNamespaceName()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitArguments(ctx: PhpParser.ArgumentsContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val yieldExpression = ctx.yieldExpression()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val actualArgument = ctx.actualArgument()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitActualArgument(ctx: PhpParser.ActualArgumentContext): AstNode {
        
        val Ellipsis = ctx.Ellipsis()        
            
        val chain = ctx.chain()        
            
        val Ampersand = ctx.Ampersand()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val argumentName = ctx.argumentName()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitArgumentName(ctx: PhpParser.ArgumentNameContext): AstNode {
        
        val Colon = ctx.Colon()        
            
        val identifier = ctx.identifier()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitConstantInitializer(ctx: PhpParser.ConstantInitializerContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val Plus = ctx.Plus()        
            
        val Minus = ctx.Minus()        
            
        val Array = ctx.Array()        
            
        val constantInitializer = ctx.constantInitializer()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val OpenSquareBracket = ctx.OpenSquareBracket()        
            
        val CloseSquareBracket = ctx.CloseSquareBracket()        
            
        val arrayItemList = ctx.arrayItemList()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val constant = ctx.constant()        
            
        val string = ctx.string()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitConstant(ctx: PhpParser.ConstantContext): AstNode {
        
        val qualifiedNamespaceName = ctx.qualifiedNamespaceName()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val literalConstant = ctx.literalConstant()        
            
        val magicConstant = ctx.magicConstant()        
            
        val classConstant = ctx.classConstant()        
            
        val Null = ctx.Null()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitLiteralConstant(ctx: PhpParser.LiteralConstantContext): AstNode {
        
        val Real = ctx.Real()        
            
        val stringConstant = ctx.stringConstant()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val BooleanConstant = ctx.BooleanConstant()        
            
        val numericConstant = ctx.numericConstant()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitNumericConstant(ctx: PhpParser.NumericConstantContext): AstNode {
        
        val Hex = ctx.Hex()        
            
        val Decimal = ctx.Decimal()        
            
        val Octal = ctx.Octal()        
            
        val Binary = ctx.Binary()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitClassConstant(ctx: PhpParser.ClassConstantContext): AstNode {
        
        val Class = ctx.Class()        
            
        val Get = ctx.Get()        
            
        val Set = ctx.Set()        
            
        val Parent_ = ctx.Parent_()        
            
        val qualifiedStaticTypeRef = ctx.qualifiedStaticTypeRef()        
            
        val identifier = ctx.identifier()        
            
        val DoubleColon = ctx.DoubleColon()        
            
        val keyedVariable = ctx.keyedVariable()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val Constructor = ctx.Constructor()        
            
        val string = ctx.string()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitStringConstant(ctx: PhpParser.StringConstantContext): AstNode {
        
        val Label = ctx.Label()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitString(ctx: PhpParser.StringContext): AstNode {
        
        val StartHereDoc = ctx.StartHereDoc()        
            
        val HereDocText = ctx.HereDocText()        
            
        val StartNowDoc = ctx.StartNowDoc()        
            
        val SingleQuoteString = ctx.SingleQuoteString()        
            
        val DoubleQuote = ctx.DoubleQuote()        
            
        val interpolatedStringPart = ctx.interpolatedStringPart()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitInterpolatedStringPart(ctx: PhpParser.InterpolatedStringPartContext): AstNode {
        
        val chain = ctx.chain()        
            
        val StringPart = ctx.StringPart()        
            
        val UnicodeEscape = ctx.UnicodeEscape()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitChainList(ctx: PhpParser.ChainListContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val chain = ctx.chain()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitChain(ctx: PhpParser.ChainContext): AstNode {
        
        val chainOrigin = ctx.chainOrigin()        
            
        val memberAccess = ctx.memberAccess()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitChainOrigin(ctx: PhpParser.ChainOriginContext): AstNode {
        
        val newExpr = ctx.newExpr()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val functionCall = ctx.functionCall()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val chainBase = ctx.chainBase()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitMemberAccess(ctx: PhpParser.MemberAccessContext): AstNode {
        
        val actualArguments = ctx.actualArguments()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val ObjectOperator = ctx.ObjectOperator()        
            
        val keyedFieldName = ctx.keyedFieldName()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitFunctionCall(ctx: PhpParser.FunctionCallContext): AstNode {
        
        val actualArguments = ctx.actualArguments()        
            
        val functionCallName = ctx.functionCallName()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitFunctionCallName(ctx: PhpParser.FunctionCallNameContext): AstNode {
        
        val parentheses = ctx.parentheses()        
            
        val qualifiedNamespaceName = ctx.qualifiedNamespaceName()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val chainBase = ctx.chainBase()        
            
        val classConstant = ctx.classConstant()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitActualArguments(ctx: PhpParser.ActualArgumentsContext): AstNode {
        
        val genericDynamicArgs = ctx.genericDynamicArgs()        
            
        val squareCurlyExpression = ctx.squareCurlyExpression()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val arguments = ctx.arguments()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitChainBase(ctx: PhpParser.ChainBaseContext): AstNode {
        
        val qualifiedStaticTypeRef = ctx.qualifiedStaticTypeRef()        
            
        val DoubleColon = ctx.DoubleColon()        
            
        val keyedVariable = ctx.keyedVariable()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitKeyedFieldName(ctx: PhpParser.KeyedFieldNameContext): AstNode {
        
        val keyedVariable = ctx.keyedVariable()        
            
        val keyedSimpleFieldName = ctx.keyedSimpleFieldName()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitKeyedSimpleFieldName(ctx: PhpParser.KeyedSimpleFieldNameContext): AstNode {
        
        val identifier = ctx.identifier()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val squareCurlyExpression = ctx.squareCurlyExpression()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitKeyedVariable(ctx: PhpParser.KeyedVariableContext): AstNode {
        
        val VarName = ctx.VarName()        
            
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val squareCurlyExpression = ctx.squareCurlyExpression()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
        val Dollar = ctx.Dollar()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitSquareCurlyExpression(ctx: PhpParser.SquareCurlyExpressionContext): AstNode {
        
        val CloseCurlyBracket = ctx.CloseCurlyBracket()        
            
        val OpenCurlyBracket = ctx.OpenCurlyBracket()        
            
        val OpenSquareBracket = ctx.OpenSquareBracket()        
            
        val CloseSquareBracket = ctx.CloseSquareBracket()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val expression = ctx.expression()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitAssignmentList(ctx: PhpParser.AssignmentListContext): AstNode {
        
        val Comma = ctx.Comma()        
            
        val assignmentListElement = ctx.assignmentListElement()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitAssignmentListElement(ctx: PhpParser.AssignmentListElementContext): AstNode {
        
        val chain = ctx.chain()        
            
        val List = ctx.List()        
            
        val OpenRoundBracket = ctx.OpenRoundBracket()        
            
        val assignmentList = ctx.assignmentList()        
            
        val CloseRoundBracket = ctx.CloseRoundBracket()        
            
        val arrayItem = ctx.arrayItem()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitModifier(ctx: PhpParser.ModifierContext): AstNode {
        
        val Final = ctx.Final()        
            
        val Abstract = ctx.Abstract()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitIdentifier(ctx: PhpParser.IdentifierContext): AstNode {
        
        val Default = ctx.Default()        
            
        val ElseIf = ctx.ElseIf()        
            
        val IsSet = ctx.IsSet()        
            
        val Empty = ctx.Empty()        
            
        val Yield = ctx.Yield()        
            
        val Eval = ctx.Eval()        
            
        val Throw = ctx.Throw()        
            
        val Const = ctx.Const()        
            
        val Require = ctx.Require()        
            
        val Include = ctx.Include()        
            
        val Exit = ctx.Exit()        
            
        val Use = ctx.Use()        
            
        val Echo = ctx.Echo()        
            
        val Callable = ctx.Callable()        
            
        val Import = ctx.Import()        
            
        val Print = ctx.Print()        
            
        val Global = ctx.Global()        
            
        val Clone = ctx.Clone()        
            
        val Array = ctx.Array()        
            
        val Label = ctx.Label()        
            
        val New = ctx.New()        
            
        val From = ctx.From()        
            
        val List = ctx.List()        
            
        val Trait = ctx.Trait()        
            
        val Switch = ctx.Switch()        
            
        val Unset = ctx.Unset()        
            
        val If = ctx.If()        
            
        val EndIf = ctx.EndIf()        
            
        val EndFor = ctx.EndFor()        
            
        val Try = ctx.Try()        
            
        val Class = ctx.Class()        
            
        val For = ctx.For()        
            
        val Case = ctx.Case()        
            
        val Break = ctx.Break()        
            
        val Continue = ctx.Continue()        
            
        val Return = ctx.Return()        
            
        val Foreach = ctx.Foreach()        
            
        val As = ctx.As()        
            
        val Catch = ctx.Catch()        
            
        val Finally = ctx.Finally()        
            
        val Goto = ctx.Goto()        
            
        val Get = ctx.Get()        
            
        val Set = ctx.Set()        
            
        val Parent_ = ctx.Parent_()        
            
        val Final = ctx.Final()        
            
        val BoolType = ctx.BoolType()        
            
        val Abstract = ctx.Abstract()        
            
        val Int8Cast = ctx.Int8Cast()        
            
        val IntType = ctx.IntType()        
            
        val Public = ctx.Public()        
            
        val Resource = ctx.Resource()        
            
        val Typeof = ctx.Typeof()        
            
        val UintCast = ctx.UintCast()        
            
        val Call = ctx.Call()        
            
        val Destruct = ctx.Destruct()        
            
        val Wakeup = ctx.Wakeup()        
            
        val Sleep = ctx.Sleep()        
            
        val Autoload = ctx.Autoload()        
            
        val IsSet__ = ctx.IsSet__()        
            
        val Unset__ = ctx.Unset__()        
            
        val Invoke = ctx.Invoke()        
            
        val SetState = ctx.SetState()        
            
        val Clone__ = ctx.Clone__()        
            
        val Class__ = ctx.Class__()        
            
        val Traic__ = ctx.Traic__()        
            
        val Method__ = ctx.Method__()        
            
        val Line__ = ctx.Line__()        
            
        val File__ = ctx.File__()        
            
        val Dir__ = ctx.Dir__()        
            
        val Private = ctx.Private()        
            
        val Extends = ctx.Extends()        
            
        val Partial = ctx.Partial()        
            
        val Else = ctx.Else()        
            
        val Declare = ctx.Declare()        
            
        val Var = ctx.Var()        
            
        val While = ctx.While()        
            
        val Do = ctx.Do()        
            
        val EndWhile = ctx.EndWhile()        
            
        val Namespace = ctx.Namespace()        
            
        val IncludeOnce = ctx.IncludeOnce()        
            
        val RequireOnce = ctx.RequireOnce()        
            
        val InstanceOf = ctx.InstanceOf()        
            
        val EndSwitch = ctx.EndSwitch()        
            
        val EndForeach = ctx.EndForeach()        
            
        val BinaryCast = ctx.BinaryCast()        
            
        val DoubleCast = ctx.DoubleCast()        
            
        val DoubleType = ctx.DoubleType()        
            
        val FloatCast = ctx.FloatCast()        
            
        val Int16Cast = ctx.Int16Cast()        
            
        val Int64Type = ctx.Int64Type()        
            
        val ObjectType = ctx.ObjectType()        
            
        val Protected = ctx.Protected()        
            
        val StringType = ctx.StringType()        
            
        val UnicodeCast = ctx.UnicodeCast()        
            
        val CallStatic = ctx.CallStatic()        
            
        val ToString__ = ctx.ToString__()        
            
        val DebugInfo = ctx.DebugInfo()        
            
        val Namespace__ = ctx.Namespace__()        
            
        val Function__ = ctx.Function__()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val Function_ = ctx.Function_()        
            
        val LogicalAnd = ctx.LogicalAnd()        
            
        val LogicalXor = ctx.LogicalXor()        
            
        val LogicalOr = ctx.LogicalOr()        
            
        val BooleanConstant = ctx.BooleanConstant()        
            
        val EndDeclare = ctx.EndDeclare()        
            
        val Implements = ctx.Implements()        
            
        val InsteadOf = ctx.InsteadOf()        
            
        val Null = ctx.Null()        
            
        val Constructor = ctx.Constructor()        
            
        val Interface = ctx.Interface()        
            
        val Static = ctx.Static()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitMemberModifier(ctx: PhpParser.MemberModifierContext): AstNode {
        
        val Final = ctx.Final()        
            
        val Abstract = ctx.Abstract()        
            
        val Public = ctx.Public()        
            
        val Private = ctx.Private()        
            
        val Protected = ctx.Protected()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val Static = ctx.Static()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitMagicConstant(ctx: PhpParser.MagicConstantContext): AstNode {
        
        val Class__ = ctx.Class__()        
            
        val Traic__ = ctx.Traic__()        
            
        val Method__ = ctx.Method__()        
            
        val Line__ = ctx.Line__()        
            
        val File__ = ctx.File__()        
            
        val Dir__ = ctx.Dir__()        
            
        val Namespace__ = ctx.Namespace__()        
            
        val Function__ = ctx.Function__()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitMagicMethod(ctx: PhpParser.MagicMethodContext): AstNode {
        
        val Get = ctx.Get()        
            
        val Set = ctx.Set()        
            
        val Call = ctx.Call()        
            
        val Destruct = ctx.Destruct()        
            
        val Wakeup = ctx.Wakeup()        
            
        val Sleep = ctx.Sleep()        
            
        val Autoload = ctx.Autoload()        
            
        val IsSet__ = ctx.IsSet__()        
            
        val Unset__ = ctx.Unset__()        
            
        val Invoke = ctx.Invoke()        
            
        val SetState = ctx.SetState()        
            
        val Clone__ = ctx.Clone__()        
            
        val CallStatic = ctx.CallStatic()        
            
        val ToString__ = ctx.ToString__()        
            
        val DebugInfo = ctx.DebugInfo()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
        val Constructor = ctx.Constructor()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitPrimitiveType(ctx: PhpParser.PrimitiveTypeContext): AstNode {
        
        val Array = ctx.Array()        
            
        val BoolType = ctx.BoolType()        
            
        val IntType = ctx.IntType()        
            
        val Resource = ctx.Resource()        
            
        val DoubleType = ctx.DoubleType()        
            
        val Int64Type = ctx.Int64Type()        
            
        val ObjectType = ctx.ObjectType()        
            
        val StringType = ctx.StringType()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
            
    override fun visitCastOperation(ctx: PhpParser.CastOperationContext): AstNode {
        
        val Array = ctx.Array()        
            
        val Unset = ctx.Unset()        
            
        val BoolType = ctx.BoolType()        
            
        val Int8Cast = ctx.Int8Cast()        
            
        val IntType = ctx.IntType()        
            
        val Resource = ctx.Resource()        
            
        val UintCast = ctx.UintCast()        
            
        val BinaryCast = ctx.BinaryCast()        
            
        val DoubleCast = ctx.DoubleCast()        
            
        val DoubleType = ctx.DoubleType()        
            
        val FloatCast = ctx.FloatCast()        
            
        val Int16Cast = ctx.Int16Cast()        
            
        val Int64Type = ctx.Int64Type()        
            
        val ObjectType = ctx.ObjectType()        
            
        val StringType = ctx.StringType()        
            
        val UnicodeCast = ctx.UnicodeCast()        
            
        val getRuleIndex = ctx.getRuleIndex()        
            
            
        TODO("Not yet implemented")
    }
        
}
