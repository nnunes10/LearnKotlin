package functions

/**
 *
 * Extension Functions: functions that can be called as a member of a class but defined outside of it
 *
 */

fun String.lastChar(): Char = this.get(this.length - 1) // does not have access to private ou protected members of String class

fun <T> Collection<T>.joinToString3(    // declares an extension function on Collection<T>
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {

    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(){
    println("Kotlin".lastChar())    // n
    println(listOf(1,2,3).joinToString()) // 1, 2, 3
    println(arrayListOf("ab","cd","ef").joinToString()) // ab, cd, ef
}