import modul.countermodul;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;

public class testswing extends JFrame {
    private JPanel panel1;
    private JPanel panel_monphu;
    private JRadioButton COCACOLARadioButton;
    private JRadioButton BANHNGOTRadioButton;
    private JRadioButton KEMRadioButton;
    private JRadioButton TRASUARadioButton;
    private JPanel panel_monchinh;
    private JComboBox comboBox1;
    private JButton button1;
    private JLabel tong_bill;

    public testswing() {
        countermodul modul = new countermodul();


        TRASUARadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton button = (AbstractButton) e.getSource();
                boolean f = button.getModel().isSelected();

                if (f) {
                    modul.them_bill(50d);
                } else {
                    modul.bot_bill(50d);
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Locale lc = new Locale("vi", "VN");
                NumberFormat nf = NumberFormat.getCurrencyInstance();
                tong_bill.setText(nf.format(modul.getTong_bill()));
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String s = comboBox1.getSelectedItem().toString();
                System.out.println(s);
                if (s.equals("COM")) {
                    System.out.println("check in");
                    modul.bot_bill_monchinh();
                    modul.them_bill_monchinh(12d);
                } else if (s.equals("PHO")) {
                    modul.bot_bill_monchinh();
                    modul.them_bill_monchinh(30d);
                } else  {
                    modul.bot_bill_monchinh();
                    modul.them_bill_monchinh(10d);
                }
            }
        });
        COCACOLARadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton button = (AbstractButton) e.getSource();
                boolean f = button.getModel().isSelected();

                if (f) {
                    modul.them_bill(11d);
                } else {
                    modul.bot_bill(11d);
                }
            }
        });

        BANHNGOTRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton button = (AbstractButton) e.getSource();
                boolean f = button.getModel().isSelected();

                if (f) {
                    modul.them_bill(20d);
                } else {
                    modul.bot_bill(20d);
                }
            }
        });

        KEMRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton button = (AbstractButton) e.getSource();
                boolean f = button.getModel().isSelected();

                if (f) {
                    modul.them_bill(3d);
                } else {
                    modul.bot_bill(3d);
                }
            }
        });
    }

    public static void main(String[] args) {
        testswing t = new testswing();
        t.setContentPane(t.panel1);
        t.setTitle("THUC DON NHA HANG");
        t.setSize(490, 390);
        t.setLocation(200, 200);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t.panel_monchinh.setLayout(new GridLayout(2,1));

        JMenuBar menuBar = new JMenuBar();

        JMenu home = new JMenu("home");
        JMenuItem history = new JMenuItem("history");
        JMenuItem reset_history = new JMenuItem("reset_history");
        home.add(history); home.add(reset_history); menuBar.add(home);

        t.panel_monchinh.add(t.comboBox1);
        t.panel_monchinh.add(menuBar);

        //Font font = new Font("JetBrains Mono", Font.BOLD, 27);

        t.setVisible(true);
        //Font font = new Font("JetBrains Mono", Font.BOLD, 23);
    }


}
