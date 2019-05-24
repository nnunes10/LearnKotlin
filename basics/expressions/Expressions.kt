package basics.expressions

/**
 * An expression is a statement that evaluates to a value.
 *  "hello".startsWith("h")
 * A statement, on the other hand, has no resulting value returned
 *  val a = 1
 *
 *  In Kotlin, the if...else and try..catch control flow blocks are expressions. This means
 *  the result can be directly assigned to a value, returned from a function, or passed as an
 *  argument to another function
 */


fun isZero(x: Int): Boolean {
    return if (x == 0) true else false
}

fun main(){
    val success = try {
        // method call..
        true
    } catch (e: Exception) {
        false
    }
}
