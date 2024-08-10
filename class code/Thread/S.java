public class S {
    public static void main(String[] args) {
      M m=new M();
      N n=new N();
      n.start();
      m.start();
    //   n.run();
    //   m.run();  
    }
}

class M extends Thread{
   
public void run()
{
    for(int i=0;i<10;i++)
    {
System.out.println(""+2*i);
    }
    try{
        sleep(500);
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
}

class N extends Thread{
public void run()
{
for(int j=0;j<10;j++)
{
System.out.println(""+3*j);
}
try{
    sleep(500);
}catch(Exception e)
{
    e.printStackTrace();
}
}
}
