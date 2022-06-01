<?php

use P2Any\Utils\FileUtil;
use P2AnyScript\AbstractAstGenTask;
use P2AnyScript\ClassInfo;

require_once __DIR__ . '/../vendor/autoload.php';

class GenAstDecodeTask extends AbstractAstGenTask
{
    public function run()
    {
        $types = $this->getTypes();

        // ob_start();
        $lines   = [];
        $lines[] = "package php.parser.node\n";
        $lines[] = "";
        $lines[] = "interface Node";
        $lines[] = "interface FunctionLike : Node";
        $lines[] = "";
        ksort($types);
        foreach ($types as $type => $classInfo) {
            $lines[] = $this->renderType($classInfo, $types);
        }
        $code = join("\n", $lines);

        echo collect($this->collect)
        ->unique()
            ->sort()
            ->values()
            ->join("\n");

        // echo $code;
        FileUtil::saveFile($this->dstFile, $code);
    }

    /**
     * @param ClassInfo   $classInfo
     * @param ClassInfo[] $types
     * @return void
     */
    protected function renderType(ClassInfo $classInfo, array $types): string
    {
        // interface
        if ($classInfo->isInterface) {
            return sprintf("interface %s: %s", $classInfo->type, join(', ', $classInfo->parents));
        }

        // class
        $superDesc = collect($classInfo->parents)
            ->map(function (string $parent) use ($types) {
                $parentClassInfo = $types[$parent] ?? null;
                if ($parentClassInfo && !$parentClassInfo->isInterface) {
                    return sprintf(
                        "%s(%s)",
                        $parentClassInfo->type,
                        collect($parentClassInfo->properties)->keys()
                            ->map(function (string $name) {
                                return $this->wrapVarName($name);
                            })
                            ->join(', ')
                    );
                } else {
                    return $parent;
                }
            })
            ->join(', ');

        // propertyDesc
        /** @var ClassInfo|null $superClassInfo */
        $superClass         = collect($classInfo->parents)
            ->first(function (string $parent) use ($types) {
                $parentClassInfo = $types[$parent] ?? null;
                return $parentClassInfo && !$parentClassInfo->isInterface;
            });
        $overrideProperties = $superClass ? $types[$superClass]->properties : [];
        $propertyDesc       = collect($classInfo->properties)
            ->map(function (string $type, string $name) use ($overrideProperties, $classInfo) {
                $varName = $this->wrapVarName($name);
                if (isset($overrideProperties[$name])) {
                    return sprintf("override val %s: %s", $varName, $type);
                } elseif ($classInfo->isAbstract) {
                    return sprintf("open val %s: %s", $varName, $type);
                } else {
                    return sprintf("val %s: %s", $varName, $type);
                }
            })
            ->join(', ');

        // 输出
        return sprintf(
            "%sclass %s(%s): %s",
            $classInfo->isAbstract ? "sealed " : (!empty($classInfo->properties) ? "data " : ''),
            $classInfo->type,
            $propertyDesc,
            $superDesc
        );
    }
}

(new GenAstDecodeTask())->run();
