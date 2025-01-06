import java.awt.event.*;
import java.io.*;
import javax.swing.*;
class MyCustomListener implements ActionListener
{
	AddDataFrame adf;
	MyCustomListener(AddDataFrame adf)
	{
		this.adf=adf;
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Add"))
			save();		
		if(ae.getActionCommand().equals("Delete"))		
			delete();
		if(ae.getActionCommand().equals("Search"))
			search();
		if(ae.getActionCommand().equals("Exit"))
			System.exit(0);
	}	

	public void save()
	{
		try{
			FileWriter fw = new FileWriter("Stud.txt",true);

			for(int i=0;i<5;i++)
			{
				fw.write(adf.t[i].getText());
				if(i!=4)
					fw.write(",");
				else
					fw.write("\n");
			}
			fw.close();

			JOptionPane.showMessageDialog(adf,"Record Inserted successfully...");
		}catch(Exception e){}
		resetControl();
	}
	public void search()
	{
			boolean found=false;
			String searchstr = JOptionPane.showInputDialog(adf,"Enter Name Search : ");	
		
			try{
			BufferedReader br = new BufferedReader(new FileReader("Stud.txt"));
			String str;
			while((str = br.readLine())!=null)
			{
				String s[]=str.split(",");
				if(s[1].equals(searchstr))
				{
					fillData(str);
					found=true;
				}
			}
			}catch(Exception e){}
			if(!found)
				JOptionPane.showMessageDialog(adf,"Record not found....");

	}
	public void delete()
	{
			boolean found=false;
			String delrno = JOptionPane.showInputDialog(adf,"Enter Rollno to Delete : ");
			try{
			BufferedReader br = new BufferedReader(new FileReader("Stud.txt"));
			CharArrayWriter cw = new CharArrayWriter();
			String str;
			while((str = br.readLine())!=null)
			{
				String s[]=str.split(",");
				if(s[0].equals(delrno))					
					found=true;
				else
					cw.write(str+"\n");
			}			
			if(found)
			{
				FileWriter fw = new FileWriter("Stud.txt");
				cw.writeTo(fw);
				fw.close();
				JOptionPane.showMessageDialog(adf,"Record Deleted successfully...");
			}
			else
				JOptionPane.showMessageDialog(adf,"Record not found...");	
			}catch(Exception e){}		
	}
	public void fillData(String str)
	{
		String s[] = str.split(",");
		for(int i=0;i<adf.t.length;i++)
			adf.t[i].setText(s[i]);
	}
	public void resetControl()
	{
		for(int i=0;i<adf.t.length;i++)
			adf.t[i].setText("");
	}
}


