
import java.util.Scanner;

public class three_n_1_problem {
    public three_n_1_problem() {
    }

    public static void main(String[] args) {
        System.out.println("Enter a positive number: ");
        Scanner reader = new Scanner(System.in);
        int N = reader.nextInt();

        int count;
        for (count = 0; N < 0; N = reader.nextInt()) {
            System.out.println("That's not a positive number. Please enter a positive number: ");
        }

        while (N != 1) {
            System.out.print(N + ", ");
            ++count;
            if (N % 2 == 0) {
                N /= 2;
            } else {
                N = N * 3 + 1;
            }
        }

        System.out.println("There are " + count + " terms in the sequence.");
    }
}

