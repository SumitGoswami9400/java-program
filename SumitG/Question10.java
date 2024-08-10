 /* 10.WAP to put one Exception class in a package and to use this Exception class 
 object in an another package class method any how? */

 
import Package2.ExampleClass; 
import Package1.CustomException;
 public class Question10{ 
    public static void main(String[] args) 
{ 
        ExampleClass example = new ExampleClass(); 
        try { 
            example.someMethod(); 
        } catch (CustomException e)
 { 
            System.out.println("Caught custom exception: " + e.getMessage()); 
                } 

            }
        }
    
