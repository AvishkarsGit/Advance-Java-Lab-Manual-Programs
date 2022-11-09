package Practical_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseEventDemo extends JFrame implements MouseMotionListener {

    MouseEventDemo(){
        addMouseMotionListener(this);
    }


    public static void main(String[] args) {
        MouseEventDemo m1 = new MouseEventDemo();
        m1.setSize(500,500);
        m1.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g =getGraphics();
        g.setColor(Color.RED);
        g.drawLine(e.getX(),e.getY(),10,10);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}