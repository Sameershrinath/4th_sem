import javax.swing.*;
import java.awt.event.*;
import java.net.URI;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple JFrame");
        JButton button = new JButton("Go to Google");

        button.addActionListener(e -> {
            try {
                URI uri = new URI("http://www.google.com");
                java.awt.Desktop.getDesktop().browse(uri);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        frame.add(button);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
