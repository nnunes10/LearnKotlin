package conventions.collections.indexconvention

/**
 * In Kotlin, to get or set an element by index, you use the syntax a[b] (called the index operator).
 * The in operator can be used to check whether an element is in a collection or range and also to iterate over a
 * collection. You can add those operations for your own classes that act as collections
 *
 * Reading an element using the index operator is translated into a call of the get operator method, and writing an
 * element becomes a call to set.
 */

fun main(){
    val map = mutableMapOf(1 to "x", 2 to "y", 3 to "zz")
    println(map)    // {1=x, 2=y, 3=zz}

    println(map[1]) // x. It calls the get operator defined in MutableMap interface
    map[1] = "z"    // It calls the set operator defined in MutableMap interface
    println(map[1]) // z
}
