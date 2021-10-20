
/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-10-19
 */
public class CalculatorModel implements Arithmetic {
    private final double num1;
    private final double num2;

    public CalculatorModel(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double add() {
        return Math.round((this.num1+this.num2)*100.0)/100.0;
    }

    @Override
    public double sub() {
        return Math.round((this.num1-this.num2)*100.0)/100.0;
    }

    @Override
    public double mult() {
        return Math.round((this.num1*this.num2)*100.0)/100.0;
    }

    @Override
    public double div() {
        return Math.round((this.num1/this.num2)*100.0)/100.0;
    }
}
