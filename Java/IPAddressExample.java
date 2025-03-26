import java.net.*;

public class IPAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("IP Address: " + ip.getHostAddress());
            System.out.println("Host Name: " + ip.getHostName());
        } catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        }
    }
}
