declare (strict_types=1);
namespace P2Any\PhpParser\Node\Expr;

use P2Any\PhpParser\Node\Expr;
class Ternary extends \P2Any\PhpParser\Node\Expr
{
    /** @var Expr Condition */
    public $cond;
    /** @var null|Expr Expression for true */
    public $if;
    /** @var Expr Expression for false */
    public $else;
    /**
     * Constructs a ternary operator node.
     *
     * @param Expr      $cond       Condition
     * @param null|Expr $if         Expression for true
     * @param Expr      $else       Expression for false
     * @param array                    $attributes Additional attributes
     */
    public function __construct(\P2Any\PhpParser\Node\Expr $cond, $if, \P2Any\PhpParser\Node\Expr $else, array $attributes = [])
    {
        $this->attributes = $attributes;
        $this->cond = $cond;
        $this->if = $if;
        $this->else = $else;
    }
    public function getSubNodeNames() : array
    {
        return ['cond', 'if', 'else'];
    }
    public function getType() : string
    {
        return 'Expr_Ternary';
    }
}