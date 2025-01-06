import java.applet.*;
import java.awt.*;
/*
<applet code="DoubleBufferApplet" width=300 height=100>
</applet>
*/
public class DoubleBufferApplet extends Applet implements Runnable
{
	Thread t;
	int x=0;
	Image buffer;
	Graphics bufferg;
	public void init ()
	{
		t=new Thread (this);
		t.start ();
		Dimension d=getSize ();
		buffer=createImage (d.width, d.height);
	}
	public void run ()
	{
		try
		{
			while (true)
			{
				repaint ();
				Thread.sleep (100);
			}
		}
		catch (Exception e)
		{}
	}
	public void update (Graphics g)
	{
		paint (g);
	}
        public void paint (Graphics g)
        {
		if (bufferg==null)
		{
			bufferg=buffer.getGraphics ();
		}
		Dimension d=getSize ();
		bufferg.setColor (Color.white);
		bufferg.fillRect (0, 0, d.width, d.height);
		bufferg.setColor (Color.black);
		bufferg.fillOval (x, d.height/4, 50, 50);
		g.drawImage (buffer, 0, 0, this);
		x=x+5;
		if(x+50>d.width)
		{
			x=0;
		}
        }
}