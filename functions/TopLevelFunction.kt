package functions

/**
 * In Kotlin you can place functions directly at the top level of a source file, outside of any class.
 * Properties can be placed at the top level of a file too.
 *
 * Even though Kotlin’s collections are exactly the same classes as Java collections, you
 * can do much more with them in Kotlin: last and max extension functions
 *
 */

val UNIX_LINE_SEPARATOR = "\n" // constant

fun main(){
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last()) // fourteenth
    println(strings) // [first, second, fourteenth]

    val numbers = setOf(1, 14, 2)
    println(numbers.max())  // 14
    println(numbers)    // [1, 14, 2]
    println(joinToString(numbers, "; ", "(", ")")) // (1; 14; 2)

    //In Kotlin, you can specify the names of arguments
    println(joinToString(numbers, prefix = "(", postfix = ")", separator = "; "))
}

// Appends the elements of the collection to a StringBuilder, with a separator between them,
// a prefix at the beginning, and a postfix at the end
fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {

    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}