//Abstract Window Toolkit
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test extends Frame implements ActionListener
{
	Button b1,b2;
	TextField t1,t2;
	Label lbl1,lbl2;
	Choice c1; // Combobox
	List l1,l2;
	Checkbox cb1,cb2,cb3,cb4,cb5;
	CheckboxGroup cbg;
	Test()
	{
		super("BorderLayout Demo");
		setFont(new Font("Arial",Font.BOLD,20));
		setLayout(null);

		lbl1 = new Label("UserName ");
		lbl1.setBounds(50,50,200,30);
		add(lbl1);

		lbl2 = new Label("Password ");
		lbl2.setBounds(50,100,200,30);
		add(lbl2);

		t1 = new TextField();
		t1.setBounds(260,50,200,30);
		add(t1);

		t2 = new TextField();
		t2.setBounds(260,100,200,30);
		t2.setEchoChar('*');
		add(t2);

		b1 = new Button("Submit");
		b1.setBounds(50,150,200,30);
		add(b1);

		b2 = new Button("Clear");
		b2.setBounds(260,150,200,30);
		add(b2);

		
		b1.addActionListener(this);
		b2.addActionListener(this);


	addWindowListener(new WindowAdapter() 
		{
      		public void windowClosing(WindowEvent e) 
		{
        		System.exit(0);
      		}
		});
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			{
			//t2.setText(t1.getText());
			if(t1.getText().equals("admin") &&  t2.getText().equals("1234"))
				{
				JOptionPane.showMessageDialog(this,"Welcome Admin");
				}
			else
				{
				JOptionPane.showMessageDialog(this,"Incorrect Usename / Password","Login Message",JOptionPane.ERROR_MESSAGE);
				}
			}
		if(ae.getSource()==b2)
			{
			t1.setText("");
			t2.setText("");
			}
	}
}

class TestDemo
{
	public static void main(String s[])
	{
	Test t=new Test();
	t.setBounds(100,100,500,550);
	t.setVisible(true);
	}
}
