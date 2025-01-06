import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="MouseEventsDemo" height=300 width=300>
</applet>
*/
public class MouseEventsDemo extends Applet implements MouseListener
{
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		setBackground(Color.blue);
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.green);
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		setBackground(Color.red);
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		setBackground(Color.white);
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		setBackground(Color.yellow);
		repaint();
	}
}