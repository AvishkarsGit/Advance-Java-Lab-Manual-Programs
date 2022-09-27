package Practical_4;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutDemo extends JFrame implements ActionListener {

    Container c;
    CardLayout c1;
    Button b1,b2,b3,b4,b5;
    CardLayoutDemo()
    {
        c=getContentPane();
        c1 = new CardLayout();
        setLayout(c1);
        b1=new Button("C lang");
        b2=new Button("C++ lang");
        b3=new Button("Java lang");
        b4=new Button("Python lang");
        b5=new Button("Android lang");

        add(b1,"Button1");
        add(b2,"Button2");
        add(b3,"Button3");
        add(b4,"Button4");
        add(b5,"Button5");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        c1.next(c);
    }

    public static void main(String[] args) {
        CardLayoutDemo c1 = new CardLayoutDemo();
        c1.setSize(500,500);
        c1.setTitle("CardLayout Demo");
        c1.setVisible(true);
    }
}
