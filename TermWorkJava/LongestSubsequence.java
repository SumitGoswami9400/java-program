import java.util.Scanner;

public class LongestSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String nm = sc.nextLine();

        // Check longest subsequence
        String[] ls = findls(nm);

        // Output
        for (String subsequence : ls) {
            System.out.println(subsequence);
        }
    }

    private static String[] findls(String input) {
        char currentChar = '\0';
        int currentCount = 0;
        char longestChar = '\0';
        int longestCount = 0;

        for (char c : input.toCharArray()) {
            if (c == currentChar) {
                currentCount++;
            } else {
                currentChar = c;
                currentCount = 1;
            }

            if (currentCount > longestCount) {
                longestChar = currentChar;
                longestCount = currentCount;
            }
        }

        // Build the longest subsequence
        StringBuilder ls = new StringBuilder();
        for (int i = 0; i < longestCount; i++) {
            ls.append(longestChar);
        }

        return new String[]{ls.toString(), longestChar + "=" + longestCount};
    }
}
