package org.gabriel.solid.dependency_inversion;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class FormatException extends Exception {
    public FormatException() {
    }

    public FormatException(String message) {
        super(message);
    }
}
