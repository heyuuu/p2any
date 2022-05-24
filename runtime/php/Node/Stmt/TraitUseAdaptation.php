declare (strict_types=1);
namespace P2Any\PhpParser\Node\Stmt;

use P2Any\PhpParser\Node;
abstract class TraitUseAdaptation extends \P2Any\PhpParser\Node\Stmt
{
    /** @var Node\Name|null Trait name */
    public $trait;
    /** @var Node\Identifier Method name */
    public $method;
}