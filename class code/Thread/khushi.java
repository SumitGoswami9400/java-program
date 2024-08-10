

 class payal extends Thread{
    public void run()
    {
Mul.table(7);
    }
}
class Sumit extends Thread{
    public void run()
    {
Mul.table(8);
    }
}
class Mul{
    synchronized static void table(int n)
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(""+n*i);
        }
    }
}
public class khushi{
    public static void main(String[] args) {
        payal p=new payal();
        Sumit s=new Sumit();
        p.start();
        s.start();
    }
}

