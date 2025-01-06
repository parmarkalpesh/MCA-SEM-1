import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="CheckboxDemo" width=400 height=200>
</applet>
*/
public class CheckboxDemo extends Applet implements ItemListener
{
	Label L;
	public void init()
	{
		Checkbox cb1=new Checkbox("Apple");
		cb1.addItemListener(this);
		add(cb1);
		Checkbox cb2=new Checkbox("Banana");
		cb2.addItemListener(this);
		add(cb2);
		Checkbox cb3=new Checkbox("Orange");
		cb3.addItemListener(this);
		add(cb3);
		L=new Label("                      ");
		add(L);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		Checkbox cb=(Checkbox)ie.getItemSelectable();
		L.setText(cb.getLabel()+" "+cb.getState());
	}
}