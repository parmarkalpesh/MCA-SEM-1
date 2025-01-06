import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test extends Frame implements ActionListener
{
	Panel p1,p2;
	Button b1,b2,b3,b4;
	CardLayout cl;
	Test()
	{
		super("Layout Demo");
		setFont(new Font("Times New Roman",Font.BOLD,20));
		b1 = new Button("First");
		b2=new Button("Last");
		b3=new Button("Next");
		b4=new Button("Previous");
		p1 = new Panel();
		p1.setLayout(new GridLayout(2,2));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		add(p1,BorderLayout.WEST);

		cl = new CardLayout();
		p2 = new Panel();
		p2.setLayout(cl);
		add(p2);

		p2.add(new Card1(),"Card1");
		p2.add(new Card2(),"Card2");
		p2.add(new Card3(),"Card3");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

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
		if(ae.getSource()==b1)
			cl.first(p2);
		if(ae.getSource()==b2)
			cl.last(p2);
		if(ae.getSource()==b3)
			cl.next(p2);
		if(ae.getSource()==b4)
			cl.previous(p2);
	}
}
class Card1 extends Panel implements ActionListener
{
	Button b1,b2,b3,b4;
	TextArea ta;
	Card1()
	{
		setLayout(new BorderLayout());
		setFont(new Font("Times New Roman",Font.BOLD,20));
		b1 = new Button("South");
		add(b1,BorderLayout.SOUTH);
		b2 = new Button("North");
		add(b2,BorderLayout.NORTH);
		b3 = new Button("West");
		add(b3,BorderLayout.WEST);
		b4 = new Button("East");
		add(b4,BorderLayout.EAST);

		ta = new TextArea();
		add(ta);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			ta.setText("South is clicked");
		if(ae.getSource()==b2)
			ta.setText("North is clicked");
		if(ae.getSource()==b3)
			ta.setText("West is clicked");
		if(ae.getSource()==b4)
			ta.setText("East is clicked");
	}
}

class Card2 extends Panel implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	Card2()
	{
		setLayout(null);
		setFont(new Font("Times New Roman",Font.BOLD,20));
		l1 = new Label("Username");
		l2 = new Label("Password");
		t1= new TextField();
		t2= new TextField();
		t2.setEchoChar('*');
		b1 = new Button("Login");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);

		l1.setBounds(50,50,100,30);
		l2.setBounds(50,100,100,30);
		t1.setBounds(170,50,100,30);
		t2.setBounds(170,100,100,30);
		b1.setBounds(110,150,100,30);
	
		b1.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			if(t1.getText().equals("Atmiya") && t2.getText().equals("Test"))
			{
				JOptionPane.showMessageDialog(this,"Welcome Atmiya");
			}
			else
				JOptionPane.showMessageDialog(this,"Incorrect Username and Password","Login Screen",JOptionPane.ERROR_MESSAGE);
		}		
	}
}

class Card3 extends Panel implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	Card3()
	{
		setLayout(null);
		setFont(new Font("Times New Roman",Font.BOLD,20));
		l1 = new Label("Enter No1");
		l2 = new Label("Enter No2");
		t1= new TextField();
		t2= new TextField();
		b1 = new Button("Total");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);

		l1.setBounds(50,50,100,30);
		l2.setBounds(50,100,100,30);
		t1.setBounds(170,50,100,30);
		t2.setBounds(170,100,100,30);
		b1.setBounds(110,150,100,30);
	
		b1.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int tot = Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
			JOptionPane.showMessageDialog(this,"Sum of two no = "+tot);		
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