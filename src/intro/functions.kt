package intro


fun main() {
    println("Hello Functions");
    println(functionMax(10, 12))
    println(functionMaxKT(4, 20))
    printMax(4, 5)
    printMaxUnit(4, 5)
    localFunction(20, 34)

    println(listOf('a', 'b', 'c'))
    //Named and Defaults arguments
    println(listOf('a', 'b', 'c').joinToString(
            separator = "", prefix = "(", postfix = ")"
    ))
    println(listOf('a', 'b', 'c').joinToString(
            postfix = "."
    ))

    displaySeparator('#', 5)
    displaySeparator('#')
    displaySeparator()
    displaySeparator(size = 8, character = '$')
    displaySeparator(size = 3)
}

fun functionMax(a: Int, b: Int): Int {

    return if (a > b) a else b
}


fun functionMaxKT(a: Int, b: Int): Int = if (a > b) a else b

fun printMax(a: Int, b: Int) {
    println(if (a > b) a else b);
}

fun printMaxUnit(a: Int, b: Int): Unit {
    println(if (a > b) a else b);
}


fun localFunction(a: Int, b: Int) {
    fun local() = 3
    println("localFunction" + local())
    println("localFunction:" + if (a > b) a else b)
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    println("character $character size $size")
    repeat(size) {
        print(character)
    }
    println()
}

