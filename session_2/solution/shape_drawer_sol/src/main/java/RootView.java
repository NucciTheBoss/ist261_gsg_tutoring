import utils.ComboBoxFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-26
 */
public class RootView extends JFrame {
    public RootView() {
        // Initialize RootView
        this.setTitle("Let's create some shapes!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 250);
        this.setLocationRelativeTo(null);

        // Create JTabbedPane to switch between the Create, Update, and Delete panels
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel createPanel = new JPanel();
        JPanel updatePanel = new JPanel();
        JPanel deletePanel = new JPanel();
        createPanel.setLayout(new BorderLayout());
        updatePanel.setLayout(new BorderLayout());
        deletePanel.setLayout(new BorderLayout());
        tabbedPane.add("Create", createPanel);
        tabbedPane.add("Update", updatePanel);
        tabbedPane.add("Delete", deletePanel);
        tabbedPane.setTabPlacement(JTabbedPane.RIGHT);
        this.add(tabbedPane, BorderLayout.CENTER);

        // Add controls to Create panel
        JPanel createTitlePanel = new JPanel();
        JLabel createTitle = new JLabel("Create a new shape");
        createTitlePanel.add(createTitle);
        createPanel.add(createTitlePanel, BorderLayout.NORTH);

        JPanel createGridPanel = new JPanel();
        GridLayout createGridLayout = new GridLayout(3, 0, 5, 5);
        createGridPanel.setLayout(createGridLayout);

        JPanel createShapeSelectPanel = new JPanel();
        createShapeSelectPanel.add(new JLabel("Select Shape: "));
        JComboBox createShapeSelect = ComboBoxFactory.getShapeComboBox();
        createShapeSelect.setSelectedItem(0);
        createShapeSelectPanel.add(createShapeSelect);
        createGridPanel.add(createShapeSelectPanel);

        JPanel createColorSelectPanel = new JPanel();
        createColorSelectPanel.add(new JLabel("Select Color: "));
        JComboBox createColorSelect = ComboBoxFactory.getColorComboBox();
        createColorSelect.setSelectedItem(0);
        createColorSelectPanel.add(createColorSelect);
        createGridPanel.add(createColorSelectPanel);

        JPanel createSetSizePanel = new JPanel();
        JLabel createSizeLabel = new JLabel("Radius: ");
        JTextField createSizeField = new JTextField(5);
        createSetSizePanel.add(createSizeLabel);
        createSetSizePanel.add(createSizeField);
        createGridPanel.add(createSetSizePanel);

        // Add ActionListener that updates size label based on selected shape
        createShapeSelect.addActionListener((ActionEvent e) ->
                RootController.getInstance().updateSizeLabel(
                    (String) Objects.requireNonNull(createShapeSelect.getSelectedItem()),
                    createSizeLabel
                )
        );

        createPanel.add(createGridPanel, BorderLayout.CENTER);

        JPanel createButtonPanel = new JPanel();
        JButton createButton = new JButton("Create");
        createButtonPanel.add(createButton);
        createPanel.add(createButtonPanel, BorderLayout.SOUTH);

        // Add controls to Update panel
        JPanel updateTitleBanner = new JPanel();
        JLabel updateTitle = new JLabel("Update a shape");
        updateTitleBanner.add(updateTitle);
        updatePanel.add(updateTitleBanner, BorderLayout.NORTH);

        JPanel updateGridPanel = new JPanel();
        GridLayout updateGridLayout = new GridLayout(3, 0, 5, 5);
        updateGridPanel.setLayout(updateGridLayout);

        JPanel updateShapeName = new JPanel();
        updateShapeName.add(new JLabel("Select shape to update: "));
        JComboBox updateShapeSelect = ComboBoxFactory.getCurrentShapeComboBox();
        updateShapeName.add(updateShapeSelect);
        updateGridPanel.add(updateShapeName);

        JPanel updateShapeColor = new JPanel();
        updateShapeColor.add(new JLabel("Select new color: "));
        JComboBox updateShapeColorSelect = ComboBoxFactory.getColorComboBox();
        updateShapeColor.add(updateShapeColorSelect);
        updateGridPanel.add(updateShapeColor);

        JPanel updateShapeSize = new JPanel();
        updateShapeSize.add(new JLabel("Enter new size value: "));
        JTextField updateSizeText = new JTextField(5);
        updateShapeSize.add(updateSizeText);
        updateGridPanel.add(updateShapeSize);

        updatePanel.add(updateGridPanel, BorderLayout.CENTER);

        JPanel updateButtonPanel = new JPanel();
        JButton updateButton = new JButton("Update");
        updateButtonPanel.add(updateButton);
        updatePanel.add(updateButtonPanel, BorderLayout.SOUTH);

        // Add controls to Delete panel
        JPanel deleteTitleBanner = new JPanel();
        JLabel deleteTitle = new JLabel("Delete a shape");
        deleteTitleBanner.add(deleteTitle);
        deletePanel.add(deleteTitleBanner, BorderLayout.NORTH);

        JPanel deleteGridPanel = new JPanel();
        GridLayout deleteGridLayout = new GridLayout(3, 0, 5, 5);
        deleteGridPanel.setLayout(deleteGridLayout);

        JPanel deleteShape = new JPanel();
        deleteShape.add(new JLabel("Select shape to delete: "));
        JComboBox deleteShapeSelect = ComboBoxFactory.getCurrentShapeComboBox();
        deleteShape.add(deleteShapeSelect);
        deleteGridPanel.add(deleteShape);

        deletePanel.add(deleteGridPanel, BorderLayout.CENTER);

        JPanel deleteButtonPanel = new JPanel();
        JButton deleteButton = new JButton("Delete");
        deleteButtonPanel.add(deleteButton);
        deletePanel.add(deleteButtonPanel, BorderLayout.SOUTH);

        // Add ActionListener that creates a new shape when the create button is clicked
        createButton.addActionListener((ActionEvent e) -> {
            RootController.getInstance().handleCreateButton(
                    (String) Objects.requireNonNull(createShapeSelect.getSelectedItem()),
                    (String) Objects.requireNonNull(createColorSelect.getSelectedItem()),
                    createSizeField.getText()
            );
            RootController.getInstance().updateShapeComboBox(updateShapeSelect);
            RootController.getInstance().updateShapeComboBox(deleteShapeSelect);
        });

        // Add ActionListener to update button
        updateButton.addActionListener((ActionEvent e) -> {
            RootController.getInstance().handleUpdateButton(
                    (String) Objects.requireNonNull(updateShapeSelect.getSelectedItem()),
                    (String) Objects.requireNonNull(updateShapeColorSelect.getSelectedItem()),
                    updateSizeText.getText()
            );
            RootController.getInstance().updateShapeComboBox(updateShapeSelect);
            RootController.getInstance().updateShapeComboBox(deleteShapeSelect);
        });

        // Add ActionListener to delete button
        deleteButton.addActionListener((ActionEvent e) -> {
            RootController.getInstance().handleDeleteButton(
                    (String) Objects.requireNonNull(deleteShapeSelect.getSelectedItem())
            );
            RootController.getInstance().updateShapeComboBox(updateShapeSelect);
            RootController.getInstance().updateShapeComboBox(deleteShapeSelect);
        });

        // Display RootView to user
        this.setVisible(true);
    }
}
