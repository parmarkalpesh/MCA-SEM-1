import java.applet.*;
import java.awt.*;
/*
<applet code="showDimensionInStatus" width=200 height=200>
</applet>
*/
public class showDimensionInStatus extends Applet
{
	public void paint(Graphics g)
	{
		Dimension d=getSize();
		showStatus("Width = "+d.width+" Height = "+d.height);
	}
}
