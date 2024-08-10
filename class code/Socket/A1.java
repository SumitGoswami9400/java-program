//Server side

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
// import java.io.*;
// import java.util.*;
public class A1 {
    public static void main(String[] args)throws Exception {
      ServerSocket ss = new ServerSocket(1000); 
       System.out.println("Starting"); 
      Socket s = ss.accept();

      InputStream is = s.getInputStream();
      DataInputStream dis=new DataInputStream(is);
      String m=dis.readUTF();
      System.out.println(m);

      OutputStream os=s.getOutputStream();
      DataOutputStream dos=new DataOutputStream(os);
dos.writeUTF(m.toUpperCase());
dos.close();

     
    }
}
