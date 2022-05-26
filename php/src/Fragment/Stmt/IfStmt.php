<?php

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Stmt\Part\CondBranch;
use P2Any\Fragment\StmtList;
use Webmozart\Assert\Assert;

class IfStmt
{
    /** @var CondBranch[] */
    public $branches;
    /** @var StmtList|null */
    public $defaultBranch;

    public function __construct(array $branches, ?StmtList $defaultBranch = null)
    {
        Assert::allIsInstanceOf($branches, CondBranch::class);
        Assert::notEmpty($branches);
        $this->branches      = $branches;
        $this->defaultBranch = $defaultBranch;
    }
}