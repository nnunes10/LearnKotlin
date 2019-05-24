package basics.casts

/**
 * If after type checking we want to refer to the variable as an instance of B, then the reference
 * must be cast. In Java, this must be done explicitly
 *
 * The Kotlin compiler is more intelligent, and will remember type checks for us, implicitly
 * casting the reference to the more specific type.
 */

/* Java Example
public void printStringLength(Object obj) {
    if (obj instanceof String) {
        String str = (String) obj
        System.out.print(str.length())
    }
}
*/

fun printStringLength(any: Any) {
    if (any is String) {
        println(any.length) // smart cast allowing us to access methods defined on the string instance
    }
}

