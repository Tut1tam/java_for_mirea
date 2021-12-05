public class CalculatorController {

    private CalculatorModel calculator;
    private CalculatorView calculatorView;

    public CalculatorController(CalculatorModel calculator, CalculatorView calculatorView) {
        this.calculator = calculator;
        this.calculatorView = calculatorView;
    }

    public void calculate() {
        try {
            String expression = calculatorView.getExpression();
            int result = calculator.calculate(expression);
            calculatorView.printResult(result);
        } catch (Exception e) {
            calculatorView.printException(e);
        }
    }

    public static void main(String[] args) {
        new CalculatorController(
                new CalculatorModel(),
                new CalculatorView()
        ).calculate();
    }

}
