//Write a program to create a Button with Caption OK,RESET and CANCEL
package Practical_1;

import java.awt.*;

public class ButtonDemo extends Frame {
    ButtonDemo()
    {
     FlowLayout f =new FlowLayout();
     setLayout(f);
      Button b = new Button("Ok");
      Button b2 = new Button("RESET");
      Button b3 = new Button("CANCEL");
      add(b);
      add(b2);
      add(b3);
    }
    public static void main(String[] args) {
        ButtonDemo b1 = new ButtonDemo();
        b1.setSize(400,400);
        b1.setVisible(true);
        b1.setTitle("Practical 1");
    }
}
