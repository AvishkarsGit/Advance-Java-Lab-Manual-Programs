//Develop a program using Label to display message "Welcome to java"
package Practical_1;

import java.awt.*;

public class lableDemo extends Frame {

    lableDemo()
    {
        Label l = new Label("Welcome to Java");
        add(l);
    }
    public static void main(String[] args) {
        lableDemo l1 = new lableDemo();
        l1.setSize(300,300);
        l1.setVisible(true);
        l1.setTitle("Practical 1");
    }
}
