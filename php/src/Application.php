<?php

namespace P2Any;

use P2Any\Exception\ExecuteException;
use P2Any\Utils\PhpFileFinder;
use Psr\Log\LoggerAwareInterface;
use Psr\Log\LoggerAwareTrait;
use ReflectionClass;

class Application implements LoggerAwareInterface
{
    use LoggerAwareTrait;

    /**
     * @var PhpFileFinder
     */
    private $srcFinder;

    /**
     * @var string
     */
    private $dstPath;

    public function __construct(PhpFileFinder $srcFinder, string $dstPath)
    {
        $this->srcFinder = $srcFinder;
        $this->dstPath   = $dstPath;
    }

    public function run()
    {
        $this->logger->info("Start run:");
        foreach ($this->srcFinder as $file) {
        }
    }

    private function loadClass(string $class): string
    {
        if (!class_exists($class)) {
            throw new ExecuteException('未找到类: ' . $class);
        }

        $refClass = new ReflectionClass($class);
        $file     = $refClass->getFileName();
        if (!$file) {
            throw new ExecuteException('未找到类文件: ' . $class);
        } elseif (!is_readable($file)) {
            throw new ExecuteException("类文件不可读: class=${class}, file={$file}");
        }

        return file_get_contents($file);
    }
}