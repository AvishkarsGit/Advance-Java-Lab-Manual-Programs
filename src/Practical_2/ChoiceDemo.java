package Practical_2;

import java.awt.*;

public class ChoiceDemo extends Frame {
    Choice c1;
    ChoiceDemo()
    {
        setLayout(new FlowLayout());
        c1=new Choice();
        c1.add("Maths");
        c1.add("Chemistry");
        c1.add("C++");
        c1.add("Physics");
        add(c1);
    }

    public static void main(String[] args) {
        ChoiceDemo c = new ChoiceDemo();
        c.setSize(500,500);
        c.setVisible(true);
    }
}
