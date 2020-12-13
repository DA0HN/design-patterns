package org.gabriel.patterns.chain_of_responsibility.model;

/**
 * A concrete handler.
 *
 * @project design-pattern-course
 * @author daohn on 13/12/2020
 */
public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover nextApprover) {
        super("Project Lead", nextApprover);
    }

    @Override protected boolean processRequest(LeaveApplication application) {
        // type is sick leave & duration is less than or equal to 2 days.
        if(application.getType() == LeaveApplication.Type.Sick) {
            if(application.getNoOfDays() <= 2) {
                application.approve(getApproverRole());
                return true;
            }
        }
        return false;
    }
}
