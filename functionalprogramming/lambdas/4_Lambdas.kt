package functionalprogramming.lambdas

/**
 * In Kotlin, just like in Java 8, you can pass the function directly if you convert the function to a value.
 * We use the :: operator for that => val getAge = Person::age (expression called member reference)
 *
 * class::member (member can be a method or property)
 */

fun Person.isAdult() = age >= 21    // extension function

fun main(){
    val getAge = { person: Person -> person.age }

    val getAgeV2 = Person::age  // the same

    val people = listOf(
        Person("John", 23),
        Person("James", 29)
    )

    println(people.maxBy(getAgeV2)) // Person(name=James, age=29)

    val predicate = Person::isAdult

    println(predicate(people[0]))   // true
}