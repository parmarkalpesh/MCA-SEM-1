import java.applet.*;
import java.awt.*;
import java.net.*;
/*
<applet code="showDocumentApplet" width=200 height=200>
</applet>
*/
public class showDocumentApplet extends Applet
{
	public void init()
	{
		AppletContext ac=getAppletContext();
		try
		{
			URL url=new URL("frame2.html");
			ac.showDocument(url,"frame2");
		}
		catch(Exception e)
		{
			showStatus("Exception "+e);
		}
	}
	public void paint(Graphics g)
	{
		g.drawString("Show document Applet",10,25);
	}
}
