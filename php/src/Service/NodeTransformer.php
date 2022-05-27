<?php

namespace P2Any\Service;

use JetBrains\PhpStorm\Internal\TentativeType;
use P2Any\Exception\LogicException;
use P2Any\Exception\FeatureNotSupportException;
use P2Any\Exception\TodoException;
use P2Any\Fragment;
use P2Any\PhpParser\Node;
use P2Any\Service\NodeTransformer\TempListFragment;
use Webmozart\Assert\Assert;

class NodeTransformer extends NodeTransformerAbstract
{
    protected static $skipTypes        = [
        Node\Stmt\Declare_::class   => true,
        Node\Stmt\Use_::class       => true,
        Node\Stmt\ClassConst::class => true,
    ];
    protected static $unsupportedTypes = [
        Node\Expr\ShellExec::class      => true,
        Node\Expr\Throw_::class         => true,
        Node\Expr\Error::class          => true,
        Node\Expr\Eval_::class          => true,
        // 不应直接出现的Node
        Node\Arg::class                 => true,
        Node\Param::class               => true,
        Node\Identifier::class          => true,
        Node\VarLikeIdentifier::class   => true,
        Node\Name::class                => true,
        Node\Name\Relative::class       => true,
        Node\Name\FullyQualified::class => true,
        Node\NullableType::class        => true,
        Node\Expr\ArrayItem::class      => true,
        Node\Stmt\Case_::class          => true,
        Node\Stmt\Catch_::class         => true,
        Node\Stmt\Finally_::class       => true,
        Node\Stmt\ElseIf_::class        => true,
        Node\Stmt\Else_::class          => true,
    ];

    /**
     * @param Node\Expr $node
     * @return Fragment\Expr
     */
    private function pExpr(Node\Expr $node): Fragment\Expr
    {
        return $this->visit($node, Fragment\Expr::class);
    }

    /**
     * @param Node\Expr|null $node
     * @return Fragment\Expr|null
     */
    private function pExprOrNull(?Node\Expr $node): ?Fragment\Expr
    {
        return $node !== null ? $this->pExpr($node) : null;
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
    private function pName(Node\Name $node): Fragment\Name
    {
        // todo
        // var_dump(sprintf("Name 类型: %s, value: %s", get_class($node), $node->toCodeString()));
        return new Fragment\Name($node->toCodeString());
    }

    private function pNameOrNull(?Node\Name $node): ?Fragment\Name
    {
        return $node ? $this->pName($node) : null;
    }

    /**
     * @param Node\Name[] $nodes
     * @return Fragment\Name[]
     */
    private function pNameList(array $nodes): array
    {
        Assert::allIsInstanceOf($nodes, Node\Name::class);
        return array_map([$this, 'pName'], $nodes);
    }

    private function pIdentifier(Node\Identifier $node): Fragment\Identifier
    {
        return new Fragment\Identifier($node->name);
    }

    private function pArg(Node\Arg $node): Fragment\Arg
    {
        return new Fragment\Arg(
            $this->pExpr($node->value),
            $node->byRef,
            $node->unpack
        );
    }

    /**
     * @param Node\Arg[] $nodes
     * @return Fragment\Arg[]
     */
    private function pArgList(array $nodes): array
    {
        return array_map([$this, 'pArg'], $nodes);
    }

    private function pParam(Node\Param $node): Fragment\Param
    {
        Assert::string($node->var->name, "Param->var->name 类型不能是 Expr");

        return new Fragment\Param(
            new Fragment\Identifier($node->var->name),
            $this->pTypeOrNull($node->type),
            $this->pExpr($node->default),
            $node->byRef,
            $node->variadic
        );
    }

    private function pType(Node $node): Fragment\TypeHint
    {
        if ($node instanceof Node\NullableType) {
            return $this->pType($node->type)->withNullable(true);
        } elseif ($node instanceof Node\Identifier) {
            return new Fragment\TypeHint($node->name);
        } elseif ($node instanceof Node\Name) {
            return new Fragment\TypeHint($node->toCodeString());
        } else {
            throw new LogicException("预期外的 TypeHint 类: " . get_class($node));
        }
    }

    private function pTypeOrNull(?Node $node): ?Fragment\TypeHint
    {
        return $node !== null ? $this->pType($node) : null;
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

        // todo 类定义
        return new Fragment\Decl\ClassDecl(
            $this->pName($node->namespacedName),
            $node->flags,
            $this->pNameOrNull($node->extends),
            $this->pNameList($node->implements),
            $this->pClassConstants($node->getConstants()),
            [],
            $this->pMethods($node->getMethods()),
            []
        );
    }

    protected function visitStmtInterface(Node\Stmt\Interface_ $node): Fragment\Decl\InterfaceDecl
    {
        Assert::isInstanceOf($node->namespacedName, Node\Name::class);
        Assert::allIsInstanceOf($node->extends, Node\Name::class);

        $name    = $node->namespacedName->toCodeString();
        $extends = $this->pNameList($node->extends);

        // stmts
        $classConstants = $this->pClassConstants($node->getConstants());
        $methods        = $this->pMethods($node->getMethods());

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

    protected function pMethods(array $methods): array
    {
        Assert::allIsInstanceOf($methods, Node\Stmt\ClassMethod::class);

        return collect($methods)->map(function (Node\Stmt\ClassMethod $method) {
            $flags = $method->flags;
            $byRef = $method->byRef;
            $name  = $method->name->name;
            // $params = $method->params

            $stmts = $method->stmts !== null ? $this->pStmtList($method->stmts) : null;

            return new Fragment\Decl\Part\Method();
        })->all();
    }

    ##############################
    # Stmt
    ##############################

    protected function visitStmtExpression(Node\Stmt\Expression $node): ?Fragment\Stmt
    {
        return new Fragment\Stmt\ExprStmt($this->pExpr($node->expr));
    }

    protected function visitStmtIf(Node\Stmt\If_ $node): ?Fragment\Stmt
    {
        $branches = [
            new Fragment\Stmt\Part\CondBranch(
                $this->pExpr($node->cond),
                $this->pStmtList($node->stmts)
            ),
        ];
        foreach ($node->elseifs as $elseif) {
            $branches[] = new Fragment\Stmt\Part\CondBranch(
                $this->pExpr($elseif->cond),
                $this->pStmtList($elseif->stmts)
            );
        }
        $defaultBranch = $node->else ? $this->pStmtList($node->else->stmts) : null;

        return new Fragment\Stmt\IfStmt($branches, $defaultBranch);
    }

    protected function visitStmtFor(Node\Stmt\For_ $node): ?Fragment\Stmt
    {
        return new Fragment\Stmt\ForStmt(
            $this->pExprList($node->init),
            $this->pExprList($node->cond),
            $this->pExprList($node->loop),
            $this->pStmtList($node->stmts)
        );
    }

    protected function visitStmtForeach(Node\Stmt\Foreach_ $node): ?Fragment\Stmt
    {
        return new Fragment\Stmt\ForeachStmt(
            $this->pExpr($node->expr),
            $this->pExprOrNull($node->keyVar),
            $node->byRef,
            $this->pExpr($node->valueVar),
            $this->pStmtList($node->stmts)
        );
    }

    protected function visitStmtWhile(Node\Stmt\While_ $node): ?Fragment\Stmt
    {
        return Fragment\Stmt\WhileStmt::while(
            $this->pExpr($node->cond),
            $this->pStmtList($node->stmts)
        );
    }

    protected function visitStmtDo(Node\Stmt\Do_ $node): ?Fragment\Stmt
    {
        return Fragment\Stmt\WhileStmt::doWhile(
            $this->pExpr($node->cond),
            $this->pStmtList($node->stmts)
        );
    }

    protected function visitStmtBreak(Node\Stmt\Break_ $node): ?Fragment\Stmt
    {
        return new Fragment\Stmt\Break_($this->pExprOrNull($node->num));
    }

    protected function visitStmtContinue(Node\Stmt\Continue_ $node): ?Fragment\Stmt
    {
        return new Fragment\Stmt\Continue_($this->pExprOrNull($node->num));
    }

    protected function visitStmtSwitch(Node\Stmt\Switch_ $node): ?Fragment\Stmt
    {
        return new Fragment\Stmt\SwitchStmt(
            $this->pExpr($node->cond),
            array_map(
                function (Node\Stmt\Case_ $case) {
                    return new Fragment\Stmt\Part\SwitchCaseBranch(
                        $this->pExprOrNull($case->cond),
                        $this->pStmtList($case->stmts)
                    );
                },
                $node->cases
            )
        );
    }

    protected function visitStmtTryCatch(Node\Stmt\TryCatch $node): ?Fragment\Stmt
    {
        return new Fragment\Stmt\TryCatchStmt(
            $this->pStmtList($node->stmts),
            array_map(
                function (Node\Stmt\Catch_ $catch) {
                    return new Fragment\Stmt\CatchBranch(
                        $this->pNameList($catch->types),
                        $this->visitExprVariable($catch->var),
                        $this->pStmtList($catch->stmts)
                    );
                },
                $node->catches
            ),
            $node->finally ? $this->pStmtList($node->finally->stmts) : null
        );
    }

    protected function visitStmtLabel(Node\Stmt\Label $node): ?Fragment\Stmt
    {
        return new Fragment\Stmt\Label($this->pIdentifier($node->name));
    }

    protected function visitStmtGoto(Node\Stmt\Goto_ $node): ?Fragment\Stmt
    {
        return new Fragment\Stmt\Goto_($this->pIdentifier($node->name));
    }

    protected function visitStmtNop(Node\Stmt\Nop $node)
    {
        return null;
    }

    protected function visitStmtReturn(Node\Stmt\Return_ $node): ?Fragment\Stmt
    {
        return new Fragment\Stmt\Return_($this->pExprOrNull($node->expr));
    }


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

    protected function visitExprAssignOp(Node\Expr\AssignOp $node): Fragment\Expr\AssignOp
    {
        if ($node instanceof Node\Expr\AssignOp\BitwiseAnd) {
            return Fragment\Expr\AssignOp::BitwiseAnd($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\BitwiseOr) {
            return Fragment\Expr\AssignOp::BitwiseOr($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\BitwiseXor) {
            return Fragment\Expr\AssignOp::BitwiseXor($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\Concat) {
            return Fragment\Expr\AssignOp::Concat($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\Div) {
            return Fragment\Expr\AssignOp::Div($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\Minus) {
            return Fragment\Expr\AssignOp::Minus($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\Mod) {
            return Fragment\Expr\AssignOp::Mod($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\Mul) {
            return Fragment\Expr\AssignOp::Mul($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\Plus) {
            return Fragment\Expr\AssignOp::Plus($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\Pow) {
            return Fragment\Expr\AssignOp::Pow($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\ShiftLeft) {
            return Fragment\Expr\AssignOp::ShiftLeft($this->pExpr($node->var), $this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\AssignOp\ShiftRight) {
            return Fragment\Expr\AssignOp::ShiftRight($this->pExpr($node->var), $this->pExpr($node->expr));
        } else {
            throw new LogicException("预期外的 AssignOp 类: " . get_class($node));
        }
    }

    protected function visitExprBinaryOp(Node\Expr\BinaryOp $node): Fragment\Expr\BinaryOp
    {
        if ($node instanceof Node\Expr\BinaryOp\BitwiseAnd) {
            return Fragment\Expr\BinaryOp::BitwiseAnd($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\BitwiseOr) {
            return Fragment\Expr\BinaryOp::BitwiseOr($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\BitwiseXor) {
            return Fragment\Expr\BinaryOp::BitwiseXor($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\BooleanAnd) {
            return Fragment\Expr\BinaryOp::BooleanAnd($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\BooleanOr) {
            return Fragment\Expr\BinaryOp::BooleanOr($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Coalesce) {
            return Fragment\Expr\BinaryOp::Coalesce($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Concat) {
            return Fragment\Expr\BinaryOp::Concat($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Div) {
            return Fragment\Expr\BinaryOp::Div($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Equal) {
            return Fragment\Expr\BinaryOp::Equal($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Greater) {
            return Fragment\Expr\BinaryOp::Greater($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\GreaterOrEqual) {
            return Fragment\Expr\BinaryOp::GreaterOrEqual($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Identical) {
            return Fragment\Expr\BinaryOp::Identical($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\LogicalAnd) {
            return Fragment\Expr\BinaryOp::LogicalAnd($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\LogicalOr) {
            return Fragment\Expr\BinaryOp::LogicalOr($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\LogicalXor) {
            return Fragment\Expr\BinaryOp::LogicalXor($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Minus) {
            return Fragment\Expr\BinaryOp::Minus($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Mod) {
            return Fragment\Expr\BinaryOp::Mod($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Mul) {
            return Fragment\Expr\BinaryOp::Mul($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\NotEqual) {
            return Fragment\Expr\BinaryOp::NotEqual($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\NotIdentical) {
            return Fragment\Expr\BinaryOp::NotIdentical($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Plus) {
            return Fragment\Expr\BinaryOp::Plus($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Pow) {
            return Fragment\Expr\BinaryOp::Pow($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\ShiftLeft) {
            return Fragment\Expr\BinaryOp::ShiftLeft($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\ShiftRight) {
            return Fragment\Expr\BinaryOp::ShiftRight($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Smaller) {
            return Fragment\Expr\BinaryOp::Smaller($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\SmallerOrEqual) {
            return Fragment\Expr\BinaryOp::SmallerOrEqual($this->pExpr($node->left), $this->pExpr($node->right));
        } elseif ($node instanceof Node\Expr\BinaryOp\Spaceship) {
            return Fragment\Expr\BinaryOp::Spaceship($this->pExpr($node->left), $this->pExpr($node->right));
        } else {
            throw new LogicException("预期外的 BinaryOp 类: " . get_class($node));
        }
    }

    protected function visitExprCast(Node\Expr\Cast $node): ?Fragment\Expr
    {
        if ($node instanceof Node\Expr\Cast\Array_) {
            return Fragment\Expr\Cast::array($this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\Cast\Bool_) {
            return Fragment\Expr\Cast::bool($this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\Cast\Double) {
            return Fragment\Expr\Cast::double($this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\Cast\Int_) {
            return Fragment\Expr\Cast::int($this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\Cast\Object_) {
            return Fragment\Expr\Cast::object($this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\Cast\String_) {
            return Fragment\Expr\Cast::string($this->pExpr($node->expr));
        } elseif ($node instanceof Node\Expr\Cast\Unset_) {
            throw FeatureNotSupportException::deprecated("(unset) cast");
        } else {
            throw new LogicException("预期外的 Cast 类: " . get_class($node));
        }
    }

    protected function visitExprUnaryPlus(Node\Expr\UnaryPlus $node): ?Fragment\Expr
    {
        return Fragment\Expr\Unary::plus($this->pExpr($node->expr));
    }

    protected function visitExprUnaryMinus(Node\Expr\UnaryMinus $node): ?Fragment\Expr
    {
        return Fragment\Expr\Unary::minus($this->pExpr($node->expr));
    }

    protected function visitExprAssign(Node\Expr\Assign $node): ?Fragment\Expr
    {
        return new Fragment\Expr\Assign($this->pExpr($node->var), $this->pExpr($node->expr));
    }

    protected function visitExprArrayDimFetch(Node\Expr\ArrayDimFetch $node): ?Fragment\Expr
    {
        return new Fragment\Expr\ArrayDimFetch(
            $this->pExpr($node->var),
            $node->dim !== null ? $this->pExpr($node->dim) : null
        );
    }

    protected function visitExprPropertyFetch(Node\Expr\PropertyFetch $node): ?Fragment\Expr
    {
        if (!($node->name instanceof Node\Identifier)) {
            var_dump($node);
            throw new TodoException("PropertyFetch 的 name 非 Identifier 对象");
        }
        return new Fragment\Expr\PropertyFetch(
            $this->pExpr($node->var),
            $this->pIdentifier($node->name)
        );
    }

    protected function visitExprStaticCall(Node\Expr\StaticCall $node): ?Fragment\Expr
    {
        if (!($node->class instanceof Node\Name)) {
            var_dump($node);
            throw new TodoException("StaticCall 的 name 非 Name 对象");
        }
        if (!($node->name instanceof Node\Identifier)) {
            var_dump($node);
            throw new TodoException("StaticCall 的 name 非 Identifier 对象");
        }

        return new Fragment\Expr\StaticCall(
            $this->pName($node->class),
            $this->pIdentifier($node->name)
        );
    }

    protected function visitExprAssignRef(Node\Expr\AssignRef $node): ?Fragment\Expr
    {
        return new Fragment\Expr\AssignRef(
            $this->pExpr($node->var),
            $this->pExpr($node->expr)
        );
    }

    protected function visitExprBitwiseNot(Node\Expr\BitwiseNot $node): ?Fragment\Expr
    {
        return new Fragment\Expr\BitwiseNot(
            $this->pExpr($node->expr)
        );
    }

    protected function visitExprBooleanNot(Node\Expr\BooleanNot $node): ?Fragment\Expr
    {
        return new Fragment\Expr\BooleanNot(
            $this->pExpr($node->expr)
        );
    }

    protected function visitExprClassConstFetch(Node\Expr\ClassConstFetch $node): ?Fragment\Expr
    {
        if (!($node->class instanceof Node\Name)) {
            throw new TodoException("暂未支持 ClassConstFetch->class 不为 Name 的情况");
        }
        if (!($node->name instanceof Node\Identifier)) {
            throw new TodoException("暂未支持 ClassConstFetch->class 不为 Name 的情况");
        }

        return new Fragment\Expr\ClassConstFetch(
            $this->pName($node->class),
            $this->pIdentifier($node->name)
        );
    }

    protected function visitExprClone(Node\Expr\Clone_ $node): ?Fragment\Expr
    {
        return new Fragment\Expr\Clone_($this->pExpr($node->expr));
    }

    protected function visitExprConstFetch(Node\Expr\ConstFetch $node): ?Fragment\Expr
    {
        return new Fragment\Expr\ConstFetch($this->pName($node->name));
    }

    protected function visitExprEmpty(Node\Expr\Empty_ $node): ?Fragment\Expr
    {
        return new Fragment\Expr\Empty_($this->pExpr($node->expr));
    }

    protected function visitExprExit(Node\Expr\Exit_ $node): ?Fragment\Expr
    {
        return new Fragment\Expr\Exit_($this->pExprOrNull($node->expr));
    }

    protected function visitExprFuncCall(Node\Expr\FuncCall $node): ?Fragment\Expr
    {
        if (!($node->name instanceof Node\Name)) {
            throw new TodoException("暂未支持 FuncCall->name 不为 Name 的情况");
        }

        return new Fragment\Expr\FuncCall(
            $this->pName($node->name),
            $this->pArgList($node->args)
        );
    }

    protected function visitExprInclude(Node\Expr\Include_ $node): ?Fragment\Expr
    {
        throw new TodoException('暂不支持 include/require 相关功能', $node);

        return new Fragment\Expr\Include_(
            $this->pExpr($node->expr),
            $node->type
        );
    }

    protected function visitExprInstanceof(Node\Expr\Instanceof_ $node): ?Fragment\Expr
    {
        if (!($node->class instanceof Node\Name)) {
            throw new TodoException("暂未支持 Instanceof->class 不为 Name 的情况");
        }

        return new Fragment\Expr\Instanceof_($this->pExpr($node->expr), $this->pName($node->class));
    }

    protected function visitExprIsset(Node\Expr\Isset_ $node): ?Fragment\Expr
    {
        return new Fragment\Expr\Isset_(
            $this->pExprList($node->vars)
        );
    }

    protected function visitExprList(Node\Expr\List_ $node): ?Fragment\Expr
    {
        $items = array_map(function (?Node\Expr\ArrayItem $arrayItem) {
            return $arrayItem ? $this->pArrayItem($arrayItem) : null;
        }, $node->items);

        return new Fragment\Expr\List_($items);
    }

    protected function visitExprMethodCall(Node\Expr\MethodCall $node): ?Fragment\Expr
    {
        if (!($node->name instanceof Node\Identifier)) {
            throw new TodoException("暂未支持 MethodCall->name 不为 Identifier 的情况");
        }

        return new Fragment\Expr\MethodCall(
            $this->pExpr($node->var),
            $this->pIdentifier($node->name),
            $this->pArgList($node->args)
        );
    }

    protected function visitExprPostDec(Node\Expr\PostDec $node): ?Fragment\Expr
    {
        return new Fragment\Expr\PostDec($this->pExpr($node->var));
    }

    protected function visitExprPostInc(Node\Expr\PostInc $node): ?Fragment\Expr
    {
        return new Fragment\Expr\PostInc($this->pExpr($node->var));
    }

    protected function visitExprPreDec(Node\Expr\PreDec $node): ?Fragment\Expr
    {
        return new Fragment\Expr\PreDec($this->pExpr($node->var));
    }

    protected function visitExprPreInc(Node\Expr\PreInc $node): ?Fragment\Expr
    {
        return new Fragment\Expr\PreInc($this->pExpr($node->var));
    }

    protected function visitExprPrint(Node\Expr\Print_ $node): ?Fragment\Expr
    {
        return new Fragment\Expr\Print_($this->pExpr($node->expr));
    }

    protected function visitExprStaticPropertyFetch(Node\Expr\StaticPropertyFetch $node): ?Fragment\Expr
    {
        if (!($node->class instanceof Node\Name)) {
            throw new TodoException("暂未支持 StaticPropertyFetch->class 不为 Name 的情况");
        }
        if (!($node->name instanceof Node\VarLikeIdentifier)) {
            throw new TodoException("暂未支持 StaticPropertyFetch->name 不为 VarLikeIdentifier 的情况");
        }

        return new Fragment\Expr\StaticPropertyFetch(
            $this->pName($node->class),
            $this->pIdentifier($node->name)
        );
    }

    protected function visitExprTernary(Node\Expr\Ternary $node): ?Fragment\Expr
    {
        return new Fragment\Expr\Ternary(
            $this->pExpr($node->cond),
            $this->pExprOrNull($node->if),
            $this->pExpr($node->else)
        );
    }

    protected function visitExprVariable(Node\Expr\Variable $node): Fragment\Expr\Variable
    {
        if (!is_string($node->name)) {
            throw new TodoException("暂不支持动态变量 (Variable 名为 Expr)");
        }

        return new Fragment\Expr\Variable(new Fragment\Identifier($node->name));
    }

    protected function visitExprYieldFrom(Node\Expr\YieldFrom $node): ?Fragment\Expr
    {
        return new Fragment\Expr\YieldFrom($this->pExpr($node->expr));
    }

    protected function visitExprYield(Node\Expr\Yield_ $node): ?Fragment\Expr
    {
        return new Fragment\Expr\Yield_($this->pExprOrNull($node->key), $this->pExprOrNull($node->value));
    }

    protected function visitExprArray(Node\Expr\Array_ $node): ?Fragment\Expr
    {
        Assert::allNotNull($node->items, "暂不支持 Array_ 的 item 表达式为 null");

        $items = array_map([$this, 'pArrayItem'], $node->items);

        return new Fragment\Expr\Array_($items);
    }

    private function pArrayItem(Node\Expr\ArrayItem $arrayItem): Fragment\Expr\Part\ArrayItem
    {
        if ($arrayItem->unpack === true) {
            throw FeatureNotSupportException::highLevelFeature("Spread operators in arrays are only allowed since PHP 7.4");
        }

        return new Fragment\Expr\Part\ArrayItem(
            $this->pExprOrNull($arrayItem->key),
            $this->pExpr($arrayItem->value),
            $arrayItem->byRef
        );
    }

    protected function visitExprNew(Node\Expr\New_ $node): ?Fragment\Expr
    {
        if (!($node->class instanceof Node\Name)) {
            throw new TodoException("暂未支持 ExprNew->class 不为 Name 的情况");
        }

        return new Fragment\Expr\New_(
            $this->pName($node->class),
            $this->pArgList($node->args)
        );
    }
}
