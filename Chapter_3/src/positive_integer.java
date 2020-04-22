import java.util.Scanner;

public class positive_integer {
    public static void main(String[] args) {
        //Find the average
        Scanner reader = new Scanner(System.in);

        System.out.println("This program will allow you to calculate the average of a set of positive integers.");
        System.out.println("Please enter a positive integer. The program will end when you enter a zero value.");
        int input = reader.nextInt();
        while (input < 0) {
            System.out.println("The number is negative. Please enter a positive number, or zero to end the program.");
            input = reader.nextInt();
        }

        int sum = 0;
        int count = 0;
        while (input != 0) {

            sum += input;
            count++;
            System.out.println("The sum is " + sum + " . The count is " + count);
            System.out.println("Enter the next positive integer, or 0 to end the program.");
            input = reader.nextInt();
            while (input < 0) {
                System.out.println("The number is negative. Please enter a positive number, or zero to end the program.");
                input = reader.nextInt();
            }

        }
        double average = (double) sum / count;
        System.out.println("The average is " + average);
        System.out.println("End.");

    }
    //Finding the average of a set of positive integers entered by the user

}
