package controller;

import java.awt.event.*;

import view.counterview;

public class counterlistener implements ActionListener{
    private counterview view;

    public counterlistener(counterview view) {
        this.view = view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        this.view.change_label();
    }
    
}
