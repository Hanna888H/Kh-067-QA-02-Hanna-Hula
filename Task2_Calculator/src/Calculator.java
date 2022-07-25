import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        String programm_name = "Calculator";
        System.out.println(programm_name);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        if (scan.hasNextInt()) {
            System.out.println();
        } else {
            System.out.println("WRONG ! User inputs not an integer");
        }
        double number2;
        double number1 = scan.nextDouble();
        System.out.println("Enter the OperatorSymbol(+,-,*,/,%)");
        char OperatorSymbol = scan.next().charAt(0);
        System.out.println("Enter the 2nd number");
        if (scan.hasNextInt()) {
            System.out.println();
        } else {
            System.out.println("WRONG ! User inputs not an integer");
        }
        number2 = scan.nextDouble();
        if (OperatorSymbol == '+') {
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        } else if (OperatorSymbol == '-') {
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        } else if (OperatorSymbol == '*') {
            System.out.println(number1 + " x " + number2 + " = " + number1 * number2);
        } else if (OperatorSymbol == '/') {
            System.out.println(number1 + " / " + number2 + " = " + number1 / number2);
        } else if (OperatorSymbol == '%') {
            System.out.println(number1 + " % " + number2 + " = " + number1 % number2);
        } else System.out.println("user inputs unsupported operations");
    }
}



 /*
 Checking valid integer using Integer. parseInt() method.
 Checking valid integer using Scanner. hasNextInt() method.
Checking valid integer using Character. isDigit() method.
                */