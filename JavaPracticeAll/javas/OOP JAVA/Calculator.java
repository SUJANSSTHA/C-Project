import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

  // Declare text fields for input and output
  JTextField num1Field, num2Field, resultField;

  // Declare buttons for operations
  JButton squareButton, addButton, subtractButton, multiplyButton;

  public Calculator() {
    // Set the title and layout for the frame
    super("Simple Calculator");
    setLayout(new FlowLayout());

    // Create text fields for input and output
    num1Field = new JTextField(10);
    num2Field = new JTextField(10);
    resultField = new JTextField(10);

    // Set result field to be non-editable
    resultField.setEditable(false);

    // Create buttons for operations
    squareButton = new JButton("Square");
    addButton = new JButton("Add");
    subtractButton = new JButton("Subtract");
    multiplyButton = new JButton("Multiply");

    // Add action listeners to the buttons
    squareButton.addActionListener(this);
    addButton.addActionListener(this);
    subtractButton.addActionListener(this);
    multiplyButton.addActionListener(this);

    // Add the text fields and buttons to the frame
    add(num1Field);
    add(num2Field);
    add(squareButton);
    add(addButton);
    add(subtractButton);
    add(multiplyButton);
    add(resultField);
  }

  public void actionPerformed(ActionEvent event) {
    double num1, num2, result;

    // Get the input numbers from the text fields
    num1 = Double.parseDouble(num1Field.getText());
    num2 = Double.parseDouble(num2Field.getText());

    // Determine which operation was selected
    if (event.getSource() == squareButton) {
      result = num1 * num1;
    } else if (event.getSource() == addButton) {
      result = num1 + num2;
    } else if (event.getSource() == subtractButton) {
      result = num1 - num2;
    } else if (event.getSource() == multiplyButton) {
      result = num1 * num2;
    } else {
      result = 0;
    }

    // Display the result in the result field
    resultField.setText(String.format("%.2f", result));
  }

  public static void main(String[] args) {
    // Create a new frame and set its properties
    Calculator calc = new Calculator();
    calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    calc.setSize(250, 120);
    calc.setVisible(true);
  }
}
