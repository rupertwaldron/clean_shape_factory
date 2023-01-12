package org.ruppyrup.toremove;

import org.ruppyrup.bad.BadShape;

public class BadSquare implements BadShape {
    public BadSquare(final BadPoint origin, final double side) {
        super();
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape");
    }
}
