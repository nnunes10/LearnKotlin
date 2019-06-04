package oop.interfaces

import java.io.InputStream
import java.io.OutputStream

/**
 * Just like Java 8, a Kotlin interface contains the declarations of abstract methods as well as method implementations
 * Unlike abstract classes, an interface cannot contain state; however, it can contain properties.
 */

interface Clickable {
    fun click() // declares an abstract method
}

// This interface defines three properties and three methods
// The name property and the getDescription methods provide the default implementation
interface Document {
    val version: Long   // abstract property which must be overridden in subclasses
    val size: Long  // abstract property which must be overridden in subclasses
    val name: String
        get() = "NoName"    // property with a custom getter which can be inherited

    fun save(input: InputStream)

    fun load(stream: OutputStream)

    fun getDescription(): String {  // Declares a method with a default implementation
        return "Document $name has $size byte(-s)"
    }
}