package oop.inheritance

/**
 * Method overriding in Kotlin works as usual for member functions, but you can’t override an extension function
 * The extension function is resolved statically!
 *
 */

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

// defining extension functions
fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main(){
    val view : View = Button()
    view.click()    // Button clicked
    view.showOff()  // I'm a view!
}