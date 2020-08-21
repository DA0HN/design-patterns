package org.gabriel.solid.single_responsibility;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class UserPersistenceService {

    private final Store store = new Store();

    public void saveUser(User user) {
        store.store(user);
    }
}
