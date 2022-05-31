package UI_Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class TEST_UI {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        // Frame Title
        jFrame.setTitle("JTable Example");
        // Data to be displayed in the JTable
        String[][] data = {
                { "Kundan Kumar Jha", "4031", "CSE" },
                { "Anand Jha", "6014", "IT" },
                {"a","7", "t"},
                {"a","7", "t"},
                {"a","7", "t"},
                {"a","7", "t"},
                {"a","7", "t"},
                {"a","7", "t"},
                {"a","7", "t"},
                {"a","7", "t"},
                {"a","7", "t"},
                {"a","7", "t"},{"a","7", "t"},
                {"a","7", "t"},
                {"a","7", "t"}

        };
        // Column Names
        String[] columnNames = { "Name", "Roll Number", "Department" };
        // Initializing the JTable
        JTable jTable = new JTable(data, columnNames);
        jTable.setBounds(30, 40, 200, 300);
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(jTable);
        jFrame.add(sp);
        // Frame Size
        jFrame.setSize(500, 200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}