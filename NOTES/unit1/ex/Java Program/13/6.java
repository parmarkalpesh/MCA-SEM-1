import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test extends Frame implements ActionListener
{
	Panel p1,p2;
	Button b1,b2,b3,b4;
	Label l1,l2;
	int i=0;
	Test()
	{
		super("Layout Demo");
		setFont(new Font("Times New Roman",Font.BOLD,20));
		b1 = new Button("First");
		
		p1 = new Panel();

		p1.setLayout(new GridLayout(1,1));
		p1.add(b1);
		
		
		add(p1,BorderLayout.WEST);


		b1.addActionListener(this);
		

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		l1 = new Label("Hello");
		l2 = new Label("Kapil");
		i++;
		if(i%2==0)
		{
		p1.add(l1);
		add(p1,BorderLayout.SOUTH);
		}
		else
		{
		p1.add(l2);
		add(p1,BorderLayout.SOUTH);
		}
		
	}
}


class TestDemo
{
	public static void main(String []args)
	{
		Test t = new Test();
		t.setBounds(100,100,500,400);
		t.setVisible(true);
	}	
}