//Boxing:-      converating primitive data to object
// Unboxing:-   reverse process of the boxing
//             (converat object to primitive data)

class A
{
    public static void main(String[] args) {
        int x=10;
        System.out.println(x);

       /* Integer i=new Integer(x);  //boxing 
        System.out.println(i);

        int p=i.getInteger(null);  //Unboxing
        System.out.println(p);  */

       Integer i=x; //AutoBoxing
System.out.println(i);

int p=i; //AutoUnboxing
System.out.println(p);



    }
}