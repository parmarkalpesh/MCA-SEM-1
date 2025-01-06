import MyPackage.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class AddStudentFrame extends Frame
{
	Button add;
	Button search;
	Label l1,l2,l3,l4;
	TextField tfrollno;
	TextField tffname;
	TextField tfmname;
	TextField tflname;
	Label lblnotification;
	MenuBar menubar; 

	MyCustomListener nl = new MyCustomListener();

	AddStudentFrame()
	{
		setLayout(new FlowLayout());
		setSize(300,300);
		setVisible(true);

		l1 = new Label("Roll No. : ");
		l2 = new Label("First Name : ");
		l3 = new Label("Middle Name : ");
		l4 = new Label("Last Name : ");
		tfrollno = new TextField(20);
		tffname = new TextField(20);
		tfmname = new TextField(20);
		tflname = new TextField(20);

		tfrollno.setName("tfrollno");
		tffname.setName("tffname");
		tfmname.setName("tfmname");
		tflname.setName("tflname");
		tfrollno.addTextListener(nl);
		tffname.addTextListener(nl);
		tfmname.addTextListener(nl);
		tflname.addTextListener(nl);


		add = new Button("Add Student");
		search = new Button("Search Student");
		lblnotification = new Label();
		add.addActionListener(nl);
		search.addActionListener(nl);
		
		addWindowListener(nl);
  
  		add(l1);  
		add(tfrollno);
		add(l2);  
		add(tffname);
		add(l3);  
		add(tfmname);
		add(l4);
		add(tflname);
		add(add);
		add(search);
		add(lblnotification);

		menubar = new MenuBar();
		Menu file = new Menu("Menu");   
	 
		MenuItem item1,item2;
		item1 = new MenuItem("Set the record file");
		file.add(item1);  
		item2 = new MenuItem("Exit");
		file.add(item2);  
  
		item1.addActionListener(nl);
		item2.addActionListener(nl);

		menubar.add(file);
		setMenuBar(menubar);
	} 
}
