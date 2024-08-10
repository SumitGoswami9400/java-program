import java.util.*;
public class E {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(10);
        v.add(20);
        v.add(4.3);
        v.add(2.5);
        v.add("and");
        int sumInt=0;
        Double sumDouble=0.0;
        Double avg=0.0;
        int count=0;
        for(int i=0;i<v.size();i++)
        {
            Object o=v.elementAt(i);
            if(o instanceof Integer)
            {
            int k=(Integer)o;
            sumInt +=k;
        }
if(o instanceof Double)
{
    Double m=(Double)o;
    sumDouble +=m;
count++;
}
avg=avg+sumDouble/count;

    }
System.out.println("integer of sum value is=" +sumInt);
System.out.println("Sum of double value is=" +sumDouble);
System.out.println("avg of integer value is=" +avg);
}
}
