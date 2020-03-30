public class Question_5 {
    public static void main(String[] args) {
        // ask how many eggs, then tell how many dozens, and how many leftover
        System.out.println("How many eggs do you have?");
        int eggs = TextIO.getInt();
        int gross = eggs / 144;
        int dozen = (eggs % 144) / 12;
        int remaining = (eggs % 144) % 12;

        System.out.println("You number of eggs is: " + gross + " gross, " + dozen + " dozen, and " + remaining + ".");
    }
}
