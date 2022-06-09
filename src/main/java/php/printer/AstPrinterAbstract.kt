package php.printer

import php.ast.*
import kotlin.reflect.KClass

abstract class AstPrinterAbstract {
    protected var indentLevel = 0
    protected val nl get() = "\n" + "    ".repeat(indentLevel)
    protected val docStringEndToken: String = "_DOC_STRING_END_" + Math.random()
    protected var canUseSemicolonNamespaces: Boolean = false

    protected fun getPrecedence(node: Node): Pair<Int, Int>? {
        return when (node) {
            // Pair(precedence, associativity)
            // where for precedence -1 is %left, 0 is %nonassoc and 1 is %right
            is ExprBinaryOpPow -> Pair(0, 1)
            is ExprBitwiseNot -> Pair(10, 1)
            is ExprPreInc -> Pair(10, 1)
            is ExprPreDec -> Pair(10, 1)
            is ExprPostInc -> Pair(10, -1)
            is ExprPostDec -> Pair(10, -1)
            is ExprUnaryPlus -> Pair(10, 1)
            is ExprUnaryMinus -> Pair(10, 1)
            is ExprCastInt -> Pair(10, 1)
            is ExprCastDouble -> Pair(10, 1)
            is ExprCastString -> Pair(10, 1)
            is ExprCastArray -> Pair(10, 1)
            is ExprCastObject -> Pair(10, 1)
            is ExprCastBool -> Pair(10, 1)
            is ExprCastUnset -> Pair(10, 1)
            is ExprErrorSuppress -> Pair(10, 1)
            is ExprInstanceof -> Pair(20, 0)
            is ExprBooleanNot -> Pair(30, 1)
            is ExprBinaryOpMul -> Pair(40, -1)
            is ExprBinaryOpDiv -> Pair(40, -1)
            is ExprBinaryOpMod -> Pair(40, -1)
            is ExprBinaryOpPlus -> Pair(50, -1)
            is ExprBinaryOpMinus -> Pair(50, -1)
            is ExprBinaryOpConcat -> Pair(50, -1)
            is ExprBinaryOpShiftLeft -> Pair(60, -1)
            is ExprBinaryOpShiftRight -> Pair(60, -1)
            is ExprBinaryOpSmaller -> Pair(70, 0)
            is ExprBinaryOpSmallerOrEqual -> Pair(70, 0)
            is ExprBinaryOpGreater -> Pair(70, 0)
            is ExprBinaryOpGreaterOrEqual -> Pair(70, 0)
            is ExprBinaryOpEqual -> Pair(80, 0)
            is ExprBinaryOpNotEqual -> Pair(80, 0)
            is ExprBinaryOpIdentical -> Pair(80, 0)
            is ExprBinaryOpNotIdentical -> Pair(80, 0)
            is ExprBinaryOpSpaceship -> Pair(80, 0)
            is ExprBinaryOpBitwiseAnd -> Pair(90, -1)
            is ExprBinaryOpBitwiseXor -> Pair(100, -1)
            is ExprBinaryOpBitwiseOr -> Pair(110, -1)
            is ExprBinaryOpBooleanAnd -> Pair(120, -1)
            is ExprBinaryOpBooleanOr -> Pair(130, -1)
            is ExprBinaryOpCoalesce -> Pair(140, 1)
            is ExprTernary -> Pair(150, 0)
            // parser uses %left for assignments, but they really behave as %right
            is ExprAssign -> Pair(160, 1)
            is ExprAssignRef -> Pair(160, 1)
            is ExprAssignOpPlus -> Pair(160, 1)
            is ExprAssignOpMinus -> Pair(160, 1)
            is ExprAssignOpMul -> Pair(160, 1)
            is ExprAssignOpDiv -> Pair(160, 1)
            is ExprAssignOpConcat -> Pair(160, 1)
            is ExprAssignOpMod -> Pair(160, 1)
            is ExprAssignOpBitwiseAnd -> Pair(160, 1)
            is ExprAssignOpBitwiseOr -> Pair(160, 1)
            is ExprAssignOpBitwiseXor -> Pair(160, 1)
            is ExprAssignOpShiftLeft -> Pair(160, 1)
            is ExprAssignOpShiftRight -> Pair(160, 1)
            is ExprAssignOpPow -> Pair(160, 1)
            is ExprYieldFrom -> Pair(165, 1)
            is ExprPrint -> Pair(168, 1)
            is ExprBinaryOpLogicalAnd -> Pair(170, -1)
            is ExprBinaryOpLogicalXor -> Pair(180, -1)
            is ExprBinaryOpLogicalOr -> Pair(190, -1)
            is ExprInclude -> Pair(200, -1)
            else -> null
        }
    }


    fun prettyPrint(stmts: List<Stmt>): String {
        resetState()
        preprocessNodes(stmts)

        return ltrim(handleMagicTokens(pStmts(stmts, false)))
    }

    fun prettyPrintFile(stmts: List<Stmt>): String {
        if (stmts.isEmpty()) {
            return "<?php\n\n";
        }

        var code = "<?php\n" + prettyPrint(stmts)

        if (stmts.first() is StmtInlineHTML) {
            code = code.replace(Regex("/^<\\?php\\s+\\?>\\n?/"), "")
        }
        if (stmts.last() is StmtInlineHTML) {
            code = code.replace(Regex("/<\\?php\$/"), "")
        }

        return code
    }

    protected fun ltrim(string: String): String {
        // todo
        return string
    }

    protected fun resetState() {
        indentLevel = 0
    }

    protected fun preprocessNodes(nodes: List<Stmt>) {
        canUseSemicolonNamespaces = nodes.none { it is StmtNamespace && it.name == null }
    }

    protected fun handleMagicTokens(string: String): String {
        return string.replace("$docStringEndToken;\n", ";\n")
            .replace(docStringEndToken, "\n")
    }
    
    protected fun pInfixOp(parentNode: Expr, leftNode: Node, operatorString: String, rightNode: Node): String {
        return pPrec(parentNode, leftNode, -1) + operatorString + pPrec(parentNode, rightNode, 1)
    }

    protected fun pPrefixOp(parentNode: Expr, operatorString: String, node: Node): String {
        return operatorString + pPrec(parentNode, node, 1)
    }

    protected fun pPostfixOp(parentNode: Expr, node: Node, operatorString: String): String {
        return pPrec(parentNode, node, -1) + operatorString
    }

    protected fun pPrec(parentNode: Expr, node: Node, childPosition: Int): String {
        val (parentPrecedence, parentAssociativity) = getPrecedence(parentNode)!!
        getPrecedence(node)?.let { (childPrecedence, _) ->
            if (childPrecedence > parentPrecedence || (childPrecedence == parentPrecedence && parentAssociativity != childPosition)) {
                return "(" + p(node) + ")"
            }
        }

        return p(node)
    }

    protected fun pCommaSeparatedOfNullable(nodes: List<Node?>): String {
        return pList(nodes, ", ") { if (it == null) "" else p(it) }
    }


    protected fun pComments(comments: List<Any>): String {
        TODO()
    }

    protected abstract fun p(node: Node): String

    protected fun callLhsRequiresParens(node: Node): Boolean {
        return !(node is Name
                || node is ExprVariable
                || node is ExprArrayDimFetch
                || node is ExprFuncCall
                || node is ExprMethodCall
                || node is ExprStaticCall
                || node is ExprArray)
    }

    protected fun dereferenceLhsRequiresParens(node: Node): Boolean {
        return !(node is ExprVariable
                || node is Name
                || node is ExprArrayDimFetch
                || node is ExprPropertyFetch
                || node is ExprStaticPropertyFetch
                || node is ExprFuncCall
                || node is ExprMethodCall
                || node is ExprStaticCall
                || node is ExprArray
                || node is ScalarString
                || node is ExprConstFetch
                || node is ExprClassConstFetch)
    }

    protected fun pModifiers(modifiers: Int, spaceSuffix: Boolean = true): String {
        val modifierNames = listOf(
            Modifier.PUBLIC,
            Modifier.PROTECTED,
            Modifier.PRIVATE,
            Modifier.STATIC,
            Modifier.ABSTRACT,
            Modifier.FINAL,
        )
            .filter { it.match(modifiers) }
            .map { it.name.lowercase() }

        return if (modifierNames.isEmpty()) {
            ""
        } else if (spaceSuffix) {
            modifierNames.joinToString(" ") + " "
        } else {
            modifierNames.joinToString(" ")
        }
    }

    ////////////////////
    // helpers
    ////////////////////
    protected fun <T> pList(
        list: List<T>,
        separator: String = "",
        indent: Boolean = false,
        transform: (T) -> String
    ): String {
        if (indent) {
            indentLevel++
        }

        val result = list.joinToString(separator, transform = transform)

        if (indent) {
            indentLevel--
        }

        return result
    }

    protected fun <T : Node> pList(list: List<T>, separator: String = ""): String {
        return pList(list, separator) { p(it) }
    }

    protected fun <T : Node> pCommaSeparated(nodes: List<T>, transform: (T) -> String = { p(it) }): String {
        return pList(nodes, ", ", transform = transform)
    }

    protected fun pStmts(nodes: List<Stmt>, indent: Boolean = true): String {
        return pList(nodes, indent = indent) { nl + p(it) }
    }

}