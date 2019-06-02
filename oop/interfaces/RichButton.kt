package oop.interfaces

open class RichButton : Clickable { // This class is open: others can inherit from it
    fun disable() {}    // This function is "final": you can’t override it in a subclass
    open fun animate() {}
    override fun click() {} // This function overrides an open function and is open as well
}