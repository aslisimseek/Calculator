import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Calculator Type");
        System.out.println("Sum       ..:1");
        System.out.println("Minus     ..:2");
        System.out.println("Multiple  ..:3");
        System.out.println("Divided   ..:4");
        System.out.println("--------------------");
        System.out.print("Enter Calculator Type..:");
        int calculatorType = scanner.nextInt();
        System.out.print("Enter First Number..:");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter Second Number..:");
        int secondNumber = scanner.nextInt();
        int result = 0;

        switch (calculatorType) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Calculator Type does not defined");
                break;
        }
        System.out.println("Calculator Result...:" + result);
    }
}
