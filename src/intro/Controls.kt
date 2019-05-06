package intro

import intro.Color.*

enum class Color {
    BLUE, ORANGE, RED, YELLOW, GREEN, VIOLET, INDIGO
}


fun main() {
    println(whenSyntax(1));
    println(whenSyntax(true));
    println(whenSyntax("STRING"));
    println(whenSyntax(2.0));

    println(getWarmth(RED));
    println(getWarmth(INDIGO));

    println(mix(YELLOW, BLUE));
    try {
        println(mix(INDIGO, YELLOW));
    } catch (e: Exception) {
        println(e.localizedMessage)
    }

    println(updateWeather(5));
}

fun getWarmth(color: Color) =
        when (color) {
            BLUE -> "cold"
            ORANGE -> "mild"
            RED -> "hot"
            else -> " No colors"
        }

fun whenSyntax(a: Any) = when (a) {
    0, 1 -> "is zero or one"
    is Boolean -> "is boolean"
    is String -> "is string of length ${a.length}"
    else -> "other"
}


fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }

fun updateWeather(degrees: Int) {
    val (description, colour) = when {
        degrees < 5 -> "cold" to BLUE
        degrees < 23 -> "mild" to ORANGE
        else -> "hot" to RED
    }
}