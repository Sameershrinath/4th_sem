import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Graphics;

public class MyApplet extends JPanel {

   private String name;
   private String studentId;

   public MyApplet(String name, String studentId) {
      this.name = name;
      this.studentId = studentId;
   }

   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawString("Name: " + name, 50, 50);
      g.drawString("Student ID: " + studentId, 50, 70);
   }

   public static void main(String[] args) {
      String name = JOptionPane.showInputDialog("Enter your name:");
      String studentId = JOptionPane.showInputDialog("Enter your Student ID:");

      JFrame frame = new JFrame("My JFrame Example");
      MyApplet panel = new MyApplet(name, studentId);

      frame.add(panel);
      frame.setSize(400, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}