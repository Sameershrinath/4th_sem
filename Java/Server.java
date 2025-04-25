import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server is waiting for a client...");

            Socket socket = server.accept();
            DataInputStream din = new DataInputStream(socket.getInputStream());

            String message = din.readUTF();
            System.out.println("Client says: " + message);
            din.close();
            socket.close();
            server.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
