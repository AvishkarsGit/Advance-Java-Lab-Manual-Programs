package Practical_7;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo extends JFrame {

    DefaultMutableTreeNode lang,l1,l2,l11,l12,l13,l21,l22,l23;
    JTreeDemo()
    {
        Container c = getContentPane();
        BorderLayout b1 = new BorderLayout();
        c.setLayout(b1);

        lang =new DefaultMutableTreeNode("Language");
        l1 =new DefaultMutableTreeNode("POP");
        l11 = new DefaultMutableTreeNode("C lang");
        l12 = new DefaultMutableTreeNode("Pascal lang");
        l13 = new DefaultMutableTreeNode("Fortran lang");
        l2 =new DefaultMutableTreeNode("OOP");
        l21 = new DefaultMutableTreeNode("Java");
        l22 = new DefaultMutableTreeNode("C++");
        l23 = new DefaultMutableTreeNode("Python");

        l1.add(l11);   l1.add(l13);

        l2.add(l21);
        l2.add(l22);
        l2.add(l23);

        lang.add(l1);
        lang.add(l2);

        JTree jt = new JTree(lang);
        c.add(jt,BorderLayout.WEST);
    }

    public static void main(String[] args) {
        JTreeDemo t1 = new JTreeDemo();
        t1.setSize(500,500);
        t1.setVisible(true);
    }
}
