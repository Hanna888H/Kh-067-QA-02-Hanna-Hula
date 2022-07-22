import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String a = sc.nextLine();
        System.out.println("Your name is " + a);
        System.out.println("What is your adress" + "," + a + "?");
        String b = sc.nextLine();
        System.out.println("Your address is " + b + " \n Good-bye, " + a + "!");
    }
}
