package org.gabriel.patterns.factory_method;

import org.gabriel.patterns.factory_method.factories.JSONMessageCreator;
import org.gabriel.patterns.factory_method.factories.MessageCreator;
import org.gabriel.patterns.factory_method.factories.TextMessageCreator;

/**
 * @author daohn on 12/12/2020
 * @project design-pattern-course
 */
public class Client {

    public static void main(String[] args) {
        // Using creator to create a product, choice of creator determines
        // type of product created.
        printMessage(new JSONMessageCreator());
        // Using another creator to create another product.
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        var message = creator.createMessage();
        System.out.println(message);
    }
}
