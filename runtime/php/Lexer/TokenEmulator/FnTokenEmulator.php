declare (strict_types=1);
namespace P2Any\PhpParser\Lexer\TokenEmulator;

use P2Any\PhpParser\Lexer\Emulative;
final class FnTokenEmulator extends \P2Any\PhpParser\Lexer\TokenEmulator\KeywordEmulator
{
    public function getPhpVersion() : string
    {
        return \P2Any\PhpParser\Lexer\Emulative::PHP_7_4;
    }
    public function getKeywordString() : string
    {
        return 'fn';
    }
    public function getKeywordToken() : int
    {
        return \T_FN;
    }
}