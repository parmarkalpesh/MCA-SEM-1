import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="MenuDemo" width=400 height=200></applet>
*/
class MenuFrame extends Frame implements ActionListener,ItemListener,WindowListener
{
	MenuDemo mainapp;
	
	MenuFrame(String title,MenuDemo mainapp)
	{
		super(title);
		this.mainapp=mainapp;
		addWindowListener(this);
		MenuBar mb=new MenuBar();
		setMenuBar(mb);

		//a
		Menu a=new Menu("a");
		mb.add(a);
		MenuItem a1=new MenuItem("a1");
		a1.addActionListener(this);
		a.add(a1);
		MenuItem a2=new MenuItem("a2");
		a2.addActionListener(this);
		a.add(a2);
		MenuItem a3=new MenuItem("a3");
		a3.addActionListener(this);
		a.add(a3);
		
		//b
		Menu b=new Menu("b");
		mb.add(b);
		MenuItem b1=new MenuItem("b1");
		b1.addActionListener(this);
		b.add(b1);
		MenuItem b2=new MenuItem("b2");
		b2.addActionListener(this);
		b.add(b2);

		//b sub
		Menu b3=new Menu("b3");
		b.add(b3);
		MenuItem b31=new MenuItem("b31");
		b31.addActionListener(this);
		b3.add(b31);
		MenuItem b32=new MenuItem("b32");
		b32.addActionListener(this);
		b3.add(b32);

		//c
		Menu c=new Menu("c");
		mb.add(c);
		MenuItem c1=new MenuItem("c1");
		c1.addActionListener(this);
		c.add(c1);
		MenuItem c2=new MenuItem("c2");
		c2.addActionListener(this);
		c.add(c2);

		//d with checkbox
		Menu d=new Menu("d");
		mb.add(d);
		CheckboxMenuItem d1=new CheckboxMenuItem("d1");
		d1.addItemListener(this);
		d.add(d1);
		CheckboxMenuItem d2=new CheckboxMenuItem("d2");
		d2.addItemListener(this);
		d.add(d2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		mainapp.ta.append("ActionEvent "+ae.getActionCommand()+"\n");
	}
	public void itemStateChanged(ItemEvent ie)
	{
		CheckboxMenuItem cmi=(CheckboxMenuItem)ie.getSource();
		mainapp.ta.append("ItemEvent "+cmi.getLabel()+" State "+cmi.getState()+"\n");
	}
	public void windowActivated(WindowEvent we)
	{
	}
	public void windowClosed(WindowEvent we)
	{
	}
	public void windowClosing(WindowEvent we)
	{
		dispose();
	}
	public void windowDeactivated(WindowEvent we)
	{
	}
	public void windowIconified(WindowEvent we)
	{
	}
	public void windowDeiconified(WindowEvent we)
	{
	}
	public void windowOpened(WindowEvent we)
	{
	}
}
public class MenuDemo extends Applet
{
	TextArea ta;
	public void init()
	{
		MenuFrame mf=new MenuFrame("My Frame",this);
		mf.show();
		mf.setSize(200,200);
		ta=new TextArea(10,20);
		add(ta);
	}
}