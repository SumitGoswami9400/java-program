//Question 23

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digitArray = createDigitArray(num);
        System.out.println("Original digit array: " + Arrays.toString(digitArray));

        reverseArray(digitArray);
        System.out.println("Reversed digit array: " + Arrays.toString(digitArray));

        printCommonElements(digitArray, digitArray);
    }

    public static int[] createDigitArray(int num) {
        String numStr = String.valueOf(num);
        int[] digitArray = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digitArray[i] = Character.getNumericValue(numStr.charAt(i));
        }

        return digitArray;
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void printCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> commonElements = new HashSet<>();

        for (int element : arr1) {
            if (Arrays.asList(arr2).contains(element)) {
                commonElements.add(element);
            }
        }

        System.out.println("Common elements: " + commonElements);
    }
}
