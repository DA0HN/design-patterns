package org.gabriel.patterns.chain_of_responsibility.model;

/**
 * A concrete handler.
 *
 * @project design-pattern-course
 * @author daohn on 13/12/2020
 */
public class Director extends Employee {

    public Director(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override protected boolean processRequest(LeaveApplication application) {
        if(application.getType() == LeaveApplication.Type.PTO) {
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
