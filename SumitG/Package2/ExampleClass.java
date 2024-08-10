package Package2; 
 import Package1.CustomException; 
 public class ExampleClass
 { 
 public void someMethod() throws CustomException
 { 
 throw new CustomException("This is a custom exception."); 
 } 
}