import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ScrollbarDemo" width=400 height=200>
</applet>
*/
public class ScrollbarDemo extends Applet implements AdjustmentListener
{
	TextArea ta;
	public void init()
	{
		Scrollbar sb=new Scrollbar(Scrollbar.HORIZONTAL,50,5,0,1000);
		sb.addAdjustmentListener(this);
		add(sb);
		ta=new TextArea(10,20);
		add(ta);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{ 
		Scrollbar sb=(Scrollbar) ae.getAdjustable();
		ta.append("AdjustmentEvant "+sb.getValue()+"\n");
	}
}