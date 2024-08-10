/* WAP in Java to initialize a string in order to find that character
 which frequency is 2nd most in that string. */

        import java.util.Scanner; 
         public class Question2
     { 
        public static void main(String[] args)
         { 
        String s=""; 
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the string"); 
        s=sc.next();
                 int l=s.length();
                int ar[]=new int[l];
         for(int i=0;i< ar.length;i++) 
            ar[i]=1;
                     for(int i=0;i<l;i++) 
        { 
            for(int j=i+1;j<l;j++) 
            { 
                if(ar[j]!=-1) 
                {
                if (s.charAt(i) == (s.charAt(j))) 
           { 
                        ar[j]=-1; 
                        ++ar[i]; 
 
                    } 
                } 
            } 
        } 
        int max=0,smax=0,n=0; 
        for(int i=0;i<ar.length;i++)
         for(int j=i+1;j<ar.length-1;j++) 
        { 
            if(ar[j]!=-1) 
            { 
         if(ar[i]>=ar[j]) 
                { 
                max = ar[i]; 
                   if(ar[j]<=max&&ar[j]>=smax) 
                   {                        n=j; 
                       smax=ar[j]; 
                   } 
                } 
            } 
        } 
        System.out.println("the letter with second highest frequency is  "+s.charAt(n)+" and no.of times its came is "+ar[n]); 
    } 
} 
