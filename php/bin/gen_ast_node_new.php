<?php

use P2Any\Utils\FileUtil;
use P2AnyScript\AbstractAstGenTask;
use P2AnyScript\ClassInfo;

require_once __DIR__ . '/../vendor/autoload.php';

class GenNodeTask extends AbstractAstGenTask
{
    protected $dstFile = __DIR__ . '/__new.kt';

    public function run()
    {
        $types = $this->getTypes();

        // ob_start();
        $lines   = [];
        $lines[] = "package php.parser.node\n";
        ksort($types);
        foreach ($types as $classInfo) {
            if ($classInfo->isInterface || $classInfo->isAbstract) {
                continue;
            }

            $lines[] = $this->renderType($classInfo, $types);
        }
        $code = join("\n\n", $lines);

        echo $code;
        FileUtil::saveFile($this->dstFile, $code);
    }

    /**
     * @param ClassInfo   $classInfo
     * @param ClassInfo[] $types
     * @return void
     */
    protected function renderType(ClassInfo $classInfo, array $types): string
    {
        $inline = count($classInfo->properties) <= 3;

        if ($inline) {
            $propertyDesc = collect($classInfo->properties)
                ->map(function (string $type, string $name) use ($classInfo) {
                    $varName = $this->wrapVarName($name);
                    return sprintf("%s = %s", $varName, $varName);
                })
                ->join(", ");
        } else {
            $ident = "\n    ";

            $propertyDesc = collect($classInfo->properties)
                    ->map(function (string $type, string $name) use ($classInfo, $ident) {
                        $varName = $this->wrapVarName($name);
                        return $ident . sprintf("%s = %s, // %s", $varName, $varName, $type);
                    })
                    ->join("") . $ident;
        }

        return sprintf(
            "return %s(%s)",
            $classInfo->type,
            $propertyDesc
        );
    }
}

(new GenNodeTask())->run();
