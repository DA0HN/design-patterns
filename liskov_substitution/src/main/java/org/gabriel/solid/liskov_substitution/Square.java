package org.gabriel.solid.liskov_substitution;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
class Square implements Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    @Override public int computeArea() {
        return side*side;
    }
}
