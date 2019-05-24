package basics.instances

import java.math.BigDecimal

/**
 * In Kotlin we don't use the new keyword
 *
 * It treats calling a constructor function the same as a normal function
 */

fun main(){

    val bigdecimal = BigDecimal(100)

    println(bigdecimal) // 100
    println(bigdecimal.javaClass)   // class java.math.BigDecimal
}