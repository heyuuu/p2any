<?php declare(strict_types=1);

namespace P2Any\PhpParser\ErrorHandler;

use P2Any\PhpParser\Error;
use P2Any\PhpParser\ErrorHandler;

/**
 * Error handler that handles all errors by throwing them.
 *
 * This is the default strategy used by all components.
 */
class Throwing implements ErrorHandler
{
    public function handleError(Error $error) {
        throw $error;
    }
}
