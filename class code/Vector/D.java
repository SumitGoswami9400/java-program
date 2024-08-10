
    import java.util.*;

public class D {
    public static void main(String[] args) {
       Vector v=new Vector(11,4);
       v.add(1);
       v.add(1.2);
       Object o=v.elementAt(0);
       int k=(Integer)o;
       System.out.println(k+200);
}
}
