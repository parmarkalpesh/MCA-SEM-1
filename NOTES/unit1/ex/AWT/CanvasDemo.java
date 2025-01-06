import java.applet.*;
import java.awt.*;
/*
<applet code="CanvasDemo" width=501 height=200>
</applet>
*/
class MyCanvas extends Canvas
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		Dimension d= getSize();
		g.drawRect(0,0,d.width-1,d.height-1);
		g.drawLine(0,d.height/2,d.width,d.height/2);
		g.drawLine(d.width/2,0,d.width/2,d.height-1);
	}
}
public class CanvasDemo extends Applet
{
	public void init()
	{
		MyCanvas c=new MyCanvas();
		c.setSize(401,150);
		add(c);
	}
}