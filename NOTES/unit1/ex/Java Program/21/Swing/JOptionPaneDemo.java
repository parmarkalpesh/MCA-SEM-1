import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

class Test extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	Test()
	{
		super("JOptionPane Demo");
		setLayout(new FlowLayout());
		b1 = new JButton("Show Message");
		b2 = new JButton("Give Confirmation");
		b3 = new JButton("Enter Input");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			JOptionPane.showMessageDialog(this,"This is Message Dialog","Title",JOptionPane.QUESTION_MESSAGE);
		if(ae.getSource()==b2)
		{
			int val = JOptionPane.showConfirmDialog(this,"Are You Sure","Confirm Your input",1,0);
			if(val==0)
				System.out.println("Yes pressed");
			else if(val==1)
				System.out.println("No pressed");
			else
				System.out.println("Cancel pressed");
		}

		if(ae.getSource()==b3){
			String name=JOptionPane.showInputDialog(this,"Enter Your Name");
			System.out.println(name);
		}
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




