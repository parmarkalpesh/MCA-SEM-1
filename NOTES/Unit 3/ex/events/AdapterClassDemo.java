import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="AdapterClassDemo" width=200 height=200>
</applet>
*/
public class AdapterClassDemo extends Applet
{
	public void init()
	{
		setBackground(Color.green);
		addMouseListener(new MyMouseAdapter(this));
	}
}
class MyMouseAdapter extends MouseAdapter
{
	AdapterClassDemo ma;
	public MyMouseAdapter(AdapterClassDemo ma)
	{
		this.ma=ma;
	}
	public void mousePressed(MouseEvent me)
	{
		ma.setBackground(Color.red);
		ma.repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		ma.setBackground(Color.green);
		ma.repaint();
	}
}