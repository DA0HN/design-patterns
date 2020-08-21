package org.gabriel.solid.dependency_inversion;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
// Format message to plain text
public class TextFormatter implements Formatter{

    @Override public String format(Message message) {
        return message.getMessage() + ": " + message.getTimeStamp();
    }
}
