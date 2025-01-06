import java.applet.*;
import java.awt.*;
/*
<applet code="counterApplet" width=200 height=200>
</applet>
*/
public class counterApplet extends Applet implements Runnable
{
	int counter;
	Thread t;
	public void init()
	{
		counter=0;
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
				Thread.sleep(10);
				++counter;
			}
		}
		catch(Exception e)
		{}
	}
        public void paint(Graphics g)
        {
		g.setFont(new Font("Times New Roman",Font.BOLD,36));
		FontMetrics FM=g.getFontMetrics();
		String str=" "+counter;
		Dimension d=getSize();
		int x=(d.width/2)-(FM.stringWidth(str)/2);
		g.drawString(str,x,d.height/2);
        }
}
