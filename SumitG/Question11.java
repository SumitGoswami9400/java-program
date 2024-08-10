 /* 11.	WAP to initialize 2D string array at runtime and to print reverse value of diagonal position only? */

  import java.util.Scanner;
 public class Question11
 {   
  public static void main(String[] args) 
{      
   String [][]a=new String[2][2]; 
        Scanner sc=new Scanner(System.in); 
        for(int i=0;i<2;i++) 
        { 
            for(int j=0;j<2;j++) 
            { 
                a[i][j]=sc.next(); 
            } 
        } 
        reverseValue(a); 
    } 
    static void reverseValue(String[][]x) 
    { 
        for(int i=0;i<2;i++) 
        { 
            for(int j=0;j<2;j++) 
            {                 if(i==j) 
                { 
                    String s=x[i][j].toString(); 
                    StringBuffer st=new StringBuffer(s); 
                    st.reverse(); 
                    System.out.println("The diagonal reverse value of "+x[i][j]+" is:"+st); 
                } 
 
            } 
 
        } 
 
    } 
 
} 
