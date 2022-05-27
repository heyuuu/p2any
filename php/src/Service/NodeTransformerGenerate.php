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

    protected function visitStmtEcho(Node\Stmt\Echo_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtEcho', $node);
    }

    protected function visitStmtFunction(Node\Stmt\Function_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtFunction', $node);
    }

    protected function visitStmtGlobal(Node\Stmt\Global_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtGlobal', $node);
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

    protected function visitStmtProperty(Node\Stmt\Property $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtProperty', $node);
    }

    protected function visitStmtPropertyProperty(Node\Stmt\PropertyProperty $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtPropertyProperty', $node);
    }

    protected function visitStmtStaticVar(Node\Stmt\StaticVar $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtStaticVar', $node);
    }

    protected function visitStmtStatic(Node\Stmt\Static_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtStatic', $node);
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

    protected function visitStmtUnset(Node\Stmt\Unset_ $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtUnset', $node);
    }

    protected function visitStmtUseUse(Node\Stmt\UseUse $node): ?Fragment\Stmt
    {
        throw new TodoException('TODO NodeTransformer::visitStmtUseUse', $node);
    }

}
