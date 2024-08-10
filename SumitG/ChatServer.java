import java.io.*; 
import java.net.*; 
public class ChatServer 
{  
   public static void main(String[] args) { 
        try { 
            // Create a server socket and bind it to a specific port 
            ServerSocket ss = new ServerSocket(12345);
             System.out.println("Server is waiting for client connection..."); 
            // Wait for a client to connect 
            Socket clientSocket = ss.accept(); 
            System.out.println("Client connected!"); 
            // Set up input and output streams 
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); 
            // Create a BufferedReader to read messages from the console 
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
             // Start a loop to read and send messages 
            new Thread(() -> {
                 String clientMessage; 
                try { 
                    while ((clientMessage = in.readLine()) != null) { 
                        System.out.println("Client: " + clientMessage); 
                    } 
                } catch (IOException e) { 
                    e.printStackTrace(); 
                } 
            }).start(); 
            String serverMessage; 
            while (true) { 

                // Read a message from the console and send it to the client 

                System.out.print("Enter your message: "); 
                serverMessage = consoleInput.readLine(); 
                out.println(serverMessage); 
            } 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
