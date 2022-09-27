package Practical_5;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad extends Frame implements ActionListener {

    MenuBar mbr;
    Menu m1,m2,m20,m3;
    CheckboxMenuItem m21;
    MenuItem m11,m12,m13,m14,m15,m16,m17,m18,m19,m22,m23,m24,m25;
    Notepad()
    {
        mbr = new MenuBar();
        m1=new Menu("File");

        m11=new MenuItem("New");
        m12=new MenuItem("Save");
        m13=new MenuItem("Save as");
        m14=new MenuItem("Open");
        m15=new MenuItem("Page Setup");

        m12.addActionListener(this);
        m14.addActionListener(this);

        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);

        m2=new Menu("Edit");

        m16=new MenuItem("Cut");
        m17=new MenuItem("Copy");
        m18=new MenuItem("Paste");
        m19=new MenuItem("Delete");

        m2.add(m16);
        m2.add(m17);
        m2.add(m18);
        m2.add(m19);

        m3=new Menu("View");
        m20=new Menu("Zoom");

        m23=new MenuItem("Zoom in");
        m24=new MenuItem("Zoom out");
        m25=new MenuItem("Restore default zoom");

        m20.add(m23);
        m20.add(m24);
        m20.add(m25);

        m21=new CheckboxMenuItem("Status bar");
        m22=new MenuItem("Word wrap");

        m3.add(m20);
        m3.add(m21);
        m3.add(m22);

        mbr.add(m1);
        mbr.add(m2);
        mbr.add(m3);

        setMenuBar(mbr);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==m12)
        {
            FileDialog fd = new FileDialog(this,"SAVE", FileDialog.SAVE);
            fd.setVisible(true);
        }
        else if (ae.getSource()==m14)
        {
            FileDialog fd1 = new FileDialog(this,"OPEN", FileDialog.LOAD);
            fd1.setVisible(true);
        }
    }

    public static void main(String[] args) {
        Notepad n1 = new Notepad();
        n1.setTitle("Notepad++");
        n1.setVisible(true);
        n1.setSize(800,600);
    }
}
