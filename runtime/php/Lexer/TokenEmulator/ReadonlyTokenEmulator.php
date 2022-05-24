declare (strict_types=1);
namespace P2Any\PhpParser\Lexer\TokenEmulator;

use P2Any\PhpParser\Lexer\Emulative;
final class ReadonlyTokenEmulator extends \P2Any\PhpParser\Lexer\TokenEmulator\KeywordEmulator
{
    public function getPhpVersion() : string
    {
        return \P2Any\PhpParser\Lexer\Emulative::PHP_8_1;
    }
    public function getKeywordString() : string
    {
        return 'readonly';
    }
    public function getKeywordToken() : int
    {
        return \T_READONLY;
    }
}