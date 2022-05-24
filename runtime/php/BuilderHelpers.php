declare (strict_types=1);
namespace P2Any\PhpParser;

use P2Any\PhpParser\Node\ComplexType;
use P2Any\PhpParser\Node\Expr;
use P2Any\PhpParser\Node\Identifier;
use P2Any\PhpParser\Node\Name;
use P2Any\PhpParser\Node\NullableType;
use P2Any\PhpParser\Node\Scalar;
use P2Any\PhpParser\Node\Stmt;
/**
 * This class defines helpers used in the implementation of builders. Don't use it directly.
 *
 * @internal
 */
final class BuilderHelpers
{
    /**
     * Normalizes a node: Converts builder objects to nodes.
     *
     * @param Node|Builder $node The node to normalize
     *
     * @return Node The normalized node
     */
    public static function normalizeNode($node) : \P2Any\PhpParser\Node
    {
        if ($node instanceof \P2Any\PhpParser\Builder) {
            return $node->getNode();
        }
        if ($node instanceof \P2Any\PhpParser\Node) {
            return $node;
        }
        throw new \LogicException('Expected node or builder object');
    }
    /**
     * Normalizes a node to a statement.
     *
     * Expressions are wrapped in a Stmt\Expression node.
     *
     * @param Node|Builder $node The node to normalize
     *
     * @return Stmt The normalized statement node
     */
    public static function normalizeStmt($node) : \P2Any\PhpParser\Node\Stmt
    {
        $node = self::normalizeNode($node);
        if ($node instanceof \P2Any\PhpParser\Node\Stmt) {
            return $node;
        }
        if ($node instanceof \P2Any\PhpParser\Node\Expr) {
            return new \P2Any\PhpParser\Node\Stmt\Expression($node);
        }
        throw new \LogicException('Expected statement or expression node');
    }
    /**
     * Normalizes strings to Identifier.
     *
     * @param string|Identifier $name The identifier to normalize
     *
     * @return Identifier The normalized identifier
     */
    public static function normalizeIdentifier($name) : \P2Any\PhpParser\Node\Identifier
    {
        if ($name instanceof \P2Any\PhpParser\Node\Identifier) {
            return $name;
        }
        if (\is_string($name)) {
            return new \P2Any\PhpParser\Node\Identifier($name);
        }
        throw new \LogicException('Expected string or instance of Node\\Identifier');
    }
    /**
     * Normalizes strings to Identifier, also allowing expressions.
     *
     * @param string|Identifier|Expr $name The identifier to normalize
     *
     * @return Identifier|Expr The normalized identifier or expression
     */
    public static function normalizeIdentifierOrExpr($name)
    {
        if ($name instanceof \P2Any\PhpParser\Node\Identifier || $name instanceof \P2Any\PhpParser\Node\Expr) {
            return $name;
        }
        if (\is_string($name)) {
            return new \P2Any\PhpParser\Node\Identifier($name);
        }
        throw new \LogicException('Expected string or instance of Node\\Identifier or Node\\Expr');
    }
    /**
     * Normalizes a name: Converts string names to Name nodes.
     *
     * @param Name|string $name The name to normalize
     *
     * @return Name The normalized name
     */
    public static function normalizeName($name) : \P2Any\PhpParser\Node\Name
    {
        if ($name instanceof \P2Any\PhpParser\Node\Name) {
            return $name;
        }
        if (is_string($name)) {
            if (!$name) {
                throw new \LogicException('Name cannot be empty');
            }
            if ($name[0] === '\\') {
                return new \P2Any\PhpParser\Node\Name\FullyQualified(substr($name, 1));
            }
            if (0 === strpos($name, 'namespace\\')) {
                return new \P2Any\PhpParser\Node\Name\Relative(substr($name, strlen('namespace\\')));
            }
            return new \P2Any\PhpParser\Node\Name($name);
        }
        throw new \LogicException('Name must be a string or an instance of Node\\Name');
    }
    /**
     * Normalizes a name: Converts string names to Name nodes, while also allowing expressions.
     *
     * @param Expr|Name|string $name The name to normalize
     *
     * @return Name|Expr The normalized name or expression
     */
    public static function normalizeNameOrExpr($name)
    {
        if ($name instanceof \P2Any\PhpParser\Node\Expr) {
            return $name;
        }
        if (!is_string($name) && !$name instanceof \P2Any\PhpParser\Node\Name) {
            throw new \LogicException('Name must be a string or an instance of Node\\Name or Node\\Expr');
        }
        return self::normalizeName($name);
    }
    /**
     * Normalizes a type: Converts plain-text type names into proper AST representation.
     *
     * In particular, builtin types become Identifiers, custom types become Names and nullables
     * are wrapped in NullableType nodes.
     *
     * @param string|Name|Identifier|ComplexType $type The type to normalize
     *
     * @return Name|Identifier|ComplexType The normalized type
     */
    public static function normalizeType($type)
    {
        if (!is_string($type)) {
            if (!$type instanceof \P2Any\PhpParser\Node\Name && !$type instanceof \P2Any\PhpParser\Node\Identifier && !$type instanceof \P2Any\PhpParser\Node\ComplexType) {
                throw new \LogicException('Type must be a string, or an instance of Name, Identifier or ComplexType');
            }
            return $type;
        }
        $nullable = false;
        if (strlen($type) > 0 && $type[0] === '?') {
            $nullable = true;
            $type = substr($type, 1);
        }
        $builtinTypes = ['array', 'callable', 'string', 'int', 'float', 'bool', 'iterable', 'void', 'object', 'mixed', 'never'];
        $lowerType = strtolower($type);
        if (in_array($lowerType, $builtinTypes)) {
            $type = new \P2Any\PhpParser\Node\Identifier($lowerType);
        } else {
            $type = self::normalizeName($type);
        }
        $notNullableTypes = ['void', 'mixed', 'never'];
        if ($nullable && in_array((string) $type, $notNullableTypes)) {
            throw new \LogicException(sprintf('%s type cannot be nullable', $type));
        }
        return $nullable ? new \P2Any\PhpParser\Node\NullableType($type) : $type;
    }
    /**
     * Normalizes a value: Converts nulls, booleans, integers,
     * floats, strings and arrays into their respective nodes
     *
     * @param Node\Expr|bool|null|int|float|string|array $value The value to normalize
     *
     * @return Expr The normalized value
     */
    public static function normalizeValue($value) : \P2Any\PhpParser\Node\Expr
    {
        if ($value instanceof \P2Any\PhpParser\Node\Expr) {
            return $value;
        }
        if (is_null($value)) {
            return new \P2Any\PhpParser\Node\Expr\ConstFetch(new \P2Any\PhpParser\Node\Name('null'));
        }
        if (is_bool($value)) {
            return new \P2Any\PhpParser\Node\Expr\ConstFetch(new \P2Any\PhpParser\Node\Name($value ? 'true' : 'false'));
        }
        if (is_int($value)) {
            return new \P2Any\PhpParser\Node\Scalar\LNumber($value);
        }
        if (is_float($value)) {
            return new \P2Any\PhpParser\Node\Scalar\DNumber($value);
        }
        if (is_string($value)) {
            return new \P2Any\PhpParser\Node\Scalar\String_($value);
        }
        if (is_array($value)) {
            $items = [];
            $lastKey = -1;
            foreach ($value as $itemKey => $itemValue) {
                // for consecutive, numeric keys don't generate keys
                if (null !== $lastKey && ++$lastKey === $itemKey) {
                    $items[] = new \P2Any\PhpParser\Node\Expr\ArrayItem(self::normalizeValue($itemValue));
                } else {
                    $lastKey = null;
                    $items[] = new \P2Any\PhpParser\Node\Expr\ArrayItem(self::normalizeValue($itemValue), self::normalizeValue($itemKey));
                }
            }
            return new \P2Any\PhpParser\Node\Expr\Array_($items);
        }
        throw new \LogicException('Invalid value');
    }
    /**
     * Normalizes a doc comment: Converts plain strings to PhpParser\Comment\Doc.
     *
     * @param Comment\Doc|string $docComment The doc comment to normalize
     *
     * @return Comment\Doc The normalized doc comment
     */
    public static function normalizeDocComment($docComment) : \P2Any\PhpParser\Comment\Doc
    {
        if ($docComment instanceof \P2Any\PhpParser\Comment\Doc) {
            return $docComment;
        }
        if (is_string($docComment)) {
            return new \P2Any\PhpParser\Comment\Doc($docComment);
        }
        throw new \LogicException('Doc comment must be a string or an instance of PhpParser\\Comment\\Doc');
    }
    /**
     * Normalizes a attribute: Converts attribute to the Attribute Group if needed.
     *
     * @param Node\Attribute|Node\AttributeGroup $attribute
     *
     * @return Node\AttributeGroup The Attribute Group
     */
    public static function normalizeAttribute($attribute) : \P2Any\PhpParser\Node\AttributeGroup
    {
        if ($attribute instanceof \P2Any\PhpParser\Node\AttributeGroup) {
            return $attribute;
        }
        if (!$attribute instanceof \P2Any\PhpParser\Node\Attribute) {
            throw new \LogicException('Attribute must be an instance of PhpParser\\Node\\Attribute or PhpParser\\Node\\AttributeGroup');
        }
        return new \P2Any\PhpParser\Node\AttributeGroup([$attribute]);
    }
    /**
     * Adds a modifier and returns new modifier bitmask.
     *
     * @param int $modifiers Existing modifiers
     * @param int $modifier  Modifier to set
     *
     * @return int New modifiers
     */
    public static function addModifier(int $modifiers, int $modifier) : int
    {
        \P2Any\PhpParser\Node\Stmt\Class_::verifyModifier($modifiers, $modifier);
        return $modifiers | $modifier;
    }
}