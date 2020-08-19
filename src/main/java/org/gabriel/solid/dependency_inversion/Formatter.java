package org.gabriel.solid.dependency_inversion;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public interface Formatter {
    String format(Message message) throws FormatException;
}
