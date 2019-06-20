package conventions.arithmeticoperators

/**
 * When you define an operator such as plus, Kotlin supports not only the + operation but += as well.
 *
 * When you write += in your code, both plus and plusAssign functions can be called.
 * a += b  => a = a.plus(b)
 * a += b  => a.plusAssign(b)
 *
 * The + and - operators always return a new collection.
 * The += and -= operators work on mutable collections by modifying them in place, and on read-only collections
 * by returning a modified copy
 */


fun main() {
    val p1 = Point(10, 20)
    var p2 = Point(30, 40)
    p2 += p1

    println(p2)    // Point(x=40, y=60)

    // The Kotlin standard library defines a function plusAssign on a mutable collection
    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0]) // 42

    var list = arrayListOf(1,2) + 1 // + returns a new list containing all the elements
    println(list)   // [1, 2, 1]

    list += arrayListOf(4,5) // += changes "list"
    println(list)   // [1, 2, 1, 4, 5]

}