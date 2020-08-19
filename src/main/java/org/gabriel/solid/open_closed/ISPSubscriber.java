package org.gabriel.solid.open_closed;

import java.util.List;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class ISPSubscriber extends Subscriber {

    private final long freeUsage;

    public ISPSubscriber(long freeUsage) {
        this.freeUsage = freeUsage;
    }

    // Only for demonstration - opened for extension
    @Override public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions =
                InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData =
                sessions.stream().mapToLong(
                        InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - this.freeUsage;
        if(chargeableData <= 0) {
            return 0;
        }
        return (double) chargeableData * baseRate / 100;
    }
}
