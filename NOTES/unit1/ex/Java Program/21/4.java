import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class Test extends Frame implements ActionListener
{
	Button b1,b2,b3,b4;
	BufferedReader br;
	ArrayList <String>al;
	ListIterator li;
	
	Test()
	{
		setLayout(new FlowLayout());
		readData();
		b1 = new Button("Next");
		b2 = new Button("Previous");
		b3 = new Button("First");
		b4 = new Button("Last");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void readData()
	{
		try{
		br = new BufferedReader(new FileReader("student.txt"));
		al = new ArrayList<String>();
		String str;
		while((str=br.readLine())!=null)
			al.add(str);
		}catch(Exception e){}
		li = al.listIterator();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			if(li.hasNext())
				System.out.println(li.next());			
		}
		if(ae.getSource()==b2)
		{
			if(li.hasPrevious())
				System.out.println(li.previous());			
		}
		if(ae.getSource()==b3)
		{
			while(li.hasPrevious())
				li.previous();	
			System.out.println(li.next());
		}
		if(ae.getSource()==b4)
		{
			while(li.hasNext())
				li.next();
			System.out.println(li.previous());		
		}
	}
}
class TestDemo
{
	public static void main(String []args) throws Exception
	{
		Test t = new Test();
		t.setBounds(100,100,500,500);
		t.setVisible(true);
	}
}