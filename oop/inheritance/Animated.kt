package oop.inheritance

abstract class Animated {   // This class is abstract: you can’t create an instance of it
    abstract fun animate()  // This function is abstract: it doesn’t have an implementation and must be overridden in subclasses

    open fun stopAnimating() {  // Non-abstract functions in abstract classes aren’t open by default
    }

    fun animateTwice() {
    }
}