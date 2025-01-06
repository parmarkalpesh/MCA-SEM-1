import java.applet.*;
import java.awt.*;
/*
<applet code="PanelDemo" width=200 height=300>
</applet>
*/
public class PanelDemo extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());

		Panel pn=new Panel();
		Checkbox cb1=new Checkbox("Red",true);
		pn.add(cb1);
		Checkbox cb2=new Checkbox("Green",false);
		pn.add(cb2);
		Checkbox cb3=new Checkbox("Blue",false);
		pn.add(cb3);
		add(pn,"North");

		Panel pc=new Panel();
		pc.setLayout(new GridLayout(3,2));
		for(int i=1;i<=6;i++)
			pc.add(new Button("Button "+i));
		add(pc,"Center");
		
		Panel ps=new Panel();
		Label l=new Label("This is the south panel");
		ps.add(l);
		add(ps,"South");
	}
}