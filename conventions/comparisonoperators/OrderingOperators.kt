package conventions.comparisonoperators

/**
 * In Java, classes can implement the Comparable interface in order to be used in
 * algorithms that compare values, such as finding a maximum or sorting. The compareTo
 * method defined in that interface is used to determine whether one object is larger than another
 *
 * Only values of primitive types can be compared using < and >; all other types require you to write
 * element1.compareTo(element2) explicitly
 *
 * In Kotlin, uses of comparison operators (<, >, <=, and >=) are translated into calls of compareTo
 *
 * a >= b =>  a.compareTo(b) >= 0
 */

class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {    // the operator modifier is applied to the function in the interface
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
        // This function receives a list of callbacks that calculate values to be compared
        // The function calls each callback in order for both objects and compares the return values
    }
}

fun main (){
    println("abc" < "bac")  // true

    val p1 = Person ("Jon", "Bernthal")
    val p2 = Person ("Alice", "Bernthal")

    println (p2 > p1)   // false
}