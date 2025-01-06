import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="drawLineApplet" width=200 height=200>
</applet>
*/
public class drawLineApplet extends Applet
{
        public void paint(Graphics g)
        {
                g.drawLine(10,10,180,100);
        }
}
