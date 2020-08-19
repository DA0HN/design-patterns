package org.gabriel.solid.single_responsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
class Store {


    private static final Map<String, User> STORAGE = new HashMap<>();


    public void store(User user) {
        synchronized(STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }

    public User getUser(String name) {
        synchronized(STORAGE) {
            return STORAGE.get(name);
        }
    }
}
