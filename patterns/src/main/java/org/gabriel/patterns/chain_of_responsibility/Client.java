package org.gabriel.patterns.chain_of_responsibility;

import org.gabriel.patterns.chain_of_responsibility.model.Director;
import org.gabriel.patterns.chain_of_responsibility.model.LeaveApplication;
import org.gabriel.patterns.chain_of_responsibility.model.LeaveApprover;
import org.gabriel.patterns.chain_of_responsibility.model.Manager;
import org.gabriel.patterns.chain_of_responsibility.model.ProjectLead;

import java.time.LocalDate;

import static org.gabriel.patterns.chain_of_responsibility.model.LeaveApplication.Type.Sick;

/**
 * @author daohn on 13/12/2020
 * @project design-pattern-course
 */
public class Client {

    public static void main(String[] args) {
        var application = LeaveApplication
                                 .getBuilder()
                                 .from(LocalDate.now().minusDays(5))
                                 .to(LocalDate.now())
                                 .type(Sick)
                                 .build();
        System.out.println(application);
        var approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application);
    }

    private static LeaveApprover createChain() {
        var director = new Director(null);
        var manager = new Manager(director);
        return new ProjectLead(manager);
    }

}
