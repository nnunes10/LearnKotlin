package conventions.collections.indexconvention

import conventions.arithmeticoperators.Point

/**
 * In this snippet, we will allow the use of square brackets to reference the coordinates of the point: p[0] to access
 * the X coordinate and p[1] to access the Y coordinate
 *
 * All we have to do is define a function named get and mark it as operator.
 *
 * x[a] => x.get(a)
 * x[a,b] => x.get(a, b)
 */

operator fun Point.get(index: Int): Int {
    return when(index) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

// let's define a MutablePoint
data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when(index) {
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main(){
    val p = Point(10, 20)
    println(p[1])   // 20

    val mp = MutablePoint(10, 20)
    mp[0] = 30
    println(mp) // MutablePoint(x=30, y=20)

}
