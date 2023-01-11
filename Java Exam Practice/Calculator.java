import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
  private JTextField number1Field;
  private JTextField number2Field;
  private JRadioButton squareButton;
  private JRadioButton divideButton;
  private JLabel resultLabel;

  public Calculator() {
    setTitle("Calculator");
    setSize(400, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    JLabel number1Label = new JLabel("Enter a number: ");
    number1Field = new JTextField(10);
    JLabel number2Label = new JLabel("Enter another number (for division only): ");
    number2Field = new JTextField(10);
    ButtonGroup operationGroup = new ButtonGroup();
    squareButton = new JRadioButton("Calculate square", true);
    divideButton = new JRadioButton("Calculate division");
    operationGroup.add(squareButton);
    operationGroup.add(divideButton);
    JButton calculateButton = new JButton("Calculate");
    resultLabel = new JLabel("");

    calculateButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int number1 = Integer.parseInt(number1Field.getText());
        int result;
        if (squareButton.isSelected()) {
          result = number1 * number1;
          resultLabel.setText("The square is: " + result);
        } else if (divideButton.isSelected()) {
          int number2 = Integer.parseInt(number2Field.getText());
          result = number1 / number2;
          resultLabel.setText("The division result is: " + result);
        }
      }
    });

    add(number1Label);
    add(number1Field);
    add(squareButton);
    add(divideButton);
    add(number2Label);
    add(number2Field);
    add(calculateButton);
    add(resultLabel);
  }

  public static void main(String[] args) {
    Calculator c = new Calculator();
    c.setVisible(true);
  }
}
