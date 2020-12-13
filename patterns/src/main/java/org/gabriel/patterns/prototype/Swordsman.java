package org.gabriel.patterns.prototype;

/**
 * @author daohn on 13/12/2020
 * @project design-pattern-course
 */
public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override public String toString() {
        return "Swordsman " + this.state + " @ "+ super.getPosition();
    }
}
