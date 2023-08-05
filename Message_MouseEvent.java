/*
A program that shows 2 strings one after another whenever the mouselistener event happens.
 */
package Java_Problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author tph
 */
public class Message_MouseEvent extends JFrame{
    public Message_MouseEvent()
    {
        add(new NewPanel());
    }
    public static void main(String[] args) {
        JFrame frame=new Message_MouseEvent();
        frame.setSize(400,400);
        frame.setTitle("Message Changing Mouse Event");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    class NewPanel extends JPanel
    {
        String m1="Java is fun";
        String m2="Java is powerful";
        int x=20;
        int y=20;
        boolean flag=true;//To check the strings so that these 2 strings can be shown one after another
        public NewPanel()
        {
            addMouseListener(new MouseListener()
            {   
                //@Override
                public void mouseClicked(MouseEvent e)
                {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    repaint();
                }
                //must add all the mouseListener events. If not, error will occur
                
                @Override
                public void mousePressed(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
                //can change the "repaint() to any events
            });//In order to display on the Panel, Listener event is added to the panel
        }
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            if(flag)
            {
                g.drawString(m1, x, y);
                flag=false;
                x+=20;
                y+=20;
            }
            else
            {
                g.drawString(m2, x, y);
                flag=true;
                x+=20;
                y+=20;
            }
        }
    }
}
