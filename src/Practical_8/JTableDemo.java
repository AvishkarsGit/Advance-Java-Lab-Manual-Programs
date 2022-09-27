package Practical_8;

import javax.swing.*;

public class JTableDemo extends JFrame {

    JTableDemo(){
        String colname[]={"Roll NO","Name","Marks"};
        String data[][]={{"1010","Dennis","89.90"},{"1011","Bjarne","90"},{"1012","James","87"}};

        JTable jt = new JTable(data,colname);

        int h=JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        int v=JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED;

        JScrollPane js = new JScrollPane(jt,v,h);
        add(js);
    }

    public static void main(String[] args) {
        JTableDemo t1 = new JTableDemo();
        t1.setSize(500,500);
        t1.setVisible(true);
    }
}
