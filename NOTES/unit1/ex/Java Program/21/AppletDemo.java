// An Applet skeleton.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="AppletSkel" width=300 height=100>
</applet>
*/








public class AppletSkel extends Applet 
{


class Test extends Frame implements ActionListener,ItemListener,TextListener,WindowListener
{
	Label lbl;
	Button b1,b2;
	TextField t1,t2;
	TextArea ta;
	List l1,l2;
	Choice c1; // Combobox
	Checkbox cb1,cb2,cb3,cb4,cb5;
	CheckboxGroup cbg;
	MenuBar mbar;
	Menu filemenu,editmenu;
	MenuItem mi1,mi2,mi3;
	Test()
	{
		super("Component Demo");
		setFont(new Font("Times New Roman",Font.BOLD,16));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		lbl = new Label("This is called Label");
		b1  = new Button("PrintName");
		b2  = new Button("Reset");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t2.setEchoChar('*');
		ta = new TextArea();
		l1 = new List(4,true);
		l1.add("Oracle");
		l1.add("Java");
		l1.add("DC-1");
		l1.add("C");
		l1.add("C++");

		l2 = new List();
		l2.add("MCA");
		l2.add("MBA");
		l2.add("Msc(IT)");
		l2.add("Other");
		
		c1 = new Choice();
		c1.add("Rajkot");
		c1.add("Baroda");
		c1.add("Ahmedabad");
		c1.add("Surat");

		cb1 = new Checkbox("TV");
		cb2 = new Checkbox("Freez");
		cb3 = new Checkbox("Car");

		cbg = new CheckboxGroup();
		cb4 = new Checkbox("Male",cbg,true);
		cb5 = new Checkbox("Female",cbg,false);

		mbar = new MenuBar();
		setMenuBar(mbar);

		filemenu = new Menu("File");
		mi1 = new MenuItem("New");
		filemenu.add(mi1);
		mi2 = new MenuItem("Exit");
		filemenu.add(mi2);

		editmenu = new Menu("Edit");
		mi3 = new MenuItem("Cut");
		editmenu.add(mi3);

		mbar.add(filemenu);
		mbar.add(editmenu);

		add(lbl);
		add(b1);add(b2);
		add(t1);
		add(t2);
		add(ta);
		add(l1);
		add(l2);
		add(c1);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);

		b1.addActionListener(this);
		b2.addActionListener(this);
		mi2.addActionListener(this);
		t1.addActionListener(this);
		t1.addTextListener(this);
		l2.addActionListener(this);
		l2.addItemListener(this);
		c1.addItemListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);

		addWindowListener(this);
	}
	public void windowDeactivated(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	public void windowClosing(WindowEvent we){System.exit(0);}

	public void textValueChanged(TextEvent te)
	{
		repaint();
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
			ta.setText(c1.getSelectedItem());

		if(ie.getSource()==l2)
			ta.setText(l2.getSelectedItem());

		repaint();	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			t1.setText("Kapil");
		if(ae.getSource()==b2)
			t1.setText("");
		if(ae.getSource()==mi2)
			System.exit(0);
		if(ae.getSource()==t1)		
			ta.setText(t1.getText());
		if(ae.getSource()==l2)
			t1.setText(l2.getSelectedItem());
	}	
	public void paint(Graphics g)
	{
		g.drawString(t1.getText(),100,450);
		g.drawString("TV is "+cb1.getState(),100,500);
		g.drawString("Freez is "+cb2.getState(),100,520);
		g.drawString("Car is "+cb3.getState(),100,540);
		if(cb4.getState())
			g.drawString("He is Male",100,560);
		else
			g.drawString("She is Female",100,560);
	}
}




	// Called first.
	public void init() 
	{
	// initialization
	Test t1=new Test();
	}

/* Called second, after init(). Also called whenever
the applet is restarted. */

	public void start() 
	{
	// start or resume execution
	}
// Called when the applet is stopped.
	public void stop() 
	{
	// suspends execution
	}

/* Called when applet is terminated. This is the last
method executed. */

	public void destroy() 
	{
	// perform shutdown activities
	}

// Called when an applet's window must be restored.
	public void paint(Graphics g) 
	{
	// redisplay contents of window
	}
}