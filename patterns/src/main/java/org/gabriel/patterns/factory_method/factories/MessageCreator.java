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

    /**
     * This is called by clients.
     *
     * @return A {@link Message}
     */
    public Message getMessage() {
        Message message = createMessage();

        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    /**
     * Subclasses must provide implementation for this & return
     * a specific Message subclass.
     *
     * @return A concrete {@link Message}
     */
    public abstract Message createMessage();
}
