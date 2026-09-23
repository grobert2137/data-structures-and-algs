public class Factorial {

    // Iterative method
    public static int factorialIterative(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // Recursive method
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    // Tail Recursion
    public static int factorialTailRecursive(int n) {
        return factorialHelper(n, 1);
    }

    private static int factorialHelper (int n, int product) {
         if (n == 0 || n == 1) {
            return product;
        } else {
            return factorialHelper(n - 1, product * n);
        }
    }

    public static void main(String[] args){
        System.out.println("ITERATIVE TESTS");
        System.out.println("Iterative Factorial of 3 = " + factorialIterative(3) + " (expecting 6)");
        System.out.println("Iterative Factorial of 5 = " + factorialIterative(5) + " (expecting 120)");
        System.out.println("Iterative Factorial of 8 = " + factorialIterative(8) + " (expecting 40320)");
        
        System.out.println("\nRECURSIVE TESTS");
        System.out.println("Recursive Factorial of 3 = " + factorialRecursive(3) + " (expecting 6)");
        System.out.println("Recursive Factorial of 5 = " + factorialRecursive(5) + " (expecting 120)");
        System.out.println("Recursive Factorial of 8 = " + factorialRecursive(8) + " (expecting 40320)");

        System.out.println("\nTAIL RECURSIVE TESTS");
        System.out.println("Tail Recursive Factorial of 3 = " + factorialTailRecursive(3) + " (expecting 6)");
        System.out.println("Tail Recursive Factorial of 5 = " + factorialTailRecursive(5) + " (expecting 120)");
        System.out.println("Tail Recursive Factorial of 8 = " + factorialTailRecursive(8) + " (expecting 40320)");
    }
}
