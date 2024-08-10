import java.util.Scanner;

public class WifiPasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Gender (M/F): ");
        char gender = scanner.next().charAt(0);

        // Check constraints
        if (name.length() < 3 || city.length() < 3) {
            System.out.println("Name and City should have a minimum length of 3 characters.");
        } else if (age == 18) {
            System.out.println("Age cannot be 18.");
        } else {
            // Generate password based on conditions
            String password;
            if (gender == 'F') {
                if (age < 18) {
                    password = name.substring(0, 3) + sumOfDigits(age) + city.substring(city.length() - 3);
                } else {
                    password = name.substring(name.length() - 3) + Math.abs(differenceOfDigits(age)) + city.substring(0, 3);
                }
            } else {
                password = generatePassword(name, city) + age;
            }

            // Output
            System.out.println("Generated Password: " + password);
        }
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private static int differenceOfDigits(int num) {
        int firstDigit = num % 10;
        int secondDigit = (num / 10) % 10;
        return firstDigit - secondDigit;
    }

    private static String generatePassword(String name, String city) {
        StringBuilder password = new StringBuilder();
        int maxLength = Math.max(name.length(), city.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < name.length()) {
                password.append(name.charAt(i));
            }
            if (i < city.length()) {
                password.append(city.charAt(i));
            }
        }

        return password.toString();
    }
}