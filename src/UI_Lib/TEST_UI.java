package UI_Lib;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;

class TEST_UI {
    public TEST_UI(){
        ImageIcon icon = new ImageIcon("src/image/FIX_3.png");
        JLabel lb = new JLabel();
        lb.setIcon(icon);
//        lb.setSize(600,400);

        JFrame main_Frame = new JFrame("test");
        main_Frame.setSize(icon.getIconWidth(),icon.getIconHeight());
        main_Frame.setVisible(true);
        main_Frame.add(lb);
    }
    public static void main(String[] args) {
        new TEST_UI();
    }
}