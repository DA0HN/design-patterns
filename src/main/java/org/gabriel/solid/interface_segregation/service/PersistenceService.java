package org.gabriel.solid.interface_segregation.service;


import org.gabriel.solid.interface_segregation.model.Entity;

import java.util.List;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */

// Common interface to be implemented by all persistence services
public interface PersistenceService<E extends Entity> {

    void save(E e);
    void delete(E e);
    E findById(Long id);
    List<E> findByName(String name);

}
