import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */


public class Programme_10_ArmstrongNumber {
    public static void armnum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int originalNumber = number;

        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        if(sum == originalNumber){
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        input.close();
    }

    public static void main(String[] args) {
        armnum();
    }
}

