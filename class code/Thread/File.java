//write a program to read the file and write to another file

import java.io.FileReader;
import java.io.FileWriter;

public class File {
    public static void main(String[] args) throws Exception{
        File f1=new File();
        File f2=new File();
        FileWriter fw=new FileWriter("b.txt",true);
        FileReader fr=new FileReader("a.txt");

        int i=fr.read();
        if(i !=-1)
        {
            char c=(char)i;
        
        if(Character.isDigit(c))
        {
            fw.write(i);
        }
    }
    fw.close();
    }
}
