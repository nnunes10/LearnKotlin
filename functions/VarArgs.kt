package functions

/**
 *
 * Varargs: functions that accept an arbitrary number of arguments
 * val list = listOf(2, 3, 5, 7, 11)
 *
 * Kotlin’s varargs are similar to those in Java, but the syntax is slightly different: instead of three dots after the
 * type, it uses the vararg modifier on the parameter
 */

fun sum(vararg values:Int) : Int {
    var result:Int = 0
    for(value in values){
        result += value
    }
    return result
}

fun main(){
    println(sum(1,2,6,7,8,10))  // 34
    println(sum(1,2,10))    // 13
}
