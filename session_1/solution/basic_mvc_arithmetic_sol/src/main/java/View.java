import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-19
 */
public class View {
    public View() {
        // Initialize main JFrame
        JFrame frame = new JFrame("Basic MVC Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.getContentPane().setLayout(boxLayout);

        // Create text boxes for collecting num1 and num2
        JPanel textPanel = new JPanel();
        JLabel num1Label = new JLabel("Enter number 1:");
        JTextField num1Text = new JTextField("5", 10);
        JLabel num2Label = new JLabel("Enter number 2:");
        JTextField num2Text = new JTextField("6", 10);
        textPanel.add(num1Label);
        textPanel.add(num1Text);
        textPanel.add(num2Label);
        textPanel.add(num2Text);

        // Create buttons for arithmetic
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        // Add hidden label where answer will be displayed
        JPanel answerPanel = new JPanel();
        JLabel answerLabel = new JLabel();
        answerLabel.setVisible(false);
        answerPanel.add(answerLabel);

        // Add panels to frame
        frame.getContentPane().add(textPanel);
        frame.getContentPane().add(buttonPanel);
        frame.getContentPane().add(answerPanel);

        // Add ActionEvents to buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.getInstance().handleAdd(
                        Double.parseDouble(num1Text.getText()),
                        Double.parseDouble(num2Text.getText()),
                        answerLabel
                );
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.getInstance().handleSubtract(
                        Double.parseDouble(num1Text.getText()),
                        Double.parseDouble(num2Text.getText()),
                        answerLabel
                );
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.getInstance().handleMultiply(
                        Double.parseDouble(num1Text.getText()),
                        Double.parseDouble(num2Text.getText()),
                        answerLabel
                );
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.getInstance().handleDivide(
                        Double.parseDouble(num1Text.getText()),
                        Double.parseDouble(num2Text.getText()),
                        answerLabel
                );
            }
        });

        // Launch frame
        frame.setVisible(true);
    }
}
