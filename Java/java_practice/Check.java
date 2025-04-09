import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;

public class Check extends Applet {
    Button button;

    public void init() {
        button = new Button("Go to Google");
        add(button);
        
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
    }
}
