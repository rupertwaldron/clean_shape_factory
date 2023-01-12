package org.ruppyrup;


public interface ShapeFactory {
    Shape make(String shapeName);
    String[] getShapeNames();
}
