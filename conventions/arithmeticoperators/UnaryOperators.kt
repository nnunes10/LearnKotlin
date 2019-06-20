package conventions.arithmeticoperators

import java.math.BigDecimal

/**
 * The procedure for overloading an unary operator is the same as you saw previously:
 * declare a function (member or extension) with a predefined name, and mark it with the modifier operator.
 *
 * Functions used to overload unary operators don’t take any arguments
 *
 * -p => p.unaryMinus()
 * +p => p.unaryPlus()
 * !p => p.not()
 * ++a, a++ => p.inc()
 * --a, a-- => p.dec()
 */

operator fun Point.unaryMinus(): Point {    // The unary minus function has no arguments
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main(){
    val point = Point(2,3)
    var bd = BigDecimal.ZERO

    println(-point) // Point(x=-2, y=-3)

    println(bd++)   // 0
    println(++bd)   // 2
}
