package Practical_3;
import java.awt.*;
public class GridLayoutDemo extends Frame {

    Panel p;

    GridLayoutDemo() {
        setLayout(null);
        p = new Panel();
        p.setBounds(100, 100, 250, 250);
        p.setBackground(Color.YELLOW);
        add(p);
        GridLayout g = new GridLayout(5, 2, 10, 4);
        setLayout(g);
        for (int i=1;i<=9;i++){
            p.add(new Button(" "+i));
        }

    }

    public static void main(String[] args) {
        GridLayoutDemo g1 = new GridLayoutDemo();
        g1.setSize(500, 500);
        g1.setVisible(true);
    }
}