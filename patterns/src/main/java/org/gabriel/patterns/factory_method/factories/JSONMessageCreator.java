package org.gabriel.patterns.factory_method.factories;

import org.gabriel.patterns.factory_method.model.JSONMessage;
import org.gabriel.patterns.factory_method.model.Message;

/**
 * Provides implementation for creating JSON messages.
 *
 * @author daohn on 12/12/2020
 * @project design-pattern-course
 */
public class JSONMessageCreator extends MessageCreator {
    @Override public Message createMessage() {
        return new JSONMessage();
    }
}
