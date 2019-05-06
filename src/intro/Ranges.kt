package intro

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main() {
    println(isLetter('a'))
    println(isLetter('$'))

    println(isNotDigit('x'))
    println(isNotDigit('5'))
    for (i in 1..9) {
        print(i)
    }
    println()
    println(recognize('5'))
    println(recognize('$'))

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}


fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know…"
}