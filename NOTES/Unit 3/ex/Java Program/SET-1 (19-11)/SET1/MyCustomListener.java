package MyPackage;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
class MyCustomListener implements ActionListener
{
	Student s = new Student();
	AddStudentFrame asf;
	NewSearchFrame ns;
	File f = new File("Student.doc");
	MyCustomListener(AddStudentFrame asf)
	{
		this.asf = asf;	
	}
	MyCustomListener(NewSearchFrame ns)
	{
		this.ns = ns;	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Add Record"))
		{
			save();
		}
		if(ae.getActionCommand().equals("Search Record"))
		{
			new NewSearchFrame();
		}
		if(ae.getActionCommand().equals("Display"))
		{
			if(ns.c1.getState())
				search("fname",ns.tfsearch.getText());
			if(ns.c2.getState())
				search("mname",ns.tfsearch.getText());
			if(ns.c3.getState())
				search("lname",ns.tfsearch.getText());
		}
		if(ae.getActionCommand().equals("Exit"))
		{
			System.exit(0);
		}
		if(ae.getActionCommand().equals("Set the Record file"))
		{
			FileDialog fd = new FileDialog(asf,"Save As",FileDialog.SAVE);
			fd.setVisible(true);
			f = new File(fd.getDirectory()+"//"+fd.getFile());
			save();
		}
	}
	public void search(String name,String searchStr)
	{
		boolean found = false;
		try{
			BufferedReader br = new BufferedReader(new FileReader("Student.doc"));
			String str;
			ns.ta.setText(" ");
			while((str = br.readLine())!=null)
			{
				String s[] = str.split(",");
				if(s[1].equals(searchStr) && name.equals("fname"))
				{
					ns.ta.append(str+"\n");
					found=true;
				}
				if(s[2].equals(searchStr) && name.equals("mname"))
				{
					ns.ta.append(str+"\n");
					found=true;
				}
				if(s[3].equals(searchStr) && name.equals("lname"))
				{
					ns.ta.append(str+"\n");
					found=true;
				}
			}

		}catch(Exception e){}
		if(!found)
			JOptionPane.showMessageDialog(ns,"Record Not Found....");
	}
	public void save()
	{
		s.rno = Integer.parseInt(asf.t1.getText());
		s.fname=asf.t2.getText();
		s.mname=asf.t3.getText();
		s.lname=asf.t4.getText();
		s.adrs=asf.ta.getText();
		s.age=Integer.parseInt(asf.t5.getText());
		System.out.println(s);

		try{
			FileWriter fw = new FileWriter(f,true);
			fw.write(s+"\n");
			fw.close();
			JOptionPane.showMessageDialog(asf,"Record Inserted Successfully...");
			resetControl();
		}catch(Exception e){}
	}
	public void resetControl()
	{
		asf.t1.setText("");
		asf.t2.setText("");
		asf.t3.setText("");
		asf.t4.setText("");
		asf.t5.setText("");
		asf.ta.setText("");
	}
}









