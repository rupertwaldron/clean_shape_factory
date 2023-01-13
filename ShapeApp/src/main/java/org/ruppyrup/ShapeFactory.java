package org.ruppyrup;


public interface ShapeFactory {
    Shape make(ShapeType shapeName);
    String[] getShapeNames();
}
