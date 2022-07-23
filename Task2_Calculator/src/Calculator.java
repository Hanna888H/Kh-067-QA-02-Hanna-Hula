import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String programm_name = "Calculator";
        System.out.println(programm_name);
        double number2 = 0.00; //Warning:(7, 26) Variable 'number2' initializer '0.00' is redundant
        //       double number1 = 0.00;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        double number1 = scan.nextDouble();
        //       if(number1.hasNextInt||number1.hasNextDouble()){// double cannot be dereferenced is
        // the error some Java compilers give when you try to call a method on a primitive
        //       } else {
        //         System.out.println ("user inputs not an integer");
        //     }
        System.out.println("Enter the operator_symbol(+,-,*,/,%)");
        char operator_symbol = scan.next().charAt(0);
        System.out.println("Enter the 2nd number");
        number2 = scan.nextDouble();
        if (operator_symbol == '+') {
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        } else if (operator_symbol == '-') {
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        } else if (operator_symbol == '*') {
            System.out.println(number1 + " x " + number2 + " = " + number1 * number2);
        } else if (operator_symbol == '/') {
            System.out.println(number1 + " / " + number2 + " = " + number1 / number2);
        } else if (operator_symbol == '%') {
            System.out.println(number1 + " % " + number2 + " = " + number1 % number2);
        } else System.out.println("user inputs unsupported operations");
    }

}



