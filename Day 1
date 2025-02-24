import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // Read an integer input from the user

        int a = 0;  // First number in Fibonacci series
        int b = 1;  // Second number in Fibonacci series
        int count = 2;  // Counter to track the number of Fibonacci numbers generated

        // Special case for n = 1
//        if (n == 1) {
//            System.out.println(a);
//        } else if (n >= 2) {
//            // Print the first two Fibonacci numbers (0 and 1)
//            System.out.print(a + " " + b + " ");

            // Generate Fibonacci numbers from the 3rd to the nth number
            while (count <=n) {
                int temp = b;  // Store current value of b
                b = b+a;     // Calculate next Fibonacci number
                a = temp;      // Update a to the previous value of b
                count++;      // Increment count
//                System.out.print(b + " ");  // Print the Fibonacci number
            }
        System.out.println(b);
        }

//        System.out.println(b);  // Print a newline after the Fibonacci series
    }
//}
