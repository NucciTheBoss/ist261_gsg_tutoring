package shape;

import java.awt.*;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-26
 */
public class ShapeFactory {
    private static int shapeCounter = 0;

    public static Shape newShape(String shapeType, Color color, double size) {
        if (shapeType == null) {
            return null;
        } else {
            shapeCounter += 1;
            switch (shapeType.toUpperCase()) {
                case "CIRCLE":
                    return new Circle(color, size, shapeCounter);

                case "SQUARE":
                    return new Square(color, size, shapeCounter);

                case "TRIANGLE":
                    return new Triangle(color, size, shapeCounter);

                default:
                    return null;
            }
        }
    }

    public static void setShapeCounter(int shapeCounter) {
        ShapeFactory.shapeCounter = shapeCounter;
    }
}
