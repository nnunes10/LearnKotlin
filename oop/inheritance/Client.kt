package oop.inheritance

/**
 * Kotlin classes have several methods you may want to override:
 * toString(), equals(), and hashCode()
 *
 */

class Client(val name: String, val postalCode: Int)

class ClientV2(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is ClientV2)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    // The hashCode method should be always overridden together with equals
    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main(){
    val client = Client("Alice", 342562)
    val clientV2 = ClientV2("Alice", 342562)
    val otherClient = ClientV2("Alice", 342562)

    println(client) // oop.inheritance.Client@266474c2 - which isn’t very useful
    println(clientV2)   // Client(name=Alice, postalCode=342562)

    // In Kotlin, == operator calls equals method
    // For reference comparison, we can use the === operator
    println(clientV2 == otherClient)    // true
}

