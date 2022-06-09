package php.parser

import php.parser.node.*

class AstTransformer : AstTransformerAbstract() {
    override fun p(node: Node): php.ast.Node {
        return when (node) {
            is NameFullyQualified -> pNameFullyQualified(node)
            is NameRelative -> pNameRelative(node)
            is VarLikeIdentifier -> pVarLikeIdentifier(node)

            is Arg -> pArg(node)
            is Const -> pConst(node)
            is ExprArray -> pExprArray(node)
            is ExprArrayDimFetch -> pExprArrayDimFetch(node)
            is ExprArrayItem -> pExprArrayItem(node)
            is ExprAssign -> pExprAssign(node)
            is ExprAssignOpBitwiseAnd -> pExprAssignOpBitwiseAnd(node)
            is ExprAssignOpBitwiseOr -> pExprAssignOpBitwiseOr(node)
            is ExprAssignOpBitwiseXor -> pExprAssignOpBitwiseXor(node)
            is ExprAssignOpConcat -> pExprAssignOpConcat(node)
            is ExprAssignOpDiv -> pExprAssignOpDiv(node)
            is ExprAssignOpMinus -> pExprAssignOpMinus(node)
            is ExprAssignOpMod -> pExprAssignOpMod(node)
            is ExprAssignOpMul -> pExprAssignOpMul(node)
            is ExprAssignOpPlus -> pExprAssignOpPlus(node)
            is ExprAssignOpPow -> pExprAssignOpPow(node)
            is ExprAssignOpShiftLeft -> pExprAssignOpShiftLeft(node)
            is ExprAssignOpShiftRight -> pExprAssignOpShiftRight(node)
            is ExprAssignRef -> pExprAssignRef(node)
            is ExprBinaryOpBitwiseAnd -> pExprBinaryOpBitwiseAnd(node)
            is ExprBinaryOpBitwiseOr -> pExprBinaryOpBitwiseOr(node)
            is ExprBinaryOpBitwiseXor -> pExprBinaryOpBitwiseXor(node)
            is ExprBinaryOpBooleanAnd -> pExprBinaryOpBooleanAnd(node)
            is ExprBinaryOpBooleanOr -> pExprBinaryOpBooleanOr(node)
            is ExprBinaryOpCoalesce -> pExprBinaryOpCoalesce(node)
            is ExprBinaryOpConcat -> pExprBinaryOpConcat(node)
            is ExprBinaryOpDiv -> pExprBinaryOpDiv(node)
            is ExprBinaryOpEqual -> pExprBinaryOpEqual(node)
            is ExprBinaryOpGreater -> pExprBinaryOpGreater(node)
            is ExprBinaryOpGreaterOrEqual -> pExprBinaryOpGreaterOrEqual(node)
            is ExprBinaryOpIdentical -> pExprBinaryOpIdentical(node)
            is ExprBinaryOpLogicalAnd -> pExprBinaryOpLogicalAnd(node)
            is ExprBinaryOpLogicalOr -> pExprBinaryOpLogicalOr(node)
            is ExprBinaryOpLogicalXor -> pExprBinaryOpLogicalXor(node)
            is ExprBinaryOpMinus -> pExprBinaryOpMinus(node)
            is ExprBinaryOpMod -> pExprBinaryOpMod(node)
            is ExprBinaryOpMul -> pExprBinaryOpMul(node)
            is ExprBinaryOpNotEqual -> pExprBinaryOpNotEqual(node)
            is ExprBinaryOpNotIdentical -> pExprBinaryOpNotIdentical(node)
            is ExprBinaryOpPlus -> pExprBinaryOpPlus(node)
            is ExprBinaryOpPow -> pExprBinaryOpPow(node)
            is ExprBinaryOpShiftLeft -> pExprBinaryOpShiftLeft(node)
            is ExprBinaryOpShiftRight -> pExprBinaryOpShiftRight(node)
            is ExprBinaryOpSmaller -> pExprBinaryOpSmaller(node)
            is ExprBinaryOpSmallerOrEqual -> pExprBinaryOpSmallerOrEqual(node)
            is ExprBinaryOpSpaceship -> pExprBinaryOpSpaceship(node)
            is ExprBitwiseNot -> pExprBitwiseNot(node)
            is ExprBooleanNot -> pExprBooleanNot(node)
            is ExprCastArray -> pExprCastArray(node)
            is ExprCastBool -> pExprCastBool(node)
            is ExprCastDouble -> pExprCastDouble(node)
            is ExprCastInt -> pExprCastInt(node)
            is ExprCastObject -> pExprCastObject(node)
            is ExprCastString -> pExprCastString(node)
            is ExprCastUnset -> pExprCastUnset(node)
            is ExprClassConstFetch -> pExprClassConstFetch(node)
            is ExprClone -> pExprClone(node)
            is ExprClosure -> pExprClosure(node)
            is ExprClosureUse -> pExprClosureUse(node)
            is ExprConstFetch -> pExprConstFetch(node)
            is ExprEmpty -> pExprEmpty(node)
            is ExprError -> pExprError(node)
            is ExprErrorSuppress -> pExprErrorSuppress(node)
            is ExprEval -> pExprEval(node)
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
            is ExprShellExec -> pExprShellExec(node)
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
            is ScalarMagicConstClass -> pScalarMagicConstClass(node)
            is ScalarMagicConstDir -> pScalarMagicConstDir(node)
            is ScalarMagicConstFile -> pScalarMagicConstFile(node)
            is ScalarMagicConstFunction -> pScalarMagicConstFunction(node)
            is ScalarMagicConstLine -> pScalarMagicConstLine(node)
            is ScalarMagicConstMethod -> pScalarMagicConstMethod(node)
            is ScalarMagicConstNamespace -> pScalarMagicConstNamespace(node)
            is ScalarMagicConstTrait -> pScalarMagicConstTrait(node)
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
            else -> throw Exception("预期外的 Node 类型: ${node::class.qualifiedName}")
        }
    }

    private fun pArg(node: Arg): php.ast.Arg {
        val value = node.value
        val byRef = node.byRef
        val unpack = node.unpack

        return php.ast.Arg(
            value = p(value, php.ast.Expr::class),
            byRef = byRef,
            unpack = unpack,
        )
    }

    private fun pConst(node: Const): php.ast.Const {
        val name = node.name
        val value = node.value
        val namespacedName = node.namespacedName

        return php.ast.Const(
            name = p(name, php.ast.Identifier::class),
            value = p(value, php.ast.Expr::class),
            namespacedName = pOrNull(namespacedName, php.ast.Name::class),
        )
    }

    private fun pExprArray(node: ExprArray): php.ast.ExprArray {
        val items = node.items

        return php.ast.ExprArray(
            items = pListOfNullable(items, php.ast.ExprArrayItem::class),
        )
    }

    private fun pExprArrayDimFetch(node: ExprArrayDimFetch): php.ast.ExprArrayDimFetch {
        val `var` = node.`var`
        val dim = node.dim

        return php.ast.ExprArrayDimFetch(
            `var` = p(`var`, php.ast.Expr::class),
            dim = pOrNull(dim, php.ast.Expr::class),
        )
    }

    private fun pExprArrayItem(node: ExprArrayItem): php.ast.ExprArrayItem {
        val key = node.key
        val value = node.value
        val byRef = node.byRef
        val unpack = node.unpack

        return php.ast.ExprArrayItem(
            key = pOrNull(key, php.ast.Expr::class),
            value = p(value, php.ast.Expr::class),
            byRef = byRef,
            unpack = unpack,
        )
    }

    private fun pExprAssign(node: ExprAssign): php.ast.ExprAssign {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssign(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpBitwiseAnd(node: ExprAssignOpBitwiseAnd): php.ast.ExprAssignOpBitwiseAnd {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpBitwiseAnd(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpBitwiseOr(node: ExprAssignOpBitwiseOr): php.ast.ExprAssignOpBitwiseOr {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpBitwiseOr(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpBitwiseXor(node: ExprAssignOpBitwiseXor): php.ast.ExprAssignOpBitwiseXor {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpBitwiseXor(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpConcat(node: ExprAssignOpConcat): php.ast.ExprAssignOpConcat {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpConcat(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpDiv(node: ExprAssignOpDiv): php.ast.ExprAssignOpDiv {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpDiv(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpMinus(node: ExprAssignOpMinus): php.ast.ExprAssignOpMinus {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpMinus(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpMod(node: ExprAssignOpMod): php.ast.ExprAssignOpMod {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpMod(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpMul(node: ExprAssignOpMul): php.ast.ExprAssignOpMul {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpMul(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpPlus(node: ExprAssignOpPlus): php.ast.ExprAssignOpPlus {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpPlus(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpPow(node: ExprAssignOpPow): php.ast.ExprAssignOpPow {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpPow(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpShiftLeft(node: ExprAssignOpShiftLeft): php.ast.ExprAssignOpShiftLeft {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpShiftLeft(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignOpShiftRight(node: ExprAssignOpShiftRight): php.ast.ExprAssignOpShiftRight {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpShiftRight(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprAssignRef(node: ExprAssignRef): php.ast.ExprAssignRef {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignRef(
            `var` = p(`var`, php.ast.Expr::class),
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpBitwiseAnd(node: ExprBinaryOpBitwiseAnd): php.ast.ExprBinaryOpBitwiseAnd {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpBitwiseAnd(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpBitwiseOr(node: ExprBinaryOpBitwiseOr): php.ast.ExprBinaryOpBitwiseOr {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpBitwiseOr(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpBitwiseXor(node: ExprBinaryOpBitwiseXor): php.ast.ExprBinaryOpBitwiseXor {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpBitwiseXor(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpBooleanAnd(node: ExprBinaryOpBooleanAnd): php.ast.ExprBinaryOpBooleanAnd {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpBooleanAnd(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpBooleanOr(node: ExprBinaryOpBooleanOr): php.ast.ExprBinaryOpBooleanOr {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpBooleanOr(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpCoalesce(node: ExprBinaryOpCoalesce): php.ast.ExprBinaryOpCoalesce {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpCoalesce(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpConcat(node: ExprBinaryOpConcat): php.ast.ExprBinaryOpConcat {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpConcat(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpDiv(node: ExprBinaryOpDiv): php.ast.ExprBinaryOpDiv {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpDiv(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpEqual(node: ExprBinaryOpEqual): php.ast.ExprBinaryOpEqual {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpEqual(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpGreater(node: ExprBinaryOpGreater): php.ast.ExprBinaryOpGreater {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpGreater(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpGreaterOrEqual(node: ExprBinaryOpGreaterOrEqual): php.ast.ExprBinaryOpGreaterOrEqual {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpGreaterOrEqual(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpIdentical(node: ExprBinaryOpIdentical): php.ast.ExprBinaryOpIdentical {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpIdentical(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpLogicalAnd(node: ExprBinaryOpLogicalAnd): php.ast.ExprBinaryOpLogicalAnd {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpLogicalAnd(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpLogicalOr(node: ExprBinaryOpLogicalOr): php.ast.ExprBinaryOpLogicalOr {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpLogicalOr(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpLogicalXor(node: ExprBinaryOpLogicalXor): php.ast.ExprBinaryOpLogicalXor {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpLogicalXor(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpMinus(node: ExprBinaryOpMinus): php.ast.ExprBinaryOpMinus {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpMinus(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpMod(node: ExprBinaryOpMod): php.ast.ExprBinaryOpMod {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpMod(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpMul(node: ExprBinaryOpMul): php.ast.ExprBinaryOpMul {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpMul(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpNotEqual(node: ExprBinaryOpNotEqual): php.ast.ExprBinaryOpNotEqual {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpNotEqual(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpNotIdentical(node: ExprBinaryOpNotIdentical): php.ast.ExprBinaryOpNotIdentical {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpNotIdentical(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpPlus(node: ExprBinaryOpPlus): php.ast.ExprBinaryOpPlus {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpPlus(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpPow(node: ExprBinaryOpPow): php.ast.ExprBinaryOpPow {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpPow(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpShiftLeft(node: ExprBinaryOpShiftLeft): php.ast.ExprBinaryOpShiftLeft {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpShiftLeft(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpShiftRight(node: ExprBinaryOpShiftRight): php.ast.ExprBinaryOpShiftRight {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpShiftRight(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpSmaller(node: ExprBinaryOpSmaller): php.ast.ExprBinaryOpSmaller {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpSmaller(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpSmallerOrEqual(node: ExprBinaryOpSmallerOrEqual): php.ast.ExprBinaryOpSmallerOrEqual {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpSmallerOrEqual(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBinaryOpSpaceship(node: ExprBinaryOpSpaceship): php.ast.ExprBinaryOpSpaceship {
        val left = node.left
        val right = node.right

        return php.ast.ExprBinaryOpSpaceship(
            left = p(left, php.ast.Expr::class),
            right = p(right, php.ast.Expr::class),
        )
    }

    private fun pExprBitwiseNot(node: ExprBitwiseNot): php.ast.ExprBitwiseNot {
        val expr = node.expr

        return php.ast.ExprBitwiseNot(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprBooleanNot(node: ExprBooleanNot): php.ast.ExprBooleanNot {
        val expr = node.expr

        return php.ast.ExprBooleanNot(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprCastArray(node: ExprCastArray): php.ast.ExprCastArray {
        val expr = node.expr

        return php.ast.ExprCastArray(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprCastBool(node: ExprCastBool): php.ast.ExprCastBool {
        val expr = node.expr

        return php.ast.ExprCastBool(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprCastDouble(node: ExprCastDouble): php.ast.ExprCastDouble {
        val expr = node.expr

        return php.ast.ExprCastDouble(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprCastInt(node: ExprCastInt): php.ast.ExprCastInt {
        val expr = node.expr

        return php.ast.ExprCastInt(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprCastObject(node: ExprCastObject): php.ast.ExprCastObject {
        val expr = node.expr

        return php.ast.ExprCastObject(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprCastString(node: ExprCastString): php.ast.ExprCastString {
        val expr = node.expr

        return php.ast.ExprCastString(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprCastUnset(node: ExprCastUnset): php.ast.ExprCastUnset {
        val expr = node.expr

        return php.ast.ExprCastUnset(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprClassConstFetch(node: ExprClassConstFetch): php.ast.ExprClassConstFetch {
        val `class` = node.`class`
        val name = node.name

        return php.ast.ExprClassConstFetch(
            `class` = pAnyOf2(`class`, php.ast.Name::class, php.ast.Expr::class),
            name = p(name, php.ast.Identifier::class),
        )
    }

    private fun pExprClone(node: ExprClone): php.ast.ExprClone {
        val expr = node.expr

        return php.ast.ExprClone(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprClosure(node: ExprClosure): php.ast.ExprClosure {
        val static = node.static
        val byRef = node.byRef
        val params = node.params
        val uses = node.uses
        val returnType = node.returnType
        val stmts = node.stmts

        return php.ast.ExprClosure(
            static = static,
            byRef = byRef,
            params = pList(params, php.ast.Param::class),
            uses = pList(uses, php.ast.ExprClosureUse::class),
            returnType = pAnyOf3OrNull(returnType, php.ast.Identifier::class, php.ast.Name::class, php.ast.ComplexType::class),
            stmts = pList(stmts, php.ast.Stmt::class),
        )
    }

    private fun pExprClosureUse(node: ExprClosureUse): php.ast.ExprClosureUse {
        val `var` = node.`var`
        val byRef = node.byRef

        return php.ast.ExprClosureUse(
            `var` = p(`var`, php.ast.ExprVariable::class),
            byRef = byRef,
        )
    }

    private fun pExprConstFetch(node: ExprConstFetch): php.ast.ExprConstFetch {
        val name = node.name

        return php.ast.ExprConstFetch(
            name = p(name, php.ast.Name::class),
        )
    }

    private fun pExprEmpty(node: ExprEmpty): php.ast.ExprEmpty {
        val expr = node.expr

        return php.ast.ExprEmpty(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprError(node: ExprError): php.ast.ExprError {

        return php.ast.ExprError(
        )
    }

    private fun pExprErrorSuppress(node: ExprErrorSuppress): php.ast.ExprErrorSuppress {
        val expr = node.expr

        return php.ast.ExprErrorSuppress(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprEval(node: ExprEval): php.ast.ExprEval {
        val expr = node.expr

        return php.ast.ExprEval(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprExit(node: ExprExit): php.ast.ExprExit {
        val expr = node.expr

        return php.ast.ExprExit(
            expr = pOrNull(expr, php.ast.Expr::class),
        )
    }

    private fun pExprFuncCall(node: ExprFuncCall): php.ast.ExprFuncCall {
        val name = node.name
        val args = node.args

        return php.ast.ExprFuncCall(
            name = pAnyOf2(name, php.ast.Name::class, php.ast.Expr::class),
            args = pList(args, php.ast.Arg::class),
        )
    }

    private fun pExprInclude(node: ExprInclude): php.ast.ExprInclude {
        val expr = node.expr
        val type = node.type

        return php.ast.ExprInclude(
            expr = p(expr, php.ast.Expr::class),
            type = type,
        )
    }

    private fun pExprInstanceof(node: ExprInstanceof): php.ast.ExprInstanceof {
        val expr = node.expr
        val `class` = node.`class`

        return php.ast.ExprInstanceof(
            expr = p(expr, php.ast.Expr::class),
            `class` = pAnyOf2(`class`, php.ast.Name::class, php.ast.ExprVariable::class),
        )
    }

    private fun pExprIsset(node: ExprIsset): php.ast.ExprIsset {
        val vars = node.vars

        return php.ast.ExprIsset(
            vars = pList(vars, php.ast.Expr::class),
        )
    }

    private fun pExprList(node: ExprList): php.ast.ExprList {
        val items = node.items

        return php.ast.ExprList(
            items = pListOfNullable(items, php.ast.ExprArrayItem::class),
        )
    }

    private fun pExprMethodCall(node: ExprMethodCall): php.ast.ExprMethodCall {
        val `var` = node.`var`
        val name = node.name
        val args = node.args

        return php.ast.ExprMethodCall(
            `var` = p(`var`, php.ast.Expr::class),
            name = pAnyOf2(name, php.ast.Identifier::class, php.ast.Expr::class),
            args = pList(args, php.ast.Arg::class),
        )
    }

    private fun pExprNew(node: ExprNew): php.ast.ExprNew {
        val `class` = node.`class`
        val args = node.args

        return php.ast.ExprNew(
            `class` = pAnyOf3(`class`, php.ast.Name::class, php.ast.Expr::class, php.ast.StmtClass::class),
            args = pList(args, php.ast.Arg::class),
        )
    }

    private fun pExprPostDec(node: ExprPostDec): php.ast.ExprPostDec {
        val `var` = node.`var`

        return php.ast.ExprPostDec(
            `var` = p(`var`, php.ast.Expr::class),
        )
    }

    private fun pExprPostInc(node: ExprPostInc): php.ast.ExprPostInc {
        val `var` = node.`var`

        return php.ast.ExprPostInc(
            `var` = p(`var`, php.ast.Expr::class),
        )
    }

    private fun pExprPreDec(node: ExprPreDec): php.ast.ExprPreDec {
        val `var` = node.`var`

        return php.ast.ExprPreDec(
            `var` = p(`var`, php.ast.Expr::class),
        )
    }

    private fun pExprPreInc(node: ExprPreInc): php.ast.ExprPreInc {
        val `var` = node.`var`

        return php.ast.ExprPreInc(
            `var` = p(`var`, php.ast.Expr::class),
        )
    }

    private fun pExprPrint(node: ExprPrint): php.ast.ExprPrint {
        val expr = node.expr

        return php.ast.ExprPrint(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprPropertyFetch(node: ExprPropertyFetch): php.ast.ExprPropertyFetch {
        val `var` = node.`var`
        val name = node.name

        return php.ast.ExprPropertyFetch(
            `var` = p(`var`, php.ast.Expr::class),
            name = pAnyOf2(name, php.ast.Identifier::class, php.ast.Expr::class),
        )
    }

    private fun pExprShellExec(node: ExprShellExec): php.ast.ExprShellExec {
        val parts = node.parts

        return php.ast.ExprShellExec(
            parts = pList(parts, Any::class),
        )
    }

    private fun pExprStaticCall(node: ExprStaticCall): php.ast.ExprStaticCall {
        val `class` = node.`class`
        val name = node.name
        val args = node.args

        return php.ast.ExprStaticCall(
            `class` = pAnyOf2(`class`, php.ast.Name::class, php.ast.Expr::class),
            name = pAnyOf2(name, php.ast.Identifier::class, php.ast.Expr::class),
            args = pList(args, php.ast.Arg::class),
        )
    }

    private fun pExprStaticPropertyFetch(node: ExprStaticPropertyFetch): php.ast.ExprStaticPropertyFetch {
        val `class` = node.`class`
        val name = node.name

        return php.ast.ExprStaticPropertyFetch(
            `class` = pAnyOf2(`class`, php.ast.Name::class, php.ast.Expr::class),
            name = pAnyOf2(name, php.ast.Identifier::class, php.ast.Expr::class),
        )
    }

    private fun pExprTernary(node: ExprTernary): php.ast.ExprTernary {
        val cond = node.cond
        val `if` = node.`if`
        val `else` = node.`else`

        return php.ast.ExprTernary(
            cond = p(cond, php.ast.Expr::class),
            `if` = pOrNull(`if`, php.ast.Expr::class),
            `else` = p(`else`, php.ast.Expr::class),
        )
    }

    private fun pExprThrow(node: ExprThrow): php.ast.ExprThrow {
        val expr = node.expr

        return php.ast.ExprThrow(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprUnaryMinus(node: ExprUnaryMinus): php.ast.ExprUnaryMinus {
        val expr = node.expr

        return php.ast.ExprUnaryMinus(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprUnaryPlus(node: ExprUnaryPlus): php.ast.ExprUnaryPlus {
        val expr = node.expr

        return php.ast.ExprUnaryPlus(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pExprVariable(node: ExprVariable): php.ast.ExprVariable {
        val name = node.name

        return php.ast.ExprVariable(
            name = pAnyOf2(name, String::class, php.ast.Expr::class),
        )
    }

    private fun pExprYield(node: ExprYield): php.ast.ExprYield {
        val key = node.key
        val value = node.value

        return php.ast.ExprYield(
            key = pOrNull(key, php.ast.Expr::class),
            value = pOrNull(value, php.ast.Expr::class),
        )
    }

    private fun pExprYieldFrom(node: ExprYieldFrom): php.ast.ExprYieldFrom {
        val expr = node.expr

        return php.ast.ExprYieldFrom(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pIdentifier(node: Identifier): php.ast.Identifier {
        val name = node.name

        return php.ast.Identifier(
            name = name,
        )
    }

    private fun pName(node: Name): php.ast.Name {
        val parts = node.parts

        return php.ast.Name(
            parts = pList(parts, String::class),
        )
    }

    private fun pNameFullyQualified(node: NameFullyQualified): php.ast.NameFullyQualified {
        val parts = node.parts

        return php.ast.NameFullyQualified(
            parts = pList(parts, String::class),
        )
    }

    private fun pNameRelative(node: NameRelative): php.ast.NameRelative {
        val parts = node.parts

        return php.ast.NameRelative(
            parts = pList(parts, String::class),
        )
    }

    private fun pNullableType(node: NullableType): php.ast.NullableType {
        val type = node.type

        return php.ast.NullableType(
            type = pAnyOf2(type, php.ast.Identifier::class, php.ast.Name::class),
        )
    }

    private fun pParam(node: Param): php.ast.Param {
        val type = node.type
        val byRef = node.byRef
        val variadic = node.variadic
        val `var` = node.`var`
        val default = node.default

        return php.ast.Param(
            type = pAnyOf3OrNull(type, php.ast.Identifier::class, php.ast.Name::class, php.ast.ComplexType::class),
            byRef = byRef,
            variadic = variadic,
            `var` = p(`var`, php.ast.ExprVariable::class),
            default = pOrNull(default, php.ast.Expr::class),
        )
    }

    private fun pScalarDNumber(node: ScalarDNumber): php.ast.ScalarDNumber {
        val value = node.value

        return php.ast.ScalarDNumber(
            value = value,
        )
    }

    private fun pScalarEncapsed(node: ScalarEncapsed): php.ast.ScalarEncapsed {
        val parts = node.parts

        return php.ast.ScalarEncapsed(
            parts = pList(parts, php.ast.Expr::class),
        )
    }

    private fun pScalarEncapsedStringPart(node: ScalarEncapsedStringPart): php.ast.ScalarEncapsedStringPart {
        val value = node.value

        return php.ast.ScalarEncapsedStringPart(
            value = value,
        )
    }

    private fun pScalarLNumber(node: ScalarLNumber): php.ast.ScalarLNumber {
        val value = node.value

        return php.ast.ScalarLNumber(
            value = value,
        )
    }

    private fun pScalarMagicConstClass(node: ScalarMagicConstClass): php.ast.ScalarMagicConstClass {

        return php.ast.ScalarMagicConstClass(
        )
    }

    private fun pScalarMagicConstDir(node: ScalarMagicConstDir): php.ast.ScalarMagicConstDir {

        return php.ast.ScalarMagicConstDir(
        )
    }

    private fun pScalarMagicConstFile(node: ScalarMagicConstFile): php.ast.ScalarMagicConstFile {

        return php.ast.ScalarMagicConstFile(
        )
    }

    private fun pScalarMagicConstFunction(node: ScalarMagicConstFunction): php.ast.ScalarMagicConstFunction {

        return php.ast.ScalarMagicConstFunction(
        )
    }

    private fun pScalarMagicConstLine(node: ScalarMagicConstLine): php.ast.ScalarMagicConstLine {

        return php.ast.ScalarMagicConstLine(
        )
    }

    private fun pScalarMagicConstMethod(node: ScalarMagicConstMethod): php.ast.ScalarMagicConstMethod {

        return php.ast.ScalarMagicConstMethod(
        )
    }

    private fun pScalarMagicConstNamespace(node: ScalarMagicConstNamespace): php.ast.ScalarMagicConstNamespace {

        return php.ast.ScalarMagicConstNamespace(
        )
    }

    private fun pScalarMagicConstTrait(node: ScalarMagicConstTrait): php.ast.ScalarMagicConstTrait {

        return php.ast.ScalarMagicConstTrait(
        )
    }

    private fun pScalarString(node: ScalarString): php.ast.ScalarString {
        val value = node.value

        return php.ast.ScalarString(
            value = value,
        )
    }

    private fun pStmtBreak(node: StmtBreak): php.ast.StmtBreak {
        val num = node.num

        return php.ast.StmtBreak(
            num = pOrNull(num, php.ast.Expr::class),
        )
    }

    private fun pStmtCase(node: StmtCase): php.ast.StmtCase {
        val cond = node.cond
        val stmts = node.stmts

        return php.ast.StmtCase(
            cond = pOrNull(cond, php.ast.Expr::class),
            stmts = pList(stmts, php.ast.Stmt::class),
        )
    }

    private fun pStmtCatch(node: StmtCatch): php.ast.StmtCatch {
        val types = node.types
        val `var` = node.`var`
        val stmts = node.stmts

        return php.ast.StmtCatch(
            types = pList(types, php.ast.Name::class),
            `var` = p(`var`, php.ast.ExprVariable::class),
            stmts = pList(stmts, php.ast.Stmt::class),
        )
    }

    private fun pStmtClass(node: StmtClass): php.ast.StmtClass {
        val flags = node.flags
        val extends = node.extends
        val implements = node.implements
        val name = node.name
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return php.ast.StmtClass(
            flags = flags,
            extends = pOrNull(extends, php.ast.Name::class),
            implements = pList(implements, php.ast.Name::class),
            name = pOrNull(name, php.ast.Identifier::class),
            stmts = pList(stmts, php.ast.Stmt::class),
            namespacedName = p(namespacedName, php.ast.Name::class),
        )
    }

    private fun pStmtClassConst(node: StmtClassConst): php.ast.StmtClassConst {
        val flags = node.flags
        val consts = node.consts

        return php.ast.StmtClassConst(
            flags = flags,
            consts = pList(consts, php.ast.Const::class),
        )
    }

    private fun pStmtClassMethod(node: StmtClassMethod): php.ast.StmtClassMethod {
        val flags = node.flags
        val byRef = node.byRef
        val name = node.name
        val params = node.params
        val returnType = node.returnType
        val stmts = node.stmts

        return php.ast.StmtClassMethod(
            flags = flags,
            byRef = byRef,
            name = p(name, php.ast.Identifier::class),
            params = pList(params, php.ast.Param::class),
            returnType = pAnyOf3OrNull(returnType, php.ast.Identifier::class, php.ast.Name::class, php.ast.ComplexType::class),
            stmts = pListOrNull(stmts, php.ast.Stmt::class),
        )
    }

    private fun pStmtConst(node: StmtConst): php.ast.StmtConst {
        val consts = node.consts

        return php.ast.StmtConst(
            consts = pList(consts, php.ast.Const::class),
        )
    }

    private fun pStmtContinue(node: StmtContinue): php.ast.StmtContinue {
        val num = node.num

        return php.ast.StmtContinue(
            num = pOrNull(num, php.ast.Expr::class),
        )
    }

    private fun pStmtDeclare(node: StmtDeclare): php.ast.StmtDeclare {
        val declares = node.declares
        val stmts = node.stmts

        return php.ast.StmtDeclare(
            declares = pList(declares, php.ast.StmtDeclareDeclare::class),
            stmts = pListOrNull(stmts, php.ast.Stmt::class),
        )
    }

    private fun pStmtDeclareDeclare(node: StmtDeclareDeclare): php.ast.StmtDeclareDeclare {
        val key = node.key
        val value = node.value

        return php.ast.StmtDeclareDeclare(
            key = p(key, php.ast.Identifier::class),
            value = p(value, php.ast.Expr::class),
        )
    }

    private fun pStmtDo(node: StmtDo): php.ast.StmtDo {
        val stmts = node.stmts
        val cond = node.cond

        return php.ast.StmtDo(
            stmts = pList(stmts, php.ast.Stmt::class),
            cond = p(cond, php.ast.Expr::class),
        )
    }

    private fun pStmtEcho(node: StmtEcho): php.ast.StmtEcho {
        val exprs = node.exprs

        return php.ast.StmtEcho(
            exprs = pList(exprs, php.ast.Expr::class),
        )
    }

    private fun pStmtElse(node: StmtElse): php.ast.StmtElse {
        val stmts = node.stmts

        return php.ast.StmtElse(
            stmts = pList(stmts, php.ast.Stmt::class),
        )
    }

    private fun pStmtElseIf(node: StmtElseIf): php.ast.StmtElseIf {
        val cond = node.cond
        val stmts = node.stmts

        return php.ast.StmtElseIf(
            cond = p(cond, php.ast.Expr::class),
            stmts = pList(stmts, php.ast.Stmt::class),
        )
    }

    private fun pStmtExpression(node: StmtExpression): php.ast.StmtExpression {
        val expr = node.expr

        return php.ast.StmtExpression(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pStmtFinally(node: StmtFinally): php.ast.StmtFinally {
        val stmts = node.stmts

        return php.ast.StmtFinally(
            stmts = pList(stmts, php.ast.Stmt::class),
        )
    }

    private fun pStmtFor(node: StmtFor): php.ast.StmtFor {
        val init = node.init
        val cond = node.cond
        val loop = node.loop
        val stmts = node.stmts

        return php.ast.StmtFor(
            init = pList(init, php.ast.Expr::class),
            cond = pList(cond, php.ast.Expr::class),
            loop = pList(loop, php.ast.Expr::class),
            stmts = pList(stmts, php.ast.Stmt::class),
        )
    }

    private fun pStmtForeach(node: StmtForeach): php.ast.StmtForeach {
        val expr = node.expr
        val keyVar = node.keyVar
        val byRef = node.byRef
        val valueVar = node.valueVar
        val stmts = node.stmts

        return php.ast.StmtForeach(
            expr = p(expr, php.ast.Expr::class),
            keyVar = pOrNull(keyVar, php.ast.Expr::class),
            byRef = byRef,
            valueVar = p(valueVar, php.ast.Expr::class),
            stmts = pList(stmts, php.ast.Stmt::class),
        )
    }

    private fun pStmtFunction(node: StmtFunction): php.ast.StmtFunction {
        val byRef = node.byRef
        val name = node.name
        val params = node.params
        val returnType = node.returnType
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return php.ast.StmtFunction(
            byRef = byRef,
            name = p(name, php.ast.Identifier::class),
            params = pList(params, php.ast.Param::class),
            returnType = pAnyOf3OrNull(returnType, php.ast.Identifier::class, php.ast.Name::class, php.ast.ComplexType::class),
            stmts = pList(stmts, php.ast.Stmt::class),
            namespacedName = p(namespacedName, php.ast.Name::class),
        )
    }

    private fun pStmtGlobal(node: StmtGlobal): php.ast.StmtGlobal {
        val vars = node.vars

        return php.ast.StmtGlobal(
            vars = pList(vars, php.ast.Expr::class),
        )
    }

    private fun pStmtGoto(node: StmtGoto): php.ast.StmtGoto {
        val name = node.name

        return php.ast.StmtGoto(
            name = p(name, php.ast.Identifier::class),
        )
    }

    private fun pStmtGroupUse(node: StmtGroupUse): php.ast.StmtGroupUse {
        val type = node.type
        val prefix = node.prefix
        val uses = node.uses

        return php.ast.StmtGroupUse(
            type = type,
            prefix = p(prefix, php.ast.Name::class),
            uses = pList(uses, php.ast.StmtUseUse::class),
        )
    }

    private fun pStmtHaltCompiler(node: StmtHaltCompiler): php.ast.StmtHaltCompiler {
        val remaining = node.remaining

        return php.ast.StmtHaltCompiler(
            remaining = remaining,
        )
    }

    private fun pStmtIf(node: StmtIf): php.ast.StmtIf {
        val cond = node.cond
        val stmts = node.stmts
        val elseifs = node.elseifs
        val `else` = node.`else`

        return php.ast.StmtIf(
            cond = p(cond, php.ast.Expr::class),
            stmts = pList(stmts, php.ast.Stmt::class),
            elseifs = pList(elseifs, php.ast.StmtElseIf::class),
            `else` = pOrNull(`else`, php.ast.StmtElse::class),
        )
    }

    private fun pStmtInlineHTML(node: StmtInlineHTML): php.ast.StmtInlineHTML {
        val value = node.value

        return php.ast.StmtInlineHTML(
            value = value,
        )
    }

    private fun pStmtInterface(node: StmtInterface): php.ast.StmtInterface {
        val name = node.name
        val extends = node.extends
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return php.ast.StmtInterface(
            name = p(name, php.ast.Identifier::class),
            extends = pList(extends, php.ast.Name::class),
            stmts = pList(stmts, php.ast.Stmt::class),
            namespacedName = p(namespacedName, php.ast.Name::class),
        )
    }

    private fun pStmtLabel(node: StmtLabel): php.ast.StmtLabel {
        val name = node.name

        return php.ast.StmtLabel(
            name = p(name, php.ast.Identifier::class),
        )
    }

    private fun pStmtNamespace(node: StmtNamespace): php.ast.StmtNamespace {
        val name = node.name
        val stmts = node.stmts

        return php.ast.StmtNamespace(
            name = pOrNull(name, php.ast.Name::class),
            stmts = pList(stmts, php.ast.Stmt::class),
        )
    }

    private fun pStmtNop(node: StmtNop): php.ast.StmtNop {

        return php.ast.StmtNop(
        )
    }

    private fun pStmtProperty(node: StmtProperty): php.ast.StmtProperty {
        val flags = node.flags
        val props = node.props

        return php.ast.StmtProperty(
            flags = flags,
            props = pList(props, php.ast.StmtPropertyProperty::class),
        )
    }

    private fun pStmtPropertyProperty(node: StmtPropertyProperty): php.ast.StmtPropertyProperty {
        val name = node.name
        val default = node.default

        return php.ast.StmtPropertyProperty(
            name = p(name, php.ast.Identifier::class),
            default = pOrNull(default, php.ast.Expr::class),
        )
    }

    private fun pStmtReturn(node: StmtReturn): php.ast.StmtReturn {
        val expr = node.expr

        return php.ast.StmtReturn(
            expr = pOrNull(expr, php.ast.Expr::class),
        )
    }

    private fun pStmtStatic(node: StmtStatic): php.ast.StmtStatic {
        val vars = node.vars

        return php.ast.StmtStatic(
            vars = pList(vars, php.ast.StmtStaticVar::class),
        )
    }

    private fun pStmtStaticVar(node: StmtStaticVar): php.ast.StmtStaticVar {
        val `var` = node.`var`
        val default = node.default

        return php.ast.StmtStaticVar(
            `var` = p(`var`, php.ast.ExprVariable::class),
            default = pOrNull(default, php.ast.Expr::class),
        )
    }

    private fun pStmtSwitch(node: StmtSwitch): php.ast.StmtSwitch {
        val cond = node.cond
        val cases = node.cases

        return php.ast.StmtSwitch(
            cond = p(cond, php.ast.Expr::class),
            cases = pList(cases, php.ast.StmtCase::class),
        )
    }

    private fun pStmtThrow(node: StmtThrow): php.ast.StmtThrow {
        val expr = node.expr

        return php.ast.StmtThrow(
            expr = p(expr, php.ast.Expr::class),
        )
    }

    private fun pStmtTrait(node: StmtTrait): php.ast.StmtTrait {
        val name = node.name
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return php.ast.StmtTrait(
            name = p(name, php.ast.Identifier::class),
            stmts = pList(stmts, php.ast.Stmt::class),
            namespacedName = p(namespacedName, php.ast.Name::class),
        )
    }

    private fun pStmtTraitUse(node: StmtTraitUse): php.ast.StmtTraitUse {
        val traits = node.traits
        val adaptations = node.adaptations

        return php.ast.StmtTraitUse(
            traits = pList(traits, php.ast.Name::class),
            adaptations = pList(adaptations, php.ast.StmtTraitUseAdaptation::class),
        )
    }

    private fun pStmtTraitUseAdaptationAlias(node: StmtTraitUseAdaptationAlias): php.ast.StmtTraitUseAdaptationAlias {
        val newModifier = node.newModifier
        val newName = node.newName
        val trait = node.trait
        val method = node.method

        return php.ast.StmtTraitUseAdaptationAlias(
            newModifier = newModifier,
            newName = pOrNull(newName, php.ast.Identifier::class),
            trait = pOrNull(trait, php.ast.Name::class),
            method = p(method, php.ast.Identifier::class),
        )
    }

    private fun pStmtTraitUseAdaptationPrecedence(node: StmtTraitUseAdaptationPrecedence): php.ast.StmtTraitUseAdaptationPrecedence {
        val insteadof = node.insteadof
        val trait = node.trait
        val method = node.method

        return php.ast.StmtTraitUseAdaptationPrecedence(
            insteadof = pList(insteadof, php.ast.Name::class),
            trait = pOrNull(trait, php.ast.Name::class),
            method = p(method, php.ast.Identifier::class),
        )
    }

    private fun pStmtTryCatch(node: StmtTryCatch): php.ast.StmtTryCatch {
        val stmts = node.stmts
        val catches = node.catches
        val finally = node.finally

        return php.ast.StmtTryCatch(
            stmts = pList(stmts, php.ast.Stmt::class),
            catches = pList(catches, php.ast.StmtCatch::class),
            finally = pOrNull(finally, php.ast.StmtFinally::class),
        )
    }

    private fun pStmtUnset(node: StmtUnset): php.ast.StmtUnset {
        val vars = node.vars

        return php.ast.StmtUnset(
            vars = pList(vars, php.ast.Expr::class),
        )
    }

    private fun pStmtUse(node: StmtUse): php.ast.StmtUse {
        val type = node.type
        val uses = node.uses

        return php.ast.StmtUse(
            type = type,
            uses = pList(uses, php.ast.StmtUseUse::class),
        )
    }

    private fun pStmtUseUse(node: StmtUseUse): php.ast.StmtUseUse {
        val type = node.type
        val name = node.name
        val alias = node.alias

        return php.ast.StmtUseUse(
            type = type,
            name = p(name, php.ast.Name::class),
            alias = pOrNull(alias, php.ast.Identifier::class),
        )
    }

    private fun pStmtWhile(node: StmtWhile): php.ast.StmtWhile {
        val cond = node.cond
        val stmts = node.stmts

        return php.ast.StmtWhile(
            cond = p(cond, php.ast.Expr::class),
            stmts = pList(stmts, php.ast.Stmt::class),
        )
    }

    private fun pVarLikeIdentifier(node: VarLikeIdentifier): php.ast.VarLikeIdentifier {
        val name = node.name

        return php.ast.VarLikeIdentifier(
            name = name,
        )
    }
}