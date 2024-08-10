/*  Initlize integer array of any size containg values 0 and 1 only.
Now check which is longest series of either 0 or 1 ,which is existing.
I.e. if array values are
{1,1,1,0,0,1,1,0,0,0,0,0,1,1,1}
Ans is 0 and length is 5
If there is same series of 0 and 1 then ans will which is existing first
I.e. if array values are
{1,1,1,0,0,1,1,0,0,0,1,1,1}
Ans is 1 and length is 3
As 1,1,1 comming first before 0,0 0 */

 import java.util.*;
  public class Question25
  {
     public static void main(String[]sd) 
{ 
    int n=0; 
    Scanner sc=new Scanner(System.in); 
        System.out.println("enter the size of array"); 
            n=sc.nextInt(); 
                int[] a=new int[n]; 
    System.out.println("enter the elements of array a"); 
    for(int i=0;i<n;i++)  
           a[i]=sc.nextInt(); 
 int[] b =new int[n];
   for (int i=0;i<n;i++) 
{ 
    b[i]=1; 
} 
    for(int i=0;i<a.length-1;i++) 
    { 
        for (int j=i+1;j<a.length;j++) 
        {  
                       if (a[j] != -1||a[i]!=-1)
                        {   
                          if (a[i] == a[j]) 
                          { 
                        b[j]=-1; 
                       ++b[i]; 
                }  
               else  
                 break; 
            } 
 
        } 
    } 
 
    int max=0,m=0;
         for(int i=0;i<b.length;i++) 
        if(b[i]!=-1) 
        { 
            if(b[i]>max) 
            { 
                max=b[i]; 
                m=i; 
            } 
        } 
    System.out.println("ans is  "+ a[m] +" which repeats :: "+max+" times"); 
}
 }  

