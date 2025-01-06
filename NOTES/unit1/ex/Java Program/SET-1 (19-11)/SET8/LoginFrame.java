
import java.awt.*;
import java.awt.event.*;

class LoginFrame extends Frame 
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	
	MyCustomListener mcl = new MyCustomListener(this);
	
	LoginFrame()
	{
		super("Login Form");
		setLayout(null);
		l1 = new Label("Username : ");
		l2 = new Label("Password : ");
		
		t1 = new TextField();
		t2 = new TextField();
		
		b1 = new Button("Submit");
		
		add(l1);
		add(l2);
		
		add(t1);
		add(t2);
		
		add(b1);
		
		l1.setBounds(50,100,100,30);
		l2.setBounds(50,150,100,30);
		
		t1.setBounds(170,100,100,30);
		t2.setBounds(170,150,100,30);
		
		b1.setBounds(100,200,100,30);
		
		b1.addActionListener(mcl);		
				
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
					{
					System.exit(0);
					}
		});
	}
	public static void main(String []args)
	{
		LoginFrame a = new LoginFrame();
		a.setBounds(100,100,400,400);
		a.setVisible(true);
	}
}








