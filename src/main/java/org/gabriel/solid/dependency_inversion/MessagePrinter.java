package org.gabriel.solid.dependency_inversion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class MessagePrinter {

    // Writes message to a file
    public void writeMessage(Message msg, String fileName) throws IOException {
        // Creates a formatter
        Formatter formatter = new JSONFormatter();
        // Creates a print writer
        try (var writer = Files.newBufferedWriter(Path.of(fileName), StandardOpenOption.APPEND)) {
            // Format and write message
            writer.append(formatter.format(msg));
            System.out.println("Escrevendo: \n" + formatter.format(msg));
            writer.newLine();
        }
        catch(FormatException e) {
            e.printStackTrace();
        }
    }

}
