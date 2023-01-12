package org.ruppyrup.bad;

import java.awt.*;

public class BadCircle implements BadShape {
    public BadCircle(final BadPoint origin, final double side) {
        super();
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
