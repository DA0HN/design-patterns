package org.gabriel.solid.interface_segregation.model;

import java.time.LocalDateTime;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class User extends Entity{
    private String name;
    private LocalDateTime lastLogin;

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public String getName() {
        return name;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public void setName(String name) {
        this.name = name;
    }
}
