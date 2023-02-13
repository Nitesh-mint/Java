import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.*;
public class cube {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cube Calculator");
        JPanel p = new JPanel();
        JTextField t = new JTextField();
        JButton b = new JButton();
        JLabel output = new JLabel("");
        t.setBounds(100, 40, 30, 30);
        b.setBounds(100, 70, 30, 30);
        output.setBounds(100,90,40,40);
        p.add(t);
        p.add(b);
        output.addActionListener(new ActionListener());


        frame.setSize(300,300);
        
    }
}
