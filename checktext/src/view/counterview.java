package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.counterlistener;
import modul.countermodul;

public class counterview extends JFrame {
    private countermodul modul = new countermodul();
    private JLabel label_answer;
    private JTextField text;
    private JTextArea jtext_area;

    public counterview () {
        __init__();
        this.setVisible(true);
    }

    public void __init__ () {
        this.setTitle("check text");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200, 200);
        this.setSize(600, 600);

        counterlistener action = new counterlistener(this);
        
        Font font = new Font("JetBrains Mono", Font.BOLD, 22);

        //panel1
        JPanel panel1 = new JPanel(); panel1.setLayout(new GridLayout());

        this.jtext_area = new JTextArea(); jtext_area.setFont(font); jtext_area.setOpaque(true); jtext_area.setBackground(Color.CYAN);
        JScrollPane scroll = new JScrollPane(this.jtext_area);
        panel1.add(scroll);

        //panel2
        JPanel panel2 = new JPanel(); panel2.setLayout(new GridLayout());

        this.text = new JTextField();
        JLabel label1 = new JLabel("nhap chuoi can check: "); Font font2 = new Font("JetBrains Mono", Font.BOLD, 18); label1.setFont(font2);

        panel2.add(label1); panel2.add(text);

        //panel3
        JPanel panel3 = new JPanel(); panel3.setLayout(new GridLayout());

        JButton button_check = new JButton("CHECK!"); button_check.setFont(font);
        button_check.addActionListener(action);
        panel3.add(button_check);


        this.setLayout(new GridLayout(4, 1));
        this.add(panel1);
        this.add(panel2);
        this.label_answer = new JLabel("ket qua la : co " + this.modul.get_count() + " " + text.getText(), JLabel.CENTER); this.label_answer.setFont(font);
        this.add(this.label_answer);
        this.add(panel3);

    }

    public void change_label () {
        this.modul.count(this.jtext_area.getText(), this.text.getText());
        this.label_answer.setText("ket qua la : co " + this.modul.get_count() + " " + this.text.getText());
    }
}
