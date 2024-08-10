
public class Myrunnable implements Runnable{
    public void run()
{
for(int i=0;i<10;i--)
{
    System.out.println(" "+i);
}
}
}

class Main {
public static void main(String[] args) {
    Myrunnable mr=new Myrunnable();
    Thread t=new Thread(mr);
    t.start();
for(int i=0;i<10;i++)
{
    System.out.println("MainThread: " +i );
}
}
}