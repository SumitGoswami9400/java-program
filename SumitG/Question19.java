// 19.	WAP to show the use of transient keyword.

  import java.io.*;
   class MyClass implements Serializable 
   {  
       private int normalVariable;
            transient private String transientVariable; 
                public MyClass(int normalVariable, String transientVariable) { 
        this.normalVariable = normalVariable; 
                this.transientVariable = transientVariable; 
    } 
    public void printValues() { 
        System.out.println("Normal Variable: " + 
                normalVariable); 
        System.out.println("Transient Variable: " + 
                transientVariable); 
    } 
} 
public class Question19 { 
    public static void main(String[] args) 
    {  
               MyClass obj = new MyClass(42, "This is a transient variable."); 

         try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serialized_object.ser")))
          {
             out.writeObject(obj); 
            System.out.println("Object has been serialized.");
      } catch (IOException e) { 
            e.printStackTrace(); 
        } 
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("serialized_object.ser")))
                 {  
                               MyClass deserializedObj = (MyClass) in.readObject(); 
            System.out.println("Object has been deserialized."); 
          deserializedObj.printValues(); 
        } catch (IOException | ClassNotFoundException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
