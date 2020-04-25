import java.util.Scanner;

public class try_catch {
    /*find a sequence of real numbers entered by the user
    - the user to signal the end of the sequence by a blank line
    PLAN:
    - get user input (make a reader)
    - Prompt to enter values
    - take every input and add it to sum
    - make a counter to count the number of terms
    - when there's a blank line, then display the average, display count and display sum
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter values you would like to average. Input a space to end the program.");
        int count = 0;
        double sum = 0;
        double number;
        double average;
        String input;

        while (true) {
            System.out.println("Insert value: ");
            input = reader.nextLine();
            if (input.isBlank()) break;
            try {
                number = Double.parseDouble(input);
                sum = sum + number;
                count++;
            } catch (NumberFormatException e) {
                System.out.print("Not a legal number!");
            }
        }
        average = sum / count;
        System.out.println("The average is: " + average);
    }

}
