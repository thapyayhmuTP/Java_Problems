/*
 Mouse event
 */
package Java_Problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author tph
 */
public class Color_Changing extends JFrame {
    public Color_Changing()
    {
        final JPanel p=new JPanel();//in order to set Background using variable "p", final keyword must be used
        add(p);
        p.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent e)
            {
                p.setBackground(Color.BLACK);
            }
            
            @Override
            public void mouseReleased(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseExited(MouseEvent e) {
                p.setBackground(Color.WHITE);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame=new Color_Changing();
        frame.pack();
        frame.setTitle("Color Changing Mouse Event");
        frame.setLocationRelativeTo(null);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
