<?php

namespace P2Any;

use Illuminate\Support\Str;
use P2Any\PhpParser\Node;

class IrEncoder
{
    public function encode($object): string
    {
        $data = $this->toData($object);
        return json_encode($data, JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
    }

    private function toData($object)
    {
        if (is_array($object)) {
            return array_map([$this, 'toData'], $object);
        } elseif ($object instanceof Node) {
            return [
                'type'       => $this->mapNodeType($object),
                'properties' => $this->toData(get_object_vars($object)),
            ];
        } elseif (is_object($object)) {
            return [
                'type'       => 'object',
                'properties' => $this->toData(get_object_vars($object)),
            ];
        } else {
            return $object;
        }
    }

    private function mapNodeType(Node $node)
    {
        $class    = get_class($node);
        $nsPrefix = 'P2Any\PhpParser\Node\\';
        if ($class === 'P2Any\PhpParser\Node' || $class === 'P2Any\PhpParser\NodeAbstract') {
            return 'AstNode';
        } elseif (Str::startsWith($class, $nsPrefix)) {
            return str_replace(
                ['\\', '_'],
                '',
                Str::after($class, $nsPrefix)
            );
        } else {
            return null;
        }
    }
}