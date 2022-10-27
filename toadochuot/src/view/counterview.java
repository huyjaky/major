package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import controller.counterlistener;
import modul.countermodul;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class counterview extends JFrame {
    private JLabel result1, result2, result3;
    private counterlistener action = new counterlistener(this);
    private countermodul modul = new countermodul();

    public counterview () {
        __init__();
        this.setVisible(true);
    }

    public void __init__() {
        this.setTitle("locale");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200, 200);
        this.setSize(600, 600);
        
        Font font = new Font("JetBrains Mono", Font.BOLD, 23);
        
        //tao menubar va gan cac nut tat cho cac lua chon
        JMenuBar menu_bar = new JMenuBar();
        JMenu open = new JMenu("open");
        JMenuItem exit = new JMenuItem("exit"); exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK)); exit.addActionListener(action);
        JMenuItem reset = new JMenuItem("reset"); reset.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK)); reset.addActionListener(action); 

        
        open.add(reset);
        open.addSeparator();
        open.add(exit);
        menu_bar.add(open);

        //panel1
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.cyan);
        panel1.addMouseListener(action);
        panel1.addMouseMotionListener(action);



        //panel2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3,2));

        JLabel label1 = new JLabel("Postion: "); label1.setFont(font);
        JLabel label2 = new JLabel("Number of click: "); label2.setFont(font);
        JLabel label3 = new JLabel("Mouse in component: "); label3.setFont(font);

        this.result1 = new JLabel("x/y"); result1.setFont(font); 
        this.result2 = new JLabel("n"); result2.setFont(font); 
        this.result3 = new JLabel("null"); result3.setFont(font);

        panel2.add(label1); panel2.add(result1);
        panel2.add(label2); panel2.add(result2);
        panel2.add(label3); panel2.add(result3);

        //this
        this.setLayout(new BorderLayout());
        this.add(menu_bar, BorderLayout.NORTH);
        this.add(panel1, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.SOUTH);


    }

    public void getClickCount() {
        this.modul.add_click();
        this.result2.setText(this.modul.getclick());
    }

    public void enter() {
        this.result3.setText("yes");
    }

    public void out() {
        this.result3.setText("no");
    }

    public void location (Integer x, Integer y) {
        this.result1.setText(x+"        "+y);
    }

    public void reset () {
        this.result2.setText("n");
        this.result3.setText("null");
        this.result1.setText("x/y");
    }
}
