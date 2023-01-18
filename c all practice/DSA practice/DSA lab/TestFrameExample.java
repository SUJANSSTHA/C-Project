
/* 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.FlowLayout;


public class TestFrameExample {
    public static void main(String[] args) {
        JFrame frame =new  JFrame("JFrame ex");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("This is a Label");
        JButton button = new JButton();
        button.setText("P M");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(300,300);
        frame.setLocaleRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      }
}
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class TestFrameExample {
    public static void main(String[] args) {
        //Creating the JFrame
        JFrame frame = new JFrame("JFrame Example");
        
        //Creating the JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        //Creating the JLabel
        JLabel label = new JLabel("This is a Label");
        
        //Creating the JButton
        JButton button = new JButton();
        button.setText("P M");
        
        //Adding the label and button to the panel
        panel.add(label);
        panel.add(button);
        
        //Adding the panel to the frame
        frame.add(panel);
        
        //Setting the size and location of the frame
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        
        //Setting the close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Making the frame visible
        frame.setVisible(true);
    }
}
