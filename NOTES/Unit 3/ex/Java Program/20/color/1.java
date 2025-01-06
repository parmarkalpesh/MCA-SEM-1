import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
class Test extends JFrame implements ChangeListener
{
	JColorChooser c = new JColorChooser();
	JLabel lbl = new JLabel("ATMIYA INSTITUTE - MCA RAJKOT",JLabel.CENTER);
	Test()
	{
		lbl.setFont(new Font("Times New Roman",Font.BOLD,20));
		lbl.setForeground(Color.YELLOW);
		lbl.setBackground(Color.BLUE);
		//lbl.setOpaque(true);
		add(lbl);
		add(c,BorderLayout.PAGE_END);
		c.getSelectionModel().addChangeListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void stateChanged(ChangeEvent ce)
	{
		lbl.setForeground(c.getColor());	
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