package utils;

import shape.Shape;

import javax.swing.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 * Use ComboxBox Factory to create commonly needed ComboBoxes in the UI
 *
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-26
 */
public class ComboBoxFactory {
    private final static String[] shapes = new String[]{
            "Circle", "Square", "Triangle"
    };

    private final static String[] colors = new String[]{
        "BLACK", "BLUE", "GREEN", "PINK", "ORANGE", "YELLOW", "RED"
    };

    private static ArrayList<Shape> currentShapes = new ArrayList<>();

    public static JComboBox getShapeComboBox() {
        DefaultComboBoxModel<String> shapeTypes = new DefaultComboBoxModel<>();
        for (String shape : shapes) {
            shapeTypes.addElement(shape);
        }
        return new JComboBox(shapeTypes);
    }

    public static JComboBox getColorComboBox() {
        DefaultComboBoxModel<String> colorTypes = new DefaultComboBoxModel<>();
        for (String color : colors) {
            colorTypes.addElement(color);
        }
        return new JComboBox(colorTypes);
    }

    public static Color getColorMapping(String colorName) {
        switch (colorName) {
            case "BLUE":
                return Color.BLUE;

            case "GREEN":
                return Color.GREEN;

            case "PINK":
                return Color.PINK;

            case "ORANGE":
                return Color.ORANGE;

            case "YELLOW":
                return Color.YELLOW;

            case "RED":
                return Color.RED;

            default:
                return Color.BLACK;
        }
    }

    public static JComboBox getCurrentShapeComboBox() {
        DefaultComboBoxModel<String> shapes = new DefaultComboBoxModel<>();
        for (Shape currentShape : currentShapes) {
            shapes.addElement(currentShape.toString());
        }
        return new JComboBox(shapes);
    }

    public static void setCurrentShapes(ArrayList<Shape> shapeArrayList) {
        currentShapes = shapeArrayList;
    }
}
