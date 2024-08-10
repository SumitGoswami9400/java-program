import java.io.*;
public class FW1 {
    public static void main(String[] args)throws Exception {
        File f=new File("A.txt");
        System.out.println(f.createNewFile());
        FileWriter fw=new FileWriter("A.txt");
        fw.write("Sonu");
        fw.write("\t Mpnu GOlu");
        fw.write("Sumit Kalapna");
         System.out.println(fw);
        fw.close();
       

        FileReader fr=new FileReader("A.txt");
        int i=fr.read();
        System.out.println((char)i);
        fr.close();
        
        
        //2nd Option
        FileReader fr1=new FileReader("A.txt");
        int k;
        if((k=fr1.read()) !=-1)
        {
System.out.println((char)k);

 fr1.close();
        }
       
    }
}
