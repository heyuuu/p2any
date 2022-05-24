declare (strict_types=1);
namespace P2Any\PhpParser\Builder;

use P2Any\PhpParser;
use P2Any\PhpParser\BuilderHelpers;
use P2Any\PhpParser\Node;
use P2Any\PhpParser\Node\Stmt;
class Namespace_ extends \P2Any\PhpParser\Builder\Declaration
{
    private $name;
    private $stmts = [];
    /**
     * Creates a namespace builder.
     *
     * @param Node\Name|string|null $name Name of the namespace
     */
    public function __construct($name)
    {
        $this->name = null !== $name ? \P2Any\PhpParser\BuilderHelpers::normalizeName($name) : null;
    }
    /**
     * Adds a statement.
     *
     * @param Node|PhpParser\Builder $stmt The statement to add
     *
     * @return $this The builder instance (for fluid interface)
     */
    public function addStmt($stmt)
    {
        $this->stmts[] = \P2Any\PhpParser\BuilderHelpers::normalizeStmt($stmt);
        return $this;
    }
    /**
     * Returns the built node.
     *
     * @return Stmt\Namespace_ The built node
     */
    public function getNode() : \P2Any\PhpParser\Node
    {
        return new \P2Any\PhpParser\Node\Stmt\Namespace_($this->name, $this->stmts, $this->attributes);
    }
}