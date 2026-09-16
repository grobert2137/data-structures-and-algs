
public class Program {
    public static int countdown(int j) {
        int sum = 0;

        for (int i = j; i > 0; i--) {
            sum = sum + i; // "sum =+" didn't work for some reason
            System.out.println(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        int returnedSum = countdown(7);
        System.out.println("Return Value: " + returnedSum);
    }
    
}

// Here's an initial mistake I made. "return sum" doesn't work 
// because "sum" is not in scope. 
// I need to declare it outside the "for" loop, and pull it in to modify it.
// ALSO you need to give sum and initial value or Java will throw an error. 

// public static int countdown(int j) {
//        for (int i = j; i > 0; i--) {
//            int sum =+ i;
//            System.out.println(i);
//        }
//
//        return sum;
//    }
