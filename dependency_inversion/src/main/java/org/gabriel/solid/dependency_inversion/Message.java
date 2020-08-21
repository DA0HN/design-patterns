package org.gabriel.solid.dependency_inversion;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
class Message {

    private final String message;
    private final LocalDateTime timeStamp;

    public Message(String message) {
        this.message = message;
        this.timeStamp = LocalDateTime.now(ZoneId.of("GMT-4"));
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
}
