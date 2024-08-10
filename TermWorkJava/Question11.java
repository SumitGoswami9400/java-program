// 11.	WAP to initialize 2D string array at runtime
//  and to print reverse value of diagonal position only?


import java.util.*;
public class Question11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no.of row: ");
        String s1=sc.nextLine();

        System.out.println("Enter the no. of column: ");
    String s2=sc.nextLine();


   int m=Integer.valueOf(s1);
   int n=Integer.valueOf(s2);
String[][] matrix=new String[m][n];;

      for(int i=0;i<s1.length();i++)
      {
        for(int j=0;j<s2.length();j++)
        {
System.out.println("Enter element of("+ i +")("+ j +"):");
matrix[i][j]=sc.nextLine();
        }
      }
      for(int i=0;i<s1.length();i++)
      {
        for(int j=0;j<s2.length();j++)
        {
            System.out.print(new StringBuilder(matrix[i][j]).reverse() + " ");
        }
    } 
    }
}
















// import java.util.*;
// public class Question11 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get the dimensions of the 2D array
//         System.out.print("Enter the number of rows: ");
//         int rows = Integer.parseInt(scanner.nextLine());
//         System.out.print("Enter the number of columns: ");
//         int columns = Integer.parseInt(scanner.nextLine());

//         // Initialize the 2D array
//         String[][] arr = new String[rows][columns];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 System.out.printf("Enter the element at (%d, %d): ", i, j);
//                 arr[i][j] = scanner.nextLine();
//             }
//         }

//         // Print the reverse value of diagonal positions
//         for (int i = 0; i < Math.min(rows, columns); i++) {
//             System.out.print(new StringBuilder(arr[i][i]).reverse() + " ");
//         }

//         System.out.println();
//     }
// }

