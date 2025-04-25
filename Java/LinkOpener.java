import javax.swing.*;
import java.awt.*;
import java.net.URI;

public class LinkOpener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Link Opener");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JButton button = new JButton("Open Website");

        button.addActionListener(e -> {
            try {
                URI uri = new URI("https://www.google.com");
                Desktop.getDesktop().browse(uri);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Failed to open the link.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.add(button);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
