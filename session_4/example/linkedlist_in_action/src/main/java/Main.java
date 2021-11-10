import javax.swing.SwingUtilities;

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

    private static void launchGUI() {
        new RootView();
    }
}
