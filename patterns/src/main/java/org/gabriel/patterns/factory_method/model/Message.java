package org.gabriel.patterns.factory_method.model;

/**
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 *
 * @author daohn on 12/12/2020
 * @project design-pattern-course
 */
public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders() {
        // Adds some default headers
    }

    public void encrypt() {
        // # Has some code to encrypt the content
    }

}
