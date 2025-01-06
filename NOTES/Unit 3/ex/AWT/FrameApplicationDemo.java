import java.awt.*;
import java.awt.event.*;
class FrameApp extends Frame
{
	FrameApp(String title)
	{
		super(title);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
}
public class FrameApplicationDemo
{
	public static void main(String args[])
	{
		FrameApp frm=new FrameApp("Welcome to frame");
		Button b=new Button("Ashish");
		frm.add(b);
		frm.show();
		frm.setSize(200,200);
	}
}