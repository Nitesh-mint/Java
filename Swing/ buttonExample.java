package Swing;
import java.awt.*;
import javax.swing.*;

public class  buttonExample {
    PanelExample(){
        JFrame f= new JFrame("Panel Example");
        JPanel panel=new JPanel();
        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.gray);
        JButton b1=new JButton("Click Me!");
        b1.setBounds(40,80,200,200);
        b1.setBackground(Color.gray);
        JButton b2=new JButton("Click Me Again!");
        b2.setBounds(40,80,200,200);
        b2.setBackground(Color.gray);
        panel.add(b1)


    }
}
