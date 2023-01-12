package org.ruppyrup;



public class Main {
    public static void main(String[] args) {
        System.out.println("Generating shapes...");
        ShapeFactory shapeFactory = new ShapeFactoryImpl();
        ShapeApp shapeApp = new ShapeApp(shapeFactory);
        shapeApp.run();
    }
}


