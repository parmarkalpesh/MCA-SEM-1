import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ListDemo" width=400 height=200>
</applet>
*/
public class ListDemo extends Applet implements ActionListener,ItemListener
{
	TextArea ta;

	public void init()
	{
		List L=new List();
		L.add("Banana");
		L.add("Apple");
		L.add("Pineapple");
		L.addActionListener(this);
		L.addItemListener(this);
		add(L);

		ta=new TextArea(10,20);
		add(ta);
	}
	public void actionPerformed(ActionEvent ae)
	{
		ta.append("Action Event "+ae.getActionCommand()+"\n");
	}
	public void itemStateChanged(ItemEvent ie)
	{
		List L1=(List)ie.getItemSelectable();
		ta.append("Item Event "+L1.getSelectedItem()+"\n");
	}
}