/* 6.	WAP to create a method check which returns two values.If first string having a character twice as well second string also then return both the string by removing that character? */


import java.util.Scanner; 
public class Question6
{
public static void main(String args[])
{
  
        Scanner sc=new Scanner(System.in); 
        String s1=""; 
        String s2=""; 
        System.out.println("enter the value of first string ");       
        s1=sc.next(); 
        System.out.println("enter the value of second string "); 
        s2=sc.next(); 
        System.out.println("enter the character that is needed to be checked"); 
        String m=sc.next(); 
        String s3[]=check(s1,s2,m); 
        System.out.println(s3[0]+" "+s3[1]); 
    } 
    static String [] check(String s1,String s2,String m) 
    { 
        String s []=new String[2];     
        int q=0,n=0;     
        for(int i=0;i<s1.length();i++) 
            { 
         if(m.charAt(0)==(s1.charAt(i))) 
                { 
                    ++q; 
                    if(q==2)             
        { 
                s[0]="";           
              for(int j=0;j<s1.length();j++) 
                        { 
                            if(m.charAt(0)!=(s1.charAt(j))) 
                            { 
                                s[0]=s[0]+s1.charAt(j); 
                            } 
                        } 
                    } 
                } 
                else if(q!=2)     
                s[0]=s1; 
            }
        
        for(int i=0;i<s2.length();i++) 
        { 
            if(m.charAt(0)==(s2.charAt(i))) 
            { 
                ++n;        
         if(n==2)           
      {
       s[1]="";              
       for(int j=0;j<s2.length();j++) 
                    { 
                        if(m.charAt(0)!=(s2.charAt(j))) 
                        { 
                            s[1]=s[1]+s2.charAt(j); 
                        } 
                    } 
                } 
            } 
        
            else if(n!=2)        
         s[1]=s2; 
        }
        return s; 
        
    } 
}


