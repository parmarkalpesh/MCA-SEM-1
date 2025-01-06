//Abstract Window Toolkit
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test extends Frame implements ActionListener,MouseMotionListener
{
	
	TextField t1;
	int i=0,l=0;
	Test()
	{
	

	super("My Frame");
	setFont(new Font("Arial",Font.BOLD,20));
	setLayout(null);


	t1=new TextField();
	t1.setBounds(50,50,150,30);
	add(t1);
	
	
	t1.addMouseMotionListener(this);

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

	

public void mouseMoved(MouseEvent e)
	{
	JOptionPane.showMessageDialog(this,"Click Loacation is textBox 1","Custom Message",JOptionPane.INFORMATION_MESSAGE);
	}

public void mouseDragged(MouseEvent e)
	{
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
