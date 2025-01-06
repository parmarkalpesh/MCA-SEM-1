import javax.swing.*;

public class SwingFrameNonResizable
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Non Resizable Frame");
		frame.setResizable(false);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}