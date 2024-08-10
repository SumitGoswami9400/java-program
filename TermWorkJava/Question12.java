//12.	WAP to show the Working of multithreading .
//  Make separate program by using Runnable  interface 
//  And by using Thread Class .also use their methods . 


public class Question12  {
    public static void main(String[] args) {
        Thread t=new Thread("Sumit");
        System.out.println(t);
        Thread t2=new Thread();
        t2.setName("Sonu");
        System.out.println(t2.getPriority());
        System.out.println(t2.getName());
        System.out.println(t2.getClass());
        // D d=new D();
        // d.start();

    }

}
// public class D extends Thread
// {
// public void run()
// {
// for(int i=0;i<10;i++)
// {
   
//     System.out.println("B"+i);
// }
// }
// }

