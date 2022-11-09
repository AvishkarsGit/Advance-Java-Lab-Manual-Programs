package Practical_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class JPasswordEvent extends JFrame implements TextListener {
    TextField t1;
    JLabel l1,l2;
    JPasswordEvent(){
        setLayout(new FlowLayout());
        t1=new TextField(30);
        l1=new JLabel("                                                                                         ");
        l2=new JLabel("                                                                                                                                                                                                     ");
        t1.setEchoChar('●');
        add(t1);
        add(l1);
        add(l2);
        t1.addTextListener(this);
    }
    public static void main(String[] args) {
        JPasswordEvent jp = new JPasswordEvent();
        jp.setSize(500,500);
        jp.setVisible(true);
        jp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText("typing...");
        l2.setText(t1.getText());
    }
}
