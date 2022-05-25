<?= "<?php" ?>


namespace P2Any\Service;

use P2Any\Exception\TodoException;
use P2Any\Fragment;
use P2Any\PhpParser\Node;

class NodeTransformerGenerate extends NodeTransformer
{
<?php foreach ($types as list($methodName, $nodeType, $fragmentType)): ?>
    protected function <?= $methodName ?>(<?=$nodeType?> $node): <?=$fragmentType?>

    {
        throw new TodoException('TODO NodeTransformer::<?= $methodName ?>', $node);
    }

<?php endforeach; ?>
}
