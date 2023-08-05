/*
created to test ActionListener
 */
package Java_Problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author tph
 */
public class Control_Circle extends JFrame{
    private JButton b1=new JButton("Enlarge");
    private JButton b2=new JButton("Shrink");
    Circle c=new Circle();
    public Control_Circle()
    {
        JPanel p=new JPanel();
        p.add(b1);
        p.add(b2);
        this.add(c,BorderLayout.CENTER);
        this.add(p,BorderLayout.SOUTH);
        b1.addActionListener(new EnlargeListener());
        b2.addActionListener(new ShrinkListener());
    }
    public static void main(String[] args) {
        JFrame frame=new Control_Circle();
        frame.setTitle("Controlling Circle's size");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }  

class EnlargeListener implements ActionListener //Must have class in order to write Action Event
{
    public void actionPerformed(ActionEvent e)
    {
        c.enlarge();
    }
}

class ShrinkListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        c.shrink();
    }
}

class Circle extends JPanel
{
    private int radius=5;
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawOval((getWidth()/2)-radius, (getHeight()/2)-radius, 2*radius, 2*radius);
    }
    public void enlarge()
    {
        radius+=10;
        repaint();
    }
    public void shrink()
    {
        radius-=10;
        repaint();
    }
}
}