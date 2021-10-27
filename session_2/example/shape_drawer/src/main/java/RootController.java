import shape.Shape;
import shape.ShapeFactory;
import utils.ComboBoxFactory;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-26
 */
public class RootController {
    private static RootController controllerInstance = null;

    // ArrayList to save the current Shapes we have
    private ArrayList<Shape> shapeArrayList = new ArrayList<>();

    private RootController() {}

    public static RootController getInstance() {
        if (controllerInstance == null) {
            controllerInstance = new RootController();
        }

        return controllerInstance;
    }

    public void updateSizeLabel(String selectedShape, JLabel sizeLabel) {
        switch (selectedShape.toUpperCase()) {
            case "CIRCLE":
                sizeLabel.setText("Enter Radius: ");
                break;

            case "SQUARE":
                sizeLabel.setText("Enter Length: ");
                break;

            case "TRIANGLE":
                sizeLabel.setText("Enter Base Length: ");
                break;

            default:
                sizeLabel.setText("Unknown Shape!");
                break;
        }
    }

    // Use this method to populate dropdown with the current shapes we have available
    public void updateShapeComboBox(JComboBox shapeComboBox) {
        shapeComboBox.setModel(ComboBoxFactory.getCurrentShapeComboBox().getModel());
    }

    // Write method to create new shapes using the Shape factory
    public void handleCreateButton(String shapeType, String color, String size) {
        ComboBoxFactory.setCurrentShapes(shapeArrayList);
    }

    // Write method to handle updates to the Shapes
    public void handleUpdateButton(String selectedShape, String newColor, String newSize) {
    }

    // Write method to handle the deletion of Shapes
    public void handleDeleteButton(String selectedShape) {
    }

    private void push(Shape newShape) {
        shapeArrayList.add(newShape);
    }

    private void pop(Shape oldShape) {
        shapeArrayList.remove(oldShape);
    }
}
