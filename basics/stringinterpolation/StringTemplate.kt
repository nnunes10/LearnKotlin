package basics.stringinterpolation


/**
 *  A variable or expression can be embedded simply by prefixing with a dollar ($) symbol
 *
 */

fun main (){
    val name = "Sam"
    val str = "hello $name"

    println(str)    // hello Sam

    val str2 = "hello $name. Your name has ${name.length} characters"

    println(str2)   // hello Sam. Your name has 3 characters
}