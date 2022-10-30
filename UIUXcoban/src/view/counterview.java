package view;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.counterlistener;
import modul.countermodul;

import java.awt.*;

public class counterview extends JFrame {
    private countermodul modul = new countermodul();
    private JLabel label_tongbill;
    private JMenuItem indanhsach;

    public counterview () {
        __init__();
        this.setVisible(true);
    }

    public void __init__ () {
        this.setTitle("MENU");
        this.setSize(600, 600);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        Font font = new Font("Jetbrains Mono", Font.BOLD, 23);
        counterlistener action = new counterlistener(this);

        // panel1
        JPanel panel1 = new JPanel(); panel1.setLayout(new GridLayout(1, 1, 10, 10));

        ButtonGroup group = new ButtonGroup(); 
        JRadioButton radio_com = new JRadioButton("com"); radio_com.setFont(font); radio_com.addActionListener(action);
        JRadioButton radio_pho = new JRadioButton("pho"); radio_pho.setFont(font); radio_pho.addActionListener(action); 
        JRadioButton radio_banhmi = new JRadioButton("banh mi"); radio_banhmi.setFont(font); radio_banhmi.addActionListener(action); 
        group.add(radio_banhmi); group.add(radio_com); group.add(radio_pho);

        panel1.add(radio_com); panel1.add(radio_banhmi); panel1.add(radio_pho);

        // panel2
        JPanel panel2 = new JPanel();

        JCheckBox checkbox_trasua = new JCheckBox("tra sua"); checkbox_trasua.setFont(font);
        JCheckBox checkbox_cocacola = new JCheckBox("cocacola"); checkbox_cocacola.setFont(font);
        JCheckBox checkbox_nem = new JCheckBox("nem"); checkbox_nem.setFont(font);
        JCheckBox checkbox_banhngot = new JCheckBox("banh ngot"); checkbox_banhngot.setFont(font); 

        panel2.setLayout(new GridLayout(2, 2));
        panel2.add(checkbox_trasua); panel2.add(checkbox_banhngot); panel2.add(checkbox_cocacola); panel2.add(checkbox_nem);

        // panel3
        JPanel panel3 = new JPanel(); panel3.setLayout(new GridLayout(2, 1));
        panel3.add(panel1); panel3.add(panel2);

        // panel4
        JPanel panel4 = new JPanel(); panel4.setLayout(new GridLayout(1, 2));

        JButton button_tinhbill = new JButton("tinh tong"); button_tinhbill.setFont(font);
        this.label_tongbill = new JLabel("tong bill la: ");

        panel4.add(this.label_tongbill); panel4.add(button_tinhbill);


        // menubar
        JMenuBar menubar = new JMenuBar();

        JMenu menu = new JMenu("danh sach"); 
        this.indanhsach = new JMenuItem("in danh sach"); 
        
        menu.add(this.indanhsach);
        menubar.add(menu);
    
        // panel 5
        JPanel panel5 = new JPanel(); panel5.setLayout(new GridLayout(2, 1));
        JLabel label_thucdon = new JLabel("thuc don nha hang", JLabel.CENTER); label_thucdon.setFont(font); 
        
        panel5.add(menubar); panel5.add(label_thucdon); 

        // this
        this.setLayout(new BorderLayout());
        this.add(panel5, BorderLayout.NORTH);
        this.add(panel3, BorderLayout.CENTER); 
        this.add(panel4, BorderLayout.SOUTH);
        
    }

    public void add_bill (Double gia) {
        this.modul.tong_gia(gia*1000d);
    } 

    public String in_danhsach () {
        return this.modul.in_danhsach_giaca();
    }
}