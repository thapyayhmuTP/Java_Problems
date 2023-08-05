/*
A program that help to change miles to kilometers
 */
package Java_Problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author tph
 */
public class Mile_Kilometer extends JFrame{
    private JLabel jb1=new JLabel("Mile");
    private JLabel jb2=new JLabel("Kilometer");
    private JTextField jt1=new JTextField(20);
    private JTextField jt2=new JTextField(20);
    
    public Mile_Kilometer()
    {
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(0,1));
        
        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(0,1));
        
        p1.add(jb1);
        p1.add(jb2);
        
        p2.add(jt1);
        p2.add(jt2);
        
        add(p1,BorderLayout.WEST);
        add(p2,BorderLayout.CENTER);
        
        jt1.setHorizontalAlignment(JTextField.RIGHT);
        jt2.setHorizontalAlignment(JTextField.RIGHT);
        
        jt1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                double mile=Double.parseDouble(jt1.getText());
                double km=mile/0.621371; // 1 kilometer= 0.621371 miles
                jt2.setText(km+ " ");
            }
        });
        
        jt2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                double km=Double.parseDouble(jt2.getText());
                double mile=km*0.621371; // 1 kilometer= 0.621371 miles
                jt1.setText(mile+ " ");
            }
        });
    }
    
    public static void main(String[] args) {
        Mile_Kilometer frame=new Mile_Kilometer();
        frame.setTitle("Mile to Kilomenter/ Vice Versa");
        frame.pack();
        frame.setSize(500,150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
