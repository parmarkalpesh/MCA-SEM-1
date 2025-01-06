import javax.swing.*;
import java.awt.*;

public class SettingIconFrame
{
	public static void main(String[] args)
	{
  		JFrame fr = new JFrame("Setting an Icon for a frame");
	  	fr.setIconImage(Toolkit.getDefaultToolkit().getImage("icon_confused.gif"));
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(400,400);
		fr.setVisible(true);
	}
}