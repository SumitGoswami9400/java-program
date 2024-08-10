import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class S {

    public static void main(String[] args) {
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                    // Read the input from the client
                    String input = reader.readLine();

                    // Check if the input is a character
                    if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                        System.out.println("Received character: " + input);
                    } else {
                        throw new IllegalArgumentException("Invalid input. Please send a character.");
                    }

                } catch (IOException | IllegalArgumentException e) {
                    System.err.println("Error processing client request: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
}
}
}