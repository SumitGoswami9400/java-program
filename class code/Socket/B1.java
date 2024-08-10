import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.*;
public class B1 {
    public static void main(String[] args)throws Exception {
       ServerSocket ss=new ServerSocket(1500);
       System.out.println("starting");
       Socket s=ss.accept(); 

       InputStream is=s.getInputStream();
       DataInputStream dis=new DataInputStream(is);
       String m=dis.readUTF();
       int i=Integer.parseInt(m);
       System.out.println(i);

       OutputStream os=s.getOutputStream();
       DataOutputStream dos=new DataOutputStream(os);
       dos.writeUTF("Factoial no. of+i" +Integer.toString(fact(i)));
    }
       static int fact(int n){
        if(n == 0){
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    
                 
    }
}
