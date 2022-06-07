package php.parser

import php.parser.node.*

class NodeDecoder : NodeDecoderAbstract() {
    override fun tryResolveNode(nodeType: String, properties: ValueMap): Node? {
        return when (nodeType) {
            "Arg" -> decodeArg(properties)
            "Const" -> decodeConst(properties)
            "ExprArray" -> decodeExprArray(properties)
            "ExprArrayDimFetch" -> decodeExprArrayDimFetch(properties)
            "ExprArrayItem" -> decodeExprArrayItem(properties)
            "ExprAssign" -> decodeExprAssign(properties)
            "ExprAssignOpBitwiseAnd" -> decodeExprAssignOpBitwiseAnd(properties)
            "ExprAssignOpBitwiseOr" -> decodeExprAssignOpBitwiseOr(properties)
            "ExprAssignOpBitwiseXor" -> decodeExprAssignOpBitwiseXor(properties)
            "ExprAssignOpConcat" -> decodeExprAssignOpConcat(properties)
            "ExprAssignOpDiv" -> decodeExprAssignOpDiv(properties)
            "ExprAssignOpMinus" -> decodeExprAssignOpMinus(properties)
            "ExprAssignOpMod" -> decodeExprAssignOpMod(properties)
            "ExprAssignOpMul" -> decodeExprAssignOpMul(properties)
            "ExprAssignOpPlus" -> decodeExprAssignOpPlus(properties)
            "ExprAssignOpPow" -> decodeExprAssignOpPow(properties)
            "ExprAssignOpShiftLeft" -> decodeExprAssignOpShiftLeft(properties)
            "ExprAssignOpShiftRight" -> decodeExprAssignOpShiftRight(properties)
            "ExprAssignRef" -> decodeExprAssignRef(properties)
            "ExprBinaryOpBitwiseAnd" -> decodeExprBinaryOpBitwiseAnd(properties)
            "ExprBinaryOpBitwiseOr" -> decodeExprBinaryOpBitwiseOr(properties)
            "ExprBinaryOpBitwiseXor" -> decodeExprBinaryOpBitwiseXor(properties)
            "ExprBinaryOpBooleanAnd" -> decodeExprBinaryOpBooleanAnd(properties)
            "ExprBinaryOpBooleanOr" -> decodeExprBinaryOpBooleanOr(properties)
            "ExprBinaryOpCoalesce" -> decodeExprBinaryOpCoalesce(properties)
            "ExprBinaryOpConcat" -> decodeExprBinaryOpConcat(properties)
            "ExprBinaryOpDiv" -> decodeExprBinaryOpDiv(properties)
            "ExprBinaryOpEqual" -> decodeExprBinaryOpEqual(properties)
            "ExprBinaryOpGreater" -> decodeExprBinaryOpGreater(properties)
            "ExprBinaryOpGreaterOrEqual" -> decodeExprBinaryOpGreaterOrEqual(properties)
            "ExprBinaryOpIdentical" -> decodeExprBinaryOpIdentical(properties)
            "ExprBinaryOpLogicalAnd" -> decodeExprBinaryOpLogicalAnd(properties)
            "ExprBinaryOpLogicalOr" -> decodeExprBinaryOpLogicalOr(properties)
            "ExprBinaryOpLogicalXor" -> decodeExprBinaryOpLogicalXor(properties)
            "ExprBinaryOpMinus" -> decodeExprBinaryOpMinus(properties)
            "ExprBinaryOpMod" -> decodeExprBinaryOpMod(properties)
            "ExprBinaryOpMul" -> decodeExprBinaryOpMul(properties)
            "ExprBinaryOpNotEqual" -> decodeExprBinaryOpNotEqual(properties)
            "ExprBinaryOpNotIdentical" -> decodeExprBinaryOpNotIdentical(properties)
            "ExprBinaryOpPlus" -> decodeExprBinaryOpPlus(properties)
            "ExprBinaryOpPow" -> decodeExprBinaryOpPow(properties)
            "ExprBinaryOpShiftLeft" -> decodeExprBinaryOpShiftLeft(properties)
            "ExprBinaryOpShiftRight" -> decodeExprBinaryOpShiftRight(properties)
            "ExprBinaryOpSmaller" -> decodeExprBinaryOpSmaller(properties)
            "ExprBinaryOpSmallerOrEqual" -> decodeExprBinaryOpSmallerOrEqual(properties)
            "ExprBinaryOpSpaceship" -> decodeExprBinaryOpSpaceship(properties)
            "ExprBitwiseNot" -> decodeExprBitwiseNot(properties)
            "ExprBooleanNot" -> decodeExprBooleanNot(properties)
            "ExprCastArray" -> decodeExprCastArray(properties)
            "ExprCastBool" -> decodeExprCastBool(properties)
            "ExprCastDouble" -> decodeExprCastDouble(properties)
            "ExprCastInt" -> decodeExprCastInt(properties)
            "ExprCastObject" -> decodeExprCastObject(properties)
            "ExprCastString" -> decodeExprCastString(properties)
            "ExprCastUnset" -> decodeExprCastUnset(properties)
            "ExprClassConstFetch" -> decodeExprClassConstFetch(properties)
            "ExprClone" -> decodeExprClone(properties)
            "ExprClosure" -> decodeExprClosure(properties)
            "ExprClosureUse" -> decodeExprClosureUse(properties)
            "ExprConstFetch" -> decodeExprConstFetch(properties)
            "ExprEmpty" -> decodeExprEmpty(properties)
            "ExprError" -> decodeExprError(properties)
            "ExprErrorSuppress" -> decodeExprErrorSuppress(properties)
            "ExprEval" -> decodeExprEval(properties)
            "ExprExit" -> decodeExprExit(properties)
            "ExprFuncCall" -> decodeExprFuncCall(properties)
            "ExprInclude" -> decodeExprInclude(properties)
            "ExprInstanceof" -> decodeExprInstanceof(properties)
            "ExprIsset" -> decodeExprIsset(properties)
            "ExprList" -> decodeExprList(properties)
            "ExprMethodCall" -> decodeExprMethodCall(properties)
            "ExprNew" -> decodeExprNew(properties)
            "ExprPostDec" -> decodeExprPostDec(properties)
            "ExprPostInc" -> decodeExprPostInc(properties)
            "ExprPreDec" -> decodeExprPreDec(properties)
            "ExprPreInc" -> decodeExprPreInc(properties)
            "ExprPrint" -> decodeExprPrint(properties)
            "ExprPropertyFetch" -> decodeExprPropertyFetch(properties)
            "ExprShellExec" -> decodeExprShellExec(properties)
            "ExprStaticCall" -> decodeExprStaticCall(properties)
            "ExprStaticPropertyFetch" -> decodeExprStaticPropertyFetch(properties)
            "ExprTernary" -> decodeExprTernary(properties)
            "ExprThrow" -> decodeExprThrow(properties)
            "ExprUnaryMinus" -> decodeExprUnaryMinus(properties)
            "ExprUnaryPlus" -> decodeExprUnaryPlus(properties)
            "ExprVariable" -> decodeExprVariable(properties)
            "ExprYield" -> decodeExprYield(properties)
            "ExprYieldFrom" -> decodeExprYieldFrom(properties)
            "Identifier" -> decodeIdentifier(properties)
            "Name" -> decodeName(properties)
            "NameFullyQualified" -> decodeNameFullyQualified(properties)
            "NameRelative" -> decodeNameRelative(properties)
            "NullableType" -> decodeNullableType(properties)
            "Param" -> decodeParam(properties)
            "ScalarDNumber" -> decodeScalarDNumber(properties)
            "ScalarEncapsed" -> decodeScalarEncapsed(properties)
            "ScalarEncapsedStringPart" -> decodeScalarEncapsedStringPart(properties)
            "ScalarLNumber" -> decodeScalarLNumber(properties)
            "ScalarMagicConstClass" -> decodeScalarMagicConstClass(properties)
            "ScalarMagicConstDir" -> decodeScalarMagicConstDir(properties)
            "ScalarMagicConstFile" -> decodeScalarMagicConstFile(properties)
            "ScalarMagicConstFunction" -> decodeScalarMagicConstFunction(properties)
            "ScalarMagicConstLine" -> decodeScalarMagicConstLine(properties)
            "ScalarMagicConstMethod" -> decodeScalarMagicConstMethod(properties)
            "ScalarMagicConstNamespace" -> decodeScalarMagicConstNamespace(properties)
            "ScalarMagicConstTrait" -> decodeScalarMagicConstTrait(properties)
            "ScalarString" -> decodeScalarString(properties)
            "StmtBreak" -> decodeStmtBreak(properties)
            "StmtCase" -> decodeStmtCase(properties)
            "StmtCatch" -> decodeStmtCatch(properties)
            "StmtClass" -> decodeStmtClass(properties)
            "StmtClassConst" -> decodeStmtClassConst(properties)
            "StmtClassMethod" -> decodeStmtClassMethod(properties)
            "StmtConst" -> decodeStmtConst(properties)
            "StmtContinue" -> decodeStmtContinue(properties)
            "StmtDeclare" -> decodeStmtDeclare(properties)
            "StmtDeclareDeclare" -> decodeStmtDeclareDeclare(properties)
            "StmtDo" -> decodeStmtDo(properties)
            "StmtEcho" -> decodeStmtEcho(properties)
            "StmtElse" -> decodeStmtElse(properties)
            "StmtElseIf" -> decodeStmtElseIf(properties)
            "StmtExpression" -> decodeStmtExpression(properties)
            "StmtFinally" -> decodeStmtFinally(properties)
            "StmtFor" -> decodeStmtFor(properties)
            "StmtForeach" -> decodeStmtForeach(properties)
            "StmtFunction" -> decodeStmtFunction(properties)
            "StmtGlobal" -> decodeStmtGlobal(properties)
            "StmtGoto" -> decodeStmtGoto(properties)
            "StmtGroupUse" -> decodeStmtGroupUse(properties)
            "StmtHaltCompiler" -> decodeStmtHaltCompiler(properties)
            "StmtIf" -> decodeStmtIf(properties)
            "StmtInlineHTML" -> decodeStmtInlineHTML(properties)
            "StmtInterface" -> decodeStmtInterface(properties)
            "StmtLabel" -> decodeStmtLabel(properties)
            "StmtNamespace" -> decodeStmtNamespace(properties)
            "StmtNop" -> decodeStmtNop(properties)
            "StmtProperty" -> decodeStmtProperty(properties)
            "StmtPropertyProperty" -> decodeStmtPropertyProperty(properties)
            "StmtReturn" -> decodeStmtReturn(properties)
            "StmtStatic" -> decodeStmtStatic(properties)
            "StmtStaticVar" -> decodeStmtStaticVar(properties)
            "StmtSwitch" -> decodeStmtSwitch(properties)
            "StmtThrow" -> decodeStmtThrow(properties)
            "StmtTrait" -> decodeStmtTrait(properties)
            "StmtTraitUse" -> decodeStmtTraitUse(properties)
            "StmtTraitUseAdaptationAlias" -> decodeStmtTraitUseAdaptationAlias(properties)
            "StmtTraitUseAdaptationPrecedence" -> decodeStmtTraitUseAdaptationPrecedence(properties)
            "StmtTryCatch" -> decodeStmtTryCatch(properties)
            "StmtUnset" -> decodeStmtUnset(properties)
            "StmtUse" -> decodeStmtUse(properties)
            "StmtUseUse" -> decodeStmtUseUse(properties)
            "StmtWhile" -> decodeStmtWhile(properties)
            "VarLikeIdentifier" -> decodeVarLikeIdentifier(properties)
            else -> null
        }
    }

    private fun decodeArg(properties: ValueMap): Arg {
        return Arg(
            value = properties.getAs("value", Expr::class),
            byRef = properties.getAs("byRef", Boolean::class),
            unpack = properties.getAs("unpack", Boolean::class),
        )
    }
    private fun decodeConst(properties: ValueMap): Const {
        return Const(
            name = properties.getAs("name", Identifier::class),
            value = properties.getAs("value", Expr::class),
            namespacedName = properties.getAsOrNull("namespacedName", Name::class),
        )
    }
    private fun decodeExprArray(properties: ValueMap): ExprArray {
        return ExprArray(
            items = properties.getAsListOfNullable("items", ExprArrayItem::class),
        )
    }
    private fun decodeExprArrayDimFetch(properties: ValueMap): ExprArrayDimFetch {
        return ExprArrayDimFetch(
            `var` = properties.getAs("var", Expr::class),
            dim = properties.getAsOrNull("dim", Expr::class),
        )
    }
    private fun decodeExprArrayItem(properties: ValueMap): ExprArrayItem {
        return ExprArrayItem(
            key = properties.getAsOrNull("key", Expr::class),
            value = properties.getAs("value", Expr::class),
            byRef = properties.getAs("byRef", Boolean::class),
            unpack = properties.getAs("unpack", Boolean::class),
        )
    }
    private fun decodeExprAssign(properties: ValueMap): ExprAssign {
        return ExprAssign(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpBitwiseAnd(properties: ValueMap): ExprAssignOpBitwiseAnd {
        return ExprAssignOpBitwiseAnd(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpBitwiseOr(properties: ValueMap): ExprAssignOpBitwiseOr {
        return ExprAssignOpBitwiseOr(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpBitwiseXor(properties: ValueMap): ExprAssignOpBitwiseXor {
        return ExprAssignOpBitwiseXor(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpConcat(properties: ValueMap): ExprAssignOpConcat {
        return ExprAssignOpConcat(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpDiv(properties: ValueMap): ExprAssignOpDiv {
        return ExprAssignOpDiv(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpMinus(properties: ValueMap): ExprAssignOpMinus {
        return ExprAssignOpMinus(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpMod(properties: ValueMap): ExprAssignOpMod {
        return ExprAssignOpMod(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpMul(properties: ValueMap): ExprAssignOpMul {
        return ExprAssignOpMul(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpPlus(properties: ValueMap): ExprAssignOpPlus {
        return ExprAssignOpPlus(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpPow(properties: ValueMap): ExprAssignOpPow {
        return ExprAssignOpPow(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpShiftLeft(properties: ValueMap): ExprAssignOpShiftLeft {
        return ExprAssignOpShiftLeft(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignOpShiftRight(properties: ValueMap): ExprAssignOpShiftRight {
        return ExprAssignOpShiftRight(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprAssignRef(properties: ValueMap): ExprAssignRef {
        return ExprAssignRef(
            `var` = properties.getAs("var", Expr::class),
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprBinaryOpBitwiseAnd(properties: ValueMap): ExprBinaryOpBitwiseAnd {
        return ExprBinaryOpBitwiseAnd(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpBitwiseOr(properties: ValueMap): ExprBinaryOpBitwiseOr {
        return ExprBinaryOpBitwiseOr(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpBitwiseXor(properties: ValueMap): ExprBinaryOpBitwiseXor {
        return ExprBinaryOpBitwiseXor(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpBooleanAnd(properties: ValueMap): ExprBinaryOpBooleanAnd {
        return ExprBinaryOpBooleanAnd(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpBooleanOr(properties: ValueMap): ExprBinaryOpBooleanOr {
        return ExprBinaryOpBooleanOr(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpCoalesce(properties: ValueMap): ExprBinaryOpCoalesce {
        return ExprBinaryOpCoalesce(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpConcat(properties: ValueMap): ExprBinaryOpConcat {
        return ExprBinaryOpConcat(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpDiv(properties: ValueMap): ExprBinaryOpDiv {
        return ExprBinaryOpDiv(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpEqual(properties: ValueMap): ExprBinaryOpEqual {
        return ExprBinaryOpEqual(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpGreater(properties: ValueMap): ExprBinaryOpGreater {
        return ExprBinaryOpGreater(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpGreaterOrEqual(properties: ValueMap): ExprBinaryOpGreaterOrEqual {
        return ExprBinaryOpGreaterOrEqual(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpIdentical(properties: ValueMap): ExprBinaryOpIdentical {
        return ExprBinaryOpIdentical(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpLogicalAnd(properties: ValueMap): ExprBinaryOpLogicalAnd {
        return ExprBinaryOpLogicalAnd(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpLogicalOr(properties: ValueMap): ExprBinaryOpLogicalOr {
        return ExprBinaryOpLogicalOr(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpLogicalXor(properties: ValueMap): ExprBinaryOpLogicalXor {
        return ExprBinaryOpLogicalXor(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpMinus(properties: ValueMap): ExprBinaryOpMinus {
        return ExprBinaryOpMinus(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpMod(properties: ValueMap): ExprBinaryOpMod {
        return ExprBinaryOpMod(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpMul(properties: ValueMap): ExprBinaryOpMul {
        return ExprBinaryOpMul(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpNotEqual(properties: ValueMap): ExprBinaryOpNotEqual {
        return ExprBinaryOpNotEqual(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpNotIdentical(properties: ValueMap): ExprBinaryOpNotIdentical {
        return ExprBinaryOpNotIdentical(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpPlus(properties: ValueMap): ExprBinaryOpPlus {
        return ExprBinaryOpPlus(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpPow(properties: ValueMap): ExprBinaryOpPow {
        return ExprBinaryOpPow(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpShiftLeft(properties: ValueMap): ExprBinaryOpShiftLeft {
        return ExprBinaryOpShiftLeft(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpShiftRight(properties: ValueMap): ExprBinaryOpShiftRight {
        return ExprBinaryOpShiftRight(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpSmaller(properties: ValueMap): ExprBinaryOpSmaller {
        return ExprBinaryOpSmaller(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpSmallerOrEqual(properties: ValueMap): ExprBinaryOpSmallerOrEqual {
        return ExprBinaryOpSmallerOrEqual(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBinaryOpSpaceship(properties: ValueMap): ExprBinaryOpSpaceship {
        return ExprBinaryOpSpaceship(
            left = properties.getAs("left", Expr::class),
            right = properties.getAs("right", Expr::class),
        )
    }
    private fun decodeExprBitwiseNot(properties: ValueMap): ExprBitwiseNot {
        return ExprBitwiseNot(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprBooleanNot(properties: ValueMap): ExprBooleanNot {
        return ExprBooleanNot(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprCastArray(properties: ValueMap): ExprCastArray {
        return ExprCastArray(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprCastBool(properties: ValueMap): ExprCastBool {
        return ExprCastBool(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprCastDouble(properties: ValueMap): ExprCastDouble {
        return ExprCastDouble(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprCastInt(properties: ValueMap): ExprCastInt {
        return ExprCastInt(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprCastObject(properties: ValueMap): ExprCastObject {
        return ExprCastObject(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprCastString(properties: ValueMap): ExprCastString {
        return ExprCastString(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprCastUnset(properties: ValueMap): ExprCastUnset {
        return ExprCastUnset(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprClassConstFetch(properties: ValueMap): ExprClassConstFetch {
        return ExprClassConstFetch(
            `class` = properties.getAsAnyOf2("class", Name::class, Expr::class),
            name = properties.getAs("name", Identifier::class),
        )
    }
    private fun decodeExprClone(properties: ValueMap): ExprClone {
        return ExprClone(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprClosure(properties: ValueMap): ExprClosure {
        return ExprClosure(
            static = properties.getAs("static", Boolean::class),
            byRef = properties.getAs("byRef", Boolean::class),
            params = properties.getAsList("params", Param::class),
            uses = properties.getAsList("uses", ExprClosureUse::class),
            returnType = properties.getAsAnyOf3OrNull("returnType", Identifier::class, Name::class, ComplexType::class),
            stmts = properties.getAsList("stmts", Stmt::class),
        )
    }
    private fun decodeExprClosureUse(properties: ValueMap): ExprClosureUse {
        return ExprClosureUse(
            `var` = properties.getAs("var", ExprVariable::class),
            byRef = properties.getAs("byRef", Boolean::class),
        )
    }
    private fun decodeExprConstFetch(properties: ValueMap): ExprConstFetch {
        return ExprConstFetch(
            name = properties.getAs("name", Name::class),
        )
    }
    private fun decodeExprEmpty(properties: ValueMap): ExprEmpty {
        return ExprEmpty(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprError(properties: ValueMap): ExprError {
        return ExprError(
        )
    }
    private fun decodeExprErrorSuppress(properties: ValueMap): ExprErrorSuppress {
        return ExprErrorSuppress(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprEval(properties: ValueMap): ExprEval {
        return ExprEval(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprExit(properties: ValueMap): ExprExit {
        return ExprExit(
            expr = properties.getAsOrNull("expr", Expr::class),
        )
    }
    private fun decodeExprFuncCall(properties: ValueMap): ExprFuncCall {
        return ExprFuncCall(
            name = properties.getAsAnyOf2("name", Name::class, Expr::class),
            args = properties.getAsList("args", Arg::class),
        )
    }
    private fun decodeExprInclude(properties: ValueMap): ExprInclude {
        return ExprInclude(
            expr = properties.getAs("expr", Expr::class),
            type = properties.getAs("type", Int::class),
        )
    }
    private fun decodeExprInstanceof(properties: ValueMap): ExprInstanceof {
        return ExprInstanceof(
            expr = properties.getAs("expr", Expr::class),
            `class` = properties.getAsAnyOf2("class", Name::class, ExprVariable::class),
        )
    }
    private fun decodeExprIsset(properties: ValueMap): ExprIsset {
        return ExprIsset(
            vars = properties.getAsList("vars", Expr::class),
        )
    }
    private fun decodeExprList(properties: ValueMap): ExprList {
        return ExprList(
            items = properties.getAsListOfNullable("items", ExprArrayItem::class),
        )
    }
    private fun decodeExprMethodCall(properties: ValueMap): ExprMethodCall {
        return ExprMethodCall(
            `var` = properties.getAs("var", Expr::class),
            name = properties.getAsAnyOf2("name", Identifier::class, Expr::class),
            args = properties.getAsList("args", Arg::class),
        )
    }
    private fun decodeExprNew(properties: ValueMap): ExprNew {
        return ExprNew(
            `class` = properties.getAsAnyOf3("class", Name::class, Expr::class, StmtClass::class),
            args = properties.getAsList("args", Arg::class),
        )
    }
    private fun decodeExprPostDec(properties: ValueMap): ExprPostDec {
        return ExprPostDec(
            `var` = properties.getAs("var", Expr::class),
        )
    }
    private fun decodeExprPostInc(properties: ValueMap): ExprPostInc {
        return ExprPostInc(
            `var` = properties.getAs("var", Expr::class),
        )
    }
    private fun decodeExprPreDec(properties: ValueMap): ExprPreDec {
        return ExprPreDec(
            `var` = properties.getAs("var", Expr::class),
        )
    }
    private fun decodeExprPreInc(properties: ValueMap): ExprPreInc {
        return ExprPreInc(
            `var` = properties.getAs("var", Expr::class),
        )
    }
    private fun decodeExprPrint(properties: ValueMap): ExprPrint {
        return ExprPrint(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprPropertyFetch(properties: ValueMap): ExprPropertyFetch {
        return ExprPropertyFetch(
            `var` = properties.getAs("var", Expr::class),
            name = properties.getAsAnyOf2("name", Identifier::class, Expr::class),
        )
    }
    private fun decodeExprShellExec(properties: ValueMap): ExprShellExec {
        return ExprShellExec(
            parts = properties.getAsList("parts", Any::class),
        )
    }
    private fun decodeExprStaticCall(properties: ValueMap): ExprStaticCall {
        return ExprStaticCall(
            `class` = properties.getAsAnyOf2("class", Name::class, Expr::class),
            name = properties.getAsAnyOf2("name", Identifier::class, Expr::class),
            args = properties.getAsList("args", Arg::class),
        )
    }
    private fun decodeExprStaticPropertyFetch(properties: ValueMap): ExprStaticPropertyFetch {
        return ExprStaticPropertyFetch(
            `class` = properties.getAsAnyOf2("class", Name::class, Expr::class),
            name = properties.getAsAnyOf2("name", Identifier::class, Expr::class),
        )
    }
    private fun decodeExprTernary(properties: ValueMap): ExprTernary {
        return ExprTernary(
            cond = properties.getAs("cond", Expr::class),
            `if` = properties.getAsOrNull("if", Expr::class),
            `else` = properties.getAs("else", Expr::class),
        )
    }
    private fun decodeExprThrow(properties: ValueMap): ExprThrow {
        return ExprThrow(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprUnaryMinus(properties: ValueMap): ExprUnaryMinus {
        return ExprUnaryMinus(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprUnaryPlus(properties: ValueMap): ExprUnaryPlus {
        return ExprUnaryPlus(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeExprVariable(properties: ValueMap): ExprVariable {
        return ExprVariable(
            name = properties.getAsAnyOf2("name", String::class, Expr::class),
        )
    }
    private fun decodeExprYield(properties: ValueMap): ExprYield {
        return ExprYield(
            key = properties.getAsOrNull("key", Expr::class),
            value = properties.getAsOrNull("value", Expr::class),
        )
    }
    private fun decodeExprYieldFrom(properties: ValueMap): ExprYieldFrom {
        return ExprYieldFrom(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeIdentifier(properties: ValueMap): Identifier {
        return Identifier(
            name = properties.getAs("name", String::class),
        )
    }
    private fun decodeName(properties: ValueMap): Name {
        return Name(
            parts = properties.getAsList("parts", String::class),
        )
    }
    private fun decodeNameFullyQualified(properties: ValueMap): NameFullyQualified {
        return NameFullyQualified(
            parts = properties.getAsList("parts", String::class),
        )
    }
    private fun decodeNameRelative(properties: ValueMap): NameRelative {
        return NameRelative(
            parts = properties.getAsList("parts", String::class),
        )
    }
    private fun decodeNullableType(properties: ValueMap): NullableType {
        return NullableType(
            type = properties.getAsAnyOf2("type", Identifier::class, Name::class),
        )
    }
    private fun decodeParam(properties: ValueMap): Param {
        return Param(
            type = properties.getAsAnyOf3OrNull("type", Identifier::class, Name::class, ComplexType::class),
            byRef = properties.getAs("byRef", Boolean::class),
            variadic = properties.getAs("variadic", Boolean::class),
            `var` = properties.getAs("var", ExprVariable::class),
            default = properties.getAsOrNull("default", Expr::class),
        )
    }
    private fun decodeScalarDNumber(properties: ValueMap): ScalarDNumber {
        return ScalarDNumber(
            value = properties.getAs("value", Double::class),
        )
    }
    private fun decodeScalarEncapsed(properties: ValueMap): ScalarEncapsed {
        return ScalarEncapsed(
            parts = properties.getAsList("parts", Expr::class),
        )
    }
    private fun decodeScalarEncapsedStringPart(properties: ValueMap): ScalarEncapsedStringPart {
        return ScalarEncapsedStringPart(
            value = properties.getAs("value", String::class),
        )
    }
    private fun decodeScalarLNumber(properties: ValueMap): ScalarLNumber {
        return ScalarLNumber(
            value = properties.getAs("value", Int::class),
        )
    }
    private fun decodeScalarMagicConstClass(properties: ValueMap): ScalarMagicConstClass {
        return ScalarMagicConstClass(
        )
    }
    private fun decodeScalarMagicConstDir(properties: ValueMap): ScalarMagicConstDir {
        return ScalarMagicConstDir(
        )
    }
    private fun decodeScalarMagicConstFile(properties: ValueMap): ScalarMagicConstFile {
        return ScalarMagicConstFile(
        )
    }
    private fun decodeScalarMagicConstFunction(properties: ValueMap): ScalarMagicConstFunction {
        return ScalarMagicConstFunction(
        )
    }
    private fun decodeScalarMagicConstLine(properties: ValueMap): ScalarMagicConstLine {
        return ScalarMagicConstLine(
        )
    }
    private fun decodeScalarMagicConstMethod(properties: ValueMap): ScalarMagicConstMethod {
        return ScalarMagicConstMethod(
        )
    }
    private fun decodeScalarMagicConstNamespace(properties: ValueMap): ScalarMagicConstNamespace {
        return ScalarMagicConstNamespace(
        )
    }
    private fun decodeScalarMagicConstTrait(properties: ValueMap): ScalarMagicConstTrait {
        return ScalarMagicConstTrait(
        )
    }
    private fun decodeScalarString(properties: ValueMap): ScalarString {
        return ScalarString(
            value = properties.getAs("value", String::class),
        )
    }
    private fun decodeStmtBreak(properties: ValueMap): StmtBreak {
        return StmtBreak(
            num = properties.getAsOrNull("num", Expr::class),
        )
    }
    private fun decodeStmtCase(properties: ValueMap): StmtCase {
        return StmtCase(
            cond = properties.getAsOrNull("cond", Expr::class),
            stmts = properties.getAsList("stmts", Stmt::class),
        )
    }
    private fun decodeStmtCatch(properties: ValueMap): StmtCatch {
        return StmtCatch(
            types = properties.getAsList("types", Name::class),
            `var` = properties.getAs("var", ExprVariable::class),
            stmts = properties.getAsList("stmts", Stmt::class),
        )
    }
    private fun decodeStmtClass(properties: ValueMap): StmtClass {
        return StmtClass(
            flags = properties.getAs("flags", Int::class),
            extends = properties.getAsOrNull("extends", Name::class),
            implements = properties.getAsList("implements", Name::class),
            name = properties.getAsOrNull("name", Identifier::class),
            stmts = properties.getAsList("stmts", Stmt::class),
            namespacedName = properties.getAs("namespacedName", Name::class),
        )
    }
    private fun decodeStmtClassConst(properties: ValueMap): StmtClassConst {
        return StmtClassConst(
            flags = properties.getAs("flags", Int::class),
            consts = properties.getAsList("consts", Const::class),
        )
    }
    private fun decodeStmtClassMethod(properties: ValueMap): StmtClassMethod {
        return StmtClassMethod(
            flags = properties.getAs("flags", Int::class),
            byRef = properties.getAs("byRef", Boolean::class),
            name = properties.getAs("name", Identifier::class),
            params = properties.getAsList("params", Param::class),
            returnType = properties.getAsAnyOf3OrNull("returnType", Identifier::class, Name::class, ComplexType::class),
            stmts = properties.getAsListOrNull("stmts", Stmt::class),
        )
    }
    private fun decodeStmtConst(properties: ValueMap): StmtConst {
        return StmtConst(
            consts = properties.getAsList("consts", Const::class),
        )
    }
    private fun decodeStmtContinue(properties: ValueMap): StmtContinue {
        return StmtContinue(
            num = properties.getAsOrNull("num", Expr::class),
        )
    }
    private fun decodeStmtDeclare(properties: ValueMap): StmtDeclare {
        return StmtDeclare(
            declares = properties.getAsList("declares", StmtDeclareDeclare::class),
            stmts = properties.getAsListOrNull("stmts", Stmt::class),
        )
    }
    private fun decodeStmtDeclareDeclare(properties: ValueMap): StmtDeclareDeclare {
        return StmtDeclareDeclare(
            key = properties.getAs("key", Identifier::class),
            value = properties.getAs("value", Expr::class),
        )
    }
    private fun decodeStmtDo(properties: ValueMap): StmtDo {
        return StmtDo(
            stmts = properties.getAsList("stmts", Stmt::class),
            cond = properties.getAs("cond", Expr::class),
        )
    }
    private fun decodeStmtEcho(properties: ValueMap): StmtEcho {
        return StmtEcho(
            exprs = properties.getAsList("exprs", Expr::class),
        )
    }
    private fun decodeStmtElse(properties: ValueMap): StmtElse {
        return StmtElse(
            stmts = properties.getAsList("stmts", Stmt::class),
        )
    }
    private fun decodeStmtElseIf(properties: ValueMap): StmtElseIf {
        return StmtElseIf(
            cond = properties.getAs("cond", Expr::class),
            stmts = properties.getAsList("stmts", Stmt::class),
        )
    }
    private fun decodeStmtExpression(properties: ValueMap): StmtExpression {
        return StmtExpression(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeStmtFinally(properties: ValueMap): StmtFinally {
        return StmtFinally(
            stmts = properties.getAsList("stmts", Stmt::class),
        )
    }
    private fun decodeStmtFor(properties: ValueMap): StmtFor {
        return StmtFor(
            init = properties.getAsList("init", Expr::class),
            cond = properties.getAsList("cond", Expr::class),
            loop = properties.getAsList("loop", Expr::class),
            stmts = properties.getAsList("stmts", Stmt::class),
        )
    }
    private fun decodeStmtForeach(properties: ValueMap): StmtForeach {
        return StmtForeach(
            expr = properties.getAs("expr", Expr::class),
            keyVar = properties.getAsOrNull("keyVar", Expr::class),
            byRef = properties.getAs("byRef", Boolean::class),
            valueVar = properties.getAs("valueVar", Expr::class),
            stmts = properties.getAsList("stmts", Stmt::class),
        )
    }
    private fun decodeStmtFunction(properties: ValueMap): StmtFunction {
        return StmtFunction(
            byRef = properties.getAs("byRef", Boolean::class),
            name = properties.getAs("name", Identifier::class),
            params = properties.getAsList("params", Param::class),
            returnType = properties.getAsAnyOf3OrNull("returnType", Identifier::class, Name::class, ComplexType::class),
            stmts = properties.getAsList("stmts", Stmt::class),
            namespacedName = properties.getAs("namespacedName", Name::class),
        )
    }
    private fun decodeStmtGlobal(properties: ValueMap): StmtGlobal {
        return StmtGlobal(
            vars = properties.getAsList("vars", Expr::class),
        )
    }
    private fun decodeStmtGoto(properties: ValueMap): StmtGoto {
        return StmtGoto(
            name = properties.getAs("name", Identifier::class),
        )
    }
    private fun decodeStmtGroupUse(properties: ValueMap): StmtGroupUse {
        return StmtGroupUse(
            type = properties.getAs("type", Int::class),
            prefix = properties.getAs("prefix", Name::class),
            uses = properties.getAsList("uses", StmtUseUse::class),
        )
    }
    private fun decodeStmtHaltCompiler(properties: ValueMap): StmtHaltCompiler {
        return StmtHaltCompiler(
            remaining = properties.getAs("remaining", String::class),
        )
    }
    private fun decodeStmtIf(properties: ValueMap): StmtIf {
        return StmtIf(
            cond = properties.getAs("cond", Expr::class),
            stmts = properties.getAsList("stmts", Stmt::class),
            elseifs = properties.getAsList("elseifs", StmtElseIf::class),
            `else` = properties.getAsOrNull("else", StmtElse::class),
        )
    }
    private fun decodeStmtInlineHTML(properties: ValueMap): StmtInlineHTML {
        return StmtInlineHTML(
            value = properties.getAs("value", String::class),
        )
    }
    private fun decodeStmtInterface(properties: ValueMap): StmtInterface {
        return StmtInterface(
            extends = properties.getAsList("extends", Name::class),
            name = properties.getAsOrNull("name", Identifier::class),
            stmts = properties.getAsList("stmts", Stmt::class),
            namespacedName = properties.getAs("namespacedName", Name::class),
        )
    }
    private fun decodeStmtLabel(properties: ValueMap): StmtLabel {
        return StmtLabel(
            name = properties.getAs("name", Identifier::class),
        )
    }
    private fun decodeStmtNamespace(properties: ValueMap): StmtNamespace {
        return StmtNamespace(
            name = properties.getAsOrNull("name", Name::class),
            stmts = properties.getAsList("stmts", Stmt::class),
        )
    }
    private fun decodeStmtNop(properties: ValueMap): StmtNop {
        return StmtNop(
        )
    }
    private fun decodeStmtProperty(properties: ValueMap): StmtProperty {
        return StmtProperty(
            flags = properties.getAs("flags", Int::class),
            props = properties.getAsList("props", StmtPropertyProperty::class),
        )
    }
    private fun decodeStmtPropertyProperty(properties: ValueMap): StmtPropertyProperty {
        return StmtPropertyProperty(
            name = properties.getAs("name", Identifier::class),
            default = properties.getAsOrNull("default", Expr::class),
        )
    }
    private fun decodeStmtReturn(properties: ValueMap): StmtReturn {
        return StmtReturn(
            expr = properties.getAsOrNull("expr", Expr::class),
        )
    }
    private fun decodeStmtStatic(properties: ValueMap): StmtStatic {
        return StmtStatic(
            vars = properties.getAsList("vars", StmtStaticVar::class),
        )
    }
    private fun decodeStmtStaticVar(properties: ValueMap): StmtStaticVar {
        return StmtStaticVar(
            `var` = properties.getAs("var", ExprVariable::class),
            default = properties.getAsOrNull("default", Expr::class),
        )
    }
    private fun decodeStmtSwitch(properties: ValueMap): StmtSwitch {
        return StmtSwitch(
            cond = properties.getAs("cond", Expr::class),
            cases = properties.getAsList("cases", StmtCase::class),
        )
    }
    private fun decodeStmtThrow(properties: ValueMap): StmtThrow {
        return StmtThrow(
            expr = properties.getAs("expr", Expr::class),
        )
    }
    private fun decodeStmtTrait(properties: ValueMap): StmtTrait {
        return StmtTrait(
            name = properties.getAsOrNull("name", Identifier::class),
            stmts = properties.getAsList("stmts", Stmt::class),
            namespacedName = properties.getAs("namespacedName", Name::class),
        )
    }
    private fun decodeStmtTraitUse(properties: ValueMap): StmtTraitUse {
        return StmtTraitUse(
            traits = properties.getAsList("traits", Name::class),
            adaptations = properties.getAsList("adaptations", StmtTraitUseAdaptation::class),
        )
    }
    private fun decodeStmtTraitUseAdaptationAlias(properties: ValueMap): StmtTraitUseAdaptationAlias {
        return StmtTraitUseAdaptationAlias(
            newModifier = properties.getAsOrNull("newModifier", Int::class),
            newName = properties.getAsOrNull("newName", Identifier::class),
            trait = properties.getAsOrNull("trait", Name::class),
            method = properties.getAs("method", Identifier::class),
        )
    }
    private fun decodeStmtTraitUseAdaptationPrecedence(properties: ValueMap): StmtTraitUseAdaptationPrecedence {
        return StmtTraitUseAdaptationPrecedence(
            insteadof = properties.getAsList("insteadof", Name::class),
            trait = properties.getAsOrNull("trait", Name::class),
            method = properties.getAs("method", Identifier::class),
        )
    }
    private fun decodeStmtTryCatch(properties: ValueMap): StmtTryCatch {
        return StmtTryCatch(
            stmts = properties.getAsList("stmts", Stmt::class),
            catches = properties.getAsList("catches", StmtCatch::class),
            finally = properties.getAsOrNull("finally", StmtFinally::class),
        )
    }
    private fun decodeStmtUnset(properties: ValueMap): StmtUnset {
        return StmtUnset(
            vars = properties.getAsList("vars", Expr::class),
        )
    }
    private fun decodeStmtUse(properties: ValueMap): StmtUse {
        return StmtUse(
            type = properties.getAs("type", Int::class),
            uses = properties.getAsList("uses", StmtUseUse::class),
        )
    }
    private fun decodeStmtUseUse(properties: ValueMap): StmtUseUse {
        return StmtUseUse(
            type = properties.getAs("type", Int::class),
            name = properties.getAs("name", Name::class),
            alias = properties.getAsOrNull("alias", Identifier::class),
        )
    }
    private fun decodeStmtWhile(properties: ValueMap): StmtWhile {
        return StmtWhile(
            cond = properties.getAs("cond", Expr::class),
            stmts = properties.getAsList("stmts", Stmt::class),
        )
    }
    private fun decodeVarLikeIdentifier(properties: ValueMap): VarLikeIdentifier {
        return VarLikeIdentifier(
            name = properties.getAs("name", String::class),
        )
    }
}