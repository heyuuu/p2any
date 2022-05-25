<?php

namespace P2Any\Service;

use P2Any\Exception\TodoException;
use P2Any\Fragment;
use P2Any\PhpParser\Node;

class NodeTransformerGenerate extends NodeTransformer
{
    protected function visitArg(Node\Arg $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitArg', $node);
    }

    protected function visitConst(Node\Const_ $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitConst', $node);
    }

    protected function visitExprArrayDimFetch(Node\Expr\ArrayDimFetch $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprArrayDimFetch', $node);
    }

    protected function visitExprArrayItem(Node\Expr\ArrayItem $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprArrayItem', $node);
    }

    protected function visitExprArray(Node\Expr\Array_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprArray', $node);
    }

    protected function visitExprAssign(Node\Expr\Assign $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssign', $node);
    }

    protected function visitExprAssignOpBitwiseAnd(Node\Expr\AssignOp\BitwiseAnd $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpBitwiseAnd', $node);
    }

    protected function visitExprAssignOpBitwiseOr(Node\Expr\AssignOp\BitwiseOr $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpBitwiseOr', $node);
    }

    protected function visitExprAssignOpBitwiseXor(Node\Expr\AssignOp\BitwiseXor $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpBitwiseXor', $node);
    }

    protected function visitExprAssignOpConcat(Node\Expr\AssignOp\Concat $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpConcat', $node);
    }

    protected function visitExprAssignOpDiv(Node\Expr\AssignOp\Div $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpDiv', $node);
    }

    protected function visitExprAssignOpMinus(Node\Expr\AssignOp\Minus $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpMinus', $node);
    }

    protected function visitExprAssignOpMod(Node\Expr\AssignOp\Mod $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpMod', $node);
    }

    protected function visitExprAssignOpMul(Node\Expr\AssignOp\Mul $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpMul', $node);
    }

    protected function visitExprAssignOpPlus(Node\Expr\AssignOp\Plus $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpPlus', $node);
    }

    protected function visitExprAssignOpPow(Node\Expr\AssignOp\Pow $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpPow', $node);
    }

    protected function visitExprAssignOpShiftLeft(Node\Expr\AssignOp\ShiftLeft $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpShiftLeft', $node);
    }

    protected function visitExprAssignOpShiftRight(Node\Expr\AssignOp\ShiftRight $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpShiftRight', $node);
    }

    protected function visitExprAssignRef(Node\Expr\AssignRef $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignRef', $node);
    }

    protected function visitExprBinaryOpBitwiseAnd(Node\Expr\BinaryOp\BitwiseAnd $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpBitwiseAnd', $node);
    }

    protected function visitExprBinaryOpBitwiseOr(Node\Expr\BinaryOp\BitwiseOr $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpBitwiseOr', $node);
    }

    protected function visitExprBinaryOpBitwiseXor(Node\Expr\BinaryOp\BitwiseXor $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpBitwiseXor', $node);
    }

    protected function visitExprBinaryOpBooleanAnd(Node\Expr\BinaryOp\BooleanAnd $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpBooleanAnd', $node);
    }

    protected function visitExprBinaryOpBooleanOr(Node\Expr\BinaryOp\BooleanOr $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpBooleanOr', $node);
    }

    protected function visitExprBinaryOpCoalesce(Node\Expr\BinaryOp\Coalesce $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpCoalesce', $node);
    }

    protected function visitExprBinaryOpConcat(Node\Expr\BinaryOp\Concat $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpConcat', $node);
    }

    protected function visitExprBinaryOpDiv(Node\Expr\BinaryOp\Div $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpDiv', $node);
    }

    protected function visitExprBinaryOpEqual(Node\Expr\BinaryOp\Equal $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpEqual', $node);
    }

    protected function visitExprBinaryOpGreater(Node\Expr\BinaryOp\Greater $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpGreater', $node);
    }

    protected function visitExprBinaryOpGreaterOrEqual(Node\Expr\BinaryOp\GreaterOrEqual $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpGreaterOrEqual', $node);
    }

    protected function visitExprBinaryOpIdentical(Node\Expr\BinaryOp\Identical $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpIdentical', $node);
    }

    protected function visitExprBinaryOpLogicalAnd(Node\Expr\BinaryOp\LogicalAnd $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpLogicalAnd', $node);
    }

    protected function visitExprBinaryOpLogicalOr(Node\Expr\BinaryOp\LogicalOr $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpLogicalOr', $node);
    }

    protected function visitExprBinaryOpLogicalXor(Node\Expr\BinaryOp\LogicalXor $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpLogicalXor', $node);
    }

    protected function visitExprBinaryOpMinus(Node\Expr\BinaryOp\Minus $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpMinus', $node);
    }

    protected function visitExprBinaryOpMod(Node\Expr\BinaryOp\Mod $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpMod', $node);
    }

    protected function visitExprBinaryOpMul(Node\Expr\BinaryOp\Mul $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpMul', $node);
    }

    protected function visitExprBinaryOpNotEqual(Node\Expr\BinaryOp\NotEqual $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpNotEqual', $node);
    }

    protected function visitExprBinaryOpNotIdentical(Node\Expr\BinaryOp\NotIdentical $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpNotIdentical', $node);
    }

    protected function visitExprBinaryOpPlus(Node\Expr\BinaryOp\Plus $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpPlus', $node);
    }

    protected function visitExprBinaryOpPow(Node\Expr\BinaryOp\Pow $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpPow', $node);
    }

    protected function visitExprBinaryOpShiftLeft(Node\Expr\BinaryOp\ShiftLeft $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpShiftLeft', $node);
    }

    protected function visitExprBinaryOpShiftRight(Node\Expr\BinaryOp\ShiftRight $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpShiftRight', $node);
    }

    protected function visitExprBinaryOpSmaller(Node\Expr\BinaryOp\Smaller $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpSmaller', $node);
    }

    protected function visitExprBinaryOpSmallerOrEqual(Node\Expr\BinaryOp\SmallerOrEqual $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpSmallerOrEqual', $node);
    }

    protected function visitExprBinaryOpSpaceship(Node\Expr\BinaryOp\Spaceship $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpSpaceship', $node);
    }

    protected function visitExprBitwiseNot(Node\Expr\BitwiseNot $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBitwiseNot', $node);
    }

    protected function visitExprBooleanNot(Node\Expr\BooleanNot $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBooleanNot', $node);
    }

    protected function visitExprCastArray(Node\Expr\Cast\Array_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastArray', $node);
    }

    protected function visitExprCastBool(Node\Expr\Cast\Bool_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastBool', $node);
    }

    protected function visitExprCastDouble(Node\Expr\Cast\Double $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastDouble', $node);
    }

    protected function visitExprCastInt(Node\Expr\Cast\Int_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastInt', $node);
    }

    protected function visitExprCastObject(Node\Expr\Cast\Object_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastObject', $node);
    }

    protected function visitExprCastString(Node\Expr\Cast\String_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastString', $node);
    }

    protected function visitExprCastUnset(Node\Expr\Cast\Unset_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastUnset', $node);
    }

    protected function visitExprClassConstFetch(Node\Expr\ClassConstFetch $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprClassConstFetch', $node);
    }

    protected function visitExprClone(Node\Expr\Clone_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprClone', $node);
    }

    protected function visitExprClosure(Node\Expr\Closure $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprClosure', $node);
    }

    protected function visitExprClosureUse(Node\Expr\ClosureUse $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprClosureUse', $node);
    }

    protected function visitExprConstFetch(Node\Expr\ConstFetch $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprConstFetch', $node);
    }

    protected function visitExprEmpty(Node\Expr\Empty_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprEmpty', $node);
    }

    protected function visitExprError(Node\Expr\Error $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprError', $node);
    }

    protected function visitExprErrorSuppress(Node\Expr\ErrorSuppress $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprErrorSuppress', $node);
    }

    protected function visitExprEval(Node\Expr\Eval_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprEval', $node);
    }

    protected function visitExprExit(Node\Expr\Exit_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprExit', $node);
    }

    protected function visitExprFuncCall(Node\Expr\FuncCall $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprFuncCall', $node);
    }

    protected function visitExprInclude(Node\Expr\Include_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprInclude', $node);
    }

    protected function visitExprInstanceof(Node\Expr\Instanceof_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprInstanceof', $node);
    }

    protected function visitExprIsset(Node\Expr\Isset_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprIsset', $node);
    }

    protected function visitExprList(Node\Expr\List_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprList', $node);
    }

    protected function visitExprMethodCall(Node\Expr\MethodCall $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprMethodCall', $node);
    }

    protected function visitExprNew(Node\Expr\New_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprNew', $node);
    }

    protected function visitExprPostDec(Node\Expr\PostDec $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPostDec', $node);
    }

    protected function visitExprPostInc(Node\Expr\PostInc $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPostInc', $node);
    }

    protected function visitExprPreDec(Node\Expr\PreDec $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPreDec', $node);
    }

    protected function visitExprPreInc(Node\Expr\PreInc $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPreInc', $node);
    }

    protected function visitExprPrint(Node\Expr\Print_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPrint', $node);
    }

    protected function visitExprPropertyFetch(Node\Expr\PropertyFetch $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPropertyFetch', $node);
    }

    protected function visitExprShellExec(Node\Expr\ShellExec $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprShellExec', $node);
    }

    protected function visitExprStaticCall(Node\Expr\StaticCall $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprStaticCall', $node);
    }

    protected function visitExprStaticPropertyFetch(Node\Expr\StaticPropertyFetch $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprStaticPropertyFetch', $node);
    }

    protected function visitExprTernary(Node\Expr\Ternary $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprTernary', $node);
    }

    protected function visitExprThrow(Node\Expr\Throw_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprThrow', $node);
    }

    protected function visitExprVariable(Node\Expr\Variable $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprVariable', $node);
    }

    protected function visitExprYieldFrom(Node\Expr\YieldFrom $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprYieldFrom', $node);
    }

    protected function visitExprYield(Node\Expr\Yield_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprYield', $node);
    }

    protected function visitIdentifier(Node\Identifier $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitIdentifier', $node);
    }

    protected function visitName(Node\Name $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitName', $node);
    }

    protected function visitNameFullyQualified(Node\Name\FullyQualified $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitNameFullyQualified', $node);
    }

    protected function visitNameRelative(Node\Name\Relative $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitNameRelative', $node);
    }

    protected function visitNullableType(Node\NullableType $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitNullableType', $node);
    }

    protected function visitParam(Node\Param $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitParam', $node);
    }

    protected function visitStmtBreak(Node\Stmt\Break_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtBreak', $node);
    }

    protected function visitStmtCase(Node\Stmt\Case_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtCase', $node);
    }

    protected function visitStmtCatch(Node\Stmt\Catch_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtCatch', $node);
    }

    protected function visitStmtClassMethod(Node\Stmt\ClassMethod $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtClassMethod', $node);
    }

    protected function visitStmtConst(Node\Stmt\Const_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtConst', $node);
    }

    protected function visitStmtContinue(Node\Stmt\Continue_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtContinue', $node);
    }

    protected function visitStmtDeclareDeclare(Node\Stmt\DeclareDeclare $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtDeclareDeclare', $node);
    }

    protected function visitStmtDo(Node\Stmt\Do_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtDo', $node);
    }

    protected function visitStmtEcho(Node\Stmt\Echo_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtEcho', $node);
    }

    protected function visitStmtElseIf(Node\Stmt\ElseIf_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtElseIf', $node);
    }

    protected function visitStmtElse(Node\Stmt\Else_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtElse', $node);
    }

    protected function visitStmtExpression(Node\Stmt\Expression $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtExpression', $node);
    }

    protected function visitStmtFinally(Node\Stmt\Finally_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtFinally', $node);
    }

    protected function visitStmtFor(Node\Stmt\For_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtFor', $node);
    }

    protected function visitStmtForeach(Node\Stmt\Foreach_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtForeach', $node);
    }

    protected function visitStmtFunction(Node\Stmt\Function_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtFunction', $node);
    }

    protected function visitStmtGlobal(Node\Stmt\Global_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtGlobal', $node);
    }

    protected function visitStmtGoto(Node\Stmt\Goto_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtGoto', $node);
    }

    protected function visitStmtGroupUse(Node\Stmt\GroupUse $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtGroupUse', $node);
    }

    protected function visitStmtHaltCompiler(Node\Stmt\HaltCompiler $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtHaltCompiler', $node);
    }

    protected function visitStmtIf(Node\Stmt\If_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtIf', $node);
    }

    protected function visitStmtInlineHTML(Node\Stmt\InlineHTML $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtInlineHTML', $node);
    }

    protected function visitStmtLabel(Node\Stmt\Label $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtLabel', $node);
    }

    protected function visitStmtNop(Node\Stmt\Nop $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtNop', $node);
    }

    protected function visitStmtProperty(Node\Stmt\Property $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtProperty', $node);
    }

    protected function visitStmtPropertyProperty(Node\Stmt\PropertyProperty $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtPropertyProperty', $node);
    }

    protected function visitStmtReturn(Node\Stmt\Return_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtReturn', $node);
    }

    protected function visitStmtStaticVar(Node\Stmt\StaticVar $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtStaticVar', $node);
    }

    protected function visitStmtStatic(Node\Stmt\Static_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtStatic', $node);
    }

    protected function visitStmtSwitch(Node\Stmt\Switch_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtSwitch', $node);
    }

    protected function visitStmtThrow(Node\Stmt\Throw_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtThrow', $node);
    }

    protected function visitStmtTraitUse(Node\Stmt\TraitUse $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtTraitUse', $node);
    }

    protected function visitStmtTraitUseAdaptationAlias(Node\Stmt\TraitUseAdaptation\Alias $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtTraitUseAdaptationAlias', $node);
    }

    protected function visitStmtTraitUseAdaptationPrecedence(Node\Stmt\TraitUseAdaptation\Precedence $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtTraitUseAdaptationPrecedence', $node);
    }

    protected function visitStmtTrait(Node\Stmt\Trait_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtTrait', $node);
    }

    protected function visitStmtTryCatch(Node\Stmt\TryCatch $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtTryCatch', $node);
    }

    protected function visitStmtUnset(Node\Stmt\Unset_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtUnset', $node);
    }

    protected function visitStmtUseUse(Node\Stmt\UseUse $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtUseUse', $node);
    }

    protected function visitStmtWhile(Node\Stmt\While_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtWhile', $node);
    }

    protected function visitVarLikeIdentifier(Node\VarLikeIdentifier $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitVarLikeIdentifier', $node);
    }

}
