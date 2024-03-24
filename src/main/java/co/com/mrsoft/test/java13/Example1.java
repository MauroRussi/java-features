package co.com.mrsoft.test.java13;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Example of new internal Socket implementation.
 */
public class Example1 {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8888)){

            boolean running = true;
            while(running){
                System.out.println("Waiting for connections...");
                Socket clientSocket = serverSocket.accept();
                // Do something with clientSocket
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
