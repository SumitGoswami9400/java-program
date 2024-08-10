import java.io.*;
public class FW {
    public static void main(String[] args)throws Exception {
       
        FileOutputStream bos=new FileOutputStream("m.txt");
        String s="Sumitkumargiri";
        byte b[]=s.getBytes();
            bos.write(b);
        bos.close();
        System.out.println("success...");
      

        FileInputStream fis=new FileInputStream("m.txt");
        String r="LrensBisnoi";
        byte[] m=r.getBytes();
        fis.read(m);
        fis.close();

         FileOutputStream bos1=new FileOutputStream("m.txt");
        String n="Sumitkumargiri";
        try{
            for(byte[] k:n)
            {
                System.out.println(k);
                bos1.close();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
