package kt.tool

import php.ast.*

class KtAstTransformer : KtAstTransformerAbstract() {
    override fun p(node: Node): kt.ast.Node {
        when (node) {
            is ExprArray -> pExprArray(node)
            is ExprArrayItem -> pExprArrayItem(node)
            is ExprExit -> pExprExit(node)
            is ExprList -> pExprList(node)
            is ExprTernary -> pExprTernary(node)
            is ExprThrow -> pExprThrow(node)
            is ExprYield -> pExprYield(node)
            is ExprYieldFrom -> pExprYieldFrom(node)
            is ExprVariable.ExprVariableSimple -> pExprVariableSimple(node)
            is ExprVariable.ExprVariableDynamic -> pExprVariableDynamic(node)
            is ExprInstanceof.ExprInstanceofName -> pExprInstanceofName(node)
            is ExprInstanceof.ExprInstanceofVariable -> pExprInstanceofVariable(node)
            is ExprAssign -> pExprAssign(node)
            is ExprAssignRef -> pExprAssignRef(node)
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
            is ExprCastArray -> pExprCastArray(node)
            is ExprCastBool -> pExprCastBool(node)
            is ExprCastDouble -> pExprCastDouble(node)
            is ExprCastInt -> pExprCastInt(node)
            is ExprCastObject -> pExprCastObject(node)
            is ExprCastString -> pExprCastString(node)
            is ExprClosure -> pExprClosure(node)
            is ExprClosureUse -> pExprClosureUse(node)
            is FuncRef.FuncRefStatic -> pFuncRefStatic(node)
            is FuncRef.FuncRefDynamic -> pFuncRefDynamic(node)
            is ClassRef.ClassRefStatic -> pClassRefStatic(node)
            is ClassRef.ClassRefDynamic -> pClassRefDynamic(node)
            is PropertyRef.PropertyRefStatic -> pPropertyRefStatic(node)
            is PropertyRef.PropertyRefDynamic -> pPropertyRefDynamic(node)
            is MethodRef.MethodRefStatic -> pMethodRefStatic(node)
            is MethodRef.MethodRefDynamic -> pMethodRefDynamic(node)
            is ExprArrayDimFetch -> pExprArrayDimFetch(node)
            is ExprClassConstFetch -> pExprClassConstFetch(node)
            is ExprConstFetch -> pExprConstFetch(node)
            is ExprPropertyFetch -> pExprPropertyFetch(node)
            is ExprStaticPropertyFetch -> pExprStaticPropertyFetch(node)
            is ExprFuncCall -> pExprFuncCall(node)
            is ExprMethodCall -> pExprMethodCall(node)
            is ExprStaticCall -> pExprStaticCall(node)
            is ExprNew.ExprNewStatic -> pExprNewStatic(node)
            is ExprNew.ExprNewDynamic -> pExprNewDynamic(node)
            is ExprNew.ExprNewAnonymous -> pExprNewAnonymous(node)
            is ExprEmpty -> pExprEmpty(node)
            is ExprInclude -> pExprInclude(node)
            is ExprIsset -> pExprIsset(node)
            is ExprClone -> pExprClone(node)
            is ExprBitwiseNot -> pExprBitwiseNot(node)
            is ExprBooleanNot -> pExprBooleanNot(node)
            is ExprErrorSuppress -> pExprErrorSuppress(node)
            is ExprPostDec -> pExprPostDec(node)
            is ExprPostInc -> pExprPostInc(node)
            is ExprPreDec -> pExprPreDec(node)
            is ExprPreInc -> pExprPreInc(node)
            is ExprPrint -> pExprPrint(node)
            is ExprUnaryMinus -> pExprUnaryMinus(node)
            is ExprUnaryPlus -> pExprUnaryPlus(node)
            is Arg -> pArg(node)
            is Param -> pParam(node)
            is TypeHint -> pTypeHint(node)
            is Identifier -> pIdentifier(node)
            is Name -> pName(node)
            is ScalarDNumber -> pScalarDNumber(node)
            is ScalarEncapsed -> pScalarEncapsed(node)
            is ScalarEncapsedStringPart -> pScalarEncapsedStringPart(node)
            is ScalarLNumber -> pScalarLNumber(node)
            is ScalarString -> pScalarString(node)
            is ScalarMagicConstClass -> pScalarMagicConstClass(node)
            is ScalarMagicConstDir -> pScalarMagicConstDir(node)
            is ScalarMagicConstFile -> pScalarMagicConstFile(node)
            is ScalarMagicConstFunction -> pScalarMagicConstFunction(node)
            is ScalarMagicConstLine -> pScalarMagicConstLine(node)
            is ScalarMagicConstMethod -> pScalarMagicConstMethod(node)
            is ScalarMagicConstNamespace -> pScalarMagicConstNamespace(node)
            is ScalarMagicConstTrait -> pScalarMagicConstTrait(node)
            is StmtConst -> pStmtConst(node)
            is StmtDeclare -> pStmtDeclare(node)
            is StmtNamespace -> pStmtNamespace(node)
            is StmtEcho -> pStmtEcho(node)
            is StmtExpression -> pStmtExpression(node)
            is StmtFunction -> pStmtFunction(node)
            is StmtGlobal -> pStmtGlobal(node)
            is StmtInlineHTML -> pStmtInlineHTML(node)
            is StmtNop -> pStmtNop(node)
            is StmtStatic -> pStmtStatic(node)
            is StmtStaticVar -> pStmtStaticVar(node)
            is StmtUnset -> pStmtUnset(node)
            is StmtClassConst -> pStmtClassConst(node)
            is StmtProperty -> pStmtProperty(node)
            is StmtClassMethod -> pStmtClassMethod(node)
            is StmtClass -> pStmtClass(node)
            is StmtInterface -> pStmtInterface(node)
            is StmtTrait -> pStmtTrait(node)
            is StmtBreak -> pStmtBreak(node)
            is StmtContinue -> pStmtContinue(node)
            is StmtReturn -> pStmtReturn(node)
            is StmtThrow -> pStmtThrow(node)
            is StmtLabel -> pStmtLabel(node)
            is StmtGoto -> pStmtGoto(node)
            is StmtIf -> pStmtIf(node)
            is StmtSwitch -> pStmtSwitch(node)
            is StmtTryCatch -> pStmtTryCatch(node)
            is StmtFor -> pStmtFor(node)
            is StmtForeach -> pStmtForeach(node)
            is StmtWhile -> pStmtWhile(node)
            is StmtDo -> pStmtDo(node)
            is StmtTraitUse -> pStmtTraitUse(node)
            is StmtTraitUseAdaptationAlias -> pStmtTraitUseAdaptationAlias(node)
            is StmtTraitUseAdaptationPrecedence -> pStmtTraitUseAdaptationPrecedence(node)
            else -> throw Exception("不支持的 php.ast.node 类型: \$\{node::class.qualifiedName}")
        }
    }


    private fun pExprArray(node: ExprArray): kt.ast.ExprArray {
        return kt.ast.ExprArray(
            items = p(node.items, List<ExprArrayItem?>::class)
        )
    }


    private fun pExprArrayItem(node: ExprArrayItem): kt.ast.ExprArrayItem {
        return kt.ast.ExprArrayItem(
            key = p(node.key, Expr?::class),
            value = p(node.value, Expr::class),
            byRef = p(node.byRef, Boolean::class),
            unpack = p(node.unpack, Boolean::class)
        )
    }


    private fun pExprExit(node: ExprExit): kt.ast.ExprExit {
        return kt.ast.ExprExit(
            expr = p(node.expr, Expr?::class)
        )
    }


    private fun pExprList(node: ExprList): kt.ast.ExprList {
        return kt.ast.ExprList(
            items = p(node.items, List<ExprArrayItem?>::class)
        )
    }


    private fun pExprTernary(node: ExprTernary): kt.ast.ExprTernary {
        return kt.ast.ExprTernary(
            cond = p(node.cond, Expr::class),
            `if` = p(node.`if`, Expr?::class),
            `else` = p(node.`else`, Expr::class)
        )
    }


    private fun pExprThrow(node: ExprThrow): kt.ast.ExprThrow {
        return kt.ast.ExprThrow(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprYield(node: ExprYield): kt.ast.ExprYield {
        return kt.ast.ExprYield(
            key = p(node.key, Expr?::class),
            value = p(node.value, Expr?::class)
        )
    }


    private fun pExprYieldFrom(node: ExprYieldFrom): kt.ast.ExprYieldFrom {
        return kt.ast.ExprYieldFrom(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprVariableSimple(node: ExprVariable.ExprVariableSimple): kt.ast.ExprVariable.ExprVariableSimple {
        return kt.ast.ExprVariable.ExprVariableSimple(
            name = p(node.name, String::class)
        )
    }


    private fun pExprVariableDynamic(node: ExprVariable.ExprVariableDynamic): kt.ast.ExprVariable.ExprVariableDynamic {
        return kt.ast.ExprVariable.ExprVariableDynamic(
            name = p(node.name, Expr::class)
        )
    }


    private fun pExprInstanceofName(node: ExprInstanceof.ExprInstanceofName): kt.ast.ExprInstanceof.ExprInstanceofName {
        return kt.ast.ExprInstanceof.ExprInstanceofName(
            expr = p(node.expr, Expr::class),
            `class` = pExprInstanceofName(node.`class`)
        )
    }


    private fun pExprInstanceofVariable(node: ExprInstanceof.ExprInstanceofVariable): kt.ast.ExprInstanceof.ExprInstanceofVariable {
        return kt.ast.ExprInstanceof.ExprInstanceofVariable(
            expr = p(node.expr, Expr::class),
            `class` = p(node.`class`, ExprVariable::class)
        )
    }


    private fun pExprAssign(node: ExprAssign): kt.ast.ExprAssign {
        return kt.ast.ExprAssign(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignRef(node: ExprAssignRef): kt.ast.ExprAssignRef {
        return kt.ast.ExprAssignRef(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpBitwiseAnd(node: ExprAssignOpBitwiseAnd): kt.ast.ExprAssignOpBitwiseAnd {
        return kt.ast.ExprAssignOpBitwiseAnd(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpBitwiseOr(node: ExprAssignOpBitwiseOr): kt.ast.ExprAssignOpBitwiseOr {
        return kt.ast.ExprAssignOpBitwiseOr(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpBitwiseXor(node: ExprAssignOpBitwiseXor): kt.ast.ExprAssignOpBitwiseXor {
        return kt.ast.ExprAssignOpBitwiseXor(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpConcat(node: ExprAssignOpConcat): kt.ast.ExprAssignOpConcat {
        return kt.ast.ExprAssignOpConcat(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpDiv(node: ExprAssignOpDiv): kt.ast.ExprAssignOpDiv {
        return kt.ast.ExprAssignOpDiv(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpMinus(node: ExprAssignOpMinus): kt.ast.ExprAssignOpMinus {
        return kt.ast.ExprAssignOpMinus(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpMod(node: ExprAssignOpMod): kt.ast.ExprAssignOpMod {
        return kt.ast.ExprAssignOpMod(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpMul(node: ExprAssignOpMul): kt.ast.ExprAssignOpMul {
        return kt.ast.ExprAssignOpMul(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpPlus(node: ExprAssignOpPlus): kt.ast.ExprAssignOpPlus {
        return kt.ast.ExprAssignOpPlus(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpPow(node: ExprAssignOpPow): kt.ast.ExprAssignOpPow {
        return kt.ast.ExprAssignOpPow(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpShiftLeft(node: ExprAssignOpShiftLeft): kt.ast.ExprAssignOpShiftLeft {
        return kt.ast.ExprAssignOpShiftLeft(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprAssignOpShiftRight(node: ExprAssignOpShiftRight): kt.ast.ExprAssignOpShiftRight {
        return kt.ast.ExprAssignOpShiftRight(
            `var` = p(node.`var`, Expr::class),
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprBinaryOpBitwiseAnd(node: ExprBinaryOpBitwiseAnd): kt.ast.ExprBinaryOpBitwiseAnd {
        return kt.ast.ExprBinaryOpBitwiseAnd(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpBitwiseOr(node: ExprBinaryOpBitwiseOr): kt.ast.ExprBinaryOpBitwiseOr {
        return kt.ast.ExprBinaryOpBitwiseOr(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpBitwiseXor(node: ExprBinaryOpBitwiseXor): kt.ast.ExprBinaryOpBitwiseXor {
        return kt.ast.ExprBinaryOpBitwiseXor(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpBooleanAnd(node: ExprBinaryOpBooleanAnd): kt.ast.ExprBinaryOpBooleanAnd {
        return kt.ast.ExprBinaryOpBooleanAnd(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpBooleanOr(node: ExprBinaryOpBooleanOr): kt.ast.ExprBinaryOpBooleanOr {
        return kt.ast.ExprBinaryOpBooleanOr(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpCoalesce(node: ExprBinaryOpCoalesce): kt.ast.ExprBinaryOpCoalesce {
        return kt.ast.ExprBinaryOpCoalesce(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpConcat(node: ExprBinaryOpConcat): kt.ast.ExprBinaryOpConcat {
        return kt.ast.ExprBinaryOpConcat(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpDiv(node: ExprBinaryOpDiv): kt.ast.ExprBinaryOpDiv {
        return kt.ast.ExprBinaryOpDiv(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpEqual(node: ExprBinaryOpEqual): kt.ast.ExprBinaryOpEqual {
        return kt.ast.ExprBinaryOpEqual(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpGreater(node: ExprBinaryOpGreater): kt.ast.ExprBinaryOpGreater {
        return kt.ast.ExprBinaryOpGreater(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpGreaterOrEqual(node: ExprBinaryOpGreaterOrEqual): kt.ast.ExprBinaryOpGreaterOrEqual {
        return kt.ast.ExprBinaryOpGreaterOrEqual(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpIdentical(node: ExprBinaryOpIdentical): kt.ast.ExprBinaryOpIdentical {
        return kt.ast.ExprBinaryOpIdentical(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpLogicalAnd(node: ExprBinaryOpLogicalAnd): kt.ast.ExprBinaryOpLogicalAnd {
        return kt.ast.ExprBinaryOpLogicalAnd(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpLogicalOr(node: ExprBinaryOpLogicalOr): kt.ast.ExprBinaryOpLogicalOr {
        return kt.ast.ExprBinaryOpLogicalOr(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpLogicalXor(node: ExprBinaryOpLogicalXor): kt.ast.ExprBinaryOpLogicalXor {
        return kt.ast.ExprBinaryOpLogicalXor(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpMinus(node: ExprBinaryOpMinus): kt.ast.ExprBinaryOpMinus {
        return kt.ast.ExprBinaryOpMinus(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpMod(node: ExprBinaryOpMod): kt.ast.ExprBinaryOpMod {
        return kt.ast.ExprBinaryOpMod(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpMul(node: ExprBinaryOpMul): kt.ast.ExprBinaryOpMul {
        return kt.ast.ExprBinaryOpMul(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpNotEqual(node: ExprBinaryOpNotEqual): kt.ast.ExprBinaryOpNotEqual {
        return kt.ast.ExprBinaryOpNotEqual(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpNotIdentical(node: ExprBinaryOpNotIdentical): kt.ast.ExprBinaryOpNotIdentical {
        return kt.ast.ExprBinaryOpNotIdentical(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpPlus(node: ExprBinaryOpPlus): kt.ast.ExprBinaryOpPlus {
        return kt.ast.ExprBinaryOpPlus(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpPow(node: ExprBinaryOpPow): kt.ast.ExprBinaryOpPow {
        return kt.ast.ExprBinaryOpPow(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpShiftLeft(node: ExprBinaryOpShiftLeft): kt.ast.ExprBinaryOpShiftLeft {
        return kt.ast.ExprBinaryOpShiftLeft(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpShiftRight(node: ExprBinaryOpShiftRight): kt.ast.ExprBinaryOpShiftRight {
        return kt.ast.ExprBinaryOpShiftRight(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpSmaller(node: ExprBinaryOpSmaller): kt.ast.ExprBinaryOpSmaller {
        return kt.ast.ExprBinaryOpSmaller(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpSmallerOrEqual(node: ExprBinaryOpSmallerOrEqual): kt.ast.ExprBinaryOpSmallerOrEqual {
        return kt.ast.ExprBinaryOpSmallerOrEqual(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprBinaryOpSpaceship(node: ExprBinaryOpSpaceship): kt.ast.ExprBinaryOpSpaceship {
        return kt.ast.ExprBinaryOpSpaceship(
            left = p(node.left, Expr::class),
            right = p(node.right, Expr::class)
        )
    }


    private fun pExprCastArray(node: ExprCastArray): kt.ast.ExprCastArray {
        return kt.ast.ExprCastArray(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprCastBool(node: ExprCastBool): kt.ast.ExprCastBool {
        return kt.ast.ExprCastBool(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprCastDouble(node: ExprCastDouble): kt.ast.ExprCastDouble {
        return kt.ast.ExprCastDouble(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprCastInt(node: ExprCastInt): kt.ast.ExprCastInt {
        return kt.ast.ExprCastInt(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprCastObject(node: ExprCastObject): kt.ast.ExprCastObject {
        return kt.ast.ExprCastObject(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprCastString(node: ExprCastString): kt.ast.ExprCastString {
        return kt.ast.ExprCastString(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprClosure(node: ExprClosure): kt.ast.ExprClosure {
        return kt.ast.ExprClosure(
            static = p(node.static, Boolean::class),
            byRef = p(node.byRef, Boolean::class),
            params = p(node.params, List<Param>::class),
            uses = p(node.uses, List<ExprClosureUse>::class),
            returnType = p(node.returnType, TypeHint?::class),
            stmts = p(node.stmts, List<Stmt>::class)
        )
    }


    private fun pExprClosureUse(node: ExprClosureUse): kt.ast.ExprClosureUse {
        return kt.ast.ExprClosureUse(
            `var` = p(node.`var`, ExprVariable::class),
            byRef = p(node.byRef, Boolean::class)
        )
    }


    private fun pFuncRefStatic(node: FuncRef.FuncRefStatic): kt.ast.FuncRef.FuncRefStatic {
        return kt.ast.FuncRef.FuncRefStatic(
            `class` = pFuncRefStatic(node.`class`)
        )
    }


    private fun pFuncRefDynamic(node: FuncRef.FuncRefDynamic): kt.ast.FuncRef.FuncRefDynamic {
        return kt.ast.FuncRef.FuncRefDynamic(
            `class` = p(node.`class`, Expr::class)
        )
    }


    private fun pClassRefStatic(node: ClassRef.ClassRefStatic): kt.ast.ClassRef.ClassRefStatic {
        return kt.ast.ClassRef.ClassRefStatic(
            name = pClassRefStatic(node.name)
        )
    }


    private fun pClassRefDynamic(node: ClassRef.ClassRefDynamic): kt.ast.ClassRef.ClassRefDynamic {
        return kt.ast.ClassRef.ClassRefDynamic(
            name = p(node.name, Expr::class)
        )
    }


    private fun pPropertyRefStatic(node: PropertyRef.PropertyRefStatic): kt.ast.PropertyRef.PropertyRefStatic {
        return kt.ast.PropertyRef.PropertyRefStatic(
            name = pPropertyRefStatic(node.name)
        )
    }


    private fun pPropertyRefDynamic(node: PropertyRef.PropertyRefDynamic): kt.ast.PropertyRef.PropertyRefDynamic {
        return kt.ast.PropertyRef.PropertyRefDynamic(
            name = p(node.name, Expr::class)
        )
    }


    private fun pMethodRefStatic(node: MethodRef.MethodRefStatic): kt.ast.MethodRef.MethodRefStatic {
        return kt.ast.MethodRef.MethodRefStatic(
            name = pMethodRefStatic(node.name)
        )
    }


    private fun pMethodRefDynamic(node: MethodRef.MethodRefDynamic): kt.ast.MethodRef.MethodRefDynamic {
        return kt.ast.MethodRef.MethodRefDynamic(
            name = p(node.name, Expr::class)
        )
    }


    private fun pExprArrayDimFetch(node: ExprArrayDimFetch): kt.ast.ExprArrayDimFetch {
        return kt.ast.ExprArrayDimFetch(
            `var` = p(node.`var`, Expr::class),
            dim = p(node.dim, Expr?::class)
        )
    }


    private fun pExprClassConstFetch(node: ExprClassConstFetch): kt.ast.ExprClassConstFetch {
        return kt.ast.ExprClassConstFetch(
            `class` = p(node.`class`, ClassRef::class),
            name = pExprClassConstFetch(node.name)
        )
    }


    private fun pExprConstFetch(node: ExprConstFetch): kt.ast.ExprConstFetch {
        return kt.ast.ExprConstFetch(
            name = pExprConstFetch(node.name)
        )
    }


    private fun pExprPropertyFetch(node: ExprPropertyFetch): kt.ast.ExprPropertyFetch {
        return kt.ast.ExprPropertyFetch(
            `var` = p(node.`var`, Expr::class),
            name = p(node.name, PropertyRef::class)
        )
    }


    private fun pExprStaticPropertyFetch(node: ExprStaticPropertyFetch): kt.ast.ExprStaticPropertyFetch {
        return kt.ast.ExprStaticPropertyFetch(
            `class` = p(node.`class`, ClassRef::class),
            name = p(node.name, PropertyRef::class)
        )
    }


    private fun pExprFuncCall(node: ExprFuncCall): kt.ast.ExprFuncCall {
        return kt.ast.ExprFuncCall(
            name = p(node.name, FuncRef::class),
            args = p(node.args, List<Arg>::class)
        )
    }


    private fun pExprMethodCall(node: ExprMethodCall): kt.ast.ExprMethodCall {
        return kt.ast.ExprMethodCall(
            `var` = p(node.`var`, Expr::class),
            name = p(node.name, MethodRef::class),
            args = p(node.args, List<Arg>::class)
        )
    }


    private fun pExprStaticCall(node: ExprStaticCall): kt.ast.ExprStaticCall {
        return kt.ast.ExprStaticCall(
            `class` = p(node.`class`, ClassRef::class),
            name = p(node.name, MethodRef::class),
            args = p(node.args, List<Arg>::class)
        )
    }


    private fun pExprNewStatic(node: ExprNew.ExprNewStatic): kt.ast.ExprNew.ExprNewStatic {
        return kt.ast.ExprNew.ExprNewStatic(
            `class` = pExprNewStatic(node.`class`),
            args = p(node.args, List<Arg>::class)
        )
    }


    private fun pExprNewDynamic(node: ExprNew.ExprNewDynamic): kt.ast.ExprNew.ExprNewDynamic {
        return kt.ast.ExprNew.ExprNewDynamic(
            `class` = p(node.`class`, Expr::class),
            args = p(node.args, List<Arg>::class)
        )
    }


    private fun pExprNewAnonymous(node: ExprNew.ExprNewAnonymous): kt.ast.ExprNew.ExprNewAnonymous {
        return kt.ast.ExprNew.ExprNewAnonymous(
            `class` = pExprNewAnonymous(node.`class`),
            args = p(node.args, List<Arg>::class)
        )
    }


    private fun pExprEmpty(node: ExprEmpty): kt.ast.ExprEmpty {
        return kt.ast.ExprEmpty(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprInclude(node: ExprInclude): kt.ast.ExprInclude {
        return kt.ast.ExprInclude(
            expr = p(node.expr, Expr::class),
            type = p(node.type, Int::class)
        )
    }


    private fun pExprIsset(node: ExprIsset): kt.ast.ExprIsset {
        return kt.ast.ExprIsset(
            vars = p(node.vars, List<Expr>::class)
        )
    }


    private fun pExprClone(node: ExprClone): kt.ast.ExprClone {
        return kt.ast.ExprClone(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprBitwiseNot(node: ExprBitwiseNot): kt.ast.ExprBitwiseNot {
        return kt.ast.ExprBitwiseNot(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprBooleanNot(node: ExprBooleanNot): kt.ast.ExprBooleanNot {
        return kt.ast.ExprBooleanNot(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprErrorSuppress(node: ExprErrorSuppress): kt.ast.ExprErrorSuppress {
        return kt.ast.ExprErrorSuppress(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprPostDec(node: ExprPostDec): kt.ast.ExprPostDec {
        return kt.ast.ExprPostDec(
            `var` = p(node.`var`, Expr::class)
        )
    }


    private fun pExprPostInc(node: ExprPostInc): kt.ast.ExprPostInc {
        return kt.ast.ExprPostInc(
            `var` = p(node.`var`, Expr::class)
        )
    }


    private fun pExprPreDec(node: ExprPreDec): kt.ast.ExprPreDec {
        return kt.ast.ExprPreDec(
            `var` = p(node.`var`, Expr::class)
        )
    }


    private fun pExprPreInc(node: ExprPreInc): kt.ast.ExprPreInc {
        return kt.ast.ExprPreInc(
            `var` = p(node.`var`, Expr::class)
        )
    }


    private fun pExprPrint(node: ExprPrint): kt.ast.ExprPrint {
        return kt.ast.ExprPrint(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprUnaryMinus(node: ExprUnaryMinus): kt.ast.ExprUnaryMinus {
        return kt.ast.ExprUnaryMinus(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pExprUnaryPlus(node: ExprUnaryPlus): kt.ast.ExprUnaryPlus {
        return kt.ast.ExprUnaryPlus(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pArg(node: Arg): kt.ast.Arg {
        return kt.ast.Arg(
            value = p(node.value, Expr::class),
            byRef = p(node.byRef, Boolean::class),
            unpack = p(node.unpack, Boolean::class)
        )
    }


    private fun pParam(node: Param): kt.ast.Param {
        return kt.ast.Param(
            type = p(node.type, TypeHint?::class),
            byRef = p(node.byRef, Boolean::class),
            variadic = p(node.variadic, Boolean::class),
            `var` = p(node.`var`, ExprVariable::class),
            default = p(node.default, Expr?::class)
        )
    }


    private fun pTypeHint(node: TypeHint): kt.ast.TypeHint {
        return kt.ast.TypeHint(
            name = p(node.name, String::class),
            nullable = p(node.nullable, Boolean::class),
            isBuiltin = p(node.isBuiltin, Boolean::class)
        )
    }


    private fun pIdentifier(node: Identifier): kt.ast.Identifier {
        return kt.ast.Identifier(
            name = p(node.name, String::class),
            varLike = p(node.varLike, Boolean::class)
        )
    }


    private fun pName(node: Name): kt.ast.Name {
        return kt.ast.Name(
            parts = p(node.parts, List<String>::class),
            fullyQualified = p(node.fullyQualified, Boolean::class)
        )
    }


    private fun pScalarDNumber(node: ScalarDNumber): kt.ast.ScalarDNumber {
        return kt.ast.ScalarDNumber(
            value = p(node.value, Double::class)
        )
    }


    private fun pScalarEncapsed(node: ScalarEncapsed): kt.ast.ScalarEncapsed {
        return kt.ast.ScalarEncapsed(
            parts = p(node.parts, List<Expr>::class)
        )
    }


    private fun pScalarEncapsedStringPart(node: ScalarEncapsedStringPart): kt.ast.ScalarEncapsedStringPart {
        return kt.ast.ScalarEncapsedStringPart(
            value = p(node.value, String::class)
        )
    }


    private fun pScalarLNumber(node: ScalarLNumber): kt.ast.ScalarLNumber {
        return kt.ast.ScalarLNumber(
            value = p(node.value, Int::class)
        )
    }


    private fun pScalarString(node: ScalarString): kt.ast.ScalarString {
        return kt.ast.ScalarString(
            value = p(node.value, String::class)
        )
    }


    private fun pScalarMagicConstClass(node: ScalarMagicConstClass): kt.ast.ScalarMagicConstClass {
        return kt.ast.ScalarMagicConstClass(

        )
    }


    private fun pScalarMagicConstDir(node: ScalarMagicConstDir): kt.ast.ScalarMagicConstDir {
        return kt.ast.ScalarMagicConstDir(

        )
    }


    private fun pScalarMagicConstFile(node: ScalarMagicConstFile): kt.ast.ScalarMagicConstFile {
        return kt.ast.ScalarMagicConstFile(

        )
    }


    private fun pScalarMagicConstFunction(node: ScalarMagicConstFunction): kt.ast.ScalarMagicConstFunction {
        return kt.ast.ScalarMagicConstFunction(

        )
    }


    private fun pScalarMagicConstLine(node: ScalarMagicConstLine): kt.ast.ScalarMagicConstLine {
        return kt.ast.ScalarMagicConstLine(

        )
    }


    private fun pScalarMagicConstMethod(node: ScalarMagicConstMethod): kt.ast.ScalarMagicConstMethod {
        return kt.ast.ScalarMagicConstMethod(

        )
    }


    private fun pScalarMagicConstNamespace(node: ScalarMagicConstNamespace): kt.ast.ScalarMagicConstNamespace {
        return kt.ast.ScalarMagicConstNamespace(

        )
    }


    private fun pScalarMagicConstTrait(node: ScalarMagicConstTrait): kt.ast.ScalarMagicConstTrait {
        return kt.ast.ScalarMagicConstTrait(

        )
    }


    private fun pStmtConst(node: StmtConst): kt.ast.StmtConst {
        return kt.ast.StmtConst(
            name = pStmtConst(node.name),
            value = p(node.value, Expr::class)
        )
    }


    private fun pStmtDeclare(node: StmtDeclare): kt.ast.StmtDeclare {
        return kt.ast.StmtDeclare(
            declares = p(node.declares, List<Pair<Identifier, Expr>>::class),
            stmts = p(node.stmts, List<Stmt>?::class)
        )
    }


    private fun pStmtNamespace(node: StmtNamespace): kt.ast.StmtNamespace {
        return kt.ast.StmtNamespace(
            name = p(node.name, Name?::class),
            stmts = p(node.stmts, List<Stmt>::class)
        )
    }


    private fun pStmtEcho(node: StmtEcho): kt.ast.StmtEcho {
        return kt.ast.StmtEcho(
            exprs = p(node.exprs, List<Expr>::class)
        )
    }


    private fun pStmtExpression(node: StmtExpression): kt.ast.StmtExpression {
        return kt.ast.StmtExpression(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pStmtFunction(node: StmtFunction): kt.ast.StmtFunction {
        return kt.ast.StmtFunction(
            byRef = p(node.byRef, Boolean::class),
            name = pStmtFunction(node.name),
            params = p(node.params, List<Param>::class),
            returnType = p(node.returnType, TypeHint?::class),
            stmts = p(node.stmts, List<Stmt>::class),
            namespacedName = pStmtFunction(node.namespacedName)
        )
    }


    private fun pStmtGlobal(node: StmtGlobal): kt.ast.StmtGlobal {
        return kt.ast.StmtGlobal(
            vars = p(node.vars, List<Expr>::class)
        )
    }


    private fun pStmtInlineHTML(node: StmtInlineHTML): kt.ast.StmtInlineHTML {
        return kt.ast.StmtInlineHTML(
            value = p(node.value, String::class)
        )
    }


    private fun pStmtNop(node: StmtNop): kt.ast.StmtNop {
        return kt.ast.StmtNop(

        )
    }


    private fun pStmtStatic(node: StmtStatic): kt.ast.StmtStatic {
        return kt.ast.StmtStatic(
            vars = p(node.vars, List<StmtStaticVar>::class)
        )
    }


    private fun pStmtStaticVar(node: StmtStaticVar): kt.ast.StmtStaticVar {
        return kt.ast.StmtStaticVar(
            `var` = p(node.`var`, ExprVariable::class),
            default = p(node.default, Expr?::class)
        )
    }


    private fun pStmtUnset(node: StmtUnset): kt.ast.StmtUnset {
        return kt.ast.StmtUnset(
            vars = p(node.vars, List<Expr>::class)
        )
    }


    private fun pStmtClassConst(node: StmtClassConst): kt.ast.StmtClassConst {
        return kt.ast.StmtClassConst(
            flags = p(node.flags, Int::class),
            name = pStmtClassConst(node.name),
            value = p(node.value, Expr::class)
        )
    }


    private fun pStmtProperty(node: StmtProperty): kt.ast.StmtProperty {
        return kt.ast.StmtProperty(
            flags = p(node.flags, Int::class),
            name = pStmtProperty(node.name),
            default = p(node.default, Expr?::class)
        )
    }


    private fun pStmtClassMethod(node: StmtClassMethod): kt.ast.StmtClassMethod {
        return kt.ast.StmtClassMethod(
            flags = p(node.flags, Int::class),
            byRef = p(node.byRef, Boolean::class),
            name = pStmtClassMethod(node.name),
            params = p(node.params, List<Param>::class),
            returnType = p(node.returnType, TypeHint?::class),
            stmts = p(node.stmts, List<Stmt>?::class)
        )
    }


    private fun pStmtClass(node: StmtClass): kt.ast.StmtClass {
        return kt.ast.StmtClass(
            flags = p(node.flags, Int::class),
            extends = p(node.extends, Name?::class),
            implements = p(node.implements, List<Name>::class),
            name = p(node.name, Identifier?::class),
            stmts = p(node.stmts, List<Stmt>::class),
            namespacedName = pStmtClass(node.namespacedName)
        )
    }


    private fun pStmtInterface(node: StmtInterface): kt.ast.StmtInterface {
        return kt.ast.StmtInterface(
            extends = p(node.extends, List<Name>::class),
            name = pStmtInterface(node.name),
            stmts = p(node.stmts, List<Stmt>::class),
            namespacedName = pStmtInterface(node.namespacedName)
        )
    }


    private fun pStmtTrait(node: StmtTrait): kt.ast.StmtTrait {
        return kt.ast.StmtTrait(
            name = pStmtTrait(node.name),
            stmts = p(node.stmts, List<Stmt>::class),
            namespacedName = pStmtTrait(node.namespacedName)
        )
    }


    private fun pStmtBreak(node: StmtBreak): kt.ast.StmtBreak {
        return kt.ast.StmtBreak(
            num = p(node.num, Expr?::class)
        )
    }


    private fun pStmtContinue(node: StmtContinue): kt.ast.StmtContinue {
        return kt.ast.StmtContinue(
            num = p(node.num, Expr?::class)
        )
    }


    private fun pStmtReturn(node: StmtReturn): kt.ast.StmtReturn {
        return kt.ast.StmtReturn(
            expr = p(node.expr, Expr?::class)
        )
    }


    private fun pStmtThrow(node: StmtThrow): kt.ast.StmtThrow {
        return kt.ast.StmtThrow(
            expr = p(node.expr, Expr::class)
        )
    }


    private fun pStmtLabel(node: StmtLabel): kt.ast.StmtLabel {
        return kt.ast.StmtLabel(
            name = pStmtLabel(node.name)
        )
    }


    private fun pStmtGoto(node: StmtGoto): kt.ast.StmtGoto {
        return kt.ast.StmtGoto(
            name = pStmtGoto(node.name)
        )
    }


    private fun pStmtIf(node: StmtIf): kt.ast.StmtIf {
        return kt.ast.StmtIf(
            branches = p(node.branches, List<Pair<Expr, List<Stmt>>>::class),
            defaultBranch = p(node.defaultBranch, List<Stmt>?::class)
        )
    }


    private fun pStmtSwitch(node: StmtSwitch): kt.ast.StmtSwitch {
        return kt.ast.StmtSwitch(
            cond = p(node.cond, Expr::class),
            cases = p(node.cases, List<Pair<Expr?, List<Stmt>>>::class)
        )
    }


    private fun pStmtTryCatch(node: StmtTryCatch): kt.ast.StmtTryCatch {
        return kt.ast.StmtTryCatch(
            stmts = p(node.stmts, List<Stmt>::class),
            catches = p(node.catches, List<CatchBranch>::class),
            finally = p(node.finally, List<Stmt>?::class)
        )
    }


    private fun pStmtFor(node: StmtFor): kt.ast.StmtFor {
        return kt.ast.StmtFor(
            init = p(node.init, List<Expr>::class),
            cond = p(node.cond, List<Expr>::class),
            loop = p(node.loop, List<Expr>::class),
            stmts = p(node.stmts, List<Stmt>::class)
        )
    }


    private fun pStmtForeach(node: StmtForeach): kt.ast.StmtForeach {
        return kt.ast.StmtForeach(
            expr = p(node.expr, Expr::class),
            keyVar = p(node.keyVar, Expr?::class),
            byRef = p(node.byRef, Boolean::class),
            valueVar = p(node.valueVar, Expr::class),
            stmts = p(node.stmts, List<Stmt>::class)
        )
    }


    private fun pStmtWhile(node: StmtWhile): kt.ast.StmtWhile {
        return kt.ast.StmtWhile(
            cond = p(node.cond, Expr::class),
            stmts = p(node.stmts, List<Stmt>::class)
        )
    }


    private fun pStmtDo(node: StmtDo): kt.ast.StmtDo {
        return kt.ast.StmtDo(
            stmts = p(node.stmts, List<Stmt>::class),
            cond = p(node.cond, Expr::class)
        )
    }


    private fun pStmtTraitUse(node: StmtTraitUse): kt.ast.StmtTraitUse {
        return kt.ast.StmtTraitUse(
            traits = p(node.traits, List<Name>::class),
            adaptations = p(node.adaptations, List<StmtTraitUseAdaptation>::class)
        )
    }


    private fun pStmtTraitUseAdaptationAlias(node: StmtTraitUseAdaptationAlias): kt.ast.StmtTraitUseAdaptationAlias {
        return kt.ast.StmtTraitUseAdaptationAlias(
            newModifier = p(node.newModifier, Int?::class),
            newName = p(node.newName, Identifier?::class),
            trait = p(node.trait, Name?::class),
            method = pStmtTraitUseAdaptationAlias(node.method)
        )
    }


    private fun pStmtTraitUseAdaptationPrecedence(node: StmtTraitUseAdaptationPrecedence): kt.ast.StmtTraitUseAdaptationPrecedence {
        return kt.ast.StmtTraitUseAdaptationPrecedence(
            insteadof = p(node.insteadof, List<Name>::class),
            trait = p(node.trait, Name?::class),
            method = pStmtTraitUseAdaptationPrecedence(node.method)
        )
    }

}
