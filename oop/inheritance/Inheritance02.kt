package oop.inheritance

import java.io.InputStream

/**
 * As in Java, a class can implement as many interfaces as it wants, but it can extend only one class.
 */

interface IPersistable {
    fun save(stream: InputStream)
}

interface IPrintable {
    fun print()
}

abstract class Document(val title: String)

// If your class has a superclass, the primary constructor also needs to initialize the
// superclass. You can do so by providing the superclass constructor parameters after the
// superclass reference in the base class list
class TextDocument(title: String) : IPersistable, Document(title), IPrintable {
    override fun save(stream: InputStream) {
        println("Saving to input stream")
    }
    override fun print() {
        println("Document name:$title")
    }
}