package org.gabriel.patterns.chain_of_responsibility.model;

/**
 * This interface represents a handler in chain of responsibility
 *
 * @project design-pattern-course
 * @author daohn on 13/12/2020
 */
public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication application);
    String getApproverRole();
}
