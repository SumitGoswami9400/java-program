public class A extends Thread{
public static void main(String[] args) {
    A a=new A();
    a.start();
}


    public void run()
    {
        System.out.println("hello java");
System.out.println(A.currentThread().getName());
    }

}