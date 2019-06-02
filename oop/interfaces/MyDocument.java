package oop.interfaces;

import java.io.InputStream;
import java.io.OutputStream;

/**
 *  Use the interface Document from a Java class
 *
 *  Properties need to be translated into getters
 */


public class MyDocument implements Document {

    public long getVersion() {
        return 0;
    }

    public long getSize() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public void save(InputStream input) {
    }

    public void load(OutputStream stream) {
    }

    public String getDescription() {    // Despite providing default implementations for getDescription along with the
                                        // name, you still have to implement them. This is not the case when implementing the interface in a Kotlin class
        return null;
    }
}
