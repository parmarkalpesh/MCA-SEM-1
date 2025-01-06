import java.applet.*;
import java.awt.*;
/*
<applet code="parameterApplet" width=300 height=300>
        <param name="background" value="0xff0000">
        <param name="foreground" value="0x000000">
	<param name="message" value="Welcome To Java With Parameter">
</applet>
*/
public class parameterApplet extends Applet
{
	public void paint(Graphics g)
	{
		String b=getParameter("background");
		String f=getParameter("foreground");
		String m=getParameter("message");
		
		setBackground(Color.decode(b));
		setForeground(Color.decode(f));

		Font fo=getFont();

		FontMetrics FM=getFontMetrics(fo);
		
		Dimension d=getSize();
		
		int x=(d.width-FM.stringWidth(m))/2;
		int y=d.height/2;

		g.drawString(m,x,y);
	}
}
