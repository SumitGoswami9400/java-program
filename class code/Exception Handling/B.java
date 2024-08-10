import java.io.*;

import javax.sound.sampled.SourceDataLine;
public class B {
    public static void main(String[] args) {
        System.out.println("Starting");
        C c=new C();
            c.show(0);
        System.out.println("Ending");
    }
}
    class C{
        void show(int x){
try{
   int i=5/x;
}catch(Exception e){
    e.printStackTrace();
}
    }
}
