import java.util.Scanner;

public class counting_divisors {
    public static void main(String[] args) {
        //create a reader
        Scanner reader = new Scanner(System.in);
        System.out.println("Please input a positive integer:");
        //read and store in N
        int N = reader.nextInt();
        //verify if positive integer
        while (N < 0) {
            System.out.println("That is not a positive integer. Please input a positive integer:");
            N = reader.nextInt();
        }
        //compute the number of divisors.
        /*
                1. N%D=0
                go through each divisor, and check if it's 0
                divisors go from 1 to N
                then if it is zero, then add one to the count
         */
        int divisorCount = 0;
        int testDivisor = 1;
        for (testDivisor = 1; testDivisor <= N; testDivisor++) {
            if (N % testDivisor == 0) {
                divisorCount++;
                System.out.print(testDivisor + ", ");
            }
        }

        System.out.println("\nThere are " + divisorCount + " divisors of " + N);

    }
}
