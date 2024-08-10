import java.net.*;
public class A {

    public static void main(String[] args) throws Exception {
        InetAddress ia=InetAddress.getLocalHost();
        System.out.println(ia);
    }
}