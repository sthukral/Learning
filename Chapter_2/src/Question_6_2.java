public class Question_6_2 {
    public static void main(String[] args) {
        System.out.println("Please enter your first name and last name, separated by a space.");
        String fullName = TextIO.getln();
        int space = fullName.indexOf(" ");
        String firstName = fullName.substring(0, space);
        String lastName = fullName.substring(space + 1);

        System.out.println("Your first name is " + firstName + ", which has " + firstName.length() + " characters.");
        System.out.println("Your last name is " + lastName + ", which has " + lastName.length() + " characters.");
        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
    }
}
