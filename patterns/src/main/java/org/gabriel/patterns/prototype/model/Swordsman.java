package org.gabriel.patterns.prototype.model;

/**
 * @author daohn on 13/12/2020
 * @project design-pattern-course
 */
public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override protected void reset() {
        this.state = "idle";
    }

    @Override protected void initialize() {
        super.initialize();
    }

    @Override public String toString() {
        return "Swordsman " + this.state + " @ " + super.getPosition();
    }
}
