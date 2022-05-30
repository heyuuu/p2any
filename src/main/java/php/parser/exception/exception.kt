package php.parser.exception

sealed class ParseException(message: String) : RuntimeException(message)

class UnsupportedException(message: String) : ParseException(message)
class UnexpectedException(message: String) : ParseException(message)
class TodoSupportedException(message: String) : ParseException(message)
