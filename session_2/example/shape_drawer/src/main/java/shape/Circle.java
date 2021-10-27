package shape;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-26
 */
public class Circle implements Shape {
    private Color color;
    private double size;
    private final int uniqueID;

    public Circle(Color color, double size, int uniqueID) {
        this.color = color;
        this.size = size;
        this.uniqueID = uniqueID;
    }

    @Override
    public void draw() {
        System.out.println("Hello from the Circle class!");
    }

    @Override
    public double area() {
        double result = Math.PI*Math.pow(size, 2);
        return Math.round(result*100.0)/100.0;
    }

    @Override
    public double perimeter() {
        double result = 2*Math.PI*size;
        return Math.round(result*100.0)/100.0;
    }

    @Override
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

    // Write custom toString method
    @Override
    public String toString() {
        return "placeholder";
    }
}
