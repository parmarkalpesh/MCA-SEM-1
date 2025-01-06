import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ChoiceDemo" width=400 height=200>
</applet>
*/
public class ChoiceDemo extends Applet implements ItemListener
{
	Label L;
	public void init()
	{
		Choice ch=new Choice();
		ch.addItem("Red");
		ch.addItem("Green");
		ch.addItem("Blue");
		ch.addItem("Pink");
		ch.addItem("Black");
		ch.addItemListener(this);
		add(ch);
		L=new Label("                      ");
		add(L);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		Choice ch=(Choice)ie.getItemSelectable();
		L.setText(ch.getSelectedItem());
	}
}