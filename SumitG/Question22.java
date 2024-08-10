 /* 22.	WAP for following OUTPUT 
String s="san12may4tya7yyy678rtb62tp"
Output 2 will 4*7=28
Output 1 will sanmytrbp
Output 3 will 12+678+62=690+62 =.... */

  public class Question22 
{
     public static void main(String[] args) 
{ 
        String p = "san12may4tya7yyy678rtb62tp"; 
        int count = 0, mul = 1, sum = 0;
         String f = "";
         for (int i = 0; i < p.length(); i++) 
{ 
            char c = p.charAt(i);
             if (Character.isDigit(c)) 
 {
                 char d = p.charAt(i + 1);
                 char e = p.charAt(i - 1);
                 if (!Character.isDigit(d) && !Character.isDigit(e))
  {
                     mul = mul * Character.getNumericValue(c); 
                } else if (Character.isDigit(d)) 
      { 
 
                    sum = sum + Character.getNumericValue(c) + Character.getNumericValue(d); 
                    char g = p.charAt(i + 2);
                     if (Character.isDigit(g)) 
       { 
                        sum = sum + Character.getNumericValue(g); 
                    } 
                } 
} else if (Character.isLetter(c)) 
    { 
                if (!f.contains("" + p.charAt(i))) 
    {    
                  f = f + p.charAt(i); 
                } 
            } 
        } 
        System.out.println("Output 1 for:4*7" + mul); 
        System.out.println("Output 2 for:" + f); 
        System.out.println("Output 3" + sum); 
    } 
}  

