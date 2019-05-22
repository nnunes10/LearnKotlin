package basics.loops

/**
 *  Kotlin supports the usual loop constructs - while and for loops
 *  The syntax for while loops in Kotlin is familiar to most developers
 */

fun main (){
    val list = listOf(1, 2, 3, 4)
    val set = setOf(1, 2, 3, 4)
    var i : Int = 1

    while(i < 2){
        println(i)  // 1
        i++
    }

    for (k in list) {
        println(k)  // 1 2 3 4
    }

    for (k in set) {
        println(k)  // 1 2 3 4
    }

    for (index in list.indices) {   // extension function indices
        println("Element $index is ${list[index]}") // Element 0 is 1 ...
    }

    println(list.javaClass) // class java.util.Arrays$ArrayList
    println(set.javaClass)  // class java.util.LinkedHashSet
}