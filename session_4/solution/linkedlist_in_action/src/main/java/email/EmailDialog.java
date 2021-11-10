package email;

import javax.swing.*;
import java.awt.*;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-10
 */
public class EmailDialog extends JDialog {
    public EmailDialog(String subject, String message, String sender) {
        this.setTitle("Message");
        this.setSize(500, 125);

        JPanel subjectBanner = new JPanel();
        JPanel messageBanner = new JPanel();
        JPanel senderBanner = new JPanel();

        subjectBanner.add(new JLabel("Subject: "));
        subjectBanner.add(new JLabel(subject));
        messageBanner.add(new JLabel("Message: "));
        messageBanner.add(new JLabel(message));
        senderBanner.add(new JLabel("Sender: "));
        senderBanner.add(new JLabel(sender));

        this.add(subjectBanner, BorderLayout.NORTH);
        this.add(messageBanner, BorderLayout.CENTER);
        this.add(senderBanner, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
