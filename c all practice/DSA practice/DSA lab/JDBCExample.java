import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class JDBCExample extends JFrame implements ActionListener {
    private JLabel rollLabel, nameLabel, addressLabel;
    private JTextField rollField, nameField, addressField;
    private JButton insertButton;
    private Connection connection;
    private Statement statement;

    public JDBCExample() {
        super("JDBC Example");
        setLayout(new FlowLayout());

        rollLabel = new JLabel("Roll:");
        add(rollLabel);

        rollField = new JTextField(10);
        add(rollField);

        nameLabel = new JLabel("Name:");
        add(nameLabel);

        nameField = new JTextField(10);
        add(nameField);

        addressLabel = new JLabel("Address:");
        add(addressLabel);

        addressField = new JTextField(10);
        add(addressField);

        insertButton = new JButton("Insert");
        add(insertButton);
        insertButton.addActionListener(this);

        try {
            // Registering the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Creating a connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "admin", "admin");

            // Creating a statement
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == insertButton) {
            try {
                // Getting the data from the text fields
                int roll = Integer.parseInt(rollField.getText());
                String name = nameField.getText();
                String address = addressField.getText();

                // Inserting the data into the table
                statement.executeUpdate("INSERT INTO student (Roll, Name, Address) VALUES (" + roll + ", '" + name + "', '" + address + "')");
                JOptionPane.showMessageDialog(null, "Record inserted successfully!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new JDBCExample();
    }
}
