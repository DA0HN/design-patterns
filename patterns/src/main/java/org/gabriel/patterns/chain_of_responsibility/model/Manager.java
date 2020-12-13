package org.gabriel.patterns.chain_of_responsibility.model;

/**
 * A concrete handler.
 *
 * @project design-pattern-course
 * @author daohn on 13/12/2020
 */
public class Manager extends Employee {

    public Manager(LeaveApprover nextApprover) {
        super("Manager", nextApprover);
    }

    @Override protected boolean processRequest(LeaveApplication application) {
        return switch(application.getType()){
            case Sick -> {
                application.approve(getApproverRole());
                yield true;
            }
            case PTO -> {
                if(application.getNoOfDays() <= 5) {
                    application.approve(getApproverRole());
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }
}
