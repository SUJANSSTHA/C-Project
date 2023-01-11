// public class SquareCalculator {
    
// }
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SquareCalculator extends JFrame {
  private JTextField numberField;
  private JLabel resultLabel;

  public SquareCalculator() {
    setTitle("Square Calculator");
    setSize(300, 100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    JLabel numberLabel = new JLabel("Enter a number: ");
    numberField = new JTextField(10);
    JButton calculateButton = new JButton("Calculate");
    resultLabel = new JLabel("");

    calculateButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int number = Integer.parseInt(numberField.getText());
        int result = number * number;
        resultLabel.setText("The square is: " + result);
      }
    });

    add(numberLabel);
    add(numberField);
    add(calculateButton);
    add(resultLabel);
  }

  public static void main(String[] args) {
    SquareCalculator sc = new SquareCalculator();
    sc.setVisible(true);
  }
}
