// for set Class Name & print that name
/* 
public class B  extends Thread{
   
    public void run()
    {
        System.out.println("Ram jane");
        System.out.println(B.currentThread().getName());
    }    
    

    public static void main(String[] args) {
    B b=new B();
b.setName("t1");
    b.start();
   } 
    
} */

// Second method

public class B  extends Thread{
   B(String n)
   {
    super(n);
   }
    public void run()
    {
        System.out.println("Ram jane");
        System.out.println(B.currentThread().getName());
    }    
    

    public static void main(String[] args) {
    B b=new B("t1");
    b.start();
   } 
    
}
