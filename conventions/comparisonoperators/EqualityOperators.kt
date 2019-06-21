package conventions.comparisonoperators

/**
 * Kotlin lets you use comparison operators (==, !=, >, <, and so on) with any object, not just with primitive types
 * Instead of calling equals or compareTo, as in Java, you can use comparison operators directly, which is intuitive
 * and concise
 *
 * Using the == (or !=) operator in Kotlin is translated into a call of the equals() method
 * The identity equals operator === does exactly the same thing as the == operator in Java
 *
 * a == b => a?.equals(b) ?: b == null
 *
 */

class Point(val x: Int, val y: Int) // Overrides the method defined in Any
{
    override fun equals(obj: Any?): Boolean  {  // the base method in Any is marked with operator modifier
        if (obj === this) return true
        if (obj !is Point) return false // cghecks the parameter type
        return obj.x == x && obj.y == y // here obj is smart-cast to Point
    }
}

fun main(){
    println(Point(10, 20) == Point(10, 20)) // true
    println(Point(10, 20) != Point(5, 5))   // true
    println(null == Point(1, 2))    // false
}