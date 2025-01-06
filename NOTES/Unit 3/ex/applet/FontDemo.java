import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
/*
<applet code="FontDemo" width=200 height=200>
</applet>
*/
public class FontDemo extends Applet
{
        public void paint(Graphics g)
        {
                int baseline=100;
                g.setColor(Color.red);
                g.drawLine(0,baseline,200,baseline);
//		Font f = new Font("Times New Roman",Font.BOLD,36));
//		g.setFont(f);
                g.setFont(new Font("Times New Roman",Font.BOLD,36));
                g.setColor(Color.black);
                g.drawString("Hello how r you?",5,baseline);
        }
}
