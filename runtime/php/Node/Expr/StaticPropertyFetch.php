declare (strict_types=1);
namespace P2Any\PhpParser\Node\Expr;

use P2Any\PhpParser\Node\Expr;
use P2Any\PhpParser\Node\Name;
use P2Any\PhpParser\Node\VarLikeIdentifier;
class StaticPropertyFetch extends \P2Any\PhpParser\Node\Expr
{
    /** @var Name|Expr Class name */
    public $class;
    /** @var VarLikeIdentifier|Expr Property name */
    public $name;
    /**
     * Constructs a static property fetch node.
     *
     * @param Name|Expr                     $class      Class name
     * @param string|VarLikeIdentifier|Expr $name       Property name
     * @param array                         $attributes Additional attributes
     */
    public function __construct($class, $name, array $attributes = [])
    {
        $this->attributes = $attributes;
        $this->class = $class;
        $this->name = \is_string($name) ? new \P2Any\PhpParser\Node\VarLikeIdentifier($name) : $name;
    }
    public function getSubNodeNames() : array
    {
        return ['class', 'name'];
    }
    public function getType() : string
    {
        return 'Expr_StaticPropertyFetch';
    }
}