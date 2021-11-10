package email;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-10
 */
public class Email {
    private final String subject;
    private final String message;
    private final String sender;

    public Email(String subject, String message, String sender) {
        this.subject = subject;
        this.message = message;
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }
}
