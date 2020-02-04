package intro

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"

    var nameVar = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name !!!")
    println("Hello, $nameVar !!!")
    println("Hello, ${args.getOrNull(0)} !!!")

    /** https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get-or-else.html */
    val elseCase = args.getOrElse(0) { " Case else" }
    println("Hello, $elseCase !!!")

    val nameCheck = if (args.isNullOrEmpty()) " Null or Emtpy" else args[0]
    println("Hello, $nameCheck !!!")

    println("First ${foo()}, second ${foo()}")
}

fun foo(): String {
    println("Calculating foo...")
    return "foo"
}