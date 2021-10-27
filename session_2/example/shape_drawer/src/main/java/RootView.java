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

        // Set tabbed pane layout to BorderLayout
        createPanel.setLayout(new BorderLayout());

        // Add panels to tabbed pane
        tabbedPane.add("Create", createPanel);

        // Add tabbed pane to main frame
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

        // Add controls for updating shape here

        JPanel updateButtonPanel = new JPanel();
        JButton updateButton = new JButton("Update");
        updateButtonPanel.add(updateButton);
        updatePanel.add(updateButtonPanel, BorderLayout.SOUTH);

        // Add controls to Delete panel
        JPanel deleteTitleBanner = new JPanel();
        JLabel deleteTitle = new JLabel("Delete a shape");
        deleteTitleBanner.add(deleteTitle);
        deletePanel.add(deleteTitleBanner, BorderLayout.NORTH);

        // Add controls for deleting shape here

        JPanel deleteButtonPanel = new JPanel();
        JButton deleteButton = new JButton("Delete");
        deleteButtonPanel.add(deleteButton);
        deletePanel.add(deleteButtonPanel, BorderLayout.SOUTH);

        // Add ActionListener to create button
        // HINT: Don't forget to update Shape comboBoxes
        createButton.addActionListener((ActionEvent e) -> {

        });

        // Add ActionListener to update button
        // HINT: Don't forget to update Shape comboBoxes
        updateButton.addActionListener((ActionEvent e) -> {

        });

        // Add ActionListener to delete button
        // HINT: Don't forget to update Shape comboBoxes
        deleteButton.addActionListener((ActionEvent e) -> {

        });

        // Display RootView to user
        this.setVisible(true);
    }
}
