public class Question_6 {
    public static void main(String[] args) {
        System.out.println("Please enter your first name and last name, separated by a space.");
        String fullName = TextIO.getln();

        int startLN = fullName.indexOf(" ") + 1;

        String firstName = (fullName.substring(0, startLN)).trim();
        int num1 = firstName.length();
        System.out.println("Your first name is " + firstName + ", which has " + num1 + " characters.");

        int nameLength = fullName.length();
        String lastName = (fullName.substring(startLN, nameLength)).trim();
        int num2 = lastName.length();

        char secInit = lastName.charAt(0);
        char firstInit = firstName.charAt(0);
        System.out.println("Your last name is " + lastName + ", which has " + num2 + " characters.\n" +
                "Your initials are " + firstInit + secInit);


    }
}
