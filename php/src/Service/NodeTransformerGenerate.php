<?php

namespace P2Any\Service;

use P2Any\Exception\TodoException;
use P2Any\Fragment;
use P2Any\PhpParser\Node;

class NodeTransformerGenerate extends NodeTransformer
{
    protected function visitArg(Node\Arg $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitArg');
    }

    protected function visitConst(Node\Const_ $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitConst');
    }

    protected function visitExprArrayDimFetch(Node\Expr\ArrayDimFetch $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprArrayDimFetch');
    }

    protected function visitExprArrayItem(Node\Expr\ArrayItem $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprArrayItem');
    }

    protected function visitExprArray(Node\Expr\Array_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprArray');
    }

    protected function visitExprAssign(Node\Expr\Assign $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssign');
    }

    protected function visitExprAssignOpBitwiseAnd(Node\Expr\AssignOp\BitwiseAnd $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpBitwiseAnd');
    }

    protected function visitExprAssignOpBitwiseOr(Node\Expr\AssignOp\BitwiseOr $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpBitwiseOr');
    }

    protected function visitExprAssignOpBitwiseXor(Node\Expr\AssignOp\BitwiseXor $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpBitwiseXor');
    }

    protected function visitExprAssignOpConcat(Node\Expr\AssignOp\Concat $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpConcat');
    }

    protected function visitExprAssignOpDiv(Node\Expr\AssignOp\Div $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpDiv');
    }

    protected function visitExprAssignOpMinus(Node\Expr\AssignOp\Minus $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpMinus');
    }

    protected function visitExprAssignOpMod(Node\Expr\AssignOp\Mod $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpMod');
    }

    protected function visitExprAssignOpMul(Node\Expr\AssignOp\Mul $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpMul');
    }

    protected function visitExprAssignOpPlus(Node\Expr\AssignOp\Plus $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpPlus');
    }

    protected function visitExprAssignOpPow(Node\Expr\AssignOp\Pow $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpPow');
    }

    protected function visitExprAssignOpShiftLeft(Node\Expr\AssignOp\ShiftLeft $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpShiftLeft');
    }

    protected function visitExprAssignOpShiftRight(Node\Expr\AssignOp\ShiftRight $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignOpShiftRight');
    }

    protected function visitExprAssignRef(Node\Expr\AssignRef $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprAssignRef');
    }

    protected function visitExprBinaryOpBitwiseAnd(Node\Expr\BinaryOp\BitwiseAnd $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpBitwiseAnd');
    }

    protected function visitExprBinaryOpBitwiseOr(Node\Expr\BinaryOp\BitwiseOr $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpBitwiseOr');
    }

    protected function visitExprBinaryOpBitwiseXor(Node\Expr\BinaryOp\BitwiseXor $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpBitwiseXor');
    }

    protected function visitExprBinaryOpBooleanAnd(Node\Expr\BinaryOp\BooleanAnd $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpBooleanAnd');
    }

    protected function visitExprBinaryOpBooleanOr(Node\Expr\BinaryOp\BooleanOr $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpBooleanOr');
    }

    protected function visitExprBinaryOpCoalesce(Node\Expr\BinaryOp\Coalesce $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpCoalesce');
    }

    protected function visitExprBinaryOpConcat(Node\Expr\BinaryOp\Concat $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpConcat');
    }

    protected function visitExprBinaryOpDiv(Node\Expr\BinaryOp\Div $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpDiv');
    }

    protected function visitExprBinaryOpEqual(Node\Expr\BinaryOp\Equal $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpEqual');
    }

    protected function visitExprBinaryOpGreater(Node\Expr\BinaryOp\Greater $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpGreater');
    }

    protected function visitExprBinaryOpGreaterOrEqual(Node\Expr\BinaryOp\GreaterOrEqual $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpGreaterOrEqual');
    }

    protected function visitExprBinaryOpIdentical(Node\Expr\BinaryOp\Identical $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpIdentical');
    }

    protected function visitExprBinaryOpLogicalAnd(Node\Expr\BinaryOp\LogicalAnd $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpLogicalAnd');
    }

    protected function visitExprBinaryOpLogicalOr(Node\Expr\BinaryOp\LogicalOr $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpLogicalOr');
    }

    protected function visitExprBinaryOpLogicalXor(Node\Expr\BinaryOp\LogicalXor $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpLogicalXor');
    }

    protected function visitExprBinaryOpMinus(Node\Expr\BinaryOp\Minus $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpMinus');
    }

    protected function visitExprBinaryOpMod(Node\Expr\BinaryOp\Mod $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpMod');
    }

    protected function visitExprBinaryOpMul(Node\Expr\BinaryOp\Mul $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpMul');
    }

    protected function visitExprBinaryOpNotEqual(Node\Expr\BinaryOp\NotEqual $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpNotEqual');
    }

    protected function visitExprBinaryOpNotIdentical(Node\Expr\BinaryOp\NotIdentical $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpNotIdentical');
    }

    protected function visitExprBinaryOpPlus(Node\Expr\BinaryOp\Plus $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpPlus');
    }

    protected function visitExprBinaryOpPow(Node\Expr\BinaryOp\Pow $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpPow');
    }

    protected function visitExprBinaryOpShiftLeft(Node\Expr\BinaryOp\ShiftLeft $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpShiftLeft');
    }

    protected function visitExprBinaryOpShiftRight(Node\Expr\BinaryOp\ShiftRight $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpShiftRight');
    }

    protected function visitExprBinaryOpSmaller(Node\Expr\BinaryOp\Smaller $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpSmaller');
    }

    protected function visitExprBinaryOpSmallerOrEqual(Node\Expr\BinaryOp\SmallerOrEqual $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpSmallerOrEqual');
    }

    protected function visitExprBinaryOpSpaceship(Node\Expr\BinaryOp\Spaceship $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBinaryOpSpaceship');
    }

    protected function visitExprBitwiseNot(Node\Expr\BitwiseNot $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBitwiseNot');
    }

    protected function visitExprBooleanNot(Node\Expr\BooleanNot $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprBooleanNot');
    }

    protected function visitExprCastArray(Node\Expr\Cast\Array_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastArray');
    }

    protected function visitExprCastBool(Node\Expr\Cast\Bool_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastBool');
    }

    protected function visitExprCastDouble(Node\Expr\Cast\Double $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastDouble');
    }

    protected function visitExprCastInt(Node\Expr\Cast\Int_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastInt');
    }

    protected function visitExprCastObject(Node\Expr\Cast\Object_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastObject');
    }

    protected function visitExprCastString(Node\Expr\Cast\String_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastString');
    }

    protected function visitExprCastUnset(Node\Expr\Cast\Unset_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprCastUnset');
    }

    protected function visitExprClassConstFetch(Node\Expr\ClassConstFetch $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprClassConstFetch');
    }

    protected function visitExprClone(Node\Expr\Clone_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprClone');
    }

    protected function visitExprClosure(Node\Expr\Closure $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprClosure');
    }

    protected function visitExprClosureUse(Node\Expr\ClosureUse $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprClosureUse');
    }

    protected function visitExprConstFetch(Node\Expr\ConstFetch $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprConstFetch');
    }

    protected function visitExprEmpty(Node\Expr\Empty_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprEmpty');
    }

    protected function visitExprError(Node\Expr\Error $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprError');
    }

    protected function visitExprErrorSuppress(Node\Expr\ErrorSuppress $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprErrorSuppress');
    }

    protected function visitExprEval(Node\Expr\Eval_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprEval');
    }

    protected function visitExprExit(Node\Expr\Exit_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprExit');
    }

    protected function visitExprFuncCall(Node\Expr\FuncCall $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprFuncCall');
    }

    protected function visitExprInclude(Node\Expr\Include_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprInclude');
    }

    protected function visitExprInstanceof(Node\Expr\Instanceof_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprInstanceof');
    }

    protected function visitExprIsset(Node\Expr\Isset_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprIsset');
    }

    protected function visitExprList(Node\Expr\List_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprList');
    }

    protected function visitExprMethodCall(Node\Expr\MethodCall $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprMethodCall');
    }

    protected function visitExprNew(Node\Expr\New_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprNew');
    }

    protected function visitExprPostDec(Node\Expr\PostDec $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPostDec');
    }

    protected function visitExprPostInc(Node\Expr\PostInc $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPostInc');
    }

    protected function visitExprPreDec(Node\Expr\PreDec $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPreDec');
    }

    protected function visitExprPreInc(Node\Expr\PreInc $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPreInc');
    }

    protected function visitExprPrint(Node\Expr\Print_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPrint');
    }

    protected function visitExprPropertyFetch(Node\Expr\PropertyFetch $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprPropertyFetch');
    }

    protected function visitExprShellExec(Node\Expr\ShellExec $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprShellExec');
    }

    protected function visitExprStaticCall(Node\Expr\StaticCall $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprStaticCall');
    }

    protected function visitExprStaticPropertyFetch(Node\Expr\StaticPropertyFetch $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprStaticPropertyFetch');
    }

    protected function visitExprTernary(Node\Expr\Ternary $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprTernary');
    }

    protected function visitExprThrow(Node\Expr\Throw_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprThrow');
    }

    protected function visitExprUnaryMinus(Node\Expr\UnaryMinus $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprUnaryMinus');
    }

    protected function visitExprUnaryPlus(Node\Expr\UnaryPlus $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprUnaryPlus');
    }

    protected function visitExprVariable(Node\Expr\Variable $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprVariable');
    }

    protected function visitExprYieldFrom(Node\Expr\YieldFrom $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprYieldFrom');
    }

    protected function visitExprYield(Node\Expr\Yield_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprYield');
    }

    protected function visitIdentifier(Node\Identifier $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitIdentifier');
    }

    protected function visitName(Node\Name $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitName');
    }

    protected function visitNameFullyQualified(Node\Name\FullyQualified $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitNameFullyQualified');
    }

    protected function visitNameRelative(Node\Name\Relative $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitNameRelative');
    }

    protected function visitNullableType(Node\NullableType $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitNullableType');
    }

    protected function visitParam(Node\Param $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitParam');
    }

    protected function visitStmtBreak(Node\Stmt\Break_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtBreak');
    }

    protected function visitStmtCase(Node\Stmt\Case_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtCase');
    }

    protected function visitStmtCatch(Node\Stmt\Catch_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtCatch');
    }

    protected function visitStmtClassMethod(Node\Stmt\ClassMethod $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtClassMethod');
    }

    protected function visitStmtConst(Node\Stmt\Const_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtConst');
    }

    protected function visitStmtContinue(Node\Stmt\Continue_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtContinue');
    }

    protected function visitStmtDeclareDeclare(Node\Stmt\DeclareDeclare $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtDeclareDeclare');
    }

    protected function visitStmtDo(Node\Stmt\Do_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtDo');
    }

    protected function visitStmtEcho(Node\Stmt\Echo_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtEcho');
    }

    protected function visitStmtElseIf(Node\Stmt\ElseIf_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtElseIf');
    }

    protected function visitStmtElse(Node\Stmt\Else_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtElse');
    }

    protected function visitStmtExpression(Node\Stmt\Expression $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtExpression');
    }

    protected function visitStmtFinally(Node\Stmt\Finally_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtFinally');
    }

    protected function visitStmtFor(Node\Stmt\For_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtFor');
    }

    protected function visitStmtForeach(Node\Stmt\Foreach_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtForeach');
    }

    protected function visitStmtFunction(Node\Stmt\Function_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtFunction');
    }

    protected function visitStmtGlobal(Node\Stmt\Global_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtGlobal');
    }

    protected function visitStmtGoto(Node\Stmt\Goto_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtGoto');
    }

    protected function visitStmtGroupUse(Node\Stmt\GroupUse $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtGroupUse');
    }

    protected function visitStmtHaltCompiler(Node\Stmt\HaltCompiler $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtHaltCompiler');
    }

    protected function visitStmtIf(Node\Stmt\If_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtIf');
    }

    protected function visitStmtInlineHTML(Node\Stmt\InlineHTML $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtInlineHTML');
    }

    protected function visitStmtLabel(Node\Stmt\Label $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtLabel');
    }

    protected function visitStmtNop(Node\Stmt\Nop $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtNop');
    }

    protected function visitStmtProperty(Node\Stmt\Property $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtProperty');
    }

    protected function visitStmtPropertyProperty(Node\Stmt\PropertyProperty $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtPropertyProperty');
    }

    protected function visitStmtReturn(Node\Stmt\Return_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtReturn');
    }

    protected function visitStmtStaticVar(Node\Stmt\StaticVar $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtStaticVar');
    }

    protected function visitStmtStatic(Node\Stmt\Static_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtStatic');
    }

    protected function visitStmtSwitch(Node\Stmt\Switch_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtSwitch');
    }

    protected function visitStmtThrow(Node\Stmt\Throw_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtThrow');
    }

    protected function visitStmtTraitUse(Node\Stmt\TraitUse $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtTraitUse');
    }

    protected function visitStmtTraitUseAdaptationAlias(Node\Stmt\TraitUseAdaptation\Alias $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtTraitUseAdaptationAlias');
    }

    protected function visitStmtTraitUseAdaptationPrecedence(Node\Stmt\TraitUseAdaptation\Precedence $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtTraitUseAdaptationPrecedence');
    }

    protected function visitStmtTrait(Node\Stmt\Trait_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtTrait');
    }

    protected function visitStmtTryCatch(Node\Stmt\TryCatch $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtTryCatch');
    }

    protected function visitStmtUnset(Node\Stmt\Unset_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtUnset');
    }

    protected function visitStmtUseUse(Node\Stmt\UseUse $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtUseUse');
    }

    protected function visitStmtWhile(Node\Stmt\While_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtWhile');
    }

    protected function visitVarLikeIdentifier(Node\VarLikeIdentifier $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitVarLikeIdentifier');
    }

}
