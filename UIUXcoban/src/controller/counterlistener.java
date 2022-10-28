package controller;

import java.awt.event.*;

import javax.sound.sampled.SourceDataLine;
import javax.swing.AbstractButton;

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
        }
    }
    
}
