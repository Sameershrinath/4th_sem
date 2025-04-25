import javax.swing.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    JTextField numField1, numField2;
    JButton addButton, subButton;
    JLabel resultLabel;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Enter first number:");
        label1.setBounds(30, 30, 150, 20);
        add(label1);

        numField1 = new JTextField();
        numField1.setBounds(160, 30, 80, 20);
        add(numField1);

        JLabel label2 = new JLabel("Enter second number:");
        label2.setBounds(30, 70, 150, 20);
        add(label2);

        numField2 = new JTextField();
        numField2.setBounds(160, 70, 80, 20);
        add(numField2);

        addButton = new JButton("Add");
        addButton.setBounds(40, 110, 80, 30);
        addButton.addActionListener(this);
        add(addButton);

        subButton = new JButton("Subtract");
        subButton.setBounds(140, 110, 100, 30);
        subButton.addActionListener(this);
        add(subButton);

        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(30, 160, 200, 30);
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(numField1.getText());
            int num2 = Integer.parseInt(numField2.getText());
            int result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subButton) {
                result = num1 - num2;
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
