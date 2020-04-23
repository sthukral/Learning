import java.util.Scanner;

public class unit_conversion {

    public static void main(String[] args) {
        /*Read the user's input measurement and units of measure
        express the measurement in inches, feet, yards, and miles
        Display the results
         */

        //create the reader
        Scanner reader = new Scanner(System.in);

        //Get the user's input
        System.out.println("Please enter the unit for conversion in the following format: 2 miles. \n" +
                "The units you may enter are: inches, feet, yards, miles\n" +
                "You may use the abbreviations: in ft yd mi\n" +
                "Enter 0 to end the program.\n" +
                "Input here:");

        double measurement;
        double inches = 0;
        double feet;
        double yards;
        double miles;

        measurement = reader.nextInt();
        String unit;
        while (true) {
            if (measurement == 0) {
                System.out.print("End Program");
                break;
            } else {
                unit = reader.next();
                unit = unit.toLowerCase();
            }
            if (unit.equals("inches") || unit.equals("inch") || unit.equals("in")) {
                inches = measurement;
                break;
            } else if (unit.equals("feet") || unit.equals("ft")) {
                inches = measurement * 12;
                break;
            } else if (unit.equals("yards") || unit.equals("yd")) {
                inches = measurement * 36;
                break;
            } else if (unit.equals("miles") || unit.equals("mi") || unit.equals("mile")) {
                inches = measurement * 12 * 5280;
                break;
            } else {
                System.out.println("Invalid entry. Please use the form: 2 miles\n" +
                        "The allowed values are inches, feet, yards, miles\n" +
                        "You may use the abbreviations: in ft yd mi \n" +
                        "Please enter new value or 0 to end the program:");
                measurement = reader.nextInt();

            }
        }

        feet = inches / 12;
        yards = inches / 36;
        miles = inches / (12 * 5280);

        System.out.println("The unit conversion is as follows: " + inches + " inches, " + feet + " feet, " + yards +
                " yards, " + miles + " miles.");
    }
}
