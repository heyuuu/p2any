package php.printer

import php.ast.*

abstract class AstPrinterAbstract {
    companion object {
        private val precedenceMap = mapOf(
            // Pair(precedence, associativity)
            // where for precedence -1 is %left, 0 is %nonassoc and 1 is %right
            ExprBinaryOpPow::class to Pair(0, 1),
            ExprBitwiseNot::class to Pair(10, 1),
            ExprPreInc::class to Pair(10, 1),
            ExprPreDec::class to Pair(10, 1),
            ExprPostInc::class to Pair(10, -1),
            ExprPostDec::class to Pair(10, -1),
            ExprUnaryPlus::class to Pair(10, 1),
            ExprUnaryMinus::class to Pair(10, 1),
            ExprCastInt::class to Pair(10, 1),
            ExprCastDouble::class to Pair(10, 1),
            ExprCastString::class to Pair(10, 1),
            ExprCastArray::class to Pair(10, 1),
            ExprCastObject::class to Pair(10, 1),
            ExprCastBool::class to Pair(10, 1),
            ExprCastUnset::class to Pair(10, 1),
            ExprErrorSuppress::class to Pair(10, 1),
            ExprInstanceof::class to Pair(20, 0),
            ExprBooleanNot::class to Pair(30, 1),
            ExprBinaryOpMul::class to Pair(40, -1),
            ExprBinaryOpDiv::class to Pair(40, -1),
            ExprBinaryOpMod::class to Pair(40, -1),
            ExprBinaryOpPlus::class to Pair(50, -1),
            ExprBinaryOpMinus::class to Pair(50, -1),
            ExprBinaryOpConcat::class to Pair(50, -1),
            ExprBinaryOpShiftLeft::class to Pair(60, -1),
            ExprBinaryOpShiftRight::class to Pair(60, -1),
            ExprBinaryOpSmaller::class to Pair(70, 0),
            ExprBinaryOpSmallerOrEqual::class to Pair(70, 0),
            ExprBinaryOpGreater::class to Pair(70, 0),
            ExprBinaryOpGreaterOrEqual::class to Pair(70, 0),
            ExprBinaryOpEqual::class to Pair(80, 0),
            ExprBinaryOpNotEqual::class to Pair(80, 0),
            ExprBinaryOpIdentical::class to Pair(80, 0),
            ExprBinaryOpNotIdentical::class to Pair(80, 0),
            ExprBinaryOpSpaceship::class to Pair(80, 0),
            ExprBinaryOpBitwiseAnd::class to Pair(90, -1),
            ExprBinaryOpBitwiseXor::class to Pair(100, -1),
            ExprBinaryOpBitwiseOr::class to Pair(110, -1),
            ExprBinaryOpBooleanAnd::class to Pair(120, -1),
            ExprBinaryOpBooleanOr::class to Pair(130, -1),
            ExprBinaryOpCoalesce::class to Pair(140, 1),
            ExprTernary::class to Pair(150, 0),
            // parser uses %left for assignments, but they really behave as %right
            ExprAssign::class to Pair(160, 1),
            ExprAssignRef::class to Pair(160, 1),
            ExprAssignOpPlus::class to Pair(160, 1),
            ExprAssignOpMinus::class to Pair(160, 1),
            ExprAssignOpMul::class to Pair(160, 1),
            ExprAssignOpDiv::class to Pair(160, 1),
            ExprAssignOpConcat::class to Pair(160, 1),
            ExprAssignOpMod::class to Pair(160, 1),
            ExprAssignOpBitwiseAnd::class to Pair(160, 1),
            ExprAssignOpBitwiseOr::class to Pair(160, 1),
            ExprAssignOpBitwiseXor::class to Pair(160, 1),
            ExprAssignOpShiftLeft::class to Pair(160, 1),
            ExprAssignOpShiftRight::class to Pair(160, 1),
            ExprAssignOpPow::class to Pair(160, 1),
            ExprYieldFrom::class to Pair(165, 1),
            ExprPrint::class to Pair(168, 1),
            ExprBinaryOpLogicalAnd::class to Pair(170, -1),
            ExprBinaryOpLogicalXor::class to Pair(180, -1),
            ExprBinaryOpLogicalOr::class to Pair(190, -1),
            ExprInclude::class to Pair(200, -1),
        )
    }

    protected var indentLevel = 0
    protected val nl get() = "\n" + "    ".repeat(indentLevel)
    protected val docStringEndToken: String = "_DOC_STRING_END_" + Math.random()
    protected var canUseSemicolonNamespaces: Boolean = false

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
        val (parentPrecedence, parentAssociativity) = precedenceMap[parentNode::class]!!
        if (precedenceMap.containsKey(node::class)) {
            val (childPrecedence, _) = precedenceMap[node::class]!!
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