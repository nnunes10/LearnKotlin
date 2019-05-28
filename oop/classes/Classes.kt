package oop.classes

/**
 * Compared to Java, you can define multiple classes within the same source file
 * The class keyword can be preceded by the access level. If it is not specified, it will default to public
 */

class Deposit {
    // fields
    // properties
    // methods
}

class Person constructor(val firstName: String, val lastName: String, val age: Int?) {}

// require method will throw IllegalArgumentException if the expression given evaluates to False
class Person2 (val firstName: String, val lastName: String, val age: Int?) {
    init {  // to add code to the primary constructor
        require(firstName.trim().length > 0) {"Invalid firstName argument." }
        require(lastName.trim().length > 0) { "Invalid lastName argument." }
        if (age != null) {
            require(age >= 0 && age < 150) { "Invalid age argument." }
        }
    }

    // secondary constructor
    constructor(firstName: String, lastName: String) : this(firstName, lastName, null)
}

fun main(){
    val deposit = Deposit() // the class Deposit gets an empty constructor generated by the compiler automatically

    val person = Person("Alex", "Smith", 29)
    var person2 = Person2("Jane", "Smith")

    println("${person.firstName},${person.lastName} is ${person.age} years old") // Alex,Smith is 29 years old
    println("${person2.firstName},${person2.lastName}") // Jane,Smith
}