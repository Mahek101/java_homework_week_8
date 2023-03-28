/**
 * Display left angle triangle of * using nested for loops
 */

public class Programme_15_LeftAngleTriangle {
    public static void main(String[] args) {
        Programme_15_LeftAngleTriangle obj = new Programme_15_LeftAngleTriangle();
        obj.leftAngleTringle();
    }

    public void leftAngleTringle() {

        int rows = 5;

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
