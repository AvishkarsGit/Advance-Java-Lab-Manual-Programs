package Practical_9;

import javax.swing.*;
import java.awt.*;

public class JProgressBarDemo extends JFrame {

    JProgressBar jpb;
    JProgressBarDemo(){
        setLayout(new FlowLayout());
        jpb=new JProgressBar(0,2000);
        jpb.setStringPainted(true);
        add(jpb);
    }
    public void setValueProgress(){
        int i=0;
        while (i<=2000){
            jpb.setValue(i);
            i=i+20;
            try{
                Thread.sleep(100);
            }catch (Exception e){}
        }
    }
    public static void main(String[] args) {
        JProgressBarDemo j1 =  new JProgressBarDemo();
        j1.setSize(500,500);
        j1.setVisible(true);
        j1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j1.setValueProgress();
    }
}
