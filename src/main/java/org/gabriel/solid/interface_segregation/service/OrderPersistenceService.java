package org.gabriel.solid.interface_segregation.service;

import org.gabriel.solid.interface_segregation.model.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class OrderPersistenceService implements PersistenceService<Order>{

    private static final Map<Long, Order> ORDERS = new HashMap<>();

    @Override public void save(Order order) {
        synchronized(ORDERS) {
            ORDERS.put(order.getId(), order);
        }
    }

    @Override public void delete(Order order) {
        synchronized(ORDERS) {
            ORDERS.remove(order.getId());
        }
    }

    @Override public Order findById(Long id) {
        synchronized(ORDERS) {
            return ORDERS.get(id);
        }
    }
}
