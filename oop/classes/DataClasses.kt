package oop.classes

/**
 *  Classes for the sole purpose of holding data.
 *  All the necessary methods are automatically generated: equals(), hashCode(), toString()
 */

data class Customer(val id:Int, val name:String, var address:String)
// The equals and hashCode methods take into account all the properties declared in the primary constructor

fun main (){
    val customer = Customer(1, "Alice", "address")
    val customer2 = Customer(1, "Alice", "address")

    println(customer)   // Customer(id=1, name=Alice, address=address)
    println(customer2)  // Customer(id=1, name=Alice, address=address)
    println(customer == customer2)  // true
}