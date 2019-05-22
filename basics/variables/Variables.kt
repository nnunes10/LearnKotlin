package basics.variables

/**
 * Kotlin has two keywords for declaring variables, val and var.
 *
 * val : Used to declare a read-only variable. Must be initialized when it is created
 * var : Mutable variable which can be changed to another value by reassigning it
 *
 * Even though Kotlin is a strongly typed language, we don't always need to declare types
 * explicitly. The compiler figure out the type - Type Inference
 */

fun main (){
	var name = "kotlin"
	name = "more kotlin"

	val name2 = "kotlin"

	println(name)	// more kotlin
	println(name2)	// kotlin
}