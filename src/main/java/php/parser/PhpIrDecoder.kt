package php.parser

import php.ast.*
import php.misc.JsonUtil
import java.io.File
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.primaryConstructor
import kotlin.reflect.safeCast

class PhpIrDecoder {
    companion object {
        private val typeMap: Map<String, KClass<out AstNode>> = mapOf(
            "StmtExpression" to StmtExpression::class,
            "StmtUseUse" to StmtUse.UseUse::class,
            "StmtGlobal" to StmtGlobal::class,
            "StmtNamespace" to StmtNamespace::class,
            "StmtTraitUse" to StmtTraitUse::class,
            "StmtTraitUseAdaptationPrecedence" to StmtTraitUse.UseAdaptation.Precedence::class,
            "StmtTraitUseAdaptationAlias" to StmtTraitUse.UseAdaptation.Alias::class,
            "StmtCatch" to StmtTryCatch.CatchBranch::class,
            "StmtClass" to StmtClass::class,
            "StmtThrow" to StmtThrow::class,
            "StmtPropertyProperty" to StmtPropertyProperty::class,
            "StmtLabel" to StmtLabel::class,
            "StmtStaticVar" to StmtStaticVar::class,
            "StmtCase" to StmtSwitch.CaseBranch::class,
            "StmtContinue" to StmtContinue::class,
            "StmtClassMethod" to StmtClassMethod::class,
            "StmtUnset" to StmtUnset::class,
            "StmtFinally" to StmtTryCatch.FinallyBranch::class,
            "StmtInterface" to StmtInterface::class,
            "StmtElse" to StmtIf.CondBranch::class,
            "StmtWhile" to StmtWhile::class,
            "StmtHaltCompiler" to StmtHaltCompiler::class,
            "StmtDeclareDeclare" to StmtDeclareDeclare::class,
            "StmtGoto" to StmtGoto::class,
            "StmtStatic" to StmtStatic::class,
            "StmtReturn" to StmtReturn::class,
            "StmtTryCatch" to StmtTryCatch::class,
            "StmtEcho" to StmtEcho::class,
            "StmtDeclare" to StmtDeclare::class,
            "StmtProperty" to StmtProperty::class,
            "StmtBreak" to StmtBreak::class,
            "StmtIf" to StmtIf::class,
            "StmtConst" to StmtConst::class,
            "StmtFunction" to StmtFunction::class,
            "StmtSwitch" to StmtSwitch::class,
            "StmtForeach" to StmtForeach::class,
            "StmtFor" to StmtFor::class,
            "StmtDo" to StmtDo::class,
            "StmtGroupUse" to StmtGroupUse::class,
            "StmtUse" to StmtUse::class,
            "StmtInlineHTML" to StmtInlineHTML::class,
            "StmtClassConst" to StmtClassConst::class,
            "StmtElseIf" to StmtIf.DefaultBranch::class,
            "StmtNop" to StmtNop::class,
            "StmtTrait" to StmtTrait::class,
            "Identifier" to Identifier::class,
            "Param" to Param::class,
            "ExprList" to ExprList::class,
            "ExprShellExec" to ExprShellExec::class,
            "ExprConstFetch" to ExprConstFetch::class,
            "ExprInclude" to ExprInclude::class,
            "ExprStaticPropertyFetch" to ExprStaticPropertyFetch::class,
            "ExprVariable" to ExprVariable::class,
            "ExprPrint" to ExprPrint::class,
            "ExprPreInc" to ExprPreInc::class,
            "ExprStaticCall" to ExprStaticCall::class,
            "ExprYieldFrom" to ExprYieldFrom::class,
            "ExprClosure" to ExprClosure::class,
            "ExprCastInt" to ExprCastInt::class,
            "ExprCastObject" to ExprCastObject::class,
            "ExprCastDouble" to ExprCastDouble::class,
            "ExprCastString" to ExprCastString::class,
            "ExprCastUnset" to ExprCastUnset::class,
            "ExprCastBool" to ExprCastBool::class,
            "ExprCastArray" to ExprCastArray::class,
            "ExprThrow" to ExprThrow::class,
            "ExprPostDec" to ExprPostDec::class,
            "ExprUnaryMinus" to ExprUnaryMinus::class,
            "ExprClassConstFetch" to ExprClassConstFetch::class,
            "ExprBitwiseNot" to ExprBitwiseNot::class,
            "ExprErrorSuppress" to ExprErrorSuppress::class,
            "ExprEval" to ExprEval::class,
            "ExprArrayDimFetch" to ExprArrayDimFetch::class,
            "ExprMethodCall" to ExprMethodCall::class,
            "ExprPropertyFetch" to ExprPropertyFetch::class,
            "ExprAssignOpPlus" to ExprAssignOpPlus::class,
            "ExprAssignOpShiftRight" to ExprAssignOpShiftRight::class,
            "ExprAssignOpDiv" to ExprAssignOpDiv::class,
            "ExprAssignOpMod" to ExprAssignOpMod::class,
            "ExprAssignOpBitwiseOr" to ExprAssignOpBitwiseOr::class,
            "ExprAssignOpMinus" to ExprAssignOpMinus::class,
            "ExprAssignOpPow" to ExprAssignOpPow::class,
            "ExprAssignOpMul" to ExprAssignOpMul::class,
            "ExprAssignOpConcat" to ExprAssignOpConcat::class,
            "ExprAssignOpShiftLeft" to ExprAssignOpShiftLeft::class,
            "ExprAssignOpBitwiseXor" to ExprAssignOpBitwiseXor::class,
            "ExprAssignOpBitwiseAnd" to ExprAssignOpBitwiseAnd::class,
            "ExprBinaryOpPlus" to ExprBinaryOpPlus::class,
            "ExprBinaryOpGreater" to ExprBinaryOpGreater::class,
            "ExprBinaryOpLogicalOr" to ExprBinaryOpLogicalOr::class,
            "ExprBinaryOpSpaceship" to ExprBinaryOpSpaceship::class,
            "ExprBinaryOpSmaller" to ExprBinaryOpSmaller::class,
            "ExprBinaryOpShiftRight" to ExprBinaryOpShiftRight::class,
            "ExprBinaryOpBooleanOr" to ExprBinaryOpBooleanOr::class,
            "ExprBinaryOpLogicalAnd" to ExprBinaryOpLogicalAnd::class,
            "ExprBinaryOpEqual" to ExprBinaryOpEqual::class,
            "ExprBinaryOpNotIdentical" to ExprBinaryOpNotIdentical::class,
            "ExprBinaryOpSmallerOrEqual" to ExprBinaryOpSmallerOrEqual::class,
            "ExprBinaryOpBooleanAnd" to ExprBinaryOpBooleanAnd::class,
            "ExprBinaryOpDiv" to ExprBinaryOpDiv::class,
            "ExprBinaryOpLogicalXor" to ExprBinaryOpLogicalXor::class,
            "ExprBinaryOpMod" to ExprBinaryOpMod::class,
            "ExprBinaryOpBitwiseOr" to ExprBinaryOpBitwiseOr::class,
            "ExprBinaryOpMinus" to ExprBinaryOpMinus::class,
            "ExprBinaryOpIdentical" to ExprBinaryOpIdentical::class,
            "ExprBinaryOpGreaterOrEqual" to ExprBinaryOpGreaterOrEqual::class,
            "ExprBinaryOpPow" to ExprBinaryOpPow::class,
            "ExprBinaryOpMul" to ExprBinaryOpMul::class,
            "ExprBinaryOpConcat" to ExprBinaryOpConcat::class,
            "ExprBinaryOpShiftLeft" to ExprBinaryOpShiftLeft::class,
            "ExprBinaryOpBitwiseXor" to ExprBinaryOpBitwiseXor::class,
            "ExprBinaryOpCoalesce" to ExprBinaryOpCoalesce::class,
            "ExprBinaryOpNotEqual" to ExprBinaryOpNotEqual::class,
            "ExprBinaryOpBitwiseAnd" to ExprBinaryOpBitwiseAnd::class,
            "ExprAssign" to ExprAssign::class,
            "ExprPostInc" to ExprPostInc::class,
            "ExprUnaryPlus" to ExprUnaryPlus::class,
            "ExprTernary" to ExprTernary::class,
            "ExprEmpty" to ExprEmpty::class,
            "ExprNew" to ExprNew::class,
            "ExprYield" to ExprYield::class,
            "ExprExit" to ExprExit::class,
            "ExprInstanceof" to ExprInstanceof::class,
            "ExprFuncCall" to ExprFuncCall::class,
            "ExprBooleanNot" to ExprBooleanNot::class,
            "ExprClone" to ExprClone::class,
            "ExprPreDec" to ExprPreDec::class,
            "ExprArrayItem" to ExprArrayItem::class,
            "ExprArray" to ExprArray::class,
            "ExprAssignRef" to ExprAssignRef::class,
            "ExprIsset" to ExprIsset::class,
            "ExprClosureUse" to ExprClosureUse::class,
            "Const" to Const::class,
            "Name" to Name::class,
            "ScalarDNumber" to ScalarDNumber::class,
            "ScalarString" to ScalarString::class,
            "ScalarMagicConstNamespace" to ScalarMagicConstNamespace::class,
            "ScalarMagicConstClass" to ScalarMagicConstClass::class,
            "ScalarMagicConstDir" to ScalarMagicConstDir::class,
            "ScalarMagicConstFile" to ScalarMagicConstFile::class,
            "ScalarMagicConstMethod" to ScalarMagicConstMethod::class,
            "ScalarMagicConstFunction" to ScalarMagicConstFunction::class,
            "ScalarMagicConstLine" to ScalarMagicConstLine::class,
            "ScalarMagicConstTrait" to ScalarMagicConstTrait::class,
            "ScalarLNumber" to ScalarLNumber::class,
            "ScalarEncapsedStringPart" to ScalarEncapsedStringPart::class,
            "ScalarEncapsed" to ScalarEncapsed::class,
            "Arg" to Arg::class,
        )
    }

    fun load(file: File) {
        val json = file.readText()
        val result = JsonUtil.decode(json) { resolveObject(it) }

        println(result)
    }

    private fun resolveObject(map: Map<String, *>): Any? {
        val nodeType = map["type"]?.let { typeMap[it] }
        val properties = map["properties"]?.let { Map::class.safeCast(it) }
        return if (nodeType != null && properties != null) {
            buildNode(nodeType, properties as Map<String, *>)
        } else {
            map
        }
    }

    private fun buildNode(nodeType: KClass<out AstNode>, properties: Map<String, *>): AstNode {
        // 自定义构造方式
        this::class.declaredFunctions
            .firstOrNull { it.name == "build${nodeType.simpleName}" }
            ?.let {
                return it.call(this, properties) as AstNode
            }

        // 通用构造方式
        val primaryConstructor = nodeType.primaryConstructor
        if (primaryConstructor === null) {
            throw RuntimeException("Node 类不应没有主构造函数, class: ${nodeType.qualifiedName}")
        }

        val args = primaryConstructor.parameters.associateWith { getArgFromMap(properties, it.name!!, it.type) }

        println(
            mapOf(
                "type" to nodeType,
                "args" to args.mapKeys { it.key.name },
                "properties" to properties,
            )
        )

        return primaryConstructor.callBy(args)
    }

    // 从 Map 中获取 Arg 参数。对 number 特殊处理。
    private fun getArgFromMap(map: Map<String, Any?>, key: String, type: KType): Any? {
        val result = map[key]
        if (result is Number) {
            return when (type) {
                Double::class -> result.toDouble()
                Float::class -> result.toFloat()
                Long::class -> result.toLong()
                Int::class -> result.toInt()
                Char::class -> result.toChar()
                Short::class -> result.toShort()
                Byte::class -> result.toByte()
                else -> result
            }
        }
        return result
    }

    fun buildExprVariable(properties: Map<String, Any?>): ExprVariable {
        val name = properties["name"]!!
        return when (name) {
            is String -> ExprVariable.Static(name)
            is Expr -> ExprVariable.Dynamic(name)
            else -> throw RuntimeException("ExprVariable->name 只能是 String 或 Expr")
        }
    }

}