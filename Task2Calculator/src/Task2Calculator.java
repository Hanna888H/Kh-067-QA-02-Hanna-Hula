import java.util.Scanner;
public class Task2Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        checkNumberOrString(scan);
        double number1 = scan.nextDouble();
        System.out.println("Enter the OperatorSymbol(+,-,*,/,%)");
        char OperatorSymbol = scan.next().charAt(0);
        System.out.println("Enter the 2nd number");
        checkNumberOrString(scan);
        double number2 = scan.nextDouble();
        final String ADDING = "+"; // public static не дает создавать
        final String SUBSTRUCTION = "-";
        final String MULTIPLICATION = "*";
        final String DIVISION = "/";
        final String MODULO = "%";
        if (OperatorSymbol == '+') {
            System.out.println(number1 + ADDING + number2 + " = " + (number1 + number2));
        } else if (OperatorSymbol == '-') {
            System.out.println(number1 + SUBSTRUCTION + number2 + " = " + (number1 - number2));
        } else if (OperatorSymbol == '*') {
            System.out.println(number1 + MULTIPLICATION + number2 + " = " + number1 * number2);
        } else if (OperatorSymbol == '/') {
            System.out.println(number1 + DIVISION + number2 + " = " + number1 / number2);
        } else if (OperatorSymbol == '%') {
            System.out.println(number1 + MODULO + number2 + " = " + number1 % number2);
        } else System.out.println("user inputs unsupported operations");
    }
    private static void checkNumberOrString(Scanner scan) {
        if (scan.hasNextDouble()) {
            System.out.println();
        } else {
            System.out.println("WRONG ! User inputs not an integer");
        }
        System.out.println(scan.hasNextDouble() ? "" : "WRONG ! User inputs not an integer");
    }


}
