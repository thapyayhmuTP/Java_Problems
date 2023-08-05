/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Problems;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author tph
 */
class Checkbox_ExternalPanel extends JPanel {
    private String message="Java is Fun";
    private int x=40;
    private int y=40;
    private boolean centered;
    public void setCentered(boolean centered)
    {
        this.centered=centered;
        repaint();
    }
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(centered)
        {
            FontMetrics fm=g.getFontMetrics();
            x=(getWidth()/2)-(fm.stringWidth(message)/2);
            y=(getHeight()/2)-(fm.getAscent()/2);
        }
        g.drawString(message, x, y);
    }
}
