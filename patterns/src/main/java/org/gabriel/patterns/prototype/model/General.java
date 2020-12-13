package org.gabriel.patterns.prototype.model;

/**
 * Doesn't support cloning
 *
 * @author daohn on 13/12/2020
 * @project design-pattern-course
 */
public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override public String toString() {
        return "General " + this.state + " @ "+ super.getPosition();
    }

    @Override protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

    @Override public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }
}
