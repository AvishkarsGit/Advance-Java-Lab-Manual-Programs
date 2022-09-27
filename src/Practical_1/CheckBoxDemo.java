package Practical_1;

import java.awt.*;

public class CheckBoxDemo extends Frame {


    CheckBoxDemo()
    {
        setLayout(new FlowLayout());
        add(new Checkbox("Marathi"));
        add(new Checkbox("Hindi"));
        add(new Checkbox("English"));
        add(new Checkbox("Sanskrit"));
    }
    public static void main(String[] args) {
        CheckBoxDemo c1 = new CheckBoxDemo();
        c1.setSize(500,500);
        c1.setTitle("CheckBox Demo");
        c1.setVisible(true);
    }
}
