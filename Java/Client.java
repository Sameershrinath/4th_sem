import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("localhost", 5000);
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            
            dout.writeUTF("Hello Server!");
            dout.flush();
            dout.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
