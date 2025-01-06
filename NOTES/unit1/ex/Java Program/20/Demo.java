//Abstract Window Toolkit
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test extends Frame implements ActionListener
{
	Label l1;
	Button b1;
	TextField t1;
	int i=0,l=0;
	Test()
	{
	super("My Frame");
	setFont(new Font("Arial",Font.BOLD,20));
	setLayout(null);

	l1 = new Label("Kapil Shukla");
	l1.setBounds(50,200,100,30);
	add(l1);

	l1.setForeground(Color.RED);
	setBackground(Color.YELLOW);

	t1=new TextField();
	t1.setBounds(50,50,150,30);
	t1.setForeground(Color.YELLOW);
	t1.setBackground(Color.BLACK);
	add(t1);

	b1=new Button("Submit");
	b1.setBounds(50,100,150,30);
	add(b1);
	
	b1.addActionListener(this);

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
	this.i++;
	if(this.i%2!=0)
		{
		//How to Show MessageBox
		JOptionPane.showMessageDialog(this,"Now ForeGraound - BackGround - Cursor - Loacation will Change","Kapil Shukla Custom Message",JOptionPane.INFORMATION_MESSAGE);
		
		this.setForeground(Color.yellow);
		this.setBackground(Color.black);
		this.setCursor(i%13);
		this.setLocation(10,10);
		}
	else
		{
		//How to Show Confirm Dialog
		l = JOptionPane.showConfirmDialog(this,"Do you want to Change it ?"," Confirmation ",JOptionPane.YES_NO_OPTION);
			if(l==JOptionPane.YES_OPTION)
			{
			this.setForeground(Color.black);
			this.setBackground(Color.yellow);
			this.setCursor(i%13);
			this.setLocation(100,100);
			}
			else
			{
			JOptionPane.showMessageDialog(this,"No change will be occur","Kapil Shukla Custom Message",JOptionPane.INFORMATION_MESSAGE);
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
