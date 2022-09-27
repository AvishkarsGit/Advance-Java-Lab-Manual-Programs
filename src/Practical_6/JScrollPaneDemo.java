package Practical_6;
import javax.swing.*;
import java.awt.*;

public class JScrollPaneDemo extends JFrame {
    JScrollPaneDemo()
    {
        Container c=getContentPane();
        setLayout(new FlowLayout());

        JTextArea ta = new JTextArea(20,20);
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        JScrollPane s = new JScrollPane(ta,v,h);
        c.add(s);
    }
    public static void main(String[] args) {
        JScrollPaneDemo s1 = new JScrollPaneDemo();
        s1.setSize(500,500);
        s1.setVisible(true);
        s1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}