// Calculator App


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField t1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr;

    Calculator() {
        t1 = new JTextField();
        t1.setBounds(30, 40, 280, 30);
        b1 = new JButton("1");
        b1.setBounds(40, 100, 50, 40);
        b2 = new JButton("2");
        b2.setBounds(110, 100, 50, 40);
        b3 = new JButton("3");
        b3.setBounds(180, 100, 50, 40);
        b4 = new JButton("4");
        b4.setBounds(250, 100, 50, 40);
        b5 = new JButton("5");
        b5.setBounds(40, 170, 50, 40);
        b6 = new JButton("6");
        b6.setBounds(110, 170, 50, 40);
        b7 = new JButton("7");
        b7.setBounds(180, 170, 50, 40);
        b8 = new JButton("8");
        b8.setBounds(250, 170, 50, 40);
        b9 = new JButton("9");
        b9.setBounds(40, 240, 50, 40);
        b0 = new JButton("0");
        b0.setBounds(110, 240, 50, 40);
        bdiv = new JButton("/");
        bdiv.setBounds(180, 240, 50, 40);
        bmul = new JButton("*");
        bmul.setBounds(250, 240, 50, 40);
        bsub = new JButton("-");
        bsub.setBounds(40, 310, 50, 40);
        badd = new JButton("+");
        badd.setBounds(110, 310, 50, 40);
        bdec = new JButton(".");
        bdec.setBounds(180, 310, 50, 40);
        beq = new JButton("=");
        beq.setBounds(250, 310, 50, 40);
        bdel = new JButton("Del");
        bdel.setBounds(60, 380, 100, 40);
        bclr = new JButton("Clr");
        bclr.setBounds(180, 380, 100, 40);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bdiv);
        add(bmul);
        add(bsub);
        add(badd);
        add(bdec);
        add(beq);
        add(bdel);
        add(bclr);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        badd.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);

        setLayout(null);
        setVisible(true);
        setSize(350, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            t1.setText(t1.getText().concat("1"));

        if (e.getSource() == b2)
            t1.setText(t1.getText().concat("2"));

        if (e.getSource() == b3)
            t1.setText(t1.getText().concat("3"));

        if (e.getSource() == b4)
            t1.setText(t1.getText().concat("4"));

        if (e.getSource() == b5)
            t1.setText(t1.getText().concat("5"));

        if (e.getSource() == b6)
            t1.setText(t1.getText().concat("6"));

        if (e.getSource() == b7)
            t1.setText(t1.getText().concat("7"));

        if (e.getSource() == b8)
            t1.setText(t1.getText().concat("8"));

        if (e.getSource() == b9)
            t1.setText(t1.getText().concat("9"));

        if (e.getSource() == b0)
            t1.setText(t1.getText().concat("0"));

        if (e.getSource() == bdec)
            t1.setText(t1.getText().concat("."));

        if (e.getSource() == badd) {
            a = Double.parseDouble(t1.getText());
            operator = 1;
            t1.setText("");
        }

        if (e.getSource() == bsub) {
            a = Double.parseDouble(t1.getText());
            operator = 2;
            t1.setText("");
        }

        if (e.getSource() == bmul) {
            a = Double.parseDouble(t1.getText());
            operator = 3;
            t1.setText("");
        }

        if (e.getSource() == bdiv) {
            a = Double.parseDouble(t1.getText());
            operator = 4;
            t1.setText("");
        }

        if (e.getSource() == beq) {
            b = Double.parseDouble(t1.getText());

            switch (operator) {
                case 1:
                    result = a + b;
                    break;

                case 2:
                    result = a - b;
                    break;

                case 3:
                    result = a * b;
                    break;

                case 4:
                    result = a / b;
                    break;

                default:
                    result = 0;
            }

            t1.setText("" + result);
        }

        if (e.getSource() == bclr)
            t1.setText("");

        if (e.getSource() == bdel) {
            String s = t1.getText();
            t1.setText("");
            for (int i = 0; i < s.length() - 1; i++)
                t1.setText(t1.getText() + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
    double a, b, result;
    int operator;
}

