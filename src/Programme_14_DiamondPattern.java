import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 */


public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        Programme_14_DiamondPattern obj = new Programme_14_DiamondPattern();
        obj.diamondPattern();
    }

    public void diamondPattern() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();
        int space = rows - 1;
        int i = 1, j = 1;
        while (j <= rows) {//parent wile loop
            System.out.print("\n");//move to next line
            j = 1;
            while (j <= space) {//while loop for print space
                System.out.print(" ");//print space
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {//while loop for printing star
                System.out.print("*");//print star
                j++;
            }
            i++;
            space--;
        }
        i = rows - 1;
        space = 1;
        while (i >= 1) {//parent while loop
            System.out.print("\n");
            j = 1;
            while (j <= space) {
                System.out.print(" ");//print space
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");//print star
                j++;
            }
            i--;
            space++;
        }
        scan.close();
    }
}
