package org.gabriel.solid.interface_segregation.model;

import java.time.LocalDateTime;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class Order extends Entity {
    private LocalDateTime orderPlaceOn;
    private double totalVaue;

    public LocalDateTime getOrderPlaceOn() {
        return orderPlaceOn;
    }

    public void setOrderPlaceOn(LocalDateTime orderPlaceOn) {
        this.orderPlaceOn = orderPlaceOn;
    }

    public double getTotalVaue() {
        return totalVaue;
    }

    public void setTotalVaue(double totalVaue) {
        this.totalVaue = totalVaue;
    }
}
