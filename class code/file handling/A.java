import java.io.*;
public class A
{
    public static void main(String[] args)throws Exception {
        File f=new File("D:/java program/class code/file handling", "b.txt");
          File f2=new File("D:/java program/class code/file handling", "m");
        System.out.println(f.createNewFile());
   
System.out.println(f.getPath());
        System.out.println(f2.mkdir());
        //System.out.println(f.delete());
             System.out.println(f.exists());

             //print all directories or file in the folder
 File f3=new File("D:/java program/class code/file handling");
 String s[]=f3.list();
 for(String m:s)
 {
   // if(m.endsWith(".txt")){

System.out.println(m);
 }
 }

    }
//}
