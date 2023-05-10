package arroganteIT.projects.calculator;

public class CalculatorImpl implements Calculator{

    private String name;

    public CalculatorImpl() {
    }

    @Override
    public double sum(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    @Override
    public double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    @Override
    public double division(double number1, double number2) {
        return number1 / number2;
    }
}
