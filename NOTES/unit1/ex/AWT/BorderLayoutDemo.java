import java.applet.*;
import java.awt.*;
/*
<applet code="BorderLayoutDemo" width=300 height=300>
</applet>
*/
public class BorderLayoutDemo extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout(5,5));
		Button b1=new Button("Apple");
		Button b2=new Button("Orange");
		Button b3=new Button("Grapes");
		Button b4=new Button("Mango");
		Button b5=new Button("Pineapple");

		add(b1,"North");
		add(b2,"South");
		add(b3,"East");
		add(b4,"West");
		add(b5,"Center");
	}
}