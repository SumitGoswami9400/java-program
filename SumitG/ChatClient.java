/*  WAP to create TCP/IP Socket on both client and server side . and after 
socket creation perform the Operation as done in chat server . */

import java.io.*;
 import java.net.*;
 public class ChatClient
 {     
public static void main(String[] args) { 
 try { 
             //Connect to the server on the specified port 
            Socket s = new Socket("localhost", 12345); 
             System.out.println(s);
             //Set up input and output streams 
             BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); 
             PrintWriter out = new PrintWriter(s.getOutputStream(),true); 
            // Create a BufferedReader to read messages from the console 
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in)); 
        // Start a thread to continuously read messages from the server 
                 new Thread(()->
  {           
          String serverMessage; 
            try {                  while ((serverMessage = in.readLine()) != null) { 
                 } 
            } catch (IOException e) { 
                e.printStackTrace(); 
            }          }).start(); 
             // Start a loop to read and send messages   
           String clientMessage; 
        while (true) { 
               // Read a message from the console and send it to the server 
            System.out.print("Enter your message: ");
                clientMessage = consoleInput.readLine();
             System.out.println(clientMessage); 
        } 
    } catch (IOException e) {   
               e.printStackTrace(); 
    } 
    } 
} 
