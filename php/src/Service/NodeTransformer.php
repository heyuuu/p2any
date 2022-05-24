<?php

namespace P2Any\Service;

use P2Any\Fragment;
use P2Any\PhpParser\Node;
use P2Any\Service\NodeTransformer\TempListFragment;

class NodeTransformer extends NodeTransformerAbstract
{
    protected static $skipTypes = [
        Node\Stmt\Declare_::class => true,
        Node\Stmt\Use_::class     => true,
    ];

    private function visitListAsFragment(array $nodes): TempListFragment
    {
        return new TempListFragment($this->visitList($nodes));
    }

    protected function visitStmtNamespace(Node\Stmt\Namespace_ $node): Fragment
    {
        return $this->visitListAsFragment($node->stmts);
    }

    protected function visitStmtClass(Node\Stmt\Class_ $node): Fragment\Decl\ClassDecl
    {
        // todo 类定义
        return new Fragment\Decl\ClassDecl();
    }

    protected function visitStmtInterface(Node\Stmt\Interface_ $node): Fragment\Decl\InterfaceDecl
    {
        // todo interface 定义
        return new Fragment\Decl\InterfaceDecl();
    }
}
