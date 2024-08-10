//Client side

import java.net.*;
import java.io.*;
import java.util.*;


public class A{
    public static void main(String[] args)throws Exception {
       Socket s=new Socket("localhost",1000);

       OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os); 
        System.out.println("you can send value to server and server return this to UpperCase");
        Scanner sc=new Scanner(System.in);
        dos.writeUTF(sc.nextLine());
        System.out.println(s);

        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        String k=dis.readUTF();
        System.out.println(k);
       
       
        
   

    }
}