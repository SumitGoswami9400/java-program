/* 5.	WAP to delete only those text file which are non empty in these folder.[E://MCA/BCA/DCA]. */


import java.util.*;
import java.io.*;
public class Question5
{
public  static void main(String args[]) throws Exception
{
File f=new File("D:/Bca/Dca/Mca");
File[] files=f.listFiles();

 for(File f1:files)
{
FileReader fr=new FileReader(f1);
int m;
if((m=fr.read())!=-1)
{
fr.close();
boolean s=f1.delete();
if(s)
System.out.println("file deleted");

else 

System.out.println("file not deleted");
}
else

System.out.println("file is Empty");
}
}
} 