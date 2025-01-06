import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
/*
<applet code="colorApplet" width=200 height=200>
</applet>
*/
public class colorApplet extends Applet
{
        public void paint(Graphics g)
        {
                g.setColor(Color.blue);
                g.drawString("Welcome To Java In Blue",10,50);
                g.fillRect(10,10,20,20);
                g.setColor(Color.red);
                g.fillOval(20,20,20,20);
        }
}
