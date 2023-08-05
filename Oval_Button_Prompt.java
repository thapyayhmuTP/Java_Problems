//Graphics pratice
package Java_Problems;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author tph
 */
public class Oval_Button_Prompt extends JFrame {
    OvalButton ob1=new OvalButton(new JLabel("OK"));
    OvalButton ob2=new OvalButton(new JLabel("Cancel"));
    public Oval_Button_Prompt()
    {
        setLayout(new GridLayout(1,0,0,0));
        add(ob1);
        add(ob2);
    }
    public static void main(String[] args) {
        Oval_Button_Prompt frame=new Oval_Button_Prompt();
        frame.setTitle("Oval button prompt");
        frame.setSize(250,90);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class OvalButton extends JButton
{
    public OvalButton(Component c)
    {
        add(c);
    }
    protected void paintComponent(Graphics g)//Cannot be called from other
    {
        super.paintComponent(g);
        g.drawOval(10, 10, 100, 50); //g.drawOval(Horizontal TOP, vertical TOP, WIDTH, HEIGHT);
    }
}
