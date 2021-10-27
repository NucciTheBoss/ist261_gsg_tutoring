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

    public void updateShapeComboBox(JComboBox shapeComboBox) {
        shapeComboBox.setModel(ComboBoxFactory.getCurrentShapeComboBox().getModel());
    }

    public void handleCreateButton(String shapeType, String color, String size) {
        this.push(ShapeFactory.newShape(
                shapeType,
                ComboBoxFactory.getColorMapping(color),
                Double.parseDouble(size)
                )
        );
        ComboBoxFactory.setCurrentShapes(shapeArrayList);
    }

    public void handleUpdateButton(String selectedShape, String newColor, String newSize) {
        for (int i = 0; i < shapeArrayList.size(); i++) {
            if (shapeArrayList.get(i).toString().equals(selectedShape)) {
                shapeArrayList.get(i).setColor(ComboBoxFactory.getColorMapping(newColor));
                shapeArrayList.get(i).setSize(Double.parseDouble(newSize));
            }
        }
    }

    public void handleDeleteButton(String selectedShape) {
        for (int i = 0; i < shapeArrayList.size(); i++) {
            if (shapeArrayList.get(i).toString().equals(selectedShape)) {
                this.pop(shapeArrayList.get(i));
            }
        }
    }

    private void push(Shape newShape) {
        shapeArrayList.add(newShape);
    }

    private void pop(Shape oldShape) {
        shapeArrayList.remove(oldShape);
    }
}
