import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

abstract class MyAdapter implements WindowListener
{
	public void windowDeactivated(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	public void windowClosing(WindowEvent we){}

}
class Test extends Frame implements ActionListener,ItemListener,TextListener
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
	MenuItem mi1,mi2,mi3,openitem,saveitem;
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

		saveitem = new MenuItem("Save");
		openitem = new MenuItem("Open",new MenuShortcut(KeyEvent.VK_O));
		filemenu.add(openitem);
		filemenu.add(saveitem);
		filemenu.addSeparator();
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
		
		openitem.addActionListener(this);
		saveitem.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});

		lbl.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				System.out.println("Label clicked");
			}
		});

		t1.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent ke)
			{
				System.out.println("Key pressed in TextField1");	
			}
		});

		ta.addFocusListener(new FocusAdapter()
		{
			public void focusGained(FocusEvent fe)
			{
				System.out.println("Text Area got the focus");
			}
			public void focusLost(FocusEvent fe)
			{
				System.out.println("lost focus from textArea");
			}
		});

		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseDragged(MouseEvent me)
			{
				System.out.println("Mouse Dragged");
			}
			public void mouseMoved(MouseEvent me)
			{
				System.out.println("Mouse move");
			}
		});

		addMouseWheelListener(new MouseAdapter()
		{
			public void mouseWheelMoved(MouseWheelEvent me)
			{
				System.out.println("Wheel scrolling");
			}
		});

	}
	

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
		if(ae.getSource()==openitem)
		{
			FileDialog fd = new FileDialog(this,"My Open");
			fd.setVisible(true);
			try{
			BufferedReader br = new BufferedReader(new FileReader(fd.getDirectory()+"\\"+fd.getFile()));
			String str;
			ta.setText("");
			while((str=br.readLine())!=null)
				ta.append(str+"\n");
			}catch(Exception e){}
			
		}
		if(ae.getSource()==saveitem)
		{
			FileDialog fd = new FileDialog(this,"Save",FileDialog.SAVE);
			fd.setVisible(true);
			try{
			FileWriter fw = new FileWriter(fd.getDirectory()+"\\"+fd.getFile());
			fw.write(ta.getText());
			fw.close();
			}catch(Exception e){}
			
		}
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
class TestDemo
{
	public static void main(String []args)
	{
		Test t = new Test();
		t.setBounds(100,100,700,500);
		t.setVisible(true);
	}
}