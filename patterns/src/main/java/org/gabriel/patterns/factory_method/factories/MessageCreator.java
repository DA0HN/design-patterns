package org.gabriel.patterns.factory_method.factories;

import org.gabriel.patterns.factory_method.model.Message;

/**
 * This is our abstract "creator". <br>
 * The abstract method {@link #createMessage()} has to be implemented by its subclasses.
 *
 * @author daohn on 12/12/2020
 * @project design-pattern-course
 */
public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();

        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    // Factory Method
    public abstract Message createMessage();
}
