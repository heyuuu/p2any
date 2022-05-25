<?php

namespace P2Any\Service;

use P2Any\Exception\LogicException;
use P2Any\Fragment;
use P2Any\PhpParser\Node;
use P2Any\Service\NodeTransformer\ParsingExpr;
use P2Any\Service\NodeTransformer\TempListFragment;
use Webmozart\Assert\Assert;

class NodeTransformer extends NodeTransformerAbstract
{
    protected static $skipTypes        = [
        Node\Stmt\Declare_::class   => true,
        Node\Stmt\Use_::class       => true,
        Node\Stmt\ClassConst::class => true,
    ];
    protected static $unsupportedTypes = [];

    /**
     * @param Node\Expr $node
     * @return Fragment\Expr
     */
    private function pExpr(Node\Expr $node): Fragment\Expr
    {
        // return new ParsingExpr($node);
        return $this->visit($node, Fragment\Expr::class);
    }

    /**
     * @param Node\Expr[] $nodes
     * @return Fragment\Expr[]
     */
    private function pExprList(array $nodes): array
    {
        Assert::allIsInstanceOf($nodes, Node\Expr::class);
        return $this->visitList($nodes, Fragment\Expr::class);
    }

    /**
     * @param Node\Expr $node
     * @return Fragment\Stmt
     */
    private function pStmt(Node\Expr $node): Fragment\Stmt
    {
        // return new ParsingStmt($node);
        return $this->visit($node, Fragment\Expr::class);
    }

    /**
     * @param Node\Stmt[] $nodes
     * @return Fragment\Stmt[]
     */
    private function pStmtList(array $nodes): array
    {
        Assert::allIsInstanceOf($nodes, Node\Stmt::class);
        return $this->visitList($nodes, Fragment\Stmt::class);
    }

    // special node
    private function pName(Node\Name $node): string
    {
        return $node->toCodeString();
    }

    private function pNameOrNull(?Node\Name $node): ?string
    {
        return $node ? $node->toCodeString() : null;
    }

    private function pNameList(array $nodes): array
    {
        Assert::allIsInstanceOf($nodes, Node\Name::class);
        return array_map([$this, 'pName'], $nodes);
    }

    //

    private function visitListAsFragment(array $nodes): TempListFragment
    {
        return new TempListFragment($this->visitList($nodes));
    }

    protected function visitStmtNamespace(Node\Stmt\Namespace_ $node): Fragment
    {
        return $this->visitListAsFragment($node->stmts);
    }

    ##############################
    # Decl
    ##############################

    protected function visitStmtClass(Node\Stmt\Class_ $node): Fragment\Decl\ClassDecl
    {
        Assert::integer($node->flags);
        Assert::isInstanceOf($node->namespacedName, Node\Name::class);
        Assert::nullOrIsInstanceOf($node->extends, Node\Name::class);
        Assert::allIsInstanceOf($node->implements, Node\Name::class);

        $flags      = $node->flags;
        $name       = $node->namespacedName->toCodeString();
        $extends    = $this->pNameOrNull($node->extends);
        $implements = $this->pNameList($node->implements);

        // stmts
        $traitUses      = $node->getTraitUses();
        $classConstants = $this->pClassConstants($node->getConstants());
        $properties     = $node->getProperties();
        $methods        = $node->getMethods();

        // todo 类定义
        return new Fragment\Decl\ClassDecl($flags, $name);
    }

    protected function visitStmtInterface(Node\Stmt\Interface_ $node): Fragment\Decl\InterfaceDecl
    {
        Assert::isInstanceOf($node->namespacedName, Node\Name::class);
        Assert::allIsInstanceOf($node->extends, Node\Name::class);

        $name    = $node->namespacedName->toCodeString();
        $extends = $this->pNameList($node->extends);

        // stmts
        $classConstants = $this->pClassConstants($node->getConstants());
        $methods        = $node->getMethods();

        // todo interface 定义
        return new Fragment\Decl\InterfaceDecl($name);
    }

    /**
     * @param Node\Stmt\ClassConst[] $nodes
     * @return Fragment\Decl\Part\ClassConst[]
     */
    protected function pClassConstants(array $nodes): array
    {
        Assert::allIsInstanceOf($nodes, Node\Stmt\ClassConst::class);

        $result = [];
        foreach ($nodes as $node) {
            $flags = $node->flags;
            foreach ($node->consts as $const) {
                $result[] = new Fragment\Decl\Part\ClassConst(
                    $flags,
                    $const->name,
                    $this->pExpr($const->value)
                );
            }
        }
        return $result;
    }

    ##############################
    # Stmt
    ##############################

    ##############################
    # Expr
    ##############################

    protected function visitScalar(Node\Scalar $node): Fragment\Expr
    {
        if ($node instanceof Node\Scalar\LNumber) {
            return Fragment\Expr\Scalar::int($node->value);
        } elseif ($node instanceof Node\Scalar\DNumber) {
            return Fragment\Expr\Scalar::float($node->value);
        } elseif ($node instanceof Node\Scalar\EncapsedStringPart) {
            return Fragment\Expr\Scalar::string($node->value);
        } elseif ($node instanceof Node\Scalar\String_) {
            return Fragment\Expr\Scalar::string($node->value);
        } elseif ($node instanceof Node\Scalar\Encapsed) {
            return new Fragment\Expr\StrConcat($this->pExprList($node->parts));
        } elseif ($node instanceof Node\Scalar\MagicConst) {
            return $this->visitScalarMagicConst($node);
        } else {
            throw new LogicException("预期外的 Scalar 类: " . get_class($node));
        }
    }

    protected function visitScalarMagicConst(Node\Scalar\MagicConst $node): Fragment\Expr\Scalar
    {
        $context = $this->context;
        if ($node instanceof Node\Scalar\MagicConst\Class_) {
            $value = $context->getClass();
            return Fragment\Expr\Scalar::string($value);
        } elseif ($node instanceof Node\Scalar\MagicConst\Dir) {
            // todo 替换项目目录为特殊前缀
            $value = dirname($context->getFile());
            return Fragment\Expr\Scalar::string($value);
        } elseif ($node instanceof Node\Scalar\MagicConst\File) {
            // todo 替换项目目录为特殊前缀
            $value = $context->getFile();
            return Fragment\Expr\Scalar::string($value);
        } elseif ($node instanceof Node\Scalar\MagicConst\Function_) {
            $value = $context->getFunction() ?: $context->getMethod();
            return Fragment\Expr\Scalar::string($value);
        } elseif ($node instanceof Node\Scalar\MagicConst\Line) {
            return Fragment\Expr\Scalar::string(null);
        } elseif ($node instanceof Node\Scalar\MagicConst\Method) {
            return Fragment\Expr\Scalar::string(null);
        } elseif ($node instanceof Node\Scalar\MagicConst\Namespace_) {
            $value = $node->getStartLine();
            return Fragment\Expr\Scalar::int($value);
        } elseif ($node instanceof Node\Scalar\MagicConst\Trait_) {
            $value = $context->getTrait();
            return Fragment\Expr\Scalar::string($value);
        } else {
            throw new LogicException("预期外的 MagicConst 类: " . get_class($node));
        }
    }
}
