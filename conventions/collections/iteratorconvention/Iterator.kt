package conventions.collections.iteratorconvention

/**
 * For loops in Kotlin use the same in operator as range checks. But its meaning is different in this context:
 * it’s used to perform iteration
 *
 * for (x in list) { … } => list.iterator()
 */

fun main() {
    // The standard library defines an extension function iterator on CharSequence, a superclass of String
    for (c in "abc") {
        println(c)  // a b c
    }
}