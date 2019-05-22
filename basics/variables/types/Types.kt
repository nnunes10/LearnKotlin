package basics.variables.types

/**
 * One of the big changes in Kotlin from Java is that in Kotlin everything is an object.
 *
 * Int, Long, Double, Float, Boolean, String
 */

fun main (){
    val intVal = 123
    val longVal = 12345L
    val doubleVal = 12.34
    val floatVal = 13.34F
    val floatVal2 : Float = 14F // explicit type
    val isTrue = intVal == 123

    val string = "string"  // Just as in Java, strings are immutable

    val array = arrayOf(1, 2, 3)
    val array2 = Array(10, { k -> k * k }) // we can create an Array from an initial size and a function used to generate each element

    println(intVal.javaClass)   // int
    println(longVal.javaClass)  // long
    println(doubleVal.javaClass)    // double
    println(floatVal.javaClass) // float
    println(floatVal2.javaClass)    // float
    println(isTrue.javaClass)   // boolean
    println(string.javaClass)   // class java.lang.String
    println(array.javaClass)   // class [Ljava.lang.Integer

    println(array2.javaClass) // class [Ljava.lang.Integer;
    println(array2[0])  // elements can be accessed through bracket syntax
    println(array2[5])  // 25
}