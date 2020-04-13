import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Question_7_2 {

    public static void main(String[] args) {
        try {
            //Create an object including the file imported
            File testData = new File("src/testdata.txt");
            //Create a reader for the file
            Scanner reader = new Scanner(testData);
            //do a while loop to read the file while there is a next line in the file
            while (reader.hasNextLine()) {
                String name = reader.nextLine();
                int exam1 = reader.nextInt();
                int exam2 = reader.nextInt();
                int exam3 = reader.nextInt();
                int average = (exam1 + exam2 + exam3) / 3;
                System.out.println("The student name is " + name + ". And the average score is " + average);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
