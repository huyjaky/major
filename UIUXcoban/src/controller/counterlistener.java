package controller;

import java.awt.event.*;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.*;

import view.counterview;

public class counterlistener implements ActionListener {
    private counterview view;
    
    public counterlistener(counterview view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        AbstractButton ab = (AbstractButton) e.getSource();
        boolean f = ab.getModel().isSelected();
        String s = e.getActionCommand();
        System.out.println("check out");

        if (f && s.equals("com")) {
            this.view.add_bill_monchinh(12d);
        } else if (f && s.equals("pho")) {
            this.view.add_bill_monchinh(30d); 
        } else if (f && s.equals("banh mi")) {
            this.view.add_bill_monchinh(10d);
            System.out.println("huy");
        } else if (s.equals("in danh sach")){
            System.out.println("check");
        } else if (s.equals("tinh tong")) {
            this.view.tong();
        } else if (f && s.equals("tra sua")) {
            this.view.add_bill_monphu(50d);
        } else if (f && s.equals("cocacola")) {
            this.view.add_bill_monphu(12d);
        } else if (f && s.equals("nem")) {
            this.view.add_bill_monphu(5d);
        } else {
            if (s.equals("com")) {
                this.view.xoa_bill_monchinh(12d);
            } else if  (s.equals("pho")) {
                this.view.xoa_bill_monchinh(30d);
            } else if (s.equals("banh mi")) {
                this.view.xoa_bill_monchinh(10d);
            } else if (s.equals("tra sua")) {
                this.view.xoa_bill_monchinh(50d);
            } else if (s.equals("cocacola")) {
                this.view.xoa_bill_monchinh(12d);
            } else if (s.equals("nem")) {
                this.view.xoa_bill_monchinh(5d);
            }
        }
    }
}
