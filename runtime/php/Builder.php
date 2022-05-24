declare (strict_types=1);
namespace P2Any\PhpParser;

interface Builder
{
    /**
     * Returns the built node.
     *
     * @return Node The built node
     */
    public function getNode() : \P2Any\PhpParser\Node;
}