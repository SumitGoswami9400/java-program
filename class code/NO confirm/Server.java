import java.net.*;
public class Server {
    public static void main(String[] args)throws Exception {
        ServerSocket ss=new ServerSocket(1000);
        System.out.println("Starting");
        Socket s=ss.accept();
    }
}
