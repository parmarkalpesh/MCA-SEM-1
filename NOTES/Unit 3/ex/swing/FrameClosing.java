import javax.swing.*;
import java.awt.event.*;

class frame extends JFrame
{
	public frame()
	{
		setTitle("Our First Frame With Exit");
		setSize(300,200);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
}
public class FrameClosing
{
	public static void main(String args[])
	{
		JFrame fr=new frame();
		fr.show();
	}
}