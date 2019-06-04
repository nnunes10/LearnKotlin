package oop.interfaces

import java.io.InputStream
import java.io.OutputStream

// Here’s how you implement the interface Document
// The colon after the class name replaces extends and implements keywords used in Java
class DocumentImpl : Document {
    override val size: Long
        get() = 0   // this property has only a getter that returns 0 on every invocation

    override val version: Long
        get() = 0

    override fun load(stream: OutputStream) {   // similar to the @Override, but in Kotlin is mandatory!
    }

    override fun save(input: InputStream) {
    }
}