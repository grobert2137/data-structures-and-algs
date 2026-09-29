// CSCI 1933 Lab 03
import java.util.Scanner;

public class HistogramApp {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an int lowerbound: ");
        int lowerbound = s.nextInt();


        System.out.println("Enter an int upperbound: ");
        int upperbound = s.nextInt();

        // Create histogram
        Histogram h = new Histogram(lowerbound, upperbound);

        while (true) {
            System.out.println("Choose an option: ");
            String request = s.next().toLowerCase();

            switch (request) {
                case "add":
                    System.out.println("Enter a number to add");
                    int n = s.nextInt();
                    h.add(n);
                    continue;
                case "print":
                    System.out.println(h);
                    continue;
                case "leave":
                    System.out.println("Goodbye! Have a nice day!");
                    System.exit(0);
            }
        }
    }
}