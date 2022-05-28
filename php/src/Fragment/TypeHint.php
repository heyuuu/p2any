<?php

namespace P2Any\Fragment;

use P2Any\Fragment;
use Webmozart\Assert\Assert;

class TypeHint implements Fragment
{
    private const TYPE_PATTERN = '/[\w\\\\]+/';

    /** @var string */
    public $typeName;
    /** @var bool */
    private $nullable;

    public function __construct(string $typeName, bool $nullable = false)
    {
        Assert::true((bool)preg_match(self::TYPE_PATTERN, $typeName));

        $this->typeName = $typeName;
        $this->nullable = $nullable;
    }

    /**
     * @return string
     */
    public function getTypeName(): string
    {
        return $this->typeName;
    }

    /**
     * @return bool
     */
    public function isNullable(): bool
    {
        return $this->nullable;
    }

    public function withNullable(bool $nullable)
    {
        return new TypeHint($this->typeName, $nullable);
    }
}
