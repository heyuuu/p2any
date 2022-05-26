<?php

namespace P2Any\Exception;

use Symfony\Component\String\Exception\RuntimeException;

class FeatureNotSupportException extends RuntimeException
{
    public function __construct(string $message)
    {
        parent::__construct($message);
    }

    public static function highLevelFeature(string $feature)
    {
        return new self('This feature is not supported yet: ' . $feature);
    }

    public static function deprecated(string $feature)
    {
        return new self('This feature is deprecated: ' . $feature);
    }
}