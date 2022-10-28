package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.counterlistener;
import modul.countermodul;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.net.URL;

public class counterview extends JFrame {
    private JLabel result1, result2, result3;
    private counterlistener action = new counterlistener(this);
    private countermodul modul = new countermodul();
    public JPopupMenu jpopupMenu;
    public JPanel paneltool;
    private JToolBar toolBar;

    public counterview () {
        __init__();
        this.setVisible(true);
    }

    public void __init__() {
        this.setTitle("locale");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200, 200);
        this.setSize(600, 600);
        this.setLayout(new BorderLayout());
        
        Font font = new Font("JetBrains Mono", Font.BOLD, 23);
        
        //tao menubar va gan cac nut tat cho cac lua chon
        JMenuBar menu_bar = new JMenuBar();
        JMenu open = new JMenu("open");
        JMenuItem exit = new JMenuItem("exit"); exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK)); exit.addActionListener(action);
        JMenuItem reset = new JMenuItem("reset"); reset.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK)); reset.addActionListener(action); 
        JCheckBoxMenuItem  toolbar = new JCheckBoxMenuItem("toolbar"); reset.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
        toolbar.addActionListener(action);

        open.add(reset);
        open.addSeparator();
        open.add(exit);
        menu_bar.add(open);
        
        
        JMenu tool = new JMenu("tool");
        tool.add(toolbar);
        menu_bar.add(tool);


        //tao toolbar
        this.toolBar = new JToolBar();
        JButton cut = new JButton("cut");
        JButton copy = new JButton("copy");
        JButton paste = new JButton("paste");
        this.toolBar.add(cut); toolBar.add(copy); toolBar.add(paste);

        //tao menu chuot trai
        jpopupMenu = new JPopupMenu();
        JMenuItem copyItem = new JMenuItem("copy"); copyItem.setFont(font);
        JMenuItem cutItem = new JMenuItem("cut"); cutItem.setFont(font);
        JMenuItem pasteItem = new JMenuItem("paste"); pasteItem.setFont(font);
        jpopupMenu.add(copyItem); jpopupMenu.add(cutItem); jpopupMenu.add(pasteItem);
        
        this.add(jpopupMenu);

        //panel1
        JPanel panel1 = new JPanel(); panel1.setLayout(new GridLayout());
        JLabel labelpad = new JLabel(); 
        panel1.add(labelpad);
        labelpad.setOpaque(true); labelpad.setBackground(Color.CYAN);
        URL url_labelpad = counterview.class.getResource("background_labelpad.png");
        Image img_background_labelpad = Toolkit.getDefaultToolkit().createImage(url_labelpad).getScaledInstance(600, 600, DO_NOTHING_ON_CLOSE);

        labelpad.setIcon(new ImageIcon(img_background_labelpad));
        
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
        this.paneltool = new JPanel(); paneltool.setLayout(new GridLayout());
        paneltool.add(menu_bar);
        this.add(paneltool, BorderLayout.NORTH);
        this.add(panel1, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.SOUTH);

        URL url = counterview.class.getResource("coding.png");
        Image img = Toolkit.getDefaultToolkit().createImage(url);
        this.setIconImage(img);
        
        this.setFont(font);

        URL url2 = counterview.class.getResource("coding.png");
        
        

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

    public void addtoolbar() {
        this.paneltool.add(this.toolBar);
    }

    public void disabletoolbar() {
        this.paneltool.remove(this.toolBar);
    }


}

// chen image 86/87
// chen phim tat cho menuitem 49/50
// chen jcheckboxmenuitem  51
// counterlistener thi co kiem cha lua chon trong jcheckboxmenuitem abstracbutton cac thu 82/83
// menubar toolbar cac thu den o tren tu tim de