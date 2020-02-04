# kotlin-playground

Kotlin is an statically typed programming language. Kotlin combines OO and functional features and is focused on interoperability, safety, clarity, and tooling support. It currently targets the following 
*   JVM 
*   Android
*   JavaScript 
*   Native. 

## My favourite Features 
concise syntax → code that is easier to read and more pleasant to write;
null-safety → reduces number of unexpected "NullPointerException"s, reduces cognitive load for design-by-contract approach (what exact data type is expected);
data classes, sealed classes → helps to describe domain models easier and faster;
named parameters, default parameters, extension functions (and other syntax sugar) → more readable and concise code, ability to write DSL-like or declarative APIs;
coroutines → comes very handy when you are designing multithreaded system (writing non-blocking code);
nice tooling support in Intellij IDEA;
ability to compile code for JVM, JS and native platforms (in beta now);
and (that's very important as well) great community.

-----

### Why or Advantages
*   Kotlin is 100% interoperable with the Java programming. Kotlin is completely compatible with Java, developers can incrementally convert their apps.                                                                 
*   More concise. Very less number of lines of code and easier to manage.
*   More type safe
    *   Support to non-nullable types (Null-safety)
    *   Type inference 
*   Combination of OOP and functional programmings 
    *   Higher order functions
    *   Type Safe Code ((No Raw Types)) / Smart casting
    *   No Checked Exceptions
    *   Data classes
    *   Default / Named parameters
    *   Extension functions  
    *   Coroutines
*   Kotlin developed to fix Java's pain points
*   NPE (Inbuilt Null Safety): It assumes variables can’t be “null” unless a developer explicitly make it that way. This makes Kotlin apps more stable and less likely to crash.
*   https://hackr.io/blog/kotlin-vs-java
    
### Variables

Local type inference: compiler will infer the types

##### val
*   Read only
*   Similar to _final_ in java 

```
Compile error:
 val cannot be reassigned
 ```
  
##### var
Mutable

### Functions
*   function with a block body and expression body
*   Interoperability with java
    *   import kotlin functions in java
    *   Use @JvmName to in kotlin to specifies the name for the Java class 
    *   https://kotlinlang.org/docs/reference/java-to-kotlin-interop.html
*   Unit similar to void. expression body is omitted.
*   Function Types
    *   Top level - Similar to static method
    *   Member function
    *   Local Function    
*   Can provide default values for argument in function
*   Named arguments - Can use parameter name in function call
    *   By default, there is the direct correspondence between unnamed arguments and parameters according to their order.
    *   In Java overloading used: define different overloads and use nested method call
    *   Have to specify the for all values when call from Java
    *   @JvmOverloads : Instructs kotlin compiler to generate overloads
     
       

```kotlin

fun functionMax(a: Int, b:Int) : Int {
 return if(a>b) a else b
 }

or

fun functionMax(a: Int, b:Int) : Int = if(a>b) a else b
```

    
### Conditionals

*   No ternary operator in Kotlin
*   switch => when
    *   No need break statement  
    *   When used for more than two branches

### Loops
*  for-loop
*  while / do-while loop    

### Ranges
*   in
    # iteration
    # check for belonging


## Exceptions
*   No difference between checked and unchecked exceptions 
*   throw and try are expressions
*   In Java, you cannot catch a checked exception if it wasn't thrown.Use @throws to indicate to java
    *   https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-throws/index.html

# Reference
*   [Learn Kotlin](https://kotlinlang.org/docs/reference/)
*   [Kotlin for Java Developers](https://www.coursera.org/learn/kotlin-for-java-developers/home/welcome)   
*   [coursera-programming-assignments](https://www.jetbrains.com/help/education/coursera-programming-assignments.html)
*   [Kotlin](https://stepik.org/course/2852)
*   [https://play.kotlinlang.org](https://play.kotlinlang.org)
*   [koans](https://play.kotlinlang.org/koans/overview)

## Video Links

*   [Introduction to Kotlin (Google I/O '17)](https://www.youtube.com/watch?v=X1RVYt2QKQE&t=33s)
*   [How to Kotlin - from the Lead Kotlin Language Designer (Google I/O '18)](https://www.youtube.com/watch?v=6P20npkvcb8&t)
*   [Kotlin Tutorial by Derek Banas
](https://www.youtube.com/watch?v=H_oGi8uuDpA)
*   [KotlinConf 2018 - Exploring Coroutines in Kotlin by Venkat Subramariam](https://www.youtube.com/watch?v=jT2gHPQ4Z1Q)
*   [KotlinConf 2018 - Creating Internal DSLs in Kotlin by Venkat Subramaniam](https://www.youtube.com/watch?v=JzTeAM8N1-o&index=49&list=PLQ176FUIyIUbVvFMqDc2jhxS-t562uytr)
*   [Kotlin 1.0 Released: Pragmatic Language for JVM and Android](https://blog.jetbrains.com/kotlin/2016/02/kotlin-1-0-released-pragmatic-language-for-jvm-and-android/)
*   [Koans](https://try.kotlinlang.org/#/Kotlin%20Koans/Introduction/Hello,%20world!/Task.kt)
*   [online mini-IDE: try.kotl.in](https://try.kotlinlang.org/?_ga=2.41237089.2112716907.1557193106-1642946983.1552284951#/Examples/Hello,%20world!/Simplest%20version/Simplest%20version.kt)


## Articles
*   https://dev.to/martinhaeusler/kotlin---the-good-the-bad-and-the-ugly-3jfo
*   https://dev.to/ben/the-strengths-and-biggest-misconceptions-of-kotlininterview-with-marcin-moskala
*   https://dev.to/waterlink/kotlin-how-can-a-programming-language-be-so-young-and-so-mature-at-the-same-time-25j
*   https://dev.to/dianamaltseva8/why-kotlin-for-android-development-kotlin-benefits-features-versions-24oj
*   https://kotlinexpertise.com/kotlin-coroutines-guide/
*   https://engineering.udacity.com/adopting-kotlin-c12f10fd85d1
*   https://dev.to/ivanosipov/kotlin-dsl-from-theory-to-practice-6h7
*   https://engineering.udacity.com/learning-kotlin-by-mistake-b99304b7d724
*   https://dev.to/dev_trent/kotlin---first-impression-5f7a   