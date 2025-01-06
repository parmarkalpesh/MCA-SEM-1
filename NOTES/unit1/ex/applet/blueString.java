import java.applet.*;
import java.awt.*;
/*
<applet code="blueString" width=200 height=200>
</applet>
*/
public class blueString extends Applet
{
        public void paint(Graphics g)
        {
		g.setColor(Color.blue);
		g.drawString("Welcome To Java In Blue",10,50);
        }
}        
