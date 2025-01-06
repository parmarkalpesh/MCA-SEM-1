import java.applet.*;
import java.awt.*;
/*
<applet code="drawImageApplet" width=512 height=229>
	<param name="file" value="think.jpg">
</applet>
*/
public class drawImageApplet extends Applet
{
	Image i;
	public void init()
	{
		i=getImage(getDocumentBase(),getParameter("file"));
	}
	public void paint(Graphics g)
	{
		g.drawImage(i,0,0,this);
	}
}
