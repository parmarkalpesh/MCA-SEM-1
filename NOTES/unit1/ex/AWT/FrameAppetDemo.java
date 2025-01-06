import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="FrameAppetDemo" width=200 height=200></applet>
*/
class FrameApp extends Frame
{
	FrameApp(String title)
	{
		super(title);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
	}
}
public class FrameAppetDemo extends Applet implements ActionListener
{
	public void init()
	{
		Button b=new Button("Create Frame");
		b.addActionListener(this);
		add(b);
	}
	public void actionPerformed(ActionEvent ae)
	{
		FrameApp frm=new FrameApp("Frame Applet");
		frm.show();
		frm.setSize(200,200);
	}
}