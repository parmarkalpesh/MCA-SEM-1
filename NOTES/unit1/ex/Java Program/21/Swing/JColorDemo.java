import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class Test extends JFrame implements ChangeListener
{	
	JLabel lbl = new JLabel("Atmiya MCA-3F",JLabel.CENTER);
	JColorChooser c = new JColorChooser();
	Test()
	{
		super("JTable Demo");
		lbl.setFont(new Font("Times New Roman",Font.BOLD,20));
		lbl.setForeground(Color.YELLOW);	
		lbl.setBackground(Color.BLUE);
		lbl.setOpaque(true);
		add(lbl,BorderLayout.CENTER);
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