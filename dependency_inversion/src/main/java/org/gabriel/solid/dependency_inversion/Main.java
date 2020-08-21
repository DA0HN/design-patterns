package org.gabriel.solid.dependency_inversion;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class Main {
    public static void main(String[] args) {
        var message = new Message("This is a message");
        var printer = new MessagePrinter();
        try(var writer =
                    new PrintWriter("dependency_inversion/src/main/resources/test_msg.json")) {
            printer.writeMessage(message, new JSONFormatter(), writer);
        }
        catch(IOException | FormatException e) {
            e.printStackTrace();
        }
    }
}
