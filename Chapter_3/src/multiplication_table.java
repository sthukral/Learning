public class multiplication_table {
    public static void main(String[] args) {
        //print out 1 2 3 4
        //          2 4 6 8 ... etc
        int tableNumber;
        int factor;
        for (tableNumber = 1; tableNumber <= 12; tableNumber++) {
            // calculate times table to twelve
            for (factor = 1; factor <= 12; factor++) {
                System.out.printf("%4d", factor * tableNumber);
            }
            System.out.println();
        }

    }
}
