package basics.expressions

/**
 * Kotlin offers when, a more powerful alternative to switch
 * Similar to if...else and try..catch, it can be used as an expression
 */


// Similar to switch in Java
fun whatNumber(x: Int) {
    when (x) {
        0 -> println("x is zero")
        1 -> println("x is 1")
        else -> println("x is neither 0 or 1")
    }
}

// when used as expression
fun isMinOrMax(x: Int): Boolean {
    return when (x) {
        Int.MIN_VALUE -> true
        Int.MAX_VALUE -> true
        else -> false
    }
}

// constants can be combined if the branch code is the same
fun isZeroOrOne(x: Int): Boolean {
    return when (x) {
        0, 1 -> true
        else -> false
    }
}

// ranges are also supported
fun isSingleDigit(x: Int): Boolean {
    return when (x) {
        in -9..9 -> true
        else -> false
    }
}