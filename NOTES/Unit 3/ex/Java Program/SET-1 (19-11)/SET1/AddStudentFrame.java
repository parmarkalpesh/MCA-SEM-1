package MyPackage;
import java.awt.*;
import java.awt.event.*;

class AddStudentFrame extends Frame 
{
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2,t3,t4,t5;
	TextArea ta;
	Button b1,b2;
	MenuBar mbar;
	Menu myMenu;
	MenuItem setRecordItem,exitItem;
	MyCustomListener mcl = new MyCustomListener(this);
	
	AddStudentFrame()
	{
		super("Student Registration");
		setLayout(null);
		l1 = new Label("Rollno : ");
		l2 = new Label("First Name : ");
		l3 = new Label("Middle Name : ");
		l4 = new Label("Last Name : ");
		l5 = new Label("Address : ");
		l6 = new Label("Age : ");

		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();
		t5 = new TextField();
		ta = new TextArea();
		
		b1 = new Button("Add Record");
		b2 = new Button("Search Record");


		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(ta);
		add(t5);
		add(b1);
		add(b2);

		l1.setBounds(50,100,100,30);
		l2.setBounds(50,150,100,30);
		l3.setBounds(50,200,100,30);
		l4.setBounds(50,250,100,30);
		l5.setBounds(50,300,100,30);
		l6.setBounds(50,420,100,30);

		t1.setBounds(170,100,100,30);
		t2.setBounds(170,150,100,30);
		t3.setBounds(170,200,100,30);
		t4.setBounds(170,250,100,30);
		ta.setBounds(170,300,150,100);
		t5.setBounds(170,420,100,30);
		b1.setBounds(80,470,100,30);
		b2.setBounds(200,470,100,30);

		mbar = new MenuBar();
		myMenu = new Menu("My Menu");
		mbar.add(myMenu);
		setRecordItem = new MenuItem("Set the Record file");
		exitItem = new MenuItem("Exit");
		myMenu.add(setRecordItem);
		myMenu.add(exitItem);
		setMenuBar(mbar);

		b1.addActionListener(mcl);		
		b2.addActionListener(mcl);		

		setRecordItem.addActionListener(mcl);
		exitItem.addActionListener(mcl);

		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
	}
	public static void main(String []args)
	{
		AddStudentFrame a = new AddStudentFrame();
		a.setBounds(100,100,400,600);
		a.setVisible(true);
	}
}








