package functions

/**
 * Java problem: Overabundance of overloaded methods in some classes
 * In Kotlin, you can often avoid creating overloads because you can specify default values for parameters in a function
 * declaration.
 */

fun <T> joinToString2(
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

fun main (){
    println(joinToString2(listOf(1,2,3), ", ", "", "")) // 1, 2, 3
    println(joinToString2(listOf(1,2,3)))   // 1, 2, 3
    println(joinToString2(listOf(1,2,3), prefix = "# "))   // # 1, 2, 3
}

