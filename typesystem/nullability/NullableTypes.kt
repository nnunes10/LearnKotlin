package typesystem.nullability

/**
 * Nullability is a feature of the Kotlin type system that helps you avoid NullPointerException errors
 *
 * The approach of modern languages, including Kotlin, is to convert these problems from runtime errors into
 * compile-time errors.
 *
 * Kotlin has explicit support for nullable types.
 * Type? = Type OR null
 */

fun strLen(s: String) = s.length    // parameter of type Spring => non-null argument

fun strLenSafe(s: String?): Int = if (s != null) s.length else 0    // By adding the check for null, the code now compiles

fun strLenSafe2(s: String?) = s?.length ?: 0 // the same behavior using elvis operator ?:, and safe call operator ?.

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase() // if s is null, it returns null. Unless, it calls toUpperCase method
    println(allCaps)
}

fun main(){
    //println(strLen(null))   gives a compile time error

    println(strLenSafe(null))   // 0
    println(strLenSafe("Kotlin"))   // 6

    printAllCaps(null)  // null
    printAllCaps("Kotlin")  // KOTLIN
}


class Employee(val name: String, val manager: Employee?)

// Safe calls can be used for accessing properties as well, not just for method calls
fun managerName(employee: Employee): String? = employee.manager?.name
