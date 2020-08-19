package org.gabriel.solid.dependency_inversion;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class MessagePrinter {

    // Writes message to a file
    public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws FormatException {
        writer.println(formatter.format(msg));
        writer.flush();
    }

}
