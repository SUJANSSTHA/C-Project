// import java.io.*;
// import java.util.Set;

// import javax.swing.JFrame;
// import javax.swing.JRadioButton;
// public class radio extends JFrame {
//     public radio()
//     {
//         JRadioButton jc = new JRadioButton("A");
//         add(jc);
//         jc=new JRadioButton("B");
//         add(jc);
//         jc=new JRadioButton("C");
//         add(jc);
//         jc=new JRadioButton("none");
//         add(jc);
//         setLayout(new FlowLayout());
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(400,400);
//         setVisible(true);


//     }
//     public static void main(String args[])
//     {
//         new radio();
//     }

    
// }


import java.io.*;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.*;
public class radio extends JFrame {
    public radio()
    {
        JRadioButton jc = new JRadioButton("A");
        add(jc);
        jc=new JRadioButton("B");
        add(jc);
        jc=new JRadioButton("C");
        add(jc);
        jc=new JRadioButton("none");
        add(jc);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new radio();
    }
}
