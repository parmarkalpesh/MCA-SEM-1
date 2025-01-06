
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class MyCustomListener implements ActionListener 
{
	Login l = new Login();
	Registration r = new Registration();
	
	LoginFrame lf;
	AddRegistrationFrame arf;

	MyCustomListener(LoginFrame lf)
	{
		this.lf = lf;	
	}
	MyCustomListener(AddRegistrationFrame arf)
	{
		this.arf = arf;
			
	}

	public void actionPerformed(ActionEvent ae) 
	{
		
		if(ae.getActionCommand().equals("Submit"))
		{
		
				if(lf.t1.getText().equals(l.getUsername()) && lf.t2.getText().equals(l.getPassword()))
				{
				AddRegistrationFrame b = new AddRegistrationFrame();
				b.setBounds(100,100,600,600);
				b.setVisible(true);
				}
		}

		if(ae.getActionCommand().equals("Add Record"))
		{
			
			int val = JOptionPane.showConfirmDialog(arf,"Do you really want to add record in the file?","Confirm SAVE",JOptionPane.YES_NO_OPTION);
			if(val==0)
				{
				try
				{
				Writer w=new FileWriter("Record.doc");
				w.write(arf.t1.getText()+","+arf.t2.getText()+","+arf.t3.getText()+","+arf.ta.getText());
				w.flush();
				w.close();
				arf.t1.setText("");
				arf.t2.setText("");
				arf.t3.setText("");
				arf.ta.setText("");
				}
				catch(Exception e){}
				}
			else 
				{
				
				}
		}
		
		if(ae.getActionCommand().equals("View Record"))
		{
			
		}
	}
	
}









