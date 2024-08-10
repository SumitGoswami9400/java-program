// 4.	WAP to generate wifi key as user will enter form value Name,City,Age and Gender?
//=>If gender is Male then key will be First 3 Character of Name+Difference of age digit+Last 3 Character 
// of city If gender is Female then key will be last 3 character of
//   Name+sum of age digit+first 3 character of city

import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        String name=""; 
        String city="";
        String gender="";
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        name=sc.next();
        System.out.println("Enter your city ");
        city=sc.next();
        System.out.println("Enter your age ");
age=sc.nextInt();
System.out.println("Enter your gender ");
gender=sc.next();
System.out.println("the key generated is "+paswordGenerator(name,city,age,gender));
}

static String paswordGenerator(String n,String c, int a, String g)
{
String key="";
if(g.equals("M")||g.equals("m"));
{
    for(int i=0;i<3;i++)
    {
        key=key+n.charAt(i);
    }
    String m=Integer.toString(a);
    int i=0;
    int k=(Character.getNumericValue(m.charAt(i))-(Character.getNumericValue(m.charAt(i+1))));
   
    if(k>0)
    {
        key=key+k;
    }
    else if(k<0)
{
    key=key+(-k);
}

    key=key+0;

// if(j=2;j>=0;j--)
// {
// key=key+c.charAt((c.length()-1)-j);
//  }
 
}
  if(g.equals("F")||g.equals("f"))
{
for(int i=2;i>=0;i--)
{
    key=key+n.charAt((n.length()-1)-i);
}
String m=Integer.toString(a);
int i=0;
int k=Character.getNumericValue(m.charAt(i))+Character.getNumericValue(m.charAt(i+1));
key=key+k;

for(int j=0;j<3;j++)
{
    key=key+c.charAt(j);
}
}
return key;

}
}



