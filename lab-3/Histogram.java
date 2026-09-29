public class Histogram {
    // Intstance variables
    private int lower, upper;
    private int[] hist;

    // Constructor method
    public Histogram(int lowerbound, int upperbound) {

        // Handle upperbound and lowerbound swap if needed
        if (upperbound < lowerbound) {
            lower = upperbound;
            upper = lowerbound;
        } else {
            lower = lowerbound;
            upper = upperbound;
        }

        // figure out array size
        hist = new int[(upper - lower + 1)];
        //System.out.println(hist.length);
    }

    // Add a value to the histogram
    public boolean add(int n) {
        // Check that n is within the bounds

        // If in bounds, get the number (in relation to the lower bound) and add 1
        if (n >= lower && n <= upper) {
            hist[n - lower] ++;
            return true;
        } else { // else return false
            return false;
        }
    }

    public String toString() {
        // Build a string representation of the histogram and return it
        String str = "";

        // Find index through array and load value
        for (int i = 0; i < hist.length; i++) {
            int num = hist[i];

            // For each value in index, add "*"
            for (int j = 0; j < num; j++) {
                str = str + "*";
            }

            // Before moving to next index, add move to new line
            str = str + "\n";
        }

        return str;
    }

    public static void main(String[] args) {
        Histogram h = new Histogram(0, 5);
        h.add(3);
        h.add(2);
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(0);
        h.add(1);
        h.add(5);
        h.add(3);
        System.out.println(h);
    }
}