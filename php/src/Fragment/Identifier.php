<?php

declare(strict_types=1);

namespace P2Any\Fragment;

use P2Any\Fragment;

/**
 * Represents a non-namespaced name. Namespaced names are represented using Name nodes.
 */
class Identifier implements Fragment
{
    /** @var string Identifier as string */
    private $name;

    private static $specialClassNames = [
        'self'   => true,
        'parent' => true,
        'static' => true,
    ];

    public function __construct(string $name)
    {
        $this->name = $name;
    }

    /**
     * @return string
     */
    public function getName(): string
    {
        return $this->name;
    }

    public function isSpecialClassName(): bool
    {
        return isset(self::$specialClassNames[strtolower($this->name)]);
    }
}
