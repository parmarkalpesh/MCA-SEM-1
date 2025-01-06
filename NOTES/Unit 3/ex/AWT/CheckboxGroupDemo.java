import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="CheckboxGroupDemo" width=400 height=200>
</applet>
*/
public class CheckboxGroupDemo extends Applet implements ItemListener
{
	Label L;
	public void init()
	{
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox cb1=new Checkbox("Apple",cbg,true);
		cb1.addItemListener(this);
		add(cb1);
		Checkbox cb2=new Checkbox("Banana",cbg,false);
		cb2.addItemListener(this);
		add(cb2);
		Checkbox cb3=new Checkbox("Orange",cbg,false);
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