//Question 25


public class LongestSeries {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1};
        longestSeries(arr);
    }

    public static void longestSeries(int[] arr) {
        int max_length = 0;
        int current_length = 0;
        int current_element = arr[0];
        int longest_element = current_element;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == current_element) {
                current_length++;
            } else {
                if (current_length > max_length) {
                    max_length = current_length;
                    longest_element = current_element;
                }
                current_length = 1;
                current_element = arr[i];
            }
        }

        if (current_length > max_length) {
            max_length = current_length;
            longest_element = current_element;
        }

        System.out.println("The longest series is " + longest_element + " and its length is " + max_length);
    }
}
