package arroganteIT.projects.calculator;

/**
 * There is a java calculator, that you can use,
 * so just run "main" method and use available api.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launch {

    private static final String ROW = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    private static final String GREETINGS_MESSAGE = "WELCOME TO JAVA CALCULATOR";
    private static final String VALEDICTION = "Thank you for choosing \"JAVA CALCULATOR\"";
    private static final String WRONG_CHOICE = "Wrong choice !";
    private static final String DOC_GREETINGS_MESSAGE = "THERE IS A INFORMATION ABOUT \"JAVA CALCULATOR\"";

    private static int choice;

    private static Calculator calculator; // ?

    public static void main(String[] args) {
            Launch.logic();
    }

    private static void printGreetings() {
        System.out.println(ROW);
        System.out.println(String.format("~~ %1s ~~", Launch.GREETINGS_MESSAGE));
        System.out.println(ROW);
    }

    private static void printOffer() {
        System.out.print("\n");
        System.out.println("1. start");
        System.out.println("2. doc");
        System.out.println("3. exit");
        System.out.print("\n");
    }

    private static void looper(double result, String symbol) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("if you want to break, write \"exit\"");
                System.out.println("or enter number : ");
                String localChoice = reader.readLine();
                if("exit".equals(localChoice)) {
                    break;
                }else {
                    int number = Integer.parseInt(localChoice);
                    if ("+".equals(symbol)) {
                        result = calculator.sum(result, number);
                    } else if ("-".equals(symbol)) {
                        result = calculator.subtraction(result, number);
                    } else if ("*".equals(symbol)) {
                        result = calculator.multiplication(result, number);
                    } else if ("/".equals(symbol)) {
                        result = calculator.division(result, number);
                    } else {
                        break;
                    }
                    System.out.println("result : " + result);
                }
            }
        }catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void doc(){
        System.out.println(Launch.ROW + "~~~~~~~~~~~~~~~~~~~~");
        System.out.println(String.format("~~ %1$s ~~", Launch.DOC_GREETINGS_MESSAGE));
        System.out.println(Launch.ROW + "~~~~~~~~~~~~~~~~~~~~");

        System.out.println("1. If you want to start calculation just choose option \"1. start\".");

        System.out.print("\n");

        System.out.println("2. If you want to leave from \"JAVA CALCULATOR\" choose option \"3. exit\".");

        System.out.print("\n");

        System.out.println("\"JAVA CALCULATOR\" has four function: \n " +
                "   - summation,\n " +
                "   - subtraction,\n " +
                "   - multiplication,\n " +
                "   - division.");
    }

    private static void logic() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            calculator = new CalculatorImpl();
       // outer:
            while (true) {
                printGreetings();
                printOffer();
                System.out.print("\nEnter number of option : ");
                Launch.choice = Integer.parseInt(reader.readLine());
                System.out.println();
                switch (Launch.choice) {
                    case 1:
                        System.out.println("Enter your function");
                        System.out.println("first number : ");
                        double firstNumber = Double.parseDouble(reader.readLine());
                        System.out.println("second number : ");
                        double secondNumber = Double.parseDouble(reader.readLine());
                        System.out.println("symbol : ");
                        String symbol = reader.readLine();
                        if (secondNumber == 0 && "/".equals(symbol)) {
                            throw new ArithmeticException("division by zero!");
                        }
                        switch (symbol) {
                            case "+":
                                double sum = calculator.sum(firstNumber, secondNumber);
                                System.out.println(String.format("result : %.1f", sum));
                                Launch.looper(sum, symbol);
                                break;
                            case "-":
                                double subtraction = calculator.subtraction(firstNumber, secondNumber);
                                System.out.println(String.format("result : %.1f", subtraction));
                                Launch.looper(subtraction, symbol);
                                break;
                            case "*":
                                double multiplication = calculator.multiplication(firstNumber, secondNumber);
                                System.out.println(String.format("result : %.1f", multiplication));
                                Launch.looper(multiplication, symbol);
                                break;
                            case "/":
                                double division = calculator.division(firstNumber, secondNumber);
                                System.out.println(String.format("result : %.1f", division));
                                Launch.looper(division, symbol);
                                break;
                            default:
                                System.out.println(Launch.WRONG_CHOICE);
                                break;
                        }
                        break;
                    case 2:
                        Launch.doc();
                        break;
                    case 3:
                        System.out.println(Launch.VALEDICTION);
                        System.exit(1);
                        break;
                    default:
                        System.out.println(Launch.WRONG_CHOICE);
                }
            }
        } catch (ArithmeticException | IllegalArgumentException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
















































