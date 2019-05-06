package intro

/**
 * Implement the function that checks whether a string is a valid identifier. A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters, digits and underscores.
 */
fun isValidIdentifier(s: String): Boolean {
    fun isValidString(c: Char) = c in 'a'..'z' || c in 'A'..'Z' || c in '0'..'9' || c == '_'

    if (s.isEmpty() || s[0] in '0'..'9') {
        return false;
    }
    for (c in s) {
        if (!isValidString(c)) {
            return false
        }
    }
    return true
}


fun isValidIdentifier2(s: String): Boolean {
    fun isValidString(c: Char) = c.isLetterOrDigit() || c == '_'

    if (s.isEmpty() || s[0].isDigit()) {
        return false;
    }
    for (c in s) {
        if (!isValidString(c)) {
            return false
        }
    }
    return true
}


fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}