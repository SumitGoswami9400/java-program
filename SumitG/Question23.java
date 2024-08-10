//  Enter a no and than create array of its digits.
// I.e
// If no is 123456 than 
// Store it's digit in int array of size 6 as 
// If array is a than a[0] should 1 and a[1] should 2......
// Also after storing in array a then reverse it's all value without using another array i.e 
// After reversing a[0] should 6 and a[1] should 5 ......
// print common elemnts of both array.

import java.util.Scanner; public class Question23 
{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number:");
                 String s = sc.next(); 
                         int c = s.length();
                                  int[] a = new int[c]; 
        // Convert the input string to an array of integers 
        for (int i = 0; i < c; i++) { 
            a[i] = Character.getNumericValue(s.charAt(i)); 
        } 
        // Print the original array 
        System.out.print("Original Array: "); 
        for (int i = 0; i < c; i++) { 
            System.out.print(a[i] + " "); 
        } 
        // Reverse the array 
                int temp; 
                        for (int i = 0; i < c / 2; i++) 
                        {
                temp = a[i]; 
            a[i] = a[c - 1 - i]; 
a[c - 1 - i] = temp; 
        } 
        // Print the reversed array 
        System.out.print("\nReversed Array: "); 
        for (int i = 0; i < c; i++) { 
            System.out.print(a[i] + " "); 
        } 
        System.out.print("\nCommon Elements: "); 
        for (int i = 0; i < c; i++) 
        {
                         if (a[i] == a[c - 1 - i]) 
         { 
                System.out.print(a[i] + " "); 
            } 
        } 
    } 
}  
