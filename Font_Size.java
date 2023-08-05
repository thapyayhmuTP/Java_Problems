/*
a program that changes the font size from upper case to lower & vice versa
 */
package Java_Problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author tph
 */
public class Font_Size extends JFrame {
    private JButton bUp=new JButton("Uppercase");
    private JButton bLow=new JButton("Lowercase");
    private JLabel label=new JLabel("Enter Text: ");
    private JTextField text=new JTextField(" ");
    
    public Font_Size()
    {
        JPanel p1=new JPanel();
        p1.add(bUp);
        p1.add(bLow);
        
        JPanel p2=new JPanel();
        p2.add(label);
        text.setPreferredSize( new Dimension( 200, 30 ) );
        p2.add(text);
        
        this.add(p2,BorderLayout.CENTER);
        this.add(p1,BorderLayout.SOUTH);
        
        bUp.addActionListener(new ToUpperListener());
        bLow.addActionListener(new ToLowerListener());
    }
    
    public class ToUpperListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            text.setText(text.getText().toUpperCase());
        }
    }
    
     public class ToLowerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            text.setText(text.getText().toLowerCase());
        }
    }
    
    public static void main(String[] args) {
       JFrame frame=new Font_Size();
       frame.setTitle("Font Size Changing");
       frame.setSize(400,100);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
    
}
