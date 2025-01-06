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
class Test extends JFrame implements ActionListener,ItemListener,TextListener
{
	JLabel lbl;
	JButton b1,b2;
	JTextField t1,t2;
	JTextArea ta;
	JList l1,l2;
	JComboBox c1; // Combobox
	JCheckBox cb1,cb2,cb3,cb4,cb5;
	ButtonGroup cbg;
	JMenuBar mbar;
	JMenu filemenu,editmenu;
	JMenuItem mi1,mi2,mi3,openitem,saveitem;
	Test()
	{
		super("Component Demo");
		setFont(new Font("Times New Roman",Font.BOLD,16));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		lbl = new JLabel("This is called Label");
		b1  = new JButton("PrintName");
		b2  = new JButton("Reset");
		t1 = new JTextField(10);
		t2 = new JPasswordField(10);
		
		ta = new JTextArea("",5,10);

		String course[]={"MCA","MBA","Msc(IT)","Other","MCA","MBA","Msc(IT)","Other","MCA","MBA","Msc(IT)","Other"};
		l1 = new JList(course);
		l1.setVisibleRowCount(4);

		String sub[]={"FOP","Java","C++","Oracle"};
		l2 = new JList(sub);
		l2.setVisibleRowCount(4);
		
		c1 = new JComboBox();
		c1.addItem("Rajkot");
		c1.addItem("Baroda");
		c1.addItem("Ahmedabad");
		c1.addItem("Surat");

		cb1 = new JCheckBox("TV");
		cb2 = new JCheckBox("Freez");
		cb3 = new JCheckBox("Car");

		cbg = new ButtonGroup();
		cb4 = new JCheckBox("Male");
		cb5 = new JCheckBox("Female");
		cbg.add(cb4);
		cbg.add(cb5);
		
		mbar = new JMenuBar();
		setJMenuBar(mbar);

		filemenu = new JMenu("File");
		mi1 = new JMenuItem("New");
		filemenu.add(mi1);

		saveitem = new JMenuItem("Save");
		openitem = new JMenuItem("Open");
		filemenu.add(openitem);
		filemenu.add(saveitem);
		
		mi2 = new JMenuItem("Exit");
		filemenu.add(mi2);

		editmenu = new JMenu("Edit");
		mi3 = new JMenuItem("Cut");
		editmenu.add(mi3);

		mbar.add(filemenu);
		mbar.add(editmenu);

		add(lbl);
		add(b1);add(b2);
		add(t1);
		add(t2);
		add(new JScrollPane(ta));
		add(new JScrollPane(l1));
		add(new JScrollPane(l2));
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


		l2.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				ta.setText(l2.getSelectedValue()+"");
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
			ta.setText(c1.getSelectedItem()+"");

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
		super.paint(g);
		g.drawString(t1.getText(),100,450);
		g.drawString("TV is "+cb1.isSelected(),100,500);
		g.drawString("Freez is "+cb2.isSelected(),100,520);
		g.drawString("Car is "+cb3.isSelected(),100,540);
		if(cb4.isSelected())
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