package org.ruppyrup;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    private final ShapeFactory shapeFactory;
    private final List<Shape> shapes = new ArrayList<>();

    public ShapeApp(final ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public void run() {
        Shape circle = shapeFactory.make("circle");
        Shape square = shapeFactory.make("square");
        System.out.println("Creating shapes");
        shapes.add(circle);
        shapes.add(square);
        shapes.forEach(Shape::draw);
        shapeFactory.getShapeNames();
    }
}

