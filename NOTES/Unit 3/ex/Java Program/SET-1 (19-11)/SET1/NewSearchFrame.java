package MyPackage;

import java.awt.*;
import java.awt.event.*;

class NewSearchFrame extends Frame 
{
	
	Checkbox c1,c2,c3;
	CheckboxGroup cbg;
	TextField tfsearch;
	Label l1;
	TextArea ta;
	Button b1;
	MyCustomListener mcl = new MyCustomListener(this);
	
	NewSearchFrame()
	{
		super("Search Frame");
		setLayout(null);

		cbg = new CheckboxGroup();
		c1 = new Checkbox("First Name",cbg,true);
		c2 = new Checkbox("Middle Name",cbg,false);
		c3 = new Checkbox("Last Name",cbg,false);

		add(c1);
		add(c2);
		add(c3);

		l1 = new Label("Enter Value to Search : ");
		add(l1);
		tfsearch = new TextField();
		add(tfsearch);
		
		ta = new TextArea();
		add(ta);
	
		b1 = new Button("Display");
		add(b1);

		c1.setBounds(50,50,100,30);
		c2.setBounds(160,50,100,30);
		c3.setBounds(270,50,100,30);
		l1.setBounds(50,100,140,30);
		tfsearch.setBounds(210,100,100,30);
		ta.setBounds(80,150,230,200);
		b1.setBounds(140,370,100,30);


		b1.addActionListener(mcl);
		setBounds(300,100,400,500);

		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
	}
}








