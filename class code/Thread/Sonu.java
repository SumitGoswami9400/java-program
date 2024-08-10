public class Sonu {
    public static void main(String[] args) {
        
    
   R r=new R();
Thread t=new Thread(r);
t.start();
}
}

class R implements Runnable
{
    public void run()
    {
    for(int i=0;i<10;i++)
    {
System.out.println(""+i);
}
try{
    Thread.sleep(500);
}
catch(Exception e)
{
System.out.println(e);
}
}

}
