import javax.swing.*;
public class Label
{
	public static void main(String args[])
	{
                JFrame fr=new JFrame();
		JLabel l = new JLabel("Welcome");
                fr.setTitle("Our first frame");
                fr.setSize(300,200);
		fr.add(l);
		fr.show();
	}
}
