import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class ViewRecord extends JFrame
{
	JTable tab;
	BufferedReader br;
	String data[][] = new String[6][6];
	String col[] = {"Rollno","Firstname","MiddleName","Lastname","Adrs","Age"};
	ViewRecord()
	{		
		getData();
		tab = new JTable(data,col);
		JScrollPane jsp = new JScrollPane(tab);
		tab.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,16));
		tab.setFont(new Font("Times New Roman",Font.PLAIN,16));
		add(jsp);

		setBounds(300,200,500,400);
		setVisible(true);
	}
	public void getData()
	{
		try{
		br = new BufferedReader(new FileReader("Student.txt"));
		String str;
		int i=0;
		while((str=br.readLine())!=null)
		{
			String s[] = str.split(",");
			for(int j=0;j<6;j++)
			{
				data[i][j]=s[j];	
			}	
			i++;
		}
		}catch(Exception e){}
	}
}
