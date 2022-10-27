package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.*;

import javax.swing.AbstractButton;

import view.counterview;
public class counterlistener implements MouseListener, MouseMotionListener, ActionListener {

    private counterview view;

    public counterlistener (counterview view) {
        this.view = view;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        this.view.enter();
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        this.view.out();
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
        
        this.view.getClickCount();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        if (e.isPopupTrigger()) {
            this.view.jpopupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        Integer x = e.getX();
        Integer y = e.getY();
        this.view.location(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String command = e.getActionCommand();
        if (command.equals("reset")) {
            this.view.reset();
        } else if (command.equals("exit")) {
            System.exit(0);
        } else if (command.equals("toolbar")) {
            
            //kiem tra xem cai cho checkbox co dc tick hay chua
            AbstractButton s = (AbstractButton) e.getSource();
            boolean check = s.getModel().isSelected();
            
            
            if (check) {
                this.view.paneltool.setLayout(new GridLayout(2,1));
                this.view.addtoolbar();
            } else {
                this.view.paneltool.setLayout(new GridLayout());
                this.view.disabletoolbar();
            }
        } 
        
    }
    
}
