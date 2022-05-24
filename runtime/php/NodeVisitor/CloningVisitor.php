declare (strict_types=1);
namespace P2Any\PhpParser\NodeVisitor;

use P2Any\PhpParser\Node;
use P2Any\PhpParser\NodeVisitorAbstract;
/**
 * Visitor cloning all nodes and linking to the original nodes using an attribute.
 *
 * This visitor is required to perform format-preserving pretty prints.
 */
class CloningVisitor extends \P2Any\PhpParser\NodeVisitorAbstract
{
    public function enterNode(\P2Any\PhpParser\Node $origNode)
    {
        $node = clone $origNode;
        $node->setAttribute('origNode', $origNode);
        return $node;
    }
}