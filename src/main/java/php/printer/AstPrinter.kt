package php.printer

import php.ast.*

class AstPrinter : AstPrinterAbstract() {
    override fun p(node: Node): String {
        return when (node) {
            is Arg -> pArg(node)
            is Const -> pConst(node)
            is ExprArray -> pExprArray(node)
            is ExprArrayDimFetch -> pExprArrayDimFetch(node)
            is ExprArrayItem -> pExprArrayItem(node)
            is ExprAssign -> pExprAssign(node)
            is ExprAssignOp -> pExprAssignOp(node)
            is ExprAssignRef -> pExprAssignRef(node)
            is ExprBinaryOp -> pExprBinaryOp(node)
            is ExprBitwiseNot -> pExprBitwiseNot(node)
            is ExprBooleanNot -> pExprBooleanNot(node)
            is ExprCast -> pExprCast(node)
            is ExprClassConstFetch -> pExprClassConstFetch(node)
            is ExprClone -> pExprClone(node)
            is ExprClosure -> pExprClosure(node)
            is ExprClosureUse -> pExprClosureUse(node)
            is ExprConstFetch -> pExprConstFetch(node)
            is ExprEmpty -> pExprEmpty(node)
            is ExprErrorSuppress -> pExprErrorSuppress(node)
            is ExprExit -> pExprExit(node)
            is ExprFuncCall -> pExprFuncCall(node)
            is ExprInclude -> pExprInclude(node)
            is ExprInstanceof -> pExprInstanceof(node)
            is ExprIsset -> pExprIsset(node)
            is ExprList -> pExprList(node)
            is ExprMethodCall -> pExprMethodCall(node)
            is ExprNew -> pExprNew(node)
            is ExprPostDec -> pExprPostDec(node)
            is ExprPostInc -> pExprPostInc(node)
            is ExprPreDec -> pExprPreDec(node)
            is ExprPreInc -> pExprPreInc(node)
            is ExprPrint -> pExprPrint(node)
            is ExprPropertyFetch -> pExprPropertyFetch(node)
            is ExprStaticCall -> pExprStaticCall(node)
            is ExprStaticPropertyFetch -> pExprStaticPropertyFetch(node)
            is ExprTernary -> pExprTernary(node)
            is ExprThrow -> pExprThrow(node)
            is ExprUnaryMinus -> pExprUnaryMinus(node)
            is ExprUnaryPlus -> pExprUnaryPlus(node)
            is ExprVariable -> pExprVariable(node)
            is ExprYield -> pExprYield(node)
            is ExprYieldFrom -> pExprYieldFrom(node)
            is Identifier -> pIdentifier(node)
            is Name -> pName(node)
            is NullableType -> pNullableType(node)
            is Param -> pParam(node)
            is ScalarDNumber -> pScalarDNumber(node)
            is ScalarEncapsed -> pScalarEncapsed(node)
            is ScalarEncapsedStringPart -> pScalarEncapsedStringPart(node)
            is ScalarLNumber -> pScalarLNumber(node)
            is ScalarMagicConst -> pScalarMagicConst(node)
            is ScalarString -> pScalarString(node)
            is StmtBreak -> pStmtBreak(node)
            is StmtCase -> pStmtCase(node)
            is StmtCatch -> pStmtCatch(node)
            is StmtClass -> pStmtClass(node)
            is StmtClassConst -> pStmtClassConst(node)
            is StmtClassMethod -> pStmtClassMethod(node)
            is StmtConst -> pStmtConst(node)
            is StmtContinue -> pStmtContinue(node)
            is StmtDeclare -> pStmtDeclare(node)
            is StmtDeclareDeclare -> pStmtDeclareDeclare(node)
            is StmtDo -> pStmtDo(node)
            is StmtEcho -> pStmtEcho(node)
            is StmtElse -> pStmtElse(node)
            is StmtElseIf -> pStmtElseIf(node)
            is StmtExpression -> pStmtExpression(node)
            is StmtFinally -> pStmtFinally(node)
            is StmtFor -> pStmtFor(node)
            is StmtForeach -> pStmtForeach(node)
            is StmtFunction -> pStmtFunction(node)
            is StmtGlobal -> pStmtGlobal(node)
            is StmtGoto -> pStmtGoto(node)
            is StmtGroupUse -> pStmtGroupUse(node)
            is StmtHaltCompiler -> pStmtHaltCompiler(node)
            is StmtIf -> pStmtIf(node)
            is StmtInlineHTML -> pStmtInlineHTML(node)
            is StmtInterface -> pStmtInterface(node)
            is StmtLabel -> pStmtLabel(node)
            is StmtNamespace -> pStmtNamespace(node)
            is StmtNop -> pStmtNop(node)
            is StmtProperty -> pStmtProperty(node)
            is StmtPropertyProperty -> pStmtPropertyProperty(node)
            is StmtReturn -> pStmtReturn(node)
            is StmtStatic -> pStmtStatic(node)
            is StmtStaticVar -> pStmtStaticVar(node)
            is StmtSwitch -> pStmtSwitch(node)
            is StmtThrow -> pStmtThrow(node)
            is StmtTrait -> pStmtTrait(node)
            is StmtTraitUse -> pStmtTraitUse(node)
            is StmtTraitUseAdaptationAlias -> pStmtTraitUseAdaptationAlias(node)
            is StmtTraitUseAdaptationPrecedence -> pStmtTraitUseAdaptationPrecedence(node)
            is StmtTryCatch -> pStmtTryCatch(node)
            is StmtUnset -> pStmtUnset(node)
            is StmtUse -> pStmtUse(node)
            is StmtUseUse -> pStmtUseUse(node)
            is StmtWhile -> pStmtWhile(node)
            else -> throw Exception("预期外的 AstNode 类型: ${node::class.qualifiedName}")
        }
    }

    ////////////////////
    // helpers
    ////////////////////

    private fun pNullable(node: Node?): String {
        return if (node != null) p(node) else ""
    }

    private fun pIf(cond: Boolean, value: String, default: String = ""): String {
        return if (cond) value else default
    }

    private fun <T : Any> pNotNull(node: T?, value: (T) -> String, default: String = ""): String {
        return if (node != null) value(node) else default
    }

    private fun <T> pNotEmpty(list: List<T>, value: (List<T>) -> String, default: String = ""): String {
        return if (list.isNotEmpty()) value(list) else default
    }

    private fun unreachableAnyOf(value: Any): Nothing {
        throw Exception("不应触达的 AnyOf 分支, type: ${value::class.qualifiedName}")
    }

    private fun pAnyOf(anyOf: AnyOf): String {
        val value = anyOf.value
        return when (value) {
            is String -> value
            is Node -> p(value)
            else -> unreachableAnyOf(value)
        }
    }

    private fun pDereferenceLhs(node: Node): String {
        return if (dereferenceLhsRequiresParens(node)) {
            "(" + p(node) + ")"
        } else {
            p(node)
        }
    }

    private fun pCallLhs(node: Node): String {
        return if (callLhsRequiresParens(node)) {
            "(" + p(node) + ")"
        } else {
            p(node)
        }
    }

    private fun pNewVariable(node: Node): String {
        // TODO: This is not fully accurate.
        return pDereferenceLhs(node)
    }

    private fun hasNodeWithComments(nodes: List<Node?>): Boolean {
        // TODO: node comments
        return false
    }

    private fun pMaybeMultiline(nodes: List<Node?>, trailingComma: Boolean = false): String {
        return if (!hasNodeWithComments(nodes)) {
            pCommaSeparated(nodes)
        } else {
            pCommaSeparatedMultiline(nodes, trailingComma) + nl
        }
    }

    private fun pClassCommon(node: StmtClass, afterClassToken: String): String {
        val flags = node.flags
        val extends = node.extends
        val implements = node.implements
        val name = node.name
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return pModifiers(flags) + "class" + afterClassToken +
                pNotNull(extends, { " extends " + p(it) }) +
                pNotEmpty(implements, { " implements " + pCommaSeparated(it) }) +
                nl + "{" + pStmts(stmts) + nl + "}"
    }

    private fun pObjectProperty(node: AnyOf2<Identifier, Expr>): String {
        return when (val value = node.value) {
            is Identifier -> value.name
            is Expr -> "{" + p(value) + "}"
            else -> unreachableAnyOf(value)
        }
    }

    private fun pTypeHint(node: AnyOf3<Identifier, Name, ComplexType>): String {
        return when (val value = node.value) {
            is Identifier -> p(value)
            is Name -> p(value)
            is ComplexType -> p(value)
            else -> unreachableAnyOf(value)
        }
    }

    private fun pEncapsList(encapsList: List<Any?>, vararg quoteChars: Char): String {
        return encapsList.joinToString("") {
            when (it) {
                is ScalarEncapsedStringPart -> escapeString(it.value, *quoteChars)
                is Node -> "{" + p(it) + "}"
                else -> throw Exception("不支持的 encaps part")
            }
        }
    }

    private fun escapeString(string: String, vararg quoteChars: Char): String {
        // todo 暂不支持 \f \v
        // todo 暂不支持特殊字符转义
        return addcslashes(string, EscapeMap.map.keys + quoteChars.toSet())
    }

    private fun addcslashes(string: String, chars: Set<Char>): String {
        var result = string
        chars.forEach { char ->
            val newValue = EscapeMap.map.getOrDefault(char, "\\" + char)
            result = result.replace(char.toString(), newValue)
        }

        return result
    }

    ////////////////////
    // Nodes
    ////////////////////

    private fun pArg(node: Arg): String {
        val value = node.value
        val byRef = node.byRef
        val unpack = node.unpack

        return pIf(byRef, "&") + pIf(unpack, "...") + p(value)
    }

    private fun pConst(node: Const): String {
        val name = node.name
        val value = node.value
        val namespacedName = node.namespacedName

        return name.name + " = " + p(value)
    }

    private fun pExprArray(node: ExprArray): String {
        val items = node.items

        return "[" + pMaybeMultiline(items, true) + "]"
    }

    private fun pExprArrayDimFetch(node: ExprArrayDimFetch): String {
        val `var` = node.`var`
        val dim = node.dim

        return pDereferenceLhs(`var`) + "[" + pNullable(dim) + "]"
    }

    private fun pExprArrayItem(node: ExprArrayItem): String {
        val key = node.key
        val value = node.value
        val byRef = node.byRef
        val unpack = node.unpack

        return pNotNull(key, { p(it) + " => " }) + pIf(byRef, "&") + pIf(unpack, "...") + p(value)
    }

    private fun pExprAssign(node: ExprAssign): String {
        val `var` = node.`var`
        val expr = node.expr

        return pInfixOp(node, `var`, " = ", expr)
    }

    private fun pExprAssignRef(node: ExprAssignRef): String {
        val `var` = node.`var`
        val expr = node.expr

        return pInfixOp(node, `var`, " =& ", expr)
    }

    private fun pExprAssignOp(node: ExprAssignOp): String {
        val `var` = node.`var`
        val expr = node.expr

        return when (node) {
            is ExprAssignOpPlus -> pInfixOp(node, `var`, " += ", expr)
            is ExprAssignOpMinus -> pInfixOp(node, `var`, " -= ", expr)
            is ExprAssignOpMul -> pInfixOp(node, `var`, " *= ", expr)
            is ExprAssignOpDiv -> pInfixOp(node, `var`, " /= ", expr)
            is ExprAssignOpConcat -> pInfixOp(node, `var`, " .= ", expr)
            is ExprAssignOpMod -> pInfixOp(node, `var`, " %= ", expr)
            is ExprAssignOpBitwiseAnd -> pInfixOp(node, `var`, " &= ", expr)
            is ExprAssignOpBitwiseOr -> pInfixOp(node, `var`, " |= ", expr)
            is ExprAssignOpBitwiseXor -> pInfixOp(node, `var`, " ^= ", expr)
            is ExprAssignOpShiftLeft -> pInfixOp(node, `var`, " <<= ", expr)
            is ExprAssignOpShiftRight -> pInfixOp(node, `var`, " >>= ", expr)
            is ExprAssignOpPow -> pInfixOp(node, `var`, " **= ", expr)
        }
    }

    private fun pExprBinaryOp(node: ExprBinaryOp): String {
        val left = node.left
        val right = node.right

        return when (node) {
            is ExprBinaryOpPlus -> pInfixOp(node, left, " + ", right)
            is ExprBinaryOpMinus -> pInfixOp(node, left, " - ", right)
            is ExprBinaryOpMul -> pInfixOp(node, left, " * ", right)
            is ExprBinaryOpDiv -> pInfixOp(node, left, " / ", right)
            is ExprBinaryOpConcat -> pInfixOp(node, left, " . ", right)
            is ExprBinaryOpMod -> pInfixOp(node, left, " % ", right)
            is ExprBinaryOpBooleanAnd -> pInfixOp(node, left, " && ", right)
            is ExprBinaryOpBooleanOr -> pInfixOp(node, left, " || ", right)
            is ExprBinaryOpBitwiseAnd -> pInfixOp(node, left, " & ", right)
            is ExprBinaryOpBitwiseOr -> pInfixOp(node, left, " | ", right)
            is ExprBinaryOpBitwiseXor -> pInfixOp(node, left, " ^ ", right)
            is ExprBinaryOpShiftLeft -> pInfixOp(node, left, " << ", right)
            is ExprBinaryOpShiftRight -> pInfixOp(node, left, " >> ", right)
            is ExprBinaryOpPow -> pInfixOp(node, left, " ** ", right)
            is ExprBinaryOpLogicalAnd -> pInfixOp(node, left, " and ", right)
            is ExprBinaryOpLogicalOr -> pInfixOp(node, left, " or ", right)
            is ExprBinaryOpLogicalXor -> pInfixOp(node, left, " xor ", right)
            is ExprBinaryOpEqual -> pInfixOp(node, left, " == ", right)
            is ExprBinaryOpNotEqual -> pInfixOp(node, left, " != ", right)
            is ExprBinaryOpIdentical -> pInfixOp(node, left, " === ", right)
            is ExprBinaryOpNotIdentical -> pInfixOp(node, left, " !== ", right)
            is ExprBinaryOpSpaceship -> pInfixOp(node, left, " <=> ", right)
            is ExprBinaryOpGreater -> pInfixOp(node, left, " > ", right)
            is ExprBinaryOpGreaterOrEqual -> pInfixOp(node, left, " >= ", right)
            is ExprBinaryOpSmaller -> pInfixOp(node, left, " < ", right)
            is ExprBinaryOpSmallerOrEqual -> pInfixOp(node, left, " <= ", right)
            is ExprBinaryOpCoalesce -> pInfixOp(node, left, " ?? ", right)
        }
    }

    private fun pExprBitwiseNot(node: ExprBitwiseNot): String {
        val expr = node.expr
        return pPrefixOp(node, "~", expr)
    }

    private fun pExprBooleanNot(node: ExprBooleanNot): String {
        val expr = node.expr
        return pPrefixOp(node, "!", expr)
    }

    private fun pExprCast(node: ExprCast): String {
        val expr = node.expr
        return when (node) {
            is ExprCastArray -> pPrefixOp(node, "(array) ", expr)
            is ExprCastBool -> pPrefixOp(node, "(bool) ", expr)
            is ExprCastDouble -> pPrefixOp(node, "(float) ", expr)
            is ExprCastInt -> pPrefixOp(node, "(int) ", expr)
            is ExprCastObject -> pPrefixOp(node, "(object) ", expr)
            is ExprCastString -> pPrefixOp(node, "(string) ", expr)
            is ExprCastUnset -> pPrefixOp(node, "(unset) ", expr)
        }
    }

    private fun pExprClassConstFetch(node: ExprClassConstFetch): String {
        val `class` = node.`class`.value as Node
        val name = node.name

        return pDereferenceLhs(`class`) + "::" + p(name)
    }

    private fun pExprClone(node: ExprClone): String {
        val expr = node.expr

        return "clone " + p(expr)
    }

    private fun pExprClosure(node: ExprClosure): String {
        val static = node.static
        val byRef = node.byRef
        val params = node.params
        val uses = node.uses
        val returnType = node.returnType
        val stmts = node.stmts

        return pIf(static, "static ") + "function " + pIf(byRef, "&") +
                "(" + pCommaSeparated(params) + ")" +
                pNotEmpty(uses, { " use(" + pCommaSeparated(it) + ")" }) +
                pNotNull(returnType, { " : " + pTypeHint(it) }) +
                " {" + pStmts(stmts) + nl + "}"
    }

    private fun pExprClosureUse(node: ExprClosureUse): String {
        val `var` = node.`var`
        val byRef = node.byRef

        return pIf(byRef, "&") + p(`var`)
    }

    private fun pExprConstFetch(node: ExprConstFetch): String {
        val name = node.name
        return p(name)
    }

    private fun pExprEmpty(node: ExprEmpty): String {
        val expr = node.expr
        return "empty(" + p(expr) + ")"
    }

    private fun pExprErrorSuppress(node: ExprErrorSuppress): String {
        val expr = node.expr
        return pPrefixOp(node, "@", expr)
    }

    private fun pExprExit(node: ExprExit): String {
        val expr = node.expr

        return "exit(" + pNullable(expr) + ")"
    }

    private fun pExprFuncCall(node: ExprFuncCall): String {
        val name = node.name
        val args = node.args

        return pCallLhs(name.value as Node) + "(" + pMaybeMultiline(args) + ")"
    }

    private fun pExprInclude(node: ExprInclude): String {
        val expr = node.expr
        val type = node.type

        return IncludeType.get(type)!!.code + " " + p(expr)
    }

    private fun pExprInstanceof(node: ExprInstanceof): String {
        val expr = node.expr
        val `class` = node.`class`.value as Node

        return pPrec(node, expr, -1) + " instanceof " + pNewVariable(`class`)
    }

    private fun pExprIsset(node: ExprIsset): String {
        val vars = node.vars

        return "isset(" + pCommaSeparated(vars) + ")"
    }

    private fun pExprList(node: ExprList): String {
        val items = node.items
        return "list(" + pCommaSeparated(items) + ")"
    }

    private fun pExprMethodCall(node: ExprMethodCall): String {
        val `var` = node.`var`
        val name = node.name
        val args = node.args

        return pDereferenceLhs(`var`) + "->" + pObjectProperty(name) +
                "(" + pMaybeMultiline(args) + ")"
    }

    private fun pExprNew(node: ExprNew): String {
        val `class` = node.`class`.value as Node
        val args = node.args

        return when (`class`) {
            is StmtClass -> "new " + pClassCommon(`class`, pNotEmpty(args, { "(" + pMaybeMultiline(it) + ")" }))
            is Name, is Expr -> "new " + pNewVariable(`class`) + "(" + pMaybeMultiline(args) + ")"
            else -> unreachableAnyOf(`class`)
        }
    }

    private fun pExprPostDec(node: ExprPostDec): String {
        val `var` = node.`var`

        return pPostfixOp(node, `var`, "--")
    }

    private fun pExprPostInc(node: ExprPostInc): String {
        val `var` = node.`var`

        return pPostfixOp(node, `var`, "++")
    }

    private fun pExprPreDec(node: ExprPreDec): String {
        val `var` = node.`var`
        return pPrefixOp(node, "--", `var`)
    }

    private fun pExprPreInc(node: ExprPreInc): String {
        val `var` = node.`var`
        return pPrefixOp(node, "++", `var`)
    }

    private fun pExprPrint(node: ExprPrint): String {
        val expr = node.expr

        return pPrefixOp(node, "print ", expr)
    }

    private fun pExprPropertyFetch(node: ExprPropertyFetch): String {
        val `var` = node.`var`
        val name = node.name

        return pDereferenceLhs(`var`) + "->" + pObjectProperty(name)
    }

    private fun pExprStaticCall(node: ExprStaticCall): String {
        val `class` = node.`class`.value as Node
        val name = node.name
        val args = node.args

        val property = when (val value = name.value) {
            is ExprVariable -> p(value)
            is Expr -> "{" + p(value) + "}"
            is Identifier -> value.name
            else -> unreachableAnyOf(value)
        }

        return pDereferenceLhs(`class`) + "::" + property +
                "(" + pMaybeMultiline(args) + ")"
    }

    private fun pExprStaticPropertyFetch(node: ExprStaticPropertyFetch): String {
        val `class` = node.`class`.value as Node
        val name = node.name

        return pDereferenceLhs(`class`) + "::$" + pObjectProperty(name)
    }

    private fun pExprTernary(node: ExprTernary): String {
        val cond = node.cond
        val `if` = node.`if`
        val `else` = node.`else`

        return if (`if` != null) {
            pInfixOp(node, cond, " ? " + p(`if`) + " : ", `else`)
        } else {
            pInfixOp(node, cond, " ?: ", `else`)
        }
    }

    private fun pExprThrow(node: ExprThrow): String {
        val expr = node.expr

        return "throw " + p(expr)
    }

    private fun pExprUnaryMinus(node: ExprUnaryMinus): String {
        val expr = node.expr

        if (expr is ExprUnaryMinus || expr is ExprPreDec) {
            // Enforce -(-$expr) instead of --$expr
            return "-(" + p(expr) + ")"
        }

        return pPrefixOp(node, "-", expr)
    }

    private fun pExprUnaryPlus(node: ExprUnaryPlus): String {
        val expr = node.expr

        if (expr is ExprUnaryPlus || expr is ExprPreInc) {
            // Enforce +(+$expr) instead of ++$expr
            return "+(" + p(expr) + ")"
        }

        return pPrefixOp(node, "+", expr)
    }

    private fun pExprVariable(node: ExprVariable): String {
        val name = node.name

        return when (val value = name.value) {
            is String -> "$$value"
            is Expr -> "\${" + p(value) + "}"
            else -> unreachableAnyOf(value)
        }
    }

    private fun pExprYield(node: ExprYield): String {
        val key = node.key
        val value = node.value

        return if (value == null) {
            "yield";
        } else {
            val code = if (key != null) {
                "yield " + p(key) + " => " + p(value)
            } else {
                "yield " + p(value)
            }

            // this is a bit ugly, but currently there is no way to detect whether the parentheses are necessary
            "($code)"
        }
    }

    private fun pExprYieldFrom(node: ExprYieldFrom): String {
        val expr = node.expr

        return pPrefixOp(node, "yield from ", expr)
    }

    private fun pIdentifier(node: Identifier): String {
        return pIf(node.varLike, "$") + node.name
    }

    private fun pName(node: Name): String {
        return if (node.fullyQualified) {
            "\\" + node.parts.joinToString("\\")
        } else {
            node.parts.joinToString("\\")
        }
    }

    private fun pNullableType(node: NullableType): String {
        val type = node.type
        return "?" + pAnyOf(type)
    }

    private fun pParam(node: Param): String {
        val type = node.type
        val byRef = node.byRef
        val variadic = node.variadic
        val `var` = node.`var`
        val default = node.default

        return pNotNull(type, { pTypeHint(it) + " " }) +
                pIf(byRef, "&") +
                pIf(variadic, "...") +
                p(`var`) +
                pNotNull(default, { " = " + p(it) })
    }

    private fun pScalarDNumber(node: ScalarDNumber): String {
        val value = node.value
        return value.toString()
    }

    private fun pScalarString(node: ScalarString): String {
        val value = node.value

        // TODO 目前只默认使用单引号包裹字符串，可优化
        val needEscape = value.toCharArray().any { char -> char < '\u0020' || char == '\'' }
        return if (needEscape) {
            '"' + escapeString(value, '"') + '"'
        } else {
            "'" + addcslashes(value, setOf('\'', '\\')) + "'"
        }
    }

    private fun pScalarEncapsed(node: ScalarEncapsed): String {
        val parts = node.parts

        // TODO 目前不支持 HEREDOC 模式
        return "\"" + pEncapsList(parts, '"') + "\""
    }

    private fun pScalarEncapsedStringPart(node: ScalarEncapsedStringPart): String {
        val value = node.value
        throw Exception("不应支持输出 EncapsedStringPart");
    }

    private fun pScalarLNumber(node: ScalarLNumber): String {
        val value = node.value
        return value.toString()
    }

    private fun pScalarMagicConst(node: ScalarMagicConst): String {
        return when (node) {
            is ScalarMagicConstClass -> "__CLASS__"
            is ScalarMagicConstDir -> "__DIR__"
            is ScalarMagicConstFile -> "__FILE__"
            is ScalarMagicConstFunction -> "__FUNCTION__"
            is ScalarMagicConstLine -> "__LINE__"
            is ScalarMagicConstMethod -> "__METHOD__"
            is ScalarMagicConstNamespace -> "__NAMESPACE__"
            is ScalarMagicConstTrait -> "__TRAIT__"
        }
    }

    private fun pStmtBreak(node: StmtBreak): String {
        val num = node.num

        return "break" + pNotNull(num, { " " + p(it) }) + ";"
    }

    private fun pStmtCase(node: StmtCase): String {
        val cond = node.cond
        val stmts = node.stmts

        return pNotNull(cond, { "case " + p(it) }, "default") + ":" + pStmts(stmts)
    }

    private fun pStmtCatch(node: StmtCatch): String {
        val types = node.types
        val `var` = node.`var`
        val stmts = node.stmts

        return "catch (" + pImplode(types, "|") + " " + p(`var`) +
                ") {" + pStmts(stmts) + nl + "}"
    }

    private fun pStmtClass(node: StmtClass): String {
        val flags = node.flags
        val extends = node.extends
        val implements = node.implements
        val name = node.name
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return pClassCommon(node, " " + name!!.name)
    }

    private fun pStmtClassConst(node: StmtClassConst): String {
        val flags = node.flags
        val consts = node.consts

        return pModifiers(flags) + "const " + pCommaSeparated(consts) + ";"
    }

    private fun pStmtClassMethod(node: StmtClassMethod): String {
        val flags = node.flags
        val byRef = node.byRef
        val name = node.name
        val params = node.params
        val returnType = node.returnType
        val stmts = node.stmts

        return pModifiers(flags) + "function " + pIf(byRef, "&") + name.name +
                "(" + pMaybeMultiline(params) + ")" +
                pNotNull(returnType, { " : " + pTypeHint(it) }) +
                pNotNull(stmts, { nl + "{" + pStmts(it) + nl + "}" }, ";")
    }

    private fun pStmtConst(node: StmtConst): String {
        val consts = node.consts

        return "const " + pCommaSeparated(consts) + ";"
    }

    private fun pStmtContinue(node: StmtContinue): String {
        val num = node.num

        return "continue" + pNotNull(num, { " " + p(it) }) + ";"
    }

    private fun pStmtDeclare(node: StmtDeclare): String {
        val declares = node.declares
        val stmts = node.stmts

        return "declare (" + pCommaSeparated(declares) + ")" +
                pNotNull(stmts, { "{" + pStmts(it) + nl + "}" }, ";")
    }

    private fun pStmtDeclareDeclare(node: StmtDeclareDeclare): String {
        val key = node.key
        val value = node.value

        return key.name + "=" + p(value)
    }

    private fun pStmtDo(node: StmtDo): String {
        val stmts = node.stmts
        val cond = node.cond

        return "do {" + pStmts(stmts) + nl + "} while (" + p(cond) + ");"
    }

    private fun pStmtEcho(node: StmtEcho): String {
        val exprs = node.exprs

        return "echo " + pCommaSeparated(exprs) + ";"
    }

    private fun pStmtElse(node: StmtElse): String {
        val stmts = node.stmts

        return "else {" + pStmts(stmts) + nl + "}"
    }

    private fun pStmtElseIf(node: StmtElseIf): String {
        val cond = node.cond
        val stmts = node.stmts

        return "elseif (" + p(cond) + ") {" + pStmts(stmts) + nl + "}"
    }

    private fun pStmtExpression(node: StmtExpression): String {
        val expr = node.expr

        return p(expr) + ";"
    }

    private fun pStmtFinally(node: StmtFinally): String {
        val stmts = node.stmts

        return "finally {" + pStmts(stmts) + nl + "}"
    }

    private fun pStmtFor(node: StmtFor): String {
        val init = node.init
        val cond = node.cond
        val loop = node.loop
        val stmts = node.stmts

        return "for (" +
                pCommaSeparated(init) + ";" +
                pNotEmpty(cond, { " " }) + pCommaSeparated(cond) + ";" +
                pNotEmpty(loop, { " " }) + pCommaSeparated(loop) +
                ") {" + pStmts(stmts) + nl + "}"
    }

    private fun pStmtForeach(node: StmtForeach): String {
        val expr = node.expr
        val keyVar = node.keyVar
        val byRef = node.byRef
        val valueVar = node.valueVar
        val stmts = node.stmts

        return "foreach (" + p(expr) + " as " +
                pNotNull(keyVar, { p(it) + " => " }) +
                pIf(byRef, "&") + p(valueVar) +
                ") {" + pStmts(stmts) + nl + "}"
    }

    private fun pStmtFunction(node: StmtFunction): String {
        val byRef = node.byRef
        val name = node.name
        val params = node.params
        val returnType = node.returnType
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return "function " + pIf(byRef, "&") + name.name +
                "(" + pCommaSeparated(params) + ")" +
                pNotNull(returnType, { " : " + pTypeHint(it) }) +
                nl + "{" + pStmts(stmts) + nl + "}"
    }

    private fun pStmtGlobal(node: StmtGlobal): String {
        val vars = node.vars

        return "global " + pCommaSeparated(vars) + ";"
    }

    private fun pStmtGoto(node: StmtGoto): String {
        val name = node.name

        return "goto " + name.name + ";"
    }

    private fun pStmtGroupUse(node: StmtGroupUse): String {
        val type = node.type
        val prefix = node.prefix
        val uses = node.uses

        return "use " + pUseType(type) + pName(prefix) + "\\{" + pCommaSeparated(uses) + "};"
    }

    private fun pStmtHaltCompiler(node: StmtHaltCompiler): String {
        val remaining = node.remaining

        return "__halt_compiler();$remaining"
    }

    private fun pStmtIf(node: StmtIf): String {
        val cond = node.cond
        val stmts = node.stmts
        val elseifs = node.elseifs
        val `else` = node.`else`

        return "if (" + p(cond) + ") {" + pStmts(stmts) + nl + "}" +
                pNotEmpty(elseifs, { " " + pImplode(it, " ") }) +
                pNotNull(`else`, { " " + p(it) })
    }

    private fun pStmtInlineHTML(node: StmtInlineHTML): String {
        val value = node.value
        // todo 考虑如果简化
        return "?>$value<?php "
    }

    private fun pStmtInterface(node: StmtInterface): String {
        val extends = node.extends
        val name = node.name
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return "interface " + name.name +
                pNotEmpty(extends, { " extends " + pCommaSeparated(it) }) +
                nl + "{" + pStmts(stmts) + nl + "}"
    }

    private fun pStmtLabel(node: StmtLabel): String {
        val name = node.name

        return name.name + ":";
    }

    private fun pStmtNamespace(node: StmtNamespace): String {
        val name = node.name
        val stmts = node.stmts

        return if (canUseSemicolonNamespaces) {
            "namespace " + p(name!!) + ";" + nl + pStmts(stmts, false)
        } else {
            "namespace" + pNotNull(name, { " " + p(it) }) + " {" + pStmts(stmts) + nl + "}"
        }
    }

    private fun pStmtNop(node: StmtNop): String {
        return "";
    }

    private fun pStmtProperty(node: StmtProperty): String {
        val flags = node.flags
        val props = node.props

        val modifiers = if (flags == 0) "var " else pModifiers(flags)
        return modifiers + pCommaSeparated(props) + ";"
    }

    private fun pStmtPropertyProperty(node: StmtPropertyProperty): String {
        val name = node.name
        val default = node.default

        return "$" + name.name + pNotNull(default, { " = " + p(it) })
    }

    private fun pStmtReturn(node: StmtReturn): String {
        val expr = node.expr

        return "return" + pNotNull(expr, { " " + p(it) }) + ";"
    }

    private fun pStmtStatic(node: StmtStatic): String {
        val vars = node.vars

        return "static " + pCommaSeparated(vars) + ";"
    }

    private fun pStmtStaticVar(node: StmtStaticVar): String {
        val `var` = node.`var`
        val default = node.default

        return p(`var`) + pNotNull(default, { " = " + p(it) })
    }

    private fun pStmtSwitch(node: StmtSwitch): String {
        val cond = node.cond
        val cases = node.cases

        return "switch (" + p(cond) + ") {" + pStmts(cases) + nl + "}"
    }

    private fun pStmtThrow(node: StmtThrow): String {
        val expr = node.expr

        return "throw " + p(expr) + ";"
    }

    private fun pStmtTrait(node: StmtTrait): String {
        val name = node.name
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return "trait " + name.name + nl + "{" + pStmts(stmts) + nl + "}"
    }

    private fun pStmtTraitUse(node: StmtTraitUse): String {
        val traits = node.traits
        val adaptations = node.adaptations

        return "use " + pCommaSeparated(traits) +
                pNotEmpty(
                    adaptations,
                    { " {" + pStmts(it) + nl + "}" },
                    ";"
                )
    }

    private fun pStmtTraitUseAdaptationAlias(node: StmtTraitUseAdaptationAlias): String {
        val newModifier = node.newModifier
        val newName = node.newName
        val trait = node.trait
        val method = node.method

        return pNotNull(trait, { p(it) + "::" }) +
                method.name + " as" +
                pNotNull(newModifier, { " " + pModifiers(it, false) }) +
                pNotNull(newName, { " " + it.name }) + ";"
    }

    private fun pStmtTraitUseAdaptationPrecedence(node: StmtTraitUseAdaptationPrecedence): String {
        val insteadof = node.insteadof
        val trait = node.trait
        val method = node.method

        // todo 确认此处 trait 是否一定非空
        return p(trait!!) + "::" + method.name + " insteadof " + pCommaSeparated(insteadof) + ";"
    }

    private fun pStmtTryCatch(node: StmtTryCatch): String {
        val stmts = node.stmts
        val catches = node.catches
        val finally = node.finally

        return "try {" + pStmts(stmts) + nl + "}" +
                pNotEmpty(catches, { " " + pImplode(it, " ") }) +
                pNotNull(finally, { " " + p(it) })
    }

    private fun pStmtUnset(node: StmtUnset): String {
        val vars = node.vars

        return "unset(" + pCommaSeparated(vars) + ");"
    }

    private fun pStmtUse(node: StmtUse): String {
        val type = node.type
        val uses = node.uses

        return "use " + pUseType(type) + pCommaSeparated(uses) + ";"
    }

    private fun pUseType(type: Int): String {
        return when (type) {
            UseType.FUNCTION.type -> "function "
            UseType.CONSTANT.type -> "const "
            else -> ""
        }
    }

    private fun pStmtUseUse(node: StmtUseUse): String {
        val type = node.type
        val name = node.name
        val alias = node.alias

        return pUseType(type) + pName(name) + pNotNull(alias, { " as " + it.name })
    }

    private fun pStmtWhile(node: StmtWhile): String {
        val cond = node.cond
        val stmts = node.stmts

        return "while (" + p(cond) + ") {" + pStmts(stmts) + nl + "}"
    }
}