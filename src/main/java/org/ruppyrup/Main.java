package org.ruppyrup;


import org.ruppyrup.bad.BadShapeApp;
import org.ruppyrup.bad.BadShapeFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generating shapes...");
        ShapeFactory shapeFactory = new ShapeFactoryImpl();
        ShapeApp shapeApp = new ShapeApp(shapeFactory);
        shapeApp.run();

        System.out.println("Now for the bad shapes");
        System.out.println("Generating bad shapes...");
        BadShapeFactory badShapeFactory = new BadShapeFactory();
        BadShapeApp badShapeApp = new BadShapeApp(badShapeFactory);
        badShapeApp.run();

    }
}


