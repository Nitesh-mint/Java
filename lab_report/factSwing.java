import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class factSwing extends JFrame{
	JTextField t1;
	JTextField t2;
	factSwing()
	{
		JLabel l1=new JLabel("Enter number");
		JLabel l2=new JLabel("Factorial of number");
		t1=new JTextField(50);
		t2=new JTextField(50);
		JPanel p=new JPanel(new GridLayout(3,2));
		JButton b=new JButton("compute");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String nu=t1.getText();
				int n=Integer.parseInt(nu);
				long fac=n;
				for (int i=n-1;i>0;i-=1)
				{
					fac=fac*i;
				}
				t2.setText(Long.toString(fac));
				
				
			}
		});
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(b);
		add(p);
		setVisible(true);
		pack();
		
		
	}

	public static void main(String[] args) {
        factSwing j=new factSwing();
	}

}
