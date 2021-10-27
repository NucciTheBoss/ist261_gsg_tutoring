import javax.swing.*;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-19
 */
public class Controller {
    private static Controller controller_instance = null;

    private Controller() {}

    public static Controller getInstance(){
        if (controller_instance == null) {
            controller_instance = new Controller();
        }

        return controller_instance;
    }

    public void handleAdd(double num1, double num2, JLabel answerLabel) {
        CalculatorModel calc = new CalculatorModel(num1, num2);
        answerLabel.setText(String.valueOf(calc.add()));
        answerLabel.setVisible(true);
    }

    public void handleSubtract(double num1, double num2, JLabel answerLabel) {
        CalculatorModel calc = new CalculatorModel(num1, num2);
        answerLabel.setText(String.valueOf(calc.sub()));
        answerLabel.setVisible(true);
    }

    public void handleMultiply(double num1, double num2, JLabel answerLabel) {
        CalculatorModel calc = new CalculatorModel(num1, num2);
        answerLabel.setText(String.valueOf(calc.mult()));
        answerLabel.setVisible(true);
    }

    public void handleDivide(double num1, double num2, JLabel answerLabel) {
        CalculatorModel calc = new CalculatorModel(num1, num2);
        answerLabel.setText(String.valueOf(calc.div()));
        answerLabel.setVisible(true);
    }
}
