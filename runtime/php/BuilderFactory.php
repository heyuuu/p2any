declare (strict_types=1);
namespace P2Any\PhpParser;

use P2Any\PhpParser\Node\Arg;
use P2Any\PhpParser\Node\Expr;
use P2Any\PhpParser\Node\Expr\BinaryOp\Concat;
use P2Any\PhpParser\Node\Identifier;
use P2Any\PhpParser\Node\Name;
use P2Any\PhpParser\Node\Scalar\String_;
use P2Any\PhpParser\Node\Stmt\Use_;
class BuilderFactory
{
    /**
     * Creates an attribute node.
     *
     * @param string|Name $name Name of the attribute
     * @param array       $args Attribute named arguments
     *
     * @return Node\Attribute
     */
    public function attribute($name, array $args = []) : \P2Any\PhpParser\Node\Attribute
    {
        return new \P2Any\PhpParser\Node\Attribute(\P2Any\PhpParser\BuilderHelpers::normalizeName($name), $this->args($args));
    }
    /**
     * Creates a namespace builder.
     *
     * @param null|string|Node\Name $name Name of the namespace
     *
     * @return Builder\Namespace_ The created namespace builder
     */
    public function namespace($name) : \P2Any\PhpParser\Builder\Namespace_
    {
        return new \P2Any\PhpParser\Builder\Namespace_($name);
    }
    /**
     * Creates a class builder.
     *
     * @param string $name Name of the class
     *
     * @return Builder\Class_ The created class builder
     */
    public function class(string $name) : \P2Any\PhpParser\Builder\Class_
    {
        return new \P2Any\PhpParser\Builder\Class_($name);
    }
    /**
     * Creates an interface builder.
     *
     * @param string $name Name of the interface
     *
     * @return Builder\Interface_ The created interface builder
     */
    public function interface(string $name) : \P2Any\PhpParser\Builder\Interface_
    {
        return new \P2Any\PhpParser\Builder\Interface_($name);
    }
    /**
     * Creates a trait builder.
     *
     * @param string $name Name of the trait
     *
     * @return Builder\Trait_ The created trait builder
     */
    public function trait(string $name) : \P2Any\PhpParser\Builder\Trait_
    {
        return new \P2Any\PhpParser\Builder\Trait_($name);
    }
    /**
     * Creates an enum builder.
     *
     * @param string $name Name of the enum
     *
     * @return Builder\Enum_ The created enum builder
     */
    public function enum(string $name) : \P2Any\PhpParser\Builder\Enum_
    {
        return new \P2Any\PhpParser\Builder\Enum_($name);
    }
    /**
     * Creates a trait use builder.
     *
     * @param Node\Name|string ...$traits Trait names
     *
     * @return Builder\TraitUse The create trait use builder
     */
    public function useTrait(...$traits) : \P2Any\PhpParser\Builder\TraitUse
    {
        return new \P2Any\PhpParser\Builder\TraitUse(...$traits);
    }
    /**
     * Creates a trait use adaptation builder.
     *
     * @param Node\Name|string|null  $trait  Trait name
     * @param Node\Identifier|string $method Method name
     *
     * @return Builder\TraitUseAdaptation The create trait use adaptation builder
     */
    public function traitUseAdaptation($trait, $method = null) : \P2Any\PhpParser\Builder\TraitUseAdaptation
    {
        if ($method === null) {
            $method = $trait;
            $trait = null;
        }
        return new \P2Any\PhpParser\Builder\TraitUseAdaptation($trait, $method);
    }
    /**
     * Creates a method builder.
     *
     * @param string $name Name of the method
     *
     * @return Builder\Method The created method builder
     */
    public function method(string $name) : \P2Any\PhpParser\Builder\Method
    {
        return new \P2Any\PhpParser\Builder\Method($name);
    }
    /**
     * Creates a parameter builder.
     *
     * @param string $name Name of the parameter
     *
     * @return Builder\Param The created parameter builder
     */
    public function param(string $name) : \P2Any\PhpParser\Builder\Param
    {
        return new \P2Any\PhpParser\Builder\Param($name);
    }
    /**
     * Creates a property builder.
     *
     * @param string $name Name of the property
     *
     * @return Builder\Property The created property builder
     */
    public function property(string $name) : \P2Any\PhpParser\Builder\Property
    {
        return new \P2Any\PhpParser\Builder\Property($name);
    }
    /**
     * Creates a function builder.
     *
     * @param string $name Name of the function
     *
     * @return Builder\Function_ The created function builder
     */
    public function function(string $name) : \P2Any\PhpParser\Builder\Function_
    {
        return new \P2Any\PhpParser\Builder\Function_($name);
    }
    /**
     * Creates a namespace/class use builder.
     *
     * @param Node\Name|string $name Name of the entity (namespace or class) to alias
     *
     * @return Builder\Use_ The created use builder
     */
    public function use($name) : \P2Any\PhpParser\Builder\Use_
    {
        return new \P2Any\PhpParser\Builder\Use_($name, \P2Any\PhpParser\Node\Stmt\Use_::TYPE_NORMAL);
    }
    /**
     * Creates a function use builder.
     *
     * @param Node\Name|string $name Name of the function to alias
     *
     * @return Builder\Use_ The created use function builder
     */
    public function useFunction($name) : \P2Any\PhpParser\Builder\Use_
    {
        return new \P2Any\PhpParser\Builder\Use_($name, \P2Any\PhpParser\Node\Stmt\Use_::TYPE_FUNCTION);
    }
    /**
     * Creates a constant use builder.
     *
     * @param Node\Name|string $name Name of the const to alias
     *
     * @return Builder\Use_ The created use const builder
     */
    public function useConst($name) : \P2Any\PhpParser\Builder\Use_
    {
        return new \P2Any\PhpParser\Builder\Use_($name, \P2Any\PhpParser\Node\Stmt\Use_::TYPE_CONSTANT);
    }
    /**
     * Creates a class constant builder.
     *
     * @param string|Identifier                          $name  Name
     * @param Node\Expr|bool|null|int|float|string|array $value Value
     *
     * @return Builder\ClassConst The created use const builder
     */
    public function classConst($name, $value) : \P2Any\PhpParser\Builder\ClassConst
    {
        return new \P2Any\PhpParser\Builder\ClassConst($name, $value);
    }
    /**
     * Creates an enum case builder.
     *
     * @param string|Identifier $name  Name
     *
     * @return Builder\EnumCase The created use const builder
     */
    public function enumCase($name) : \P2Any\PhpParser\Builder\EnumCase
    {
        return new \P2Any\PhpParser\Builder\EnumCase($name);
    }
    /**
     * Creates node a for a literal value.
     *
     * @param Expr|bool|null|int|float|string|array $value $value
     *
     * @return Expr
     */
    public function val($value) : \P2Any\PhpParser\Node\Expr
    {
        return \P2Any\PhpParser\BuilderHelpers::normalizeValue($value);
    }
    /**
     * Creates variable node.
     *
     * @param string|Expr $name Name
     *
     * @return Expr\Variable
     */
    public function var($name) : \P2Any\PhpParser\Node\Expr\Variable
    {
        if (!\is_string($name) && !$name instanceof \P2Any\PhpParser\Node\Expr) {
            throw new \LogicException('Variable name must be string or Expr');
        }
        return new \P2Any\PhpParser\Node\Expr\Variable($name);
    }
    /**
     * Normalizes an argument list.
     *
     * Creates Arg nodes for all arguments and converts literal values to expressions.
     *
     * @param array $args List of arguments to normalize
     *
     * @return Arg[]
     */
    public function args(array $args) : array
    {
        $normalizedArgs = [];
        foreach ($args as $key => $arg) {
            if (!$arg instanceof \P2Any\PhpParser\Node\Arg) {
                $arg = new \P2Any\PhpParser\Node\Arg(\P2Any\PhpParser\BuilderHelpers::normalizeValue($arg));
            }
            if (\is_string($key)) {
                $arg->name = \P2Any\PhpParser\BuilderHelpers::normalizeIdentifier($key);
            }
            $normalizedArgs[] = $arg;
        }
        return $normalizedArgs;
    }
    /**
     * Creates a function call node.
     *
     * @param string|Name|Expr $name Function name
     * @param array            $args Function arguments
     *
     * @return Expr\FuncCall
     */
    public function funcCall($name, array $args = []) : \P2Any\PhpParser\Node\Expr\FuncCall
    {
        return new \P2Any\PhpParser\Node\Expr\FuncCall(\P2Any\PhpParser\BuilderHelpers::normalizeNameOrExpr($name), $this->args($args));
    }
    /**
     * Creates a method call node.
     *
     * @param Expr                   $var  Variable the method is called on
     * @param string|Identifier|Expr $name Method name
     * @param array                  $args Method arguments
     *
     * @return Expr\MethodCall
     */
    public function methodCall(\P2Any\PhpParser\Node\Expr $var, $name, array $args = []) : \P2Any\PhpParser\Node\Expr\MethodCall
    {
        return new \P2Any\PhpParser\Node\Expr\MethodCall($var, \P2Any\PhpParser\BuilderHelpers::normalizeIdentifierOrExpr($name), $this->args($args));
    }
    /**
     * Creates a static method call node.
     *
     * @param string|Name|Expr       $class Class name
     * @param string|Identifier|Expr $name  Method name
     * @param array                  $args  Method arguments
     *
     * @return Expr\StaticCall
     */
    public function staticCall($class, $name, array $args = []) : \P2Any\PhpParser\Node\Expr\StaticCall
    {
        return new \P2Any\PhpParser\Node\Expr\StaticCall(\P2Any\PhpParser\BuilderHelpers::normalizeNameOrExpr($class), \P2Any\PhpParser\BuilderHelpers::normalizeIdentifierOrExpr($name), $this->args($args));
    }
    /**
     * Creates an object creation node.
     *
     * @param string|Name|Expr $class Class name
     * @param array            $args  Constructor arguments
     *
     * @return Expr\New_
     */
    public function new($class, array $args = []) : \P2Any\PhpParser\Node\Expr\New_
    {
        return new \P2Any\PhpParser\Node\Expr\New_(\P2Any\PhpParser\BuilderHelpers::normalizeNameOrExpr($class), $this->args($args));
    }
    /**
     * Creates a constant fetch node.
     *
     * @param string|Name $name Constant name
     *
     * @return Expr\ConstFetch
     */
    public function constFetch($name) : \P2Any\PhpParser\Node\Expr\ConstFetch
    {
        return new \P2Any\PhpParser\Node\Expr\ConstFetch(\P2Any\PhpParser\BuilderHelpers::normalizeName($name));
    }
    /**
     * Creates a property fetch node.
     *
     * @param Expr                   $var  Variable holding object
     * @param string|Identifier|Expr $name Property name
     *
     * @return Expr\PropertyFetch
     */
    public function propertyFetch(\P2Any\PhpParser\Node\Expr $var, $name) : \P2Any\PhpParser\Node\Expr\PropertyFetch
    {
        return new \P2Any\PhpParser\Node\Expr\PropertyFetch($var, \P2Any\PhpParser\BuilderHelpers::normalizeIdentifierOrExpr($name));
    }
    /**
     * Creates a class constant fetch node.
     *
     * @param string|Name|Expr  $class Class name
     * @param string|Identifier $name  Constant name
     *
     * @return Expr\ClassConstFetch
     */
    public function classConstFetch($class, $name) : \P2Any\PhpParser\Node\Expr\ClassConstFetch
    {
        return new \P2Any\PhpParser\Node\Expr\ClassConstFetch(\P2Any\PhpParser\BuilderHelpers::normalizeNameOrExpr($class), \P2Any\PhpParser\BuilderHelpers::normalizeIdentifier($name));
    }
    /**
     * Creates nested Concat nodes from a list of expressions.
     *
     * @param Expr|string ...$exprs Expressions or literal strings
     *
     * @return Concat
     */
    public function concat(...$exprs) : \P2Any\PhpParser\Node\Expr\BinaryOp\Concat
    {
        $numExprs = count($exprs);
        if ($numExprs < 2) {
            throw new \LogicException('Expected at least two expressions');
        }
        $lastConcat = $this->normalizeStringExpr($exprs[0]);
        for ($i = 1; $i < $numExprs; $i++) {
            $lastConcat = new \P2Any\PhpParser\Node\Expr\BinaryOp\Concat($lastConcat, $this->normalizeStringExpr($exprs[$i]));
        }
        return $lastConcat;
    }
    /**
     * @param string|Expr $expr
     * @return Expr
     */
    private function normalizeStringExpr($expr) : \P2Any\PhpParser\Node\Expr
    {
        if ($expr instanceof \P2Any\PhpParser\Node\Expr) {
            return $expr;
        }
        if (\is_string($expr)) {
            return new \P2Any\PhpParser\Node\Scalar\String_($expr);
        }
        throw new \LogicException('Expected string or Expr');
    }
}