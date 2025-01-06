import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test extends JFrame
{	
	Test()
	{
		super("JTable Demo");
		String data[][] = {
					{"101","Ram Kapoor","9878425"},
					{"102","Laxman Prasad","985432"},
					{"103","Jodha Akbar","986567"},
					{"104","Maharana Pratap","98565645"},
				};
		String col[] = {"Rno","Name","Mobile"};

		JTable tab = new JTable(data,col);
		JScrollPane jsp = new JScrollPane(tab);
		add(jsp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
class TestDemo
{
	public static void main(String []args)
	{
		Test t = new Test();
		t.setBounds(100,100,500,500);
		t.setVisible(true);
	}	
}