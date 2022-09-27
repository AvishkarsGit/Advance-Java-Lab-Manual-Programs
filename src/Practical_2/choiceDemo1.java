package Practical_2;

import java.awt.*;
import java.awt.event.*;

public class choiceDemo1 extends Frame implements ItemListener {

    Choice c1;
    Label l1;
    choiceDemo1()
    {
        setLayout(null);
        l1 = new Label("                                  ");

        c1= new Choice();
        c1.add("LOKAMAT");
        c1.add("PUDHAARI");
        c1.add("INDIAN TIMES");

        c1.setBounds(100,100,100,100);
        l1.setBounds(80,220,250,40);
        l1.setFont(new Font("Arial",Font.BOLD,15));
        add(c1);
        add(l1);

        c1.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        String str=c1.getSelectedItem();
        l1.setText("You have selected :"+str);
        l1.setBackground(Color.YELLOW);
    }

    public static void main(String[] args) {
        choiceDemo1 c = new choiceDemo1();
        c.setSize(500,500);
        c.setVisible(true);
    }
}
