package org.gabriel.patterns.prototype;

import javafx.geometry.Point3D;

/**
 * This class represents an abstract prototype & defines the clone method
 *
 * @author daohn on 13/12/2020
 * @project design-pattern-course
 */
public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        this.position = new Point3D(x, y, z);
    }

    protected abstract void reset();

    public void move(Point3D direction, float distance) {
        var finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        this.position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    @Override public GameUnit clone() throws CloneNotSupportedException {
        var gameUnit = (GameUnit) super.clone();
        gameUnit.initialize();
        return gameUnit;
    }
}
