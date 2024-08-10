import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondMostFrequentCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the second most frequent character
        char secondMostFrequentChar = findSecondMostFrequentCharacter(inputString);

        // Output
        if (secondMostFrequentChar != '\0') {
            System.out.println("The second most frequent character is: " + secondMostFrequentChar);
        } else {
            System.out.println("No second most frequent character found.");
        }
    }

    private static char findSecondMostFrequentCharacter(String input) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count character frequencies
        for (char c : input.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the second most frequent character
        char firstMaxChar = '\0';
        char secondMaxChar = '\0';
        int firstMaxFreq = 0;
        int secondMaxFreq = 0;

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > firstMaxFreq) {
                secondMaxFreq = firstMaxFreq;
                secondMaxChar = firstMaxChar;
                firstMaxFreq = entry.getValue();
                firstMaxChar = entry.getKey();
            } else if (entry.getValue() > secondMaxFreq && entry.getValue() < firstMaxFreq) {
                secondMaxFreq = entry.getValue();
                secondMaxChar = entry.getKey();
            }
        }

        return secondMaxChar;
    }
}
