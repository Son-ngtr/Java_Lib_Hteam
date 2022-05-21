package UI_Lib;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class Lobby_UI {
    private JFrame main_Frame;
    private ImageIcon bk_Icon, notepad_Icon, login_Ani, login_ef;
    private JLabel label, notepad_Label, login_Icon;
    private JButton button;
    private JTextField txt_Group;
    private JButton logIn;
    private JPanel inFo;
    public Lobby_UI(){
        ImageIcon bk_Icon = new ImageIcon("D:\\Project Java\\Java_LibraryMa\\src\\image\\lobby_UI.png");
        label = new JLabel(bk_Icon);
        label.setSize(1493,794);

        ImageIcon notepad_Icon = new ImageIcon("D:\\Project Java\\Java_LibraryMa\\src\\image\\notepad_Gif.gif");
        notepad_Label = new JLabel(notepad_Icon);
        notepad_Label.setSize(80,80);
        notepad_Label.setBounds(715,205+10,80,80);

        Font Font_me = new Font("Lucida Console", Font.PLAIN, 12);
        Font Font_login = new Font("Lucida Console", Font.PLAIN, 16);
        Font Font_me_2 = new Font("Lucida Console", Font.PLAIN, 48);
        Font Font_me_3 = new Font("Lucida Console", Font.ITALIC, 12);

        Color Color_me = new Color(250,183,61);
        Color Color_ForeG = new Color(13,54,57);
        Color Color_ForeG_2 = new Color(43,51,31);






        txt_Group = new JTextField("designed by TropicalHorseTeam");
        txt_Group.setBackground(new Color(84, 103, 71));
        txt_Group.setFont(Font_me_3);
        txt_Group.setBorder(BorderFactory.createLineBorder(new Color(84, 103, 71)));
        txt_Group.setForeground(Color_ForeG);
        txt_Group.setBounds(1230,750,230,20);
        txt_Group.setEditable(false);


        label.add(txt_Group);

        main_Frame = new JFrame("Main_UI");
        main_Frame.add(label);
        main_Frame.setSize(1493,794);
        main_Frame.setResizable(false);;
        main_Frame.setLayout(null);
        main_Frame.setDefaultCloseOperation(main_Frame.EXIT_ON_CLOSE);
        main_Frame.setLocationRelativeTo(null);
        main_Frame.setUndecorated(true);
        main_Frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Lobby_UI();
    }
}
