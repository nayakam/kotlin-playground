# kotlin-playground

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
    *   @JvmOverloads
     
       

```kotlin

fun functionMax(a: Int, b:Int) : Int {
 return if(a>b) a else b
 }

or

fun functionMax(a: Int, b:Int) : Int = if(a>b) a else b
```

# Reference
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