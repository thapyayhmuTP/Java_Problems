/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Java_Problems;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
/**
 *
 * @author tph
 */
public class Colors_ToolTipText extends JFrame {
    public Colors_ToolTipText()  
    {
        setLayout(new GridLayout(2,3,5,5));
        
        JLabel jI=new JLabel("Black");
        jI.setBorder(new LineBorder(Color.black,2));
        jI.setToolTipText("Black color");
        jI.setForeground(Color.black);
        
        JLabel jII=new JLabel("Blue");
        jII.setBorder(new LineBorder(Color.blue,2));
        jII.setToolTipText("Blue color");
        jII.setForeground(Color.blue);
        
        JLabel jIII=new JLabel("Cyan");
        jIII.setBorder(new LineBorder(Color.cyan,2));
        jIII.setToolTipText("Cyan color");
        jIII.setForeground(Color.cyan);
        
        JLabel jIV=new JLabel("Green");
        jIV.setBorder(new LineBorder(Color.green,2));
        jIV.setToolTipText("Green color");
        jIV.setForeground(Color.green);
        
        JLabel jV=new JLabel("Magenta");
        jV.setBorder(new LineBorder(Color.magenta,2));
        jV.setToolTipText("Magenta color");
        jV.setForeground(Color.magenta);
        
        JLabel jVI=new JLabel("Orange");
        jVI.setBorder(new LineBorder(Color.orange,2));
        jVI.setToolTipText("Orange color");
        jVI.setForeground(Color.orange);
        
        add(jI);
        add(jII);
        add(jIII);
        add(jIV);
        add(jV);
        add(jVI);
    }
    
    public static void main(String[] args) {
        JFrame frame=new Colors_ToolTipText();
        frame.setTitle("Colors");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
