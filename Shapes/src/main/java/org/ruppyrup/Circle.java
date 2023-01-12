package org.ruppyrup;

public class Circle implements Shape {
    public Circle(final Point origin, final double side) {
        super();
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
