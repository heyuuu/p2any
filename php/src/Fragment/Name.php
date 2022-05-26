<?php

declare(strict_types=1);

namespace P2Any\Fragment;

use P2Any\Fragment;

class Name implements Fragment
{
    private static $specialClassNames = [
        'self'   => true,
        'parent' => true,
        'static' => true,
    ];

    /** @var string */
    private $name;

    public function __construct(string $name)
    {
        $this->name = $name;
    }

    public function isSpecialClassName(): bool
    {
        return isset(self::$specialClassNames[strtolower($this->name)]);
    }

    /**
     * @return string
     */
    public function getName(): string
    {
        return $this->name;
    }
}
