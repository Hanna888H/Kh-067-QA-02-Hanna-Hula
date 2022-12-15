
import java.util.Scanner;

public class Task3Array {
    public static void main(String[] args) {
        System.out.println("Please enter three words and seperate them with coma(ex.apple,tree,peach)");
        Scanner scanner = new Scanner(System.in);
        String InputWords = scanner.next();
        String[] arrayenterred = InputWords.split(",");
        int ChosenNumber;// без этого не работает do-while!
      do {
            System.out.println(
                    "1 - maximum length \n" +
                            "2 - start with\n" +
                            "3 - end with\n" +

                            "4 - contains\n" +
                            "0 - exit\n");
             ChosenNumber = scanner.nextInt();
            switch (ChosenNumber) {
                case (1):
                    System.out.println("maximum length?");
                    int MaxLength = scanner.nextInt();
                    for (int i = 0; i < arrayenterred.length; i++) {
                        if (arrayenterred[i].length() <= MaxLength) {
                            System.out.println(arrayenterred[i]);
                        }
                    }
                    break;
                case (2):
                    System.out.println("first letter?");
                    String FirstLetter = scanner.next();
                    for (int i = 0; i < arrayenterred.length; i++) {
                        if (arrayenterred[i].startsWith(FirstLetter)) {
                            System.out.println(arrayenterred[i]);
                        }
                    }
                    break;
                case (3):
                    System.out.println("last letter?");
                    String LastLetter = scanner.next();
                    for (int i = 0; i < arrayenterred.length; i++) {
                        if (arrayenterred[i].endsWith(LastLetter)) {
                            System.out.println(arrayenterred[i]);
                        }
                    }
                    break;
                case (4):
                    System.out.println("part of the word?");
                    String PartofWord = scanner.next();
                    for (int i = 0; i < arrayenterred.length; i++) {
                        if (arrayenterred[i].contains(PartofWord)) {
                            //            if((Arrays.stream(arrayenterred).anyMatch(PartofWord::equals)));
                            System.out.println(arrayenterred[i]);
                        }
                    }
                    break;
                case (0):
                    System.out.println("Exit. You quited the programm");
                    break;
                default:
                    System.out.println("I don't understand you. Please start all over again. Good-bye");
                    break;

            }

    }while (ChosenNumber != 0) ;
    }

    }


//Anna,Mark,Phoebe