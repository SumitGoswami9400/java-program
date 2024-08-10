// Wap to initlize two integer array of user enterd size .Then perform following operations
// 1.add elements in that array which  is longest .
// I.e. if first array is of 3 size having elements 1,2,3
// Second array is of size five and elements are 4,5,6,7,8
// Than result array will second and now it's elements will 5,7,9,7,8


 import java.util.*; public class Question24 
 { 
    public static void main(String ss[]) 
{ 
    int n=0,m=0; 
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter the size of array 1");
         n=sc.nextInt(); 
    System.out.println("enter the value of array 2"); 
        m=sc.nextInt(); 
            int a[]=new int[n];
         int b[]=new int[m]; 
    System.out.println("enter the elements of array 1"); 
    for(int i=0;i<n;i++) 
    { 
        a[i]=sc.nextInt(); 
    } 
    System.out.println("enter the elements of array 2"); 
        for(int i=0;i<m;i++) 
    { 
        b[i]=sc.nextInt(); 
    } 
    if(a.length>=b.length) 
    { 
        for(int i=0;i<b.length;i++) 
            a[i]=a[i]+b[i]; 
        for(int j=0;j<a.length;j++) 
            System.out.print(a[j]+" "); 
    } 
    else if(a.length<b.length)
         {
            for(int i=0;i<a.length;i++) 
            b[i]=b[i]+a[i]; 
    for(int j=0;j<b.length;j++) 
        System.out.print(b[j]+" ");
    } 
} 
} 
