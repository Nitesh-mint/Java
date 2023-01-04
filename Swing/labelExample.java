import javax.swing.*;
public class labelExample{
    public static void main(String[] args) {
        JFrame f = new JFrame("Label Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //labels
        JLabel l1,l2;
        //for l1
        l1 = new JLabel("Third Sem");
        l1.setBounds(50,50,100,30);
        //for l2
        l2 = new JLabel("DMC");
        l2.setBounds(50,100,100,30);
        //creating button
        JButton b1 = new JButton("Button1");
        b1.setBounds(50,200,100,30);
        //for textField
        JTextField t1 = new JTextField();
        t1.setBounds(50,300,100,100);
        f.add(t1);
        //showing and adding components
        f.add(l1);f.add(l2);f.add(b1);
        f.setSize(300,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}