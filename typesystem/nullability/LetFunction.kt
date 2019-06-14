package typesystem.nullability

/**
 * Let Function
 *
 * Makes it easier to deal with a nullable argument that should be passed to a function that expects
 * a non-null parameter.
 *
 */

// This function requires a non-null parameter
fun sendEmailTo(email: String) {
    println("Sending email to $email")
    /*...*/
}

fun main (){
    var email: String? = "teste@gmail.com"
    // sendEmailTo(email) - this code does not compile
    email?.let { email -> sendEmailTo(email) } // safe-calling 'let' executes a lambda only if an expression isn’t null
    email = null
    email?.let { sendEmailTo(it) } // short syntax
}