import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object to read the input from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the number of Fibonacci terms to calculate
            System.out.println("Enter the number of Fibonacci terms to calculate: ");
            int n = scanner.nextInt();

            // Print the Fibonacci series
            System.out.println("Fibonacci series: ");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        } // The Scanner is automatically closed here
    }
 
    // Iterative method to calculate the nth Fibonacci number
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: the 0th Fibonacci number is 0
        } else if (n == 1) {
            return 1; // Base case: the 1st Fibonacci number is 1
        } else {
            long a = 0, b = 1, c;
            for (int i = 2; i <= n; i++) {
                c = a + b; // Calculate the next Fibonacci number
                a = b;     // Move to the next pair of numbers
                b = c;     // Move to the next pair of numbers
            }
            return b; // Return the nth Fibonacci number
        }
    }
}
  /* In the above code, we have used a try-with-resources statement to create a Scanner object. The try-with-resources statement automatically closes the Scanner object when the block of code is exited.
    The fibonacci() method calculates the nth Fibonacci number using an iterative approach.
    Let’s compile and run the program:
    javac Fibonacci.java */