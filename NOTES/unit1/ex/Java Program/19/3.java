//Abstract Window Toolkit
import java.awt.*;
import java.awt.event.*;
class Test extends Frame implements ActionListener
{
	Button b1,b2,b3,b4;
	TextArea ta;
	TextField t1,t2;
	Label lbl;
	Choice c1; // Combobox
	List l1,l2;
	Checkbox cb1,cb2,cb3,cb4,cb5;
	CheckboxGroup cbg;
	Test()
	{
		super("BorderLayout Demo");
		setLayout(null);
		b1 = new Button("North");
		add(b1,BorderLayout.NORTH);
		b2 = new Button("South");
		add(b2,BorderLayout.SOUTH);
		b3 = new Button("East");
		add(b3,BorderLayout.EAST);
		b4 = new Button("West");
		add(b4,BorderLayout.WEST);

		ta = new TextArea();
		add(ta);
		setFont(new Font("Times New Roman",Font.BOLD,20));

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			ta.setText("You clicked North");
		if(ae.getSource()==b2)
			ta.setText("You clicked South");
		if(ae.getActionCommand().equals("East"))
			ta.setText("You clicked East");
		if(ae.getSource()==b4)
			ta.setText("You clicked West");

	}
}

class TestDemo
{
	public static void main(String s[])
	{
	Test t=new Test();
	t.setBounds(100,100,400,400);
	t.setVisible(true);
	}
}
