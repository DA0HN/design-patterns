package org.gabriel.solid.dependency_inversion;

import java.io.IOException;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class Main {
    public static void main(String[] args) throws IOException {
        var message = new Message("This is a message");
        var printer = new MessagePrinter();
        printer.writeMessage(message, "src/main/resources/test_msg.json");
        printer.writeMessage(new Message("316yrgs"), "src/main/resources/test_msg.json");
        printer.writeMessage(new Message("1564hwrsg36"), "src/main/resources/test_msg.json");
        printer.writeMessage(new Message("153467"), "src/main/resources/test_msg.json");
        printer.writeMessage(new Message("rw26yu2524"), "src/main/resources/test_msg.json");
        printer.writeMessage(new Message("6843uj3h2451"), "src/main/resources/test_msg.json");
    }
}
