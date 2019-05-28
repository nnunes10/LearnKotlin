package oop.classes

/**
 * Unlike Java, Kotlin doesn't support static methods for a class
 * In Kotlin, it is advisable to define methods at the package level to achieve the functionality of static methods
 *
 * The functions declared in this file Static.kt, are compiled into static methods of a Java class named oop.classes.StaticgKt
 */

fun showFirstCharacter(input:String):Char{
    if(input.isEmpty()) throw IllegalArgumentException()
    return input.first()
}