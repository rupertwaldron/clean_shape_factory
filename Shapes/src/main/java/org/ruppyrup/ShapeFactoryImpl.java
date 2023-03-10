package org.ruppyrup;


public class ShapeFactoryImpl implements ShapeFactory {

    private static final Point point = new Point(1.0, 1.0);

    public Shape make(String shapeName) {
        return switch(shapeName) {
            case "circle" -> makeCircle(point, 3.0);
            case "square" -> makeSquare(point, 3.0);
            default -> throw new IllegalStateException("Unexpected value: " + shapeName);
        };
    }

    @Override
    public String[] getShapeNames() {
        return new String[]{"circle", "square"};
    }


    protected Shape makeSquare(Point origin, double side) {
        return new Square(origin, side);
    }

    protected Shape makeCircle(Point origin, double radius) {
        return new Circle(origin, radius);
    }
}
