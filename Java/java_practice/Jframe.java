import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.URI;

public class SimpleFrame {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Simple JFrame Example");
        frame.setSize(300, 100);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the application when the window is closed

        // Create a button
        JButton button = new JButton("Go to Google");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Open google.com in default browser
                    URI uri = new URI("http://www.google.com");
                    Desktop.getDesktop().browse(uri);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Add button to the frame
        frame.getContentPane().add(button, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }
}
