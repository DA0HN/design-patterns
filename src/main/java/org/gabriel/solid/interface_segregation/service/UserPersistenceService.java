package org.gabriel.solid.interface_segregation.service;

import org.gabriel.solid.interface_segregation.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class UserPersistenceService implements PersistenceService<User> {

    private static final Map<Long, User> USERS = new HashMap<>();

    @Override public void save(User user) {
        synchronized(USERS) {
            USERS.put(user.getId(), user);
        }
    }

    @Override public void delete(User user) {
        synchronized(USERS) {
            USERS.remove(user.getId());
        }
    }

    @Override public User findById(Long id) {
        synchronized(USERS) {
            return USERS.get(id);
        }
    }

    @Override public List<User> findByName(String name) {
        synchronized(USERS) {
            return USERS.values()
                    .stream()
                    .filter(u -> u.getName().equalsIgnoreCase(name))
                    .collect(Collectors.toList());
        }
    }
}
