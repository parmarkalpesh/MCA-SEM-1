//Abstract Window Toolkit
import java.awt.*;
class Test extends Frame
{
	Test()
	{
	super("My Frame");
	setFont(new Font("Times New Roman",Font.BOLD,20));
	}
	public void paint(Graphics g)
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
