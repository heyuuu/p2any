<?php

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Stmt;
use P2Any\Fragment\Stmt\Part\CondBranch;
use Webmozart\Assert\Assert;

class IfStmt implements Stmt
{
    /** @var CondBranch[] */
    public $branches;
    /** @var Stmt[]|null */
    public $defaultBranch;

    public function __construct(array $branches, ?array $defaultBranch = null)
    {
        Assert::allIsInstanceOf($branches, CondBranch::class);
        Assert::notEmpty($branches);
        if ($defaultBranch !== null) {
            Assert::allIsInstanceOf($defaultBranch, Stmt::class);
        }
        $this->branches      = $branches;
        $this->defaultBranch = $defaultBranch;
    }
}