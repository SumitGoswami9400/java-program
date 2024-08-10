public class firstProgramThread extends Thread
 {
   public void run()
   {
    for(int i=10;i>0;i--)
    {
       System.out.println(Thread.currentThread().getName());
        try
        {
        Thread.sleep(2000);
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
    }
   } 


public static void main(String args[])
{
firstProgramThread f=new firstProgramThread();
f.setName("Sum");
f.start();

firstProgramThread f3=new firstProgramThread();
f.setName("Abhi");
f.start();
} 
 }