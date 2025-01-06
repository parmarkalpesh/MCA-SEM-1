import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="AnonymousInnerClassDemo" width=200 height=200>
</applet>
*/
public class AnonymousInnerClassDemo extends Applet
{
	public void init()
	{	
		setBackground(Color.green);
		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent me)
			{
				setBackground(Color.red);
				repaint();
			}
			public void mouseReleased(MouseEvent me)
			{
				setBackground(Color.green);
				repaint();
			}
		}
		);
	}
}