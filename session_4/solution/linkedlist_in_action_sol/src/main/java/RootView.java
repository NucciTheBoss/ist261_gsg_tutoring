import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-10
 */
public class RootView extends JFrame {
    public RootView() {
        this.setTitle("A basic email client");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 150);
        this.setLocationRelativeTo(null);

        // Add top-level tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel checkEmail = new JPanel();
        JPanel checkNotification = new JPanel();
        checkEmail.setLayout(new BorderLayout());
        checkNotification.setLayout(new BorderLayout());
        tabbedPane.add("Check Email", checkEmail);
        tabbedPane.add("Check Notifications", checkNotification);
        this.add(tabbedPane, BorderLayout.CENTER);

        // Create emails and notification
        RootController.getInstance().populate();

        // Add button and action listener for getting email
        JPanel emailButtonPanel = new JPanel();
        JButton emailButton = new JButton("Check Email");

        JPanel emailStatusPanel = new JPanel();
        JLabel emailStatusLabel = new JLabel();
        emailStatusLabel.setVisible(false);
        emailStatusPanel.add(emailStatusLabel);
        checkEmail.add(emailStatusPanel, BorderLayout.CENTER);

        emailButtonPanel.add(emailButton);
        checkEmail.add(emailButtonPanel, BorderLayout.SOUTH);

        emailButton.addActionListener((ActionEvent e) -> {
            RootController.getInstance().updateEmail(emailStatusLabel);
        });


        // Add button and action listener for getting notification
        JPanel notifButtonPanel = new JPanel();
        JButton notifButton = new JButton("Check Notification");

        JPanel notifMessagePanel = new JPanel();
        JLabel notifMessage = new JLabel();
        notifMessage.setVisible(false);
        notifMessagePanel.add(notifMessage);
        checkNotification.add(notifMessagePanel, BorderLayout.CENTER);

        notifButtonPanel.add(notifButton);
        checkNotification.add(notifButtonPanel, BorderLayout.SOUTH);

        notifButton.addActionListener((ActionEvent e) -> {
            RootController.getInstance().updateNotif(notifMessage);
        });

        this.setVisible(true);
    }
}
