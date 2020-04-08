import java.util.Scanner;

public class Question_7 {

    public static void main(String[] args) {
        //Read information in the file testdata.txt
        TextIO.readFile("testdata.txt");
        String studentName = TextIO.getln();
        int score_1 = TextIO.getInt();
        int score_2 = TextIO.getInt();
        int score_3 = TextIO.getInt();
        System.out.println(score_1);
        //Display a message that contains name, and average
    }
}
