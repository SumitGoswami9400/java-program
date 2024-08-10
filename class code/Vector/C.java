import java.util.*;

public class C {
    public static void main(String[] args) {
       Vector v=new Vector(11,4);
       v.add(1);
       v.add(1.2);
   v.add("san");
   v.add('c');
   for(int i=0;i<v.size();i++)
   {
System.out.println(v.elementAt(i)); 
Iterator ia=v.iterator();
while (ia.hasNext())
 {
  System.out.println(ia.next());  
}    
   }    
}
}
