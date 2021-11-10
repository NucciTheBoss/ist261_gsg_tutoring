import email.Email;
import email.EmailDialog;
import notification.Notification;

import javax.swing.*;
import java.util.LinkedList;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-10
 */
public class RootController {
    private static RootController controllerInstance = null;

    private final LinkedList<Email> emails = new LinkedList<>();
    private final LinkedList<Notification> notifs = new LinkedList<>();

    private RootController() {}

    public static RootController getInstance() {
        if (controllerInstance == null) {
            controllerInstance = new RootController();
        }

        return controllerInstance;
    }

    public void populate() {
        emails.add(new Email("Hello", "My Name is Jason", "Jason Nucciarone"));
        emails.add(new Email("What's up", "Hey what are you up to this weekend?", "Jason Nucciarone"));
        emails.add(new Email("Plz respond", "Hey, I saw you never answered my request for a meeting", "Jason Nucciarone"));

        notifs.add(new Notification("New mail #1"));
        notifs.add(new Notification("New mail #2"));
        notifs.add(new Notification("New mail #3"));
    }

    public void updateNotif(JLabel messageLabel) {

    }

    public void updateEmail(JLabel statusLabel) {

    }

    private Email getEmail() {
        return null;
    }

    private Notification getNotif() {
        return null;
    }
}
