package org.gabriel.solid.liskov_substitution;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class Main {
    // enable -ea flag on VM option to use Assertion
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.computeArea());

        Square square = new Square(10);
        System.out.println(square.computeArea());

        useRectangle(rectangle);
        useRectangle(square);
    }

    private static void useRectangle(Rectangle rectangle) {
        rectangle.setHeight(20);
        rectangle.setWidth(30);

        assert rectangle.getHeight() == 20 : "Height not equal to 20";
        assert rectangle.getWidth() == 30 : "Height not equal to 30";
    }

}
