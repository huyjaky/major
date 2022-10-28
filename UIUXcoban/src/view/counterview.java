package view;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.*;

public class counterview extends JFrame {
    
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

        // panel1
        JPanel panel1 = new JPanel(); panel1.setLayout(new GridLayout(1, 1, 10, 10));

        JRadioButton radio_com = new JRadioButton("com"); radio_com.setFont(font);
        JRadioButton radio_pho = new JRadioButton("pho"); radio_pho.setFont(font);
        JRadioButton radio_banhmi = new JRadioButton("banh mi"); radio_banhmi.setFont(font);

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

        // this
        JLabel label_thucdon = new JLabel("thuc don nha hang", JLabel.CENTER); label_thucdon.setFont(font);

        this.setLayout(new BorderLayout());
        this.add(label_thucdon, BorderLayout.NORTH);
        this.add(panel3, BorderLayout.CENTER);
        


    }
}
