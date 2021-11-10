package notification;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-10
 */
public class Notification {
    private final String notification;

    public Notification(String notification) {
        this.notification = notification;
    }

    public String getNotification() {
        return notification;
    }
}
