import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 */

public class Programme_3_Alphabet {
    static Scanner input = new Scanner(System.in);

    public static void method() {
        System.out.println("Enter a character: ");
        String a = input.nextLine();

        if (a.length() != 1) {
            System.out.println("Error: Please enter only one character.");
        } else {
            char ch = a.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
            } else {
                System.out.println("Error: Please enter a letter between a and z or A and Z.");
            }

        }
    }

    public static void main(String[] args) {
        method();
        input.close();
    }

}
