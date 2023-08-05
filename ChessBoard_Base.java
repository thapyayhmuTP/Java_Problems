/*
 This is just the background or base of a chessboard 
created to study Graphics and class
 */
package Java_Problems;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author tph
 */
public class ChessBoard_Base extends JFrame{
    private boolean whiteORBlack=true;
    public ChessBoard_Base()
    {
        setLayout(new GridLayout(8,8,0,0));
        for(int i=1;i<=8;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i%2!=0)
                {
                    add(new Check(whiteORBlack));
                    add(new Check(!whiteORBlack));
                }
                else
                {
                    add(new Check(!whiteORBlack));
                    add(new Check(whiteORBlack));
                }    
            }
        }
    }
    public static void main(String[] args) {
        ChessBoard_Base frame=new ChessBoard_Base();
        frame.setTitle("Chessboard Base");
        frame.setSize(240,240);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

class Check extends JPanel
{
    private boolean wORb;
    public Check(boolean wORb)
    {
        this.wORb=wORb;
    }
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(wORb)
        {
            g.drawRect(0, 0, 30, 30);
        }
        else
        {
            g.fillRect(0, 0, 30, 30);
        }
    }
}
