import java.applet.*;
import java.awt.*;
/*
<applet code="LabelDemo" width=200 height=200>
</applet>
*/
public class LabelDemo extends Applet
{
	public void init()
	{
		String s="Welcome To Java";
		Label L1=new Label(s,Label.LEFT);
		add(L1);
		Label L2=new Label(s,Label.CENTER);
		add(L2);
		Label L3=new Label(s,Label.RIGHT);
		add(L3);
	}
}