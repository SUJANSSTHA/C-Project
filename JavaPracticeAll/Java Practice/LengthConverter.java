import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LengthConverter extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JTextField inputField;
    private JButton convertButton;

    public LengthConverter() {
        setTitle("Length Converter");
        setSize(300, 105);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        label = new JLabel("To convert inches to centimeters");
        // label = new JLabel("Enter a value in inches:");
        inputField = new JTextField(10);
        convertButton = new JButton("Convert");

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double inches = Double.parseDouble(inputField.getText());
                double centimeters = inches * 2.54;
                JOptionPane.showMessageDialog(null, inches + " inches is equal to " + centimeters + " centimeters.");
            }
        });

        panel.add(label);
        panel.add(inputField);
        panel.add(convertButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LengthConverter();
    }
}
