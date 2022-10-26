package controller;

import javax.swing.event.MouseInputListener;

import view.counterview;

import java.awt.event.*;
public class counterlistener implements MouseListener, MouseMotionListener {

    private counterview view;

    public counterlistener (counterview view) {
        this.view = view;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        Integer s = e.getClickCount();
        this.view.getClickCount();
        
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
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
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
    
}
