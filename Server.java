import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000); // create server socket on port 5000
            System.out.println("Server started. Waiting for client...");

            Socket s = ss.accept(); // accept client connection
            System.out.println("Client connected.");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String message = dis.readUTF();
            System.out.println("Message from client: " + message);

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello from Server!");
            
            dis.close();
            dos.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
