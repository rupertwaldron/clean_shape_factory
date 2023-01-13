package org.ruppyrup.bad;

import java.awt.*;

public interface BadShape {
    void draw();
}

interface ShapeFactory {
    Shape make(String shapeName);
}
