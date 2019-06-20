package conventions.arithmeticoperators

/**
 * The most straightforward example of the use of conventions in Kotlin is arithmetic operators
 *
 * In Java, the full set of arithmetic operations can be used only with primitive
 * types, and additionally the + operator can be used with String values.
 *
 * a + b => a.plus(b)
 * a * b => a.times(b)
 * a / b => a.div(b)
 * a - b => a.minus(b)
 * a % b => a.mod(b)
 */

data class Point(val x: Int, val y: Int){
    operator fun plus(other: Point): Point // Defines an operator function named "plus"
    {
        return Point(x + other.x, y + other.y)
    }
}

// As an alternative to declaring the operator as a member, you can define the operator as an extension function
operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)

    // Calls the "plus" function using the + sign
    println(p1 + p2)    // Point(x=40, y=60)
    println(p1 * 1.5)   // Point(x=15, y=30)
    // println(1.5 * p1) does not compile !
}