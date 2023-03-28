/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme_9_FibonacciSequence {
    public static void fibonacci(){
        int n = 8;
        int prev = 1, current = 1;
        System.out.print(prev+ " ");
        System.out.print(current+ " ");
        for (int i = 2; i < n; i++){
            int next = prev + current;
            System.out.print(next + " ");
            prev = current;
            current = next;
        }
    }

    public static void main(String[] args) {
        fibonacci();
    }
}
