package Java_Problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author tph
 */
//Announced implementation first, cuz I want to use "this" later
public class Calculator extends JFrame implements ActionListener {
    private JButton bAdd=new JButton("Add");
    private JButton bSub=new JButton("Subtract");
    private JButton bMul=new JButton("Multiply");
    private JButton bDiv=new JButton("Divide");
    private JLabel label1=new JLabel("Number 1");
    private JTextField text1=new JTextField(" ");
    private JLabel label2=new JLabel("Number 2");
    private JTextField text2=new JTextField(" ");
    private JLabel label3=new JLabel("Number 3");
    private JTextField text3=new JTextField(" ");
    
    public Calculator()
    {
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(1,0,0,0));
        p1.add(label1);
        p1.add(text1);
        p1.add(label2);
        p1.add(text2);
        p1.add(label3);
        p1.add(text3);
        
        JPanel p2=new JPanel();
        p2.add(bAdd);
        p2.add(bSub);
        p2.add(bMul);
        p2.add(bDiv);
        
        this.add(p1,BorderLayout.NORTH);
        this.add(p2,BorderLayout.CENTER);
        
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        double num1=Double.parseDouble(text1.getText());
        double num2=Double.parseDouble(text2.getText());
        double answer=0.0;
        if(e.getSource()==bAdd)
        {
            answer=num1+num2;
        }
        else if(e.getSource()==bSub)
        {
            answer=num1-num2;
        }
        else if(e.getSource()==bMul)
        {
            answer=num1*num2;
        }
        else if(e.getSource()==bDiv)
        {
            answer=num1/num2;
        }
        text3.setText(answer+" ");
    }
    public static void main(String[] args) {
       JFrame frame=new Calculator();
       frame.setTitle("Calculator");
       frame.setSize(400,100);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
    
}
