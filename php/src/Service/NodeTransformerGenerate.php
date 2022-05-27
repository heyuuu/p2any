<?php

namespace P2Any\Service;

use P2Any\Exception\TodoException;
use P2Any\Fragment;
use P2Any\PhpParser\Node;

class NodeTransformerGenerate extends NodeTransformer
{
    protected function visitConst(Node\Const_ $node): ?Fragment
    {
        throw new TodoException('TODO NodeTransformer::visitConst', $node);
    }

    protected function visitExprClosure(Node\Expr\Closure $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprClosure', $node);
    }

    protected function visitExprClosureUse(Node\Expr\ClosureUse $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprClosureUse', $node);
    }

    protected function visitExprErrorSuppress(Node\Expr\ErrorSuppress $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprErrorSuppress', $node);
    }

    protected function visitExprNew(Node\Expr\New_ $node): ?Fragment\Expr
    {
        throw new TodoException('TODO NodeTransformer::visitExprNew', $node);
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

    protected function visitStmtFinally(Node\Stmt\Finally_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtFinally', $node);
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

}
