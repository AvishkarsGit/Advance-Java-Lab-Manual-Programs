package Practical_6;

import javax.swing.*;
import java.awt.*;

public class JComboBoxDemo extends JFrame {

    JComboBoxDemo(){
        setLayout(new FlowLayout());
        String  country[]={ "India","Aus","U.S.A","England","Newzealand"};
        JComboBox j = new JComboBox(country);
        add(j);
    }
    public static void main(String[] args) {
        JComboBoxDemo j1  = new JComboBoxDemo();
        j1.setSize(500,500);
        j1.setVisible(true);
    }
}
