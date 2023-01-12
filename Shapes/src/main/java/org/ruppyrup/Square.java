package org.ruppyrup;

public class Square implements Shape {
    public Square(final Point origin, final double side) {
        super();
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape");
    }
}
