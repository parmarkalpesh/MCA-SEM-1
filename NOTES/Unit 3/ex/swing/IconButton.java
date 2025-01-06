import javax.swing.*;
import java.awt.*;

public class IconButton
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Icon on button");
		JButton button = new JButton("MEFGI");
		Icon imgicon = new ImageIcon("icon_confused.gif");
		JPanel panel = new JPanel();
		button.setIcon(imgicon);
		panel.add(button);
		frame.add(panel, BorderLayout.NORTH);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}