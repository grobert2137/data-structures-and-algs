// CSCI 1933 Lab 03
import java.util.Scanner;

public class Fib {
    
    // Returns the n'th Fibonacci number using recursion
    public static int fibonacciRecursive(int n) {
        // 1. What should your base case(s) be?
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else if (n < 0) {
            return fibonacciRecursive(n+2) - fibonacciRecursive(n+1);
        }
        else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
    }
    
    // Returns the n'th Fibonacci number using iteration
    public static int fibonacciIterative(int n) {
        int numPrev = 1;
        int numPrevPrev = 0;
        int fib = 0;

        for (int j = 1; j < n; j++) {
            fib = numPrev + numPrevPrev;
            numPrevPrev = numPrev;
            numPrev = fib;
        }

        return fib;
    }

    public static void main(String[] args) {
       // Instantiate Scanner
        Scanner s = new Scanner(System.in);
        // Prompt user
        System.out.println("Enter an int n to get the nth Fibonacci number: ");
        // Gets integer from the command line
        int n = s.nextInt();
        // Print the results
        System.out.println("The " + n + "'th Fibonacci number using fibonacciRecursive is " + fibonacciRecursive(n));
        System.out.println("The " + n + "'th Fibonacci number using fibonacciIterative is " + fibonacciIterative(n));
    }
}
