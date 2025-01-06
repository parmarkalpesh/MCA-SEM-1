import java.applet.*;
import java.awt.*;
/*
<applet code="GridLayoutDemo" width=300 height=300>
</applet>
*/
public class GridLayoutDemo extends Applet
{
	public void init()
	{
		setLayout(new GridLayout(3,2));
		Button b1=new Button("A");
		Button b2=new Button("B");
		Button b3=new Button("C");
		Button b4=new Button("D");
		Button b5=new Button("E");
		Button b6=new Button("F");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}
	public Insets getInsets()
	{
		return new Insets(10,10,10,10);
	}
}