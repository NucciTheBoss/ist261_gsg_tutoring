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
            // Add method for creating Shapes based on user input
            // Placeholder
            return new Triangle(Color.BLACK, 15.2, 1);
        }
    }
}
