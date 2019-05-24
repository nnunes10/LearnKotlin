package basics.casts

/**
 * To cast a reference to a type explicitly, we use the as operator. Just as in Java, this operation
 * will throw a ClassCastException if the cast fails.
 */


fun length(any: Any): Int {
    val string = any as String
    return string.length
}

fun main(){
    val string = "myString"
    println(length(string)) // 8
}