//Question 24

import java.util.Scanner;

public class AddElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] resultArr = addElements(arr1, arr2);

        System.out.println("The result array is: ");
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i] + " ");
        }
    }

    public static int[] addElements(int[] arr1, int[] arr2) {
        int[] resultArr;
        if (arr1.length >= arr2.length) {
            resultArr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                resultArr[i] = arr1[i];
            }
        } else {
            resultArr = new int[arr2.length];
            for (int i = 0; i < arr2.length; i++) {
                resultArr[i] = arr2[i];
            }
        }
        return resultArr;
    }
}