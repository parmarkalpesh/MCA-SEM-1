import MyPackage.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class NewFrame extends Frame
{ 
	Button display;
	TextField tfnm;
	TextArea tadetail;
	Checkbox cb1,cb2,cb3;
	CheckboxGroup cg; 
	MyCustomListener nl2;
 
	public NewFrame()
	{ 
		try
		{    
			setLayout(new FlowLayout());
			setSize(500,400);
			setVisible(true);

			display=new Button("Display");
			tfnm = new TextField(20);
			tfnm.setName("tfnm");
			tadetail = new TextArea();
			nl2 = new MyCustomListener(tadetail);
   
   			cg = new CheckboxGroup();
			cb1 = new Checkbox("First Name",true,cg);
   			cb2 = new Checkbox("Middle Name",false,cg);
   			cb3 = new Checkbox("Last Name",false,cg);
   			cb1.setName("First Name");
   			cb2.setName("Middle Name");
   			cb3.setName("Last Name");
   
   			tfnm.addTextListener(nl2);
   			cb1.addItemListener(nl2);
   			cb2.addItemListener(nl2);
   			cb3.addItemListener(nl2);
   
   			display.addActionListener(nl2);
   
   			add(cb1);
   			add(cb2);
   			add(cb3);
   			add(tfnm);
   			add(display);
   			add(tadetail);     
   
   			addWindowListener(nl2);
  		}
  		catch(Exception e)
  		{
   			System.out.println(e);
  		}
	}
}