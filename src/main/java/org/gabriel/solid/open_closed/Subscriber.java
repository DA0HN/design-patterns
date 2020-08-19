package org.gabriel.solid.open_closed;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */

// Base class - closed for modification open for extension
abstract class Subscriber {
    protected Long subscriberId;
    protected String address;
    protected Long phoneNumber;
    protected int baseRate;

    public abstract double calculateBill(); // extension

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
