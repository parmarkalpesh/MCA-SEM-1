import java.util.*;
import java.awt.*;
import java.awt.event.*;

class AddRegistrationFrame extends Frame 
{
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3;
	TextArea ta;
	Button b2,b3;
	
	MyCustomListener mcl1 = new MyCustomListener(this);
	
	AddRegistrationFrame()
	{
		super("Registration Form");
		setLayout(null);
		l1 = new Label("FirstName  : ");
		l2 = new Label("MiddleName : ");
		l3 = new Label("LastName   : ");
		l4 = new Label("Address    : ");
		l5 = new Label("Time : ");

		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		ta = new TextArea();

		b2 = new Button("Add Record");
		b3 = new Button("View Record");

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);

		add(t1);
		add(t2);
		add(t3);
		add(ta);
		
		add(b2);
		add(b3);

		l1.setBounds(50,100,100,30);
		l2.setBounds(50,150,100,30);
		l3.setBounds(50,200,100,30);
		l4.setBounds(50,250,100,30);
		l5.setBounds(50,500,200,30);

		t1.setBounds(170,100,100,30);
		t2.setBounds(170,150,100,30);
		t3.setBounds(170,200,100,30);
		ta.setBounds(170,250,200,100);

		b2.setBounds(50,360,100,30);
		b3.setBounds(170,360,100,30);
		
		b2.addActionListener(mcl1);
		b3.addActionListener(mcl1);		
				
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
					{
					dispose();
					}
		});
		
		//To Display Time
		Thread t = new Thread()
		{
			public void run()
			{
			 while(true)
			 {
				l5.setText((new Date()).toString());
				try{
				Thread.sleep(1000);
				}catch(Exception e){}
			  }
			}
		};
		t.start();
		
		
	}
	
}








