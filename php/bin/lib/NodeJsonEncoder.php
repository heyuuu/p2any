<?php

namespace P2AnyScript;

use JsonSerializable;
use P2Any\PhpParser\Node;

class NodeJsonEncoder
{
    public static function encode($value)
    {
        return json_encode(self::resolve($value), JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
    }

    private static function resolve($value)
    {
        if (is_array($value)) {
            return array_map([NodeJsonEncoder::class, 'resolve'], $value);
        } elseif (is_object($value)) {
            return self::resolveObject($value);
        } else {
            return $value;
        }
    }

    private static function resolveObject(object $value)
    {
        if ($value instanceof Node) {
            return [
                'type'       => TypeUtil::mapType(get_class($value)),
                'properties' => self::resolve(get_object_vars($value)),
            ];
        } elseif ($value instanceof JsonSerializable) {
            return self::resolve($value->jsonSerialize());
        } else {
            return $value;
        }
    }
}