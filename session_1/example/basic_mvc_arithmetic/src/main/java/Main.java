import javax.swing.SwingUtilities;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-19
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                launchGUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void launchGUI() throws Exception {
        new View();
    }
}
