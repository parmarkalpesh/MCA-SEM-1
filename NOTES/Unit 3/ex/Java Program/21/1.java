//Abstract Window Toolkit
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.*;
class Test extends Frame implements ActionListener,TextListener
{
	
	TextField t1;
	Label l1;
	
	Test()
	{
	

	super("My Frame");
	setFont(new Font("Arial",Font.BOLD,20));
	setLayout(null);


	t1=new TextField();
	t1.setBounds(50,50,250,30);
	add(t1);
	
	l1=new Label("");
	l1.setBounds(310,50,70,30);
	add(l1);
	t1.addTextListener(this);

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
	
	}

	public void textValueChanged(TextEvent te)
	{
		if(te.getSource()==t1)
			{
				Pattern p=Pattern.compile("[a-zA-Z0-9]{6}[a-zA-Z0-9]*@[a-zA-Z0-9]+[.][a-zA-Z]+");
				Matcher m=p.matcher(t1.getText());
				if(m.matches())
					{
					l1.setBackground(Color.GREEN);
					l1.setText("Correct");
					}
				else
					{
					l1.setBackground(Color.RED);
					l1.setText("Incorrect");
					}
			}
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
