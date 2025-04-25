import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DocumentOpener {
    public static void main(String[] args) {
        // Create JFrame with new title
        JFrame frame = new JFrame("Study Now");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create JLabel as a clickable document link
        JLabel docLabel = new JLabel("Click here to open the Bill");
        docLabel.setForeground(Color.BLUE);
        docLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Add MouseListener to open document
        docLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    File file = new File("D:/Bill.docx"); // Change path accordingly
                    
                    if (file.exists()) {
                        Desktop.getDesktop().open(file);
                    } else {
                        JOptionPane.showMessageDialog(frame, "File not found!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Unable to open file!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Create JLabel as a clickable YouTube link
        JLabel ytLabel = new JLabel("Click here to open Sameer Shrinath Youtube channerl");
        ytLabel.setForeground(Color.RED);
        ytLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Add MouseListener to open YouTube link
        ytLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://youtube.com/c/sameershrinath"));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Unable to open link!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add labels to frame
        frame.add(docLabel);
        frame.add(ytLabel);
        frame.setVisible(true);
    }
}
