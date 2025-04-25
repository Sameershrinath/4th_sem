import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="CalculatorApplet" width=400 height=300>
</applet>
*/

public class MyApplet extends Applet implements ActionListener {
    TextField num1, num2, result;
    Button add, sub, mul, div;

    public void init() {
        // Set layout
        setLayout(new GridLayout(5, 2, 10, 10));

        // Initialize components
        num1 = new TextField(10);
        num2 = new TextField(10);
        result = new TextField(10);
        result.setEditable(false); // Make result field read-only

        add = new Button("Add");
        sub = new Button("Subtract");
        mul = new Button("Multiply");
        div = new Button("Divide");

        // Add components to applet
        add(new Label("First Number:"));
        add(num1);

        add(new Label("Second Number:"));
        add(num2);

        add(new Label("Result:"));
        add(result);

        add(add);
        add(sub);
        add(mul);
        add(div);

        // Add action listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = n1 + n2;
            } else if (e.getSource() == sub) {
                res = n1 - n2;
            } else if (e.getSource() == mul) {
                res = n1 * n2;
            } else if (e.getSource() == div) {
                if (n2 != 0)
                    res = n1 / n2;
                else {
                    result.setText("Cannot divide by 0");
                    return;
                }
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }
}
