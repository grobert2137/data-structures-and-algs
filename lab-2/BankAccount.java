import java.util.Scanner;

public class BankAccount {
    // Constructor
    public BankAccount (String initName, String initPass, double initBal) {
        name = initName;
        password = initPass;
        balance = initBal;
    }
    
    // Attributes (typically make these private)
    private String name;
    private String password;
    private double balance;

    // SETTERS & GETTERS
    // Setter for the password instance variable
    public boolean setPass(String oldPassword, String newPassword) {
        if (password.equals(oldPassword)) {
            password = newPassword;
            return true;
        } else {
            return false;
        }
    }

    // Getter for the balance instance variable
    public double getBal(String enteredPassword) {
        if (password.equals(enteredPassword)) {
            return balance;
        } else {
            return -1;
        }
    }

    // CUSTOM METHODS
    // Method to withdraw from bank account
    public void withdraw(String enteredPassword, double amount) {
        //Only withdraw if password is correct and sufficient funds
        if (password.equals(enteredPassword) && balance >= amount) {
            balance = balance - amount;
        }
    }

    // Method to deposit into a BankAccount
    public void deposit(String enteredPassword, double amount) {
        // Must have correct password
        if (password.equals(enteredPassword)) {
            balance = balance + amount;
        }
    }

    // Method to transfer money
    public void transfer (BankAccount other, String enteredPassword, double amount) {
        // check that enteredPassword matches
        if (password.equals(enteredPassword)) {
            // Use scanner class to get password for otherAcc
            Scanner s = new Scanner(System.in);
            System.out.print("Enter other account password: ");
            String otherEnteredPassword = s.nextLine();

            // if other password is correct
            if (other.password.equals(otherEnteredPassword)) {
                withdraw(enteredPassword, amount);
                other.deposit(otherEnteredPassword, amount);
                System.out.println(name + "balance: " + getBal(enteredPassword));
                System.out.println(other.name + "balance: " + other.getBal(otherEnteredPassword));

            } else {
                System.out.println("TRANSFER TERMINATED - INCORRECT PASSWORD");
                System.out.println(name + " balance: " + getBal(enteredPassword));
                System.out.println(other.name + " balance: " + other.getBal(otherEnteredPassword));
            }
        }
    }

    public static void main(String[] args) {

        // Create accounts
        BankAccount myAcc = new BankAccount("Grant ", "UserPass", 300);
        BankAccount otherAcc = new BankAccount("Bob ", "OtherGuy82", 800000);


        Scanner s = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String input = s.nextLine();
        System.out.println("Your account's balance is " + myAcc.getBal(input));

        myAcc.transfer(otherAcc, input, 80);  //recursive call?

        // Set password for myAcc
        //myAcc.password = "UserPass";
        
        // Deposit into your account
        //myAcc.deposit("UserPass", 100.5);

        // Make a second account
        
        // Print out account balance
        
        // 1. Instantiate Scanner
        //Scanner s = new Scanner(System.in);
        // print a prompt to the user 
        //System.out.println("Type something, then hit enter!");
        // 2. Read user input 
        //String input = s.nextLine(); // finds the newline character "\n" (aka when you hit Enter)
        // Print the input 
        //System.out.println("This was your input: " + input);
    }
}
