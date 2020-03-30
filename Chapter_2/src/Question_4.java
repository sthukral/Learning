public class Question_4 {
    public static void main(String[] args) {
        //number of quarters, dimes, nickels, pennies
        double quarters, dimes, nickels, pennies;
        System.out.println("Let's count your change! \n" +
                "How many quarters do you have?");
        quarters = TextIO.getInt() * 25;
        System.out.println("How many dimes do you have?");
        dimes = TextIO.getInt() * 10;
        System.out.println("How many nickels do you have?");
        nickels = TextIO.getInt() * 5;
        System.out.println("How many pennies do you have?");
        pennies = TextIO.getInt();

        double sum = (quarters + dimes + nickels + pennies) / 100;
        System.out.println("You have $" + sum);
    }
}
