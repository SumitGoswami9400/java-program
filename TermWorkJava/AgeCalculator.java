import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for birthdate
        System.out.print("Enter your birthdate (DD-MM-YYYY): ");
        String birthdateString = scanner.nextLine();

        // Get the current system date
        Date currentDate = new Date();

        // Parse the user input and current date to Date objects
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date birthdate = dateFormat.parse(birthdateString);

            // Calculate the difference in milliseconds
            long timeDifference = currentDate.getTime() - birthdate.getTime();

            // Convert milliseconds to days
            long daysDifference = timeDifference / (1000 * 60 * 60 * 24);

            System.out.println("Number of days gap in your age: " + daysDifference + " days");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD-MM-YYYY.");
        } finally {
            scanner.close();
        }
    }
}
