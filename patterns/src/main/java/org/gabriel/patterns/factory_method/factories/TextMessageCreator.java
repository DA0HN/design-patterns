package org.gabriel.patterns.factory_method.factories;

import org.gabriel.patterns.factory_method.model.Message;
import org.gabriel.patterns.factory_method.model.TextMessage;

/**
 * Provides implementation for creating Text messages.
 *
 * @author daohn on 12/12/2020
 * @project design-pattern-course
 */
public class TextMessageCreator extends MessageCreator {
    @Override public Message createMessage() {
        return new TextMessage();
    }
}
