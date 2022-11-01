import modul.countermodul;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class testswing extends JFrame implements ActionListener {
    private JPanel panel1;
    private JRadioButton COCACOLARadioButton;
    private JRadioButton BANHNGOTRadioButton;
    private JRadioButton KEMRadioButton;
    private JRadioButton TRASUARadioButton;
    private JPanel panel_monchinh;
    private JComboBox comboBox1;
    private JButton button1;
    private JLabel tong_bill;
    private JPanel panel_monphu;
    private JMenuItem history, reset_history;
    private countermodul modul = new countermodul();

    public testswing() {
        //countermodul modul = new countermodul();


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
                
                LocalDate a = LocalDate.now();
                modul.lich_su.add(a+" = " + DecimalFormat.getCurrencyInstance(new Locale("us", "US")).format(modul.getTong_bill()));
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
        
        
        t.history = new JMenuItem("history"); t.history.addActionListener(t);
        t.reset_history = new JMenuItem("reset_history"); t.reset_history.addActionListener(t);

        home.add(t.history); home.add(t.reset_history); menuBar.add(home);

        t.panel_monchinh.add(t.comboBox1);
        t.panel_monchinh.add(menuBar);

        URL url = testswing.class.getResource("coding.png");
        Image img = Toolkit.getDefaultToolkit().createImage(url);
        t.setIconImage(img);

        t.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String s = e.getActionCommand();

        if (s.equals("history")) {
            JOptionPane.showMessageDialog(null, "Lich Su : \n" + modul.in_lich_su(), "LICH SU", JOptionPane.CLOSED_OPTION);
        } else if (s.equals("reset_history")) {
            if(JOptionPane.showConfirmDialog(null, "HANH DONG NAY SE XOA HET LICH SU CUA BAN BAN CHAC CHAN MUON TIEP TUC!", "CANH BAO!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                modul.reset_lich_su();
            }
        }
    }

}
