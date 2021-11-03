package shape;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-26
 */
public class Square implements Shape, Serializable {
    private Color color;
    private double size;
    private final int uniqueID;

    public Square(Color color, double size, int uniqueID) {
        this.color = color;
        this.size = size;
        this.uniqueID = uniqueID;
    }

    @Override
    public void draw() {
        System.out.println("Hello from the Square class!");
    }

    @Override
    public double area() {
        double result = size*size;
        return Math.round(result*100.0)/100.0;
    }

    @Override
    public double perimeter() {
        double result = 4*size;
        return Math.round(result*100.0)/100.0;
    }

    @ Override
    public ArrayList<String> toArrayList() {
        ArrayList<String> shapeArray = new ArrayList<>();
        shapeArray.add(String.valueOf(uniqueID));
        shapeArray.add(this.getShapeType());
        shapeArray.add(color.toString());
        shapeArray.add(String.valueOf(this.area()));
        shapeArray.add(String.valueOf(this.perimeter()));
        return shapeArray;
    }

    @Override
    public String getShapeType() {
        return "circle";
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public int getUniqueID() {
        return uniqueID;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color=" + color +
                ", size=" + size +
                ", uniqueID=" + uniqueID +
                '}';
    }
}
