package conventions.destructuring

/**
 * Destructuring declarations work also in loops
 *
 * The following example uses two Kotlin conventions: one to iterate over an object and another to destructure
 * declarations
 */

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) { // There are extensions functions component1 and component2 defined on Map.Entry
        println("$key -> $value")
    }
}


fun main(){
    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
    // Oracle -> Java
    // JetBrains -> Kotlin
}