import java.applet.*;
import java.awt.*;
/*
<applet code="FlowLayoutDemo" width=650 height=350>
</applet>
*/
public class FlowLayoutDemo extends Applet
{
	public void init()
	{
                setLayout(new FlowLayout(FlowLayout.RIGHT,50,50));
		for(int i=0;i<20;i++)
		{
			if(i<9)
				add(new Button("Button 0"+(i+1)));
			else
				add(new Button("Button "+(i+1)));
		}
	}
}
