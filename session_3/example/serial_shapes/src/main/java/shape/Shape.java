package shape;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-26
 */
public interface Shape {
    // Method to draw the shape
    void draw();

    // Method to calculate the area of the shape
    double area();

    // Method to calculate the perimeter of the shape
    double perimeter();

    // Convert shape to an ArrayList that can be read in table
    ArrayList<String> toArrayList();

    // Get unique shape type
    String getShapeType();

    // Get and set Color info
    Color getColor();

    void setColor(Color color);

    // Get and set Size info
    double getSize();

    void setSize(double size);

    // Get unique ID for each shape
    int getUniqueID();
}
