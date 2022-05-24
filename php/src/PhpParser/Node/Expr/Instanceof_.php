<?php declare(strict_types=1);

namespace P2Any\PhpParser\Node\Expr;

use P2Any\PhpParser\Node\Expr;
use P2Any\PhpParser\Node\Identifier;
use P2Any\PhpParser\Node\Name;

class Instanceof_ extends Expr
{
    /** @var Expr Expression */
    public $expr;
    /** @var Name|Variable Class name */
    public $class;

    /**
     * Constructs an instanceof check node.
     *
     * @param Expr            $expr       Expression
     * @param Name|Identifier $class      Class name
     * @param array           $attributes Additional attributes
     */
    public function __construct(Expr $expr, $class, array $attributes = [])
    {
        $this->attributes = $attributes;
        $this->expr       = $expr;
        $this->class      = $class;
    }

    public function getSubNodeNames(): array
    {
        return ['expr', 'class'];
    }

    public function getType(): string
    {
        return 'Expr_Instanceof';
    }
}
