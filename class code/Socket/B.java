import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.*;
public class B {
 public static void main(String[] args)throws Exception {
    Socket s=new Socket("localhost",1500);

    OutputStream os=s.getOutputStream();
    DataOutputStream dos=new DataOutputStream(os);
    System.out.println("you can send nemeric value then server send its factorial no:");
    Scanner sc=new Scanner(System.in);
    dos.writeUTF(sc.nextLine());

    InputStream is=s.getInputStream();
    DataInputStream dis=new DataInputStream(is);
    String l=dis.readUTF();
    System.out.println(l);
        
   
 }  
}
