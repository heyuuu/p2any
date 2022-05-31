<?php

namespace P2Any;

use P2Any\Utils\FileUtil;
use P2Any\Utils\ParserUtil;
use P2Any\Utils\PhpFileFinder;
use Psr\Log\LoggerAwareInterface;
use Psr\Log\LoggerAwareTrait;
use Symfony\Component\Finder\SplFileInfo;

class IrCompiler implements LoggerAwareInterface
{
    use LoggerAwareTrait;

    /**
     * @var IrEncoder
     */
    private $irEncoder;

    public function __construct()
    {
        $this->irEncoder = new IrEncoder();
    }

    public function compile(string $code): array
    {
        return ParserUtil::parse($code);
    }

    public function compileFile(string $srcFile, string $dstFile)
    {
        $code      = file_get_contents($srcFile);
        $ast       = $this->compile($code);
        $encodeAst = $this->irEncoder->encode($ast);
        FileUtil::saveFile($dstFile, $encodeAst);
    }

    public function compileDir(string $srcDir, string $dstRoot)
    {
        $finder = new PhpFileFinder($srcDir);
        /** @var SplFileInfo $srcFile */
        foreach ($finder as $srcFile) {
            $this->logger->info('Handle file: ' . $srcFile->getRelativePathname());
            $dstFile = $dstRoot . DIRECTORY_SEPARATOR . str_replace('.php', '.json', $srcFile->getRelativePathname());
            $this->compileFile($srcFile->getPathname(), $dstFile);
        }
    }
}