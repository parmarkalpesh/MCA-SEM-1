import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ButtonEvents" width=200 height=200>
</applet>
*/
public class ButtonEvents extends Applet implements ActionListener
{
	Label L;
	public void init()
	{
		Button b1=new Button("Apple");
		b1.addActionListener(this);
		add(b1);
		Button b2=new Button("Banana");
		b2.addActionListener(this);
		add(b2);
		Button b3=new Button("Orange");
		b3.addActionListener(this);
		add(b3);
		L=new Label("                    ");
		add(L);
	}
	public void actionPerformed(ActionEvent ae)
	{
		L.setText(ae.getActionCommand());
	}
}