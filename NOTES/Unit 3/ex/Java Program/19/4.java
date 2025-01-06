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
		b1.setBounds(50,50,100,50);
		add(b1);
		b2 = new Button("South");
		b2.setBounds(150,50,100,50);
		add(b2);
		b3 = new Button("East");
		b3.setBounds(250,50,100,50);
		add(b3);
		b4 = new Button("West");
		b4.setBounds(350,50,100,50);
		add(b4);

		ta = new TextArea();
		ta.setBounds(50,100,400,400);
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
	t.setBounds(100,100,500,550);
	t.setVisible(true);
	}
}
