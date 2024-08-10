public class base2 {
    int x=10;
}


class Child extends base2{
int x=20;
void show(){
System.out.println(x);

}
public static void main(String[] args) {
    Child c=new Child();
    System.out.println(c);
}
}