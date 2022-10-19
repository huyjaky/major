package view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import modul.countermodul;
import java.awt.*;

public class counterview extends JFrame {
    private countermodul modul = new countermodul();

    public counterview () {
        __init__();
        this.setVisible(true);
    }

    public void __init__ () {
        this.setTitle("check text");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200, 200);
        this.setSize(600, 600);
        
        Font font = new Font("JetBrains Mono", Font.BOLD, 22);

        //panel1
        JPanel panel1 = new JPanel(); panel1.setLayout(new GridLayout());

        JTextArea jtext_area = new JTextArea(); jtext_area.setFont(font);

        //panel2
        JPanel panel2 = new JPanel(); panel2.setLayout(new GridLayout());

        JTextField text = new JTextField();
        JLabel label1 = new JLabel("nhap chuoi can check: ");

        panel2.add(label1); panel2.add(text);

        //panel3
        



    }
}
