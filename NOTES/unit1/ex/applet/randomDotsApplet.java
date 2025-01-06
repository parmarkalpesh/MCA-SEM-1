import java.applet.*;
import java.awt.*;
/*
<applet code="randomDotsApplet" width=250 height=100>
</applet>
*/
public class randomDotsApplet extends Applet implements Runnable
{
	Thread t;
	public void init()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				repaint();
				Thread.sleep(200);
			}
		}
		catch(Exception e)
		{}
	}
	public void update(Graphics g)
	{
		paint(g);
	}
        public void paint(Graphics g)
        {
		Dimension d=getSize();
		int x=(int)(Math.random()*d.width);
		int y=(int)(Math.random()*d.height);
		int r=(int)(Math.random()*30);
		g.fillOval(x,y,r,r);
        }
}
