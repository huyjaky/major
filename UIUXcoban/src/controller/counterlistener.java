package controller;

import java.awt.event.*;

import javax.swing.AbstractButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

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

        if (f && s.equals("com")) {
            this.view.add_bill(12d);
        } else if (f && s.equals("pho")) {
            this.view.add_bill(30d); 
        } else if (f && s.equals("banh mi")) {
            this.view.add_bill(10d);
        } else if (s.equals("thuc don nha hang")){
            JScrollPane scroll = new JScrollPane();
            JLabel label_phu = new JLabel(this.view.in_danhsach());
            
        }
    }
    
}
