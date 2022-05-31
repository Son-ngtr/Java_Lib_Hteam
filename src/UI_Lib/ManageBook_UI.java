package UI_Lib;

import Library.BookManager;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.EventObject;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ManageBook_UI {
    private JFrame main_Frame;
    private ImageIcon bk_Icon, notepad_Icon, login_Ani, login_ef;
    private JLabel label, notification_Label, login_Icon, logout_Label, exit_Label;
    private JButton button, bt_add, bt_remove, bt_search;
    private JTextField txt_Group;
    private JButton logIn;
    private JPanel inFo;
    private JTable table;
    private DefaultTableModel defaultTableModel;
    private boolean isUpdate = false;
    public ManageBook_UI(){
        BookManager bookManager = new BookManager();

        ImageIcon bk_Icon = new ImageIcon("src/image/Book_Management_UI.png");
        label = new JLabel(bk_Icon);
        label.setSize(1794,956);

        ImageIcon notification_Icon = new ImageIcon("src/image/notification (1).png");
        notification_Label = new JLabel(notification_Icon);
        notification_Label.setSize(80,80);
        notification_Label.setBounds(1508,876,45,45);
        notification_Label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon logout_Icon = new ImageIcon("src/image/log-out (1)_fix.png");
        logout_Label = new JLabel(logout_Icon);
        logout_Label.setSize(80,80);
        logout_Label.setBounds(1610,876,45,45);
        logout_Label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        ImageIcon exit_Icon = new ImageIcon("src/image/power (1).png");
        exit_Label = new JLabel(exit_Icon);
        exit_Label.setSize(80,80);
        exit_Label.setBounds(1695,876,45,45);
        exit_Label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        Font Font_left = new Font("MV Boli", Font.PLAIN, 30);
        Font Font_login = new Font("Lucida Calligraphy", Font.PLAIN, 20);
        Font Font_me_2 = new Font("Lucida Console", Font.PLAIN, 48);
        Font Font_me_3 = new Font("MV Boli", Font.ITALIC, 12);

        Color Color_me = new Color(250,183,61);
        Color Color_ForeG = new Color(13,54,57);
        Color Color_ForeG_2 = new Color(236,131,2);
        Color Color_left = new Color(84, 103, 71);

        txt_Group = new JTextField("designed by TropicalHorseTeam");
        txt_Group.setBackground(new Color(84, 103, 71));
        txt_Group.setFont(Font_me_3);
        txt_Group.setBorder(BorderFactory.createLineBorder(new Color(84, 103, 71)));
        txt_Group.setForeground(Color_ForeG);
        txt_Group.setBounds(1200,890,230,20);
        txt_Group.setEditable(false);

// create 3 button -> function
        bt_add = new JButton("add book");
        bt_add.setBounds(74,287,228,50);
        bt_add.setFont(Font_left);
        bt_add.setBorder(BorderFactory.createLineBorder(Color_me));
        bt_add.setForeground(Color_me);
        bt_add.setBackground(Color_left);
        bt_add.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                bt_add.setBackground(Color_ForeG);
                bt_add.setForeground(Color_me);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                bt_add.setBackground(Color_me);
                bt_add.setForeground(Color_ForeG);
            }
        });

        bt_remove = new JButton("remove book");
        bt_remove.setBounds(74,399,228,50);
        bt_remove.setFont(Font_left);
        bt_remove.setBorder(BorderFactory.createLineBorder(Color_me));
        bt_remove.setForeground(Color_me);
        bt_remove.setBackground(Color_left);
        bt_remove.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(table.getSelectedRow() != -1){
                    isUpdate = true;
                    bookManager.removeBook(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
                    defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
                    isUpdate = false;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                bt_remove.setBackground(Color_ForeG);
                bt_remove.setForeground(Color_me);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                bt_remove.setBackground(Color_me);
                bt_remove.setForeground(Color_ForeG);
            }
        });

        bt_search = new JButton("search");
        bt_search.setBounds(74,511,228,50);
        bt_search.setFont(Font_left);
        bt_search.setBorder(BorderFactory.createLineBorder(Color_me));
        bt_search.setForeground(Color_me);
        bt_search.setBackground(Color_left);
        bt_search.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                bt_search.setBackground(Color_ForeG);
                bt_search.setForeground(Color_me);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                bt_search.setBackground(Color_me);
                bt_search.setForeground(Color_ForeG);
            }
        });
// create content_TB
        //Find Icon
        JLabel bookFilterPanel = new JLabel(new ImageIcon("src/image/search.png"));
        bookFilterPanel.setBounds(435, 106, 35, 35);
        bookFilterPanel.setBorder(BorderFactory.createLineBorder(Color_me));

        //Search Field
        JTextField bookFilter = new JTextField("  ",20);
        bookFilter.setBounds(470, 106, 1000, 35);
        Font filterFont = new Font("Arial", Font.PLAIN, 20);
        bookFilter.setFont(filterFont);
        bookFilter.setBackground(Color_left);
        bookFilter.setBorder(BorderFactory.createLineBorder(Color_me));
        bookFilter.setForeground(Color_me);

        //Table
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 10, 10);
        bookManager.addBook(bookManager.createBook("Quang", calendar, "1000", "Sơn", "Dfsdf", "dsfsdf", 10));
        calendar.set(2020, 10, 10);
        bookManager.addBook(bookManager.createBook("Shark", calendar, "1000", "Sơn", "Dfsdf", "dsfsdf", 10));
        calendar.set(2020, 10, 10);
        bookManager.addBook(bookManager.createBook("Babe", calendar, "1000", "Sơn", "Dfsdf", "dsfsdf", 10));
        calendar.set(2020, 10, 10);
        bookManager.addBook(bookManager.createBook("Duong", calendar, "1000", "Sơn", "Dfsdf", "dsfsdf", 10));
        defaultTableModel = new DefaultTableModel(bookManager.listBook(), bookManager.bookContent());
        table = new JTable(defaultTableModel){
            public boolean isCellEditable(int row,int column){
                if(column == 0) return false;
                return true;
            }
        };
        table.getTableHeader().setReorderingAllowed(false);
        table.setBorder(BorderFactory.createLineBorder(Color_me));
        table.setRowHeight(30);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(435, 140, 1034, 600);
        scrollPane.setBackground(Color_left);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color_me));


        //Table Search
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        bookFilter.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = bookFilter.getText().trim();
                if(text.length() == 0){
                    rowSorter.setRowFilter(null);
                }else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = bookFilter.getText().trim();
                if(text.length() == 0){
                    rowSorter.setRowFilter(null);
                }else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        //Table Fĩx
        table.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if(!isUpdate){
                    String codeValue = String.valueOf(table.getValueAt(table.getSelectedRow(), 0));
                    String newValue = String.valueOf(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
                    switch (table.getSelectedColumn()){
                        case 1:
                            if(!isUpdate){
                                if(newValue.trim().length() > 0){
                                    bookManager.editBook(codeValue, table.getSelectedColumn(), newValue);
                                }else {
                                    isUpdate = true;
                                    int row = table.getSelectedRow();
                                    int col = table.getSelectedColumn();
                                    JOptionPane.showMessageDialog(null, "Tên phải được đưa vào ở dạng chuỗi và có nhiều hơn 1 kí tự");
                                    defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
                                    isUpdate = false;
                                }
                            }

                            break;
                        case 2:
                            if(!isUpdate){
                                if(newValue.trim().length() > 0 && bookManager.isDateOrNot(newValue)){
                                    bookManager.editBook(codeValue, table.getSelectedColumn(), newValue);
                                }else {
                                    isUpdate = true;
                                    int row = table.getSelectedRow();
                                    int col = table.getSelectedColumn();
                                    JOptionPane.showMessageDialog(null, "Thông tin phải được nhập dưới dạng d/m/y và tồn tại thời điểm nhập");
                                    defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
                                    isUpdate = false;
                                }
                            }

                            break;
                        case 3:
                            if(!isUpdate){
                                if(newValue.trim().length() > 0 && bookManager.isLong(newValue)){
                                    bookManager.editBook(codeValue, table.getSelectedColumn(), newValue);
                                    isUpdate = true;
                                    defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
                                    isUpdate = false;
                                }else {
                                    if(bookManager.moneyCheck(newValue)){
                                        bookManager.editBook(codeValue, table.getSelectedColumn(), bookManager.moneyConvert(newValue));
                                        isUpdate = true;
                                        defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
                                        isUpdate = false;
                                    }else {
                                        isUpdate = true;
                                        int row = table.getSelectedRow();
                                        int col = table.getSelectedColumn();
                                        JOptionPane.showMessageDialog(null, "Giá phải được nhập dưới dạng (VD: 10000 or 10.000VND)");
                                        defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
                                        isUpdate = false;
                                    }
                                }
                            }

                            break;
                        case 4:
                            if(!isUpdate){
                                if(newValue.trim().length() > 0 ){
                                    bookManager.editBook(codeValue, table.getSelectedColumn(), newValue);
                                }else {
                                    isUpdate = true;
                                    int row = table.getSelectedRow();
                                    int col = table.getSelectedColumn();
                                    JOptionPane.showMessageDialog(null, "Tên tác giả phải được đưa vào ở dạng chuỗi và có nhiều hơn 1 kí tự");
                                    defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
                                    isUpdate = false;
                                }
                            }

                            break;
                        case 5:
                            if(!isUpdate){
                                if(newValue.trim().length() > 0 ){
                                    bookManager.editBook(codeValue, table.getSelectedColumn(), newValue);
                                }else {
                                    isUpdate = true;
                                    int row = table.getSelectedRow();
                                    int col = table.getSelectedColumn();
                                    JOptionPane.showMessageDialog(null, "Tên phải được đưa vào ở dạng chuỗi và có nhiều hơn 1 kí tự");
                                    defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
                                    isUpdate = false;
                                }
                            }

                            break;
                        case 6:
                            if(!isUpdate){
                                if(newValue.trim().length() > 0 ){
                                    bookManager.editBook(codeValue, table.getSelectedColumn(), newValue);
                                }else {
                                    isUpdate = true;
                                    int row = table.getSelectedRow();
                                    int col = table.getSelectedColumn();
                                    JOptionPane.showMessageDialog(null, "Tên phải được đưa vào ở dạng chuỗi và có nhiều hơn 1 kí tự");
                                    defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
                                    isUpdate = false;
                                }
                            }
                            break;
                        case 7:
                            if(!isUpdate){
                                if(newValue.trim().length() > 0 && bookManager.isLong(newValue)){
                                    bookManager.editBook(codeValue, table.getSelectedColumn(), newValue);
                                }else {
                                    isUpdate = true;
                                    int row = table.getSelectedRow();
                                    int col = table.getSelectedColumn();
                                    JOptionPane.showMessageDialog(null, "Số lượng sách phải được nhập dưới dạng number(int)");
                                    defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
                                    isUpdate = false;
                                }
                            }
                            break;
                    }
                }
            }
        });

        //Table Click Event
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

// add all properties on UI
        label.add(scrollPane);
        label.add(bookFilterPanel);
        label.add(bookFilter);
        label.add(txt_Group);
        label.add(notification_Label);
        label.add(logout_Label);
        label.add(exit_Label);
        label.add(bt_add);
        label.add(bt_remove);
        label.add(bt_search);

        main_Frame = new JFrame("Main_UI");
        main_Frame.add(label);
        main_Frame.setSize(1794,956);
        main_Frame.setResizable(false);;
        main_Frame.setLayout(null);
        main_Frame.setDefaultCloseOperation(main_Frame.EXIT_ON_CLOSE);
        main_Frame.setLocationRelativeTo(null);
        main_Frame.setUndecorated(true);
        main_Frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ManageBook_UI();
    }
}
