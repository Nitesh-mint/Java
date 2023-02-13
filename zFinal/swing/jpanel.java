import javax.swing.*;  
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class jpanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton calculateButton = new JButton("Click");
        JTextField inputField = new JTextField();
        inputField.setBounds(130,50,100,40);
        calculateButton.setBounds(130,100,100,40);
        f.add(calculateButton);
        f.add(inputField);
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(130,130,100,30);
        f.add(resultLabel);
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //get input value
                String inputText = inputField.getText();
                double inputNumber = Double.parseDouble(inputText);

                double square = inputNumber * inputNumber;
                resultLabel.setText(Double.toString(square));
            }
        });

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
 }
