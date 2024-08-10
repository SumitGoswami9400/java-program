import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class C {

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 12345;

        try (Socket socket = new Socket(serverAddress, serverPort);
             OutputStream outputStream = socket.getOutputStream()) {

            // Send a character to the server
            char characterToSend = '5';
            outputStream.write(characterToSend);
            System.out.println("Sent character: " + characterToSend);

            // Uncomment the line below to test sending a digit (which should throw an exception on the server)
            // char digitToSend = '5';
            // outputStream.write(digitToSend);
            // System.out.println("Sent digit: " + digitToSend);

        } catch (IOException e) {
            e.printStackTrace();
 
               }      }
}