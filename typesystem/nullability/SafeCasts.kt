package typesystem.nullability

/**
 * Safe casts
 *
 * as? operator  tries to cast a value to the specified type and returns null if the value doesn’t have the proper type
 *
 * One common pattern of using a safe cast is combining it with the Elvis operator
 */

class Person(val firstName: String, val lastName: String)
{
    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? Person ?: return false
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}