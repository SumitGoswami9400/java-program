// 3.	WAP to check longest sub sequence of a same character in an
//  initialized string?[aaaabppppp, p=5] [aabbcc, a=2].

import java.util.*;
import java.util.Arrays;
public class Question3 {
    public static void main(String args[]) {
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        s=sc.next();
        int[] ar=new int[s.length()];
        Arrays.fill(ar,1);
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]!=-1||ar[j]!=-1)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        ar[j]=-1;
                        ++ar[i];
                    }
                    else{
                        break;
                    }
                }
            }
        }
                int max=0,n=0;
                for(int i=0;i<ar.length;i++)
                {
if(ar[i]!=-1)
{
    if(ar[i]>max)
    {
        max=ar[i];
        n=i;
    }
}
                }
System.out.println("Longest Sub Sequence of character is "+s.charAt(n)+" which repeats:"+max+"times");
        }
}
