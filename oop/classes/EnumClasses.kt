package oop.classes

/**
 * Enumeration is a specific type of class
 * A variable of a given enum type is limited to a set of predefined constants. Each enum constant is an object.
 */

enum class Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

// Enumeration, like all classes, can take a constructor parameter.
enum class Color (val rgb: Int) {
    GOLD(0xffd323),
    SILVER(0xeaeaea),
    WHITE(0xffffff),
    BLACK(0x000000),
    RED(0xFF0000)
}

data class Mobile(val name:String, val color: Color)

fun main() {
    val mobile1: Mobile = Mobile("IPhone",Color.WHITE)

    // access enum variables
    println("The color of my ${mobile1.name} is ${mobile1.color}")  // The color of my IPhone is WHITE

    // access the value of the variable in Enum Object
    println(mobile1.color.toString() + " value is " + mobile1.color.rgb)

}


