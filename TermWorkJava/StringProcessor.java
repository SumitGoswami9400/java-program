import java.util.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    public static void main(String[] args) {
        String inputString = "san12may4tya7yyy678rtb62tp";

        String output1 = removeDigits(inputString);
        System.out.println("Output 1: " + output1);

        int output2 = multiplyDigitsAtSpecificPositions(inputString);
        System.out.println("Output 2: " + output2);

        int output3 = sumDigits(inputString);
        System.out.println("Output 3: " + output3);
    }

    private static String removeDigits(String inputString) {
        return inputString.replaceAll("\\d", "");
    }

    private static int multiplyDigitsAtSpecificPositions(String inputString) {
        Pattern pattern = Pattern.compile("[0-9]{2}");
        Matcher matcher = pattern.matcher(inputString);

        int product = 1;
        while (matcher.find()) {
            String digitPair = matcher.group();
            int firstDigit = Character.getNumericValue(digitPair.charAt(0));
            int secondDigit = Character.getNumericValue(digitPair.charAt(1));

            product *= firstDigit * secondDigit;
        }

        return product;
    }

    private static int sumDigits(String inputString) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(inputString);

        int sum = 0;
        while (matcher.find()) {
            int digit = Character.getNumericValue(matcher.group());
            sum += digit;
        }

        return sum;
    }
}
