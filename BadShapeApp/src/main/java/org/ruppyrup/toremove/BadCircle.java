package org.ruppyrup.toremove;

import org.ruppyrup.bad.BadShape;

public class BadCircle implements BadShape {
    public BadCircle(final BadPoint origin, final double side) {
        super();
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
