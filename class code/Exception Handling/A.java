
import java.io.*;
public class A {
    public static void main(String[] args) {
     
        try(C c = new C()){
            c.close();
        }
    }
}
    class C implements Closeable{
        public void close(){
            System.out.println("OK");
        }
    }

