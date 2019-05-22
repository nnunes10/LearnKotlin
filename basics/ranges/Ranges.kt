package basics.ranges

/**
 *  A range is defined as an interval that has a start value and an end value
 *  Once a range is created, the in operator can be used to test whether a given value is
 *  included in the range.
 */

fun main (){
    val aToZ = "a".."z" // the operator .. is used to create a range
    val oneToNine = 1..9
    val countingDown = 100.downTo(0)    // also creates a range
    val rangeTo = 10.rangeTo(20)    // also creates a range

    println("c" in aToZ)    // true
    println(11 in oneToNine)    // false

    println(rangeTo.javaClass)  // class kotlin.ranges.IntRange
    println(aToZ.javaClass) // class kotlin.ranges.ComparableRange
}