package intro

import java.io.IOException

fun main() {

    checkNumber(5)

    parseNumber("59")
    parseNumber("5df")

    checkNumber(500)
    bar()
}

fun checkNumber(number: Int) {
    val percentage =
            if (number in 0..100)
                number
            else
                throw IllegalArgumentException(
                        "A percentage value must be" +
                                "between 0 and 100: $number")

    println(percentage)

}

fun parseNumber(string: String) {
    val number = try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        // return
        null
    }
    println(number);
}

@Throws(IOException::class)
fun bar() {
    throw IOException()
}