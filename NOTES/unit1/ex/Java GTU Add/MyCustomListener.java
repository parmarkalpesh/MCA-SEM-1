import MyPackage.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class MyCustomListener extends WindowAdapter implements TextListener, ActionListener, ItemListener
{
	Student st = new Student();
 	static String filename="a.txt";
    
	int cbstatus=1;
 	String searchname="";
 	TextArea t;
 	public MyCustomListener(){}
 	public MyCustomListener(TextArea t)
 	{
  		this.t=t;
 	}
 
 	public void actionPerformed(ActionEvent ae)
 	{
  		if(ae.getActionCommand().equals("Add Student"))
  		{
   			try
   			{     
    				FileOutputStream fos = new FileOutputStream(filename,true);
    				PrintStream p = new PrintStream(fos);
    				p.println(st.rollno+","+st.fname+","+st.mname+","+st.lname);
    				fos.close();
    				p.close();    
    				JOptionPane.showMessageDialog(null,"Record Added in File","Message",JOptionPane.INFORMATION_MESSAGE);
   			}
   			catch(IOException e)
   			{
    				System.out.println("Error - "+e);
   			}    
  		}
  		else if(ae.getActionCommand().equals("Search Student"))
  		{   
			new NewFrame();
  		}
		
  		else if(ae.getActionCommand().equals("Display"))
  		{    
   			try
   			{     
    				String str;
    				String sarr[];
    				FileReader fis = new FileReader(filename);
    				BufferedReader br = new BufferedReader(fis);
    				boolean flag = false;
    				while((str = br.readLine())!= null)
    				{
     					sarr = str.split(",");
     					String temp="";
     					
					if(cbstatus==1)
      						temp=sarr[1];
     					else if(cbstatus==2)
      						temp=sarr[2];
     					else if(cbstatus==3)
      						temp=sarr[3];
      
     					if(temp.equals(searchname))
     					{
						
      						String msg = "Student Roll No : "+sarr[0]+" \nFirst Name : "+sarr[1]+" \nMiddle Name : "+sarr[2]+" \nLast Name : "+sarr[3]+"\n\n";
					        JOptionPane.showMessageDialog(null,"Record Found","Message ",JOptionPane.INFORMATION_MESSAGE);
						
      						t.setText(msg);
      						flag = true;
						
					}
     
    				}
    				fis.close();
				br.close();
    
    				if(flag==false)
				     	JOptionPane.showMessageDialog(null,"Record not found for given detail","Message",JOptionPane.INFORMATION_MESSAGE);      
    
   			}
   			catch(IOException e)
   			{
    				System.out.println("Error - " +e);
   			}
  		}   
  		else if(ae.getActionCommand().equals("Set the record file"))
  		{
   			Frame ff = new Frame();    
   			FileDialog fd = new FileDialog(ff,"Choose a file", FileDialog.LOAD);
   			fd.setDirectory("C:\\");
   			fd.setFile("*.txt");
   			fd.setVisible(true);
   
   			filename = fd.getDirectory()+"\\"+fd.getFile();
  		}
  		else if(ae.getActionCommand().equals("Exit"))
  		{
   			System.exit(0);
  		}
 	}
	public void textValueChanged(TextEvent e) 
 	{
  		TextField tf = (TextField)e.getSource();
  
  		if(tf.getName().equals("tfrollno"))
   			st.rollno = Integer.parseInt(tf.getText());
  		else if(tf.getName().equals("tffname"))
   			st.fname = tf.getText();
  		else if(tf.getName().equals("tfmname"))
   			st.mname = tf.getText();
  		else if(tf.getName().equals("tflname"))
   			st.lname = tf.getText();
  		else if(tf.getName().equals("tfnm"))
   			searchname=tf.getText();
 	}
 	public void itemStateChanged(ItemEvent e)
 	{
  		Checkbox cb = (Checkbox)e.getSource();
  
  		if(cb.getName().equals("First Name"))
  		{
   			cbstatus=1;
  		}
  		else if(cb.getName().equals("Middle Name"))
  		{
   			cbstatus=2;
  		}
  		else  if(cb.getName().equals("Last Name"))
  		{
   			cbstatus=3;
  		}
 	}
	public void windowClosing(WindowEvent ae)
 	{
  		System.exit(0);
 	}
}
