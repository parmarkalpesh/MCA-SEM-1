import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test extends JFrame
{
	JTabbedPane jtb;
	Test()
	{
		super("Tabbed Pane Demo");	
		jtb = new JTabbedPane();
		jtb.addTab("Cities",new Cities());
		jtb.addTab("Colors",new Colors());
		jtb.addTab("Courses",new Courses());
		jtb.addTab("Login",new Login());
		add(jtb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}	
}

class Cities extends JPanel
{
	JComboBox jcb;
	Cities()
	{
		jcb = new JComboBox();
		jcb.addItem("Rajkot");	
		jcb.addItem("Surat");
		jcb.addItem("Baroda");
		jcb.addItem("Ahmedabad");
		add(jcb);

	}
}
class Colors extends JPanel
{
	JCheckBox cb1,cb2,cb3;
	Colors()
	{
		cb1 = new JCheckBox("Red");
		cb2 = new JCheckBox("Green");
		cb3 = new JCheckBox("Blue");
		add(cb1);
		add(cb2);
		add(cb3);
	}
}
class Login extends JPanel implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	Login()
	{
		setLayout(null);	
		l1 = new JLabel("Username : ");
		add(l1);
		t1 = new JTextField();
		add(t1);
		l2 = new JLabel("Password : ");
		add(l2);
		t2 = new JPasswordField();
		add(t2);

		b1 = new JButton("Login");
		add(b1);

		b1.addActionListener(this);

		l1.setBounds(50,50,100,30);
		t1.setBounds(170,50,100,30);
		l2.setBounds(50,100,100,30);
		t2.setBounds(170,100,100,30);
		b1.setBounds(130,150,100,30);

	}	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			if(t1.getText().equals("Atmiya") && t2.getText().equals("123456"))
			{
				JOptionPane.showMessageDialog(this,"Welcome User Atmiya");							
			}
			else						
				JOptionPane.showMessageDialog(this,"Incorrect Username or Password","Logic Message",JOptionPane.ERROR_MESSAGE);
		}
	}
}

class Courses extends JPanel
{
	JRadioButton r1,r2,r3;
	Courses()
	{
		r1 = new JRadioButton("MCA");
		r2 = new JRadioButton("MBA");
		r3 = new JRadioButton("MSc(IT)");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		add(r1);
		add(r2);
		add(r3);
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






