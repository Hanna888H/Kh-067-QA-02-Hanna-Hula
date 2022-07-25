
    import java.util.Scanner;

    public class Task2calculatorIF {
        public static void main(String[] args) {
            String ProgramName = "Calculator";
            System.out.println(ProgramName);
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

