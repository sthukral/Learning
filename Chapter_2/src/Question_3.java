public class Question_3 {

    public static void main(String[] args) {
        String getName;
        System.out.println("What's your name?");
        getName = TextIO.getWord();
        String name = getName.toUpperCase();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
