package org.gabriel.solid.open_closed;

import java.util.List;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
class PhoneSubscriber extends Subscriber {

    // only for demonstration
    @Override public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return (double) totalDuration * baseRate / 100;
    }
}
