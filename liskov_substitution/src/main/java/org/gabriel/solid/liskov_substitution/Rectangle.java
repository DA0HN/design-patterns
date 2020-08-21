package org.gabriel.solid.liskov_substitution;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override public int computeArea() {
        return width * height;
    }
}
