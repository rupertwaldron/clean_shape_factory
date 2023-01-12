package org.ruppyrup.bad;

import java.awt.*;

public class BadSquare implements BadShape {
    public BadSquare(final BadPoint origin, final double side) {
        super();
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape");
    }
}
