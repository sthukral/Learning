public class Question_2 {
    public static void main(String[] args) {
        //simulate rolling a pair of dice
        //Math.random works only with double, so we have to cast it as an int
        int dice1 = (int) (Math.random() * 6) + 1;
        //add one for the zero roll, and the max 5 value
        int dice2 = (int) (Math.random() * 6 + 1);
        int sum = dice1 + dice2;
        System.out.print("Your first roll comes up: " + dice1 + "\n" +
                "Your second roll comes up: " + dice2 +
                "\nYour roll total is: " + sum);
    }

}
