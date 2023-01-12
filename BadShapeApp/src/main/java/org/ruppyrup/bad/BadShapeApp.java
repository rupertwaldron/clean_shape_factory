package org.ruppyrup.bad;

import java.util.ArrayList;
import java.util.List;

public class BadShapeApp {

    private final BadShapeFactory badShapeFactory;
    private final List<BadShape> badShapes = new ArrayList<>();

    public BadShapeApp(final BadShapeFactory badShapeFactory) {
        this.badShapeFactory = badShapeFactory;
    }

    public void run() {
        BadShape circle = badShapeFactory.make("circle");
        BadShape square = badShapeFactory.make("square");
        System.out.println("Creating shapes");
        badShapes.add(circle);
        badShapes.add(square);
        badShapes.forEach(BadShape::draw);
        badShapeFactory.getShapeNames();
    }
}

