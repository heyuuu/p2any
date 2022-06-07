<?php

namespace P2AnyScript;

use Webmozart\Assert\Assert;

class TypeInfo
{
    const TYPE_SIMPLE = 1;
    const TYPE_LIST   = 2;
    const TYPE_ANY_OF = 3;

    /** @var int */
    private $type;
    /** @var string|null */
    private $typeName = null;
    /** @var TypeInfo|null */
    private $itemType = null;
    /** @var TypeInfo[] */
    private $anyTypes = [];
    /** @var boolean */
    private $nullable = false;

    public static function simple(string $typeName, bool $nullable = false): TypeInfo
    {
        Assert::true((bool)preg_match('/^\w+$/', $typeName), 'TypeName 必须为纯字母字符');

        if ($typeName === 'List<Param>') {
            var_dump(func_get_args());
        }

        $typeInfo           = new TypeInfo();
        $typeInfo->type     = self::TYPE_SIMPLE;
        $typeInfo->typeName = $typeName;
        $typeInfo->nullable = $nullable;
        return $typeInfo;
    }

    public static function list(TypeInfo $itemType, bool $nullable = false): TypeInfo
    {
        $typeInfo           = new TypeInfo();
        $typeInfo->type     = self::TYPE_LIST;
        $typeInfo->itemType = $itemType;
        $typeInfo->nullable = $nullable;
        return $typeInfo;
    }

    public static function anyOf(array $anyTypes, bool $nullable = false): TypeInfo
    {
        Assert::allIsInstanceOf($anyTypes, TypeInfo::class);
        $typeInfo           = new TypeInfo();
        $typeInfo->type     = self::TYPE_ANY_OF;
        $typeInfo->anyTypes = $anyTypes;
        $typeInfo->nullable = $nullable;
        return $typeInfo;
    }

    public function withNullable(bool $nullable)
    {
        if ($this->nullable === $nullable) {
            return $this;
        } else {
            $clone           = new TypeInfo();
            $clone->type     = $this->type;
            $clone->typeName = $this->typeName;
            $clone->itemType = $this->itemType;
            $clone->anyTypes = $this->anyTypes;
            $clone->nullable = $nullable;
            return $clone;
        }
    }

    public function toTypeHintNotNull(): string
    {
        switch ($this->type) {
            case self::TYPE_SIMPLE:
                return $this->typeName;
            case self::TYPE_LIST:
                return 'List<' . $this->itemType . '>';
            case self::TYPE_ANY_OF:
                return 'AnyOf' . count($this->anyTypes) . '<' . join(',', $this->anyTypes) . '>';
        }
    }

    public function toTypeHint(): string
    {
        return $this->toTypeHintNotNull() . ($this->nullable ? '?' : '');
    }

    public function __toString(): string
    {
        return $this->toTypeHint();
    }

    /**
     * @return int
     */
    public function getType(): int
    {
        return $this->type;
    }

    /**
     * @return string|null
     */
    public function getTypeName(): ?string
    {
        return $this->typeName;
    }

    /**
     * @return TypeInfo|null
     */
    public function getItemType(): ?TypeInfo
    {
        return $this->itemType;
    }

    /**
     * @return TypeInfo[]
     */
    public function getAnyTypes(): array
    {
        return $this->anyTypes;
    }

    /**
     * @return bool
     */
    public function isNullable(): bool
    {
        return $this->nullable;
    }
}