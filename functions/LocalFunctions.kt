package functions

/**
 * Local functions
 */

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    fun validate(value: String, fieldName: String) { // local functions have access to all parameters and variables
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Cannot save user ${user.id}: $fieldName is empty")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    // Save user to the database ...
}
