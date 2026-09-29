// CSCI 1933 Lab 03
import java.util.Scanner;

public class MaxDigit {

	// Returns maximum digit in an integer using iteration
    public static int iterativeMaxDigit(int n) {
        int currentMax = 0;

        // Exclude negative number inputs
        if (n < 0) {
            System.out.println("NEGATIVE NUMBERS NOT ALLOWED");
        } 
        
        // While loop used since we don't know how many time we need to iterate
        while (n > 0) { // greater than 0 because it will end when we have a single didget non divisible by 10
            int quotient = n / 10;
            int remainder = n % 10;
                if (remainder > currentMax) {
                    currentMax = remainder;
                }
            n = quotient;
        }
        return currentMax;
    }
	
	// Returns maximum digit in an integer using recursion
    public static int recursiveMaxDigit(int n) {
        if (n < 10) { // because a single digit local max is itself
            return n;
        }
        int prev = n % 10;
        return Math.max(prev, recursiveMaxDigit(n / 10));
    }

    public static void main(String[] args) {
        // Instantiate Scanner
        Scanner s = new Scanner(System.in);
        // Prompt user
        System.out.println("Enter an int n: ");
        // Gets integer from the command line
        int n = s.nextInt();
        // Print the results
        System.out.println("The largest digit using iterativeMaxDigit is " + iterativeMaxDigit(n));
        System.out.println("The largest digit using recursiveMaxDigit is " + recursiveMaxDigit(n));
    }
}