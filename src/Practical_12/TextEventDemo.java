package Practical_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextEventDemo extends JFrame implements TextListener {

    TextField t1;
    JLabel l1,l2;
    TextEventDemo()
    {
        setLayout(new FlowLayout());
        t1=new TextField(30);
        l1=new JLabel("                                                                                         ");
        l2=new JLabel("                                                                                                                                                                                                     ");
        add(t1);
        add(l1);
        add(l2);
        t1.addTextListener(this);
    }
    public static void main(String[] args) {
        TextEventDemo t1 = new TextEventDemo();
        t1.setSize(500,500);
        t1.setVisible(true);
        t1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void textValueChanged(TextEvent e) {
            l1.setText("typing...");
            l2.setText(t1.getText());
    }
}
