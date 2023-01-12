package org.ruppyrup.bad;


import org.ruppyrup.toremove.BadCircle;
import org.ruppyrup.toremove.BadPoint;
import org.ruppyrup.toremove.BadSquare;

public class BadShapeFactory {
    private static final BadPoint point = new BadPoint(1.0, 1.0);

    public BadShape make(String shapeName) {
        return switch(shapeName) {
            case "circle" -> makeCircle(point, 3.0);
            case "square" -> makeSquare(point, 3.0);
            default -> throw new IllegalStateException("Unexpected value: " + shapeName);
        };
    }

    public String[] getShapeNames() {
        return new String[]{"circle", "square"};
    }


    protected BadShape makeSquare(BadPoint origin, double side) {
        return new BadSquare(origin, side);
    }

    protected BadShape makeCircle(BadPoint origin, double radius) {
        return new BadCircle(origin, radius);
    }
}
