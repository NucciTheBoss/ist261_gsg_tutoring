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

        // Create buttons for arithmetic

        // Add hidden label where answer will be displayed

        // Add panels to frame

        // Add ActionEvents to buttons

        // Launch frame
        frame.setVisible(true);
    }
}
