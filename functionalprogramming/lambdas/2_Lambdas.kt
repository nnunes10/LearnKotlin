package functionalprogramming.lambdas

/**
 * If you use a lambda in a function, you can access the parameters of that function as well as the local variables
 * declared before the lambda.
 *
 * One important difference between Kotlin and Java is that in Kotlin, you aren’t restricted to accessing final
 * variables. You can also modify variables from within a lambda.
 */

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {  // Takes as an argument a lambda
        println("$prefix $it")  // Accesses the "prefix" parameter in the lambda
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++  // Modifies variables in the lambda
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun main(){
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")
    /*
    Error: 403 Forbidden
    Error: 404 Not Found
     */
}