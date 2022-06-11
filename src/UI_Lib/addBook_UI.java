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
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class addBook_UI {
    private JFrame main_Frame, managerBookFrame;
    private ImageIcon bk_Icon, notepad_Icon, login_Ani, login_ef;
    private JLabel label, notification_Label, login_Icon, logout_Label, exit_Label;
    private JButton button ,b1, b2, b3, b4, b5, b6, bt_save, bt_exit, bt_reset;
    private JTextField txt_1, txt_2, txt_3, txt_4, txt_5, txt_6;
    private JButton logIn;
    private JPanel inFo;
    private BookManager bookManager;
    private DefaultTableModel defaultTableModel;

    //Manager Book Side
    public void setManagerUser(JFrame frame, BookManager bookManager, DefaultTableModel defaultTableModel){
        managerBookFrame = frame;
        this.bookManager = bookManager;
        this.defaultTableModel = defaultTableModel;
    }

    //Create New Book
    public void createNewBook(String name, Long price, String author, String publisher, String category, int quantity){
        Calendar dateAdded = Calendar.getInstance();
        bookManager.addBook(bookManager.createBook(name, dateAdded, price, author, publisher, category, quantity));
    }

    //Table reset
    public void tableReset(){
        bookManager.setIsUpdate(true);
        defaultTableModel.setDataVector(bookManager.listBook(), bookManager.bookContent());
        bookManager.setIsUpdate(false);
    }

    public addBook_UI(){
        ImageIcon bk_Icon = new ImageIcon("src/image/Addbook_UI.png");
        label = new JLabel(bk_Icon);
        label.setSize(bk_Icon.getIconWidth(), bk_Icon.getIconHeight());

        Font Font_left = new Font("Lucida Calligraphy", Font.PLAIN, 42);
        Font Font_login = new Font("Lucida Calligraphy", Font.PLAIN, 20);
        Font Font_me_2 = new Font("Lucida Console", Font.PLAIN, 48);
        Font Font_me_3 = new Font("MV Boli", Font.ITALIC, 20);

        Color Color_me = new Color(250,183,61);
        Color Color_ForeG = new Color(13,54,57);
        Color Color_ForeG_2 = new Color(236,131,2);
        Color Color_left = new Color(84, 103, 71);
// create 6 button
        b1 = new JButton("name");
        b1.setBounds(59, 60, 176, 44);
        b1.setFont(Font_me_3);
        b1.setBorder(BorderFactory.createLineBorder(Color_me));
        b1.setForeground(Color_me);
        b1.setBackground(Color_left);

        b2 = new JButton("price");
        b2.setBounds(59, 142, 176, 44);
        b2.setFont(Font_me_3);
        b2.setBorder(BorderFactory.createLineBorder(Color_me));
        b2.setForeground(Color_me);
        b2.setBackground(Color_left);

        b3 = new JButton("author");
        b3.setBounds(59, 224, 176, 44);
        b3.setFont(Font_me_3);
        b3.setBorder(BorderFactory.createLineBorder(Color_me));
        b3.setForeground(Color_me);
        b3.setBackground(Color_left);

        b4 = new JButton("publisher");
        b4.setBounds(59, 307, 176, 44);
        b4.setFont(Font_me_3);
        b4.setBorder(BorderFactory.createLineBorder(Color_me));
        b4.setForeground(Color_me);
        b4.setBackground(Color_left);

        b5 = new JButton("category");
        b5.setBounds(59, 389, 176, 44);
        b5.setFont(Font_me_3);
        b5.setBorder(BorderFactory.createLineBorder(Color_me));
        b5.setForeground(Color_me);
        b5.setBackground(Color_left);

        b6 = new JButton("quantity");
        b6.setBounds(59, 471, 176, 44);
        b6.setFont(Font_me_3);
        b6.setBorder(BorderFactory.createLineBorder(Color_me));
        b6.setForeground(Color_me);
        b6.setBackground(Color_left);


// create 6 text fields
        txt_1 = new JTextField();
        txt_1.setBackground(Color_left);
        txt_1.setBounds(283, 60, 337, 44);
        txt_1.setForeground(Color_me);
        txt_1.setBorder(BorderFactory.createLineBorder(Color_me));
        txt_1.setFont(Font_me_3);


        txt_2 = new JTextField();
        txt_2.setBackground(Color_left);
        txt_2.setBounds(283, 142, 337, 44);
        txt_2.setForeground(Color_me);
        txt_2.setBorder(BorderFactory.createLineBorder(Color_me));
        txt_2.setFont(Font_me_3);


        txt_3 = new JTextField();
        txt_3.setBackground(Color_left);
        txt_3.setBounds(283, 224, 337, 44);
        txt_3.setForeground(Color_me);
        txt_3.setBorder(BorderFactory.createLineBorder(Color_me));
        txt_3.setFont(Font_me_3);


        txt_4 = new JTextField();
        txt_4.setBackground(Color_left);
        txt_4.setBounds(283, 307, 337, 44);
        txt_4.setForeground(Color_me);
        txt_4.setBorder(BorderFactory.createLineBorder(Color_me));
        txt_4.setFont(Font_me_3);


        txt_5 = new JTextField();
        txt_5.setBackground(Color_left);
        txt_5.setBounds(283, 389, 337, 44);
        txt_5.setForeground(Color_me);
        txt_5.setBorder(BorderFactory.createLineBorder(Color_me));
        txt_5.setFont(Font_me_3);


        txt_6 = new JTextField();
        txt_6.setBackground(Color_left);
        txt_6.setBounds(283, 471, 337, 44);
        txt_6.setForeground(Color_me);
        txt_6.setBorder(BorderFactory.createLineBorder(Color_me));
        txt_6.setFont(Font_me_3);

// create 3 funtion bt
        bt_save = new JButton("save");
        bt_save.setForeground(Color_ForeG);
        bt_save.setBackground(Color_left);
        bt_save.setFont(Font_me_3);
        bt_save.setBorder(BorderFactory.createLineBorder(Color_ForeG));
        bt_save.setBounds(46, 582, 175, 39);
        bt_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean inputCheck = true;
                if(txt_1.getText().trim().length() == 0){
                    JOptionPane.showMessageDialog(null, "Thiếu thông tin tên sách");
                    inputCheck = false;
                }else
                {
                    if(txt_2.getText().trim().length() == 0 || !bookManager.moneyCheck(txt_2.getText().trim())){
                        JOptionPane.showMessageDialog(null, "Thiếu thông tin tên giá hoặc nhập vào sai thông tin");
                        inputCheck = false;
                    }  else
                    {
                        if(txt_3.getText().trim().length() == 0){
                            JOptionPane.showMessageDialog(null, "Thiếu thông tin tác giả");
                            inputCheck = false;
                        }else
                        {
                            if(txt_4.getText().trim().length() == 0){
                                JOptionPane.showMessageDialog(null, "Thiếu thông tin tên nhà phát hành");
                                inputCheck = false;
                            }else
                            {
                                if(txt_5.getText().trim().length() == 0){
                                    JOptionPane.showMessageDialog(null, "Thiếu thông tin loại sách");
                                    inputCheck = false;
                                }else
                                {
                                    if(txt_6.getText().trim().length() == 0 || !bookManager.mathCheck(bookManager.mathAnalysis(txt_6.getText()))){
                                        JOptionPane.showMessageDialog(null, "Thiếu thông tin số lượng sách");
                                        inputCheck = false;
                                    }else
                                    {
                                        if (inputCheck){
                                            createNewBook(txt_1.getText().trim(), Long.parseLong(bookManager.moneyConvert(txt_2.getText().trim())) , txt_3.getText().trim(), txt_4.getText().trim(), txt_5.getText().trim(), Integer.parseInt(bookManager.matConvert(bookManager.mathAnalysis(txt_6.getText().trim()))) );
                                            txt_1.setText("");
                                            txt_2.setText("");
                                            txt_3.setText("");
                                            txt_4.setText("");
                                            txt_5.setText("");
                                            txt_6.setText("");
                                            tableReset();
                                            JOptionPane.showMessageDialog(null, "Tạo Sách mới thành công!!!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });

        bt_exit = new JButton("exit");
        bt_exit.setForeground(Color_ForeG);
        bt_exit.setBackground(Color_left);
        bt_exit.setFont(Font_me_3);
        bt_exit.setBorder(BorderFactory.createLineBorder(Color_ForeG));
        bt_exit.setBounds(255, 582, 175, 39);
        bt_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerBookFrame.setEnabled(true);
                main_Frame.dispose();
            }
        });


        bt_reset = new JButton("reset");
        bt_reset.setForeground(Color_ForeG);
        bt_reset.setBackground(Color_left);
        bt_reset.setFont(Font_me_3);
        bt_reset.setBorder(BorderFactory.createLineBorder(Color_ForeG));
        bt_reset.setBounds(464, 582, 176, 39);
        bt_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_1.setText("");
                txt_2.setText("");
                txt_3.setText("");
                txt_4.setText("");
                txt_5.setText("");
                txt_6.setText("");
            }
        });

// add all properties on UI
        label.add(b1);
        label.add(b2);
        label.add(b3);
        label.add(b4);
        label.add(b5);
        label.add(b6);

        label.add(txt_1);
        label.add(txt_2);
        label.add(txt_3);
        label.add(txt_4);
        label.add(txt_5);
        label.add(txt_6);

        label.add(bt_save);
        label.add(bt_exit);
        label.add(bt_reset);

        main_Frame = new JFrame("Main_UI");
        main_Frame.add(label);
        main_Frame.setSize(bk_Icon.getIconWidth(),bk_Icon.getIconHeight());
        main_Frame.setResizable(false);
        main_Frame.setLayout(null);
        main_Frame.setDefaultCloseOperation(main_Frame.EXIT_ON_CLOSE);
        main_Frame.setLocationRelativeTo(null);
        main_Frame.setUndecorated(true);
        main_Frame.setVisible(true);
    }

    public static void main(String[] args) {
        new addBook_UI();
    }
}
