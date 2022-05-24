<?php

namespace P2Any\Utils;

class FileUtil
{
    public static function saveFile(string $fileName, string $content)
    {
        if (!file_exists($dir = dirname($fileName))) {
            mkdir($dir, 0755, true);
        }
        file_put_contents($fileName, $content);
    }

    public static function saveJsonFile(string $fileName, $object)
    {
        self::saveFile($fileName, json_encode($object, JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE));
    }
}
