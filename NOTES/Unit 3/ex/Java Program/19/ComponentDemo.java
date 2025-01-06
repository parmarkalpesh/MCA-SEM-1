import java.awt.*;
import javax.swing.*;
class Test extends JFrame
{
	JLabel lbl;
	JButton b1;
	JTextField t1,t2;

	
	JTextArea ta;

	/*
	JList l1,l2;
	JChoice c1; // Combobox
	JCheckbox cb1,cb2,cb3,cb4,cb5;
	JCheckboxGroup cbg;

	JMenuBar mbar;
	JMenu filemenu,editmenu;
	JMenuItem mi1,mi2,mi3;
	*/

	Test()
	{
		super("Component Demo");
		setFont(new Font("Times New Roman",Font.BOLD,16));
		setLayout(new FlowLayout(FlowLayout.LEFT));

		lbl = new JLabel("This is called Label");

		b1  = new JButton("Click Me");

		t1 = new JTextField(10);

		t2 = new JTextField(10);
		ta = new JTextArea(10,30);
		
		//t2.setEchoChar('*');

		
		/*
		l1 = new List(3,true);
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
		*/
		add(lbl);
		add(b1);
		add(t1);
		add(t2);
		add(ta);

/*
		add(l1);
		add(l2);
		add(c1);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		*/
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