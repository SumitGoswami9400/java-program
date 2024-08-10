 /* 12. WAP to show the Working of multithreading . Make separate program by using Runnable  interface And by using Thread Class .also use their methods. */


 class MyRunnable implements Runnable 
 { 
    public void run() 
   { 
        for (int i = 1; i <= 5; i++) { 
            System.out.println("Thread using Runnable: " + i); 
            try
          { 
                Thread.sleep(500); 
          // Simulate some work being done 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
} 
public class Question12 
{ 
    public static void main(String[] args)  
    { 
        MyRunnable myRunnable = new MyRunnable(); 
        // Creating two threads using the same instance of 
        
 
        Thread t1 = new Thread(myRunnable);     
     
        // Starting the thread thread1.start();  
          t1.start(); 
          } 
 } 
