import javax.swing.*;

public class CustomizedCheckBox
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Customized Check Box");
		Icon im = new ImageIcon("cut.gif");
		JCheckBox chk = new JCheckBox("This is the Customized Check Box");
		chk.setIcon(im);
		frame.add(chk);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}