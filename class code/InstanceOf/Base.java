 //Instance of:----Kya ye object koi class, subclass & superclass & interface ka hai ye ki nahi
 //Yah check krega jo isme diya hua hai wo class & superclass & child & interface hai ki nahi 
 //If yes then return true otherwise false
 
public class Base{

   public static void main(String args[]) {
      Base c1=new Base();
     System.out.println(c1 instanceof Child);  
     System.out.println(c1 instanceof Base);  
}

class Child extends Base{
 void show(){
Child c2=new Child();
     System.out.println(c2 instanceof Child);  
      System.out.println(c2 instanceof Base);  
    }
}
}