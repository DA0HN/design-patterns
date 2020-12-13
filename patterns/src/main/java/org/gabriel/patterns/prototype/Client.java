package org.gabriel.patterns.prototype;

import javafx.geometry.Point3D;

/**
 * @author daohn on 13/12/2020
 * @project design-pattern-course
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        var swordsman = new Swordsman();
        swordsman.move(new Point3D(-10,0,0), 20);
        swordsman.attack();
        System.out.println(swordsman);

        var swordsman2 = (GameUnit)swordsman.clone();
        System.out.println(swordsman2);
    }
}
