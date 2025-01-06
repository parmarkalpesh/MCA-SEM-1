import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="drawArcApplet" height=200 width=200>
</applet>
*/
public class drawArcApplet extends Applet
{
        public void paint(Graphics g)
        {
                g.drawArc(20,20,100,160,0,270);
        }
}
