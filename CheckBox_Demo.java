package Java_Problems;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import javax.swing.*;
/**
 *
 * @author tph
 */
public class CheckBox_Demo extends JFrame{
    private Checkbox_ExternalPanel cb=new Checkbox_ExternalPanel();
    private JCheckBox cbCen=new JCheckBox("Centered");
    private JCheckBox cbB=new JCheckBox("Bold");
    private JCheckBox cbI=new JCheckBox("Italic");
    
    public CheckBox_Demo()
    {
        JPanel p=new JPanel();
        cbCen.setMnemonic('C');
        cbB.setMnemonic('B');
        cbI.setMnemonic('I');
        p.setLayout(new GridLayout(3,0));
        p.add(cbCen);
        p.add(cbB);
        p.add(cbI);
        
        add(p,BorderLayout.EAST);
        add(cb,BorderLayout.CENTER);
        
        cbCen.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                cb.setCentered(cbCen.isSelected());
            }
        });
        
        cbB.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setNewFont();
            }
        });
        
        cbI.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setNewFont();
            }
        });
        
    }
         
        public void setNewFont()
        {
            int fstyle=Font.PLAIN;
            fstyle+=(cbB.isSelected()? Font.BOLD: Font.PLAIN);
            fstyle+=(cbI.isSelected()? Font.ITALIC: Font.PLAIN);
            
            cb.setFont(new Font(cb.getFont().getName(),fstyle,cb.getFont().getSize()));
        }
        
    
    
    public static void main(String[] args) {
        CheckBox_Demo check=new CheckBox_Demo();
        check.setTitle("Check Box Demo");
        check.setSize(300,300);
        check.setLocationRelativeTo(null);
        check.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        check.setVisible(true);
    }
} 
