package functionalprogramming.lambdas

/**
 *  Common operations on collections:
 *  filter - filters out the content of the collection
 *  map -  each element of the collection
 *  any -
 *  find -  find an element that satisfies the given predicate and returns it
 *  count
 *  first
 *  firstOrNull
 *  partition - similar to filter but keeps the two collections
 *  groupBy
 *  associateBy - should be used when the key is unique
 *  associate - builds a map based on a list
 *  zip
 *
 *
 */

data class Person(val name: String, val age: Int)

/* Suppose you have a list of people, and you need to find the oldest of them. If you had
no experience with lambdas, you implement the search manually.
*/
fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(){
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31)
    )

    // In Kotlin, there’s a better way. You can use a library function maxBy

    println(people.maxBy({ p: Person -> p.age }))

    // If a lambda just delegates to a method or property, it can be replaced by a member reference
    println(people.maxBy(Person::age))

    // We can move a lambda expression out of parentheses if it’s the last argument in a function call
    println(people.maxBy() { p: Person -> p.age })

    // When the lambda is the only argument to a function, you can also remove the empty parentheses
    println(people.maxBy { p: Person -> p.age })

    // If argument type can be inferred, we don't need to specify it
    println(people.maxBy { p -> p.age })

    // 'it' can be used if the context expects a lambda with only one argument
    println(people.maxBy { it.age })    // Person(name=Bob, age=31)
}