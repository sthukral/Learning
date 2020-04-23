import java.util.Scanner;

public class alphabet_hunt {
    public static void main(String[] args) {
        /*
        find out which of the 26 letters of the alphabet occur in a given string
        list all letters and count the number of different letters
        the string will be input by the user
         */

        //create a reader
        Scanner reader = new Scanner(System.in);

        //Ask the user to input a string
        System.out.println("Please enter a string to be analyzed:");
        String str = reader.nextLine();

        //go through each letter

        str = str.toUpperCase();

        char letter;
        int count = 0;

        // go through each letter
        for (letter = 'A'; letter <= 'Z'; letter++) {
            //check for each letter at each position of the string
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == letter) {
                    System.out.print(letter);
                    System.out.print(' ');
                    count++;
                    break;
                }
            }
        }
        System.out.print("there were " + count + " different letters.");
    }
}
