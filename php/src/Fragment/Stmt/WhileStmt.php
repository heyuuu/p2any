<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Stmt\Part\CondBranch;

class WhileStmt implements Stmt
{
    const TYPE_WHILE    = 'while';
    const TYPE_DO_WHILE = 'do';

    /** @var CondBranch */
    public $condBranch;
    /** @var string */
    private $type;

    private function __construct(CondBranch $condBranch, string $type)
    {
        $this->condBranch = $condBranch;
        $this->type       = $type;
    }

    public static function while(CondBranch $condBranch): WhileStmt
    {
        return new WhileStmt($condBranch, self::TYPE_WHILE);
    }

    public static function doWhile(CondBranch $condBranch): WhileStmt
    {
        return new WhileStmt($condBranch, self::TYPE_DO_WHILE);
    }
}
