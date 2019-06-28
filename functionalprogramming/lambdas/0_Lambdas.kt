package functionalprogramming.lambdas

/**
 *
 * Lambda is an anonymous function that can be used as an expression. For instance, passed as an argument of another
 * function.
 *
 * Lambda syntax in Kotlin:
 * { x : Int, y : Int -> x + y }
 * { parameters -> body }
 *
 * Use cases:
 * When an event happens, run this handler  ex: button.setOnClickListener { /* actions on click */ }
 * Apply this operation to all elements in a data structure
 *
 * In older versions of Java, you could accomplish this through anonymous inner classes. Lambdas were introduced
 * in Java 8.
 */

fun main(){
    val sum = { x: Int, y: Int -> x + y } // we can store a lambda in a variable
    println(sum(1,2))   //calls the lambda stored in variable

    // lambdas can contain multiple statements
    val sum2 = { x: Int, y: Int ->
                        println("Computing the sum of $x and $y")
                x + y }

    println(sum2(1, 2))
    /*
    Computing the sum of 1 and 2
    3
     */
}